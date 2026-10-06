package poo;

public class Article {
	private String reference;
    private String nom;
    private double prix;
    
    
    public Article(String reference, String nom, double prix) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
    }
    
    @Override
    public String toString() {
        return "Article[reference=" + reference +
               ", nom=" + nom +
               ", prix=" + prix +
               "]";
    }
   
}
