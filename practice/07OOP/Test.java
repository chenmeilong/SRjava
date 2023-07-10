
public class Test{
  public static void main(String[] args){

    Circle role1=new Circle();
    PassObject role2=new PassObject();
    role2.printAreas(role1,5);

  }
}

class Circle {
  double radius;
  public double findArea(double radius){
    this.radius=radius;
    return Math.PI*this.radius*this.radius;
  }
}

class PassObject{

  public void printAreas(Circle c,int times){
    for(int i = 1 ; i <= times; i++){
      System.out.println("半径值："+i+" "+"对应的面积为："+c.findArea(i));
    }

  }
}