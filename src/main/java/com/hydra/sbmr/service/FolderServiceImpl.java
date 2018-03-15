package com.hydra.sbmr.service;

import com.hydra.sbmr.repoElastic.FolderElasticRepository;
import com.hydra.sbmr.repoMongo.FolderMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolderServiceImpl implements FolderService {

    private final FolderElasticRepository folderElasticRepository;
    private final FolderMongoRepository folderMongoRepository;

    @Autowired
    public FolderServiceImpl(FolderElasticRepository folderElasticRepository,
                             FolderMongoRepository folderMongoRepository) {
        this.folderElasticRepository = folderElasticRepository;
        this.folderMongoRepository = folderMongoRepository;
    }

    @Override
    public void doSth() {
        folderMongoRepository.toString();
        folderElasticRepository.toString();
    }

}
