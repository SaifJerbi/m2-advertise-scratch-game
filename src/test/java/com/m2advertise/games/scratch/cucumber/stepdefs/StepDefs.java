package com.m2advertise.games.scratch.cucumber.stepdefs;

import com.m2advertise.games.scratch.M2AdvertiseScratchGameApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = M2AdvertiseScratchGameApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
