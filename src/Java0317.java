
import java.util.Scanner;
import java.util.Random;

public class Java0317 {

	public static void main(String[] args) {
		
		// 230331 2장 실습 가위바위보 게임
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임 시작");
		System.out.println("가위, 바위, 보 중 하나를 입력해주세요");
		
		System.out.print("플레이어1>> ");
		String a = scanner.next();
		
		System.out.print("플레이어2>> ");
		String b = scanner.next();
		
		if(a.equals("가위"))
		{
			if(b.equals("가위"))
				System.out.println("비겼습니다");
			else if(b.equals("바위"))
				System.out.println("플레이어2가 이겼습니다");
			else if(b.equals("보"))
				System.out.println("플레이어1이 이겼습니다");
			else
				System.out.println("잘못 입력하셨습니다.");
		}
		else if(a.equals("바위"))
		{
			if(b.equals("가위"))
				System.out.println("플레이어1이 이겼습니다");
			else if(b.equals("바위"))
				System.out.println("비겼습니다");
			else if(b.equals("보"))
				System.out.println("플레이어2가 이겼습니다.");
			else
				System.out.println("잘못 입력하셨습니다.");
		}
		else if(a.equals("보"))
		{
			if(b.equals("가위"))
				System.out.println("플레이어2가 이겼습니다");
			else if(b.equals("바위"))
				System.out.println("플레이어1이 이겼습니다");
			else if(b.equals("보"))
				System.out.println("비겼습니다");
			else
				System.out.println("잘못 입력하셨습니다.");
		}
		
		else
			System.out.println("잘못 입력하셨습니다.");		
	
		// 가위바위보 게임 컴퓨터vs플레이어 - 랜덤함수, 스위치 사용하기
		Random random = new Random();
		int computer = random.nextInt(1,4); // 1 - 가위 / 2 - 바위 / 3 - 보
		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요>> ");
		String human = scanner.next();
		
		switch(human) {
		case "가위" : switch(computer) {
		case 1 : System.out.println("플레이어-가위, 컴퓨터-가위");
		System.out.println("비겼습니다.");
		break;
		case 2 : System.out.println("플레이어-가위, 컴퓨터-바위");
		System.out.println("졌습니다.");
		break;
		case 3 : System.out.println("플레이어-가위, 컴퓨터-보");
		System.out.println("이겼습니다.");
		break;
		default : System.out.println("잘못 입력되었습니다.");
		}
		break;
		
		case "바위" : switch(computer) {
		case 1 : System.out.println("플레이어-바위, 컴퓨터-가위");
		System.out.println("이겼습니다.");
		break;
		case 2 : System.out.println("플레이어-바위, 컴퓨터-바위");
		System.out.println("비겼습니다.");
		break;
		case 3 : System.out.println("플레이어-바위, 컴퓨터-보");
		System.out.println("졌습니다.");
		default : System.out.println("잘못 입력되었습니다.");
		}
		break;
		
		case "보" : switch(computer) {
		case 1 : System.out.println("플레이어-보, 컴퓨터-가위");
		System.out.println("졌습니다.");
		break;
		case 2 : System.out.println("플레이어-보, 컴퓨터-바위");
		System.out.println("이겼습니다.");
		break;
		case 3 : System.out.println("플레이어-보, 컴퓨터-보");
		System.out.println("비겼습니다.");
		break;
		default : System.out.println("잘못 입력되었습니다.");
		}
		break;
		
		default : System.out.println("잘못 입력하셨습니다.");
		}

		// 카페 계산 - 커피주문(메뉴,개수), 돈계산, 잔액이 부족합니다or커피 몇잔입니다~
		// 커피종류, 개수 - 얼마입니다 - 돈내고 - 건네받기
		
		System.out.println("아메리카노-1500원 바닐라라떼-3500원 카페모카-4000원");
		System.out.print("주문할 커피 종류는 무엇인가요?: ");
		String coffee = scanner.next();
		System.out.print("몇 잔 드릴까요?: ");
		int cup = scanner.nextInt();
		
		if (coffee.equals("아메리카노"))
		{
			System.out.print("아메리카노 "+cup+"잔의 가격은 "+cup*1500+"원 입니다.");
			cup = cup*1500;
		}
		else if (coffee.equals("바닐라라떼"))
		{
			System.out.print("바닐라라떼 "+cup+"잔의 가격은 "+cup*3500+"원 입니다.");
			cup = cup*3500;
		}
		else if (coffee.equals("카페모카"))
		{
			System.out.print("카페모카 "+cup+"잔의 가격은 "+cup*4000+"원 입니다.");
			cup = cup*4000;
		}
		else
		{
			System.out.print(coffee+"는 없는 메뉴입니다.");
		}
		
		System.out.println("계산 도와드리겠습니다~");
		System.out.print("소지중인 돈을 입력해주세요: ");
		int money = scanner.nextInt();
		money = money-cup;
		
		if (money>=0)
		{
			System.out.println("잔돈은 "+money+"원 입니다.");
			System.out.println("안녕히 가십시오.");
		}
		else
		{
			System.out.println("돈이 부족합니다");
		}
	}

}

