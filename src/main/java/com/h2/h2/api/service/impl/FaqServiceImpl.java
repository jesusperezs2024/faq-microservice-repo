package com.h2.h2.api.service.impl;

import com.h2.h2.api.model.FaqModel;
import com.h2.h2.api.respository.FaqRepository;
import com.h2.h2.api.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

@Service
public class FaqServiceImpl implements FaqService {

    @Autowired
    private FaqRepository faqRepository;

    @Override
    public List<FaqModel> listados() {
        return faqRepository.findAll();
    }

    @Override
    public FaqModel crear(FaqModel unidadOperativa) {
        return faqRepository.save(unidadOperativa);
    }

    @Override
    public FaqModel update(FaqModel unidadOperativa) {
        if (faqRepository.existsById(unidadOperativa.getIdfaq())) {
            return faqRepository.save(unidadOperativa);
        } else {
            throw new EntityNotFoundException("Unidad Operativa con id " + unidadOperativa.getIdfaq() + " no encontrada.");
        }
    }

    @Override
    public FaqModel delete(Integer id) {
        FaqModel unidadbusca = faqRepository.findById(id).get();
        unidadbusca.setStatus("I");
        return faqRepository.save(unidadbusca);
    }

}
