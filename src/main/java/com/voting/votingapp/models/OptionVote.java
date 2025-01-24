package com.voting.votingapp.models;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
public class OptionVote {
    private String option;
    private Long voteCount = 0L;

}
