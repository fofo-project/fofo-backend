package com.fofo.core.storage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "MEMBER_MATCH")
public class MemberMatchEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id")
    private Long id;

    private Long maleMemberId;

    private Long femaleMemberId;

    @NotNull @Size(max=1)
    private String status;

    @NotNull @Size(max=10)
    private String matchingStatus;

    private MemberMatchEntity(
            final Long maleMemberId,
            final Long femaleMemberId,
            final String matchingStatus,
            final String status
    ){
        this.maleMemberId = maleMemberId;
        this.femaleMemberId = femaleMemberId;
        this.matchingStatus = matchingStatus;
        this.status = status;
    }

    public static MemberMatchEntity of(
            final Long maleMemberId,
            final Long femaleMemberId,
            final String matchingStatus,
            final String status
    ) {
        return new MemberMatchEntity(
                maleMemberId,
                femaleMemberId,
                matchingStatus,
                status
        );
    }
}
