package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDispositivos {
    public static final Target SPAN_DATOS_DISPOSITIVOS = Target.the("llenar los campos referentes a tu computadora").locatedBy("//span[text()='{0}']");
    public static final Target DIV_DATOS_DISPOSITIVOS = Target.the("llenar los campos referentes a tu computadora").locatedBy("//div[text()='{0}']");
    public static final Target SELECT_DATOS_DISPOSITIVOS = Target.the("llenar los campos referentes a tu computadora").locatedBy("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span/span[1]");



}
