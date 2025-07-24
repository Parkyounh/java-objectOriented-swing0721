package objectOriented;

import java.util.Scanner;

class Student{
	int[] scores;
		

	public int getScores(int i) {
		return scores[i];
	}

	public void setScores(int [] scores) {
		this.scores = scores;
	}
	
	public int bestScores(int studentnum) {
		int best = 0;
		for (int i = 0; i<studentnum; i++) {
			if (best < scores[i]) {
				best = scores[i];
			}
		}
		return best;
	}
	
	public float average(int studentnum) {
		int total =0;
		for (int i=0; i<studentnum; i++) {
			total += scores[i];
		}
		return (float)total/studentnum;
	}
}

public class StudentScores { // 학생 수와 각 학생들의 점수를 입력받아서 최고, 평균점수 구함  1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int studentnum=0;
		int[] studentnumArray;
		
		System.out.println("최초 학생수 입력: ");
		studentnum =Integer.parseInt(sc.nextLine());
		Student stu = new Student();
		studentnumArray = new int[studentnum];
		
		while(run) { 
		
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			int num = Integer.parseInt(sc.nextLine());
			if(num == 1) {
				System.out.print("학생수 변경: ");
				studentnum =Integer.parseInt(sc.nextLine());
				studentnumArray = new int[studentnum];
			}
			else if (num ==2) {
				for(int i = 0; i<studentnum; i++) {
					System.out.print("점수 입력: ");
					studentnumArray[i] = Integer.parseInt(sc.nextLine());
					stu.setScores(studentnumArray);
				}
			}
			else if (num ==3) {
				for(int i = 0; i<studentnum; i++) {
					System.out.printf("scores[%d]의 점수: %d\n",i,stu.getScores(i));
				}
			}
			else if (num ==4) {
					System.out.printf("최고 점수: %d | 평균 점수: %.4f",stu.bestScores(studentnum),stu.average(studentnum));
			}
			else {
				System.out.println("종료");
				return;
			}
		
		}
	}
}