package com.yap.kredi.leaveModule.repository;

import com.yap.kredi.leaveModule.model.LeaveDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LeaveDayRepository2 extends JpaRepository<LeaveDay, Long> {

    void deleteLeaveDayById(Long id);

    Optional<LeaveDay> findLeaveDayById(Long id);


}

























































