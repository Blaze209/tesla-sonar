package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69135a;

    public t(String str) {
        super(0);
        this.f69135a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && p013kotlin.jvm.internal.s.f(this.f69135a, ((t) obj).f69135a);
    }

    public final int hashCode() {
        String str = this.f69135a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Unavailable(message=" + this.f69135a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
