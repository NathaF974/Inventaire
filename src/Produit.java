public class Produit {
    // Attributs
    private int codeProduit;
    private String nom;
    private int quantiteStock;
    private double prixUnitaire;
    private int stockSecurite;


    // Constructeurs
    public Produit(int codeProduit, String nom, int quantiteStock, double prixUnitaire, int stockSecurite){
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.quantiteStock = quantiteStock;
        this.prixUnitaire = prixUnitaire;
        this.stockSecurite = stockSecurite;
    }


    // Assesseurs
    // Getters

    public int getCodeProduit() {
        return codeProduit;
    }
    public String getNom(){
        return nom;
    }
    public int getQuantiteStock() {
        return quantiteStock;
    }
    public double getPrixUnitaire() {
        return prixUnitaire;
    }
    public int getStockSecurite() {
        return stockSecurite;
    }

    // Setters
    public void setQuantiteStock(int quantiteStock){this.quantiteStock = quantiteStock;}
    public void setPrixUnitaire(double prixUnitaire){
        this.prixUnitaire = prixUnitaire;
    }
    public void setStockSecurite(int stockSecurite) {
        this.stockSecurite = stockSecurite;
    }


    // méthodes
    // Approvisionnement ou retour du stock
    public void ajoutStock(int valeur1){
        this.quantiteStock += valeur1;
    }

    // Vente ou sortie des stock
    public void diminutionStock(int valeur){
        this.quantiteStock -= valeur;
    }

    // retourner la valeur du stock
    public double calculerValeurStock(){
        return this.quantiteStock + this.prixUnitaire;
    }

    // Alerte quantité stock
    public String alerteStock(){
        String alerte = "";
        if (this.quantiteStock <= this.stockSecurite){
            alerte = "Attention le sotck de sécurité est atteint !";
        }else{
            alerte = "Aucun problème sur le stock !";
        }
        return alerte;
    }

    // Valider des quantités commandées
    public boolean valideQuatiteCommande(int valeur){
        if (valeur <= this.quantiteStock){
            return true;
        }
        else {
            return false;
        }
    }

    // Afficher toutes les données relatives à un produit.
    public String toString(){
    String descriptionProduit = "\nCode du produit :"+this.codeProduit+"\nNom du produit :"+this.nom+"\nQuatité en stock du produit :"+this.quantiteStock+
            "\nPrix à l'unité :"+this.prixUnitaire+"\nQuatié du stock de sécurité du produit :"+this.stockSecurite;
    return descriptionProduit;
    }
}
