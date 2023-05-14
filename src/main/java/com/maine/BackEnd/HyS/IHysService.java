package com.maine.BackEnd.HyS;

import java.util.List;

public interface IHysService {

// Metodos

public List<Hys> verHys();

public void crearHys(Hys hys);

public void editarHys(Hys hys);

public void borrarHys(Integer id);

public Hys buscarHys(Integer id);

    
}
