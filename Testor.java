package ch02.observer;

public class Testor {
	public static void main(String[] args) {
		ProductList list = ProductList.getInstance();
		list.addObserver(new JdObserver());
		list.addObserver(new TBObserver());
		list.addProduct("本子");
	}
}
