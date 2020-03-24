package kr.ac.skuniv.cosmos.controller;

import kr.ac.skuniv.cosmos.domain.dto.AnalysisDto;
import kr.ac.skuniv.cosmos.service.AnalysisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cosmos/kStars")
public class AnalysisController {

    private final AnalysisService analysisService;

    public AnalysisController(AnalysisService analysisService) {
        this.analysisService = analysisService;
    }

    @PostMapping("/analysis")
    public ResponseEntity<AnalysisDto> analysisController(@RequestBody AnalysisDto analysisDto) {
        return ResponseEntity.ok(analysisService.analysisTest(analysisDto));
    }

    @PostMapping("/analysis2")
    public ResponseEntity<AnalysisDto> analysisController2(@RequestBody AnalysisDto analysisDto) {
        return ResponseEntity.ok(analysisService.analysisTest2(analysisDto));
    }

    @PostMapping("/test")
    public ResponseEntity<AnalysisDto> reactController(@RequestBody AnalysisDto analysisDto) {
        return ResponseEntity.ok(analysisService.reactTest(analysisDto));
    }
}