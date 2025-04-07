package com.qx.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private Integer id;

    @TableField("staff_name")
    private String staffName;

    private String nickname;

    private Integer sex;

    @TableField("phone_number")
    private String phoneNumber;

    private String address;

    private Double salary;

    @TableField("debt_amount")
    private Double debtAmount;
}
