package com.kosa.springcoffee.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModifyMemberInfoAdminDTO {
    private String email;
    private String name;
    private String address;
}
