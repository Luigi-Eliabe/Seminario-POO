package com.br.edu.ifnmg.Adapter;

public class Main {
    public static void main(String[] args){
        Wizard wizard = new Wizard();

        Fighter wizardAdapter = new WizardAdapter(wizard);

        wizardAdapter.attack();
        wizardAdapter.defend();
    }
}
