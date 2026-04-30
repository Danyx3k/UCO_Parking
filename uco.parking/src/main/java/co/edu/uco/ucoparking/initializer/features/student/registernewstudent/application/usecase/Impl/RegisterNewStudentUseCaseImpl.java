package co.edu.uco.ucoparking.initializer.features.student.registernewstudent.application.usecase.Impl;

import co.edu.uco.ucoparking.initializer.features.student.registernewstudent.application.usecase.RegisterNewStudentDomain;
import co.edu.uco.ucoparking.initializer.features.student.registernewstudent.application.usecase.domain.RegistrarNewStudentUseCase;
import org.springframework.stereotype.Service;

@Service //caso de uso//<<--Hace parte de la capa del negocio//
public class RegisterNewStudentUseCaseImpl implements RegistrarNewStudentUseCase {

    @Override
    public void execute(RegisterNewStudentDomain data) {
        return null;
    }
}
