public class Inheritance1 {
    public static void main(String[] args) {
        Numbers obj1=new Numbers(100);
        Numbers obj2=new Numbers(200);
        Numbers obj3=new Numbers(200);
        Sum obj=new Sum();
        obj.addition(obj1,obj2,obj3);
         
}
}


class Numbers{
    int num;
    Numbers(int num)
    {
      this.num=num;
    }
}


class Sum extends Numbers{
    void addition(Numbers obj1,Numbers obj2,Numbers obj3)
    {
         System.out.println("Sum of the three numbers : "+(obj1.num+obj2.num+obj3.num));
    }
 }

