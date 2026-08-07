package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69109a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String response) {
        super(0);
        p013kotlin.jvm.internal.s.k(response, "response");
        this.f69109a = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && p013kotlin.jvm.internal.s.f(this.f69109a, ((q) obj).f69109a);
    }

    public final int hashCode() {
        return this.f69109a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.f69109a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
