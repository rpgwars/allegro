package controller;

import model.RepositoryInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class RepositoryInfoController {

    @RequestMapping("/repositories/{owner}/{repositoryName}")
    public @ResponseBody ResponseEntity<RepositoryInfo> getRepositoryInfo(@PathVariable String owner, @PathVariable String repositoryName) {
        return null;
    }
}
