package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89 21.08.2018
 */
public interface AuthorRepository  extends CrudRepository<Author, Long> {
}
