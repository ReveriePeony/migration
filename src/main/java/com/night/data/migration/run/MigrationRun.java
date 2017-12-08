package com.night.data.migration.run;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.night.data.migration.service.DataChangeService;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 上午9:49:07
 */
@Component
public class MigrationRun {
	
	@Autowired
	DataChangeService changeService;

	@PostConstruct
	public void run() {
		changeService.hotel();
	}
	
}
