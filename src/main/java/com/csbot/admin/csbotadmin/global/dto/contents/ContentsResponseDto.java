package com.csbot.admin.csbotadmin.global.dto.contents;

import com.csbot.admin.csbotadmin.global.dto.contents.card.CardResponseDto;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class ContentsResponseDto implements Serializable {
    private static final long serialVersionUID = -6765791564918500624L;

    private String type;

    private List<CardResponseDto> cardResponseDtolist;
}
