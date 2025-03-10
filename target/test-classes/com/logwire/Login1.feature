Feature: Login1
 Background:
    Given je suis sur "https://www.saucedemo.com/"


@positif @alltests
  Scenario: connexion reussite
    When je saisis le username "standard_user"
    And je saisi le password "secret_sauce"
    And je clique sur le bouton "login-button"
    Then je suis redirigé au dashbord

@positif @alltests
  Scenario: Connexion avec un compte à performance lente
    When je saisis le username "performance_glitch_user"
    And je saisi le password "secret_sauce"
    And je clique sur le bouton "login-button"
    Then je suis redirigé au dashbord
    And la connexion est lente mais réussie


@negatif @alltests
  Scenario: Connexion avec un nom d'utilisateur incorrect
    When je saisis le username "standard_userINcorrect"
    And je saisi le password "secret_sauce"
    And je clique sur le bouton "login-button"
    # Then je suis redirigé au dashbord
    Then un message derreur saffiche

#test pour les cas negatifs   
#mvn test -Dcucumber.plugin="html:target/rapport.html" -Dcucumber.filter.tags="@positif"
@negatif
  Scenario: Connexion avec un mot de passe incorrect
    When je saisis le username "standard_user"
    And je saisi le password "secret_sauceINcorrect"
    And je clique sur le bouton "login-button"
    # Then je suis redirigé au dashbord
    Then un message derreur saffiche

@negatif
  Scenario: Connexion avec un compte bloqué
    When je saisis le username "locked_out_user"
    And je saisi le password "secret_sauce"
    And je clique sur le bouton "login-button"
    Then un message derreur de compte blocage saffiche
