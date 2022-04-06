public class Categorie {
    // Attributs
    private int codeCategorie;
    private String nomCategorie;

    // Constructeurs
    public Categorie(int codeCategorie, String nomCategorie){
        this.codeCategorie = codeCategorie;
        this.nomCategorie = nomCategorie;
    }

    // Assesseurs
    // Getters

    public int getCodeCategorie() {
        return codeCategorie;
    }
    public String getNomCategorie(){
        return nomCategorie;
    }

    // Setters
    // Il n'y a pas de setter car les valeurs des attributs codeCategorie et nomCategorie ne vont pas changer.

    // Méthode
    // Création d'une méthode pour la description de la catégories
    public String toString(){
        String descriptionCategorie = "\nCode de la catégorie :"+this.codeCategorie+"\nNom de la catégorie :"+this.nomCategorie;
        return descriptionCategorie;
    }
}
