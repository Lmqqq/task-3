import java.util.Iterator;

public class test {

	static Node createTree() {

		Node root = new Branchnode("R");

		Node a = new Branchnode("A");

		Node b = new Leafnode("B");

		Node c = new Branchnode("C");

		Node d = new Branchnode("D");

		Node e = new Branchnode("E");

		Node f = new Branchnode("F");

		a.addNode(d);

		d.addNode(e);

		c.addNode(f);

		root.addNode(a);

		root.addNode(b);

		root.addNode(c);

		return root;

	}

	static void DepthFirstIterator(Node tree) {

		System.out.println("深度优先迭代器：");

		doSomething(tree);

		for (Iterator<Node> it = new DFI(tree.iterator()); it.hasNext();) {

			doSomething(it.next());

		}

		System.out.println();

	}

	static void BreadthFirstIterator(Node tree) {

		System.out.println("广度优先迭代器：");

		doSomething(tree);

		for (Iterator<Node> it = new DFI(tree.iterator()); it.hasNext();) {

			doSomething(it.next());

		}

		System.out.println();

	}

	static void doSomething(Node node) {

		System.out.print(node);

	}

	public static void main(String[] args) {

		Node tree = createTree();

		DepthFirstIterator(tree);

		BreadthFirstIterator(tree);

	}

}