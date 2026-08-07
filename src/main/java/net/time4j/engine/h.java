package net.time4j.engine;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements Comparable<h>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f94148a = new h(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f94149b = new h(1);
    private final long days;

    private h(long j11) {
        this.days = j11;
    }

    public static h c(long j11) {
        if (j11 == 0) {
            return f94148a;
        }
        return j11 == 1 ? f94149b : new h(j11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        long j11 = this.days;
        long j12 = hVar.days;
        if (j11 < j12) {
            return -1;
        }
        return j11 > j12 ? 1 : 0;
    }

    public long b() {
        return this.days;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.days == ((h) obj).days;
    }

    public int hashCode() {
        long j11 = this.days;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.days < 0) {
            sb2.append(CoreConstants.DASH_CHAR);
        }
        sb2.append('P');
        sb2.append(Math.abs(this.days));
        sb2.append('D');
        return sb2.toString();
    }
}
