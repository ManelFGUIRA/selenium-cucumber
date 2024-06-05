@login
Feature: Je souhaite verfier la page de connexion
  ETQ utilisateur je souhaite de verfier la page de connexion

  @login-valide
  Scenario: Connexion avec des donnees valides
    Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "dashboard"