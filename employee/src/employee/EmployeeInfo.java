package employee;

public class EmployeeInfo {
	String name;
	String identityNumber;
	String email;
	int age;
	String address;
	//���캯��
	public EmployeeInfo(String name, String identityNumber, 
						String email,int age, String address) {
		this.name = name;
		this.identityNumber = identityNumber;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	//��������,��ʼ�� EmployeeInfo
	public static void main(String[] args){
		 EmployeeInfo info = new EmployeeInfo("�������ķ", "42123212122",
				 "test@example.com",18,"china");
		 System.out.println(info.valid());
	}
	//�ж��������ݺϷ���
	public String valid() {
		String result = "";
		if(this.name.length() <= 5) {
			result = "¼��ɹ�����¼���Ա����ϢΪ�� \n" + "������  " + this.name;
		}else {
			result = "¼�����";
		}
		return result;
	}
}
