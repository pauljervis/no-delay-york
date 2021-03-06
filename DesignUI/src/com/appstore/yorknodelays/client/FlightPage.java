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
	 
	//PassengerCapacity
	    TextField PassengerCapacity = new TextField();
	    PassengerCapacity.setAllowBlank(false);
	    PassengerCapacity.setEmptyText("");
	    p.add(PassengerCapacity);
    //BaggageCapacity
	    TextField BaggageCapacity = new TextField();
	    BaggageCapacity.setAllowBlank(false);
	    BaggageCapacity.setEmptyText("");
	    p.add(BaggageCapacity);
    //BaggageCapacity
	    TextField PassengerCount = new TextField();
	    PassengerCount.setAllowBlank(false);
	    PassengerCount.setEmptyText("");
	    p.add(PassengerCount);
	    p.add(new FieldLabel(PassengerCapacity, "Passenger Capacity:"), new VerticalLayoutData(1, -1));
	    p.add(new FieldLabel(BaggageCapacity, "Baggage Capacity:"), new VerticalLayoutData(1, -1));
	    p.add(new FieldLabel(PassengerCount, "Passenger Count:"), new VerticalLayoutData(1, -1));
	   
	//Meteorology Panel
	    FramedPanel panel2 = new FramedPanel();
	    panel2.setHeadingText("Meteorology");
	    panel2.setWidth(350);
	    panel2.setBodyStyle("background: none; padding: 5px");
	 
	    VerticalLayoutContainer p2 = new VerticalLayoutContainer();
	    panel2.add(p2);
	 
	 //CurrentWeather
	    TextField CurrentWeather = new TextField();
	    CurrentWeather.setAllowBlank(false);
	    CurrentWeather.setEmptyText(""); 
	    p2.add(CurrentWeather);
	    
	//DestinationWeather
	    TextField DestinationWeather = new TextField();
	    DestinationWeather.setAllowBlank(false);
	    DestinationWeather.setEmptyText("");
	    p2.add(DestinationWeather);
	    
    //Atmosphere
	    TextField Atmosphere = new TextField();
	    Atmosphere.setAllowBlank(false);
	    Atmosphere.setEmptyText("");
	    p2.add(Atmosphere);
	    
    //Density
	    TextField Density = new TextField();
	    Density.setAllowBlank(false);
	    Density.setEmptyText("");
	    p2.add(Density);
	    
    //HeatWave
	    TextField HeatWave = new TextField();
	    HeatWave.setAllowBlank(false);
	    HeatWave.setEmptyText("");
	    p2.add(HeatWave);
	    
	    
    //ColdWave
	    TextField ColdWave = new TextField();
	    ColdWave.setAllowBlank(false);
	    ColdWave.setEmptyText("");
	    p2.add(ColdWave);
	    
    //WindSpeed
	    TextField WindSpeed= new TextField();
	    WindSpeed.setAllowBlank(false);
	    WindSpeed.setEmptyText("");
	    p2.add( WindSpeed);
	    
	    p2.add(new FieldLabel(CurrentWeather, "Current Weather:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(DestinationWeather, "Destination Weather:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(Atmosphere, "Atmosphere:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(Density, "Density:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(HeatWave, "Heat Wave:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(ColdWave, "Cold Wave:"), new VerticalLayoutData(1, -1));
	    p2.add(new FieldLabel(WindSpeed, "WindSpeed:"), new VerticalLayoutData(1, -1));
	   
	  //Aircraft Panel
	    FramedPanel panel3 = new FramedPanel();
	    panel3.setHeadingText("Aircraft");
	    panel3.setWidth(350);
	    panel3.setBodyStyle("background: none; padding: 5px");
	 
	    VerticalLayoutContainer p3 = new VerticalLayoutContainer();
	    panel3.add(p3);
	 
	  //AircraftModel
	    TextField AircraftModel= new TextField();
	    AircraftModel.setAllowBlank(false);
	    AircraftModel.setEmptyText("");
	    p3.add(AircraftModel);
	    
	 //AircraftCompany
	    TextField AircraftCompany= new TextField();
	    AircraftCompany.setAllowBlank(false);
	    AircraftCompany.setEmptyText("");
	    p3.add(AircraftCompany);
	    
	  //FuelConsumption
	    TextField FuelConsumption= new TextField();
	    FuelConsumption.setAllowBlank(false);
	    FuelConsumption.setEmptyText("");
	    p3.add(FuelConsumption);
	    
	  //ManufacturedDate
	    TextField ManufacturedDate= new TextField();
	    ManufacturedDate.setAllowBlank(false);
	    ManufacturedDate.setEmptyText("");
	    p3.add(ManufacturedDate);
	    
	   //Capacity
	    TextField Capacity= new TextField();
	    Capacity.setAllowBlank(false);
	    Capacity.setEmptyText("");
	    p3.add(Capacity);
	    
	   //Destination
	    TextField Destination= new TextField();
	    Destination.setAllowBlank(false);
	    Destination.setEmptyText("");
	    p3.add(Destination);
	    
	   //Origin
	    TextField Origin= new TextField();
	    Origin.setAllowBlank(false);
	    Origin.setEmptyText("");
	    p3.add(Origin);
	    
	    p3.add(new FieldLabel(AircraftModel, "Aircraft Model:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(AircraftCompany, "Aircraft Company:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(FuelConsumption, "Fuel Consumption:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(ManufacturedDate, "Manufacture Date:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(Capacity, "Capacity:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(Destination, "Destination:"), new VerticalLayoutData(1, -1));
	    p3.add(new FieldLabel(Origin, "Origin:"), new VerticalLayoutData(1, -1));
	    
	    
	  }
}