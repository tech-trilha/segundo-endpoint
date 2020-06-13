package com.techtrilha.segundoendpoint.controller;

import com.techtrilha.segundoendpoint.model.Remedy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemedyController {

  @GetMapping("/remedies")
  public Remedy generateRemedy() {
    final var remedy = new Remedy();
    remedy.setId(1L);
    remedy.setName("Xarope");
    return remedy;
  }

  @GetMapping("/remedies/{name}")
  public Remedy generateRemedyByName(@PathVariable("name") String name) {
    final var remedy = new Remedy();
    remedy.setId(1L);
    remedy.setName(name);
    return remedy;
  }

}
