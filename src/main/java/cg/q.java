package cg;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f19302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19303c;

    public q(String str, List<c> list, boolean z11) {
        this.f19301a = str;
        this.f19302b = list;
        this.f19303c = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.d(pVar, bVar, this, iVar);
    }

    public List<c> b() {
        return this.f19302b;
    }

    public String c() {
        return this.f19301a;
    }

    public boolean d() {
        return this.f19303c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f19301a + "' Shapes: " + Arrays.toString(this.f19302b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
