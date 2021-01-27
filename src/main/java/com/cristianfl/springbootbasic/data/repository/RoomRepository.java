package com.cristianfl.springbootbasic.data.repository;

import com.cristianfl.springbootbasic.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository <Room,Long> {
}
