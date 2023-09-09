package com.mycom.word;

public interface ICRUD {
	public Object add();
	public int update(Object obj);
	public int delate(Object obj);
	public void selectOne(int id);
}
