package com.visp.designpattern.abstractfactory;

public class Test {

	// 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
	public static void main(String[] args) {
		IFactory factory = new AccessFactory();
		IUser user = factory.createUser();
		user.insert(new User());
		IDepartment department = factory.createDepartment();
		department.getDepartment(1);

		user = Factory.createUser();
		user.insert(new User());
		department = Factory.createDepartment();
		department.getDepartment(1);
	}
}
