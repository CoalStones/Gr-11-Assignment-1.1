package assignment.pkg11;
import java.util.Scanner;

public class Assignment11 {
        private static int[] mClassYoung=new int[]{8,21,26};
        private static int[] mClassMiddle=new int[]{11,23,29};
        private static int[] mClassOld=new int[]{13,25,31};
        private static int[] fClassYoung=new int[]{21,33,39};
        private static int[] fClassMiddle=new int[]{23,35,41};
        private static int[] fClassOld=new int[]{25,38,43};
        private static int a;
        
    public static int old(int age){
        if(age>=20&&age<=39)a=0;
        else if(age>=40&&age<=59)a=1;
        else if(age>=60&&age<=79)a=2;
        return(a);
    }
    
    public static void answer(String gender, double bai){
    if(gender.equals("male")){
                switch(a){
                    case 0:
                        if(bai<=mClassYoung[0])System.out.println("Underweight");
                        else if(bai>=mClassYoung[0]&&bai<=mClassYoung[1])System.out.println("Healthy");
                        else if(bai>mClassYoung[2])System.out.println("Obese");
                        else if(bai>mClassYoung[1])System.out.println("Overweight");
                        break;
                    case 1:
                        if(bai<=mClassMiddle[0])System.out.println("Underweight");
                        else if(bai>=mClassMiddle[0]&&bai<=mClassMiddle[1])System.out.println("Healthy");
                        else if(bai>=mClassMiddle[2])System.out.println("Obese");
                        else if(bai>=mClassMiddle[1])System.out.println("Overweight");
                        break;
                    case 2:
                        if(bai<=mClassOld[0])System.out.println("Underweight");
                        else if(bai>=mClassOld[0]&&bai<=mClassOld[1])System.out.println("Healthy");
                        else if(bai>=mClassOld[2])System.out.println("Obese");
                        else if(bai>=mClassOld[1])System.out.println("Overweight");
                        break;
                }
            }
            else{
                switch(a){
                    case 0:
                        if(bai<=fClassYoung[0])System.out.println("Underweight");
                        else if(bai>=fClassYoung[0]&&bai<=fClassYoung[1])System.out.println("Healthy");
                        else if(bai>fClassYoung[2])System.out.println("Obese");
                        else if(bai>fClassYoung[1])System.out.println("Overweight");
                        break;
                    case 1:
                        if(bai<=fClassMiddle[0])System.out.println("Underweight");
                        else if(bai>=fClassMiddle[0]&&bai<=fClassMiddle[1])System.out.println("Healthy");
                        else if(bai>fClassMiddle[2])System.out.println("Obese");
                        else if(bai>fClassMiddle[1])System.out.println("Overweight");
                        break;
                    case 2:
                        if(bai<=fClassOld[0])System.out.println("Underweight");
                        else if(bai>=fClassOld[0]&&bai<=fClassOld[1])System.out.println("Healthy");
                        else if(bai>fClassOld[2])System.out.println("Obese");
                        else if(bai>fClassOld[1])System.out.println("Overweight");
                        break;
                }
            }
}
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int hip,age;
        double bai,height;
        String gender="";
            System.out.println(mClassMiddle[1]);
            System.out.println("How tall(cm) are you?");
                height=input.nextInt();
            System.out.println("What is the circumference of your hips?");
                hip=input.nextInt();
            System.out.println("What was your gender at birth? (male/female)");
                gender=input.next();
                gender=gender.toLowerCase();    
            System.out.println("How old are you?");
                age=input.nextInt();
            
            height=height/100;
                
            bai=(hip/(Math.pow(height,1.5))-18);
            
            a=old(age);
            System.out.format("%.1f",bai);
            System.out.print("% ");
            
            answer(gender,bai);
            
    }
    
}
