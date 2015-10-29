/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.device.mgt.iot.agent.firealarm.virtual.core;

/**
 * A Configuration class that holds all the Agent specific details that are read from the
 * 'deviceConfig.properties' file. This file is generated by the IoT-Server at the time of
 * downloading the device agent from the IoT-Server.
 */
public class AgentConfiguration {
	private String deviceOwner;
	private String deviceId;
	private String deviceName;
	private String controllerContext;
	private String HTTPS_ServerEndpoint;
	private String HTTP_ServerEndpoint;
	private String apimGatewayEndpoint;
	private String mqttBrokerEndpoint;
	private String xmppServerEndpoint;
	private String authMethod;
	private String authToken;
	private String refreshToken;
	private int dataPushInterval;

	public String getDeviceOwner() {
		return deviceOwner;
	}

	public void setDeviceOwner(String deviceOwner) {
		this.deviceOwner = deviceOwner;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getControllerContext() {
		return controllerContext;
	}

	public void setControllerContext(String controllerContext) {
		this.controllerContext = controllerContext;
	}

	public String getHTTPS_ServerEndpoint() {
		return HTTPS_ServerEndpoint;
	}

	public void setHTTPS_ServerEndpoint(String HTTPS_ServerEndpoint) {
		this.HTTPS_ServerEndpoint = HTTPS_ServerEndpoint;
	}

	public String getHTTP_ServerEndpoint() {
		return HTTP_ServerEndpoint;
	}

	public void setHTTP_ServerEndpoint(String HTTP_ServerEndpoint) {
		this.HTTP_ServerEndpoint = HTTP_ServerEndpoint;
	}

	public String getApimGatewayEndpoint() {
		return apimGatewayEndpoint;
	}

	public void setApimGatewayEndpoint(String apimGatewayEndpoint) {
		this.apimGatewayEndpoint = apimGatewayEndpoint;
	}

	public String getMqttBrokerEndpoint() {
		return mqttBrokerEndpoint;
	}

	public void setMqttBrokerEndpoint(String mqttBrokerEndpoint) {
		this.mqttBrokerEndpoint = mqttBrokerEndpoint;
	}

	public String getXmppServerEndpoint() {
		return xmppServerEndpoint;
	}

	public void setXmppServerEndpoint(String xmppServerEndpoint) {
		this.xmppServerEndpoint = xmppServerEndpoint;
	}

	public String getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public int getDataPushInterval() {
		return dataPushInterval;
	}

	public void setDataPushInterval(int dataPushInterval) {
		this.dataPushInterval = dataPushInterval;
	}
}


