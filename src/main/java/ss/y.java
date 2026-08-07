package ss;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f111771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f111772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f111773c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f111774d = Collections.EMPTY_MAP;

    public y(i iVar) {
        this.f111771a = (i) ts.a.e(iVar);
    }

    @Override // ss.i
    public Map<String, List<String>> b() {
        return this.f111771a.b();
    }

    @Override // ss.i
    public void close() {
        this.f111771a.close();
    }

    @Override // ss.i
    public Uri getUri() {
        return this.f111771a.getUri();
    }

    @Override // ss.i
    public long j(l lVar) {
        this.f111773c = lVar.f111661a;
        this.f111774d = Collections.EMPTY_MAP;
        long j11 = this.f111771a.j(lVar);
        this.f111773c = (Uri) ts.a.e(getUri());
        this.f111774d = b();
        return j11;
    }

    @Override // ss.i
    public void m(z zVar) {
        ts.a.e(zVar);
        this.f111771a.m(zVar);
    }

    public long n() {
        return this.f111772b;
    }

    public Uri o() {
        return this.f111773c;
    }

    public Map<String, List<String>> p() {
        return this.f111774d;
    }

    public void q() {
        this.f111772b = 0L;
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f111771a.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f111772b += (long) i13;
        }
        return i13;
    }
}
