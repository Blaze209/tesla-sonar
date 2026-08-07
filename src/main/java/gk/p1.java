package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f69108a;

    public p1(fk.c cVar) {
        super(0);
        this.f69108a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && p013kotlin.jvm.internal.s.f(this.f69108a, ((p1) obj).f69108a);
    }

    public final int hashCode() {
        Object obj = this.f69108a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Failure(reason=" + this.f69108a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
