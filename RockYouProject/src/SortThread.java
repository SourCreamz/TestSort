import java.util.List;

public class SortThread implements Runnable{

	
	private char firstChar;
	public SortThread(final char firstchar) {
		this.firstChar = firstchar;
	}
	
	@Override
	public void run() {
		// read & sort data
		Node node = new Node(0);
		for (final Person p : SortIndianPopulation.indianPopulation) {
			if (p.getName().charAt(0) == this.firstChar) {
				node.add(p);
			}
		}
		
		// merge result form child node
		List<Person> result = node.sumUp();
		
		// assign to data center
		SortIndianPopulation.finalResultSort[firstChar-97] = result;
	}

}
