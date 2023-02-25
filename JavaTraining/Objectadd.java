public class Objectadd{
    public static void main(String[] args) {
       Addition obj1=new Addition(100);
       Addition obj2=new Addition(200);
       Add obj=new Add();
       obj.sum(obj1,obj2);
     
       
    }
}

class Addition{
    int num1;
    Addition(int num1){ 
        this.num1=num1;
    }
}

class Add{
    void sum(Addition obj1,Addition obj2){
        System.out.println("Sum of the numbers:"+(obj1.num1+obj2.num1));
    }
    }
  
