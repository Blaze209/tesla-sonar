package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f69152e = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f69153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f69155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0 f69156d;

    public /* synthetic */ x(int i11, k1 k1Var, String str, h0 h0Var, s0 s0Var) {
        if ((i11 & 1) == 0) {
            this.f69153a = null;
        } else {
            this.f69153a = k1Var;
        }
        if ((i11 & 2) == 0) {
            this.f69154b = null;
        } else {
            this.f69154b = str;
        }
        if ((i11 & 4) == 0) {
            this.f69155c = null;
        } else {
            this.f69155c = h0Var;
        }
        if ((i11 & 8) == 0) {
            this.f69156d = null;
        } else {
            this.f69156d = s0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p013kotlin.jvm.internal.s.f(this.f69153a, xVar.f69153a) && p013kotlin.jvm.internal.s.f(this.f69154b, xVar.f69154b) && p013kotlin.jvm.internal.s.f(this.f69155c, xVar.f69155c) && p013kotlin.jvm.internal.s.f(this.f69156d, xVar.f69156d);
    }

    public final int hashCode() {
        k1 k1Var = this.f69153a;
        int iHashCode = (k1Var == null ? 0 : k1Var.hashCode()) * 31;
        String str = this.f69154b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        h0 h0Var = this.f69155c;
        int iHashCode3 = (iHashCode2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        s0 s0Var = this.f69156d;
        return iHashCode3 + (s0Var != null ? s0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogMetadataDto(error=" + this.f69153a + ", result=" + this.f69154b + ", request=" + this.f69155c + ", response=" + this.f69156d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public x(k1 k1Var, String str, h0 h0Var, s0 s0Var) {
        this.f69153a = k1Var;
        this.f69154b = str;
        this.f69155c = h0Var;
        this.f69156d = s0Var;
    }

    public /* synthetic */ x(k1 k1Var, h0 h0Var, s0 s0Var, int i11) {
        this((i11 & 1) != 0 ? null : k1Var, (String) null, (i11 & 4) != 0 ? null : h0Var, (i11 & 8) != 0 ? null : s0Var);
    }
}
