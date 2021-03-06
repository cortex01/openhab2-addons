/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.solaredge.internal.handler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.smarthome.core.thing.Thing;
import org.openhab.binding.solaredge.internal.model.AggregateDataChannels;
import org.openhab.binding.solaredge.internal.model.Channel;
import org.openhab.binding.solaredge.internal.model.LiveDataChannels;

/**
 * generic thing handler for solaredge
 *
 * @author Alexander Friese - initial contribution
 */
@NonNullByDefault
public class GenericSolarEdgeHandler extends SolarEdgeBaseHandler {

    public GenericSolarEdgeHandler(Thing thing, HttpClient httpClient) {
        super(thing, httpClient);
    }

    @Override
    public List<Channel> getChannels() {
        List<Channel> result = new ArrayList<>();
        Collections.addAll(result, LiveDataChannels.values());
        Collections.addAll(result, AggregateDataChannels.values());
        return result;
    }
}
