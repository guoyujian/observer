package ch02.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 京东观察者接口
 * @author Aaron
 * 2017年10月15日
 */
public class JdObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String product = (String) arg;
		System.out.println(product+"同步到京东.");
	}
	
}
