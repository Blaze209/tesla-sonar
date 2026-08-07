package ss;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f111651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f111652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111654h;

    public h() {
        super(false);
    }

    @Override // ss.i
    public void close() {
        if (this.f111652f != null) {
            this.f111652f = null;
            o();
        }
        this.f111651e = null;
    }

    @Override // ss.i
    public Uri getUri() {
        l lVar = this.f111651e;
        if (lVar != null) {
            return lVar.f111661a;
        }
        return null;
    }

    @Override // ss.i
    public long j(l lVar) throws DataSourceException, ParserException {
        p(lVar);
        this.f111651e = lVar;
        Uri uriNormalizeScheme = lVar.f111661a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ts.a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrP0 = p0.P0(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrP0.length != 2) {
            throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrP0[1];
        if (strArrP0[0].contains(";base64")) {
            try {
                this.f111652f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e11) {
                throw ParserException.b("Error while parsing Base64 encoded string: " + str, e11);
            }
        } else {
            this.f111652f = p0.l0(URLDecoder.decode(str, ou.e.f99998a.name()));
        }
        long j11 = lVar.f111667g;
        byte[] bArr = this.f111652f;
        if (j11 > bArr.length) {
            this.f111652f = null;
            throw new DataSourceException(2008);
        }
        int i11 = (int) j11;
        this.f111653g = i11;
        int length = bArr.length - i11;
        this.f111654h = length;
        long j12 = lVar.f111668h;
        if (j12 != -1) {
            this.f111654h = (int) Math.min(length, j12);
        }
        q(lVar);
        long j13 = lVar.f111668h;
        return j13 != -1 ? j13 : this.f111654h;
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f111654h;
        if (i13 == 0) {
            return -1;
        }
        int iMin = Math.min(i12, i13);
        System.arraycopy(p0.j(this.f111652f), this.f111653g, bArr, i11, iMin);
        this.f111653g += iMin;
        this.f111654h -= iMin;
        n(iMin);
        return iMin;
    }
}
