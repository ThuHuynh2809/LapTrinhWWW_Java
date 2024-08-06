package vn.edu.iuh.fit;

import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.backend.enums.ProductStatus;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.reponsitories.ProductRepository;

import java.util.Random;

@SpringBootApplication
public class WwwWeek07Lab20010211HuynhMinhThuApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwwWeek07Lab20010211HuynhMinhThuApplication.class, args);
	}
	@Autowired
	private ProductRepository productRepository;
	@Bean
	CommandLineRunner createSampleProducts(){
		return args -> {
			Faker faker =new Faker();
			Random rnd = new Random();
			Device devices = faker.device();
			for (int i = 0; i < 50; i++) {
				Product product =new Product(
						devices.modelName(),
						faker.lorem().paragraph(30),
						rnd.nextInt(10)%2==0?"Kg":"piece",
//                        "piece",
						devices.manufacturer(),
						ProductStatus.ACTIVE
				);
				productRepository.save(product);
			}
		};
	}

}
