package package1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Animateur permettant de déplacer une forme avec un mouvement circulaire
 * uniforme.
 * 
 */
public class MvtCirculaire  implements IFormeAnimable {

    /**
     * rayon du cercle sur lequel l'animateur déplace la forme
     */
    private final int rayon;
    
    /**
     * abscisse du centre du cercle sur lequel l'animateur déplace la forme
     */
    private final int xc;
    
    /**
     * ordonnée du centre du cercle sur lequel l'animateur déplace la forme
     */
    private final int yc;
    
    /**
     * angle où se situe le point de référence de la forme animée.
     */
    private double angle;
    
    /**
     * variation de l'angle de rotation à chaque pas d'animation
     */
    private final double deltaAngle;

    public MvtCirculaire(int xc, int yc, int r, double angle, double deltaAngle) {
        this.deltaAngle = deltaAngle;
        this.angle = angle;
        this.rayon = r;
        this.xc = xc;
        this.yc = yc;
    }

    

private  List<Etoile> listeEtoile = new CopyOnWriteArrayList();
 
    @Override
    public void deplacer(Forme f) {
    	 
    		    
        angle += deltaAngle;
        double angleRadians = Math.toRadians(angle);
        f.placerA((int) (xc + rayon * Math.cos(angleRadians)),
                (int) (yc + rayon * Math.sin(angleRadians)));
        try {
            Thread.sleep(1000); //Ici, une pause d'une seconde
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
      
    }
    public void deplacer(Visage v) {
   	 
	    
        angle += deltaAngle;
        double angleRadians = Math.toRadians(angle);
        v.placerA((int) (xc + rayon * Math.cos(angleRadians)),
                (int) (yc + rayon * Math.sin(angleRadians)));
        try {
            Thread.sleep(1000); //Ici, une pause d'une seconde
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
      
    }

public void animer(Forme f) {
    	
    }
	     
 
  
  




/*
public void animer(Forme f) {
    //  dessiner les Objets que contient le dessin
    for (Etoile E : listeEtoile) {
    	for (;;) {
	      try {
	        Thread.sleep(1000L);
	      }
	      catch (InterruptedException localInterruptedException) {
	        localInterruptedException.printStackTrace();
	      }
	      E.deplacer(E);
	    }
        
    }
    */
    
}
