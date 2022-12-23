package tn.hkiri.pagination.service;

import org.springframework.data.domain.Page;
import tn.hkiri.pagination.entity.User;

public interface UserService {

    Page<User> getUsers(String name,int page,int size);


}
