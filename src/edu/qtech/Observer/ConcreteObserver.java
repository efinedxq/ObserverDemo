package edu.qtech.Observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
        System.out.println("接收到消息，并进行处理！");
	}

}
