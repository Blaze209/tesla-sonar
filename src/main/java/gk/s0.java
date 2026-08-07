package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f69129e = new o0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ro0.d[] f69130f = {null, f.Companion.a(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f69131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f69132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f69133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f69134d;

    public /* synthetic */ s0(int i11, Integer num, f fVar, Long l11, k1 k1Var) {
        if ((i11 & 1) == 0) {
            this.f69131a = null;
        } else {
            this.f69131a = num;
        }
        if ((i11 & 2) == 0) {
            this.f69132b = null;
        } else {
            this.f69132b = fVar;
        }
        if ((i11 & 4) == 0) {
            this.f69133c = null;
        } else {
            this.f69133c = l11;
        }
        if ((i11 & 8) == 0) {
            this.f69134d = null;
        } else {
            this.f69134d = k1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return p013kotlin.jvm.internal.s.f(this.f69131a, s0Var.f69131a) && this.f69132b == s0Var.f69132b && p013kotlin.jvm.internal.s.f(this.f69133c, s0Var.f69133c) && p013kotlin.jvm.internal.s.f(this.f69134d, s0Var.f69134d);
    }

    public final int hashCode() {
        Integer num = this.f69131a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        f fVar = this.f69132b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Long l11 = this.f69133c;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        k1 k1Var = this.f69134d;
        return iHashCode3 + (k1Var != null ? k1Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogResponseDto(statusCode=" + this.f69131a + ", result=" + this.f69132b + ", latency=" + this.f69133c + ", error=" + this.f69134d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public s0(Integer num, f fVar, Long l11, k1 k1Var) {
        this.f69131a = num;
        this.f69132b = fVar;
        this.f69133c = l11;
        this.f69134d = k1Var;
    }
}
