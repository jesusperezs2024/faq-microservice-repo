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
    private FaqRepository unidadOperativaRespository;

    @Override
    public List<FaqModel> listados() {
        return unidadOperativaRespository.findAll();
    }

    @Override
    public FaqModel crear(FaqModel unidadOperativa) {
        return unidadOperativaRespository.save(unidadOperativa);
    }

    @Override
    public FaqModel update(FaqModel unidadOperativa) {
        if (unidadOperativaRespository.existsById(unidadOperativa.getIdFaq())) {
            return unidadOperativaRespository.save(unidadOperativa);
        } else {
            throw new EntityNotFoundException("Unidad Operativa con id " + unidadOperativa.getIdFaq() + " no encontrada.");
        }
    }

    @Override
    public FaqModel delete(Long id) {
        FaqModel unidadbusca = unidadOperativaRespository.findById(id).get();
        unidadbusca.setStatus("I");
        return unidadOperativaRespository.save(unidadbusca);
    }

}
