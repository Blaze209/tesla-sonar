package com.android.volley.toolbox;

import android.os.SystemClock;
import com.adyen.checkout.components.core.Address;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class l {

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final VolleyError f20259b;

        private b(String str, VolleyError volleyError) {
            this.f20258a = str;
            this.f20259b = volleyError;
        }
    }

    static void a(com.android.volley.i<?> iVar, b bVar) throws VolleyError {
        com.android.volley.m retryPolicy = iVar.getRetryPolicy();
        int timeoutMs = iVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f20259b);
            iVar.addMarker(String.format("%s-retry [timeout=%s]", bVar.f20258a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e11) {
            iVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.f20258a, Integer.valueOf(timeoutMs)));
            throw e11;
        }
    }

    static com.android.volley.h b(com.android.volley.i<?> iVar, long j11, List<com.android.volley.e> list) {
        com.android.volley.a.C0410a cacheEntry = iVar.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.h(EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, (byte[]) null, true, j11, list);
        }
        return new com.android.volley.h(EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, cacheEntry.f20157a, true, j11, e.a(list, cacheEntry));
    }

    static byte[] c(InputStream inputStream, int i11, c cVar) throws Throwable {
        byte[] bArrA;
        m mVar = new m(cVar, i11);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i12 = inputStream.read(bArrA);
                    if (i12 == -1) {
                        break;
                    }
                    mVar.write(bArrA, 0, i12);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            com.android.volley.n.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.b(bArrA);
                    mVar.close();
                    throw th;
                }
            }
            byte[] byteArray = mVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.n.e("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.b(bArrA);
            mVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    static void d(long j11, com.android.volley.i<?> iVar, byte[] bArr, int i11) {
        if (com.android.volley.n.f20216b || j11 > 3000) {
            com.android.volley.n.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", iVar, Long.valueOf(j11), bArr != null ? Integer.valueOf(bArr.length) : Address.ADDRESS_NULL_PLACEHOLDER, Integer.valueOf(i11), Integer.valueOf(iVar.getRetryPolicy().a()));
        }
    }

    static b e(com.android.volley.i<?> iVar, IOException iOException, long j11, f fVar, byte[] bArr) throws ServerError, NoConnectionError {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + iVar.getUrl(), iOException);
        }
        if (fVar == null) {
            if (!iVar.shouldRetryConnectionErrors()) {
                throw new NoConnectionError(iOException);
            }
            return new b("connection", new NoConnectionError());
        }
        int iD = fVar.d();
        com.android.volley.n.c("Unexpected response code %d for %s", Integer.valueOf(iD), iVar.getUrl());
        if (bArr == null) {
            return new b("network", new NetworkError());
        }
        com.android.volley.h hVar = new com.android.volley.h(iD, bArr, false, SystemClock.elapsedRealtime() - j11, fVar.c());
        if (iD == 401 || iD == 403) {
            return new b("auth", new AuthFailureError(hVar));
        }
        if (iD >= 400 && iD <= 499) {
            throw new ClientError(hVar);
        }
        if (iD < 500 || iD > 599 || !iVar.shouldRetryServerErrors()) {
            throw new ServerError(hVar);
        }
        return new b("server", new ServerError(hVar));
    }
}
