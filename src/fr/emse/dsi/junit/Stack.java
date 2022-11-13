package fr.emse.dsi.junit;


public class Stack {
	private Node first_elem, last_elem; 
	private int list_size; 
	
	//linked list node
		private class Node { 
			String data;
			Node next;
			Node before;
		}
		
	//  Methode qui vérifie qu'un objet est null
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
			
//			if (isEmpty()) { // Si la liste est vide, l'élément unique est à la fois le premier et le dernier élement de la liste
//				first_elem = last_elem;
//			} else { // Défini l'object instancié comme dernier élément de la liste
//				old_last_elem.next = last_elem; 
//			}
			
			list_size++; // Mise à jour de la taille de la liste
		}
		
	// Methode de suppression et de renvoie du premier élément
	public String pop()
	{
		String elem = last_elem.data; // Récupération du premier élément de la liste, pour le renvoyer ultérieurement
		
		last_elem = last_elem.before; // On défini le second élement comme premier élement 
		
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
	
	//	Retourne le premier élément de la liste
	public String getFront() {
		return (first_elem.data);
	}
}
