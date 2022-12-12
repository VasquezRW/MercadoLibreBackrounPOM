Feature: Ingresar a la pagina del pais correspondiente en mercado libre

  @backround
  Scenario: Ingresar a mercado libre con el pais Guatemala
    Given que el usuario ingrese a la pagina web
    When el usuario seleccione el pais
    Then validamos que estemos en la pagina principal "GT"
