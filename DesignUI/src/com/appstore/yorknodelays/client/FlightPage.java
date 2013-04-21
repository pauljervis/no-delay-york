/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
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
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.util.DateWrapper;
import com.sencha.gxt.core.client.util.ToggleGroup;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.Slider;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent;
import com.sencha.gxt.widget.core.client.event.ParseErrorEvent.ParseErrorHandler;
import com.sencha.gxt.widget.core.client.form.CheckBox;
import com.sencha.gxt.widget.core.client.form.ComboBox;
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
import com.sencha.gxt.widget.core.client.info.Info;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FlightPage implements EntryPoint {
	private VerticalPanel vp;
	 
	  public Widget asWidget() {
	    if (vp == null) {
	      vp = new VerticalPanel();
	      vp.setSpacing(10);
	      createForm1();
	     /* createForm2();*/
	    }
	    return vp;
	  }
	 
	  public void onModuleLoad() {
	    RootPanel.get().add(asWidget());
	  }
	 
	  private void createForm1() {
	//Passenger Panel
	    FramedPanel panel = new FramedPanel();
	    panel.setHeadingText("Passenger");
	    panel.setWidth(350);
	    panel.setBodyStyle("background: none; padding: 5px");
	 
	    VerticalLayoutContainer p = new VerticalLayoutContainer();
	    panel.add(p);

	    Label passengerCapacity = new Label("Get passengerCapacity from DB");
	    Label baggageCapacity = new Label("Get BaggageCapacity from DB");
	    Label passengerCount = new Label("Get PassengerCount from DB");
	    
		p.add(new FieldLabel(passengerCapacity, "Passenger Capacity:"), new VerticalLayoutData(1, -1));
	    p.add(new FieldLabel(baggageCapacity, "Baggage Capacity:"), new VerticalLayoutData(1, -1));
	    p.add(new FieldLabel(passengerCount, "Passenger Count:"), new VerticalLayoutData(1, -1));
	    
	//Meteorology Panel
	    FramedPanel panel2 = new FramedPanel();
	    panel2.setHeadingText("Meteorology");
	    panel2.setWidth(350);
	    panel2.setBodyStyle("background: none; padding: 5px");
	 
	    VerticalLayoutContainer p2 = new VerticalLayoutContainer();
	    panel2.add(p2);

	    Label currentWeather = new Label("Get CurrentWeather from DB");
	    Label destinationWeather = new Label("Get DestinationWeather from DB");
	    Label athmosphere = new Label("Get Athmosphere from DB");
	    Label density = new Label("Get Density from DB");
	    Label heatWave = new Label("Get HeatWave from DB");
	    Label coldWave = new Label("Get ColdWave from DB");
	    Label windSpeed = new Label("Get WindSpeed from DB");
	    
	    p2.add(new FieldLabel(currentWeather, "Current Weather:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(destinationWeather, "Destination Weather:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(athmosphere, "Athmosphere:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(density, "Density:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(heatWave, "Heat Wave:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(coldWave, "Cold Wave:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(windSpeed, "WindSpeed:"), new VerticalLayoutData(1, -1));
	    
	  //Aircraft Panel
	    FramedPanel panel3 = new FramedPanel();
	    panel3.setHeadingText("Aircraft");
	    panel3.setWidth(350);
	    panel3.setBodyStyle("background: none; padding: 5px");
	 
	    VerticalLayoutContainer p3 = new VerticalLayoutContainer();
	    panel3.add(p3);
	    
	    Label aircraftModel = new Label("Get aircraftModel from DB");
	    Label aircraftCompany = new Label("Get AircraftCompany from DB");
	    Label fuelConsumption = new Label("Get FuelConsumption from DB");
	    Label manufacturedDate = new Label("Get ManufacturedDate from DB");
	    Label capacity = new Label("Get Capacity from DB");
	    Label destination = new Label("Get Destination from DB");
	    Label origin = new Label("Get origin from DB");
	 
	    p3.add(new FieldLabel(aircraftModel, "Aircraft Model:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(aircraftCompany, "Aircraft Company:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(fuelConsumption, "Fuel Consumption:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(manufacturedDate, "Manufacture Date:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(capacity, "Capacity:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(destination, "Destination:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(origin, "Origin:"), new VerticalLayoutData(1, -1));
{
	 
	     // @Override
	     /* public void onParseError(ParseErrorEvent event) {
	        Info.display("Parse Error", event.getErrorValue() + " could not be parsed as a number");*/
	      }
	    };
	    //age.setAllowBlank(false);
	 
	  /*  p.add(new FieldLabel(age, "Age"), new VerticalLayoutData(1, -1));*/
	 /*
	    StockProperties props = GWT.create(StockProperties.class);
	    ListStore<Stock> store = new ListStore<Stock>(props.key());
	    store.addAll(TestData.getStocks());
	 
	    ComboBox<Stock> combo = new ComboBox<Stock>(store, props.nameLabel());
	    combo.addValueChangeHandler(new ValueChangeHandler<Stock>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<Stock> event) {
	        Info.display("Selected", "You selected " + event.getValue());
	      }
	    });
	    combo.setAllowBlank(true);
	    combo.setForceSelection(true);
	    combo.setTriggerAction(TriggerAction.ALL);
	    
	    p.add(new FieldLabel(combo, "Company"), new VerticalLayoutData(1, -1));
	 
	    
	 
	    DateField date = new DateField();
	    date.addParseErrorHandler(new ParseErrorHandler() {
	 
	      @Override
	      public void onParseError(ParseErrorEvent event) {
	        Info.display("Parse Error", event.getErrorValue() + " could not be parsed as a date");
	      }
	    });
	 
	    date.addValueChangeHandler(new ValueChangeHandler<Date>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<Date> event) {
	        String v = event.getValue() == null ? "nothing"
	            : DateTimeFormat.getFormat(PredefinedFormat.DATE_MEDIUM).format(event.getValue());
	        Info.display("Selected", "You selected " + v);
	 
	      }
	    });
	    date.addValidator(new MinDateValidator(new Date()));
	    p.add(new FieldLabel(date, "Birthday"), new VerticalLayoutData(1, -1));
	 
	    TimeField time = new TimeField();
	    time.addParseErrorHandler(new ParseErrorHandler() {
	 
	      @Override
	      public void onParseError(ParseErrorEvent event) {
	        Info.display("Parse Error", event.getErrorValue() + " could not be parsed as a valid time");
	      }
	    });
	 
	    time.setMinValue(new DateWrapper().clearTime().addHours(8).asDate());
	    time.setMaxValue(new DateWrapper().clearTime().addHours(18).addSeconds(1).asDate());
	    p.add(new FieldLabel(time, "Time"), new VerticalLayoutData(1, -1));
	 
	    Slider slider = new Slider();
	    slider.setMinValue(40);
	    slider.setMaxValue(90);
	    slider.setValue(0);
	    slider.setIncrement(5);
	    slider.setMessage("{0} inches tall");
	    p.add(new FieldLabel(slider, "Size"), new VerticalLayoutData(1, -1));
	     
	    ValueChangeHandler<Boolean> musicHandler = new ValueChangeHandler<Boolean>() {
	       
	      @Override
	      public void onValueChange(ValueChangeEvent<Boolean> event) {
	        CheckBox check = (CheckBox)event.getSource();
	        Info.display("Music Changed", check.getBoxLabel() + " " + (event.getValue() ? "selected" : "not selected"));
	      }
	    };
	 
	    CheckBox check1 = new CheckBox();
	    check1.setEnabled(false);
	    check1.setBoxLabel("Classical");
	    check1.addValueChangeHandler(musicHandler);
	 
	    CheckBox check2 = new CheckBox();
	    check2.setBoxLabel("Rock");
	    check2.addValueChangeHandler(musicHandler);
	    check2.setValue(true);
	 
	    CheckBox check3 = new CheckBox();
	    check3.setBoxLabel("Blues");
	    check3.addValueChangeHandler(musicHandler);
	 
	    HorizontalPanel hp = new HorizontalPanel();
	    hp.add(check1);
	    hp.add(check2);
	    hp.add(check3);
	 
	    p.add(new FieldLabel(hp, "Music"));
	 
	    Radio radio = new Radio();
	    radio.setBoxLabel("Red");
	 
	    Radio radio2 = new Radio();
	    radio2.setBoxLabel("Blue");
	    radio2.setValue(true);
	 
	    hp = new HorizontalPanel();
	    hp.add(radio);
	    hp.add(radio2);
	 
	    p.add(new FieldLabel(hp, "Color"));
	 
	    // we can set name on radios or use toggle group
	    ToggleGroup toggle = new ToggleGroup();
	    toggle.add(radio);
	    toggle.add(radio2);
	    toggle.addValueChangeHandler(new ValueChangeHandler<HasValue<Boolean>>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<HasValue<Boolean>> event) {
	        ToggleGroup group = (ToggleGroup)event.getSource();
	        Radio radio = (Radio)group.getValue();
	        Info.display("Color Changed", "You selected " + radio.getBoxLabel());
	      }
	    });
	 
	    TextArea description = new TextArea();
	    description.setAllowBlank(false);
	    description.addValidator(new MinLengthValidator(10));
	    p.add(new FieldLabel(description, "Description"), new VerticalLayoutData(1, 100));
	 
	    final SpinnerField<Double> spinnerField = new SpinnerField<Double>(new DoublePropertyEditor());
	    spinnerField.setIncrement(.1d);
	    spinnerField.setMinValue(-10d);
	    spinnerField.setMaxValue(10d);
	    spinnerField.setAllowNegative(true);
	    spinnerField.setAllowBlank(false);
	    spinnerField.getPropertyEditor().setFormat(NumberFormat.getFormat("0.0"));
	    spinnerField.addValueChangeHandler(new ValueChangeHandler<Double>() {
	 
	      @Override
	      public void onValueChange(ValueChangeEvent<Double> event) {
	        Info.display("Duration Changed",
	            "Duration changed to " + event.getValue() == null ? "nothing" : event.getValue() + "");
	      }
	    });
	    spinnerField.addSelectionHandler(new SelectionHandler<Double>() {
	 
	      @Override
	      public void onSelection(SelectionEvent<Double> event) {
	        String msg = "nothing";
	        if (event.getSelectedItem() != null) {
	          msg = spinnerField.getPropertyEditor().render(event.getSelectedItem());
	        }
	 
	        Info.display("Spin Change", "Current value changed to " + msg);
	      }
	    });*/
	 
	   /* Label spinLabel = new Label("Role");
	 
	    p.add(spinLabel, new VerticalLayoutData(1, -1));
	 
	    panel.addButton(new TextButton("Pilot"));
	    panel.addButton(new TextButton("Dispatcher"));
	    panel.addButton(new TextButton("Controller"));
	    vp.add(panel);*/
	  }
	 
	 /* private void createForm2() {
	    FramedPanel form2 = new FramedPanel();
	    form2.setHeadingText("Simple Form with FieldSets");
	    form2.setWidth(350);
	 
	    FieldSet fieldSet = new FieldSet();
	    fieldSet.setHeadingText("User Information");
	    fieldSet.setCollapsible(true);
	    form2.add(fieldSet);
	 
	    VerticalLayoutContainer p = new VerticalLayoutContainer();
	    fieldSet.add(p);
	 
	    TextField firstName = new TextField();
	    firstName.setAllowBlank(false);
	    p.add(new FieldLabel(firstName, "Username"), new VerticalLayoutData(1, -1));
	 
	    TextField lastName= new TextField();
	    lastName.setAllowBlank(false);
	    p.add(new FieldLabel(lastName, "Password"), new VerticalLayoutData(1, -1));
	 
	    /*TextField email = new TextField();
	    email.setAllowBlank(false);
	    p.add(new FieldLabel(email, "Email"), new VerticalLayoutData(1, -1));
	 
	    form2.addButton(new TextButton("Pilot"));
	    form2.addButton(new TextButton("Dispatcher"));
	    form2.addButton(new TextButton("Controller"));
	    vp.add(form2);
	  }*/
