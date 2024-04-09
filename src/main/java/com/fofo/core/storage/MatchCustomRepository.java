package com.fofo.core.storage;

import com.fofo.core.domain.match.Match;
import com.fofo.core.domain.match.MatchingStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MatchCustomRepository {
    long deleteMatchesBy(final List<Long> matchIdList);
    Page<Match> selectMatchResultList(final Pageable pageable);
    long updateMatchStatus(final List<Long> matchIdList, MatchingStatus matchingStatus);
}