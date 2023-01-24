package net.magbdigital.sudapractic.controller
import net.magbdigital.sudapractic.model.*
import net.magbdigital.sudapractic.service.ConvenioService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/convenios")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])
class ConvenioController {
    @Autowired
    lateinit var convenioService: ConvenioService

    @GetMapping
    fun list(): List<Agreement>{
        return convenioService.list()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Agreement?{
        return convenioService.listById(id)
    }
    @GetMapping("/with/profesor")
    fun listPr(): List<ConvenioView>{
        return convenioService.listProfesor()
    }


    @PostMapping
    fun save(@RequestBody convenio: Agreement):Agreement{
        return convenioService.save(convenio)
    }

    @PutMapping
    fun update(@RequestBody convenio: Agreement):Agreement{
        return convenioService.update(convenio)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return convenioService.delete(id)
    }
}