package homework;

public class Homework_4_ui {
	static void begin(){
		System.out.println("**********************************");
		System.out.println("                  ��ӭʹ��ͼ��ݹ���ϵͳ              ");
		System.out.println("��ѡ��������еĲ���");
		System.out.println("1������鼮");
		System.out.println("2��ɾ���鼮");
		System.out.println("3���鿴ȫ���ݲ��鼮");
		System.out.println("4���鼮��ѯ����");
		System.out.println("5���ر�ϵͳ");
		System.out.println("**********************************");
	}
	
	static void error(){
		System.out.println("��������ȷ�Ĳ�����Ϣ��");
	}
}

class searchui{
	static void title(){
		System.out.println("��ѡ��������еĲ���");
		System.out.println("1�������������ң�֧��ģ�����ң�");
		System.out.println("2���������߲���");
		System.out.println("3�����ݳ��������");
	}
	
	static void name(){
		System.out.println("����������ҵ�������ؼ��֣�");
	}
	
	static void author(){
		System.out.print("����������Ҫ��ѯ�����ߣ�");
	}
	
	static void press(){
		System.out.print("����������Ҫ��ѯ�ĳ����磺");
	}
}

class addui{
	static void name(){
		System.out.println("��������Ҫ����鼮������:");
	}
	
	//static void author(){
	//	System.out.println("��������Ҫ����鼮������:(��λ�������ּ��ÿո�ֿ�,���롰0����������)");
	//}
	
	static void author(){
		System.out.println("��������Ҫ����鼮������:");
	}
	
	static void press(){
		System.out.println("��������Ҫ����鼮�ĳ�����:");
	}
	
	static void error(){
		System.out.println("���鼮�Ѵ��ڣ�����+1");
	}
	
	static void yes(){
		System.out.println("��ӳɹ���");
	}
}

class readui{
	static void title(){
		System.out.println("����\t����\t������\t����");
	}
	
	static void titlel(){
		System.out.println("����\t����\t������");
	}
}

class delui{
	static void name(){
		System.out.println("��������Ҫɾ���鼮������:");
	}
	
	static void author(){
		System.out.println("��������Ҫɾ���鼮������:");
	}
	
	static void press(){
		System.out.println("��������Ҫɾ���鼮�ĳ�����:");
	}
	
	static void yes(){
		System.out.println("ɾ���ɹ���");
	}
	
	static void error(){
		System.out.println("�����ڴ��鼮��");
	}
}
