package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69092b;

    public m(int i11, String str) {
        super(0);
        this.f69091a = i11;
        this.f69092b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f69091a == mVar.f69091a && p013kotlin.jvm.internal.s.f(this.f69092b, mVar.f69092b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f69091a) * 31;
        String str = this.f69092b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HttpError(code=" + this.f69091a + ", message=" + this.f69092b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
