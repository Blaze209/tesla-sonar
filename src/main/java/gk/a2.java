package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f69016a;

    public a2(j settings) {
        p013kotlin.jvm.internal.s.k(settings, "settings");
        this.f69016a = settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && p013kotlin.jvm.internal.s.f(this.f69016a, ((a2) obj).f69016a);
    }

    public final int hashCode() {
        return this.f69016a.hashCode();
    }

    public final String toString() {
        return "Args(settings=" + this.f69016a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
