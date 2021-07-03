package com.itstudy365.bdd.jgiven;

import org.junit.Test;

import com.tngtech.jgiven.junit.ScenarioTest;

public class MyShinyJGivenTest extends ScenarioTest<GivenSomeState, WhenSomeAction, ThenSomeOutcome> {
	@Test
    public void something_should_happen() {
        given().サーバーが止まっている時に();
        when().プログラムを実行すると();
        then().エラーになる();
    }
}
