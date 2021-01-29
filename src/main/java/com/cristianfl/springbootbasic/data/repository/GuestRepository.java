package com.cristianfl.springbootbasic.data.repository;

import com.cristianfl.springbootbasic.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository <Guest,Long> {
}
