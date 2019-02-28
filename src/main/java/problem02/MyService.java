package problem02;

public class MyService extends BaseService {

	public void service(String state) {
		if(state.equals("오후")) {
			System.out.println("오후서비스시작");
		}
		else if(state.equals("낮")) {
			System.out.println(super.day()+"서비스시작");
		}
		else 
			System.out.println(super.night()+"서비스시작");
		
	}
	
}
