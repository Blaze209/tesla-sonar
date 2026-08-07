package f1;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements u5.j<g1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0.a f63760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1.a f63761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h3 f63762e;

    public d(@NonNull String str, int i11, @NonNull h3 h3Var, @NonNull z0.a aVar, @NonNull c1.a aVar2) {
        this.f63758a = str;
        this.f63759b = i11;
        this.f63762e = h3Var;
        this.f63760c = aVar;
        this.f63761d = aVar2;
    }

    @Override // u5.j
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g1.a get() {
        Range<Integer> rangeB = this.f63760c.b();
        y0.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return g1.a.c().f(this.f63758a).g(this.f63759b).e(this.f63762e).d(this.f63761d.e()).h(this.f63761d.f()).c(b.g(156000, this.f63761d.e(), 2, this.f63761d.f(), 48000, rangeB)).b();
    }
}
