package collection.list;

import java.util.Collections;
import java.util.LinkedList;

/*
 * The LinkedList class is a collection which can contain many objects of the same type, 
 * just like the ArrayList.
 * ---------------------------
 * The LinkedList stores its elements in "containers." The list has a link to 
 * the first container and each container has a link to the next container 
 * in the list. To add an element to the list, the element is placed into 
 * a new container and that container is linked to one of the other containers
 *  in the list.
 */

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<String> link = new LinkedList<>();
		link.add("Java");
		link.add("Python");
		link.add("Jython");
		System.out.println(link);
		link.addFirst("Ruby");
		System.out.println(link);
		link.addLast("Playwright");
		System.out.println(link);
		
		Collections.sort(link);
		System.out.println(link);
		
		Collections.reverse(link);
		System.out.println(link);
		
		LinkedList<Integer> iList = new LinkedList<>();
		iList.add(34);
		iList.add(12);
		iList.add(46);
		iList.add(67);
		System.out.println(iList);
		iList.addFirst(98);
		System.out.println(iList);
		iList.addLast(71);
		System.out.println(iList);
		
		Collections.reverse(iList);
		System.out.println(iList);

		Collections.sort(iList, Collections.reverseOrder());
		System.out.println(iList);
	}

}
