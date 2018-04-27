import java.util.ArrayList;
import java.util.List;

public class Node {
// Alphabet Node
	private int level;
	private Node[] childs = new Node[26]; //26 alphabet
	private List[] sortedList = new List[120]; // assume age is not over 120
	
//	each char of name is vary to 26 alphabet so we make array[26] for each character in the name.
//	and the childs node is next letter in the name
//	and we use index of array to define character, Ex. 'a' is array index 0 and 'c' is array index 2
	
	public Node(final int level) {
		this.level = level;
	}
	
	private void addPerson(final Person p) {
		if (sortedList[p.getAge()] == null)
			sortedList[p.getAge()] = new ArrayList<Person>();
		sortedList[p.getAge()].add(p);
	}
	
	// add and sort it
	public void add(final Person p) {
		if (p.getName().length()<=level) {
			addPerson(p);
		} else {
			char x = p.getName().charAt(level);
			if (childs[x-97] == null)
				childs[x-97] = new Node(level+1);
			childs[x-97].add(p);
		}
	}
	
	// Method of summary result from childNode
	public List<Person> sumUp(){
		List<Person> result = new ArrayList<Person>();
		for (final List l : sortedList) {
			if (l != null)
				result.addAll(l);
		}
		
		for (final Node n : childs) {
			if(n!=null)
				result.addAll(n.sumUp());
		}
		return result;
	}
}
