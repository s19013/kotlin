//package com.example.test
//import org.springframework.jdbc.core.JdbcTemplate
//import org.springframework.jdbc.core.RowMapper
//import org.springframework.stereotype.Repository
//
//
//@Repository
//class ConnectMovieStatus(private val jdbcTemplate: JdbcTemplate) {
//    private val rowMapper = RowMapper { rs, _->
//        MovieStatus(rs.getString("name"),rs.getString("time"),rs.getInt("kuuseki") )
//    }
//
//    fun showAll():List<MovieStatus> =
//        jdbcTemplate.query("SELECT name, time, kuuseki FROM moviestatus",rowMapper)
//}