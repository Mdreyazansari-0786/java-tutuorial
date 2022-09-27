 class test
 {
     void show(int a,float b){
         System.out.println("int float method");
     }
     void show(float a,int b){
         System.out.println("float int method");

     }
    public static void main(String[] args) {
          test t=new test();
          t.show(10,20f);
          t.show(20f,5);
    }
}
