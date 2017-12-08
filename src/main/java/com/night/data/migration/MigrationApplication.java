package com.night.data.migration;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.night.data.migration.util.HotelDialog;

@EnableTransactionManagement
@SpringBootApplication
public class MigrationApplication {
	
	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		HotelDialog dialog = new HotelDialog();
		dialog.open();
		SpringApplication.run(MigrationApplication.class, args);
	}
}
