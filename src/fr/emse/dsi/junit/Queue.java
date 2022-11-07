package fr.emse.dsi.junit;

import java.util.ArrayList;
import java.util.List;


public class Queue<E> {

	private E elem;
	private List list;
	
//	Methode qui vérifie qu'un objet est null
	public boolean isEmpty() {
		if(this.getElem() == null || this.getSize() == 0) 
			return true;
		else 
			return false; 
	}

//		Métthode qui ajoute à la fin de la liste, un élément passé en paramètre
	public void push(E elem) {
		List<String> list = new ArrayList<String>();
		String elemString = String.valueOf(elem);
		
		E elembis = (E) String.valueOf(this.getElem());
		elembis = (E) elembis.toString().replace("[", "").replace("]", "").replace(", ", ""); // Nettoyage de la liste (supression de crochets ou virgules orphelines)
		
		if(elem == null) { // Si aucun paramètre passé
			this.elem = null;
		} else if (elembis == "null") { // Itteration lors de l'ajout du premier éléments
			list.add(elemString);
		}
		 else { // Itteration lors de l'ajout du second element et plus
			 for(int i=0;i<list.size();i++){
				    list.add(list.get(i));
				} 
			 list.add((String) elembis);
			 list.add((String) elem);
		 }
		
		this.list = list;
	}

//	Methode de suppresion et de renvoie du premier élement d'une liste
	public E pop() {
		E firstElem = (E) list.get(0); // On récupère le premier élement de la liste
		this.list.remove(0); // On supprimer le premier élement de la liste
		
		return firstElem;
	}
	
//	Methode qui retourne la liste d'un objet
	public E getElem() {
		return (E) this.list;
	}
	
//	Methode qui retourne la taille de la liste d'un objet
	public int getSize() {
		List test3 = this.list;
		return test3.size();
	}
}