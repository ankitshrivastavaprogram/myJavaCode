class A {


}
class B extends A {


}

class C {
 
 public static void main(String args[]) {
 
 A a1 = new A();
 B b1 = new B();
 C c1 = new C();
 Object obj = a1;
 obj= null;
 System.out.println("hello world");
 System.out.println(a1 instanceof Object);
 System.out.println(b1 instanceof A);
  System.out.println(a1 instanceof B);
  System.out.println(obj instanceof A);
   System.out.println(null instanceof Object);
   
 }

}
