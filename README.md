# FirstAndroidApp

## Introduction
Ceci est une application Android très basique développée en Java et Android Studio. Elle sert de première application pour découvrir la programmation mobile avec une interface utilisateur simple.

## Instructions d'installation

### Avec Android Studio
1. Clonez le dépôt sur votre machine locale.
2. Ouvrez Android Studio et sélectionnez "Ouvrir un projet existant".
3. Naviguez jusqu'au dépôt cloné et sélectionnez-le.
4. Laissez Android Studio télécharger et installer toutes les dépendances nécessaires.
5. Une fois le projet chargé, cliquez sur le bouton "Exécuter" pour construire et exécuter l'application sur un émulateur ou un appareil connecté.

### Sans Android Studio
1. Clonez le dépôt sur votre machine locale.
2. Assurez-vous d'avoir installé le SDK Android et Gradle.
3. Ouvrez un terminal et naviguez jusqu'au répertoire du projet.
4. Exécutez la commande suivante pour construire le projet :
   ```bash
   ./gradlew build
   ```
5. Pour installer l'application sur un appareil connecté, exécutez :
   ```bash
   ./gradlew installDebug
   ```

## Objectif de l'application
L'objectif de cette application est de fournir une introduction simple à la programmation mobile. Elle est conçue comme une première application pour les débutants afin d'apprendre les bases du développement Android et de créer une interface utilisateur simple.

## Présentation de l'interface utilisateur
Voici les images de l'interface utilisateur à 45% de leur taille originale :

### Écran d'accueil

Page d'accueil avec les différents inputs, un bouton dubmit pour valider les infos et un bouton pour changer de langage.

 <img src="images/accueil1.png" alt="Accueil" width="45%" />


### Écran d'accueil (Français)

Page en Français. La langue est définie par le thème de base de l'appareil. Un changement est aussi possible avec le bouton.

 <img src="images/accueilfr.png" alt="Accueil" width="45%" />

### Écran de récapitulatif des informations

Page récapitulant les informations avant validation.

 <img src="images/recapinfo.png" alt="Accueil" width="45%" />

 ### Écran de confirmation des données

En appuyant sur enregistrer, une popup de validation apparît. "Oui permet de valider et de passer à la page suivante. "Non" reviens à la page d'accueil

 <img src="images/confirmdata.png" alt="Accueil" width="45%" />

### Écran d'appel

Dernière page après validation des informations permattant d'appeller le numéro enregistré.

 <img src="images/call.png" alt="Accueil" width="45%" />