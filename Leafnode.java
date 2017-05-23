import java.util.*;

public class Leafnode extends Abstractnode {

	public Leafnode(String name) {

		super(name);

	}

	public void addNode(Node node) {

		throw new UnsupportedOperationException("Can't add a node to leaf.");

	}

	public Iterator<Node> iterator() {

		return new Nulliterator<Node>();

	}

}