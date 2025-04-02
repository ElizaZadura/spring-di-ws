package App.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("data_access") // Adjust the package name as necessary
public class ComponentScanConfig {
}
