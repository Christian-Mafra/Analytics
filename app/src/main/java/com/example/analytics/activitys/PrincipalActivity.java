package com.example.analytics.activitys;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.analytics.R;
import com.example.analytics.fragments.Conteudo_Fragment;
import com.example.analytics.fragments.Estatistica_Fragment;
import com.example.analytics.fragments.Lista_Fragment;
import com.example.analytics.fragments.Novo_experimento_fragment;
import com.example.analytics.fragments.ViewPagerConteudoFragment;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Novo_experimento_fragment novo_experimento_fragment;
    private ViewPagerConteudoFragment view_pager_conteudo_fragment;
    private Lista_Fragment lista_fragment;
    private Estatistica_Fragment estatistica_fragment;
    EditText buscar;
    private ImageButton imageButton3;
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    private LinearLayout fundo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema_claro));


        imageButton3 = findViewById(R.id.imageButton3);
        fundo = findViewById(R.id.fundo);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            int card7 = 0;
            public void onClick(View view) {
                if (card7 == 0) {
                    //setBackgroundColor(Color.argb(255, 255, 255, 255));
                    fundo.setBackground(getDrawable(R.drawable.background_fundo_buy));
                    getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                    getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.fundo_buy));
                    card7 = 1;
                } else {
                    fundo.setBackground(getDrawable(R.drawable.background_fundo));
                    getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema));
                    getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema));
                    card7 = 0;
                }
            }
        });

        novo_experimento_fragment = new Novo_experimento_fragment();
        view_pager_conteudo_fragment = new ViewPagerConteudoFragment();
        lista_fragment = new Lista_Fragment();
        estatistica_fragment = new Estatistica_Fragment();


        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        viewPagerAdapter.addFragments(view_pager_conteudo_fragment,"");
        viewPagerAdapter.addFragments(lista_fragment,"");
        viewPagerAdapter.addFragments(estatistica_fragment,"");
        viewPagerAdapter.addFragments(novo_experimento_fragment,"");
        viewPager.setAdapter(viewPagerAdapter);


        View headerView = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.custom_tab, null, false);

        LinearLayout linearLayoutOne = (LinearLayout) headerView.findViewById(R.id.ll);
        LinearLayout linearLayout2 = (LinearLayout) headerView.findViewById(R.id.ll2);
        LinearLayout linearLayout3 = (LinearLayout) headerView.findViewById(R.id.ll3);
        LinearLayout linearLayout4 = (LinearLayout) headerView.findViewById(R.id.ll332);

        View headerView2 = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.custom_tab_f, null, false);

        LinearLayout linearLayoutOneOne = (LinearLayout) headerView2.findViewById(R.id.aaaa);
        LinearLayout linearLayout22 = (LinearLayout) headerView2.findViewById(R.id.bbbb);
        LinearLayout linearLayout33 = (LinearLayout) headerView2.findViewById(R.id.cccc);
        LinearLayout linearLayout44 = (LinearLayout) headerView2.findViewById(R.id.dddd);

        tabLayout.getTabAt(0).setCustomView(linearLayoutOne);
        tabLayout.getTabAt(1).setCustomView(linearLayout22);
        tabLayout.getTabAt(2).setCustomView(linearLayout33);
        tabLayout.getTabAt(3).setCustomView(linearLayout44);

        buscar = findViewById(R.id.buscaPrincipais);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if(tab.getPosition()==0){
                    tabLayout.getTabAt(0).setCustomView(null);
                    tabLayout.getTabAt(0).setCustomView(linearLayoutOne);
                }
                if(tab.getPosition()==1){
                    tabLayout.getTabAt(1).setCustomView(null);
                    tabLayout.getTabAt(1).setCustomView(linearLayout2);
                }
                if(tab.getPosition()==2){
                    tabLayout.getTabAt(2).setCustomView(null);
                    tabLayout.getTabAt(2).setCustomView(linearLayout3);
                }
                if(tab.getPosition()==3){
                    tabLayout.getTabAt(3).setCustomView(null);
                    tabLayout.getTabAt(3).setCustomView(linearLayout4);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if(tab.getPosition()==0){
                    tabLayout.getTabAt(0).setCustomView(null);
                    tabLayout.getTabAt(0).setCustomView(linearLayoutOneOne);
                }
                if(tab.getPosition()==1){
                    tabLayout.getTabAt(1).setCustomView(null);
                    tabLayout.getTabAt(1).setCustomView(linearLayout22);
                }
                if(tab.getPosition()==2){
                    tabLayout.getTabAt(2).setCustomView(null);
                    tabLayout.getTabAt(2).setCustomView(linearLayout33);
                }
                if(tab.getPosition()==3){
                    tabLayout.getTabAt(3).setCustomView(null);
                    tabLayout.getTabAt(3).setCustomView(linearLayout44);
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        BadgeDrawable badgeDrawable = tabLayout.getTabAt(0).getOrCreateBadge();
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(7);


    }

    private class ViewPagerAdapter extends FragmentPagerAdapter{
        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitulo = new ArrayList<>();


        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        private void addFragments(Fragment fragment, String titulo){
            fragments.add(fragment);
            fragmentTitulo.add(titulo);
        };

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitulo.get(position);
        }
    }




}
