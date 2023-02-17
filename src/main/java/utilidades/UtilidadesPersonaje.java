package utilidades;

import modelos.Personaje;
import modelos.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UtilidadesPersonaje {

    public static Personaje levelUp (Personaje personaje){
        Personaje personajeAMostrar = personaje;
        if (personaje.getNivel() >=1){
            Integer incrementoNivel = personaje.getNivel()+1;
            Double ataque2 = (personaje.getAtaqueBase()+personaje.getEscalabilidad().getIncrementoDañoNivel())*incrementoNivel;
            Double defensa2 = (personaje.getDefensaBase()+personaje.getEscalabilidad().getIncrementoDefensaNivel())*incrementoNivel;
            Double vida2 = (personaje.getVidaBase()+personaje.getEscalabilidad().getIncrementoSaludNivel())*incrementoNivel;
            Double mana2 = (personaje.getManaBase()+personaje.getEscalabilidad().getIncrementoManaNivel())*incrementoNivel;

            personajeAMostrar.setNivel(incrementoNivel);
            personajeAMostrar.setDefensa(defensa2);
            personajeAMostrar.setAtaque(ataque2);
            personajeAMostrar.setVida(vida2);
            personajeAMostrar.setMana(mana2);
        }
        return personajeAMostrar;
    }

    public static Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){
        Map<Region, List<Personaje>> mapaAMostrar = new HashMap<>();
        for (Personaje cosa : personajes){
            if (mapaAMostrar.containsKey(cosa.getRegion())){
                mapaAMostrar.get(cosa.getRegion()).add(cosa);
            }else{
                mapaAMostrar.put(cosa.getRegion(), new ArrayList<>());
                mapaAMostrar.get(cosa.getRegion()).add(cosa);
            }
        }
        return mapaAMostrar;
    }

    public static Personaje diferenciaNivel (Personaje personaje){
        Personaje personajeAMostrar = personaje;
        Integer contador = 18;

            Double ataque2 = (personaje.getAtaqueBase()+personaje.getEscalabilidad().getIncrementoDañoNivel())*contador;
            Double defensa2 = (personaje.getDefensaBase()+personaje.getEscalabilidad().getIncrementoDefensaNivel())*contador;
            Double vida2 = (personaje.getVidaBase()+personaje.getEscalabilidad().getIncrementoSaludNivel())*contador;
            Double mana2 = (personaje.getManaBase()+personaje.getEscalabilidad().getIncrementoManaNivel())*contador;

            personajeAMostrar.setNivel(18);
            personajeAMostrar.setDefensa(defensa2);
            personajeAMostrar.setAtaque(ataque2);
            personajeAMostrar.setVida(vida2);
            personajeAMostrar.setMana(mana2);

        return personajeAMostrar;
    }

    public static Personaje getMasPoderoso(List<Personaje> personaje){
        Personaje mostrar = null;

        for (Personaje coso : personaje) {
            diferenciaNivel((Personaje) personaje);
            double sumaEstadisticas = ((Personaje) personaje).getAtaque()+((Personaje) personaje).getDefensa()+((Personaje) personaje).getVida()+((Personaje) personaje).getMana();
            if(mostrar == null || sumaEstadisticas > (mostrar.getAtaque()+mostrar.getDefensa()+mostrar.getVida()+mostrar.getMana())){
                mostrar = (Personaje) personaje;
            }
        }

        return mostrar;
    }

    public Map<Region, List<Personaje>> getMasPoderosoPorRegion(List<Personaje> personajes){

        //Agrupar los personajes por region
        Map<Region, List<Personaje>> mapa = getPersonajesPorRegion(personajes);


        for(Region region: mapa.keySet()){

            List<Personaje> personajesDeMiRegion = mapa.get(region);

            Personaje elMasPoderosoRegion = getMasPoderoso(personajesDeMiRegion);

            mapa.get(region).retainAll(List.of(elMasPoderosoRegion));

        }

        return mapa;

    }

    }

