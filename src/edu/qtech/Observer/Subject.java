package edu.qtech.Observer;

import java.util.Vector;

public abstract class Subject {
	 //定义观察者列表
	 private Vector<Observer> obsVector = new Vector<Observer>();
	 //增加一个观察者
	 public void addObserver(Observer o){
		 this.obsVector.add(o);
	 }
	 //删除一个观察者
	 public void deleteObserver(Observer o){
		 this.obsVector.remove(o);
	 }
	 //通知一个观察者
	 public void notifyObserver(){
		 for(Observer o:this.obsVector){
			 o.update();
		 }
	 }
} 
