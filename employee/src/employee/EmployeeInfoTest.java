package employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeInfoTest {
	@Test
	void test1() {
		EmployeeInfo info = new EmployeeInfo("小", "123244533563332X",
				 "",18,"w");
		String res = info.valid();
		assertTrue(res.startsWith("录入成功"));
	}
	@Test
	void test2() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "123432345432345",
				 "",80,"地");
		String res = info.valid();
		assertTrue(res.startsWith("录入成功"));
	}
	@Test
	void test3() {
		EmployeeInfo info = new EmployeeInfo("小", "14232445335633322X",
				 "",18,"@");
		String res = info.valid();
		assertTrue(res.startsWith("录入成功"));
	}
	@Test
	void test4() {
		EmployeeInfo info = new EmployeeInfo("小", "341232445335633324",
				 "",80,"=");
		String res = info.valid();
		assertTrue(res.startsWith("录入成功"));
	}
	@Test
	void test5() {
		EmployeeInfo info = new EmployeeInfo("", "12343212345432X",
				 "",18,"/");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test6() {
		EmployeeInfo info = new EmployeeInfo("e", "123244533563332X",
				 "",18,"<");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test7() {
		EmployeeInfo info = new EmployeeInfo("@@@@^w", "123244533563332X",
				 "",18,"'");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test8() {
		EmployeeInfo info = new EmployeeInfo("小", "R78290273^yweixX",
				 "",0,"\n");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test9() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "&nbhsp;328493ndwsx",
				 "",80,"<code>");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test10() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "2345ee{}@wexsdresx",
				 "",80,"select * fron sc");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test11() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "",
				 "",80,"use mysql");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test12() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "12343212345432X",
				 "'''''@mingemail",80,"a");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test13() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "12343212345432X",
				 "'''''@minge.。 mail",-0,"a");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
	@Test
	void test14() {
		EmployeeInfo info = new EmployeeInfo("小小小小小", "12343212345432X",
				 "'''''@minge.。mail",0,"a");
		String res = info.valid();
		assertTrue(res.startsWith("录入失败"));
	}
}
