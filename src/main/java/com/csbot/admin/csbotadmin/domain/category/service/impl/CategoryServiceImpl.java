package com.csbot.admin.csbotadmin.domain.category.service.impl;

import com.csbot.admin.csbotadmin.domain.category.dto.CategoryListResponseDto;
import com.csbot.admin.csbotadmin.domain.category.service.CategoryService;
import com.csbot.admin.csbotadmin.global.dto.BaseResponseDto;
import com.csbot.admin.csbotadmin.global.dto.DataResponseDto;
import com.csbot.admin.csbotadmin.global.dto.contents.ContentsResponseDto;
import com.csbot.admin.csbotadmin.global.dto.contents.card.CardResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public CategoryListResponseDto getCategories(String blockId) {
        DataResponseDto dataResponseDto = DataResponseDto.builder()
                .blockId(blockId)
                .build();

        BaseResponseDto baseResponseDto = BaseResponseDto
                .builder()
                .type("block")
                .label("카테고리 추가")
                .message("카테고리 추가")
                .data(dataResponseDto)
                .build();

        List<BaseResponseDto> baseResponseDtoList = Arrays.asList(baseResponseDto);
        CardResponseDto cardResponseDto = CardResponseDto
                .builder()
                .description("카테고리를 관리할 수 있습니다.")
                .buttons(baseResponseDtoList)
                .build();

        BaseResponseDto quickReplies1 = BaseResponseDto
                .builder()
                .type("block")
                .label("자바")
                .message("자바")
                .data(dataResponseDto)
                .build();

        BaseResponseDto quickReplies2 = BaseResponseDto
                .builder()
                .type("block")
                .label("알고리즘")
                .message("알고리즘")
                .data(dataResponseDto)
                .build();

        List<BaseResponseDto> quickRepliesDtoList = new ArrayList<>();
        quickRepliesDtoList.add(quickReplies2);
        quickRepliesDtoList.add(quickReplies1);

        List<CardResponseDto> cardResponseDtoList = Arrays.asList(cardResponseDto);

        ContentsResponseDto contentsResponseDto = ContentsResponseDto
                .builder()
                .type("card.text")
                .cards(cardResponseDtoList)
                .build();

        List<ContentsResponseDto> contentsResponseDtoList = Arrays.asList(contentsResponseDto);

        CategoryListResponseDto categoryListResponseDto = CategoryListResponseDto
                .builder()
                .contents(contentsResponseDtoList)
                .quickReplies(quickRepliesDtoList)
                .build();

        return categoryListResponseDto;
    }
}
