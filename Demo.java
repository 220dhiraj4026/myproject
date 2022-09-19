abstract class Bike
{
void ride(){}
}
class Tvs extends Bike
{
void ride(){
System.out.println("Tvs Honda");}
}
class Demo
{
public static void main(String args[])
{
Bike b=new Tvs();
b.ride();
}
}

