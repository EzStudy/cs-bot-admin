package com.csbot.admin.csbotadmin.global.dto;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class DataResponseDto {

    private String blockId;

    private ExtraResponseDto extra;
}
