package frames8amclass;

public class Constructor {
public Constructor() {
	System.out.println("bank name is HDFC");
}
public Constructor(int id) {
	System.out.println("bank id is" + id);
}
public static void main(String[] args) {
	Constructor c = new Constructor(1875);

	System.out.println(c);
}



}
