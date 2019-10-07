package employee;

public class EmployeeInfo {
	String name;
	String identityNumber;
	String email;
	int age;
	String address;
	//构造函数
	public EmployeeInfo(String name, String identityNumber, 
						String email,int age, String address) {
		this.name = name;
		this.identityNumber = identityNumber;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	//输入数据,初始化 EmployeeInfo
	public static void main(String[] args){
		 EmployeeInfo info = new EmployeeInfo("杨二车娜姆", "42123212122",
				 "test@example.com",18,"china");
		 System.out.println(info.valid());
	}
	//判断输入数据合法性
	public String valid() {
		String result = "";
		if(this.name.length() <= 5) {
			result = "录入成功，您录入的员工信息为： \n" + "姓名：  " + this.name;
		}else {
			result = "录入错误！";
		}
		return result;
	}
}
