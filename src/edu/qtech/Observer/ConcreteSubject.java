package edu.qtech.Observer;

public class ConcreteSubject extends Subject {
    
	//具体业务逻辑
	public void doSomething(){
		super.notifyObserver();
	}
}
