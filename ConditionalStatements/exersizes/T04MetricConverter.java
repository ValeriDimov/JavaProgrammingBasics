package ConditionalStatements.exersizes;

import java.util.Scanner;

public class T04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String metricInput = scanner.nextLine();
        String metricOutput = scanner.nextLine();


        if (metricInput.equals("mm")) {
            number /= 1000;
        } else if (metricInput.equals("cm")) {
            number /= 100;
        } else if (metricInput.equals("m")) {
            number = number;
        }

        if (metricOutput.equals("mm")) {
            number *= 1000;
        }else if (metricOutput.equals("cm")){
            number *= 100;
        }else if (metricOutput.equals("m")){
            number = number;
        }
        System.out.printf("%.3f", number);

    }
}
