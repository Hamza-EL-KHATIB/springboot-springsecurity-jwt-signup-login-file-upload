package com.springcoreplatform.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    void init();

    void save(MultipartFile file);
}
