/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.appstore.yorknodelays.client;
 
import java.util.ArrayList;
import java.util.List;

import com.appstore.yorknodelays.shared.Flight;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor.Path;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
/*import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.examples.resources.client.model.Kid;
import com.sencha.gxt.examples.resources.client.model.Person; */
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.core.client.util.DateWrapper;
import com.sencha.gxt.data.client.editor.ListStoreEditor;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
/*import com.sencha.gxt.examples.resources.client.model.Kid;
import com.sencha.gxt.examples.resources.client.model.Person;
import com.sencha.gxt.explorer.client.model.Example.Detail;*/
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FormPanel.LabelAlign;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;
 
    
public class ControllerPage implements EntryPoint, IsWidget {
	
	private static final FlightProperties props = GWT.create(FlightProperties.class);
	
	private Label Label;
	
/* TextField name = new TextField();
  TextField company = new TextField();
  TextField location = new TextField();
   
  NumberField<Double> income = new NumberField<Double>(new DoublePropertyEditor()); */
   
	ListStore<Flight> flightStore = new ListStore<Flight>(props.id());
	ListStoreEditor<Flight> flights = new ListStoreEditor<Flight>(flightStore); 
   
	   
	@Override
	public Widget asWidget() {
	
		FlowPanel container = new FlowPanel();
	     
	     
	    // should be layout based
	   /* int w = 275;
	    name.setWidth(w);
	    company.setWidth(w);
	    location.setWidth(w);
	    income.setWidth(w);
	     
	    container.add(new FieldLabel(name, "Name"));
	    container.add(new FieldLabel(company, "Company"));
	    container.add(new FieldLabel(location, "Location"));
	     
	    container.add(new FieldLabel(income, "Income")); */
	     
	    List<ColumnConfig<Flight, ?>> columns = new ArrayList<ColumnConfig<Flight,?>>();
	    ColumnConfig<Flight, String> name = new ColumnConfig<Flight, String>(props.flightId(), 200, "Fligt Name");
	    columns.add(name);
	    ColumnConfig<Flight, String> origin = new ColumnConfig<Flight, String>(props.origin(), 100, "Origin");
	    columns.add(origin);
	    ColumnConfig<Flight, String> destination = new ColumnConfig<Flight, String>(props.destination(), 100, "Destination");
	    columns.add(destination);
	    ColumnConfig<Flight, String> remarks = new ColumnConfig<Flight, String>(props.remarks(), 100, "Remarks");
	    columns.add(remarks);
	     
	    Grid<Flight> grid = new Grid<Flight>(flightStore, new ColumnModel<Flight>(columns));
	    grid.setBorders(true);
	     
	    grid.getView().setForceFit(true);
	    GridInlineEditing<Flight> inlineEditor = new GridInlineEditing<Flight>(grid);
	    
	    grid.setWidth(382);
	    grid.setHeight(200);
	     
	    FieldLabel flightContainer = new FieldLabel();
	    flightContainer.setText("Flights");
	    flightContainer.setLabelAlign(LabelAlign.TOP);
	    flightContainer.setWidget(grid);
	    container.add(flightContainer);
	    
	  
    FramedPanel panel = new FramedPanel();
    panel.setHeadingText("Real Time Flight Information");
    panel.setBodyBorder(false);
    panel.setWidth(400);
    panel.addStyleName("margin-10");
    
    /*TextArea description = new TextArea();
    description.setAllowBlank(false);
    description.addValidator(new MinLengthValidator(10));
    p.add(new FieldLabel(description, ""), new VerticalLayoutData(1, 100)); */
     
   /* PersonEditor personEditor = new PersonEditor();
    driver.initialize(personEditor);
     
    panel.setWidget(personEditor);
    panel.addButton(new TextButton("Save", new SelectHandler() {
      @Override
      public void onSelect(SelectEvent event) {
        driver.flush();
      }
    }));
     
    Person person = new Person("Darrell Meyer", "Sencha Inc", "GXT", "Washington, DC", 9.99);*/
  HorizontalLayoutContainer p2 = new HorizontalLayoutContainer ();
  
    panel.add (p2);
    
    VerticalLayoutContainer p = new VerticalLayoutContainer();
    panel.add(p);
    Label spinLabel = new Label("Collision Warning:");
    Label = new Label ("nil");
	 
    p.add(spinLabel, new VerticalLayoutData(1, -1));
 
    return container;
   
  }
 
  @Override
  public void onModuleLoad() { 
    RootPanel.get().add(this);
  }
 
}
