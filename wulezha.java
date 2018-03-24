package sizeyunsuan2;
import java.util.Scanner;
public class Caculator {
     public static void main(String[] args) {
        System.out.println("0表示结束运算，1代表加减运算，2代表乘除运算，3代表混合运算，请选择：");
        Yunsuan bn=new Yunsuan();
        Jiajian an=new Jiajian();
          Chengchu cn=new Chengchu();
          Hunhe dn=new Hunhe();
 Scanner in=new Scanner(System.in);
          int L=in.nextInt();
          
          if(L==0)
          {
              bn.Showme();
          }
          if(L==1)
          {
              System.out.println("当M=10时表示两位数的加减运算，M=100时表示三位数的加减运算...请选择");
              int M=in.nextInt();
              an.setM(M);
              System.out.println("请输入需要打印多少道题，10的倍数：");
              int N=in.nextInt();
              an.setN(N);
              an.Showme();
          }
          if(L==2)
          {
              System.out.println("当M=10时表示两位数的乘除运算，M=100时表示三位数的乘除运算...请选择");
              int M=in.nextInt();
              cn.setM(M);
              System.out.println("请输入需要打印多少道题，10的倍数：");
              int N=in.nextInt();
              cn.setN(N);
              cn.Showme();
          }
          if(L==3)
          {
              System.out.println("当M=10时表示两位数的混合运算，M=100时表示三位数的混合运算...请选择");
              int M=in.nextInt();
              dn.setM(M);
              System.out.println("请输入需要打印多少道题，10的倍数：");
              int N=in.nextInt();
              dn.setN(N);
              dn.Showme();
          }
          
      }
  
  }
  class Yunsuan
  {
      public int N;
      public int getN() {
          return N;
      }
      public void setN(int n) {
          N = n;
      }
      public int M;
      public int getM() {
          return M;
      }
      public void setM(int m) {
          M = m;
      }
      //int a,b;
      public void Showme()
      {
          System.out.println("结束运算。");
      }
  }
  class Jiajian extends Yunsuan
  {
      public char o[]={'+','-'};
      public void Showme()
      {
          for(int i=0;i<N/10;i++)
          {
              for(int j=0;j<10;j++)
              {
                int a=(int)(Math.random()*M)+1;
                 int b=(int)(Math.random()*M)+1;
                 int c=(int)(Math.random()*2);
                 System.out.print(a);
                 System.out.print(o[c]);
                 System.out.print(b+"=  ");
             }
             System.out.println();
         }
     }
 }
 class Chengchu extends Yunsuan
 {
     public char p[]={'*','/'};
     public void Showme()
     {
         for(int i=0;i<N/10;i++)
         {
             for(int j=0;j<10;j++)
             {
                 int a=(int)(Math.random()*M)+1;
                 int b=(int)(Math.random()*M)+1;
                 int c=(int)(Math.random()*2);
                 System.out.print(a);
                 System.out.print(p[c]);
                 System.out.print(b+"=  ");
             }
             System.out.println();
         }
     }
 }
 class Hunhe extends Yunsuan
 {
     public char m[]={'+','-','*','/'};
     public void Showme()
     {
         for(int i=0;i<N/10;i++)
         {
             for(int j=0;j<10;j++)
             {
                 int a=(int)(Math.random()*M)+1;
                 int b=(int)(Math.random()*M)+1;
                 int d=(int)(Math.random()*M)+1;
                 int f=(int)(Math.random()*M)+1;
                 int c=(int)(Math.random()*4);
                 int e=(int)(Math.random()*4);
                 int g=(int)(Math.random()*4);
                 System.out.print(a);
                 System.out.print(m[c]);
                 System.out.print(b);
                 System.out.print(m[e]);
                 System.out.print(d);
                 System.out.print(m[g]);
                 System.out.print(f+"=  ");
             }
             System.out.println();
}
    }
}
