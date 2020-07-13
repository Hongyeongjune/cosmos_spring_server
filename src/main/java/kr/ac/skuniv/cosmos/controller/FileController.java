package kr.ac.skuniv.cosmos.controller;

import kr.ac.skuniv.cosmos.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cosmos/kStars")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/file/save")
    public ResponseEntity<String> saveFile(@RequestPart MultipartFile musicFile) throws IOException {

//        String savePath = "C:\\Users\\User\\eclipse-workspace\\K-Stars\\src\\main\\java\\kr\\ac\\skuniv\\cosmos\\file";
//
//        UUID uid = UUID.randomUUID();
//        String fileName = uid + "_" + file.getOriginalFilename();
//
//        file.transferTo(new File(savePath + "\\test12.wav"));

        return ResponseEntity.ok(fileService.saveFile(musicFile));

    }

}
