package homework;

public class Homework_4_ui {
	static void begin(){
		System.out.println("**********************************");
		System.out.println("                  欢迎使用图书馆管理系统              ");
		System.out.println("请选择您想进行的操作");
		System.out.println("1：添加书籍");
		System.out.println("2：删除书籍");
		System.out.println("3：查看全部馆藏书籍");
		System.out.println("4：书籍查询功能");
		System.out.println("5：关闭系统");
		System.out.println("**********************************");
	}
	
	static void error(){
		System.out.println("请输入正确的操作信息！");
	}
}

class searchui{
	static void title(){
		System.out.println("请选择您想进行的操作");
		System.out.println("1：根据书名查找（支持模糊查找）");
		System.out.println("2：根据作者查找");
		System.out.println("3：根据出版社查找");
	}
	
	static void name(){
		System.out.println("请输入想查找的书名或关键字：");
	}
	
	static void author(){
		System.out.print("请输入您想要查询的作者：");
	}
	
	static void press(){
		System.out.print("请输入您想要查询的出版社：");
	}
}

class addui{
	static void name(){
		System.out.println("请输入需要添加书籍的名字:");
	}
	
	//static void author(){
	//	System.out.println("请输入需要添加书籍的作者:(多位作者名字间用空格分开,输入“0”结束输入)");
	//}
	
	static void author(){
		System.out.println("请输入需要添加书籍的作者:");
	}
	
	static void press(){
		System.out.println("请输入需要添加书籍的出版社:");
	}
	
	static void error(){
		System.out.println("此书籍已存在，数量+1");
	}
	
	static void yes(){
		System.out.println("添加成功！");
	}
}

class readui{
	static void title(){
		System.out.println("名称\t作者\t出版社\t数量");
	}
	
	static void titlel(){
		System.out.println("名称\t作者\t出版社");
	}
}

class delui{
	static void name(){
		System.out.println("请输入需要删除书籍的名字:");
	}
	
	static void author(){
		System.out.println("请输入需要删除书籍的作者:");
	}
	
	static void press(){
		System.out.println("请输入需要删除书籍的出版社:");
	}
	
	static void yes(){
		System.out.println("删除成功！");
	}
	
	static void error(){
		System.out.println("不存在此书籍！");
	}
}
