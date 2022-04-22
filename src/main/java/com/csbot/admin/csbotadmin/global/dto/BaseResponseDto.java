package com.csbot.admin.csbotadmin.global.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class BaseResponseDto implements Serializable {

    private static final long serialVersionUID = -8881199620563667744L;

    private String type;

    private String label;

    private DataResponseDto dataResponseDto;
}
