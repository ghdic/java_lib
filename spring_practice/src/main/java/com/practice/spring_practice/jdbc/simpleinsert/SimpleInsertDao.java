package com.practice.spring_practice.jdbc.simpleinsert;


import com.practice.spring_practice.jdbc.Customer;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Repository
public class SimpleInsertDao {
    private SimpleJdbcInsert insertActor;

    public SimpleInsertDao(DataSource dataSource) {
        this.insertActor = new SimpleJdbcInsert(dataSource)
                .withTableName("customers")
                .usingGeneratedKeyColumns("id");
    }

    /**
     * Map +
     * insertActor.executeAndReturnKey
     * id를 포함한 Customer 객체를 반환하세요
     */
    public Customer insertWithMap(Customer customer) {
        Map<String, Object> params = new HashMap<>();
        params.put("first_name", customer.getFirstName());
        params.put("last_name", customer.getLastName());
        Number id = insertActor.executeAndReturnKey(params);

        Customer saved_customer = new Customer(id.longValue(),
                customer.getFirstName(), customer.getLastName());
        return saved_customer;
    }

    /**
     * SqlParameterSource +
     * insertActor.executeAndReturnKey
     * id를 포함한 Customer 객체를 반환하세요
     */
    public Customer insertWithBeanPropertySqlParameterSource(Customer customer) {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("first_name", customer.getFirstName())
                .addValue("last_name", customer.getLastName());
        Number id = insertActor.execute(in);
        Customer saved_customer = new Customer(id.longValue(),
                customer.getFirstName(), customer.getLastName());
        return saved_customer;
    }
}
