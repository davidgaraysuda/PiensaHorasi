package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="agreement")
class Agreement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fechaInicio: Date?=null
    var fechaFin: Date?=null
    var state:String?=null
    var companyId:Long?=null
}