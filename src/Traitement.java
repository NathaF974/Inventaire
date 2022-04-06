public class Traitement {
    public static void main(String[]args) {
        // Création d'un objet nommé "pomme"
        Produit pomme = new Produit(1, "Pomme", 90, 2, 20);

        // Afficher la quatité du stock
        System.out.println("Le Stock de pomme est de :" + pomme.calculerValeurStock());

        // Modification du stock
        pomme.ajoutStock(6);
        System.out.println("Ajout de 6 pommes au stock");
        pomme.diminutionStock(30);
        System.out.println("Suppréssion de 30 pommes au stock");

        // Afficher la quatité du stock
        System.out.println("Le Stock de pomme est de :" + pomme.calculerValeurStock());

        // Commencer une première commande, Initialisation de la quatité du de la commande
        System.out.println("Première commande pour 80 pommes");
        if (pomme.valideQuatiteCommande(80) == true) {
            System.out.println("la commande est valide !");
            pomme.diminutionStock(80);
        } else {
            System.out.println("La commande n'est pas valide");
        }

        // Afficher la quatité du stock
        System.out.println("Le Stock de pomme est de :" + pomme.calculerValeurStock());

        // Commencer une seconde commande
        System.out.println("Seconde commande pour 10 pommes");
        if (pomme.valideQuatiteCommande(10) == true) {
            System.out.println("la commande est valide !");
            pomme.diminutionStock(10);
        } else {
            System.out.println("La commande n'est pas valide");
        }

        // Afficher la quatité du stock
        System.out.println("Le Stock de pomme est de :" + pomme.calculerValeurStock());

        // Baisse volontaire de la quatité du stock pour qu'il soit inférieur à la quatité du stock de sécurité
        // pour tester la method "alerte"
        pomme.diminutionStock(40);
        System.out.println("dimuninution du stock de 40 pommes");
        System.out.println("Signal de problème sur les Stock :" + pomme.alerteStock());

        // Augmentation volontaire la quatité du stock pour qu'il soit supérieur à la quatité du stock de sécurité
        pomme.ajoutStock(30);
        System.out.println("Augmentation du stock de 40 pommes");
        System.out.println("Signal de problème sur les Stock :" + pomme.alerteStock());

        // Afficher toutes les données relatives à un produit.
        System.out.println("Description du produit :"+pomme.toString());

        // Création d'une catégorie nommé "Fruits"
        Categorie Fruit = new Categorie(1,"Fruit");

        // Afficher toutes les données relatives à la catégorie.
        System.out.println("Description de la catégories :"+Fruit.toString());
    }
}
