class A {
	void f1() {
		System.out.println("A:f1");
	}

}
class B extends A {

	void f1() {
		System.out.println("B:f1");
	}

}
 class C extends B {
	 void f1() {
		System.out.println("C:f1");
	}
 }
 class D extends C {
	 void f1() {
		System.out.println("D:f1");
	}
 }
 class E extends D {
	 void f1() {
		System.out.println("E:f1");
	}
 }
 
 class Test1 {
	 
	 public static void main(String args[]) {
		 D d1 = new D();
		 C c1 = new C();
		 E e1 = new E();
		 B b1 = new B();
		 Test1 t1 = new Test1();
		 t1.callingf1(c1);
		  t1.callingf1(d1);
		   t1.callingf1(e1);
		    //t1.callingf1(b1);
		   
		 
	 }
	 
	void callingf1(C c1) {

	c1.f1();
	}	
		 
 }