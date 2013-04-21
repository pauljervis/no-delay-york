
/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.appstore.yorknodelays.client;
 
import java.util.Date;
 
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.util.DateWrapper;
import com.sencha.gxt.core.client.util.ToggleGroup;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
/*import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.Slider;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent.ParseErrorHandler;*/
import com.sencha.gxt.widget.core.client.form.CheckBox;
/*import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.DoublePropertyEditor;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.IntegerPropertyEditor;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.Radio;
import com.sencha.gxt.widget.core.client.form.SpinnerField;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.TimeField;
import com.sencha.gxt.widget.core.client.form.validator.MinDateValidator;
import com.sencha.gxt.widget.core.client.form.validator.MinLengthValidator;
import com.sencha.gxt.widget.core.client.info.Info;*/
 
public class FlightChecklist implements IsWidget, EntryPoint {
 
  
  public Widget asWidget() {
	  
	  FlowPanel container = new FlowPanel();
	  container.setTitle("Flight Check List");
	  
	  FramedPanel panel = new FramedPanel();
	  panel.setHeadingText("Before-Takeoff Checklist");
	  panel.setWidth(350);
	  panel.setBodyStyle("background: none; padding: 5px");
	  VerticalLayoutContainer p = new VerticalLayoutContainer();
	  panel.add(p);
		
	  CheckBox check1 = new CheckBox();
	  check1.setBoxLabel("Auxiliary fuel pump — Off:");
	  p.add(check1);
		
		CheckBox check2 = new CheckBox();
		check1.setBoxLabel("Flight controls — Free and correct:");
		p.add(check2);
		
		CheckBox check3 = new CheckBox();
		check3.setBoxLabel("Instruments and radios:");
		p.add(check3);
		
		
		CheckBox check4 = new CheckBox();
		check4.setBoxLabel("Landing gear position lights :"); 
		p.add(check4);
		
		CheckBox check5 = new CheckBox();
		check5.setBoxLabel("Altimeter  :");
		    p.add(check5);
		    
		   
		    CheckBox check6 = new CheckBox();
		    check6.setBoxLabel("Directional gyro :");
		p.add(check6);
		
		
		
		CheckBox check7 = new CheckBox();
		check7.setBoxLabel ("Fuel gauges :");
		p.add(check7);
		
		
		
		CheckBox check8 = new CheckBox();
		check8.setBoxLabel ("Trim :");
		p.add(check8);
		
		
		CheckBox check9 = new CheckBox();
		check9.setBoxLabel(" Propeller — Exercise:");
		    p.add(check9);
		   
		    
		    CheckBox check10 = new CheckBox();
		    check10.setBoxLabel(" Engine idle :"); 
		    p.add(check10);
		 
		    
		    CheckBox check11 = new CheckBox();
		    check11.setBoxLabel("Magnetos:");
		p.add(check11);
		
		 
		CheckBox check12 = new CheckBox();
		check12.setBoxLabel("Flaps:");
		    p.add(check12);
		   
		    
		    CheckBox check13 = new CheckBox();
		    check13.setBoxLabel("Seat belts/shoulder harnesses — Fastened:");
		    p.add(check13);
		 
		container.add(panel);    
		       
		 //Panel 2 Parking Brake
		FramedPanel panel2 = new FramedPanel();
		panel2.setHeadingText("Parking Brake");
		panel2.setWidth(350);
		panel2.setBodyStyle("background: none; padding: 5px");
		VerticalLayoutContainer p2 = new VerticalLayoutContainer();
		panel2.add(p2);
		CheckBox check14 = new CheckBox();
		check14.setBoxLabel("Lights — Landing, taxi, strobes on:");
		p2.add(check14);
		
		
		CheckBox check15 = new CheckBox();
		check15.setBoxLabel("Doors and windows — Locked:");
		p2.add(check15);
		
		
		
		CheckBox check16 = new CheckBox();
		check16.setBoxLabel("Mixture — Full rich :");
		    p2.add(check16);
		  
		    
		    CheckBox check17 = new CheckBox();
		    check17.setBoxLabel("Lights — Landing :");
		p2.add(check17);
		
		
		CheckBox check18 = new CheckBox();
		check18.setBoxLabel("Lights — Landing :");
		p2.add(check18);
		
		CheckBox check19 = new CheckBox();
		check19.setBoxLabel("Camera — Transponder on :");
		HorizontalPanel hp = new HorizontalPanel();
		p2.add(check19);
		
		
		CheckBox check20 = new CheckBox();
		check20.setBoxLabel("Action — Engine instruments checked");
		    p2.add(check20);
		    
		    container.add(panel2);   
		    //Panel 3 Before Flight Landing
		FramedPanel panel3 = new FramedPanel();
		panel3.setHeadingText("Before Flight Landing");
		panel3.setWidth(350);
		panel3.setBodyStyle("background: none; padding: 5px");
		VerticalLayoutContainer p3 = new VerticalLayoutContainer();
		panel3.add(p3); 
		CheckBox check21 = new CheckBox();
		check21.setBoxLabel("Fuel selector — Fullest tank:");
		    p3.add(check21);
		   
		    
		    
		    CheckBox check22 = new CheckBox();
		    check22.setBoxLabel("Directional gyro — Aligned with magnetic compass:");
		    p3.add(check22);
		
		  
		    CheckBox check23 = new CheckBox();
		    check23.setBoxLabel("Seat belts/shoulder harnesses — secure:");
		p3.add(check23);
		
		
		CheckBox check24 = new CheckBox();
		check24.setBoxLabel("Mixture — Full rich :");
		p3.add(check24);
		
		
		CheckBox check25 = new CheckBox();
		check25.setBoxLabel("Cowl flaps — As requiredh :");   
		    p3.add(check25);
		   
		    
		    
		    CheckBox check26 = new CheckBox();
		    check26.setBoxLabel("Final items:"); 
		    p3.add(check26);
		   
		    
		    CheckBox check27 = new CheckBox();
		    check27.setBoxLabel("Landing gear — Down:"); 
		p3.add(check27);
		
		
		
		CheckBox check28 = new CheckBox();
		check28.setBoxLabel( "Propeller — High rpm:");
		    p3.add(check28);
		   
		    
		    
		    CheckBox check29 = new CheckBox();
		    check29.setBoxLabel("Flaps — As required");
		p3.add(check29);
		container.add(panel3);
		
		return container;
	  
	  
  }
	  
	  
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}
