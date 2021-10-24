class CCircle
{
   double pi=3.14;
   double redius;

   void show_periphery()
   {
       System.out.println("periphery="+2*pi*redius);
}
}

public class hw8_6 {
    public static void main(String[]args){
     CCircle cir1 = new CCircle();
     cir1.redius =3.0;
     cir1.show_periphery();





    }
}
