# Practica 4. Control de versiones y Refactorización. 
## Noah Garrido y Kane Ramsden.

## Pasos realizados:  
Primero creamos una cuenta en Github y descargamos git en nuestro pc. 
Una vez hecho la cuenta y haberlo vinculado entre Intellij, git y github empezamos a trabajar en la practica.
Abrimos nuestra practica 3 dentro de Intellij e abrimos la terminal.
Dentro de la terminal picamos los siguientes comandos:  


Este comando nos inicia el repositorio.
 > git init

Este comando agrega todos nuestros ficheros y directorios de nuestro proyecto al repositorio.
> git add .

Este comando hace el primer commit e indicamos que se llame "v1.0.0"
> git commit -m "v1.0.0"

Este comando empuja nuestro commit de local al github.
> git push

  
Ahora creamos una rama para ir haciendo cambios con estos comandos:
  
Este comando nos crea la rama nueva.
 > git branch rama1

Este comando nos cambia de rama. En nuestro caso, de master a rama1
 > git checkout rama1

Este comando es lo mismo que el push pero sube la rama al github haciendo que exista alli tambien.
> git push --set-upstream origin rama1


Primera modificacion de la practica 3.  En Intellij vamos a la clase Persona y comentamos en JavaDoc a todos los Gets y Sets.
Luego hacemos otros comandos para hacer el commit.

> git add .

Nuestro primer cambio fue comentar en JavaDoc en la clase Persona, esto lo dejamos comentado en el commit para que podamos saber lo que hemos cambiado en este commit sin tener que buscar los cambios ni abrirlo.
> git commit -m "Comentarios JavaDoc en Persona.java"


Este comando es para crear un tag. Tenemos que indicar el nombre que queremos darle al Tag, los cambios como en el commit en nuestro caso y el codigo del commit a lo cual queremos enlazar con el tag.
> git tag -a v1.0.1 -m "Comentarios JavaDoc en Persona.java" 0ece3c0


> git push


> git push origin v1.0.1


Este fue nuestro segundo cambio, lo cual hemos cambiado los Sets utilizando el valor 'this.*valor* = *valor*'.
> git add .


> git commit -m "Set change to this.valor"


> git tag -a v1.0.2 -m "Set change to this.valor" 94e3c78


> git push


> git push origin v1.0.2


Ahora fusionamos la rama1 con la rama master.
Primero cambiamos de rama con este comando:
> git checkout master


Para asegurar en que rama estamos, utilizamos este comando:
> git branch


Una vez confirmada, hacemos un git merge para fusionar la rama indicada a esta rama en la que nos situamos.
> git merge rama1


> git push


Luego volvemos a la rama1 para seguir haciendo cambios.
> git checkout rama1


> git branch


Una vez estamos seguros de que estamos en la rama1, seguimos con el tercer cambio.
En este cambio, hemos cambiado el nombre de la Clase de Persona a Mascota y por lo tanto hemos cambiado algunos atributos tambien.
> git add .


> git commit -m "Change Persona to Mascota (Rename Class)"


> git tag -a v1.0.3 "Change Persona to Mascota (Rename Class)" db80c05


> git push


> git push origin v1.0.3


Nuestro ultimo cambio fue crear un nuevo Package y mover la Clase Mascota dentro de este mismo Package.
> git add .


> git commit -m "New Package"


> git tag -a v1.0.4 -m "New Package" 8dbc8bd


> git push


> git push origin v1.0.4


Finalmente volvemos a fusionar la rama1 al master.
> git checkout master


> git branch


> git merge rama1

