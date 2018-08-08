class A{
	public void  f1(){
	System.out.println("f1");
	}
	 static  void  f2(){
		System.out.println("f2");
	}

}

class B extends A {
	public static void main(String args[]){
	B b1 =  new B();
     b1.f1();
     b1.f2();	 

	}	
}

