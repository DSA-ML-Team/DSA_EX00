package de.unistuttgart.vis.dsass2021.ex00.p2;

public class VariableStorage<T> implements IVariableStorage<T> {
	public T var;
	
	
	public void set(T var){	this.var = var; } 
	
	public T get(){
		return var;
	}
	

}
