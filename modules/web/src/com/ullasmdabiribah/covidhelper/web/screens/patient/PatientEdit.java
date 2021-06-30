package com.ullasmdabiribah.covidhelper.web.screens.patient;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.Patient;

@UiController("covidhelper_Patient.edit")
@UiDescriptor("patient-edit.xml")
@EditedEntityContainer("patientDc")
@LoadDataBeforeShow
public class PatientEdit extends StandardEditor<Patient> {
}