package Infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
    @Column(columnDefinition = "uniqueidentifier")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "AcademicProgram", nullable = false)
    private AcademicProgramEntity academicProgramEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "IdType", nullable = false)
    private IdTypeEntity idTypeEntity;

    @Column(name = "Name")
    private String name;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "eMail")
    private String eMail;

    @Column(name = "MobileNumber")
    private String mobileNumber;



}
