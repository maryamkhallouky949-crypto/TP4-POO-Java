package poo;

public class categorie {
	private String nom;
    private Article[] articles;
    private int nbArticles;

    public categorie(String nom) {
        this.nom = nom;
        this.articles = new Article[5];
        this.nbArticles = 0;
    }
    
    public void ajouterArticle(Article article) {

        if (nbArticles == articles.length) {
            Article[] tmp = new Article[articles.length * 2];

            System.arraycopy(articles, 0, tmp, 0, articles.length);

            articles = tmp;
        }

        articles[nbArticles++] = article;
    }
    public void afficherArticles() {

        System.out.println("Categorie : " + nom);

        for (int i = 0; i < nbArticles; i++) {
            System.out.println(articles[i]);
        }
    }
    
}

