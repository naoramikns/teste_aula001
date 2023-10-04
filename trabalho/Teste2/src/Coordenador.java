package sistemalogin;

import java.util.ArrayList;
import java.util.List;

public class Coordenador {
    private List<Evento> eventos;

    public Coordenador() {
        this.eventos = new ArrayList<>();
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void criarEvento(String nome, int horasAcc, String data) {
        Evento evento = new Evento(nome, horasAcc, data);
        eventos.add(evento);
    }

    public List<Aluno> getAlunosEvento(Evento evento) {
        List<Aluno> alunos = new ArrayList<>();
        for (Aluno aluno : evento.getAlunos()) {
            if (aluno.getEventos().contains(evento)) {
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    public int getTotalHorasAccAluno(Aluno aluno) {
        int totalHorasAcc = 0;
        for (Evento evento : aluno.getEventos()) {
            totalHorasAcc += evento.getHorasAcc();
        }
        return totalHorasAcc;
    }

    public int getNumeroTotalEventos() {
        return eventos.size();
    }

    public int getNumeroTotalHorasAcc() {
        int totalHorasAcc = 0;
        for (Evento evento : eventos) {
            totalHorasAcc += evento.getHorasAcc();
        }
        return totalHorasAcc;
    }
}
