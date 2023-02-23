package com.example.exam.service;

import com.example.exam.model.entity.Offer;
import com.example.exam.model.service.OfferServiceModel;

public interface OfferService {

    void addOffer(OfferServiceModel offerServiceModel);

    void removeOrder(Long id);
}
