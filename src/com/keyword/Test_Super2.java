package com.keyword;

public class Test_Super2 extends Test_Super1 {
	public void display()
	{
		System.out.println("Child Class");
		 

	}
  public static void main(String[] args) {
	Test_Super2 s=new Test_Super2();
	s.display();
	  //super.print();
	

}
  


}


//Static methods cannot  accessed by objects... Super methods are accessed using object "Super"