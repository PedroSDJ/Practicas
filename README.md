# Practicas
Ejercicios universitarios de programacion

## COMANDOS GIT
![Esta es una imagen de ejemplo](https://github.com/PedroSDJ/Practicas/blob/master/GIT.jpg)https://github.com/PedroSDJ/Practicas/blob/master/GIT.jpg)

### git config --global user.name "pedro" : 
"Configurar Nombre que salen en los commits."
### git config --global user.email dasdo1@gmail.com :
"configuramos el email con el que saldran los commits."
### git config --global color.ui true :
"marco de colores para los comandos del entorno."
### git init :
"inicialización del repositorio local."
### git remote add origin <url> :
"Agregar repositorio remoto."
### git remote set-url origin <url> : 
"Cambiar de remote."
### git remote rm <name/origin> :
"Remover repositorio."
### git remote -v :
"Muestra lista repositorios."
### git remote show origin :
"Muestra los branches remotos."
### git remote prune origin  :
"limpia las ramas eliminadas."
### git branch -d <nameBranch> :
"elimina el branch y lo une al master."
### git branch -D <nameBranch> :
"elimina el branch sin preguntar."
### git tag :
"muestra la lista de todos los tags."
### git tag -a <verison> - m "esta es la versión x" :
"creamos un nuevo tag para el commit."
### git clone ruta :
"clonamos un repositorio, donde dice ruta va la ruta del repositorio."
### git add --all :
"Añadimos todos los archivos para el commit omitiendo los nuevos."
### git add *.txt :
"Añadimos todos los archivos con la extensión especificada."
### git commit -a -m "Texto que identifique por que se hizo el commit" :
"Agregar y Cargar en el HEAD los cambios realizados."
### git commit -a :
"De haber conflictos los muestra."
### git push --tags :
"Subimos un tag."
### git pull : 
"obtenemos los avances, modificaciones y actualizaciones del repositorio remoto."
### git status : 
"vemos el estado en el que tenemos nuestros avances y archivos de manera local (nuestra maquina)."
### git add . : 
"agregamos todos archivos y modificaciones al area de preparados (si cambias el . por el nombre del archivo con su extension, solo agregaras dicho archivo)."
### git commit -m "comentario" :
"tomamos captura a los archivos, en esta parte debes de hacerlo cuando esttas seguro que ya no trabajaras mas en la funcionalidad, programa o proyecto. En este punto habremos guardado los avances."
### git push push origin master : 
"Mandamos los avances guardados al repositorio remoto."
### git branch : 
"muestra las ramas que tenemos el el repositorio."
### git checkout nombre_branch :
"en nombre_branch colocamos el nombre de la rama a la que nos queremos cambiar."
### git -b nombre_branch :
"creamos una rama en el reporositorio."
### git log :
"Muestra los logs de los commits."
### git log --oneline --stat :
"Muestras los cambios en los commits."
### git log --oneline --graph :
"Muestra graficos de los commits."
### git diff o git diff --staged :
"Muestra los cambios realizados a un archivo."
### git reset HEAD <archivo> :
"Saca un archivo del commit."
### git checkout -- <file> :
"Quita del HEAD un archivo y le pone el estado de no trabajado."
### git merge <nameBranch> :
"une la rama con la rama especificada."
### git fetch :
"verifica todos los cambios que se realizarón en el repositorio, esta es ocupada por si solo se quieren ver los cambios, posterior a ello se usa el git pull."
### git rm <archivo> :
"borramos un archivo del repositorio."
### git remote add upstream <url> :
"Descargar remote de un fork."
### git fetch upstream o git merge upstream/master :
"Merge con master de un fork."
# ______________________________________________________________________________________________________________________________________
#### Los rebase se usan cuando trabajamos con branches esto hace que los branches se pongan al día con el master sin afectar al mismo.
### git rebase :
"Une el branch actual con el mastar, esto no se puede ver como un merge."
#### Cuando se produce un conflicto no das las siguientes opciones:
### git rebase --continue :
"cuando resolvemos los conflictos --continue continua la secuencia del rebase donde se pauso."
### git rebase --skip :
"Omite el conflicto y sigue su camino."
### git reabse --abort :
"Devuelve todo al principio del rebase."
### git rebase <nameBranch> :
"Para hacer un rebase a un branch en especifico."


