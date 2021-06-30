package com.ullasmdabiribah.covidhelper.web.screens.doctor;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.Doctor;

@UiController("covidhelper_Doctor.edit")
@UiDescriptor("doctor-edit.xml")
@EditedEntityContainer("doctorDc")
@LoadDataBeforeShow
public class DoctorEdit extends StandardEditor<Doctor> {
}