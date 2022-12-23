package tn.hkiri.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.hkiri.pagination.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {

    Page<User> findByNameContaining(String name,Pageable pageable);


}
