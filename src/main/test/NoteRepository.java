package main.test;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long>
{
    Collection<Note> findByUserUsername(String username);

    Collection<Note> findByUserUsernameAndTextContaining(String username, String text);
}
