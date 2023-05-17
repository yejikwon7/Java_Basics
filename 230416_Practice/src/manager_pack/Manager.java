package manager_pack;
import member_pack.*;

public class Manager {
	public String name;
	public String position;
	
	private int companyFunds;
	
	public Manager(String name) {
		this.name = name;
		this.position = "매니저";
	}

	public void printWho() {
		System.out.println(this.name + " " + this.position + "입니다.");
	}
	
	public void addFunds(String memName, int income) {
		companyFunds += income;
		System.out.println(memName + "님이 " + income + "원 추가하셨습니다.");
	}
	
	public void getCompanyFunds() {
		System.out.println("현재 공금 : " + companyFunds + "원");
	}
	
	private void withdrawFunds(int outcome) {
		companyFunds -= outcome;
		System.out.println("공금이 " + outcome + "원 인출됐습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mng = new Manager("이동길");
		Member mb1 = new Member("김수연", "사원");
		Member mb2 = new Member("최승희", "대리");
		
		mb1.printWho();
		mng.addFunds(mb1.name, 15000);
		mng.getCompanyFunds();
		
		mb2.printWho();
		mng.addFunds(mb2.name, 30000);
		mng.getCompanyFunds();
		
		mng.printWho();
		mng.withdrawFunds(20000);
		mng.getCompanyFunds();
	}

}
