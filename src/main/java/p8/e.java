package p8;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101870a = n8.i.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.j f101871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f101873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f101875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f101876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f101877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final v7.o f101878i;

    public e(androidx.media3.datasource.a aVar, v7.j jVar, int i11, u uVar, int i12, Object obj, long j11, long j12) {
        this.f101878i = new v7.o(aVar);
        this.f101871b = (v7.j) s7.a.f(jVar);
        this.f101872c = i11;
        this.f101873d = uVar;
        this.f101874e = i12;
        this.f101875f = obj;
        this.f101876g = j11;
        this.f101877h = j12;
    }

    public final long c() {
        return this.f101878i.o();
    }

    public final long d() {
        return this.f101877h - this.f101876g;
    }

    public final Map<String, List<String>> e() {
        return this.f101878i.q();
    }

    public final Uri f() {
        return this.f101878i.p();
    }
}
