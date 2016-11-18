package com.zf.zson.result;

import java.util.List;


public interface ZsonResult{
	
	public boolean isValid();
	
	public Object getValue(String path);
	
	public List<Object> getValues(String path);
	
	public String getString(String path);
	
	public int getInteger(String path);
	
	public long getLong(String path);
	
	public double getDouble(String path);
	
	public float getFloat(String path);
	
	public boolean getBoolean(String path);
	
	public ZsonResult addValue(String path, String json);
	
}