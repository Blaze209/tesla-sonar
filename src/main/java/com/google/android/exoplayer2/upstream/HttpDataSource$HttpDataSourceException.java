package com.google.android.exoplayer2.upstream;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import ou.c;
import ss.l;

/* JADX INFO: loaded from: classes4.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f41033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41034c;

    public HttpDataSource$HttpDataSourceException(l lVar, int i11, int i12) {
        super(b(i11, i12));
        this.f41033b = lVar;
        this.f41034c = i12;
    }

    private static int b(int i11, int i12) {
        if (i11 == 2000 && i12 == 1) {
            return 2001;
        }
        return i11;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final l lVar, int i11) {
        int i12;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i12 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i12 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
        } else {
            i12 = (message == null || !c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i12 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, lVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, lVar, i12, i11);
    }

    public HttpDataSource$HttpDataSourceException(String str, l lVar, int i11, int i12) {
        super(str, b(i11, i12));
        this.f41033b = lVar;
        this.f41034c = i12;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, l lVar, int i11, int i12) {
        super(iOException, b(i11, i12));
        this.f41033b = lVar;
        this.f41034c = i12;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, l lVar, int i11, int i12) {
        super(str, iOException, b(i11, i12));
        this.f41033b = lVar;
        this.f41034c = i12;
    }
}
