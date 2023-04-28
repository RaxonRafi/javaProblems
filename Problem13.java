package FinalExam;

class Box{
	
	float width, height,depth;
	
	Box(float w, float h, float d){
		
	   width = w;
	   height = h;
	   depth = d;
		
	}
}
class BoxWeight extends Box{
	
	float weight;

	BoxWeight(float w, float h, float d,float m) {
		super(w, h, d);
		
		 weight = m;
       
	}
	
	float vloume() {
		
		return weight * height* depth* weight;
	}
	
}

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxWeight obj1 = new BoxWeight(10,20,30,40);
		
		float area = obj1.vloume();
		
		System.out.println("Area: "+ area);
		

	}

}
