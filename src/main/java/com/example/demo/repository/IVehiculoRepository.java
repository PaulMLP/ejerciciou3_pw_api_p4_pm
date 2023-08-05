package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public List<Vehiculo> buscarTodos();
	public Vehiculo buscar(String placa);

}
