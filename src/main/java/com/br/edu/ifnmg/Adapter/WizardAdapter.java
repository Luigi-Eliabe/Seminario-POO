package com.br.edu.ifnmg.Adapter;

public class WizardAdapter implements Fighter{
    private Wizard wizard;

    public WizardAdapter(Wizard wizard){
        this.wizard = wizard;
    }

    @Override
    public void attack() {
        wizard.castFireSpell();
    }

    @Override
    public void defend() {
        wizard.shield();
    }
}
