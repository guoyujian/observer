package ch02.observer;

import java.util.Observable;
import java.util.Observer;

public class TBObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String product = (String) arg;
		System.out.println(product+"同步到淘宝.");
	}

}
