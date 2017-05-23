import java.util.*;

public class Branchnode extends Abstractnode {

	public Branchnode(String name) {
		super(name);
	}

	private Collection<Node> childs = new ArrayList<Node>();

	public void addNode(Node node) {
		childs.add(node);
	}

	public Iterator<Node> iterator() {
		return childs.iterator();
	}

}