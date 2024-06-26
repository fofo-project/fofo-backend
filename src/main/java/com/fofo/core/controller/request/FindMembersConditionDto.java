package com.fofo.core.controller.request;

import com.fofo.core.domain.match.MatchingStatus;
import com.fofo.core.domain.member.AgeRelationType;
import com.fofo.core.domain.member.ApprovalStatus;
import com.fofo.core.domain.member.FilteringSmoker;
import com.fofo.core.domain.member.FindMember;
import com.fofo.core.domain.member.Gender;
import com.fofo.core.domain.member.MatchableYn;
import com.fofo.core.domain.member.Mbti;
import com.fofo.core.domain.member.Religion;
import com.fofo.core.domain.member.SmokingYn;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record FindMembersConditionDto(
        String kakaoId,
        String name,
        Gender gender,
        @DateTimeFormat(pattern = "yyyy")
        LocalDate yearOfBirthday,
        Integer height,
        AgeRelationType filteringAgeRelation,
        String company,
        String job,
        String university,
        Mbti mbti,
        SmokingYn smokingYn,
        FilteringSmoker filteringSmoker,
        Religion religion,
        Religion filteringReligion,
        ApprovalStatus approvalStatus,
        MatchableYn matchableYn,
        String sido,
        String sigungu,
        MatchingStatus matchingStatus
) {

    public FindMember toFindMember() {
        return FindMember.of(kakaoId,
                name,
                gender,
                yearOfBirthday,
                height,
                filteringAgeRelation,
                company,
                job,
                university,
                mbti,
                smokingYn,
                filteringSmoker,
                religion,
                filteringReligion,
                approvalStatus,
                matchableYn,
                sido,
                sigungu,
                matchingStatus);
    }
}
