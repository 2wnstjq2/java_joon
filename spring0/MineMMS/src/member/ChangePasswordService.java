package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class ChangePasswordService {

	private MemberDao memberDao;

	public ChangePasswordService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(
			String email, 
			String oldPwd, 
			String newPwd) throws MemberNotfoundException {
		Member member = memberDao.selectByEmail(email);
		if (member == null) {
			throw new MemberNotfoundException();
			}
		member.changePassword(oldPwd, newPwd);
		memberDao.update(member);

	}

}
