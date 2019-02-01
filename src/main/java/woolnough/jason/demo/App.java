package woolnough.jason.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import woolnough.jason.demo.user.Customer;

@SpringBootApplication(scanBasePackages = "woolnough.jason.demo")
@EntityScan(basePackageClasses = Customer.class)
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}