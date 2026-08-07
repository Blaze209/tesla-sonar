package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import s7.q0;
import v7.j;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends v7.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f9120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f9121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9123h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }

        public FileDataSourceException(String str, Throwable th2, int i11) {
            super(str, th2, i11);
        }
    }

    public static final class a implements androidx.media3.datasource.a.InterfaceC0192a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f9124a;

        @Override // androidx.media3.datasource.a.InterfaceC0192a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDataSource a() {
            FileDataSource fileDataSource = new FileDataSource();
            q qVar = this.f9124a;
            if (qVar != null) {
                fileDataSource.n(qVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile s(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) s7.a.f(uri.getPath()), "r");
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(e12, 2006);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f9121f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9120e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f9120e = null;
                if (this.f9123h) {
                    this.f9123h = false;
                    p();
                }
            } catch (IOException e11) {
                throw new FileDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f9120e = null;
            if (this.f9123h) {
                this.f9123h = false;
                p();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f9121f;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws FileDataSourceException {
        Uri uri = jVar.f118101a;
        this.f9121f = uri;
        q(jVar);
        RandomAccessFile randomAccessFileS = s(uri);
        this.f9120e = randomAccessFileS;
        try {
            randomAccessFileS.seek(jVar.f118107g);
            long length = jVar.f118108h;
            if (length == -1) {
                length = this.f9120e.length() - jVar.f118107g;
            }
            this.f9122g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f9123h = true;
            r(jVar);
            return this.f9122g;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11, 2000);
        }
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) throws FileDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        if (this.f9122g == 0) {
            return -1;
        }
        try {
            int i13 = ((RandomAccessFile) q0.l(this.f9120e)).read(bArr, i11, (int) Math.min(this.f9122g, i12));
            if (i13 > 0) {
                this.f9122g -= (long) i13;
                o(i13);
            }
            return i13;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11, 2000);
        }
    }
}
