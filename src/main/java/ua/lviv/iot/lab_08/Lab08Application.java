package ua.lviv.iot.lab_08;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.lab_08.models.Animator;
import ua.lviv.iot.lab_08.models.AnimatorType;
import ua.lviv.iot.lab_08.models.TrampolineJumping;
import ua.lviv.iot.lab_08.repositories.AnimatorRepository;
import ua.lviv.iot.lab_08.repositories.TrampolineRepository;

@SpringBootApplication
public class Lab08Application {

	public static void main(final String[] args) {
		SpringApplication.run(Lab08Application.class, args).close();
	}

	@Bean
	public CommandLineRunner trampolineBean(
			final TrampolineRepository trampolineRepository) {
		TrampolineJumping holiday = new TrampolineJumping(
				800.0, 4.0, 8,
				14, 6.0);
		return (args) -> {
			trampolineRepository.save(holiday);
		};
	}

	@Bean
	public CommandLineRunner animatorBean(
			final AnimatorRepository animatorRepository) {
		Animator holiday = new Animator(
				1200.0, 2.5, 3,
				6, AnimatorType.PHAMTOMIMIST, 12);
		return (args) -> {
			animatorRepository.save(holiday);
		};
	}
}
