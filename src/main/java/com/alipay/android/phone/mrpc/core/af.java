package com.alipay.android.phone.mrpc.core;

import android.util.Log;
import java.io.IOException;
import java.net.SocketException;
import javax.net.ssl.SSLException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
public class af implements HttpRequestRetryHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f19982a = af.class.getSimpleName();

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i11, HttpContext httpContext) {
        String str;
        String str2;
        if (i11 >= 3) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            str = f19982a;
            str2 = "exception instanceof NoHttpResponseException";
        } else {
            if ((!(iOException instanceof SocketException) && !(iOException instanceof SSLException)) || iOException.getMessage() == null || !iOException.getMessage().contains("Broken pipe")) {
                return false;
            }
            str = f19982a;
            str2 = "exception instanceof SocketException:Broken pipe";
        }
        Log.v(str, str2);
        return true;
    }
}
