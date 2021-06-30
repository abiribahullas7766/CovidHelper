package com.ullasmdabiribah.covidhelper.web.screens.covidlevel;

import com.haulmont.cuba.gui.screen.*;
import com.ullasmdabiribah.covidhelper.entity.CovidLevel;

@UiController("covidhelper_CovidLevel.browse")
@UiDescriptor("covid-level-browse.xml")
@LookupComponent("covidLevelsTable")
@LoadDataBeforeShow
public class CovidLevelBrowse extends StandardLookup<CovidLevel> {
}