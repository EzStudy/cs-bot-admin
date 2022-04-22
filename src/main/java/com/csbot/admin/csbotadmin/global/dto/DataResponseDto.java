package com.csbot.admin.csbotadmin.global.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class DataResponseDto implements Serializable {
    private static final long serialVersionUID = -4478797143616329347L;

    private String blockId;

    private ExtraResponseDto extraResponseDto;
}
