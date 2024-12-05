#!/usr/bin/env fish

# Configuración
set REMOTE "origin"         # Cambia esto si usas un remoto diferente
set BASE_TAG "v1."          # Prefijo del tag (v1.x.0)
set COMMIT_TO_TAG "HEAD"    # Commit para etiquetar (último commit por defecto)
set START_INDEX 1           # Número inicial para 'x'
set END_INDEX 5             # Número final para 'x'

# Eliminar todos los tags locales
echo "Eliminando tags locales..."
for tag in (git tag -l)
    git tag -d $tag
end

# Eliminar todos los tags remotos
echo "Eliminando tags remotos..."
for tag in (git tag -l)
    git push $REMOTE --delete $tag
end

# Crear nuevos tags con formato v1.x.0
echo "Creando nuevos tags..."
for x in (seq $START_INDEX $END_INDEX)
    set TAG "$BASE_TAG$x.0"
    git tag $TAG $COMMIT_TO_TAG
    echo "Creado tag: $TAG"
end

# Subir todos los tags al remoto
echo "Subiendo nuevos tags al remoto..."
git push $REMOTE --tags

echo "¡Actualización de tags completada!"
