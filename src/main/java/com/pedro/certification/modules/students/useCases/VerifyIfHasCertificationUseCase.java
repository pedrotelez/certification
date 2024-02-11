package com.pedro.certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.pedro.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("teste@email.com") && dto.getTechnology().equals("Java")) {
            return true;
        }

        return false;
    }

}
