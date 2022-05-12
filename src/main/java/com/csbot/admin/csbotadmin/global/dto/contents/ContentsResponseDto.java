package com.csbot.admin.csbotadmin.global.dto.contents;

import com.csbot.admin.csbotadmin.global.dto.contents.card.CardResponseDto;
import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ContentsResponseDto {

    private String type;

    private List<CardResponseDto> cards;

}
