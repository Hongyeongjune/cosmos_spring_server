package kr.ac.skuniv.cosmos.infra.controller;

import kr.ac.skuniv.cosmos.infra.S3Uploader;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/cosmos/kStars")
@RequiredArgsConstructor
public class FileUploadController {

    private final S3Uploader s3Uploader;

    @PostMapping("/musicfile/upload")
    public ResponseEntity<String> uploadMusicFile(@RequestParam("musicFile") MultipartFile multipartFile){
        String fileName = UUID.randomUUID().toString();
        return ResponseEntity.ok(s3Uploader.uploadFile(multipartFile, fileName));
    }

    @PostMapping("/file/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile){
        String fileName = UUID.randomUUID().toString();
        return ResponseEntity.ok(s3Uploader.uploadFile(multipartFile, fileName));
    }

}
