package member_pack;

public class Member {
	public String name;
	public String position;
	
	public Member(String name, String position) {
		this.name = name; this.position = position;
	}
	
	public void printWho() {
		System.out.println(this.name + " " + this.position + "입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
