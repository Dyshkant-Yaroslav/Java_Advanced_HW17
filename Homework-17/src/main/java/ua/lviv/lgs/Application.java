package ua.lviv.lgs;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UnivercityService service = ctx.getBean(UnivercityService.class);

		Univercity univercity = new Univercity();
		univercity.setName("Oxford");
		univercity.setAccreditationLevel(2);
		univercity.setInstituteQuantity(12);
		univercity.setStudentsQuantity(4500);
		univercity.setAddress("Lviv");

		Univercity univercity1 = new Univercity();
		univercity1.setName("Cambridge");
		univercity1.setAccreditationLevel(3);
		univercity1.setInstituteQuantity(15);
		univercity1.setStudentsQuantity(7800);
		univercity1.setAddress("Lviv");

		service.create(univercity);
		service.create(univercity1);

		System.out.println(service.findById((long) 9));
		System.out.println(service.findByName("Oxford"));
		System.out.println(service.findByAddress("Lviv"));

		service.findAll().stream().forEach(System.out::println);

		Univercity update = service.findById((long) 8);
		update.setAddress("Great Britain");
		service.update(update);
		service.findAll().stream().forEach(System.out::println);

		service.deleteById((long) 9);

	}
}