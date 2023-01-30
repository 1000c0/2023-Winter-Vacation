import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class judgement_game {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String ans = "0";
		int win = 0;
		int count = 0;
		jonggeon();
		System.out.println("반갑다. 이번에 재판을 받게 됬다. 무죄를 받아 오도록.");
		Thread.sleep(2000);
		System.out.println("1 : 아잇 물론이죠!");
		System.out.println("2 : 허허 그건 장담 할 수 없죠");
		ans = sc.next();
		if (ans.equals("1")) {
			click(args);
			System.out.println("나루호도 : 아잇 물론이죠! " + "걱정 마십시오!!");
			System.out.println("피고 : 당연한 것");
		} else if (ans.equals("2")) {
			click(args);
			System.out.println("나루호도 : 허허 그건 장담할 수 없죠 ");
			Thread.sleep(2000);
			System.out.println("피고 : ...");
		}

		// 결정적인 증거 확보
		Thread.sleep(2000);
		System.out.println("조수 : 마지막으로 한번 더 현장을 조사하러 가시겠습니까?");
		Thread.sleep(1800);
		System.out.println("1 : 혹시 모르니 가봅시다.");
		System.out.println("2 : 그럴 필요 없네!");
		Thread.sleep(2000);
		ans = sc.next();
		if (ans.equals("1")) {
			count = 1;
			click(args);
			System.out.println("나루호도 : 지금 바로 가봅시다.");
			Thread.sleep(2000);
			System.out.println("현장에서 떨어져 있는 맥도날드 결제 영수증을 주웠다.");
			Thread.sleep(2000);
			System.out.println("왠지 중요하게 쓰일 것 같다.");
		} else {
			click(args);
			System.out.println("나루호도 : 그럴 필요 없네! 바로 재판장으로 가자고");
			Thread.sleep(2000);
			System.out.println("조수 : 이번 재판도 말아 먹겠구만");
		}

		// 재판 시작
		Thread.sleep(2000);
		judge_nom();
		System.out.println("재판장 : 지금부터 재판을 시작하겠습니다. 모두 주의를 집중해 주십시오.");
		Thread.sleep(1000);
		System.out.println("재판장 : 피고인인 '종건'은 피해자를 숨지게 한 혐의가 있오.");
		Thread.sleep(1000);
		System.out.println("재판장 : 그러면 피고의 말부터 듣도록 하겠다.");
		Thread.sleep(2000);

		jonggeon();
		System.out.println("피고 : 나는 당일 '종건급'이라며 피해자가 시비를 걸어서 겁만 주고 쫓아냈다.");
		Thread.sleep(1000);
		System.out.println("피고 : 그 녀석의 몸에는 피한방울도 내지 않았지.");

		Thread.sleep(2000);
		objection();
		objection_sound(args);
		mitsurugi_nom();
		System.out.println("웃기지 마라 피해자의 몸에서 네놈의 지문이 나왔다.");

		// 첫번쨰 증거 제출
		Thread.sleep(2000);
		objection();
		objection_sound(args);
		naruhodo_nom();
		System.out.println("무슨 증거를 사용해야 할까?");
		Thread.sleep(1000);
		System.out.println("1 : cctv 녹화본    2 : 검정고무신    3 : 피고의 핸드폰 사용 기록    4 : 스타벅스 커피 컵과 캐리어");
		ans = sc.next();

		if (ans.equals("1")) {
			click(args);
			System.out.println("여기 cctv 녹화본입니다. 피고는 멱살이 잡혀 이를 풀려고 한 것일 뿐 그 어떤 공격을 하지 않았습니다.");
			win++;
			mitsurugi_mad();
			Thread.sleep(2000);
			System.out.println("검사 : 크윽 그건 그렇군...");
			Thread.sleep(1000);
			System.out.println("하지만 실랑이가 끝나고 피고가 피해자를 따라가는 모습 또한 찍히지 않았나!?");
		} else if (ans.equals("2") || ans.equals("3") || ans.equals("4")) {
			click(args);
			win--;
			mitsurugi_nom();
			Thread.sleep(1000);
			System.out.println("검사 : 하하하 띨빵한 녀석 그걸 증거라고 제출하는 거냐");
		}

		// 증인 등장
		Thread.sleep(2000);
		judge_nom();
		System.out.println("재판장 : 정숙하시오.");
		Thread.sleep(1000);
		System.out.println("재판장 : 그러면 증인의 증언을 들어보겠오.");

		Thread.sleep(2000);
		wakgood_nom();
		appearance(args);
		System.out.println("증인 : 저는 우연히 사건 당시에 주변에서 '저녁'을 먹고 있었던 '우왕굳'입니다.");
		Thread.sleep(1000);
		System.out.println("증인 : 피고가 피해자에게 주먹을 휘두르는 것을 분명히 목격했습니다.");

		Thread.sleep(2000);
		objection();
		objection_sound(args);
		jonggeon();
		System.out.println("피고 : 어이 말 똑바로 해라.");

		Thread.sleep(2000);
		objection();
		objection_sound(args);
		mitsurugi_nom();
		System.out.println("검사 : 이거 보시오. 진실을 말하니 분노하는 거요.");

		Thread.sleep(2000);
		judge_nom();
		System.out.println("제판장 : 정숙하시오");
		Thread.sleep(1000);
		System.out.println("재판장 : 그럼 증인에게 질문하시오.");

		Thread.sleep(2000);
		System.out.println("무슨 질문을 할까?");
		Thread.sleep(1000);
		System.out.println("1 : 증인은 삼엽충입니까? 앱등이 입니까?\n2 : 스타벅스 좋아하십니까?");

		ans = sc.next();
		if (ans.equals("1")) {
			click(args);
			win--;
			System.out.println("증인 : 저는 삽엽충이지만, 재판과는 관련이 없는 질문 같군요.");
			Thread.sleep(2000);
			naruhodo_embarrassed();
			System.out.println("크윽..");
		} else if (ans.equals("2")) {
			click(args);
			win++;
			System.out.println("증인 : 좋아하지만, 재판과는 관련이 없는 질문 같군요.");
			Thread.sleep(2000);
			objection();
			objection_sound(args);
			naruhodo_nom();
			System.out.println("나루호도 : 아니요! 관련이 없지 않습니다. 현장에서 증인의 이름이 있는 스타벅스 캐리어가 나왔거든요!");
			Thread.sleep(2000);
			System.out.println("나루호도 : 증인이 피해자를 살해하고 그 죄를 피고에게 뒤집어 씌우려는 것 아닙니까?");
			objection();
			objection_sound(args);
			mitsurugi_nom();
			System.out.println("검사 : 웃기지 마라! 그런 증거는 현장에 없었어!!");
			objection();
			objection_sound(args);
			System.out.println("나루호도 : 아니요 분명히 있었어요. 쓰레기통 뚜껑에 붙어있어서 찾기 쉽지 않았을 겁니다.");
			mitsurugi_mad();
			System.out.println("재판장 : 오 그럴수도 있겠군요, 일단 감안하겠습니다.");
		} else {
			click(args);
			win--;
			System.out.println("나루호도 : 어.....음......어/...");
			Thread.sleep(1000);
			System.out.println("검사 : 말도 잘 못하는 녀석이 있군");
		}
		Thread.sleep(2000);
		System.out.println("나루호도 : 다음 질문입니다.");
		System.out.println("1 : 당신은 bmw를 좋아하십니까?\n2 : 저녁으로는 무엇을 드셨습니까?");
		ans = sc.next();
		if (ans.equals("1")) {
			click(args);
			win--;
			wakgood_nom();
			System.out.println("증인 : 3시리즈 페리도트 그린을 좋아합니다.");
			Thread.sleep(2000);
			System.out.println("재판장 : 어.....음......어/... 그렇다는 군요");
		} else if (ans.equals("2")) {
			click(args);
			win++;
			wakgood_nom();
			System.out.println("증인 : 버거킹에서 빅맥을 먹었습니다.");
			Thread.sleep(2000);
			objection();
			objection_sound(args);
			naruhodo_nom();
			System.out.println("나루호도 : 아니요. 빅맥은 맥도날드에서 파는 것 아닌가요!?");
			Thread.sleep(2000);
			wakgood_nom();
			System.out.println("증인 : 실언했군요, 정정하겠습니다.");
			Thread.sleep(2000);
			objection();
			objection_sound(args);
			naruhodo_nom();
			System.out.println("나루호도 : 아니요 당신은 실언한게 아닙니다. 당신은 버거킹에서 와퍼를 먹었지만, 거짓말을 한겁니다.");
			Thread.sleep(2000);
			objection();
			objection_sound(args);
			mitsurugi_nom();
			System.out.println("검사 : 햄버거 잘못 말한거 가지고 소설을 쓰는 군.");
			Thread.sleep(2000);

			if (count == 1) {
				win++;
				objection();
				objection_sound(args);
				naruhodo_nom();
				System.out.println("나루호도 : 여기 사건 당일 버거킹의 와퍼 영수증입니다. 버거킹 바로 옆 건물에서 사건이 발생했지요.");
				Thread.sleep(2000);
				System.out.println("나루호도 : 분명히 결제인에 증인의 이름이 쓰여있습니다. 그리고 시간도 매우 상이하군요.");
				Thread.sleep(2000);
				System.out.println("나루호도 : 모든 정황이 증인이 범인이라고 하고 있습니다.");
				Thread.sleep(2000);
				wakgood_real();
				System.out.println("증인 : 크윽.... 웃기지 마라");
			}
		}
		sc.close();
		judge_nom();
		System.out.println("자 그러면 판결을 내리겠습니다.");
		Thread.sleep(2500);
		System.out.println(".");
		Thread.sleep(2500);
		System.out.println(".");
		Thread.sleep(2500);
		System.out.println(".");
		Thread.sleep(2500);

		if (win > 3) {
			non_guilty();
			winning(args);
		} else {
			guilty();
			defeat(args);
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
		System.out.println("\n" + "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
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
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣾⣟⣿⣼⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣯⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + "");
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
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠂⠀⠀⠁⠐⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣭⣤⣤⣀⣤⣤⣬⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠛⣹⣀⣟⠛⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⠞⢉⣙⣿⣋⠉⠓⢶⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⠣⣶⣿⣽⠶⣯⣿⣶⢮⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀⠈⠀⠀⠀⠉⢀⠁⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⢹⡶⠇⠀⠀⠀⡆⠀⠸⠀⠸⡀⣉⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + "⠀⠀⠀⠀⢀⣠⣤⣶⣾⣿⣿⣷⡸⡄⢧⠀⠁⠀⣰⡄⢇⣽⣿⣿⣷⣶⣤⣀⠀⠀⠀⠀⠀\n"
				+ "⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡌⣦⣇⡴⣫⣶⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⠀⠀\n" + "⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀\n"
				+ "⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀\n" + "⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀\n"
				+ "⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆\n" + "⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇\n" + "");
	}

	static void non_guilty() {
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⢰⣿⣿⠳⣬⣑⠲⣽⠀⢸⣿⡇⠀⢀⠇⡄⣰⠃⢸⠀⣇⢠⠃⣿⠈⢆⢰⡃⢸⠀⣧⠀⢳⠸⠀⠘⣿⣷⠀⢩⠵⢒⢩⡖⢿⣿⡇⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀\n"
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
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + "");
	}

	static void guilty() {
		System.out.println("\n" + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⣀⣼⣿⡷⣿⡿⢾⣃⣰⣿⠃⠀⢠⠆⢠⡀⡇⡰⢀⠂⠀⠐⡀⢆⢸⢀⡄⠰⡄⠀⠘⣿⣆⣘⡷⢿⣿⢾⣿⣧⣀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n"
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
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" + "");
	}

	public static void bgm(String[] args) {
		String filename = "/Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/bgm_yj.wav"; // fill in file name here

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
		String filename = "/Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/Objection.wav"; // fill in file name here

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

		String filename = "//Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/appearance.wav"; // fill in file name here

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
	public static void click(String[] args) {

		String filename = "/Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/click.wav"; // fill in file name here

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
	public static void winning(String[] args) {

		String filename = "/Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/winning.wav"; // fill in file name here

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
	public static void defeat(String[] args) {

		String filename = "/Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/defeat.wav"; // fill in file name here

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
	public static void ch_change(String[] args) {

		String filename = "/Users/cheonsiyeong/Documents/PKNU/C.S'/2023-Winter-Vacation/java/Project/audio files/ch_change.wav"; // fill in file name here

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