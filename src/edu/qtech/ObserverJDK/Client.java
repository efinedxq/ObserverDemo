package edu.qtech.ObserverJDK;

import java.util.Observer;

public class Client {
	public static void main(String[] args) {

		// �������۲��߶���
		Watched watched = new Watched();
		// �����۲��߶��󣬲������۲��߶���Ǽ�
		Observer watcher = new Watcher(watched);
		Observer watcher1 = new Watcher(watched);
		// �����۲���״̬��ֵ
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");

	}
}

