package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9119a;

    public DataSourceException(int i11) {
        this.f9119a = i11;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f9119a == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th2, int i11) {
        super(th2);
        this.f9119a = i11;
    }

    public DataSourceException(String str, int i11) {
        super(str);
        this.f9119a = i11;
    }

    public DataSourceException(String str, Throwable th2, int i11) {
        super(str, th2);
        this.f9119a = i11;
    }
}
