
public abstract class Abstractnode implements Node {
	protected String name;// 结点名字

	protected Abstractnode(String name) {

		this.name = name;

	}

	public String toString() {

		return (name);// 识别各个结点
	}
}
