package com.api.rest.springboot.webflux.servicio;

import com.api.rest.springboot.webflux.documentos.Cliente;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface ClienteService {

    public Flux<Cliente> findAll();

    public Mono<Cliente> findById(String id);

    public Mono<Cliente> save(Cliente cliente);

    public Mono<Void> delete(Cliente cliente);
}
