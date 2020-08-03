package kr.ac.skuniv.cosmos.controller;

import kr.ac.skuniv.cosmos.domain.dto.UserDto;
import kr.ac.skuniv.cosmos.domain.entity.KSTProject;
import kr.ac.skuniv.cosmos.service.CreateFileKSTService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cosmos/kStars")
public class CreateFileKSTController {

    private final CreateFileKSTService createFileKSTService;

    public CreateFileKSTController(CreateFileKSTService createFileKSTService) {
        this.createFileKSTService = createFileKSTService;
    }

    @PostMapping("/create/kst")
    public void analysisController(@RequestBody KSTProject kstProject) {
        System.out.println(kstProject.getM_KTierVer2());
        createFileKSTService.createKSTFile(kstProject);
    }
}
