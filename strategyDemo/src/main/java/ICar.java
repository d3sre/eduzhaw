package src.main.java;

public interface ICar {
	
	/**
	 *  Interface fuer Car, Auto hat Features und unterschiedliche Verhaltensweisen im Sommer und im Winter, diese sollen
	 *  je nach Jahreszeiten automatisch aktiv werden 
	 */
	
	/**
	 * Winter: bessere Pneu für Schnee/Regen
	 * Bremsweg angepasst
	 * Heizung funktioniert
	 * Licht permament an da dunkel
	 * 
	 * Sommer: Sommerpneu
	 * Bremsweg angepasst
	 * Heizung auf Klimaanlage
	 * Licht nur an wenn Sensor auf dunkel //ist ja nur Bsp Szenario auf die Schnelle, noch nicht ausgereift..
	 */

	public boolean heatingWorks();
	
	public boolean brakesWorkVeryWell();
	
	public boolean lightWorks();
	
	public void giveTire();
	
	
}
