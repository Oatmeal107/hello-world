package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


public class Homework_4_Library {
	
	static HashMap<Book,Integer> line = new HashMap<Book,Integer>(); //创建一个HashMap来保存书籍内容
	
	public static void main(String[] args) {	
		var sc = new Scanner(System.in);//输入
		dates();
main:   while(true) {//控制程序流程
			Homework_4_ui.begin(); //开始界面  
			if(sc.hasNextInt()) { //如果正确输入功能键进入功能页面
				var choice = sc.nextInt();
				if(choice>0&&choice<6) {   //再次确保输入了正确的功能键
					switch(choice) {
						case 1:
							addbook(line, sc);	
							break;
						case 2:
							removebook(line,sc);
							break;
						case 3:
							read(line);
							break;
						case 4:
							searchui.title();
							search(line,sc);
							break;
						case 5:break main;
					}
				}
				else {
					Homework_4_ui.error();
				}
			}
			else {
				Homework_4_ui.error();
			}
		}
		sc.close();
	}
	
	//添加书籍的方法
	private static void addbook(HashMap<Book,Integer> l, Scanner sc){
		//Book book = new Book(null, null, null);  //创建一个Book的实例对象
		addui.name();
	    String name = sc.next();
		addui.author();
		//while(!s.hasNext("0")) //当输入0时停止
		//	book.author.add(s.next());
		//s.next();//取出输入值0；
		String author=sc.next();
		addui.press();
		String press = sc.next();
		Book book = new Book(name, author, press);
		if(l.containsKey(book)) {
			var number = l.get(book);
			addui.error();
			l.put(book, number+1);
		}
		else {	
			l.put(book, 1);
			addui.yes();
		}		
	}
	
	//删除一本书
	private static void removebook(HashMap<Book,Integer> l, Scanner sc){
		Book book = new Book(null, null, null);
		delui.name();
	    book.name = sc.next();
		delui.author();
		book.author=sc.next();
		delui.press();
		book.press = sc.next();
		if(l.containsKey(book)) {
			l.remove(book);
			delui.yes();
		}
		else {	
			delui.error();
		}		
	}
	
	//查看全部已存入的书籍
	private static void read(Map<Book,Integer> l) {
	 Set<Entry<Book, Integer>> entrySet = l.entrySet();
	 readui.title();;
     for (Entry<Book, Integer> entry : entrySet) {
    	 System.out.println(entry.getKey().getname() + "\t" +entry.getKey().getauthor()+"\t"+entry.getKey().getpress()+"\t"+entry.getValue());
     }
	}
	
	private static void search(Map<Book,Integer> l,Scanner sc){
		Iterator<Book> it = l.keySet().iterator();
		if(sc.nextInt() == 1) {
			searchui.name();
			String name = sc.next();
			boolean b = false;
			while(it.hasNext()) {
				Book book =(Book) it.next();
				if(book.nContains(name)) {
					System.out.println(book.getname() + "\t" +book.getauthor()+"\t"+book.getpress());
					b = true;
				}
			}
			if(b == false)
				System.out.println("查无此书！");
		}
		else if(sc.nextInt() == 2) {
			searchui.author();
			String author = sc.next();
			boolean b = false;
			while(it.hasNext()) {
				Book book =(Book) it.next();
				if(book.aContains(author)) {
					System.out.println(book.getname() + "\t" +book.getauthor()+"\t"+book.getpress());
					b = true;
				}
			}
			if(b == false) 
				System.out.println("查无此书！");
		}
		else if(sc.nextInt() == 3) {
			searchui.press();
			String press = sc.next();
			boolean b = false;
			while(it.hasNext()) {
				Book book =(Book) it.next();
				if(book.pContains(press)) {
					System.out.println(book.getname() + "\t" +book.getauthor()+"\t"+book.getpress());
					b = true;
				}
			}
			if(b == false)
				System.out.println("查无此书！");
		}
	}
     
	
	//初始数据
	private static void dates() {
		Book book1 = new Book("java","李","人民");
		Book book2 = new Book("意林","佚名","杂志");
		Book book3 = new Book("数学","课本组","西电");
		line.put(book1,1);
		line.put(book2,1);
		line.put(book3,1);
	}
}

class Book{
	String name;
	String author;
	String press;
	Book(String name, String author, String press){
		this.name = name;
		this.author = author;
		this.press = press;
	}
	
	public String getname() {
		return this.name;
	}
	
	public  String getauthor() {
		return this.author;
	}
	
	public String getpress() {
		return this.press;
	}
	
	public boolean nContains(String n) {
		return name.contains(n);
	}

	public boolean aContains(String a) {
		return author.contains(a);
	}

	public boolean pContains(String p) {
		return press.contains(p);
	}
	
	public boolean equals(Object obj) {
	    if (this == obj)//判断是否是本类的一个应用
	    	return true;
	    if (obj == null || getClass() != obj.getClass()) 
	    	return false;
	    Book book = (Book) obj;
	    if (name != null ? !name.equals(book.name) : book.name != null) 
	    	return false;
	    return true;
	  }
	 
	
	public int hashCode() {
		int c = name != null ? name.hashCode() : 0;
		c = 31*c + (author != null ? author.hashCode() : 0);
		c = 31*c + (press != null ? press.hashCode() : 0);
		return c;
	}
}
