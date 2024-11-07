package com.example.layered.service;

import com.example.layered.dto.MemoRequestDto;
import com.example.layered.dto.MemoResponseDto;

import java.util.List;

public interface MemoService {
    MemoResponseDto saveMemo(MemoRequestDto dto);

    List<MemoResponseDto> findAllMemos();

    MemoResponseDto findMemoById(Long id);

    MemoResponseDto updateMemo(Long id, String title, String contents);
    // 반환받는 탄입_MemoResponseDto, 메소드 이름은 updateMemo

    MemoResponseDto updateTitle(Long id, String title, String contents);

    void deleteMemo(Long id);
}
