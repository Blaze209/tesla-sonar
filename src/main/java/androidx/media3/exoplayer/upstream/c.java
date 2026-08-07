package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import n8.i;
import s7.q0;
import v7.h;
import v7.j;
import v7.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f11169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<? extends T> f11170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile T f11171f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public c(androidx.media3.datasource.a aVar, Uri uri, int i11, a<? extends T> aVar2) {
        this(aVar, new j.b().i(uri).b(1).a(), i11, aVar2);
    }

    public static <T> T g(androidx.media3.datasource.a aVar, a<? extends T> aVar2, Uri uri, int i11) {
        c cVar = new c(aVar, uri, i11, aVar2);
        cVar.a();
        return (T) s7.a.f(cVar.e());
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void a() {
        this.f11169d.r();
        h hVar = new h(this.f11169d, this.f11167b);
        try {
            hVar.n();
            this.f11171f = this.f11170e.a((Uri) s7.a.f(this.f11169d.getUri()), hVar);
        } finally {
            q0.p(hVar);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void b() {
    }

    public long c() {
        return this.f11169d.o();
    }

    public Map<String, List<String>> d() {
        return this.f11169d.q();
    }

    public final T e() {
        return this.f11171f;
    }

    public Uri f() {
        return this.f11169d.p();
    }

    public c(androidx.media3.datasource.a aVar, j jVar, int i11, a<? extends T> aVar2) {
        this.f11169d = new o(aVar);
        this.f11167b = jVar;
        this.f11168c = i11;
        this.f11170e = aVar2;
        this.f11166a = i.a();
    }
}
