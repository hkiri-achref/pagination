package tn.hkiri.pagination.service.implementation;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import tn.hkiri.pagination.entity.User;
import tn.hkiri.pagination.repository.UserRepository;
import tn.hkiri.pagination.service.UserService;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("name {} ",name);
        return userRepository.findByNameContaining(name, PageRequest.of(page,size));
    }
}
