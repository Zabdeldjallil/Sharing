package package1;

import java.awt.Color;
import java.awt.Graphics;
/**
 * Une forme g��om��trique pouvant ��tre affich��e dans une zone de dessin.
 */
public abstract class Forme {

    /**
     * coordonn��es du point de r��f��rence de la forme
     */
    protected int x, y;

    /**
     * l'��paisseur du trait pour le contour.
     */
    protected float epaisseurTrait = 1.0f;

    /**
     * La couleur utilis��e pour dessiner le contour la forme. si cette couleur
     * est nulle, La couleur utilis��e sera celle du contexte graphique (l'objet
     * Graphics pass�� en param��tre de la m��thode dessiner).
     */
    protected Color couleurTrait = null;

    /**
     * La couleur de remplissage de la forme. Si cette couleur est nulle seul le
     * contour de la forme sera dessin�� (par exemple pour un Cercle), ou si il
     * s'agit d'une forme pleine (par exemple un Disque), la couleur utilis��e
     * sera la couleur courante du contexte graphique.
     */
    protected Color couleurRemplissage;

    /**
     * Constructeur
     *
     * @param x abscisse du point de r��f��rence de la forme
     * @param y ordonn��e du point de r��f��rence de la forme
     * @param epaisseurTrait l'epaisseur du trait pour le contour de la forme
     * @param couleurTrait la couleur du trait de contour
     * @param couleurRemplissage la couleur de remplissage
     */
    protected Forme(int x, int y, float epaisseurTrait,
            Color couleurTrait,
            Color couleurRemplissage) {
        this.x = x;
        this.y = y;
        this.couleurRemplissage = couleurRemplissage;
        this.couleurTrait = couleurTrait;
        this.epaisseurTrait = epaisseurTrait;
    }

    /**
     * @return abscisse du point de r��f��rence de la forme
     */
    public int getX() {
        return x;
    }

    /**
     * @return ordonn��e du point de r��f��rence de la forme
     */
    public int getY() {
        return y;
    }

    /**
     * change la position du point de r��f��rence de la forme
     * @param x nouvelle abscisse du point de r��f��rence de la forme
     * @param y nouvelle ordonn��e du point de r��f��rence de la forme
     */
    public void placerA(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void dessiner(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
