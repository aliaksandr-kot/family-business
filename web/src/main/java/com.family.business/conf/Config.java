package com.family.business.conf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.family.business.test.Note;
import com.family.business.test.NoteRepository;
import com.family.business.test.User;
import com.family.business.test.UserRepository;

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
