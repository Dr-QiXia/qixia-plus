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

    //查询全部员工
    @GetMapping("/getAll")
    public List<Staff> getAll(Staff staff) {
        return staffMapper.selectList(new QueryWrapper<>(staff));
    }

    //添加员工
    @GetMapping("/insert")
    public int insert(@RequestBody Staff staff) {
        return staffMapper.insert(staff);
    }

    //根据id删除员工
    @PostMapping("/deleteById")
    public boolean deleteStaff(@RequestBody Staff staff) {
        return staffMapper.deleteById(staff.getId()) > 0;
    }

}
