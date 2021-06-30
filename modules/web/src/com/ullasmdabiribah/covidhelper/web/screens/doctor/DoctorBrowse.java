package com.ullasmdabiribah.covidhelper.web.screens.doctor;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.Doctor;

@UiController("covidhelper_Doctor.browse")
@UiDescriptor("doctor-browse.xml")
@LookupComponent("doctorsTable")
@LoadDataBeforeShow
public class DoctorBrowse extends StandardLookup<Doctor> {
}