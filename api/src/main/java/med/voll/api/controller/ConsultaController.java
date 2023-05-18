package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.model.consulta.AgendaDeConsultas;
import med.voll.api.domain.model.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.model.consulta.DadosCancelamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
public class ConsultaController {
    @Autowired
    AgendaDeConsultas agenda;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        var dadosDetalhementoConsulta = agenda.agendar(dados);
        return ResponseEntity.ok(dadosDetalhementoConsulta);
    }
    @DeleteMapping
    @Transactional
    public ResponseEntity cancelar(@RequestBody @Valid DadosCancelamentoConsulta dados) {
        agenda.cancelar(dados);
        return ResponseEntity.noContent().build();
    }
}