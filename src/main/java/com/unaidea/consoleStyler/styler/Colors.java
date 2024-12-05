package com.unaidea.consoleStyler.styler;

public abstract class Colors {
    // Reset
    protected final String RESET = "\033[0m";       // Reset all attributes

    // Standard text colors
    protected final String BLACK = "\033[30m";      // Black text
    protected final String RED = "\033[31m";        // Red text
    protected final String GREEN = "\033[32m";      // Green text
    protected final String YELLOW = "\033[33m";     // Yellow text
    protected final String BLUE = "\033[34m";       // Blue text
    protected final String MAGENTA = "\033[35m";    // Magenta text
    protected final String CYAN = "\033[36m";       // Cyan text
    protected final String WHITE = "\033[37m";      // White text

    // Bright (bold) text colors
    protected final String BRIGHT_BLACK = "\033[90m";   // Bright black (gray)
    protected final String BRIGHT_RED = "\033[91m";     // Bright red
    protected final String BRIGHT_GREEN = "\033[92m";   // Bright green
    protected final String BRIGHT_YELLOW = "\033[93m";  // Bright yellow
    protected final String BRIGHT_BLUE = "\033[94m";    // Bright blue
    protected final String BRIGHT_MAGENTA = "\033[95m"; // Bright magenta
    protected final String BRIGHT_CYAN = "\033[96m";    // Bright cyan
    protected final String BRIGHT_WHITE = "\033[97m";   // Bright white

    // Background colors
    protected final String BLACK_BACKGROUND = "\033[40m";    // Black background
    protected final String RED_BACKGROUND = "\033[41m";      // Red background
    protected final String GREEN_BACKGROUND = "\033[42m";    // Green background
    protected final String YELLOW_BACKGROUND = "\033[43m";   // Yellow background
    protected final String BLUE_BACKGROUND = "\033[44m";     // Blue background
    protected final String MAGENTA_BACKGROUND = "\033[45m";  // Magenta background
    protected final String CYAN_BACKGROUND = "\033[46m";     // Cyan background
    protected final String WHITE_BACKGROUND = "\033[47m";    // White background

    // Bright background colors
    protected final String BRIGHT_BLACK_BACKGROUND = "\033[100m"; // Bright black background (gray)
    protected final String BRIGHT_RED_BACKGROUND = "\033[101m";   // Bright red background
    protected final String BRIGHT_GREEN_BACKGROUND = "\033[102m"; // Bright green background
    protected final String BRIGHT_YELLOW_BACKGROUND = "\033[103m";// Bright yellow background
    protected final String BRIGHT_BLUE_BACKGROUND = "\033[104m";  // Bright blue background
    protected final String BRIGHT_MAGENTA_BACKGROUND = "\033[105m";// Bright magenta background
    protected final String BRIGHT_CYAN_BACKGROUND = "\033[106m";  // Bright cyan background
    protected final String BRIGHT_WHITE_BACKGROUND = "\033[107m"; // Bright white background
}
