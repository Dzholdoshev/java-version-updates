import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.TEN;

    Double sum = 10.33;
//        System.out.println(b1.multiply(BigDecimal.valueOf(sum)));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));

        //Scalling

        BigDecimal num1= new BigDecimal("23.12");
        System.out.println(num1.setScale(1, RoundingMode.CEILING));//23.2
        System.out.println(num1.setScale(1, RoundingMode.FLOOR));//23.1
        System.out.println(num1.setScale(2, RoundingMode.FLOOR));//23.12
        System.out.println(num1.setScale(2, RoundingMode.CEILING));//23.12


        System.out.println(b1.subtract(b2));


        //Do not use equals()
        System.out.println(new BigDecimal("12.3").compareTo(num1));




    }

}


class Employee{
    private String name;
    private BigDecimal salary;

}