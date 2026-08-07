package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f69105c = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f69107b;

    public /* synthetic */ p(int i11, String str, d0 d0Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, i.f69063a.getDescriptor());
        }
        this.f69106a = str;
        if ((i11 & 2) == 0) {
            this.f69107b = null;
        } else {
            this.f69107b = d0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p013kotlin.jvm.internal.s.f(this.f69106a, pVar.f69106a) && p013kotlin.jvm.internal.s.f(this.f69107b, pVar.f69107b);
    }

    public final int hashCode() {
        String str = this.f69106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d0 d0Var = this.f69107b;
        return iHashCode + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogMerchantDto(country=" + this.f69106a + ", app=" + this.f69107b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public p(String str, d0 d0Var) {
        this.f69106a = str;
        this.f69107b = d0Var;
    }
}
