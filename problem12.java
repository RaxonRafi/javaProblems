package FinalExam;
class A{
	int i,j;
	A(int a, int b){
		i=a;
		j=b;
	}
	void show(){
		System.out.println("i="+ i +" j="+j);
	}
}
class B extends A{ // inheriting A
	int k;
	B(int a, int b, int c){
		super(a,b); // pass values to superclass
		k=c;
	}
	void show(){
		//super.show();
		System.out.println("k= "+k);
	}
}
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B my1=new B(1,2,3);
		my1.show();
	}

}
