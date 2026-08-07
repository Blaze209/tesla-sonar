package androidx.media3.datasource;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f9125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9126c;

    public HttpDataSource$HttpDataSourceException(j jVar, int i11, int i12) {
        super(b(i11, i12));
        this.f9125b = jVar;
        this.f9126c = i12;
    }

    private static int b(int i11, int i12) {
        if (i11 == 2000 && i12 == 1) {
            return 2001;
        }
        return i11;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final j jVar, int i11) {
        int i12;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i12 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i12 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
        } else {
            i12 = (message == null || !ou.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i12 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, jVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, jVar, i12, i11);
    }

    public HttpDataSource$HttpDataSourceException(String str, j jVar, int i11, int i12) {
        super(str, b(i11, i12));
        this.f9125b = jVar;
        this.f9126c = i12;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, j jVar, int i11, int i12) {
        super(iOException, b(i11, i12));
        this.f9125b = jVar;
        this.f9126c = i12;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, j jVar, int i11, int i12) {
        super(str, iOException, b(i11, i12));
        this.f9125b = jVar;
        this.f9126c = i12;
    }
}
