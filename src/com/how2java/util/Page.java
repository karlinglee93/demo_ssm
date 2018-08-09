package com.how2java.util;

public class Page {

	int start = 0;
	int count = 5;
	int last = 0;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public void caculateLast(int total) {
		// 最后一页的起始下标
		last = total - total % count;
	}

}