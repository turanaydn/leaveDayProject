package com.yap.kredi.leaveModule.service;

import com.yap.kredi.leaveModule.dto.LeaveDayRequestDTO2;
import com.yap.kredi.leaveModule.exception.LeaveDayNotFoundException2;
import com.yap.kredi.leaveModule.model.LeaveDay;
import com.yap.kredi.leaveModule.repository.LeaveDayRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class LeaveDayService2 {

    @Autowired
    private  LeaveDayRepository2 leaveDayRepository2;

    public LeaveDay addLeaveDay(LeaveDay leaveDay) {
        leaveDay.setId (leaveDay.getId ());
        return leaveDayRepository2.save (leaveDay);
    }

    public List<LeaveDay> findAllLeaveDay() {
        return leaveDayRepository2.findAll ();
    }
/*
    public LeaveDay findLeaveById(Long id) {
        return leaveDayRepository2.findLeaveDayById (id)
                .orElse (() -> new LeaveDayNotFoundException2 ("Leave Day id" + id + "was not found"))
    }

 */

    public LeaveDay updateLeaveDay(LeaveDay leaveDay) {
        return leaveDayRepository2.save (leaveDay);
    }

    public void deleteLeaveDay(Long id) {
        leaveDayRepository2.deleteLeaveDayById (id);
    }

    private void earnLeaveDay(LeaveDayRequestDTO2 leaveDayRequestDTO2, Integer yearOne) {
        Integer 
    }

}




















































