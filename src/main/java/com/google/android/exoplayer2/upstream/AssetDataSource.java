package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import ss.e;
import ss.l;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class AssetDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f41017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f41018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f41019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41021i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i11) {
            super(th2, i11);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f41017e = context.getAssets();
    }

    @Override // ss.i
    public void close() {
        this.f41018f = null;
        try {
            try {
                InputStream inputStream = this.f41019g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f41019g = null;
                if (this.f41021i) {
                    this.f41021i = false;
                    o();
                }
            } catch (IOException e11) {
                throw new AssetDataSourceException(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f41019g = null;
            if (this.f41021i) {
                this.f41021i = false;
                o();
            }
            throw th2;
        }
    }

    @Override // ss.i
    public Uri getUri() {
        return this.f41018f;
    }

    @Override // ss.i
    public long j(l lVar) throws AssetDataSourceException {
        try {
            Uri uri = lVar.f111661a;
            this.f41018f = uri;
            String strSubstring = (String) ts.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            p(lVar);
            InputStream inputStreamOpen = this.f41017e.open(strSubstring, 1);
            this.f41019g = inputStreamOpen;
            if (inputStreamOpen.skip(lVar.f111667g) < lVar.f111667g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j11 = lVar.f111668h;
            if (j11 != -1) {
                this.f41020h = j11;
            } else {
                long jAvailable = this.f41019g.available();
                this.f41020h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f41020h = -1L;
                }
            }
            this.f41021i = true;
            q(lVar);
            return this.f41020h;
        } catch (AssetDataSourceException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new AssetDataSourceException(e12, e12 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) throws AssetDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f41020h;
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
        int i13 = ((InputStream) p0.j(this.f41019g)).read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        long j12 = this.f41020h;
        if (j12 != -1) {
            this.f41020h = j12 - ((long) i13);
        }
        n(i13);
        return i13;
    }
}
