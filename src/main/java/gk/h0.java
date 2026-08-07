package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f69058e = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69062d;

    public /* synthetic */ h0(int i11, String str, String str2, String str3, String str4) {
        if (15 != (i11 & 15)) {
            vo0.h1.b(i11, 15, f0.f69051a.getDescriptor());
        }
        this.f69059a = str;
        this.f69060b = str2;
        this.f69061c = str3;
        this.f69062d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p013kotlin.jvm.internal.s.f(this.f69059a, h0Var.f69059a) && p013kotlin.jvm.internal.s.f(this.f69060b, h0Var.f69060b) && p013kotlin.jvm.internal.s.f(this.f69061c, h0Var.f69061c) && p013kotlin.jvm.internal.s.f(this.f69062d, h0Var.f69062d);
    }

    public final int hashCode() {
        String str = this.f69059a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f69060b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69061c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f69062d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequestDto(baseUrl=" + this.f69059a + ", path=" + this.f69060b + ", query=" + this.f69061c + ", method=" + this.f69062d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public h0(String str, String str2, String str3, String str4) {
        this.f69059a = str;
        this.f69060b = str2;
        this.f69061c = str3;
        this.f69062d = str4;
    }
}
