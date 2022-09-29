#Autor: Claudia Nieto
#Email: cmarce86@yahoo.es

@All
Feature: Validar las funcionalidades de conduit
  Como usuario
  Quiero registrarme en la plataforma conduit
  para publicar un articulo por medio de la cuenta

  Background: Acceder a la plataforma Principal
    Given accedo a la plataforma conduit

  @Case1
  Scenario Outline: Validar el registro de la cuenta
    When registro la informacion
      | <userName> | <email> | <password> |
    Then Verificar la creacion a la cuenta "<userName>"

    Examples:
      | userName | email              | password |
      | juanitato#   | maria#@hopmail.com | 123456   |


  @Case2
  Scenario Outline: Validar el login de una cuenta
    When realizo el logueo
      | <email> | <password> |
    Then Verificar inicio de sesion "<userName>"

    Examples:
      | userName | email                | password |
      | maria200 | maria200@hopmail.com | 123456   |


  @Case3
  Scenario Outline: Validar la publicacion de un articulo
    When realizo el logueo
      | <email> | <password> |
    And realizo una publicacion de articulo
      | <title> | <about> | <article> | <tags> |
    Then verificar que la publicacion se creo "<title>"

    Examples:
      | email                | password | title     | about                 | article                                                             | tags     |
      | maria200@hopmail.com | 123456   | La iliada | Un naufrago en el mar | Las lejanas tierras de un mar lejano se encontraba un pequeño barco | Barquito |
