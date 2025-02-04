package com.h2.h2.api.respository;

import com.h2.h2.api.model.FaqModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaqRepository extends JpaRepository<FaqModel, Integer> {
}
