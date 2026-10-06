package poo;

public class Main {

    public static void main(String[] args) {

        Article a1 = new Article("A001", "Ordinateur", 750.0);
        Article a2 = new Article("A002", "Clavier", 150.0);

        categorie c1 = new categorie("Informatique");

        c1.ajouterArticle(a1);
        c1.ajouterArticle(a2);

        c1.afficherArticles();
    }
}