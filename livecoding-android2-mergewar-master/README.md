# Merge War

Vous allez devoir réaliser des étapes par équipe. Chaque équipe devra créer une branche et effectuer des modifications sur le projet. À la fin de ses modifications, chaque équipe devra fusionner ses modifications sur **master** et corriger les éventuels conflits.

## Équipe 1

Créer une branche **titlemain** et passer dessus.

Modifier le *Manifest* pour changer le titre de l'application en "Merge War".

Supprimer la *TextView* déjà présente, puis ajouter une nouvelle *TextView* dans *activity_main.xml* avec le texte "This is Merge War!".

Aucun texte ne doit pas être hardcodé.

Le travail terminé, fusionner les modifications sur **master**.

## Équipe 2

Créer une branche **warzone** et passer dessus.

Créer une nouvelle *Activity* nommée `WarActivity`. Dans *activity_war.xml*, ajouter une *TextView* avec le texte "This is the War Zone!".

Ajouter un *Button* dans *activity_main.xml* avec le texte "War Zone". Au clic sur le bouton, allez vers `WarActivity`.

Aucun texte ne doit pas être hardcodé.

Le travail terminé, fusionner les modifications sur **master**.

## Équipe 3

Créer une branche **peacezone** et passer dessus.

Créer une nouvelle *Activity* nommée `PeaceActivity`. Dans *activity_peace.xml*, ajouter un *ImageView* avec comme *Drawable* avec l'image que vous voulez.

Ajouter un *Button* dans *activity_main.xml* avec le texte "Peace Zone". Au clic sur le bouton, aller vers `PeaceActivity`.

Aucun texte ne doit pas être hardcodé.

Le travail terminé, fusionner les modifications sur **master**.

## Équipe 4

Créer une branche **login** et passer dessus.

Créer une nouvelle *Activity* nommée `LoginActivity`.

Ajouter ajouter un *EditText* vide et un *Button* avec le texte "Send" dans *activity_login.xml*. Au clic sur le bouton, aller vers `MainActivity` en passant en *Extra* le contenu de l'*EditText*.

Ajouter un *Button* dans *activity_main.xml* avec le texte "Login". Au clic sur le bouton, aller vers `LoginActivity`.

Aucun texte ne doit pas être hardcodé.

Le travail terminé, fusionner les modifications sur **master**.

## Formateur

Créer une branche **welcome** et passer dessus.

Ajouter une *TextView* avec le texte "Welcome" dans *activity_main.xml*.

Attendre que les groupes aient terminés et récupérer les modifications de tous les groupes.

Remettre de l'ordre dans le code.

Ajouter le contenu de l'Extra provenant de `LoginActivity` et l'afficher dans la *TextView*.

Le travail terminé, fusionner les modifications sur **master**.

## Rappel des commandes

Récupérer le contenu d'un *repository* distant d'url *url_repo* :
> git clone url_repo

Créer et passer sur la branche *branch_name* :
> git checkout -b branch_name

Ajouter à la *staging area* les fichiers modifiés :
> git add .

Archiver dans le *repository* local les modifications des fichiers de la *staging branch* :
> git commit -m "commentary"

Archiver sur le *repository* distant les modifications commitées du *repository* local :
> git push origin branch_name

Récupérer les modifications archivées d'une branche du *repository* distant vers la même branche du *repository* local :
> git pull origin branch_name

Fusionner les modifications de *branch_to_merge* vers *master*
> git checkout master
> git merge origin branch_to_merge

Les conflits sont signalés avec ces délimiteurs :
> * "<<<<<<<" : code de la branche d’origine
> * "=======" : séparateur
> * ">>>>>>>" : code de la branche à merger

**Ne pas oublier de pousser ses modifications après un merge !**

#### Bonus (pour le formateur uniquement pour cet exercice) :
Mettre à jour une branche à partir de master :
> git rebase master

Continuer le *rebase* après la résolution d'un conflit :
> git rebase --continue