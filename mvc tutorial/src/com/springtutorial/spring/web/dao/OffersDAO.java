package com.springtutorial.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("offersDao")
public class OffersDAO {

	private NamedParameterJdbcTemplate jdbc;

	public OffersDAO() {
		System.out.println("Succssesfuly loaded from DAO.");
	}
	
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Offer> getOfers() {

		MapSqlParameterSource params = new MapSqlParameterSource("name", "name");

		return jdbc.query("select * from offers", params, new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowName) throws SQLException {

				Offer offer = new Offer();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setText(rs.getString("text"));
				offer.setEmail(rs.getString("email"));

				return offer;
			}

		});

	}
	@Transactional
	public int [] createBatch(List<Offer> offers) {
		
		SqlParameterSource [] params =  SqlParameterSourceUtils.createBatch(offers.toArray());
		return jdbc.batchUpdate("insert into offers (name, text, email) values (:name, :text, :email)", params);
		
	}

	public boolean create(Offer offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);

		return jdbc.update("insert into offers (name, text, email) values (:name, :text, :email)", params) == 1;
	}

	public boolean delete(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource("id", id);
		return (int) jdbc.update("delete from offers where id = :id", parameters) == 1;
	}
	
	public boolean update(Offer offer) {
		BeanPropertySqlParameterSource parms = new BeanPropertySqlParameterSource(offer);
		return jdbc.update("update offers set name = :name, text = :text, email = :email where id = :id", parms) == 1;
		
		
	}

}
