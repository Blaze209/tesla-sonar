package f1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import androidx.camera.core.impl.j1;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements u5.j<g1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h3 f63753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z0.a f63755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c1.a f63756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j1.a f63757f;

    public c(@NonNull String str, int i11, @NonNull h3 h3Var, @NonNull z0.a aVar, @NonNull c1.a aVar2, @NonNull j1.a aVar3) {
        this.f63752a = str;
        this.f63754c = i11;
        this.f63753b = h3Var;
        this.f63755d = aVar;
        this.f63756e = aVar2;
        this.f63757f = aVar3;
    }

    @Override // u5.j
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g1.a get() {
        y0.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return g1.a.c().f(this.f63752a).g(this.f63754c).e(this.f63753b).d(this.f63756e.e()).h(this.f63756e.f()).c(b.g(this.f63757f.b(), this.f63756e.e(), this.f63757f.c(), this.f63756e.f(), this.f63757f.g(), this.f63755d.b())).b();
    }
}
