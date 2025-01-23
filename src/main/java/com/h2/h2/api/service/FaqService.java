package com.h2.h2.api.service;

import com.h2.h2.api.model.FaqModel;

import java.util.List;

public interface FaqService {
    List<FaqModel> listados();
    FaqModel crear(FaqModel unidadOperativa);

    FaqModel update(FaqModel unidadOperativa);

    FaqModel delete (Long id);

}
