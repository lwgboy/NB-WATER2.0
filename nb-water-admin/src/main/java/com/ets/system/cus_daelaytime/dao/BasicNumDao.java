package com.ets.system.cus_daelaytime.dao;

import com.ets.system.cus_daelaytime.entity.nb_delay_time_basicnum;

public interface BasicNumDao {
	public void update(nb_delay_time_basicnum entity);
	public void add(nb_delay_time_basicnum entity);
	public nb_delay_time_basicnum info(String customerId);
}
