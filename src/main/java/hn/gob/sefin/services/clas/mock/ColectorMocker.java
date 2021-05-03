package hn.gob.sefin.services.clas.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


import hn.gob.sefin.services.clas.pojo.Colector;
import hn.gob.sefin.services.clas.pojo.ColectorWrapper;
import hn.gob.sefin.services.clas.pojo.Contacto;

public class ColectorMocker {
    
    public static Contacto addContacto(Integer i){
        Contacto contacto = new Contacto();
        contacto.setCodigo("AB"+i);
        contacto.setCorreo("lorem@walla.com");
        contacto.setCreadoPor("roque.dalton");
        contacto.setEstado(1);
        contacto.setModificadoPor("sofia.augusta");
        contacto.setNombre("Ricardo Alberto");
        contacto.setPuesto( Math.random()> 0.5 ? "Tecnico": "Ingeniero");
        contacto.setTipo( Math.random()> 0.5 ? "Tecnico": "Negocio");

        return contacto;
    }

    public static ColectorWrapper addColectorWrapper(){
        ColectorWrapper cw = new ColectorWrapper();

        cw.setColector(addColector());
        cw.setMensaje("Listdo de informacion exitosa");
        cw.setRegistros("01");

        return cw;
    }

    public static Colector addColector(){
        Colector colector = new Colector();
        colector.setCodigo((int)Math.ceil(Math.random()*100));
        List<Contacto> contactos = new ArrayList<>();
        IntStream.range(0, 4).forEach(i->{contactos.add(addContacto(i));});
        colector.setContacto(contactos);
        colector.setCreadoPor("roque.daton");
        colector.setDireccion("Boulevard Morazan, edifico 123, Tegucigalpa");
        colector.setEstado(1);
        colector.setModificadoPor("sofia.augustula");
        colector.setNombre("Colector 123");

        return colector;
    }

}
