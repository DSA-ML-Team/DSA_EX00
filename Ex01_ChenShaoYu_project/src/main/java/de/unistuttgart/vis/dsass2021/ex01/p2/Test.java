package de.unistuttgart.vis.dsass2021.ex01.p2;

public class Test {

	
	public static void main(String[] args) {
		ISpeedList<Integer> speedList = new SpeedList<Integer>();
		
		
		speedList.prepend(19);
		speedList.prepend(20);
		speedList.prepend(23);
		speedList.append(12);
		speedList.append(19);
		speedList.append(222);
		speedList.size();
		
		
		
		
		int get = speedList.getElementAt(3);
		System.out.println(speedList.size());
		System.out.println(speedList);
		System.out.println(get);
}

}
