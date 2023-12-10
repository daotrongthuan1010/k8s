package com.example.k8s.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.k8s.model.*;
import org.springframework.stereotype.Repository;

@Repository
public  interface NotesRepository extends MongoRepository<Note, String> {

}