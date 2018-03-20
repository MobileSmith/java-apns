package com.notnoop.apns;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A no operation delegate that does nothing!
 */
public class ApnsDelegateAdapter implements ApnsDelegate {
    static final Logger LOG = LoggerFactory.getLogger(ApnsDelegateAdapter.class);

    public void messageSent(ApnsNotification message, boolean resent) {
        LOG.debug("{'method':'messageSent','ApnsNotification':'"+new String(message.getDeviceToken())+"','resent':'"+String.valueOf(resent)+"'}");
    }

    public void messageSendFailed(ApnsNotification message, Throwable e) {
        LOG.debug("{'method':'messageSendFailed','ApnsNotification':'"+new String(message.getDeviceToken())+"'}");
    }

    public void connectionClosed(DeliveryError e, int messageIdentifier) {
        LOG.debug("{'method':'connectionClosed','DeliveryError':'Error','messageIdentifier':'"+Integer.toString(messageIdentifier)+"'}");
    }

    public void cacheLengthExceeded(int newCacheLength) {
        LOG.debug("{'method':'cacheLengthExceeded','newCacheLength':'"+Integer.toString(newCacheLength)+"'}");
    }

    public void notificationsResent(int resendCount) {
        LOG.debug("{'method':'notificationsResent','resendCount':'"+Integer.toString(resendCount)+"'}");
    }
}
