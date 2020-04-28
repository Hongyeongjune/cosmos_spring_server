package kr.ac.skuniv.cosmos.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.ac.skuniv.cosmos.domain.entity.KSTProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CreateFileKSTService {

    @Autowired
    private RestTemplate restTemplate;

    public void createKSTFile(KSTProject kstProject) {

        KSTProject result = restTemplate.postForObject("http://localhost:5000/cosmos/KStars/create/kst", kstProject, KSTProject.class);
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println(result);

    }

}
