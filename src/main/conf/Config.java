package main.conf;

import main.test.Note;
import main.test.NoteRepository;
import main.test.User;
import main.test.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CommandLineRunner init(UserRepository userRepository, NoteRepository noteRepository) {
        return (evt) -> {
            User user = new User();
            user.setUsername("vladson");
            user.setPassword("111");
            userRepository.save(user);
            Note note = new Note();
            note.setUser(user);
            note.setText("test note");
            noteRepository.save(note);

            user = new User();
            user.setUsername("vvv");
            user.setPassword("222");
            userRepository.save(user);
            note = new Note();
            note.setUser(user);
            note.setText("vvv note");
            noteRepository.save(note);
        };
    }
}
