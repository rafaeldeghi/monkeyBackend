package monkey.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import monkey.springboot.model.User;
import monkey.springboot.repository.UserRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.UserRepository.save(new User("Rafael", "Deghi", "rafa.deghi@gmail.com", "(11) 1111-1111"));
		this.UserRepository.save(new User("Lucas", "Santos", "lucas.santos@gmail.com", "(22) 2222-2222"));
		this.UserRepository.save(new User("João", "Deghi", "joao.deghi@gmail.com", "(33) 3333-3333"));
		this.UserRepository.save(new User("Mayara", "Silva", "mayara.fernandes@gmail.com", "(44) 4444-4444"));
		this.UserRepository.save(new User("Pedro", "Pereira", "pedro@gmail.com", "(55) 5555-5555"));
		this.UserRepository.save(new User("Joaquim", "Oliveira", "joaquim@gmail.com", "(66) 6666-6666"));
		this.UserRepository.save(new User("Marcos", "Deghi", "marcos@gmail.com", "(77) 7777-7777"));
		this.UserRepository.save(new User("Magnus", "Silveira", "magnus@gmail.com", "(88) 8888-8888"));
		this.UserRepository.save(new User("Benedito", "Deghi", "benedito@gmail.com", "(99) 9999-9999"));
		this.UserRepository.save(new User("Isaac", "Deghi", "isaac.deghi@gmail.com", "(10) 1010-1010"));		
	}

}
