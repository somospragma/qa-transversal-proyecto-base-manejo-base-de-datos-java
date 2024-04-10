# proyecto-base-manejo-base-de-datos-java

## Name
Proyecto Base para el Manejo de Base de Datos en Java

## Description
Este proyecto base proporciona una estructura inicial para el desarrollo de automatizaciones web en Java 
que involucran el manejo de bases de datos. 
Incluye configuraciones básicas, como la conexión a la base de datos la cual es privada y esta sobre un motor
de base de datos web, en caso de requerir mas info contacte al colaborador, tambien se trabajo con un
esquema general para organizar y desarrollar 
las funcionalidades relacionadas con la base de datos de manera eficiente y estructurada. 
Utiliza las mejores prácticas y patrones de diseño para garantizar la escalabilidad, 
mantenibilidad y robustez del sistema. Este proyecto sirve como punto de partida para 
construir aplicaciones Java que requieren interacción con bases de datos de diversos tipos y tamaños.

## Utilities
Encontrara utilidades para:
- Manejo de Bases de Datos

## Consideraciones
    - Para hacer uso de la la utilidad de Base de Datos es importante 
        que se instacie una Base de datos y se configura en el archivo de configuración ubicado en:

            ./src/main/resources/configs/congig.properties

        En las dependencias del proyecto esta agregada la dependencia del driver de MySQL, si no 
        desea realizar mayores ajustes respecto al motor de BD use MySQL. Si desea usar otro motor, 
        adiciones la dependencia del driver al build.gradle y configure este driver como observa 
        se realizo para MySQL en: 
    
            ./src/main/java/utils/ConectionBD.java
        
        Nota: Algunos motores de BD no requieren agregar la dependencia del driver como Oracle o MSserver

## ✅ Technologies
### This project required:
- [JDK java] version 16
- [Serenity] version 4
- [Gradle] version

Nota: 
*   Se requiere Selenium posterior a la version 4.11 para la descarga automatica de algunos drivers de los navegadores
    La version de Serenity implementada (4.0.0) ya incluye Selenium 4.12 lo cual soporta los navegadores a Octubre del 2023
    si el proyecto presenta problemas relacionados a las version del driver descargado de forma automatica y la version de su 
    navegador vale la pena revisar que este trabajando con versiones recientes de Serenity y checkear las versiones de Selenium
    incluidas en dicha version de Serenity
*   Con Selenium Manager incluido en Serenity 4.0.0 ya no se requiere WebDriverManager de Boni Garcia, razon por la cual ya
    serenity no lo incluye dentro de sus dependencias


## Project status
<h4 align="center"> 🚧 Proyecto en construcción 🚧 </h4> 

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## 📁 Access to project

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/calidad_de_software/digital-assests/transversal/manejo-database-java/proyecto-base-manejo-base-de-datos-java.git
git branch -M develop
git push -uf origin develop
```

##  🛠️ Run tests Chrome gradle:
```
gradle clean test -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test --info --stacktrace --tests "ruta.nameRunner" -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test -Dcucumber.options="--tags @someTag" -Dcontext=chrome -Dwebdriver.driver=chrome
gradle clean test -Dcucumber.options="--tags '@someTag or @someTag'" -Dcontext=chrome -Dwebdriver.driver=chrome
```

Nota:

*   Si ejecuta en la consola de gradle no debe usar comillas simples '...' para encerrar '-Dwebdriver.driver=chrome'
*   Si ejecuta en la consola estándar de la máquina quizás si deba utilizar '...' en las porciones del comando que incluyan puntos
*   Con "./gradlew test ..." ejecuta el gradle compilado del proyecto
*   Con "gradle test ..." ejecuta el gradle de su maquina, el configurado en las variables de entorno de su sistema operativo


### ejemplo
```
./gradlew clean test --info --stacktrace --tests "co.com.pragma.runners.CompareImageRunner" -Dcontext=chrome '-Dwebdriver.driver=chrome'
./gradlew clean test --info --stacktrace --tests "co.com.pragma.runners.LoginRunner" -Dcontext=chrome '-Dwebdriver.driver=chrome'
```


##  🛠️ Run tests Firefox gradle:
```
./gradlew clean test -Dcontext=firefox '-Dwebdriver.driver=firefox'
./gradlew test --tests "runners.RunnerTags" '-Dcontext=firefox -Dwebdriver.driver=firefox'
```
### ejemplo
```
./gradlew clean test --info --stacktrace --tests "runners.RunnerTags" '-Dcontext=firefox -Dwebdriver.driver=firefox'
```

## **Run tests in different environments:**
```
gradle command... -Denvironment=defaul
gradle command... -Denvironment=dev
gradle command... -Denvironment=qa
gradle command... -Denvironment=prod
```
### Note: 
    - The default environment will be used if no other value is provided
    - Could modify the environment urls in .../test/resources/serenity.conf


## **Run tests in different browser:**
```
gradle command... -Dwebdriver.driver=chrome
gradle command... -Dwebdriver.driver=firefox
gradle command... -Dwebdriver.driver=edge
```

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Authors and acknowledgment

| [<img src="https://gitlab.com/uploads/-/system/user/avatar/13437423/avatar.png?width=400" width=115><br><sub>Mauro L. Ibarra P.</sub>](https://gitlab.com/mauro.ibarrap) <br/> | [<img src="https://secure.gravatar.com/avatar/23b2db02403d79ebd356e8e8356758ec?s=192&d=identicon" width=115><br><sub>Javier D. Duran</sub>](https://gitlab.com/javier.duran) | 
:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|

## License
Open source project.
