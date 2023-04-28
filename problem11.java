package FinalExam;

class Box{
	
	float height,width,depth;
	
	Box(float h,float w,float d){
		
	   height =h;
	   width = w;
	   depth = d;
		
	}

	Box(){
		
	   height = -1;
	   width = -1;
	   depth = -1;
	}
	
	Box(float len){
		
		   height = width = depth = len  ;
	}
	
	float volume() {
		
		return height*width*depth;
		
	}
}

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box obj1 = new Box(10,20,30);
		Box obj2 = new Box();
		Box obj3 = new Box(20);
		
		float area1 = obj1.volume();
		float area2 = obj2.volume();
		float area3 = obj3.volume();
		
		System.out.println("Area 1: "+area1+"\nArea 2: "+area2+"\nArea 3: "+area3);
		
	

	}

}
