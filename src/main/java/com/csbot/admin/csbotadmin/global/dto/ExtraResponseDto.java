package com.csbot.admin.csbotadmin.global.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ExtraResponseDto implements Serializable {

    private static final long serialVersionUID = 119095266481317058L;

    private String quizId;

    private String choiceText;
}
