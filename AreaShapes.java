import java.util.Scanner;
abstract class shape{
int dim1,dim2;
abstract void printArea();
}
class rect extends shape{
rect(int a,int b){
dim1=a;
dim2=b;
}
void printArea(){
System.out.println("Area of rectangle:"+(dim1*dim2));
}
}
class tri extends shape{
tri(int a,int b){
dim1=a;
dim2=b;
}

void printArea(){
System.out.println("Area of triangle:"+(0.5*dim1*dim2));
}
}
class circle extends shape{
circle(int r){
dim1=r;
}
void printArea(){
System.out.println("Area of circle:"+(math.p1*dim1*dim1));
}
}

public class AreaShapes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter l and b of rect:");
int l=sc.nextInt();
int b =sc.nextInt();
shape r=new rect(l,b);
r.printArea();
System.out.print("Enter b and h of triangle:");
int base=sc.nextInt();
int h=sc.nextInt();
shape t=new tri(base,h);
t.printArea();
System.out.print("Enter area of circle:");
int r=sc.nextInt();
shape.c=new circle(r);
c.printArea();
sc.close();
}
}

