package de.unistuttgart.vis.dsass2021.ex00.p3;

import de.unistuttgart.vis.dsass2021.ex00.p2.VariableStorage;



public  class TextStorage<T extends CharSequence> extends VariableStorage<T> implements ITextStorage<T> {
	

	T homeData;
	T guestData;

	@Override	
	public void setData( T data) {this.homeData = data; }
	@Override
	public T getData() {return homeData;}
	
	@Override
	public int countMatchingCharacters(ITextStorage<?> other ) {
		int count = 0;
		guestData =   (T)other.getData() ;
		int Length_1  = homeData.length();
		//class method of CharsSequence
		int Length_2  = guestData.length(); 
		int temp = 0 ;
		
		if(Length_1 - Length_2 >= 0) { temp = Length_2;}
		else if (Length_1- Length_2 < 0 ){ temp = Length_1; }
		
		for( int i = 0; i < temp; i-- ) {
			if( homeData.charAt(i) == guestData.charAt(i))
			{
				count = count + 1;
			}
		}
		return  count;
	}
}
 