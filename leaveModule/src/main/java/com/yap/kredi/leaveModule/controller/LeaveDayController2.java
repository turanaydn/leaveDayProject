package com.yap.kredi.leaveModule.controller;

import com.yap.kredi.leaveModule.model.LeaveDay;
import com.yap.kredi.leaveModule.service.LeaveDayService2;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("leave")
public class LeaveDayController2 {

    @Autowired
    private LeaveDayService2 leaveDayService2;

    @GetMapping("/all")
    public ResponseEntity<List<LeaveDay>> getAllLeaveDay() {
        List<LeaveDay> leaveDays = leaveDayService2.findAllLeaveDay ();

        return new ResponseEntity<> (leaveDays, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "create leaveDay",
            notes = "make a leaveDay via json request.",
            response = ResponseEntity.class)
    @PostMapping("/add")
    public ResponseEntity <LeaveDay> addLeaveDay(@RequestBody LeaveDay leaveDay) {
        LeaveDay addLeaveDay = leaveDayService2.addLeaveDay (leaveDay);

        return new ResponseEntity<> (addLeaveDay, HttpStatus.CREATED);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "update leaveDay ",
            notes = "make a leaveDay via json request.",
            response = ResponseEntity.class)
    @PutMapping("/update")
    public ResponseEntity<LeaveDay> updateLeave(@RequestBody LeaveDay leaveDay) {
        LeaveDay updateLeaveDay = leaveDayService2.updateLeaveDay (leaveDay);
        return new ResponseEntity<> (updateLeaveDay, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "deleting leaveDay",
            notes = "delete a leaveDay via json request.")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLeave(@PathVariable("id") Long id) {
        leaveDayService2.deleteLeaveDay (id);

        return new ResponseEntity<> (HttpStatus.OK);
    }

}

















































