package com.dmcheremisin.userservice.VO;

import com.dmcheremisin.userservice.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
