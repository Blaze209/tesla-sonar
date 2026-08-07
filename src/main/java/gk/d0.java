package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f69027d = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69030c;

    public /* synthetic */ d0(int i11, String str, String str2, String str3) {
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, y.f69159a.getDescriptor());
        }
        this.f69028a = str;
        this.f69029b = str2;
        if ((i11 & 4) == 0) {
            this.f69030c = null;
        } else {
            this.f69030c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p013kotlin.jvm.internal.s.f(this.f69028a, d0Var.f69028a) && p013kotlin.jvm.internal.s.f(this.f69029b, d0Var.f69029b) && p013kotlin.jvm.internal.s.f(this.f69030c, d0Var.f69030c);
    }

    public final int hashCode() {
        String str = this.f69028a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f69029b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69030c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "LogPlatformDto(name=" + this.f69028a + ", version=" + this.f69029b + ", identifier=" + this.f69030c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public d0(String str, String str2, String str3) {
        this.f69028a = str;
        this.f69029b = str2;
        this.f69030c = str3;
    }

    public /* synthetic */ d0(String str, String str2) {
        this(str, str2, null);
    }
}
