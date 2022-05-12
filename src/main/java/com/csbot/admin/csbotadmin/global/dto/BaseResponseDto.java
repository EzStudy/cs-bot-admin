package com.csbot.admin.csbotadmin.global.dto;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class BaseResponseDto {

    private String type;

    private String label;

    private String message;

    private DataResponseDto data;
}
