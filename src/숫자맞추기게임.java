import java.util.Random;
import java.util.Scanner;
//1~100사이의 임의의 숫자를 맞히는 게임
//10회 이상 틀리면 정답 알려주고 끝남 				------> 다시 해보기
//게임이 끝나고 한번 더 물어보고 실행하기
//~보다 작은수 라고 했는데 더 큰수 입력시 count아님 	------> 다시 해보기
public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());//random seed 변경
		
		//for(int i=1;i<20;i++)
		//System.out.println(rand.nextInt(10)); 10미만까지 랜덤
		char oneMore = 0;
		do {
		int comNum = rand.nextInt(100) + 1; //1에서 100까지
		System.out.println("정답 : "+ comNum); 			
		
		int userNum = 0;
		int count=0;
		
	
			do {
					do {
						System.out.print("1~100사이 입력 : ");
						userNum = scan.nextInt();
						scan.nextLine();//입력버퍼 비우기 = flushing
					}while(userNum<1 || userNum>100);
				
				if(userNum>comNum){
					System.out.println("더 작을 수를 입력하세요");
					count++;
				}
				else if(userNum<comNum) {
					System.out.println("더 큰 수를 입력하세요");
					count++;
				}
				else
					System.out.println("정답입니다!\n 시도 회수는"+ count + "번");
				
			}while(userNum != comNum);
				System.out.print("한번더?(Y/N) : ");
				oneMore = scan.nextLine().charAt(0);
				
		}while(oneMore =='Y');
	}
}
