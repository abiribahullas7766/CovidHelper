package com.ullasmdabiribah.covidhelper.web.screens.diagnosis;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.Diagnosis;

@UiController("covidhelper_Diagnosis.browse")
@UiDescriptor("diagnosis-browse.xml")
@LookupComponent("diagnosesTable")
@LoadDataBeforeShow
public class DiagnosisBrowse extends StandardLookup<Diagnosis> {
}