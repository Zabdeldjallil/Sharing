/*package package1;

import java.awt.Graphics2D;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JPanel;
class Dessin2D extends Dessin{
	private final List<Visage> listeVisage = new CopyOnWriteArrayList();
	
	public void ajouterObjet2(Visage v) {

        if (!listeVisage.contains(v)) {
            // l'objet n'est pas d��j�� dans la liste
            // on le rajoute a la liste des objets du dessin
        	listeVisage.add(v);
            // le dessin se r��affiche
            repaint();
            this.pause(10);
        }
    }
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Visage c : listeVisage) {
            c.dessiner(g);
        }
    }
}*/
