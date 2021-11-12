package com.example.analytics.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.analytics.R;
import com.example.analytics.fragments.CadastroFragment;
import com.example.analytics.fragments.DiagramaDeTopoAnionsFragment;
import com.example.analytics.fragments.FluxogramaAnaliseFragment;
import com.example.analytics.fragments.LoginFragment;
import com.example.analytics.fragments.LoginOuCadastroFragment;
import com.example.analytics.fragments.NovoExperimentoFragment;
import com.example.analytics.fragments.QuemSomosFragment;

public class FragmentsActivity extends AppCompatActivity {
    private DiagramaDeTopoAnionsFragment diagramaDeTopoAnionsFragment;
    private LoginFragment loginFragment;
    private CadastroFragment cadastroFragment;
    private LoginOuCadastroFragment loginOuCadastroFragment;
    private NovoExperimentoFragment viewPagerNovo_experimentoFragment;
    private FluxogramaAnaliseFragment fluxogramaAnaliseFragment;
    private QuemSomosFragment quemSomosFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        if(Build.VERSION.SDK_INT>=19 && Build.VERSION.SDK_INT<2){
            setWindowsFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if(Build.VERSION.SDK_INT>=19){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        if(Build.VERSION.SDK_INT<2){
            setWindowsFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        /*View decorview = getWindow().getDecorView();
        int ui = decorview.SYSTEM_UI_FLAG_FULLSCREEN;//decorview.SYSTEM_UI_FLAG_HIDE_NAVIGATION;//
        decorview.setSystemUiVisibility(ui);*/


        Bundle numFragments = getIntent().getExtras();
        int numero = numFragments.getInt("fragments");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();


        loginOuCadastroFragment = new LoginOuCadastroFragment();
        if(numero == 1) {
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.frameConteudo2, loginOuCadastroFragment);
            transaction.commit();
        }
        cadastroFragment = new CadastroFragment();
        if(numero == 2) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.gray));
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.frameConteudo2, cadastroFragment);
            transaction.commit();
        }
        loginFragment = new LoginFragment();
        if(numero == 3) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.gray));
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.constraint, loginFragment);
            transaction.commit();
        }
        diagramaDeTopoAnionsFragment = new DiagramaDeTopoAnionsFragment();
        if(numero == 4) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.frameConteudo2, diagramaDeTopoAnionsFragment);
            transaction.commit();
        }
        viewPagerNovo_experimentoFragment = new NovoExperimentoFragment();
        if(numero == 5) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema_escuro));
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.frameConteudo2, viewPagerNovo_experimentoFragment);
            transaction.commit();
        }
        fluxogramaAnaliseFragment = new FluxogramaAnaliseFragment();
        if(numero == 6) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema_escuro));
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.frameConteudo2, fluxogramaAnaliseFragment);
            transaction.commit();
        }
        quemSomosFragment = new QuemSomosFragment();
        if(numero == 7) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.transparente));
            transaction.replace(R.id.frameConteudo2, quemSomosFragment);
            transaction.commit();
        }
    }

    private static void setWindowsFlag(Activity activity, final int Bits, Boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParms = win.getAttributes();
        if(on){
            winParms.flags |= Bits;
        }else{
            winParms.flags &= ~Bits;
        }
        win.setAttributes(winParms);
    }
}