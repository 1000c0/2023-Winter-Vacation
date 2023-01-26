import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class judgement_game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "0";
		int win = 0;
		
		System.out.println("안녕하십니까. 이번에 재판을 받게 됬습니다. 결백을 받아다오.");
		System.out.println("1 : 아잇 물론이죠!");
		System.out.println("2 : 허허 그건 장담 할 수 없죠");
		ans = sc.next();
		if(ans.equals(1)) {
			System.out.println("나루호도 : 아잇 물론이죠! " + "걱정 마십시오!!");
			System.out.println("피고 : 당연한 것");
		} else if(ans.equals(2)) {
			System.out.println("나루호도 : 허허 그건 장담할 수 없죠 ");
			System.out.println("피고 : ...");
		}
		
		// 결정적인 증거 확보 
		System.out.println("조수 : 마지막으로 한번 더 현장을 조사하러 가시겠습니까?");
		System.out.println("1 : 혹시 모르니 가봅시다.");
		System.out.println("2 : 그럴 필요 없네!");
		ans = sc.next();
		if(ans.equals("1")) {
			System.out.println("나루호도 : 지금 바로 가봅시다.");
			System.out.println("현장에서 떨어져 있는 맥도날드 결제 영수증을 주웠다.");
			System.out.println("왠지 중요하게 쓰일 것 같다.");
		} else {
			System.out.println("나루호도 : 그럴 필요 없네! 바로 재판장으로 가세");
			System.out.println("조수 : 이번 재판도 말아 먹겠구만");
		} 
		
		// 재판 시작
		judge_nom();
		System.out.println("재판장 : 지금부터 재판을 시작하겠습니다. 모두 주의를 집중해 주십시오.");
		System.out.println("재판장 : 피고인인 '종건'은 피해자를 숨지게 한 혐의가 있오.");
		System.out.println("재판장 : 그러면 피고의 말부터 듣도록 하겠다.");
		
		jonggeon();
		System.out.println("피고 : 나는 당일 '종건급'이라며 피해자가 시비를 걸어서 겁만 주고 쫓아냈디.");
		System.out.println("피고 : 그 녀석의 몸에는 피한방울도 내지 않았지.");
		
		objection();
		objection_sound(args);
		mitsurugi_nom();
		System.out.println("웃기지 마라 피해자의 몸에서 네놈의 지문이 나왔다.");
		
		
		// 첫번쨰 증거 제출
		objection();
		objection_sound(args);
		naruhodo_nom();
		System.out.println("무슨 증거를 사용해야 할까?");
		System.out.println("1 : cctv 녹화본    2 : 버거킹 영수증    3 : 피고의 핸드폰 사용 기록    4 : 스타벅스 캐리어");
		ans = sc.next();
		
		if(ans.equals("1")) {
			System.out.println("여기 cctv 녹화본입니다. 피고는 멱살이 잡혀 이를 풀려고 한 것일 뿐 그 어떤 공격을 하지 않았습니다.");
			win++;
			mitsurugi_mad();
			System.out.println("검사 : 크윽 그건 그렇군...");
			System.out.println("하지만 실랑이가 끝나고 피고가 피해자를 따라가는 모습 또한 찍히지 않았나!?");
		} else {
			win--;
			mitsurugi_nom();
			System.out.println("검사 : 하하하 띨빵한 녀석 그걸 증거라고 제출하는 거냐");	
		}

		//증인 등장
		
		judge_nom();
		System.out.println("재판장 : 정숙하시오.");
		System.out.println("재판장 : 그러면 증인의 증언을 들어보겠오.");
		
		wakgood_nom();
		appearance(args);
		System.out.println("증인 : 저는 우연히 사건 당시에 주변에서 '저녁'을 먹고 있었던 '우왕굳'입니다.");
		System.out.println("증인 : 피고가 피해자에게 주먹을 휘두르는 것을 분명히 목격했습니다.");
		
		objection();
		objection_sound(args);
		jonggeon();
		System.out.println("피고 : 어이 말 똑바로 해라.");
		
		objection();
		objection_sound(args);
		mitsurugi_nom();
		System.out.println("검사 : 이거 보시오. 진실을 말하니 분노하는 거요.");
		
		judge_nom();
		System.out.println("제판장 : 정숙하시오");
		System.out.println("재판장 : 그럼 증인에게 질문하시오.");
		

		System.out.println("무슨 질문을 할까?");
		System.out.println("1 : 증인은 무슨 아이돌을 좋아하십니까?\n2 : 증인은 저녁으로 무엇을 드셨습니까?\n3 : 스타벅스 좋아하십니까?");
		
		ans = sc.next();
		if(ans.equals("2")) {
			
		} else {
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
	}
	public static void objection() {
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠉⠻⣿⣿⣿⣿⣿⠿⠿⠛⠉⠈⠉⢻⣿⡿⠉⣿⣿⣿⣿⣿⣿⣿⡿⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠈⠛⠿⣿⣿⣶⣤⣄⣀⠀⠀⠀⢻⣧⠀⠘⣿⣿⣿⣿⣿⠏⠀⢸⣿⣿⣿⣿⣿⣿⡿⣻⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠉⠁⠀⠀⠙⢿⣦⠀⠀⠈⢿⣆⠀⠈⠻⠿⠛⠁⠀⠀⠘⣿⣿⣿⣿⠟⠉⣰⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⠁⠈⠀⠀⠀⢸⣷⠀⠀⠸⣿⠁⡀⠀⠈⢿⣆⠀⠀⠀⢀⣀⣀⣀⣀⣈⡉⠉⠀⠀⢰⡟⠋⠛⠻⣿⣿⣿");
		System.out.println("⣿⣿⣿⣷⣄⠀⠈⠉⠉⠉⠉⢁⣀⣀⠀⠆⠀⠘⠃⠀⠀⢸⡿⠀⠄⠀⠀⠈⢿⣦⠀⠀⡆⠀⠈⠁⠀⠘⣿⡄⠀⠀⡞⠀⠀⠀⠀⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣧⡀⠀⠄⠐⠈⠀⠀⠙⢿⣦⠀⠀⠀⠀⢠⡿⠁⠀⠀⢀⠀⠀⠀⠙⠁⣿⠀⠀⣾⡷⠀⠀⣿⡧⠄⣴⠇⠀⠀⠀⣴⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⡄⠁⠤⠤⢀⠀⠀⠀⠙⣷⣆⠀⠒⠉⠀⠌⠀⠀⣸⡗⢄⠀⠀⠀⣿⠀⠀⠉⠀⢀⡼⠋⠀⣠⡿⡅⠀⠀⣼⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣀⡑⠀⠀⠀⠈⢿⣆⠀⡠⠀⠀⠀⣰⣟⠊⠉⠑⣶⡌⠁⠢⠀⠤⠐⠋⠀⣠⠔⣋⣠⣇⠀⢸⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⠟⠀⠁⠀⠈⠙⢿⣆⠀⠀⠈⡟⠊⠀⠀⠀⣴⠏⡄⡀⠀⠀⣿⡇⢀⣀⠠⠀⠀⣠⣾⠏⠁⠀⠀⠹⡄⣸⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⠟⠋⠉⠀⢤⡄⠀⠀⠀⠀⢿⣆⠀⠀⣿⠠⠒⠒⠻⠂⠐⠲⣶⡀⠀⢸⡁⠀⠀⠀⣀⣴⠟⢁⣴⠖⡀⠀⠀⡗⠉⠉⢻⣿⣿⣿");
		System.out.println("⣿⣿⣟⠁⣀⠀⠀⠀⠘⣿⠀⠀⠀⠀⢸⡿⠀⣸⡏⠀⠂⠀⢀⣄⠀⠀⢹⣧⠀⠈⣿⠅⢀⡈⠇⠀⠀⢺⡧⠔⠁⢀⣴⣷⣀⣠⣾⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⣾⠃⠀⠀⠀⠀⠀⠀⠸⠋⠀⠀⢸⣿⠀⢔⠉⠁⢹⡇⠈⠢⡀⠀⣷⡆⠒⠹⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⢀⡾⠃⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠛⢰⣷⠀⡇⠀⠿⣧⠤⣤⣬⣖⡉⠁⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⡷⠂⠠⠀⠒⢉⣀⣀⠀⠀⠀⠀⠀⠀⠐⠂⠂⠈⡆⠀⣼⣇⡀⡇⠀⣀⡀⢀⣿⣿⣿⣿⣷⣦⣄⠀⠹⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⡿⠁⢀⣠⣴⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢀⣀⠃⠀⠈⠉⢸⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣜⢿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⠏⣠⣶⣿⣿⣿⣿⣿⣿⣿⡿⣠⣶⣶⡀⠀⢀⣴⣿⡿⠀⠀⣿⣿⣅⡀⠠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣥⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⢀⣾⣿⠿⠃⠀⢀⣿⣿⣿⣷⣄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣷⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
	}
	static void naruhodo_nom() {
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣿⣷⣶⣆⣀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠨⢿⣿⣿⠿⠋⣬⡈⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠂⠀⠤⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⢻⠀⠀⠉⢁⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠊⠀⠸⢿⣾⠳⠚⠒⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠈⣦⣄⣘⠋⣀⣤⣀⡀⠀⠀⣀⣀⣤⣴⣿⣯⠻⢢⢔⡢⠔⡷⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣽⡖⢈⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣬⣵⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣇⡿⣡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣾⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⢠⣿⣿⣿⠋⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
	}	
	static void jonggeon() {
		System.out.println("\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢻⢭⣤⣲⣶⣿⣿⣿⣿⣿⣿⣿⣿⣤⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣽⣷⣿⣿⣿⣿⣿⣿⠻⣻⣙⢻⣟⣿⣭⣟⠻⠹⢿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣻⢛⣎⣾⣣⣽⣿⣿⣿⢟⣿⢿⢿⣿⣿⣄⣼⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣾⣿⡿⡿⡗⣫⣯⣿⣶⣿⣿⣿⣿⣿⠿⠋⠁⠁⠀⠀⠈⣿⣿⣿⡴⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣵⣾⣿⣿⣿⣿⣿⡿⠿⢛⠉⠁⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣺⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⣻⣿⣿⣛⣛⠛⠋⠉⠉⠀⠀⣪⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⣿⣿⡧⠙⣿⠀⠀⠀⠀⠀⠀⠀⣼⡻⠀⠀⠀⣀⣤⣿⣷⣴⠶⠶⣿⣿⣾⣿⣿⣿⠗⣀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣿⣿⣿⡟⠽⠁⠀⢻⡄⠀⠀⠀⠀⠀⢰⣿⣧⣠⣴⣾⣿⣿⣿⣿⣿⡀⠀⢘⡄⠀⠹⣿⠋⠸⡅⠉⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠛⠉⠉⠀⠀⠀⠀⠘⡇⠀⢀⣀⣠⣤⣘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⡇⠀⠀⢻⠀⢯⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠹⣰⣻⣭⣿⡟⠛⢿⡿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀⠀⠈⡇⢀⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣧⣀⣠⣷⠀⠀⠙⠻⢿⣿⡿⠿⠛⠉⠀⠀⠀⠀⡜⠁⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣿⠟⠳⣀⣠⣼⣶⡶⠀⠀⠀⠀⢀⡀⢀⠀⠀⠀⠀⢠⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⢟⠛⠉⠀⠀⠀⠙⢿⣿⣟⠀⠄⠐⠈⠀⠀⠀⠀⠀⠀⠀⠀⡈⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠀⠀⠀⠀⢀⡮⠀⠀⢀⣠⠤⠒⠈⠁⠀⠀⠀⠀⢠⠁⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⡀⠀⠀⣠⣿⣿⣶⣾⣏⠃⣀⡀⠠⠄⠂⠀⠉⢂⡀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣴⣾⠿⠿⠟⠛⠫⢿⠐⠀⢀⣀⣤⠴⠾⢛⣿⡗⠀⠀⠀⠀⣭⣐⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠋⠁⠀⠀⣀⣀⣤⣴⣶⡇⠟⠋⠁⠀⠀⢀⣾⣿⡇⠀⠀⠀⠀⢠⢽⡗⠸⣿⣿⣶⣦⡀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⡚⠉⠉⠉⠉⠉⠀⠀⠐⠵⠆⠁⠀⠂⠀⠺⢿⣿⡇⠀⠀⠀⠀⢸⡄⠃⠀⠹⣿⣿⣿⣿⣷⣤⣀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣷⣿⣤⣠⣤⣤⣤⣶⣶⣶⣶⢶⣶⣤⣤⣄⣀⣀⠉⠑⠀⠀⠀⠀⢸⠏⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣷\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣯⣿⣿⣏⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⢻⣿⡏⠀⠀⠀⡠⠂⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣾⣿⣿⣿⣿⣿⣷⣶⣶⣶⣿⣿⢿⣿⣿⣿⣿⣿⣿⣷⣾⣿⡇⠀⣠⡟⠁⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⠀⠀⢀⣠⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠻⣿⣿⣿⣿⣿⣿⣿⣧⣾⠏⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⢟⣭⣻⣷⣯⣿⠃⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⡠⢡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠑⢀⢀⠄⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣷⣷⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡋⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣾⣟⣿⣼⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣯⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "");
	}
	static void naruhodo_embarrassed() {
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⢶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡄⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣴⣿⣿⣿⣿⣯⣿⡟⢙⠋⡿⣿⡻⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⣉⣿⣿⣿⢟⣿⣿⣿⣦⣂⣬⡷⢛⢓⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠩⣿⣿⡨⣮⣾⣿⡅⠀⢀⢄⣉⡉⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣮⣿⢿⣿⡆⣼⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢹⣿⣿⣿⣇⡿⣟⡛⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡎⠘⠹⠽⣿⣯⣦⣬⡍⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣾⣿⣿⣶⣶⣶⣶⣿⣿⣷⡄⠀⠀⠀⠉⠙⢄⡣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⢰⣿⣿⣿⣷⣶⣦⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣗⠠⠌⢻⣿⡘⣿⣿⣿⣿⣿⣿⣖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠈⣿⣧⢻⣏⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⡟⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⠟⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⠏⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⡏⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀");		
	}
	static void mitsurugi_nom() {
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣴⣶⣆⣤⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⡿⠿⢿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣥⡄⣠⠜⣿⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⡇⠙⣇⣱⠁⠟⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⣽⣿⣧⡀⠹⠅⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣨⣿⣷⣽⣧⣌⡡⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⣿⣿⢱⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣿⣿⣿⣿⣿⣿⣯⢩⣿⣿⢨⠀⠜⢷⣦⣄⣀⡀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣦⢀⣼⢀⣽⣿⣿⣿⣄⢀⣲⡢⢠⣬⣤⣭⣅⡉⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⣿⣿⣧⣶⣿⣿⡿⠋⠰⠒⠊⠐⢄⠁⢄⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣤⣾⣿⣆⠈⢀⠈⠷⠺⠶⠤⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠷⠊⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠙⠛⠛⠛⠛⠛⠻⠿⠿⠿⠿⠷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
	}
	static void mitsurugi_mad() {
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣐⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⢀⣤⣴⣶⣶⣤⣤⣤⣤⣤⣤⣦⣤⣾⣿⣿⣿⣿⣷⣶⣶⣶⣶⣾⣿⡿⢿⣿⣿⣿⣿⠃⠀⠀⢹⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣳⡦⠤⣼⣿⡿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⠘⠀⢠⣄⣸⣏⠎⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣋⣐⣷⣿⣿⣷⣄⡀⠀⠀⠀");
		System.out.println("⠀⢸⣿⣿⣿⣿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⢸⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⡽⠉⢸⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⣸⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⡰⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠻⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡿⢿⣽⣧⠤⡞⡢⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⢺⣿⣿⣿⣭⣍⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣩⣿⠝⡖⢻⠛⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⣾⣿⣿⣿⡟⠀⠀⡄⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⡉⢙⠻⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀");
		System.out.println("⠀⠀⠻⠿⠟⠿⠃⢸⠂⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣏⣀⣀⡀⠀⣻⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠛⠛⠛⠛⠛⠻⠿⠿⠿⠿⠿⠿⠁⠈⢿⠤⢄⣀⡀⡀⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠛⠋⠉⠀⠀⠀");
	}
	static void wakgood_nom() {
		System.out.println("⣿⠿⠿⢿⣿⣿⣿⣿⡿⣟⠻⠿⣿⣿⣿⠻⣿⣿⣏⣡⡤⢤⡉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⡇⠁⠐⣎⣸⣿⣿⠿⢄⠈⢅⡐⣭⣿⣿⣿⣿⡏⣸⡇⠀⠀⢈⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣷⣄⢀⠿⠿⠤⠄⠶⠯⢓⢬⡽⣫⣿⣻⡛⢻⣷⣾⡇⣀⣴⡓⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⢟⠀⢏⣠⠵⡶⠽⠋⡉⡁⣗⢷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⢿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣏⢌⠔⣴⠋⡆⠀⣘⢸⣿⣿⣿⣿⡹⣿⡿⣿⣿⣶⣿⣿⣿⣿⢼⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⢸⢯⢂⢣⢸⡿⣝⢿⡗⢮⣛⢿⣮⡻⣮⣿⣿⣿⣿⣿⣿⣯⢿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⡂⠀⢀⠑⠙⠇⠀⠑⠪⠆⠈⠙⠻⠛⠛⠛⢙⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⡇⠉⠉⠙⢓⡄⠀⠀⠀⠀⡐⠛⣛⡛⡻⣆⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣷⠀⠌⠻⠫⢽⡆⠀⠀⣿⣶⠙⣾⡟⡕⡞⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⠇⠀⠀⠈⢡⠃⠀⠀⠈⠁⠂⠀⠐⠈⠀⠘⣿⣿⣿⣿⣿⡸⡼⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⠀⠀⠀⠀⠄⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⡀⠀⠀⠠⠀⠀⠀⣼⡀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠻⢧⠀⠀⠀⠀⠀⠀⣾⢿⣿⣿⢻⣟⣽⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣷⠄⢀⡀⠀⣠⣤⣸⠗⠀⠀⠀⠀⣸⡟⣸⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⠋⡄⠀⠉⣛⢋⡁⠀⠀⠀⠀⢠⣿⢁⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⠯⣼⣰⠒⠛⠛⠋⠉⠙⠂⠀⠀⣼⡏⣼⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⢻⣼⣏⡇⠀⠀⠛⠒⠂⠀⠀⠀⠀⠋⢰⣿⣿⣿⣿⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣄⢀⣀⣀⣠⣤⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣷⡞⣿⣿⡟⣿⣿⣿⣿⣿⣿⣿⣿⣞⢿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠳⡣⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠉⠻⢿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣷⣿⣿⡿⠟⠋⠀⠀⠀⠨⠚⠿⣿⣿⣿⣿⡿⠟⢋⠁⠀⠀⠀⠀⠀⠈⠙⠻⢿");
		System.out.println("⣿⣿⢿⣿⠟⢉⠀⠀⠀⠀⠀⠀⠀⠀⠡⡀⠀⠈⠉⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⣿⠏⠋⠀⠀⠀⠂⠀⠀⠀⢠⠀⠀⠀⠀⠐⠄⠀⠀⠀⡐⠀⠀⠀⠀⠀⠀       ");
		System.out.println("⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠀⠀⠀⠀⠀⠀⠂⢀⠈⠀⠀⠀⠀⠀         ");
	}
	static void wakgood_real() {
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠄⢀⠀⠀⣀⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⡆⠒⢮⣐⣄⣦⠤⢌⠊⢬⡀⢅⣾⣿⣿⣿⣾⢸⡏⠀⠀⠈⣞");
		System.out.println("⠀⠀⠀⠀⢀⡸⢿⠯⠭⠤⠮⢅⢬⣹⢞⣻⣿⡶⠻⣷⣾⣿⢀⣠⣮⠂⠀⠀");
		System.out.println("⠀⠀⠀⠀⡀⡘⢂⣤⣵⢮⠄⢉⢧⣯⣶⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀");
		System.out.println("⠀⠀⠀⠀⠐⡘⣱⡖⣵⠀⢠⠁⣿⣿⣿⣿⣽⣿⣿⢿⣿⣷⣯⣿⣿⣿⡃⠀⠀");
		System.out.println("⠀⠀⠀⠀⠈⢀⢿⠤⠱⡰⣟⢗⠿⣯⠪⣙⢿⣦⣙⢷⣝⣷⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠈⠀⣠⣴⡹⠿⠀⠑⠪⠧⠈⠙⠛⠝⠛⠛⠋⣿⣿⣿⣿⣿⠄⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢉⣥⠘⢿⣦⣄⠤⣀⢀⣀⣠⣴⠶⠶⢿⣾⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⡜⠄⣝⡃⣼⣗⠉⠑⢻⡿⡿⠽⠿⢮⣾⣿⣿⣿⣿⣿⣟⣿⣯⡀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠃⠀⠁⠀⠉⠏⠀⢰⠉⠉⠒⠀⠀⠊⠁⠨⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⠁⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⢀⣼⣇⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠀⠀⠮⠋⠉⠑⡆⠄⣀⠀⣠⣽⣿⣿⣿⡟⠿⠋⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⠰⣀⠀⢀⣴⣶⡿⠃⠀⣴⣾⣿⣿⣿⣿⣿⡇⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⢂⠀⢈⣙⣻⠥⠤⠐⠊⡼⠘⠙⣿⣾⣿⣿⣧⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⠂⠊⡜⠉⠙⠻⠯⠉⠉⠉⠀⠔⠀⣻⣿⣿⣿⣿⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⢀⡆⢠⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⢀⣸⣿⣿⣿⣿⣿⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠈⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⢀⣤⣤⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⢙⣿⣿⢻⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠌⠀⠀⠀⠀⠀⠀⠀⢜⠽⣿⣗⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠀⡠⠂⠀⠀⠀⠀⠀⠀⠀⠀⠈⠍⠛⠿⣿⣿⣟⠿⠟⢋⠂⠀⠀⠀");
		System.out.println("⠀⠀⠀⠀⠐⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠈⢄⠀⠀⠀⠀⠀⠠⠂⠀⠀⠀⠀⠀⠀⠀⠀");
	}
	static void judge_nom() {
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠂⠀⠀⠁⠐⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣭⣤⣤⣀⣤⣤⣬⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠛⣹⣀⣟⠛⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⠞⢉⣙⣿⣋⠉⠓⢶⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⠣⣶⣿⣽⠶⣯⣿⣶⢮⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀⠈⠀⠀⠀⠉⢀⠁⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⢹⡶⠇⠀⠀⠀⡆⠀⠸⠀⠸⡀⣉⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⢀⣠⣤⣶⣾⣿⣿⣷⡸⡄⢧⠀⠁⠀⣰⡄⢇⣽⣿⣿⣷⣶⣤⣀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡌⣦⣇⡴⣫⣶⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⠀⠀\n"
				+ "⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀\n"
				+ "⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀\n"
				+ "⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀\n"
				+ "⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆\n"
				+ "⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇\n"
				+ "");
	}
	static void non_guilty() {
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⢰⣿⣿⠳⣬⣑⠲⣽⠀⢸⣿⡇⠀⢀⠇⡄⣰⠃⢸⠀⣇⢠⠃⣿⠈⢆⢰⡃⢸⠀⣧⠀⢳⠸⠀⠘⣿⣷⠀⢩⠵⢒⢩⡖⢿⣿⡇⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠈⠀⠀⢀⠀⠀⠸⠿⠿⠒⠮⠒⠪⠧⠀⠿⠿⠇⠀⠸⡼⡔⡻⣿⠿⣿⠾⠈⢦⣿⡠⠋⠿⣾⠿⣿⠾⢎⠎⡇⠀⠀⠿⠿⠄⠸⠵⠒⠻⠖⠻⠿⠷⠰⠀⢀⠀⠀⢀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣘⣉⣂⣀⣀⣀⣀⡤⠤⣀⣀⣀⣀⣀⣰⣇⠀⢷⡜⢦⡢⣭⣥⣴⣒⣋⣉⣙⣓⣶⣤⣭⠥⣪⢊⣾⠁⢰⣇⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣻⠧⠤⢤⡈⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⠀⢉⣉⣤⣤⣤⣤⠀⠀⢩⣷⣿⡿⣿⣿⡄⠈⢿⣶⣝⡲⢭⠖⠈⠁⠀⠀⠉⠒⡮⠕⣪⣴⣿⠃⠀⣿⣿⡿⡿⠟⠛⠛⠋⠉⠉⠹⣿⣿⣶⢿⠀⠀⣸⡇⠀⠀⠀⠀⠀⠀\n"
				+ "⣀⣀⣀⠀⠀⠀⠀⠀⢸⠀⠀⠘⣿⠛⢉⣉⣿⠀⠀⣾⡟⠀⢸⣿⡿⠀⠀⠀⠙⢿⣿⡏⡀⠠⠤⠤⠄⠤⠀⡘⣿⡿⠟⠁⠀⠀⠻⣿⡇⠹⠿⠿⡿⠁⠀⢀⣴⣿⣇⣉⣸⠀⠀⣿⡇⠀⠀⠀⣀⣀⣀\n"
				+ "⠛⠛⠛⠛⠛⠛⠛⠛⠛⡇⠀⣀⣉⣉⣉⣀⣀⣠⣴⣿⠃⠀⠸⡛⠁⠀⠀⠀⠀⠀⠈⡇⡶⠦⣄⠂⢂⡴⠔⡂⡏⠀⠀⠀⠀⠀⠀⢙⡗⠀⢀⠞⠀⠀⣠⡀⠀⠀⠀⣸⣿⠀⠀⣿⡟⠛⠛⠛⠛⠛⠛\n"
				+ "⠄⠀⠀⠀⠀⣀⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠛⠛⠛⠒⠢⢤⣧⣤⣤⣤⣤⣤⣤⣲⡇⠘⠉⠈⠆⢀⠈⠙⠀⣏⣦⣤⣤⣤⣤⣤⣴⡤⠖⠉⣀⣠⠈⠉⢻⣶⣶⣶⣿⣿⠀⠀⣿⡿⢁⠀⠀⠀⠀⠠\n"
				+ "⠀⠀⠀⠀⣰⠳⣀⣀⣠⣤⣤⣤⣤⠀⠀⢰⣶⣶⣶⣶⣶⣤⣾⣿⣿⣿⣿⣿⣿⣿⣖⣇⡠⠐⠊⣑⠉⠂⠄⣸⣡⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣟⣛⡆⠀⡼⠿⠿⠿⠛⢻⠀⠀⣿⡇⠘⣗⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠋⠀⠙⠛⠛⠉⠉⠉⢹⠀⠀⢸⣿⡒⣿⠏⣿⢨⣿⣿⡿⠿⠿⠿⠿⣿⡏⠊⣀⡔⠋⣁⡉⠓⣄⡀⠙⢿⠿⠿⠿⠿⢿⣯⠉⠉⠉⠉⢁⣀⣠⣤⣴⣶⣾⠿⣿⠀⢀⣿⡇⠀⠹⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⢸⠋⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⣸⣿⢮⡶⢵⣿⢸⢿⣿⣧⣿⣿⣿⣿⠃⠀⠂⠈⠁⠊⠀⠉⠛⠉⠀⠀⢠⣿⣿⣿⣿⡏⣿⣧⣴⣶⣿⠿⡿⠛⢿⡯⢽⣿⠀⡇⢀⣾⡟⠀⠀⠈⣇⠀⠀⠀\n"
				+ "⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⣿⣠⣾⡿⠋⠺⣭⡻⣿⢸⢸⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣗⣿⣷⣯⢸⡟⣭⡿⠂⠺⣯⡟⣿⡄⣧⣾⡟⠀⠀⠀⠀⢹⠀⠀⠀\n"
				+ "⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⣠⣿⡿⠿⣌⣶⡦⠮⣴⣯⣼⣾⣿⣿⣿⣿⣿⣿⣷⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⣧⠵⢴⣱⣵⠴⠥⣿⡇⠈⠉⠀⠀⠀⠀⠀⠸⡆⠀⠀\n"
				+ "⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⢀⢸⡏⣿⡋⢱⣐⢉⣻⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⡄⠑⠀⠀⠀⠊⣰⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⡉⠳⣚⢙⣿⡾⣇⡆⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀\n"
				+ "⠀⠀⡼⠉⠈⠉⠉⠉⠉⠉⠘⣼⣷⠭⠿⢷⡞⠿⠯⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣠⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠭⠿⣗⡞⡿⠯⢾⣿⠈⠈⠉⠉⠉⠉⠉⠈⢹⠀⠀\n"
				+ "⣷⣦⣧⣀⠀⠀⠀⠀⠀⠀⠀⣿⡇⢿⣆⡁⢈⣴⡿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠸⣧⣉⠈⣡⣾⢨⣿⡰⠀⠀⠀⠀⠀⠀⣀⣼⣶⣶\n"
				+ "⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⢧⣿⡿⣑⣆⠁⢀⢖⡈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⡲⡎⠀⢱⢒⣹⣿⡇⠀⠀⠀⠀⠀⠈⠻⣿⣿⢿\n"
				+ "⣿⣿⡏⠀⠀⠀⠀⠀⠀⢀⢸⣿⠳⣌⢝⠿⡳⢥⢶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠲⢌⢝⠿⡳⢅⠖⣿⣇⠇⠀⠀⠀⠀⠀⠀⠙⣿⣽\n"
				+ "⣿⣇⠀⠀⠀⠀⠀⠀⠀⢸⣸⣿⣰⣮⣁⣤⣈⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⣮⣅⣀⣈⣡⣾⣸⣿⣀⠀⠀⠀⠀⠀⠀⠀⢸⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣛⣛⣛⣛⣁⣀⣀⣀⣈⣙⣛⣛⣛⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "");
	}
	static void guilty() {
		System.out.println("\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⣀⣼⣿⡷⣿⡿⢾⣃⣰⣿⠃⠀⢠⠆⢠⡀⡇⡰⢀⠂⠀⠐⡀⢆⢸⢀⡄⠰⡄⠀⠘⣿⣆⣘⡷⢿⣿⢾⣿⣧⣀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢆⠀⠀⠀⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⢠⠀⣧⢊⢜⠫⠋⠟⠁⣑⣤⣊⠈⠻⠙⠝⡣⡑⣼⠀⡄⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠀⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡾⠋⢤⣀⠤⠤⣤⣤⣤⣤⣤⣤⠤⣤⣤⣿⣧⠸⣧⡑⢕⠆⡚⠒⠲⠶⠶⢒⢓⠰⡪⢊⣼⠇⣼⣿⣤⣤⠤⣤⣤⣤⣤⣤⢀⣠⣤⣤⣴⣶⡀⠀⠀⢸⣿⡇⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⣴⣿⡏⠀⠀⢀⣙⣷⠝⠛⠉⠉⠉⠉⠙⠛⠛⢹⣿⣿⣀⣿⣿⣷⣬⠌⠀⠀⡀⡀⠀⡑⣥⣾⣿⣿⣀⣿⣿⡏⠛⠛⠋⠉⠉⠉⠉⠃⠀⢀⣾⣿⣟⣁⣀⡀⢸⣿⡇⠀⠀⠀⠀⠀\n"
				+ "⠿⠿⠿⠿⠿⠿⠧⠻⠿⠿⠿⠿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣛⣛⣛⣛⣛⡛⢛⠨⢤⣀⢄⢀⣤⠄⡟⢛⣛⣛⣛⣛⣛⡇⠀⠀⠀⠀⠀⠀⠀⢀⣠⣿⣟⣉⠻⠿⠿⠁⢸⣿⡇⠸⠿⠿⠿⠿\n"
				+ "⠿⠿⠿⠿⠜⡯⠴⠶⣶⣶⠶⠒⢻⣿⠛⠛⠛⠇⢀⣤⣤⣤⣤⣤⣤⣧⣤⣤⣤⣤⣔⣼⠀⠉⠑⠇⠚⠉⠃⣏⣤⣤⣤⣤⣤⣼⣤⣤⣤⣤⣤⣤⣤⣤⡋⢉⣀⢸⣿⠀⠆⣀⣀⢸⣿⡇⠸⠿⠿⠿⠿\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⢸⣿⠀⠘⢩⣤⣬⠭⢭⣭⣭⡍⣟⣿⣿⣿⣿⣿⣿⡽⡀⠂⣈⣭⣁⠐⢤⣵⣿⣿⣿⣿⣿⣿⣻⢩⣭⣭⡭⠭⣭⢿⣿⣷⡶⠾⠟⠛⠉⢉⠀⢸⡿⠃⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢀⡿⠃⠀⠀⡿⠋⠀⠀⣿⣭⢁⡮⣂⢩⢼⠀⣿⣿⢻⣿⣿⣿⡿⠉⠠⠎⡀⠒⠆⠱⠇⠈⢻⣿⣿⣿⡟⣿⣿⠀⡧⡍⣐⢵⡈⣬⣁⠀⠀⠀⠀⠀⠀⠨⠀⢸⠃⠀⠀⠀⠀⠀⠀\n"
				+ "⠒⠒⠒⠒⠒⠒⠀⠈⢀⠐⠒⠒⠀⠐⠒⠂⣿⣳⡾⠒⢾⣖⣿⢰⢹⣿⢸⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⣿⡏⡆⣿⣲⡷⠒⢷⣞⣿⠐⠒⠒⠒⠒⠒⠒⡄⠀⠀⠒⠒⠒⠒⠒⠒\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⢸⡿⣍⣰⢿⣆⡩⣿⣸⣼⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⣀⣼⣿⣿⣿⣿⣿⣧⣇⣿⢍⣰⡿⣆⣩⢿⡇⠀⠀⠀⠀⠀⠀⠇⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⣀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⢸⡹⣯⣤⢨⣬⡿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣷⣧⢀⠀⡀⣠⣠⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⢿⣥⡅⣤⣽⢏⡇⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⣀\n"
				+ "⣿⣶⣦⣄⣀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⣿⢫⣁⠛⠫⣉⡝⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢫⣉⠝⠻⣈⡝⣿⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⣀⣠⣴⣾⣿\n"
				+ "⣿⣿⣛⡻⠿⢿⣷⣦⣤⡀⠀⠀⠀⠀⠀⣿⠮⣭⠂⢪⡭⢼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⢭⡕⠐⣭⠵⣿⠀⠀⠀⠀⠀⢀⣤⣴⣾⡿⠿⢟⣛⣿⣿\n"
				+ "⣿⣿⣯⣽⣛⣲⠶⡭⠁⠀⠀⠀⠀⠀⢸⡯⣜⡺⣲⢎⣪⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⣕⡱⣖⢗⣣⢽⡇⠀⠀⠀⠀⠀⠈⢭⠶⣖⣛⣯⣽⣿⣿\n"
				+ "⣿⡏⠀⠉⠉⠙⠛⠇⠀⠀⠀⠀⠀⠀⢸⣇⣒⠈⠠⢁⣒⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣖⡈⠄⠁⣒⣸⡇⠀⠀⠀⠀⠀⠀⠸⠛⠋⠉⠉⠀⢹⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣀⣀⣀⣀⣀⣀⣀⣀⣀⣨⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
				+ "");
	}

	
	public static void bgm(String[] args) {
        String filename = "/Users/cheonsiyeong/Downloads/bam_yj.wav"; // fill in file name here

        int EXTERNAL_BUFFER_SIZE = 524288;

        File soundFile = new File(filename);

        if (!soundFile.exists()) {
            System.err.println("Wave file not found: " + filename);
            return;
        }

        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        AudioFormat format = audioInputStream.getFormat();

        SourceDataLine auline = null;

        // Describe a desired line
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);

            // Opens the line with the specified format,
            // causing the line to acquire any required
            // system resources and become operational.
            auline.open(format);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Allows a line to engage in data I/O
        auline.start();

        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    // Writes audio data to the mixer via this source data line
                    // NOTE : A mixer is an audio device with one or more lines
                    auline.write(abData, 0, nBytesRead);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            // Drains queued data from the line
            // by continuing data I/O until the
            // data line's internal buffer has been emptied
            auline.drain();

            // Closes the line, indicating that any system
            // resources in use by the line can be released
            auline.close();
        }
    }
	public static void objection_sound(String[] args) {
        String filename = "/Users/cheonsiyeong/Downloads/objection.wav"; // fill in file name here

        int EXTERNAL_BUFFER_SIZE = 524288;

        File soundFile = new File(filename);

        if (!soundFile.exists()) {
            System.err.println("Wave file not found: " + filename);
            return;
        }

        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        AudioFormat format = audioInputStream.getFormat();

        SourceDataLine auline = null;

        // Describe a desired line
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);

            // Opens the line with the specified format,
            // causing the line to acquire any required
            // system resources and become operational.
            auline.open(format);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Allows a line to engage in data I/O
        auline.start();

        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    // Writes audio data to the mixer via this source data line
                    // NOTE : A mixer is an audio device with one or more lines
                    auline.write(abData, 0, nBytesRead);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            // Drains queued data from the line
            // by continuing data I/O until the
            // data line's internal buffer has been emptied
            auline.drain();

            // Closes the line, indicating that any system
            // resources in use by the line can be released
            auline.close();
        }
    }
    public static void appearance(String[] args) {

        String filename = "/Users/cheonsiyeong/Downloads/appearance.wav"; // fill in file name here

        int EXTERNAL_BUFFER_SIZE = 524288;

        File soundFile = new File(filename);

        if (!soundFile.exists()) {
            System.err.println("Wave file not found: " + filename);
            return;
        }

        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        AudioFormat format = audioInputStream.getFormat();

        SourceDataLine auline = null;

        // Describe a desired line
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);

            // Opens the line with the specified format,
            // causing the line to acquire any required
            // system resources and become operational.
            auline.open(format);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Allows a line to engage in data I/O
        auline.start();

        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    // Writes audio data to the mixer via this source data line
                    // NOTE : A mixer is an audio device with one or more lines
                    auline.write(abData, 0, nBytesRead);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        } finally {
            // Drains queued data from the line
            // by continuing data I/O until the
            // data line's internal buffer has been emptied
            auline.drain();

            // Closes the line, indicating that any system
            // resources in use by the line can be released
            auline.close();
        }
    }
}