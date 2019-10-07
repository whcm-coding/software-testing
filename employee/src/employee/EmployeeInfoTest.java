package employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeInfoTest {
	@Test
	void test1() {
		EmployeeInfo info = new EmployeeInfo("С", "123244533563332X",
				 "",18,"w");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ɹ�"));
	}
	@Test
	void test2() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "123432345432345",
				 "",80,"��");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ɹ�"));
	}
	@Test
	void test3() {
		EmployeeInfo info = new EmployeeInfo("С", "14232445335633322X",
				 "",18,"@");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ɹ�"));
	}
	@Test
	void test4() {
		EmployeeInfo info = new EmployeeInfo("С", "341232445335633324",
				 "",80,"=");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ɹ�"));
	}
	@Test
	void test5() {
		EmployeeInfo info = new EmployeeInfo("", "12343212345432X",
				 "",18,"/");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test6() {
		EmployeeInfo info = new EmployeeInfo("e", "123244533563332X",
				 "",18,"<");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test7() {
		EmployeeInfo info = new EmployeeInfo("@@@@^w", "123244533563332X",
				 "",18,"'");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test8() {
		EmployeeInfo info = new EmployeeInfo("С", "R78290273^yweixX",
				 "",0,"\n");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test9() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "&nbhsp;328493ndwsx",
				 "",80,"<code>");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test10() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "2345ee{}@wexsdresx",
				 "",80,"select * fron sc");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test11() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "",
				 "",80,"use mysql");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test12() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "12343212345432X",
				 "'''''@mingemail",80,"a");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test13() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "12343212345432X",
				 "'''''@minge.�� mail",-0,"a");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
	@Test
	void test14() {
		EmployeeInfo info = new EmployeeInfo("ССССС", "12343212345432X",
				 "'''''@minge.��mail",0,"a");
		String res = info.valid();
		assertTrue(res.startsWith("¼��ʧ��"));
	}
}
