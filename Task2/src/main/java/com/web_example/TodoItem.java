package com.web_example;

public class TodoItem 
{
	private String title;
	private boolean done;
	
	public TodoItem(String title) {
		
		this.title = title;
		this.done = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	
	
}
