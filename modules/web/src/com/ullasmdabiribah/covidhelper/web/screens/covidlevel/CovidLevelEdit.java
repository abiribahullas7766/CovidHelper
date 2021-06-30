package com.ullasmdabiribah.covidhelper.web.screens.covidlevel;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.CovidLevel;

@UiController("covidhelper_CovidLevel.edit")
@UiDescriptor("covid-level-edit.xml")
@EditedEntityContainer("covidLevelDc")
@LoadDataBeforeShow
public class CovidLevelEdit extends StandardEditor<CovidLevel> {
}