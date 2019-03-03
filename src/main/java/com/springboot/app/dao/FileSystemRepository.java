package com.springboot.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.nio.file.FileSystem;

/**
 * Created by Administrator.
 */
public interface FileSystemRepository extends MongoRepository<FileSystem,String> {
}
