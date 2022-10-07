package org.example;

/**
 * @use blabla
 * @version 2.0
 * Classe utilisée lors des exercices
 * @author Andy
 */
public class Cylindre {
    public Cylindre() {

    }

    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }


    public double getVolume (){
        return this.hauteur * this.diametre * this.diametre * Math.PI/4;
    }

    public Cylindre(double diametre, double hauteur, double poids, String couleur) {
        this.diametre = diametre;
        this.hauteur = hauteur;
        this.poids = poids;
        this.couleur = couleur;
    }

    /**
     *
     * Méthode Calcul volume
     */
    public double getVolume (double hauteur, double diametre){
        return hauteur * diametre * diametre * Math.PI/4;
    }
    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    private double diametre = 0.0d;
    private double hauteur = 0.0d;

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    private double poids = 0.0d;
    private String couleur = "";
}
