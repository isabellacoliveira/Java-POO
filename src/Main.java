import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String [] args){
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso de Java da Dio");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java"); 
        mentoria.setDescricao("Mentoria de Java"); 
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }

}