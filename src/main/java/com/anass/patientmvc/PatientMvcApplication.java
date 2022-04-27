package com.anass.patientmvc;

import com.anass.patientmvc.entities.Patient;
import com.anass.patientmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient( null,  "Hassan",new Date(),  false, 12));
            patientRepository.save(
                    new Patient( null,  "housin",new Date(),  true, 54));
            patientRepository.save(
                    new Patient( null,  "hosni",new Date(),  false, 34));
            patientRepository.save(
                    new Patient( null,  "oumaima",new Date(),  true, 10));
            patientRepository.save(
                    new Patient( null,  "hessan",new Date(),  false, 0));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
