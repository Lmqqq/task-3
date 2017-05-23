import java.util.*;

public class BFI implements Iterator<Node> {

	private Queue<Iterator<Node>> queue = new LinkedList<Iterator<Node>>();

	public BFI(Iterator<Node> iter) {

		queue.offer(iter);

	}

	public boolean hasNext() {

		if (queue.isEmpty()) {

			return false;

		} else {

			Iterator<Node> iter = queue.peek();

			if (iter.hasNext()) {

				return true;

			} else {

				queue.poll();

				return hasNext();

			}

		}

	}

	public Node next() {

		if (hasNext()) {

			Iterator<Node> it = queue.peek();

			Node node = it.next();

			if (node instanceof Branchnode) {

				queue.offer(node.iterator());

			}

			return node;

		}

		return null;

	}

}