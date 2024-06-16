package org.ymcasas.springboot.apieventmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ymcasas.springboot.apieventmanager.models.City;
import org.ymcasas.springboot.apieventmanager.repositories.CityRepository;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public City findById(String id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City save(City city) {
        return cityRepository.save(city);
    }

    public void deleteById(String id) {
        cityRepository.deleteById(id);
    }

    @Override
    public Prestamo crearPrestamo(String isbn, String identificacionUsuario) {

        Usuario usuario = usuarioRepositorio.findById(identificacionUsuario)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));

        public Prestamo crearPrestamo(String isbn, String identificacionUsuario) {
            Usuario usuario = usuarioRepository.findById(identificacionUsuario)
                    .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));

            if (usuario.getTipoUsuario() == 3) {
                boolean tienePrestamo = prestamoRepository.existsByUsuarioAndFechaDevolucionAfter(usuario, LocalDate.now());
                if (tienePrestamo) {
                    throw new UsuarioInvitadoPrestamoException("El usuario con identificacion " + identificacionUsuario + " ya tiene un libro prestado por lo cual no se le puede realizar otro prestamo");
                }
            }

            Libro libro = libroRepositorio





        //return null;
    }

}
