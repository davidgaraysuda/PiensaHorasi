package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Agreement
import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.TutorView
import net.magbdigital.sudapractic.repository.AgreementRepository
import net.magbdigital.sudapractic.repository.TutorViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AgreementService {
    @Autowired
    lateinit var agreement Repository: Agreement Repository
    @Autowired
    lateinit var Agreement ViewRepository: Agreement ViewRepository

    fun list(): List<Agreement > {
        return agreement Repository.findAll()
        //return agreement Repository.findAll()
    }
    fun listById (id:Long?): Agreement ?{
        return agreement Repository.findById(id)
    }


    fun save(agreement : Agreement ):Agreement {
        return agreement Repository.save(agreement )
    }
    fun listProfesor(): List<Agreement View> {

        return Agreement ViewRepository.findAll()
    }

    fun update(agreement : Agreement ):Agreement {
        val response =agreement Repository.findById(agreement .id)
        if (response==null){
            throw Exception()
        }else{
            return agreement Repository.save(agreement )
        }
    }

    fun delete(id:Long):Boolean{
        agreement Repository.deleteById(id)
        return true
    }
}


