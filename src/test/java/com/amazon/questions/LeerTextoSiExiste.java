package com.amazon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LeerTextoSiExiste implements Interaction {
    private By elementoXPath;

    public LeerTextoSiExiste(By elementoXPath) {
        this.elementoXPath = elementoXPath;
    }

    public static LeerTextoSiExiste delElemento(By elementoXPath) {
        return new LeerTextoSiExiste(elementoXPath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WebElement elemento = BrowseTheWeb.as(actor).getDriver().findElement(elementoXPath);
            String texto = elemento.getText();
            actor.remember("Texto leido", texto);
        } catch (NoSuchElementException e) {
            String texto = "";
            actor.remember("Texto leido", texto);
        }


    }
}
