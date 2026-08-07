package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f69065a;

    public i0(j settings) {
        p013kotlin.jvm.internal.s.k(settings, "settings");
        this.f69065a = settings;
    }

    public final j a() {
        return this.f69065a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && p013kotlin.jvm.internal.s.f(this.f69065a, ((i0) obj).f69065a);
    }

    public final int hashCode() {
        return this.f69065a.hashCode();
    }

    public final String toString() {
        return "Args(settings=" + this.f69065a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
