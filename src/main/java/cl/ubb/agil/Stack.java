package cl.ubb.agil;

public class Stack {
	int tope= -1;
	private int [] pila = new int [10];
	
	
	public boolean NuevaPila(){
		if(tope==-1){
			return true;
		}else{
			return false;
		}	
	}
	
	public boolean Push(int num){
		tope=tope+1;
		if(tope==0){
			return true;
		}else{
			return false;
		}
	}


}
