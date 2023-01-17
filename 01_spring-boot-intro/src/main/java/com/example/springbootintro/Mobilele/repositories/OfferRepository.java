package com.example.springbootintro.Mobilele.repositories;

import com.example.springbootintro.Mobilele.domain.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, String> {
}
