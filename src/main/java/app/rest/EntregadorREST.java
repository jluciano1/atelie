package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Entregador
 *
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Entregador")
public class EntregadorREST {

  /**
   * Classe de negócio para manipulação de dados
   *
   * @generated
   */
  @Autowired
  @Qualifier("EntregadorBusiness")
  private EntregadorBusiness entregadorBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Entregador post(@Validated @RequestBody final Entregador entity) throws Exception {
    return entregadorBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Entregador put(@Validated @RequestBody final Entregador entity) throws Exception {
    return entregadorBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{entregadorId}")
  public Entregador put(@Validated @RequestBody final Entregador entity, @PathVariable("entregadorId") java.lang.String entregadorId) throws Exception {
    return entregadorBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{entregadorId}")
  public void delete(@PathVariable("entregadorId") java.lang.String entregadorId) throws Exception {
    entregadorBusiness.delete(entregadorId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )
  public HttpEntity<PagedResources<Entregador>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(entregadorBusiness.list(pageable)), HttpStatus.OK);
  }



  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Entregador get(@PathVariable("id") java.lang.String id) throws Exception {
    return entregadorBusiness.get(id);
  }

}
