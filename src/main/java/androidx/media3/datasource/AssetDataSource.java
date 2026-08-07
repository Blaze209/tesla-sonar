package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import s7.q0;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends v7.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f9108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f9109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f9110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9112i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f9108e = context.getAssets();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f9109f = null;
        try {
            try {
                InputStream inputStream = this.f9110g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9110g = null;
                if (this.f9112i) {
                    this.f9112i = false;
                    p();
                }
            } catch (IOException e11) {
                throw new AssetDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f9110g = null;
            if (this.f9112i) {
                this.f9112i = false;
                p();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f9109f;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws AssetDataSourceException {
        try {
            Uri uri = jVar.f118101a;
            this.f9109f = uri;
            String strSubstring = (String) s7.a.f(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            q(jVar);
            InputStream inputStreamOpen = this.f9108e.open(strSubstring, 1);
            this.f9110g = inputStreamOpen;
            if (inputStreamOpen.skip(jVar.f118107g) < jVar.f118107g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j11 = jVar.f118108h;
            if (j11 != -1) {
                this.f9111h = j11;
            } else {
                long jAvailable = this.f9110g.available();
                this.f9111h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9111h = -1L;
                }
            }
            this.f9112i = true;
            r(jVar);
            return this.f9111h;
        } catch (AssetDataSourceException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new AssetDataSourceException(e12, e12 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) throws AssetDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f9111h;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new AssetDataSourceException(e11, 2000);
            }
        }
        int i13 = ((InputStream) q0.l(this.f9110g)).read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        long j12 = this.f9111h;
        if (j12 != -1) {
            this.f9111h = j12 - ((long) i13);
        }
        o(i13);
        return i13;
    }
}
