package gestionevenements;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
	public CommandLineRunner demo(EvenementRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Evenement(1, "Asisterix", "Plailly", "Maëva", "07/02/2017", "10:00", "Plus on est de fous, moins on paie cher !", 8, 20, "ressources/images/profil.svg"));
			repository.save(new Evenement(2, "LASIer Game", "Rouen", "Enora", "07/02/2017", "15:00", "Venez transpirer avec nous !", 8, 20, "ressources/images/profil.svg"));
			repository.save(new Evenement(3, "Culture & Art", "Rouen", "Morgane", "20/11/2016", "9:00", " Visite du musée des Beaux Arts....", 5, 8, "ressources/images/profil.svg"));
			repository.save(new Evenement(4, "Color Me Rad", "Rouen", "Thibault", "25/12/2016", "8:00", " Inscription obligatoire !", 20, 100, "ressources/images/profil.svg"));


			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Evenement evenement : repository.findAll()) {
				log.info(evenement.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Evenement evenement = repository.findOne(1);
			log.info("Evenement found with findOne(1):");
			log.info("--------------------------------");
			log.info(evenement.toString());
            log.info("");

			// fetch customers by last name
			log.info("Evenement found with findByNomEvt('Asisterix'):");
			log.info("--------------------------------------------");
			for (Evenement asisterix : repository.findByNomEvt("Asisterix")) {
				log.info(asisterix.toString());
			}
            log.info("");
		};
	}
}
