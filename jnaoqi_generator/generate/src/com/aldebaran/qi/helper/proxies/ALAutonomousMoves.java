/**
 * Copyright (c) 2015 Aldebaran Robotics. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the COPYING file.
 * Created by epinault and ekroeger
 */
package com.aldebaran.qi.helper.proxies;

import com.aldebaran.qi.CallError;
import com.aldebaran.qi.Session;
import com.aldebaran.qi.helper.ALProxy;
import java.util.List;
import java.util.Map;
import com.aldebaran.qi.*;

import java.util.List;
/**
* Module that manage the background moves automatically started by the robot.
* @see <a href="http://doc.aldebaran.lan/doc/master/aldeb-doc/naoqi/motion/autonomousmoves.html#autonomousmoves">NAOqi APIs for ALAutonomousMoves </a>
*
*/
public class ALAutonomousMoves extends ALProxy {

    public ALAutonomousMoves(Session session) {
        super(session);
    }

    /**
    * 
    * 
    */
    public Boolean isStatsEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isStatsEnabled").get();
    }

    /**
    * 
    * 
    */
    public void clearStats() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("clearStats");
        else
            service.call("clearStats").get();
    }

    /**
    * 
    * 
    */
    public Boolean isTraceEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isTraceEnabled").get();
    }

    /**
    * Exits and unregisters the module.
    * 
    */
    public void exit() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("exit");
        else
            service.call("exit").get();
    }

    /**
    * Returns the version of the module.
    * 
    * @return A string containing the version of the module.
    */
    public String version() throws CallError, InterruptedException {
        return (String)service.call("version").get();
    }

    /**
    * Just a ping. Always returns true
    * 
    * @return returns true
    */
    public Boolean ping() throws CallError, InterruptedException {
        return (Boolean)service.call("ping").get();
    }

    /**
    * Retrieves the module's method list.
    * 
    * @return An array of method names.
    */
    public List<String> getMethodList() throws CallError, InterruptedException {
        return (List<String>)service.call("getMethodList").get();
    }

    /**
    * Retrieves a method's description.
    * 
    * @param methodName  The name of the method.
    * @return A structure containing the method's description.
    */
    public Object getMethodHelp(String methodName) throws CallError, InterruptedException {
        return (Object)service.call("getMethodHelp", methodName).get();
    }

    /**
    * Retrieves the module's description.
    * 
    * @return A structure describing the module.
    */
    public Object getModuleHelp() throws CallError, InterruptedException {
        return (Object)service.call("getModuleHelp").get();
    }

    /**
    * Wait for the end of a long running method that was called using 'post'
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @param timeoutPeriod  The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero.
    * @return True if the timeout period terminated. False if the method returned.
    */
    public Boolean wait(Integer id, Integer timeoutPeriod) throws CallError, InterruptedException {
        return (Boolean)service.call("wait", id, timeoutPeriod).get();
    }

    /**
    * Returns true if the method is currently running.
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @return True if the method is currently running
    */
    public Boolean isRunning(Integer id) throws CallError, InterruptedException {
        return (Boolean)service.call("isRunning", id).get();
    }

    /**
    * returns true if the method is currently running
    * 
    * @param id  the ID of the method to wait for
    */
    public void stop(Integer id) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("stop", id);
        else
            service.call("stop", id).get();
    }

    /**
    * Gets the name of the parent broker.
    * 
    * @return The name of the parent broker.
    */
    public String getBrokerName() throws CallError, InterruptedException {
        return (String)service.call("getBrokerName").get();
    }

    /**
    * Gets the method usage string. This summarises how to use the method.
    * 
    * @param name  The name of the method.
    * @return A string that summarises the usage of the method.
    */
    public String getUsage(String name) throws CallError, InterruptedException {
        return (String)service.call("getUsage", name).get();
    }

    /**
    * DEPRECATED since 2.0: do ALBasicAwareness.setTrackingMode("MoveContextually") instead.Start small base moves.
    * 
    */
    public void startSmallDisplacements() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("startSmallDisplacements");
        else
            service.call("startSmallDisplacements").get();
    }

    /**
    * DEPRECATED since 2.0: do ALBasicAwareness.setTrackingMode instead.Stop small base moves.
    * 
    */
    public void stopSmallDisplacements() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("stopSmallDisplacements");
        else
            service.call("stopSmallDisplacements").get();
    }

    /**
    * Enable or disable expressive listening.
    * 
    * @param enable  The boolean value: true to enable, false to disable.
    */
    public void setExpressiveListeningEnabled(Boolean enable) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setExpressiveListeningEnabled", enable);
        else
            service.call("setExpressiveListeningEnabled", enable).get();
    }

    /**
    * If expressive listening is enabled.
    * 
    * @return The boolean value: true means it is enabled, false means it is disabled.
    */
    public Boolean getExpressiveListeningEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("getExpressiveListeningEnabled").get();
    }

    /**
    * The background strategy.
    * 
    * @param strategy  The autonomous background posture strategy. ("none" or "backToNeutral")
    */
    public void setBackgroundStrategy(String strategy) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setBackgroundStrategy", strategy);
        else
            service.call("setBackgroundStrategy", strategy).get();
    }

    /**
    * Gets the background strategy.
    * 
    * @return The autonomous background posture strategy. ("none" or "backToNeutral")
    */
    public String getBackgroundStrategy() throws CallError, InterruptedException {
        return (String)service.call("getBackgroundStrategy").get();
    }

}
    