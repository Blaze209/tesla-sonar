package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final s1 f69146d = new s1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ro0.d[] f69147e = {null, e.Companion.a(), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f69149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f69150c;

    public /* synthetic */ v1(int i11, String str, e eVar, x xVar) {
        if (6 != (i11 & 6)) {
            vo0.h1.b(i11, 6, o1.f69103a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.f69148a = s1.a(f69146d);
        } else {
            this.f69148a = str;
        }
        this.f69149b = eVar;
        this.f69150c = xVar;
    }

    public static final /* synthetic */ void a(v1 v1Var, uo0.d dVar, vo0.m1 m1Var) {
        ro0.d[] dVarArr = f69147e;
        if (dVar.G(m1Var, 0) || !p013kotlin.jvm.internal.s.f(v1Var.f69148a, s1.a(f69146d))) {
            dVar.e(m1Var, 0, v1Var.f69148a);
        }
        dVar.D(m1Var, 1, dVarArr[1], v1Var.f69149b);
        dVar.D(m1Var, 2, s.f69127a, v1Var.f69150c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return p013kotlin.jvm.internal.s.f(this.f69148a, v1Var.f69148a) && this.f69149b == v1Var.f69149b && p013kotlin.jvm.internal.s.f(this.f69150c, v1Var.f69150c);
    }

    public final int hashCode() {
        return this.f69150c.hashCode() + ((this.f69149b.hashCode() + (this.f69148a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LogEventDto(occurrenceTime=" + this.f69148a + ", type=" + this.f69149b + ", metadata=" + this.f69150c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public v1(String occurrenceTime, e type, x metadata) {
        p013kotlin.jvm.internal.s.k(occurrenceTime, "occurrenceTime");
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        this.f69148a = occurrenceTime;
        this.f69149b = type;
        this.f69150c = metadata;
    }

    public /* synthetic */ v1(e eVar, x xVar) {
        this(s1.a(f69146d), eVar, xVar);
    }
}
