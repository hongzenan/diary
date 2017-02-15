package Repository;

import org.springframework.data.repository.CrudRepository;

import Entity.User;

/**
 * Created by xiaonan on 2017/2/11.
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}