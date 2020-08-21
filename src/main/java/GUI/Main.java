package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import GRPC.LightServer;
import GRPC.HeatingServer;
import GRPC.ProjectorServer;
import Models.Light;
import Models.Heating;
import Models.Projector;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import org.DS.garyproject.SmartBuildingGRPC.*;

import io.grpc.stub.StreamObserver;
import jmDNS.Registering;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import java.awt.Color;


public class Main {
	
	private JFrame frame;
	private JTextField appliance_name_text;
	private JTextField appliance_onOff_text;
	private JTextField appliance_extra_op_text;
	private JTextField appliance_extra_op2_text;
	
	private static ProjectorServiceGrpc.ProjectorServiceBlockingStub projector_blockingStub;
	private static ProjectorServiceGrpc.ProjectorServiceStub projector_asyncStub;
	private static ProjectorServiceGrpc.ProjectorServiceFutureStub projector_futureStub;
	
	private static LightServiceGrpc.LightServiceBlockingStub light_blockingStub;
	private static LightServiceGrpc.LightServiceStub light_asyncStub;
	private static LightServiceGrpc.LightServiceFutureStub light_futureStub;
	
	private static HeatingServiceGrpc.HeatingServiceBlockingStub heating_blockingStub;
	private static HeatingServiceGrpc.HeatingServiceStub heating_asyncStub;
	private static HeatingServiceGrpc.HeatingServiceFutureStub heating_futureStub;
	
	private static SecuritycameraServiceGrpc.SecuritycameraServiceBlockingStub securitycamera_blockingStub;
	private static SecuritycameraServiceGrpc.SecuritycameraServiceStub securitycamera_asyncStub;
	private static SecuritycameraServiceGrpc.SecuritycameraServiceFutureStub securitycamera_futureStub;
	
	private JTextField projectorName_tf;
	private JTextField heatingName_tf;
	private JTextField camName_tf;
	private JTextField lightName_tf;
	
	public JLabel projectorInfo_name;
	public JLabel projectorInfo_status;
	public JLabel projectorInfo_volume;
	public JLabel projectorInfo_channel;
	
	public JLabel lightInfo_name;
	public JLabel lightInfo_status;
	public JLabel lightInfo_brightness;
	
	public JLabel camInfo_name;
	public JLabel camInfo_status;
	public JLabel camInfo_volume;
	public JLabel camInfo_camera;
	
	public JLabel heatingInfo_name;
	public JLabel heatingInfo_status;
	public JLabel heatingInfo_temperature;
	public JLabel heatingInfo_speed;
	
	int heatingPort =1234;
	int projectorPort =1235;
	int lightPort =1236;
	int camPort =1237;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Main() throws InterruptedException, IOException {
		initialize();
		Registering r = new Registering();
		//Start Appliance Registry, GRPC servers and channels then unregister
		r.jmndsRegister(heatingPort, projectorPort, lightPort, camPort);
		startGRPCServers();
		channels();
		r.unRegister();
		loadInitialAppliances();
	}
	
	public void startGRPCServers() throws IOException, InterruptedException {
		ProjectorServer.startDiscovery();
		LightServer.startDiscovery();
		HeatingServer.startDiscovery();

	}
	public void loadInitialAppliances() throws IOException, InterruptedException {
		initialHeating();
		initialProjector();
		initialLight();
	}
	
	public void channels() {
		
		System.out.println("CHANNELS STARTING");
		ManagedChannel projectorChannel = ManagedChannelBuilder.forAddress("localhost",projectorPort).usePlaintext().build();
		ManagedChannel lightChannel = ManagedChannelBuilder.forAddress("localhost", lightPort).usePlaintext().build();
		ManagedChannel heatingChannel = ManagedChannelBuilder.forAddress("localhost", heatingPort).usePlaintext().build();
		ManagedChannel camChannel = ManagedChannelBuilder.forAddress("localhost", camPort).usePlaintext().build();

		projector_blockingStub = ProjectorServiceGrpc.newBlockingStub(projectorChannel);
		projector_asyncStub = ProjectorServiceGrpc.newStub(projectorChannel);
		projector_futureStub = ProjectorServiceGrpc.newFutureStub(projectorChannel);
		
		light_blockingStub = LightServiceGrpc.newBlockingStub(lightChannel);
		light_asyncStub = LightServiceGrpc.newStub(lightChannel);
		light_futureStub = LightServiceGrpc.newFutureStub(lightChannel);
		
		heating_blockingStub = HeatingServiceGrpc.newBlockingStub(heatingChannel);
		heating_asyncStub = HeatingServiceGrpc.newStub(heatingChannel);
		heating_futureStub = HeatingServiceGrpc.newFutureStub(heatingChannel);
		
		securitycamera_blockingStub = SecuritycameraServiceGrpc.newBlockingStub(camChannel);
		securitycamera_asyncStub = SecuritycameraServiceGrpc.newStub(camChannel);
		securitycamera_futureStub = SecuritycameraServiceGrpc.newFutureStub(camChannel);

	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 468, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		/*Heading Label*/
		JLabel headLabel = new JLabel("Smart Building");
		headLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		headLabel.setBounds(101, 11, 245, 14);
		frame.getContentPane().add(headLabel);
		
		JLabel controller_lbl = new JLabel("Appliance Controls");
		controller_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		controller_lbl.setBounds(10, 64, 143, 14);
		frame.getContentPane().add(controller_lbl);
		
		JLabel appliance_name_lbl = new JLabel("Appliance Name");
		appliance_name_lbl.setBounds(56, 89, 83, 14);
		frame.getContentPane().add(appliance_name_lbl);
		
		JLabel volume_lbl = new JLabel("Volume");
		volume_lbl.setBounds(275, 90, 48, 14);
		frame.getContentPane().add(volume_lbl);
		
		JLabel lblChannel = new JLabel("Channel");
		lblChannel.setBounds(370, 90, 48, 14);
		frame.getContentPane().add(lblChannel);
		
		JLabel appliance_name2_lblabel = new JLabel("Appliance Name");
		appliance_name2_lblabel.setBounds(56, 135, 83, 14);
		frame.getContentPane().add(appliance_name2_lblabel);
		
		JLabel appliance_status2_lbl = new JLabel("Appliance Status");
		appliance_status2_lbl.setBounds(170, 135, 83, 14);
		frame.getContentPane().add(appliance_status2_lbl);
		
		JLabel temperature_lbl = new JLabel("Temperature");
		temperature_lbl.setBounds(270, 135, 48, 14);
		frame.getContentPane().add(temperature_lbl);
		
		JLabel speed_lbl = new JLabel("Speed");
		speed_lbl.setBounds(370, 135, 38, 14);
		frame.getContentPane().add(speed_lbl);
		
		JLabel appliance_name3_lbl = new JLabel("Appliance Name");
		appliance_name3_lbl.setBounds(56, 180, 83, 14);
		frame.getContentPane().add(appliance_name3_lbl);
		
		JLabel volume_2_lbl = new JLabel("Volume");
		volume_2_lbl.setBounds(270, 180, 48, 14);
		frame.getContentPane().add(volume_2_lbl);
		
		JLabel lblCamera = new JLabel("Camera");
		lblCamera.setBounds(355, 180, 63, 14);
		frame.getContentPane().add(lblCamera);
		
		JLabel appliance_status3_lbl = new JLabel("Appliance Status");
		appliance_status3_lbl.setBounds(170, 180, 83, 14);
		frame.getContentPane().add(appliance_status3_lbl);
		
		JLabel appliance_name4_lbl = new JLabel("Appliance Name");
		appliance_name4_lbl.setBounds(56, 225, 83, 14);
		frame.getContentPane().add(appliance_name4_lbl);
		
		JLabel appliance_status4_lbl = new JLabel("Appliance Status");
		appliance_status4_lbl.setBounds(170, 225, 83, 14);
		frame.getContentPane().add(appliance_status4_lbl);
		
		JLabel lblBrigtness = new JLabel("Brightness");
		lblBrigtness.setBounds(254, 225, 72, 14);
		frame.getContentPane().add(lblBrigtness);
		
		//////////////////////
		//Projector Volume Buttons
		//////////////////////
		JButton projector_volumeUp_btn = new JButton("+");
		projector_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		projector_volumeUp_btn.setBounds(290, 104, 38, 20);
		frame.getContentPane().add(projector_volumeUp_btn);
		projector_volumeUp_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println(+1);
			changeVolume(1,"Projector");
		}
		});

		JButton projector_volumeDown_btn = new JButton("-");
		projector_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		projector_volumeDown_btn.setBounds(254, 104, 38, 20);
		frame.getContentPane().add(projector_volumeDown_btn);
		projector_volumeDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeVolume(-1,"Projector");
			}
		});
		
		//////////////////////
		//Heating Temperature Buttons
		//////////////////////
		JButton heating_temperatureDown_btn = new JButton("-");
		heating_temperatureDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		heating_temperatureDown_btn.setBounds(254, 149, 38, 20);
		frame.getContentPane().add(heating_temperatureDown_btn);
		heating_temperatureDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeTemperature(-1);
			}
		});
		
		JButton heating_temperatureUp_btn = new JButton("+");
		heating_temperatureUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		heating_temperatureUp_btn.setBounds(290, 149, 38, 20);
		frame.getContentPane().add(heating_temperatureUp_btn);
		heating_temperatureUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeTemperature(1);}
		});
		
		//////////////////////
		//Camera Volume Buttons
		//////////////////////
		JButton camera_volumeUp_btn = new JButton("+");
		camera_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		camera_volumeUp_btn.setBounds(290, 194, 38, 20);
		frame.getContentPane().add(camera_volumeUp_btn);
		camera_volumeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(+1);
		    	changeVolume(1,"Securitycamera");
		    	}
			
		});
		
		JButton camera_volumeDown_btn = new JButton("-");
		camera_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		camera_volumeDown_btn.setBounds(254, 194, 38, 20);
		frame.getContentPane().add(camera_volumeDown_btn);
		camera_volumeDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(-1);
		    	changeVolume(-1,"Securitycamera");
		    	}
			
		});
		
		/////////////
		//Text Fields
		/////////////
		projectorName_tf = new JTextField();
		projectorName_tf.setBounds(56, 105, 86, 20);
		frame.getContentPane().add(projectorName_tf);
		projectorName_tf.setColumns(10);
		projectorName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					System.out.println("changedUpdate "+ projectorName_tf.getText());
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(projectorName_tf.getText(),"Projector");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+ projectorName_tf.getText());
					  changeApplianceName(projectorName_tf.getText(),"Projector");

				  }

	
				});		
		
		heatingName_tf = new JTextField();
		heatingName_tf.setColumns(10);
		heatingName_tf.setBounds(56, 150, 86, 20);
		frame.getContentPane().add(heatingName_tf);
		heatingName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(heatingName_tf.getText(),"Heating");
				  }
				  public void insertUpdate(DocumentEvent e) {
				
					  changeApplianceName(heatingName_tf.getText(),"Heating");
				  }

	
				});	
		
		camName_tf = new JTextField();
		camName_tf.setColumns(10);
		camName_tf.setBounds(56, 194, 86, 20);
		frame.getContentPane().add(camName_tf);
		camName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(camName_tf.getText(),"Securitycamera");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+camName_tf.getText());
					  changeApplianceName(camName_tf.getText(),"Securitycamera");
				  }

	
				});
		
		lightName_tf = new JTextField();
		lightName_tf.setColumns(10);
		lightName_tf.setBounds(56, 238, 86, 20);
		frame.getContentPane().add(lightName_tf);
		lightName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(lightName_tf.getText(),"Light");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  changeApplianceName(lightName_tf.getText(),"Light");
				  }

	
				});
		
		/////////////////////////
		//Light Brightness Buttons
		/////////////////////////
		JButton light_brightnessDown_btn = new JButton("-");
		light_brightnessDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		light_brightnessDown_btn.setBounds(254, 240, 38, 20);
		frame.getContentPane().add(light_brightnessDown_btn);
		light_brightnessDown_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println(-1);
		    	changeBrightness(-1);
		    }
		});
		
		JButton light_brightnessUp_btn = new JButton("+");
		light_brightnessUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		light_brightnessUp_btn.setBounds(290, 240, 38, 20);
		frame.getContentPane().add(light_brightnessUp_btn);
		light_brightnessUp_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println(1);
		    	changeBrightness(1);
		    }
		});
		
		
		JLabel lblProjector = new JLabel("Projector");
		lblProjector.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblProjector.setBounds(4, 105, 36, 14);
		frame.getContentPane().add(lblProjector);
		
		JLabel lblHeating = new JLabel("Heating");
		lblHeating.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblHeating.setBounds(4, 155, 45, 14);
		frame.getContentPane().add(lblHeating);
		
		JLabel lblSecuritycamera = new JLabel("Cameras");
		lblSecuritycamera.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSecuritycamera.setBounds(4, 200, 56, 14);
		frame.getContentPane().add(lblSecuritycamera);
		
		JLabel lblLight = new JLabel("Light");
		lblLight.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLight.setBounds(4, 241, 45, 14);
		frame.getContentPane().add(lblLight);
		
		JLabel label = new JLabel("Projector");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(10, 313, 36, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Heating");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(10, 357, 45, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Cameras");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_2.setBounds(10, 402, 76, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Light");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_3.setBounds(10, 439, 45, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblApplianceStatus = new JLabel("Appliance Info");
		lblApplianceStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApplianceStatus.setBounds(10, 288, 143, 14);
		frame.getContentPane().add(lblApplianceStatus);
		
		
		final JToggleButton projectorOnOff_tgl = new JToggleButton("On");
		projectorOnOff_tgl.setSelected(true);
		projectorOnOff_tgl.setBounds(160, 104, 86, 20);
		frame.getContentPane().add(projectorOnOff_tgl);
		projectorOnOff_tgl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent event) {
				if (projectorOnOff_tgl.isSelected()){
					 projectorOnOff_tgl.setText("On");
					 onOff(true,"Projector");
	            } 
				 else {
	            	projectorOnOff_tgl.setText("Off");
					 onOff(false,"Projector");
	            }
				
			}
	    });
		
		final JToggleButton heatingOnOff_tgl = new JToggleButton("On");
		heatingOnOff_tgl.setSelected(true);
		heatingOnOff_tgl.setBounds(160, 149, 86, 20);
		frame.getContentPane().add(heatingOnOff_tgl);
		heatingOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (heatingOnOff_tgl.isSelected()){
					 heatingOnOff_tgl.setText("On");
					 onOff(true,"Heating");

	            } else {
	            	heatingOnOff_tgl.setText("Off");
	            	 onOff(false,"Heating");
	            }
				
			}
	    });
		
		final JToggleButton cameraOnOff_tgl = new JToggleButton("On");
		cameraOnOff_tgl.setSelected(true);
		cameraOnOff_tgl.setBounds(160, 194, 86, 20);
		frame.getContentPane().add(cameraOnOff_tgl);
		cameraOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (cameraOnOff_tgl.isSelected()){
					 cameraOnOff_tgl.setText("On");
					 onOff(true,"Securitycamera");

	            } else {
	            	cameraOnOff_tgl.setText("Off");
					 onOff(false,"Securitycamera");

	            }
				
			}
	    });
		
		final JToggleButton lightOnOff_tgl = new JToggleButton("On");
		lightOnOff_tgl.setSelected(true);
		lightOnOff_tgl.setBounds(160, 240, 86, 20);
		frame.getContentPane().add(lightOnOff_tgl);
		lightOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (lightOnOff_tgl.isSelected()){
					 lightOnOff_tgl.setText("On");
					 onOff(true,"Light");
	            } else {
	            	lightOnOff_tgl.setText("Off");
	            	onOff(false,"Light");
	            }
				
			}
	    });
		
		JButton heating_speedDown_btn = new JButton("-");
		heating_speedDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		heating_speedDown_btn.setBounds(345, 149, 38, 20);
		frame.getContentPane().add(heating_speedDown_btn);
		heating_speedDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeSpeed(-1);
			}
		});
		
		JButton heating_speedUp_btn = new JButton("+");
		heating_speedUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		heating_speedUp_btn.setBounds(381, 149, 38, 20);
		frame.getContentPane().add(heating_speedUp_btn);
		heating_speedUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeSpeed(1);}
		});
		
		JButton projectorChannelDown_btn = new JButton("-");
		projectorChannelDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		projectorChannelDown_btn.setBounds(355, 104, 38, 20);
		frame.getContentPane().add(projectorChannelDown_btn);
		projectorChannelDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	System.out.println(1);
		    	changeChannel(-1);
			}
		});
		
		JButton projectorChannelUp_btn = new JButton("+");
		projectorChannelUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		projectorChannelUp_btn.setBounds(391, 104, 38, 20);
		frame.getContentPane().add(projectorChannelUp_btn);
		projectorChannelUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeChannel(1);
			}
		});
		
		String[] appNames = {"Select a Camera","Offices", "Garage", "Entrance", "Exit", "Roof", "Stairs" };
		JComboBox appList = new JComboBox(appNames);
		appList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		appList.setBounds(345, 194, 86, 20);
		frame.getContentPane().add(appList);
		appList.addActionListener(new ActionListener()  {
			
		    public void actionPerformed(ActionEvent e) {
		        JComboBox cb = (JComboBox)e.getSource();
		        String appName = (String)cb.getSelectedItem();
		        changeCamera(appName);	
}		
	});
		
		JLabel lblApplianceStatus_1 = new JLabel("Appliance Status");
		lblApplianceStatus_1.setBounds(170, 90, 83, 14);
		frame.getContentPane().add(lblApplianceStatus_1);
		
		heatingInfo_name = new JLabel("Appliance Name");
		heatingInfo_name.setBounds(10, 377, 111, 14);
		frame.getContentPane().add(heatingInfo_name);
		
		heatingInfo_status = new JLabel("Appliance Status");
		heatingInfo_status.setBounds(125, 377, 90, 14);
		frame.getContentPane().add(heatingInfo_status);
		
		heatingInfo_temperature = new JLabel("Volume");
		heatingInfo_temperature.setBounds(220, 377, 90, 14);
		frame.getContentPane().add(heatingInfo_temperature);
		
		heatingInfo_speed = new JLabel("Speed");
		heatingInfo_speed.setBounds(320, 377, 38, 14);
		frame.getContentPane().add(heatingInfo_speed);
		
		projectorInfo_name= new JLabel("Appliance Name");
		projectorInfo_name.setBounds(10, 332, 111, 14);
		frame.getContentPane().add(projectorInfo_name);
		
		projectorInfo_status = new JLabel("Appliance Status");
		projectorInfo_status.setBounds(125,332, 90, 14);
		frame.getContentPane().add(projectorInfo_status);
		
		projectorInfo_volume = new JLabel("Volume");
		projectorInfo_volume.setBounds(220, 332, 90, 14);
		frame.getContentPane().add(projectorInfo_volume);
		
		projectorInfo_channel = new JLabel("Channel");
		projectorInfo_channel.setBounds(320, 332, 98, 14);
		frame.getContentPane().add(projectorInfo_channel);
		
		camInfo_name = new JLabel("Appliance Name");
		camInfo_name.setBounds(10, 418, 111, 14);
		frame.getContentPane().add(camInfo_name);
		
		camInfo_status = new JLabel("Appliance Status");
		camInfo_status.setBounds(125, 418, 83, 14);
		frame.getContentPane().add(camInfo_status);
		
		camInfo_volume = new JLabel("Volume");
		camInfo_volume.setBounds(220, 418, 83, 14);
		frame.getContentPane().add(camInfo_volume);
		
		camInfo_camera = new JLabel("Camera");
		camInfo_camera.setBounds(320, 418, 98, 14);
		frame.getContentPane().add(camInfo_camera);
		
		lightInfo_name = new JLabel("Appliance Name");
		lightInfo_name.setBounds(10, 458, 111, 14);
		frame.getContentPane().add(lightInfo_name);
		
		lightInfo_status = new JLabel("Appliance Status");
		lightInfo_status.setBounds(125, 458, 90, 14);
		frame.getContentPane().add(lightInfo_status);
		
		lightInfo_brightness = new JLabel("Brightness");
		lightInfo_brightness.setBounds(220, 458, 103, 14);
		frame.getContentPane().add(lightInfo_brightness);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 357, 432, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 402, 432, 2);
		frame.getContentPane().add(separator_1);
			
	}
		
	///////////////////
	//GRPC Methods
	///////////////////
	
	public void changeApplianceName(String newName, String appliance) {

		System.out.println("New Name "+ newName);
		System.out.println("Appliance "+ appliance);

		stringRequest req = stringRequest.newBuilder().setText(newName).build();
		System.out.println("Changing appliance Name");
		
		if(appliance.equals("Projector")) {
			System.out.println("Appliance is a Projector");
			stringRequest request = stringRequest.newBuilder().setText(newName).build();
			StreamObserver<stringResponse> responseObserver = new StreamObserver<stringResponse>() {

				@Override
				public void onNext(stringResponse value) {
					// TODO Auto-generated method stub
					System.out.println(" on next Projector Response " + value.getText());
					projectorInfo_name.setText("Name: "+ value.getText());
				}
	
				@Override
				public void onError(Throwable t) {
					System.out.println("Error with name connection for projector ");
				}
	
				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("On completed for projector name");
				}
			
			};
			projector_asyncStub.changeApplianceName(request,responseObserver);
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				System.out.println("Connection Interrupted");

			}
		}
		
		else if(appliance.equals("Heating")) {
			System.out.println("Appliance is Heating");
			stringResponse response = heating_blockingStub.changeApplianceName(req);
				System.out.println("Heating Response "+response.getText());
		        heatingInfo_name.setText("Name: "+response.getText());

		}
		else if(appliance.equals("Light")) {
			System.out.println("Appliance is a Light");
			stringResponse response = light_blockingStub.changeApplianceName(req);
			System.out.println("Light Response "+response.getText());
	        lightInfo_name.setText("Name: "+response.getText());

		}
		else if(appliance.equals("Securitycamera")) {
			stringResponse response = securitycamera_blockingStub.changeApplianceName(req);
			System.out.println("Camera Response "+response.getText());
	        camInfo_name.setText("Name: "+response.getText());
		}
		
				
	}
	
	public void changeVolume(int volume, String appliance) {
		valueRequest req = valueRequest.newBuilder().setLength(volume).build();
		System.out.println("Changing volume");

		if(appliance.equals("Projector")) {
			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String vol = String.valueOf(value.getLength());
			        projectorInfo_volume.setText("Volume"+vol);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing volume");
				}
				
				
			};
			//Handle appliance to work with

			 projector_asyncStub.changeVolume(req, response);			
				System.out.println("Projector response "+req.getLength());

		}else if(appliance.equals("Securitycamera")) {
			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String vol = String.valueOf(value.getLength());
			        camInfo_volume.setText("Volume: "+vol);
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing volume");
				}
				
				
			};
				securitycamera_asyncStub.changeVolume(req, response);
				System.out.println("Camera Response"+req.getLength());
		}

	}
	
	public void changeBrightness(int value) {
		valueRequest req = valueRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Brightness");
		StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {

			@Override
			public void onNext(valueResponse value) {
				System.out.println("Receiving "+value);
				String brightness = String.valueOf(value.getLength());
		        lightInfo_brightness.setText("Brightness: "+brightness);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Completed changing brightness");
			}
			
		};
		light_asyncStub.changeBrightness(req, response);


	}
	
	public void changeChannel(int value) {
		valueRequest req = valueRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Channel");
		
		Iterator<valueResponse> response;
		//Error Handling
		try {
			 response =projector_blockingStub.changeChannel(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}
		
		System.out.println("Projector channel response"+((DocumentEvent) response).getLength());
		String channel = String.valueOf(((DocumentEvent) response).getLength());
        projectorInfo_channel.setText("Channel No: "+channel);


	}
	
	public void changeTemperature(int temperature) {
		valueRequest req = valueRequest.newBuilder().setLength(temperature).build();
		System.out.println("Changing temperature");

			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String temp = String.valueOf(value.getLength());
			        heatingInfo_temperature.setText("Temperature"+temp);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing temperature");
				}
				
				
			};
			//Handle appliance to work with

			heating_asyncStub.changeTemperature(req, response);			
			System.out.println("Channel response "+req.getLength());

	}

	public void changeCamera(String camera) {
		stringRequest req = stringRequest.newBuilder().setText(camera).build();
		System.out.println("Changing application to "+ req.getText());

			StreamObserver<stringResponse> response = new StreamObserver<stringResponse>() {
				
				@Override
				public void onNext(stringResponse str) {
					System.out.println("Receiving "+str);
					String cam = String.valueOf(str.getText());
			        camInfo_camera.setText("Camera"+cam);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing camera");
				}
				
				
			};
			//Handle appliance to work with

			securitycamera_asyncStub.changeCamera(req, response);			
			System.out.println("Channel response "+req.getText());

	}
	
	
	/*public void changeCamera(String camera) {
		stringRequest req = stringRequest.newBuilder().setText(camera).build();
		System.out.println("Changing application to "+ req.getText());
		stringResponse response;
		
		
		//Error Handling
		try {
			 response = securitycamera_blockingStub.changeCamera(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}
		System.out.println("Camera response"+(response).getText());
		String cam = String.valueOf((response).getText());
        camInfo_camera.setText("Cam: "+cam);

	}*/
	
	public void changeSpeed(int speed) {
		valueRequest req = valueRequest.newBuilder().setLength(speed).build();
		System.out.println("Changing speed");

			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String spd = String.valueOf(value.getLength());
			        heatingInfo_speed.setText("Speed"+spd);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing speed");
				}
				
				
			};
			//Handle appliance to work with

			heating_asyncStub.changeSpeed(req, response);			
			System.out.println("Speed response "+req.getLength());

	}
	
	public void onOff(boolean onOff, String appliance) {
		booleanRequest req = booleanRequest.newBuilder().setMsg(onOff).build();
		System.out.println("On Off");

	//Handle appliance to work with
		if(appliance.equals("Projector")) {
			booleanResponse response;
			//Error Handling
			try {
				 response  = projector_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
		
			System.out.println("Projector response "+response.getMsg());
			Boolean status=	response.getMsg();
			if(status) {
				projectorInfo_status.setText("Status: On");
			}else {
				projectorInfo_status.setText("Status: Off");
			}
		}
		else if(appliance.equals("Heating")) {
			booleanResponse response;
			//Error Handling
			try {
				 response = heating_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
				System.out.println("Heating Response "+response.getMsg());
				Boolean status=	response.getMsg();
				if(status) {
					heatingInfo_status.setText("Status: On");
				}else {
					heatingInfo_status.setText("Status: Off");
				}
		}
		else if(appliance.equals("Securitycamera")) {
			System.out.println("SecurityCamera Response ");

			booleanResponse response;
			//Error Handling
			try {
				 response = securitycamera_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
			
			System.out.println("Cam Response "+response.getMsg());
			Boolean status=	response.getMsg();
			if(status) {
				camInfo_status.setText("Status: On");
			}else {
				camInfo_status.setText("Status: Off");
			}
		}
		else if(appliance.equals("Light")) {
			booleanResponse response;
			
			//Error Handling
			try {
				 response = light_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
			
			System.out.println("Light Response "+response.getMsg());
			Boolean status=	response.getMsg();
			if(status) {
				lightInfo_status.setText("Status: On");
			}else {
				lightInfo_status.setText("Status: Off");
			}
		}
	}
	
	public void initialHeating() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Heating");
		heatingResponse response;
		//Error Handling
		try {
			 response = heating_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		heatingInfo_name.setText("Name: "+response.getAname());
		heatingInfo_status.setText("Status: "+response.getStatus());
		String temp = String.valueOf(response.getTemperature());
		heatingInfo_temperature.setText("Temperature: "+temp);

	}
	
	public void initialProjector() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Projector");
		projectorResponse response;
		
		//Error Handling
		try {
			 response = projector_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		projectorInfo_name.setText("Name: "+response.getAname());
		projectorInfo_status.setText("Status: "+response.getStatus());
		String volume = String.valueOf(response.getVolume());
		projectorInfo_volume.setText("Volume: "+volume);
		String channel = String.valueOf(response.getChannel());
		projectorInfo_channel.setText("Channel: "+channel);


	}
	
	public void initialLight() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Light");
		lightResponse response;
		//Error Handling
		try {
			 response = light_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		
		lightInfo_name.setText("Name: "+response.getAname());
		lightInfo_status.setText("Status: "+response.getStatus());
		String brightness = String.valueOf(response.getBrightness());
		lightInfo_brightness.setText("Brightness: "+ brightness);

	}
	
	public void initialCamera() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Camera");
		cameraResponse response;
		
		//Error Handling
		try {
			 response = securitycamera_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		
		camInfo_name.setText("Name: "+response.getAname());
		camInfo_status.setText("Status: "+response.getStatus());
		String volume = String.valueOf(response.getVolume());
		camInfo_camera.setText("App: "+ response.getCam());
		camInfo_volume.setText("Volume:"+volume);
	}
		

}//end main
