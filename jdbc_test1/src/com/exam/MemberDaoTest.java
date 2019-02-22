package com.exam;

import java.util.List;

import com.exam.dao.MemberDao;
import com.exam.vo.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		// ������ ȣ�� �� ���̺� ������ ����
		MemberDao memberDao = new MemberDao(); 
		
		// member ���̺� ���� ��� ����
		memberDao.deleteAll();
		
		
		
		// ù���� ���� ������ �غ�
		Member member1 = new Member();
		member1.setId(1); 			// ����� �Է°�
		member1.setName("ȫ�浿");	// ����� �Է°�
		// �ι��� ���� ������ �غ�
		Member member2 = new Member(2, "�ں���");
		// ����° ���� ������ �غ�
		Member member3 = new Member(3, "������");
		
		// ���ڵ� 2�� �߰�
		memberDao.insert(member1);
		memberDao.insert(member2);
		memberDao.insert(member3);
		
		// member ���̺� ��ü ���� Ȯ��
		List<Member> list = memberDao.getMembers();
		for (Member m : list) {
			System.out.println(m); // m.toString() �ڵ� �����
		}
		System.out.println("==========================");
		
		
		// id�� 1�� member�� name�� "����"���� ���� 
		Member updateMember = new Member(1, "����");
		memberDao.updateById(updateMember);
		
		System.out.println("���α׷� ���� ����");
		
	}

}
