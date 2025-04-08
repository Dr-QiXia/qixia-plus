package com.qx.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qx.mapper.StaffMapper;
import com.qx.pojo.Staff;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/staff")
public class StaffController {

    @Resource
    StaffMapper staffMapper;

    @GetMapping("/getAll")
    public List<Staff> getAll(Staff staff) {
        return staffMapper.selectList(new QueryWrapper<>(staff));
    }

    @PostMapping("/deleteStaff")
    public boolean deleteStaff(@RequestBody Staff staff) {
        return staffMapper.deleteById(staff.getId()) > 0;
    }

}
