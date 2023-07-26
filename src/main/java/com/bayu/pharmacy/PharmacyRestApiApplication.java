package com.bayu.pharmacy;

import com.bayu.pharmacy.model.ApplicationUser;
import com.bayu.pharmacy.model.Role;
import com.bayu.pharmacy.repository.RoleRepository;
import com.bayu.pharmacy.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PharmacyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmacyRestApiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(
			RoleRepository roleRepository,
			UserRepository userRepository,
			PasswordEncoder passwordEncoder
	) {
		return args -> {
//			if (roleRepository.findByAuthority("ADMIN").isPresent()) return;

			Role adminRole = roleRepository.save(new Role("ADMIN"));
			Role userRole = roleRepository.save(new Role("USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			ApplicationUser admin = new ApplicationUser(1, "admin", passwordEncoder.encode("password"), roles);

			userRepository.save(admin);
		};

	}
}
