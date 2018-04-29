import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.example.dao")
@ComponentScan(basePackages = {"com.example"})
public class Ssmdemo02ControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ssmdemo02ControllerApplication.class, args);
	}
}
