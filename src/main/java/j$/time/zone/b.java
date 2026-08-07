package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f82245e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f82247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f82248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f82249d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f82246a, ((b) obj).f82246a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f82246a = localDateTime.r(zoneOffset);
        this.f82247b = localDateTime;
        this.f82248c = zoneOffset;
        this.f82249d = zoneOffset2;
    }

    public b(long j11, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f82246a = j11;
        this.f82247b = LocalDateTime.J(j11, 0, zoneOffset);
        this.f82248c = zoneOffset;
        this.f82249d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean s() {
        return this.f82249d.getTotalSeconds() > this.f82248c.getTotalSeconds();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f82246a == bVar.f82246a && this.f82248c.equals(bVar.f82248c) && this.f82249d.equals(bVar.f82249d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f82247b.hashCode() ^ this.f82248c.hashCode()) ^ Integer.rotateLeft(this.f82249d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(s() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f82247b);
        sb2.append(this.f82248c);
        sb2.append(" to ");
        sb2.append(this.f82249d);
        sb2.append(']');
        return sb2.toString();
    }
}
