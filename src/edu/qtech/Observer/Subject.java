package edu.qtech.Observer;

import java.util.Vector;

public abstract class Subject {
	 //����۲����б�
	 private Vector<Observer> obsVector = new Vector<Observer>();
	 //����һ���۲���
	 public void addObserver(Observer o){
		 this.obsVector.add(o);
	 }
	 //ɾ��һ���۲���
	 public void deleteObserver(Observer o){
		 this.obsVector.remove(o);
	 }
	 //֪ͨһ���۲���
	 public void notifyObserver(){
		 for(Observer o:this.obsVector){
			 o.update();
		 }
	 }
} 