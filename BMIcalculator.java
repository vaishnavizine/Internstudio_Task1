import java.util.*;
public class BMIcalculator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height:");
        int height=sc.nextInt();
        System.out.println("enter weight:");
        int weight=sc.nextInt();
        int BMI=weight/(height*height);
        System.out.println(BMI);

        if(BMI>=50 && BMI<=60){
            System.out.println("overweight");
        }
        else if(BMI<=50 && BMI>=40){
            System.out.println("normal weight");
        }
        else if(BMI<=61 && BMI>=100){
            System.out.println("obese");
        }
        else{
            System.out.println("underweight");
        }
    
}

    
}
