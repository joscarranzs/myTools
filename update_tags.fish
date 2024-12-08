#!/usr/bin/env fish

# Configuración
set REMOTE "origin"           # Cambia esto si usas un remoto diferente
set OLD_TAG "v1.0.1"          # Tag antiguo
set NEW_TAG "v2.0.0"          # Tag nuevo
set COMMIT_TO_TAG "HEAD"      # Commit al que apunta el tag nuevo (por defecto el último commit)

# Eliminar el tag local si existe
if test (git tag -l | grep -q $OLD_TAG)
    echo "Eliminando el tag local: $OLD_TAG"
    git tag -d $OLD_TAG
end

# Eliminar el tag remoto si existe
if test (git ls-remote --tags $REMOTE | grep -q "refs/tags/$OLD_TAG")
    echo "Eliminando el tag remoto: $OLD_TAG"
    git push $REMOTE --delete $OLD_TAG
end

# Crear el nuevo tag
echo "Creando el nuevo tag: $NEW_TAG"
git tag $NEW_TAG $COMMIT_TO_TAG

# Subir el nuevo tag al remoto
echo "Subiendo el nuevo tag al remoto: $NEW_TAG"
git push $REMOTE $NEW_TAG

echo "¡Actualización de tag completada! ($OLD_TAG -> $NEW_TAG)"
