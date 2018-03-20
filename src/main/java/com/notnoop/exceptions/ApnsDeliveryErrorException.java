/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notnoop.exceptions;

import com.notnoop.apns.DeliveryError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author kkirch
 */
public class ApnsDeliveryErrorException extends ApnsException {
    static final Logger LOG = LoggerFactory.getLogger(ApnsDeliveryErrorException.class);

    private final DeliveryError deliveryError;

    public ApnsDeliveryErrorException(DeliveryError error) {
        LOG.debug("ApnsDeliveryErrorException setup");
        this.deliveryError = error;
    }

    @Override
    public String getMessage() {
        LOG.debug("getMessage of error: " + "Failed to deliver notification with error code " + deliveryError.code());
        return "Failed to deliver notification with error code " + deliveryError.code();
    }

    public DeliveryError getDeliveryError() {
        LOG.debug("getDeliveryError: {}", deliveryError);
        return deliveryError;
    }
    
    
}
