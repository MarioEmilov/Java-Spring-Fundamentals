package com.example.exam.service.impl;

import com.example.exam.model.entity.Offer;
import com.example.exam.model.service.OfferServiceModel;
import com.example.exam.repository.OfferRepository;
import com.example.exam.security.CurrentUser;
import com.example.exam.service.ConditionService;
import com.example.exam.service.OfferService;
import com.example.exam.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;
    private final UserService userService;
    private final ConditionService conditionService;

    public OfferServiceImpl(OfferRepository offerRepository, ModelMapper modelMapper, CurrentUser currentUser, UserService userService, ConditionService conditionService) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
        this.userService = userService;
        this.conditionService = conditionService;
    }

    @Override
    public void addOffer(OfferServiceModel offerServiceModel) {
        Offer offer = modelMapper.map(offerServiceModel, Offer.class);
        offer.setCondition(conditionService.findByConditionNameEnum(offerServiceModel.getCondition().getName()));
    }

    @Override
    public void removeOrder(Long id) {
        offerRepository.deleteById(id);
    }
}
