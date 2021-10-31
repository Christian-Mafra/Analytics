package com.example.analytics.model;

import android.widget.Switch;
import android.widget.TextView;

public class FluxogramaAnalisesModel {
    private String passo, procedimento, aSwitch;

    public FluxogramaAnalisesModel(String passo, String procedimento, String aSwitch) {
        this.passo = passo;
        this.procedimento = procedimento;
        this.aSwitch = aSwitch;
    }

    public String getPasso() {
        return passo;
    }

    public void setPasso(String passo) {
        this.passo = passo;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getaSwitch() {
        return aSwitch;
    }

    public void setaSwitch(String aSwitch) {
        this.aSwitch = aSwitch;
    }
}
