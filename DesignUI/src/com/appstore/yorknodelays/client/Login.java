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

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.info.Info;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Login implements EntryPoint {
	static private VerticalPanel vp;

	public Widget asWidget() {
		if (vp == null) {
			vp = new VerticalPanel();
			vp.setSpacing(10);
			createForm1();
		}
	    return vp;
	}
	 
	public void onModuleLoad() {
		RootPanel.get().add(asWidget());
	}
	 
	private void createForm1() {
	FramedPanel panel = new FramedPanel();
	panel.setHeadingText("Login Page");
	panel.setWidth(350);
	panel.setBodyStyle("background: none; padding: 5px");
	 
	VerticalLayoutContainer p = new VerticalLayoutContainer();
    panel.add(p);
	 
    TextField username = new TextField();
    username.setAllowBlank(false);
    username.setEmptyText("Please enter your username...");
    username.addValueChangeHandler(new ValueChangeHandler<String>() {
	
    @Override
    public void onValueChange(ValueChangeEvent<String> event) {	        
    	Info.display("Value Changed", "First name changed to " + event.getValue() == null ? "blank" : event.getValue());
		}
    });
	
    p.add(new FieldLabel(username, "Username"), new VerticalLayoutData(1, -1));
    
    PasswordField password = new PasswordField();
    p.add(new FieldLabel(password, "Password"), new VerticalLayoutData(1, -1));
    Label spinLabel = new Label("Role");
    p.add(spinLabel, new VerticalLayoutData(1, -1));

    Button pilotLogin = new Button("Pilot");
    Button dispatcherLogin = new Button("Dispatcher");
    Button controllerLogin = new Button("Controller");
    panel.addButton(pilotLogin);
    panel.addButton(dispatcherLogin);
    panel.addButton(controllerLogin);
    vp.add(panel);

    pilotLogin.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent event) {
    		PilotLogin pilotLogin = GWT.create(PilotLogin.class);
	   		vp.clear();
	   		vp.add(pilotLogin.asWidget());
	    }
    });
    
    dispatcherLogin.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent event) {
    		DispatcherPage dispatcherLogin = GWT.create(DispatcherPage.class);
	   		vp.clear();
	   		vp.add(dispatcherLogin.asWidget());
	    }
    });
    
    controllerLogin.addClickHandler(new ClickHandler() {
    	public void onClick(ClickEvent event) {
    		ControllerPage controllerLogin = GWT.create(ControllerPage.class);
	   		vp.clear();
	   		vp.add(controllerLogin.asWidget());
	    }
    });
	    
	}
}