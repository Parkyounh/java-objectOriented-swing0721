package objectOriented;

import java.util.Scanner;

class BankAccount{ //183 6번 문제
	
	private String name;
	private String account;
	private int balance;
	
	public BankAccount(String name, String account, int balance) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	BankAccount(){
		name="박";
		account="1234";
		balance=0;
	}

	void deposit(int balance){ //입금
		this.balance +=balance;
	}

	void withdraw(int balance){ //출금
		this.balance -=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}


public class BankProgram {
	// 데이터 입력후 예금,출금,조회,종료 프로그램    +로그인, 회원가입
	public static void main(String[] args) {
		boolean run = true,login = false;
		int num;		

		Scanner sc = new Scanner(System.in);
		BankAccount ba = new BankAccount("박윤호","1234",0);
		
		while(run) {   //로그인, 회원가입
			if(login == false) {
				System.out.println("--------------------------------");
				System.out.println("1.로그인 | 2.회원가입");
				System.out.println("--------------------------------");
				String logintf = sc.nextLine();
	
				if (logintf.equals("1")) {
					System.out.println("--------------------------------");
					System.out.print("이름>");
					String str = sc.nextLine();
					if (!str.equals(ba.getName())) {
						System.out.println("로그인 실패");
						continue;
					}
					System.out.println("--------------------------------");
					System.out.print("비밀번호>");
					str = sc.nextLine();
					if (!str.equals(ba.getAccount())) {
						System.out.println("로그인 실패");
						continue;
					}
					login = true;
				}
				else if (logintf.equals("2")) {
					System.out.print("이름을 입력해주세요: ");
					ba.setName(sc.nextLine());
					System.out.print("비밀번호을 입력해주세요: ");
					ba.setAccount(sc.nextLine());
					continue;
				}
				else {
					System.out.println("잘못 입력");
					continue;
				}
				
			}
			
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.로그아웃");
			System.out.println("--------------------------------");
			num=Integer.parseInt(sc.nextLine());
			
			if(num == 1) { 
				System.out.println("예금할 금액을 입력해주세요");
				num = Integer.parseInt(sc.nextLine());
				ba.deposit(num);
			}
			else if(num == 2) { 
				System.out.println("출금할 금액을 입력해주세요");
				num = Integer.parseInt(sc.nextLine());
				ba.withdraw(num);
			}
			else if(num == 3) { 
				System.out.println("잔고: "+ba.getBalance());
			}
			else { 
				System.out.println("시스템을 종료합니다");
				run = false;
			}
		}
		
	}
}
