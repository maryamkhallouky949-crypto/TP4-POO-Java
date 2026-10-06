package poo;

public class Filiere {

    private String nom;
    private Etudiant[] etudiants;
    private int nbEtudiants;

    public Filiere(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[5];
        this.nbEtudiants = 0;
    }

    public void ajouterEtudiant(Etudiant etudiant) {

        if (nbEtudiants == etudiants.length) {
            Etudiant[] tmp = new Etudiant[etudiants.length * 2];

            System.arraycopy(etudiants, 0, tmp, 0, etudiants.length);

            etudiants = tmp;
        }

        etudiants[nbEtudiants++] = etudiant;
    }

    public void afficherEtudiants() {

        System.out.println("Filiere : " + nom);

        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println(etudiants[i]);
        }
    }
}