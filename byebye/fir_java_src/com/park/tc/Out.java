package com.park.tc;

import com.park.tc.State;
import java.util.Scanner;
import java.util.Date;

public class Out {
	public Out() {
	}

	void out(State state, Scanner s) {
		int num = 0;

		System.out.println("==============================================\n ���� �ߴ� ���� ��ȣ�� ���ÿ�.");
		num = s.nextInt();

		try {
			if (state.box[num].getNum() == " �� ") {
				Date date = new Date();
				state.box[num].setOut(date.toString());
				state.box[num].outtime = System.currentTimeMillis();

				state.clear();
				state.clear();
				System.out.println(" (" + num + ")�� ������ ������ �����Ǿ����ϴ�.");

				state.charge_inform(num);
				state.init(num);
			} else {
				System.out.println("�̹� ������ �Ǿ��ְų�, �߸��� ��ȣ�� �����̽��ϴ�.");
			}
		} catch (Exception e) {

		}
		state.print_state();
	}
}