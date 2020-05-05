
public class LinkedListAlgoritmasi <T> {
	public T veri; 
	public LinkedListAlgoritmasi sonraki;
	public LinkedListAlgoritmasi onceki;
	
	public LinkedListAlgoritmasi(T veri) {
		this.veri=veri;
	}
	public LinkedListAlgoritmasi() {
		sonraki=null;
		onceki=null;
	}
	public void print() {
		System.out.println(veri + " ");
	}

}
