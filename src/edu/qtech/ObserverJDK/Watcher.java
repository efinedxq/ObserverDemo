package edu.qtech.ObserverJDK;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

	public Watcher(Observable o) {
		// TODO Auto-generated constructor stub
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
        System.out.println("״̬�����ı䣺"+((Watched)o).getData());
	}

}
