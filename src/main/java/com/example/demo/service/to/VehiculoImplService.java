package com.example.demo.service.to;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class VehiculoImplService implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public List<VehiculoTO> buscarTodos() {
		// TODO Auto-generated method stub
		List<Vehiculo> vehiculos = this.vehiculoRepository.buscarTodos();
		List<VehiculoTO> vehiculosTO = vehiculos.stream().map(vehiculo -> this.convertir(vehiculo))
				.collect(Collectors.toList());

		return vehiculosTO;
	}

	@Override
	public VehiculoTO buscar(String placa) {
		// TODO Auto-generated method stub
		return convertir(this.vehiculoRepository.buscar(placa));
	}

	private VehiculoTO convertir(Vehiculo vehiculo) {
		VehiculoTO vto = new VehiculoTO();
		vto.setId(vehiculo.getId());
		vto.setPlaca(vehiculo.getPlaca());
		vto.setPropietario(vehiculo.getPropietario());
		vto.setTipo(vehiculo.getTipo());
		vto.setColor(vehiculo.getColor());
		return vto;
	}

}
