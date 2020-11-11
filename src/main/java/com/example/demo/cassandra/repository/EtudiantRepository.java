package com.example.demo.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.demo.cassandra.modal.Etudiant;

public interface EtudiantRepository extends CassandraRepository<Etudiant, String> {

}
