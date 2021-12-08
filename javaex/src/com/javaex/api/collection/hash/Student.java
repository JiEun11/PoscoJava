package com.javaex.api.collection.hash;

import java.net.InetSocketAddress;
import java.util.Objects;

public class Student {

	int id;
	String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// hashCode 비교 -> equals 확인 -> 동등
	@Override
	public int hashCode() {
		//	객체 식별값(정수)
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			// down casting
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}

	
	
}
