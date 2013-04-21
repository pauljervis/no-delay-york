
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
 
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.DateWrapper;
/*import com.sencha.gxt.examples.resources.client.model.Kid;
import com.sencha.gxt.examples.resources.client.model.Person;
import com.sencha.gxt.explorer.client.model.Example.Detail;*/
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
 
public class Controller implements EntryPoint, IsWidget {
 private Label Label;

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
 
  /*  List<Kid> kids = new ArrayList<Kid>();
    kids.add(new Kid("Alec", 4, new DateWrapper(2004, 1, 1).asDate()));
    kids.add(new Kid("Lia", 2, new DateWrapper(2005, 1, 1).asDate()));
    kids.add(new Kid("Andrew", 1, new DateWrapper(2007, 1, 1).asDate()));
    person.setKids(kids);
     
    driver.edit(person);*/
    VerticalLayoutContainer p = new VerticalLayoutContainer();
    panel.add(p);
    Label spinLabel = new Label("Collision Warming:");
    Label = new Label ("nil");
	 
    p.add(spinLabel, new VerticalLayoutData(1, -1));
 
    return panel;
  }
 
  @Override
  public void onModuleLoad() {
    RootPanel.get().add(this);
  }
 
}
