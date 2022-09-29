### `Automatización de pruebas Web`

#### Descripción

El proyecto de Automatización conduit permite validar la creación de un usuario, inicio de sesion y publicacion del articulo.


#### Escenario

> **Funcionalidad** Validar las funcionalidades de conduit

> **Como** usuario

> **Quiero** registrarme en la plataforma conduit

> **Para** publicar un articulo por medio de la cuenta

#### Características del Proyecto

En la construcción del proyecto Startsharp se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versión 8

#### Versionado

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.30  |
| Junit            | 4.13.2  |

#### Precondiciones

- [x] 1: Instar Java en su versión 8.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2- Instar Gradle en su versión 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME

#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal en el directorio raíz del proyecto:

```sh
gradle test -Denvironment=stg
```
