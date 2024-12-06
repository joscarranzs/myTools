package com.unaidea.consoleStyler;

import com.unaidea.consoleStyler.styler.Colors;

public class Console extends Colors {
    StringBuilder styles = new StringBuilder();

    public <T> Console print(T value) {
        System.out.println(styles.toString() + value);
        return this;
    }

    public <T> Console red() {
        styles.append(RED);
        return this;
    }

    public Console reset() {
        styles.append(RESET);
        return this;
    }

    public Console bold() {
        styles.append(BRIGHT_BLACK);
        return this;
    }
}
