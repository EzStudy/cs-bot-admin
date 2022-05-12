package com.csbot.admin.csbotadmin.global.dto;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ExtraResponseDto {

    private String quizId;

    private String choiceText;
}
