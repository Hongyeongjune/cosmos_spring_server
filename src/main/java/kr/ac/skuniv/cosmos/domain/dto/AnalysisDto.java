package kr.ac.skuniv.cosmos.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnalysisDto {

    private String analysisType;
    private String talker;
    private String text;
    private String analysisResult;

}
