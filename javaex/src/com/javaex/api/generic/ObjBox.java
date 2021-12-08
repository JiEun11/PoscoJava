package com.javaex.api.generic;

public class ObjBox {
	Object content; //data타입을 모든 객체로 다 받을 수 있는 Object
	
	public Object getContent() {
		return content;
	}
	
	public void setContent(Object content) {
		this.content = content;
	}
}
