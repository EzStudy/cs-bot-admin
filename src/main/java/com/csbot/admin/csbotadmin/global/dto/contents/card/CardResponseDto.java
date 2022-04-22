package com.csbot.admin.csbotadmin.global.dto.contents.card;

import com.csbot.admin.csbotadmin.global.dto.BaseResponseDto;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class CardResponseDto implements Serializable {

    private static final long serialVersionUID = -2572617540013374994L;

    private String description;
    private List<BaseResponseDto> buttons;

}
