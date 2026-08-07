package cg;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public class r implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.h f19306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19307d;

    public r(String str, int i11, bg.h hVar, boolean z11) {
        this.f19304a = str;
        this.f19305b = i11;
        this.f19306c = hVar;
        this.f19307d = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.r(pVar, bVar, this);
    }

    public String b() {
        return this.f19304a;
    }

    public bg.h c() {
        return this.f19306c;
    }

    public boolean d() {
        return this.f19307d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f19304a + ", index=" + this.f19305b + CoreConstants.CURLY_RIGHT;
    }
}
