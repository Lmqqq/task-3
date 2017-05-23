import java.util.Iterator;

public interface Node {

	void addNode(Node node);//添加结点

	Iterator<Node>iterator();//获取迭代器

}