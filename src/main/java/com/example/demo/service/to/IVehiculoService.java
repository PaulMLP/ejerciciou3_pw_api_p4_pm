package com.example.demo.service.to;

import java.util.List;

public interface IVehiculoService {
	
	public List<VehiculoTO> buscarTodos();
	public VehiculoTO buscar(String placa);

}
