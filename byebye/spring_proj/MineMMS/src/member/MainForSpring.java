package member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForSpring {

	// 조립기생성 : 객체들을 보관
	// Spring Container

	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		
		ctx = new GenericXmlApplicationContext("classpath:appCtx1.xml");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			
			System.out.println("명령어를 입력해주세요.");
			
			String command = reader.readLine();

			if (command.equalsIgnoreCase("exit")) {
				System.out.println("종료합니다.");
				break;
			}

			if (command.startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			}

			else if (command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}
			printHelp();
		}

	}

	private static void processNewCommand(String[] arg) {

		if (arg.length != 5) {
			printHelp();
			return;
		}

		MemberRegisterService regSvc = 
				ctx.getBean("memberRegSvc", MemberRegisterService.class);
		
		RegisterRequest request = new RegisterRequest();
		request.setEmail(arg[1]);
		request.setName(arg[2]);
		request.setPassword(arg[3]);
		request.setConfirmPassword(arg[4]);
		if (!request.isPasswordEqualToConfirmPassword()) {
			System.out.println("암호 확인이 일치하지 않습니다.");
			return;
		}

		try {
			regSvc.regist(request);
			System.out.println("등록되었습니다.");
		} catch (AleadyExistingMemberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("이미 존재하는 이메일입니다.");
		}

	}

	private static void processChangeCommand(String[] args) {

		if (args.length != 4) {
			printHelp();
			return;
		}

		// ChangePasswordService service = assembler.getPwService();
		ChangePasswordService service = ctx.getBean("changePwdSvc", ChangePasswordService.class);

		try {
			service.changePassword(args[1], args[2], args[3]);
			System.out.println("암호가 변경되었습니다.");
		} catch (MemberNotfoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("존재하지 않는 이메일 입니다.");
		} catch (IdPasswordNotMatchingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("이메일과 암호가 일치하지 않습니다.");
		}

	}

	private static void printHelp() {
		System.out.println("");
		System.out.println("잘못된 명령 입니다. 아래 명령 사용법을 확인하세요.");
		System.out.println("명령어 사용법:"); 
		System.out.println("new 이메일 사용자이름 암호 암호확인");
		System.out.println("change 이메일 현재암호 새로운암호");

	}

}
