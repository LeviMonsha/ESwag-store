package com.monsha.estore.repository;

import com.monsha.estore.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private Map<Long, User> users = new HashMap<>();
    private long nextId = 1;

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(nextId++);
        }
        users.put(user.getId(), user);
        return user;
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public void delete(User user) {
        users.remove(user.getId());
    }
}
