
public class Lab03 {

	public static void main(String[] args){
		
		int counter = 0;
		
			for(int i = 0; i<100; i++){
				double x = (14*Math.random()-7);
				double y = (14*Math.random()-7);
				if(isInside(x,y)){
					counter++;
				}
			}
		int generate = 100;	
		double result = 4.0*counter/generate;
		System.out.println(result);
	}
	public static boolean isInside(double x, double y){
	
		
		
		double h = Math.sqrt(x * x + y * y);
		
		if(h<=7){
			
			return true;
		
		}
			
		return false;
		
	}

	}

