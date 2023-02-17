package org.example;

import modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //HABILIDADES
        Habilidad habilidadYuumiQ= new Habilidad(2, "PROYECTIL ACECHADOR", 50.0, 120.5, 72.1, TipoHabilidad.DAÑO);
        Habilidad habilidadYuumiE= new Habilidad(4, "¡ACELERA!", 0.0, 0.5, 140.0, TipoHabilidad.CURACION);
        List<Habilidad> habilidadesYuumi= new ArrayList<>();
        habilidadesYuumi.add(habilidadYuumiQ);
        habilidadesYuumi.add(habilidadYuumiE);

        Habilidad habilidadViegoQ= new Habilidad(2, "Hoja del Rey Arruinado", 80.0, 180.3, 30.3, TipoHabilidad.DAÑO);
        Habilidad habilidadViegoW= new Habilidad(3, "Fauces espectrales", 80.0, 300.3, 70.3, TipoHabilidad.BUFO_PODER);
        List<Habilidad> habilidadesViego= new ArrayList<>();
        habilidadesViego.add(habilidadViegoQ);
        habilidadesViego.add(habilidadViegoW);

        Habilidad habilidadKaisaW= new Habilidad(3, "Buscadora del Vacío", 45.0, 110.9, 55.1, TipoHabilidad.DAÑO);
        Habilidad habilidadKaisaR= new Habilidad(5, "Instinto Asesino", 0.0, 0.0, 100.0, TipoHabilidad.BUFO_PODER);
        List<Habilidad> habilidadesKaisa= new ArrayList<>();
        habilidadesKaisa.add(habilidadKaisaW);
        habilidadesKaisa.add(habilidadKaisaR);

        Habilidad habilidadNasusQ= new Habilidad(2, "Golpe Absorbente", 30.4, 110.2, 20.3, TipoHabilidad.DAÑO);
        Habilidad habilidadNasusR= new Habilidad(5, "Furia de las Arenas", 24.0, 240.0, 100.0, TipoHabilidad.BUFO_PODER);
        List<Habilidad> habilidadesNasus= new ArrayList<>();
        habilidadesNasus.add(habilidadNasusQ);
        habilidadesNasus.add(habilidadNasusR);

        Habilidad habilidadPantheonW= new Habilidad(3, "Égida de Zeonia", 60.2, 160.2, 55.5, TipoHabilidad.DAÑO);
        Habilidad habilidadPantheonE= new Habilidad(4, "Golpe Buscacorazones", 100.2, 350.1, 65.3, TipoHabilidad.DAÑO);
        List<Habilidad> habilidadesPantheon= new ArrayList<>();
        habilidadesPantheon.add(habilidadPantheonW);
        habilidadesPantheon.add(habilidadPantheonE);

        //BUILD
        Item itemShurelya = new Item(54, "Ensueño de Shurelya", 200.5, 10.1, 300.0, 250.2);
        Item itemRedencion = new Item(54, "Redención", 150.5, 15.1, 410.0, 250.2);
        List<Item> buildYuumi = new ArrayList<>();
        buildYuumi.add(itemShurelya);
        buildYuumi.add(itemRedencion);

        Item itemReyArruinado = new Item(78, "Espada del Rey Arruinado", 40.1, 0.0, 400.1,0.0);
        Item itemCercenador = new Item(99, "Cercenador Divino", 40.1, 22.0, 400.1,44.4);
        List<Item> buildViego = new ArrayList<>();
        buildViego.add(itemReyArruinado);
        buildViego.add(itemCercenador);

        Item  itemMatakrakens= new Item(211, "Matakrakens", 60.1, 0.0, 150.0, 0.0);
        Item  itemCollector= new Item(251, "Collector", 55.1, 0.0, 20.0, 0.0);
        List<Item> buildKaisa = new ArrayList<>();
        buildKaisa.add(itemMatakrakens);
        buildKaisa.add(itemCollector);

        Item itemRompecascos= new Item(12, "Rompecascos", 50.1, 0.0, 300.4, 0.0);
        List<Item> buildNasus = new ArrayList<>();
        buildNasus.add(itemCercenador);
        buildNasus.add(itemRompecascos);

        Item itemEclipse= new Item(454, "Eclipse", 55.1, 0.0, 8.8, 0.0);
        List<Item> buildPantheon = new ArrayList<>();
        buildPantheon.add(itemEclipse);
        buildPantheon.add(itemReyArruinado);

        //ESCALABILIDAD
        Escalabilidad escalabilidadYuumi = new Escalabilidad(12, 1.5, 3.5, 70.5, 90.3);
        Escalabilidad escalabilidadViego= new Escalabilidad(56, 3.5, 4.0, 95.2, 0.0);
        Escalabilidad escalabilidadKaisa= new Escalabilidad(23, 1.7, 3.0, 86.1, 38.3);
        Escalabilidad escalabilidadNasus= new Escalabilidad(313, 3.5, 3.5, 90.0, 42.1);
        Escalabilidad escalabilidadPantheon= new Escalabilidad(234, 2.9, 3.9, 87.7, 31.4);


        //CAMPEONES
        Personaje yuumi= new Personaje(1, "Yuumi", "La gatita magica", LocalDate.parse("2019-05-14"), 1, 480.0, 400.0, 25.0, 79.0, 55.0, 110.8, 1740.0, 1210.0, Region.BANDLE, habilidadesYuumi, buildYuumi, escalabilidadYuumi);
        Personaje viego= new Personaje(864, "Viego", "el Rey Arruinado", LocalDate.parse("2021-01-23"), 1, 560.0, 0.0, 34.0, 64.0, 55.0, 180.8, 2500.0, 0.0, Region.DESCONOCIDA, habilidadesViego, buildViego, escalabilidadViego);
        Personaje kaisa= new Personaje(231, "Kaisa", "la hija del Vacio", LocalDate.parse("2018-03-07"), 1, 571.0, 344.88 , 28.0, 55.0, 59.0, 190.8, 2023.0, 810.1, Region.DESCONOCIDA, habilidadesKaisa, buildKaisa, escalabilidadKaisa);
        Personaje nasus= new Personaje(343, "Nasus", "el curador de las Arenas", LocalDate.parse("2013-12-13"), 1, 631.0, 326.28 , 34.0, 114.0, 67.0, 168.1, 2399.0, 1380.1, Region.SHURIMA, habilidadesNasus, buildNasus, escalabilidadNasus);
        Personaje pantheon= new Personaje(533, "Pantheon", "la lanza Inquebrantable", LocalDate.parse("2010-02-02"), 1, 650.0, 317.8 , 40.0, 124.7, 64.6, 116.2, 2503.0, 844.1, Region.TARGON, habilidadesPantheon, buildPantheon, escalabilidadPantheon);

        System.out.println(yuumi);
            }

        }

