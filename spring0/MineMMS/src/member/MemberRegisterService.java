package member;
/*mine*/

import java.util.Date;

public class MemberRegisterService {

	/*
	 * // 의존관계!!  의존 객체를 직접 생성 
	 * private MemberDao memberDao = new MemberDao();
	 */
	
	private MemberDao memberDao;

	// 의존 관계를 생성자를 통해 주입한다. 
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new AleadyExistingMemberException( /* "dup email " + req.getEmail() */ );
		}
		Member newMember = new Member(
				req.getEmail(), req.getPassword(), req.getName(), 
				new Date());
		memberDao.insert(newMember);
	}
}
