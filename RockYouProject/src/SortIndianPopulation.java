import java.util.ArrayList;
import java.util.List;

public class SortIndianPopulation {

	public static List<Person> indianPopulation = new ArrayList<Person>();
	public static List[] finalResultSort = new List[26];
	static {
		Person p17 = new Person("a",1);
		Person p12 = new Person("b",1);
		Person p6 = new Person("c",1);
		Person p8 = new Person("aa",1);
		Person p5 = new Person("ab",1);
		Person p18 = new Person("ac",1);
		Person p16 = new Person("aaa",1);
		Person p10 = new Person("aab",1);
		Person p9 = new Person("aac",1);
		Person p4 = new Person("aba",1);
		Person p1 = new Person("abb",35);
		Person p2 = new Person("abc",1);
		Person p13 = new Person("abb",45);
		Person p14 = new Person("abb",20);
		
		Person p15 = new Person("bbb",20);
		Person p7 = new Person("xbb",20);
		Person p11 = new Person("xbb",21);
		Person p3 = new Person("xbb",19);
		indianPopulation.add(p1);
		indianPopulation.add(p2);
		indianPopulation.add(p3);
		indianPopulation.add(p4);
		indianPopulation.add(p5);
		indianPopulation.add(p6);
		indianPopulation.add(p7);
		indianPopulation.add(p8);
		indianPopulation.add(p9);
		indianPopulation.add(p10);
		indianPopulation.add(p11);
		indianPopulation.add(p12);
		indianPopulation.add(p13);
		indianPopulation.add(p14);
		indianPopulation.add(p15);
		indianPopulation.add(p16);
		indianPopulation.add(p17);
		indianPopulation.add(p18);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread a = new Thread(new SortThread('a'));
		Thread b = new Thread(new SortThread('b'));
		Thread c = new Thread(new SortThread('c'));
		Thread d = new Thread(new SortThread('d'));
		Thread e = new Thread(new SortThread('e'));
		Thread f = new Thread(new SortThread('f'));
		Thread g = new Thread(new SortThread('g'));
		Thread h = new Thread(new SortThread('h'));
		Thread i = new Thread(new SortThread('i'));
		Thread j = new Thread(new SortThread('j'));
		Thread k = new Thread(new SortThread('k'));
		Thread l = new Thread(new SortThread('l'));
		Thread m = new Thread(new SortThread('m'));
		Thread n = new Thread(new SortThread('n'));
		Thread o = new Thread(new SortThread('o'));
		Thread p = new Thread(new SortThread('p'));
		Thread q = new Thread(new SortThread('q'));
		Thread r = new Thread(new SortThread('r'));
		Thread s = new Thread(new SortThread('s'));
		Thread t = new Thread(new SortThread('t'));
		Thread u = new Thread(new SortThread('u'));
		Thread v = new Thread(new SortThread('v'));
		Thread w = new Thread(new SortThread('w'));
		Thread x = new Thread(new SortThread('x'));
		Thread y = new Thread(new SortThread('y'));
		Thread z = new Thread(new SortThread('z'));
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		f.start();
		g.start();
		h.start();
		i.start();
		j.start();
		k.start();
		l.start();
		m.start();
		n.start();
		o.start();
		p.start();
		q.start();
		r.start();
		s.start();
		t.start();
		u.start();
		v.start();
		w.start();
		x.start();
		y.start();
		z.start();
		a.join();
		b.join();
		c.join();
		d.join();
		e.join();
		f.join();
		g.join();
		h.join();
		i.join();
		j.join();
		k.join();
		l.join();
		m.join();
		n.join();
		o.join();
		p.join();
		q.join();
		r.join();
		s.join();
		t.join();
		u.join();
		v.join();
		w.join();
		x.join();
		y.join();
		z.join();
		
		// Summary result from all thread.
		for (List<Person> ll : finalResultSort) {
			for (Person pp : ll) {
				System.out.println(pp.getName()+" age "+pp.getAge());
			}
		}
	}
	
	public static void main2(String[] args) {
		//Not use thread version
		
		Node node = new Node(0);
		// add & sort data
		for (final Person p : indianPopulation) {
			node.add(p);
		}
		// merge result form child node
		List<Person> finalResult = node.sumUp();
		// print result
		for (final Person p : finalResult) {
			System.out.println(p.getName()+" age "+p.getAge());
		}
	}
}
