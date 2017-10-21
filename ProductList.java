package ch02.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
	//单例
	private List<String> productList = null;
	private static ProductList instance;
	private ProductList(){
		
	}
	
	public static ProductList getInstance() {
		if(instance == null){
			instance=new ProductList();
			instance.productList=new ArrayList<>();
		}
		return instance;
	}
	//添加观察者的方法
	public void addObserver(Observer observer) {
		super.addObserver(observer);
	}
	//添加产品时的逻辑
	public void addProduct(String product){
		productList.add(product);
		System.out.println("新增了一个产品");
		this.setChanged();
		this.notifyObservers(product);
	}
	
}
