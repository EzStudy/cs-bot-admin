package com.csbot.admin.csbotadmin.domain.category.dto;

import com.csbot.admin.csbotadmin.global.dto.BaseResponseDto;
import com.csbot.admin.csbotadmin.global.dto.contents.ContentsResponseDto;
import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class CategoryListResponseDto {

    List<ContentsResponseDto> contents;

    List<BaseResponseDto> quickReplies;

}
