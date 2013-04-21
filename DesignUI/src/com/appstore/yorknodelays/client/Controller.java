
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
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
/*import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.examples.resources.client.model.Kid;
import com.sencha.gxt.examples.resources.client.model.Person; */
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.DateWrapper;
import com.sencha.gxt.data.client.editor.ListStoreEditor;
import com.sencha.gxt.data.shared.ListStore;
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
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;
 
    
public class Controller implements EntryPoint, IsWidget {
	
	private Label Label;
	 /* TextField name = new TextField();
	  TextField company = new TextField();
	  TextField location = new TextField();
	   
	  NumberField<Double> income = new NumberField<Double>(new DoublePropertyEditor()); */
	   
	  ListStore<Kid> kidStore = new ListStore<Kid>(props.key());
	  ListStoreEditor<Kid> kids = new ListStoreEditor<Kid>(kidStore); 
	   
	   
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
	     
	    List<ColumnConfig<Kid, ?>> columns = new ArrayList<ColumnConfig<Kid,?>>();
	    ColumnConfig<Kid, String> name = new ColumnConfig<Kid, String>(props.name(), 200, "Fligt Name");
	    columns.add(name);
	    ColumnConfig<Kid, String> age = new ColumnConfig<Kid, String>(props.age(), 100, "Origin");
	    columns.add(age);
	     
	     
	    Grid<Kid> grid = new Grid<Kid>(kidStore, new ColumnModel<Kid>(columns));
	    grid.setBorders(true);
	     
	    grid.getView().setForceFit(true);
	    GridInlineEditing<Kid> inlineEditor = new GridInlineEditing<Kid>(grid);
	    inlineEditor.addEditor(name, new TextField());
	    inlineEditor.addEditor(age, new NumberField<Integer>(new IntegerPropertyEditor()));
	 
	    grid.setWidth(382);
	    grid.setHeight(200);
	     
	    FieldLabel kidsContainer = new FieldLabel();
	    kidsContainer.setText("Kids");
	    kidsContainer.setLabelAlign(LabelAlign.TOP);
	    kidsContainer.setWidget(grid);
	    container.add(kidsContainer);
	  return container;
	  }
// interface Driver extends SimpleBeanEditorDriver<Person, PersonEditor> {}
   
 // private Driver driver = GWT.create(Driver.class);
   
  @Override
 
  public Widget asWidget() {
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
 
    return panel;
   
  }
 
  @Override
  public void onModuleLoad() { 
    RootPanel.get().add(this);
  }
 }
 
}
