package geometry;

import java.util.Hashtable;

//Uzorak prototipa
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
		
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache() {
		// iscitavanje iz fajla i dodavanje oblika
		
		/*	
		 * Circle circle = new Circle(); circle.setId("1");
		 * shapeMap.put(circle.getId(),circle);
		 */
		 
	}
}
