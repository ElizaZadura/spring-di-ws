package App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.ScannerInputService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(App.config.ComponentScanConfig.class);

        ScannerInputService scannerInputService = context.getBean(ScannerInputService.class);
        System.out.println("Enter a string:");
        String inputString = scannerInputService.getString();
        System.out.println("You entered: " + inputString);

        System.out.println("Enter an integer:");
        int inputInt = scannerInputService.getInt();
        System.out.println("You entered: " + inputInt);

        context.close();
    }
}
