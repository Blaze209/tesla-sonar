package cg;

import android.graphics.Path;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path.FillType f19296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.a f19298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bg.d f19299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19300f;

    public p(String str, boolean z11, Path.FillType fillType, bg.a aVar, bg.d dVar, boolean z12) {
        this.f19297c = str;
        this.f19295a = z11;
        this.f19296b = fillType;
        this.f19298d = aVar;
        this.f19299e = dVar;
        this.f19300f = z12;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.g(pVar, bVar, this);
    }

    public bg.a b() {
        return this.f19298d;
    }

    public Path.FillType c() {
        return this.f19296b;
    }

    public String d() {
        return this.f19297c;
    }

    public bg.d e() {
        return this.f19299e;
    }

    public boolean f() {
        return this.f19300f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f19295a + CoreConstants.CURLY_RIGHT;
    }
}
