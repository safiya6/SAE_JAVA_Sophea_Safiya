#Ardoise Magique de Farida
Ce projet consiste en le développement d'une application permettant de gérer une ardoise magique, appelée l'Ardoise Magique de Farida. L'application permet de stocker différentes formes sur l'ardoise et de les dessiner à l'aide d'une application tierce.

##Fonctionnalités
Stockage de formes : L'application permet de stocker différentes formes géométriques, telles que des chapeaux, des triangles et des quadrilatères, sur l'ardoise magique.
Dessin des formes : Les formes stockées peuvent être dessinées sur l'ardoise en utilisant une application tierce compatible.
Déplacement des formes : Les formes peuvent être déplacées sur l'ardoise en ajustant leurs coordonnées.
Gestion des formes composées : L'application permet également de fusionner plusieurs formes pour en créer de nouvelles formes composées.
Installation
##Cloner le dépôt GitHub :
bash
Copy code
git clone https://github.com/ton_nom_d_utilisateur/ardoise-magique.git
Importer le projet dans un environnement de développement Java compatible.
##Utilisation
Importer les classes de la bibliothèque "ardoise.jar" dans votre projet.
Créer des instances des différentes formes (Chapeau, Triangle, Quadrilatere, etc.) en utilisant les constructeurs appropriés.
Utiliser les méthodes fournies pour dessiner, déplacer et obtenir des informations sur les formes.
Utiliser une application tierce compatible pour afficher le dessin des formes stockées sur l'ardoise.
##Exemples de code
java
Copy code
// Création d'un chapeau
Chapeau chapeau = new Chapeau("MonChapeau", point1, point2);

// Dessiner le chapeau
List<Segment> segments = chapeau.dessiner();
// Utiliser les segments pour dessiner le chapeau dans l'application tierce

// Déplacer le chapeau
chapeau.deplacer(10, 10);

// Obtenir le nom du chapeau
String nomChapeau = chapeau.getNom();
##Contribution
Les contributions à ce projet sont les bienvenues. Si vous souhaitez contribuer, veuillez suivre les étapes suivantes :

Forker le dépôt sur GitHub.
Créer une branche pour vos modifications.
Commiter vos modifications.
Pusher votre branche sur votre fork.
Créer une demande d'extraction sur le dépôt d'origine.
##Auteurs
Safiya
Sophea
