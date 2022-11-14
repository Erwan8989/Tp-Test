package fr.emse.dsi.junit;


public class Stack {
	private Node last_elem; 
	private int list_size; 
	
		private class Node { 
			String data;
			Node before;
		}
		
	// Methode qui vérifie qu'un objet est null
	public boolean isEmpty()
	{
		if (list_size == 0)
			return true;
		else 
			return false;
	}
	 
	// Méthode qui ajoute à la fin de la liste, un élément passé en paramètre
		public void push(String elem)
		{
			Node old_last_elem = last_elem;
			
			last_elem = new Node();
			last_elem.before = old_last_elem;
			
			last_elem.data = elem; // Ajoute l'élément passé en paramètre à la fin de la liste
			
			list_size++; // Mise à jour de la taille de la liste
		}
		
	// Methode de suppression et de renvoie du premier élément
	public String pop()
	{
		String elem = last_elem.data; // Récupération du premier élément de la liste, pour le renvoyer ultérieurement
		
		last_elem = last_elem.before; // On défini l'avant dernier élement comme dernier élement
		
		if (isEmpty()) {
			last_elem = null;
		}
		list_size--; // Mise à jour de la taille de la liste
		
		return elem; // Affichage de l'élément supprimé
	}
	 
	//	Retourne la taille de la liste
	public int getSize() {
		return list_size;
	}
}
