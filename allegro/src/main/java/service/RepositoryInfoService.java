package service;

import exception.NotFoundException;
import model.RepositoryInfo;
import org.springframework.stereotype.Service;

@Service
public interface RepositoryInfoService {
    RepositoryInfo getRepositoryInfo(String owner, String repositoryName) throws NotFoundException;
}
