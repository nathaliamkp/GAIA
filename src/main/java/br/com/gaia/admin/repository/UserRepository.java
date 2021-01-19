package br.com.gaia.admin.repository;

import br.com.gaia.admin.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {


}
