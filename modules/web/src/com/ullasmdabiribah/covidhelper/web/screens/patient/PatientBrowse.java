package com.ullasmdabiribah.covidhelper.web.screens.patient;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.Patient;

@UiController("covidhelper_Patient.browse")
@UiDescriptor("patient-browse.xml")
@LookupComponent("patientsTable")
@LoadDataBeforeShow
public class PatientBrowse extends StandardLookup<Patient> {
}