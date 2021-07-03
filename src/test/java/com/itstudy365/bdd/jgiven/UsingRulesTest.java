package com.itstudy365.bdd.jgiven;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import com.tngtech.jgiven.annotation.ScenarioStage;
import com.tngtech.jgiven.junit.JGivenClassRule;
import com.tngtech.jgiven.junit.JGivenMethodRule;

public class UsingRulesTest {

    @ClassRule
    public static final JGivenClassRule writerRule = new JGivenClassRule();

    @Rule
    public final JGivenMethodRule scenarioRule = new JGivenMethodRule();

    @ScenarioStage
    GivenSomeState someState;

    @ScenarioStage
    WhenSomeAction someAction;

    @ScenarioStage
    ThenSomeOutcome someOutcome;

    @Test
    public void something_should_happen() {
        someState.given().サーバーが止まっている時に();
        someAction.when().プログラムを実行すると();
        someOutcome.then().エラーになる();
    }
}
