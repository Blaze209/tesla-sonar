package v7;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f118087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f118088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f118089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f118090h;

    public c() {
        super(false);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        if (this.f118088f != null) {
            this.f118088f = null;
            p();
        }
        this.f118087e = null;
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        j jVar = this.f118087e;
        if (jVar != null) {
            return jVar.f118101a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws ParserException, DataSourceException {
        q(jVar);
        this.f118087e = jVar;
        Uri uriNormalizeScheme = jVar.f118101a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        s7.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrE1 = q0.E1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrE1.length != 2) {
            throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrE1[1];
        if (strArrE1[0].contains(";base64")) {
            try {
                this.f118088f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e11) {
                throw ParserException.b("Error while parsing Base64 encoded string: " + str, e11);
            }
        } else {
            this.f118088f = q0.E0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j11 = jVar.f118107g;
        byte[] bArr = this.f118088f;
        if (j11 > bArr.length) {
            this.f118088f = null;
            throw new DataSourceException(2008);
        }
        int i11 = (int) j11;
        this.f118089g = i11;
        int length = bArr.length - i11;
        this.f118090h = length;
        long j12 = jVar.f118108h;
        if (j12 != -1) {
            this.f118090h = (int) Math.min(length, j12);
        }
        r(jVar);
        long j13 = jVar.f118108h;
        return j13 != -1 ? j13 : this.f118090h;
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f118090h;
        if (i13 == 0) {
            return -1;
        }
        int iMin = Math.min(i12, i13);
        System.arraycopy(q0.l(this.f118088f), this.f118089g, bArr, i11, iMin);
        this.f118089g += iMin;
        this.f118090h -= iMin;
        o(iMin);
        return iMin;
    }
}
