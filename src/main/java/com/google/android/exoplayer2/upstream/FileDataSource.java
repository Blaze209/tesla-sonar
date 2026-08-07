package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import ss.e;
import ss.l;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class FileDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f41029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f41030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f41031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41032h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }

        public FileDataSourceException(String str, Throwable th2, int i11) {
            super(str, th2, i11);
        }
    }

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile r(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) ts.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e11, (p0.f115040a < 21 || !a.b(e11.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(e12, 2006);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }

    @Override // ss.i
    public void close() {
        this.f41030f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f41029e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f41029e = null;
                if (this.f41032h) {
                    this.f41032h = false;
                    o();
                }
            } catch (IOException e11) {
                throw new FileDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f41029e = null;
            if (this.f41032h) {
                this.f41032h = false;
                o();
            }
            throw th2;
        }
    }

    @Override // ss.i
    public Uri getUri() {
        return this.f41030f;
    }

    @Override // ss.i
    public long j(l lVar) throws FileDataSourceException {
        Uri uri = lVar.f111661a;
        this.f41030f = uri;
        p(lVar);
        RandomAccessFile randomAccessFileR = r(uri);
        this.f41029e = randomAccessFileR;
        try {
            randomAccessFileR.seek(lVar.f111667g);
            long length = lVar.f111668h;
            if (length == -1) {
                length = this.f41029e.length() - lVar.f111667g;
            }
            this.f41031g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f41032h = true;
            q(lVar);
            return this.f41031g;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11, 2000);
        }
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) throws FileDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        if (this.f41031g == 0) {
            return -1;
        }
        try {
            int i13 = ((RandomAccessFile) p0.j(this.f41029e)).read(bArr, i11, (int) Math.min(this.f41031g, i12));
            if (i13 > 0) {
                this.f41031g -= (long) i13;
                n(i13);
            }
            return i13;
        } catch (IOException e11) {
            throw new FileDataSourceException(e11, 2000);
        }
    }
}
