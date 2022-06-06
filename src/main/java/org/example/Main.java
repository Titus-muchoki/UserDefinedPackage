package myPack;

 class MyPackageClass{
     String name;
     int num;
     public MyPackageClass(){
         name = "tito";
         num = 23;
     }
    public static void main(String[] args) {
         MyPackageClass myObj = new MyPackageClass();
        System.out.println(myObj.name);
        System.out.println(myObj.num);
    }
}