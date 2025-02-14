package com.th.mux.mapper;

import com.th.mux.dto.CourtDto;
import com.th.mux.dto.RankingDto;
import com.th.mux.model.Court;
import com.th.mux.model.Ranking;

public class RankingMapper {
    public static RankingDto toDto(Ranking ranking) {
        if (ranking == null) {
            throw new RuntimeException("Input is invalid");
        }
        return new RankingDto(ranking.getId(), ranking.getDepartment().getId(), ranking.getDepartment().getName(), ranking.getSteps(),
                ranking.getDate(), null);
    }
}
