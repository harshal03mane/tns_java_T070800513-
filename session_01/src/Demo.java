
public class Demo {
private int dd,mm,yy;

public void initDate(){
	dd=mm=yy=1;
	
}
public void setDate(int d,int m,int y) {
	dd=d;
	mm=m;
	yy=y;
	
}
public void displayDate() {
	System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
}
public static void main(String[] args) {
	Demo d=new Demo();
	d.displayDate();
	d.initDate();
	d.displayDate();
	d.setDate(3, 07, 2003);
	d.displayDate();
}

}

