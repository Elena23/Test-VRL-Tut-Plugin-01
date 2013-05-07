/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gcsc.vrl.tutorial;

import eu.mihosoft.vrl.system.InitPluginAPI;
import eu.mihosoft.vrl.system.PluginAPI;
import eu.mihosoft.vrl.system.PluginIdentifier;
import eu.mihosoft.vrl.system.VPluginAPI;
import eu.mihosoft.vrl.system.VPluginConfigurator;

/**
 *
 * @author elena
 */
public class TestTutorialPluginConfigurator extends VPluginConfigurator{

public TestTutorialPluginConfigurator() {
    //specify the plugin name and version
   setIdentifier(new PluginIdentifier("TestTutorial-Plugin01", "0.1"));

   // describe the plugin
   setDescription("Plugin Description");

   // copyright info
   setCopyrightInfo("Sample-Plugin",
           "(c) Your Name",
           "www.you.com", "License Name", "License Text...");
}

@Override
public void register(PluginAPI api) {

   // register plugin with canvas
   if (api instanceof VPluginAPI) {
       VPluginAPI vapi = (VPluginAPI) api;
       vapi.addComponent(TestTutorialComponent01.class);
       }
}

@Override
public void unregister(PluginAPI api) {
   // nothing to unregister
}

@Override
public void init(InitPluginAPI iApi) {
   // nothing to init
  }
}