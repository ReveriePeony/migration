package com.night.data.migration.service;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Reverien9@gmail.com
 * 2017年12月6日 上午9:18:29
 */
@Service
public class DataChangeService {
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private OrderService orderService;
	
	@Transactional
	public void hotel() {
		StringBuffer sb = new StringBuffer();
		JFrame frame = new JFrame("console");
		JPanel jPanel = new JPanel();
		jPanel.setBackground(new Color(255, 255, 255));
		frame.setContentPane(jPanel);  
		frame.pack();
//        test.setLocationRelativeTo(null);
		frame.setSize(new Dimension(640, 480));
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        frame.setLocation((screenSize.width - frame.getWidth()) / 2, 
        		(screenSize.height - frame.getHeight()) / 2);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setVisible(true); 
        JTextArea jText = new JTextArea();
        jPanel.add(jText);
        
        sb.append("change start \n");
        jText.setText(sb.toString());
        frame.repaint();
		try {
			sb.append("tHotel run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			hotelService.tHotel();
			
			sb.append("tFileRecord run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			fileService.tFileRecord();
			
			sb.append("tFood run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			foodService.tFood();
			
			sb.append("tHotelSetting run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			hotelService.tHotelSetting();
			
			sb.append("tRoomCalendar run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			roomService.tRoomCalendar();
			
			sb.append("tRoomCategory run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			roomService.tRoomCategory();
			
			sb.append("tRoomOrder run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			orderService.tRoomOrder();
			
			sb.append("tFoodOrder run \n");
			jText.setText(sb.toString());
			frame.repaint(); 
			orderService.tFoodOrder();
		} catch (Exception e) {
			sb.append(e.getMessage() + "\n");
			jText.setText(sb.toString());
			frame.repaint();
			throw new RuntimeException(e.getMessage(), e.getCause());
		}
		sb.append("change end \n");
		jText.setText(sb.toString());
		frame.repaint(); 
	}
	
}

