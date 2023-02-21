package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Question1 {

    /*
    Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados
     */
    public static Flux<Long> inc(final List<Long> numbers){
    	return Flux.fromIterable(numbers).map(n -> n + 1);
    }
    
    public static void main(String[] args) {
    	List<Long> listaDeLong = Arrays.asList(1L, 2L, 3L, 4L, 5L);
    	inc(listaDeLong).subscribe(System.out::println);
	}

}
