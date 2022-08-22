package com.example.parks3.data;

import android.provider.MediaStore;

import com.example.parks3.R;
import com.example.parks3.model.Designation;
import com.example.parks3.model.Gender;
import com.example.parks3.model.Image;
import com.example.parks3.model.PersonDummy;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<PersonDummy> personDummyArrayList=new ArrayList<>();
    private ArrayList<Image> images_daniel_craig= new ArrayList<>();
    private ArrayList<Image> images_ana_de_armas=new ArrayList<>();
    private ArrayList<Image> images_lea_seydoux=new ArrayList<>();
    private ArrayList<Image> images_rami_malek=new ArrayList<>();
    private ArrayList<Image> images_lashana_lynch=new ArrayList<>();
    private ArrayList<Image> images_ralph_fiennes=new ArrayList<>();
    private ArrayList<Image> images_ben_whishaw=new ArrayList<>();
    private ArrayList<Image> images_naomie_harris=new ArrayList<>();
    private ArrayList<Image> images_rory_kinnear=new ArrayList<>();
    private ArrayList<Image> images_christoph_waltz=new ArrayList<>();
    private ArrayList<Image> images_billy_magnussen=new ArrayList<>();


    public Inventory() {

        //initializing images for personDummy
        initImages();





        PersonDummy danielCraig= new PersonDummy("Daniel Craig",Gender.MALE,images_daniel_craig);
        PersonDummy leaSeydoux= new PersonDummy("Léa Seydoux", Gender.FEMALE,images_lea_seydoux);
        PersonDummy anaDeArmas= new PersonDummy("Ana De Armas", Gender.FEMALE,images_ana_de_armas);
        PersonDummy ramiMalek= new PersonDummy("Rami Malek", Gender.MALE,images_rami_malek);
        PersonDummy lashanaLynch= new PersonDummy("Lashana Lynch", Gender.FEMALE,images_lashana_lynch);
        PersonDummy ralphFiennes= new PersonDummy("Ralph Fiennes", Gender.MALE,images_ralph_fiennes);
        PersonDummy benWhishaw= new PersonDummy("Ben Whishaw", Gender.MALE,images_ben_whishaw);
        PersonDummy naomieHarris= new PersonDummy("Naomie Harris", Gender.FEMALE,images_naomie_harris);
        PersonDummy roryKinnear= new PersonDummy("Rory Kinnear", Gender.MALE, images_rory_kinnear);
        PersonDummy christophWaltz= new PersonDummy("Christoph Waltz", Gender.MALE,images_christoph_waltz);
        PersonDummy billyMagnussen= new PersonDummy("Billy Magnussen", Gender.MALE,images_billy_magnussen);

        personDummyArrayList.add(danielCraig);
        personDummyArrayList.add(leaSeydoux);
        personDummyArrayList.add(anaDeArmas);
        personDummyArrayList.add(ramiMalek);
        personDummyArrayList.add(lashanaLynch);
        personDummyArrayList.add(ralphFiennes);
        personDummyArrayList.add(benWhishaw);
        personDummyArrayList.add(naomieHarris);
        personDummyArrayList.add(roryKinnear);
        personDummyArrayList.add(christophWaltz);
        personDummyArrayList.add(billyMagnussen);
    }

    private void initImages() {
        initImagesDanielCraig();
        initImagesAnaDeArmas();
        initImagesLeaSeydoux();
        initImagesRamiMalek();
        initImagesLashanaLynch();
        initImagesRalphFiennes();
        initImagesBenWhishaw();
        initImagesNaomieHarris();
        initImagesRoryKinnear();
        initImagesChristophWaltz();
        initImagesBillyMagnussen();


    }

    private void initImagesDanielCraig() {
        //daniel_craig

        Image image_daniel_craig_1=new Image("Daniel Craig",R.drawable.daniel_craig_1,"");
        Image image_daniel_craig_2=new Image("Daniel Craig",R.drawable.daniel_craig_2,"");
        Image image_daniel_craig_3=new Image("Daniel Craig",R.drawable.daniel_craig_3,"");
        Image image_daniel_craig_4=new Image("Daniel Craig",R.drawable.daniel_craig_4,"");
        Image image_daniel_craig_5=new Image("Daniel Craig",R.drawable.daniel_craig_5,"");
        Image image_daniel_craig_6=new Image("Daniel Craig",R.drawable.daniel_craig_6,"");

        images_daniel_craig.add(image_daniel_craig_1);
        images_daniel_craig.add(image_daniel_craig_2);
        images_daniel_craig.add(image_daniel_craig_3);
        images_daniel_craig.add(image_daniel_craig_4);
        images_daniel_craig.add(image_daniel_craig_5);
        images_daniel_craig.add(image_daniel_craig_6);


    }
    private void initImagesAnaDeArmas(){
        //ana_de_armas
        Image ana_de_armas_image_1=new Image("Ana De Armas",R.drawable.ana_de_armas_1,"");
        Image ana_de_armas_image_2=new Image("Ana De Armas",R.drawable.ana_de_armas_2,"");
        Image ana_de_armas_image_3=new Image("Ana De Armas",R.drawable.ana_de_armas_3,"");
        Image ana_de_armas_image_4=new Image("Ana De Armas",R.drawable.ana_de_armas_4,"");
        images_ana_de_armas.add(ana_de_armas_image_1);
        images_ana_de_armas.add(ana_de_armas_image_2);
        images_ana_de_armas.add(ana_de_armas_image_3);
        images_ana_de_armas.add(ana_de_armas_image_4);

    }
    private void initImagesLeaSeydoux(){
        Image lea_seydoux_1=new Image("Lea Seydoux", R.drawable.lea_seydoux_1,"");
        Image lea_seydoux_2=new Image("Lea Seydoux", R.drawable.lea_seydoux_2,"");
        Image lea_seydoux_3=new Image("Lea Seydoux", R.drawable.lea_seydoux_3,"");
        Image lea_seydoux_4=new Image("Lea Seydoux", R.drawable.lea_seydoux_4,"");

        images_lea_seydoux.add(lea_seydoux_1);
        images_lea_seydoux.add(lea_seydoux_2);
        images_lea_seydoux.add(lea_seydoux_3);
        images_lea_seydoux.add(lea_seydoux_4);

    }
    private void initImagesRamiMalek(){
        Image rami_malek_1=new Image("Rami Malek", R.drawable.rami_malek,"");
        images_rami_malek.add(rami_malek_1);
    }
    private void initImagesLashanaLynch(){
        Image lashana_lynch_1=new Image("Lashana Lynch", R.drawable.lashana_lynch,"");
        images_lashana_lynch.add(lashana_lynch_1);
    }
    private void initImagesRalphFiennes(){
        Image ralph_fiennes_1=new Image("Ralph Fiennes", R.drawable.ralph_fiennes,"");
        images_ralph_fiennes.add(ralph_fiennes_1);
    }
    private void initImagesBenWhishaw(){
        Image ben_whishaw_1=new Image("Ben Whishaw", R.drawable.ben_whishaw,"");
        images_ben_whishaw.add(ben_whishaw_1);
    }
    private void initImagesNaomieHarris(){
        Image naomie_harris_1=new Image("Naomie Harris", R.drawable.naomie_harris,"");
        images_naomie_harris.add(naomie_harris_1);
    }
    private void initImagesRoryKinnear(){
        Image rory_kinnear_1=new Image("Rory Kinnear", R.drawable.rory_kinnear,"");
        images_rory_kinnear.add(rory_kinnear_1);
    }
    private void initImagesChristophWaltz(){
        Image christoph_waltz_1=new Image("Christoph Waltz", R.drawable.christoph_waltz,"");
        images_christoph_waltz.add(christoph_waltz_1);
    }
    private void initImagesBillyMagnussen(){
        Image billy_magnussen_1=new Image("Billy Magnussen", R.drawable.billy_magnussen,"");
        images_billy_magnussen.add(billy_magnussen_1);
    }


    public ArrayList<PersonDummy> getPersonDummyArrayList() {
        return personDummyArrayList;
    }
}
