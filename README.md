# UCE Génie Logiciel Avancé : Techniques de tests

[![codecov](https://codecov.io/gh/romain-rigaud/ceri-m1-techniques-de-test/graph/badge.svg?token=5IDWTSBHVA)](https://codecov.io/gh/romain-rigaud/ceri-m1-techniques-de-test) [![CircleCI](https://circleci.com/gh/romain-rigaud/ceri-m1-techniques-de-test.svg?style=svg)](https://app.circleci.com/pipelines/github/romain-rigaud)  ![Checkstyle](target/site/badges/checkstyle-result.svg)

## Lien vers la documentation Javadoc :

[Visualiser la documentation](https://romain-rigaud.github.io/ceri-m1-techniques-de-test/)

#### Rigaud Romain, groupe 2 alternance ILSEN

### L'implémentation de RocketPokemonFactory de la Team Rocket a de nombreux problèmes :

- il y a des pokémon pré créé avec des index négatifs et possibilités de créer un Pokémon avec un index supérieur à 150.
- les valeurs sont choisies au hasard.
- possibilité d'index négatif donnée pour la création d'un Pokémon
