package edu.qtech.Observer;

public class ConcreteSubject extends Subject {
    
	//����ҵ���߼�
	public void doSomething(){
		super.notifyObserver();
	}
}
