package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u1 f69157b = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69158a;

    public /* synthetic */ x1(int i11, String str) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, r1.f69125a.getDescriptor());
        }
        this.f69158a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && p013kotlin.jvm.internal.s.f(this.f69158a, ((x1) obj).f69158a);
    }

    public final int hashCode() {
        return this.f69158a.hashCode();
    }

    public final String toString() {
        return "CardTokenDto(token=" + this.f69158a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
