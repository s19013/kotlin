package com.example.kotlinspringbootdomademo.infrastructure.domarepository

import com.example.kotlinspringbootdomademo.domain.model.Customer
import com.example.kotlinspringbootdomademo.domain.repository.CustomerRepository
import com.example.kotlinspringbootdomademo.infrastructure.doma.dao.CustomerDomaDao
import com.example.kotlinspringbootdomademo.infrastructure.doma.entity.CustomerDomaEntity

class CustomerRepositoryDomalmpl(private val customerDomaDao:CustomerDomaDao):CustomerRepository{
    override fun findAll(): List<Customer> {
        return customerDomaDao.selectAll().map { _mapToModel(it) }
    }

    private fun _mapToModel(domaEntity: CustomerDomaEntity):Customer{
        return Customer(
                id = domaEntity.id,
                name = domaEntity.name,
                email = domaEntity.email,
                phone_number = domaEntity.phone_number,
                github_name = domaEntity.github_name,
                twitter_name = domaEntity.twitter_name,
                main_org = domaEntity.main_org,
                sub_org = domaEntity.sub_org
        )
    }
}
