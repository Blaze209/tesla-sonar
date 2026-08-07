package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f81991b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneId f81992a;

    public a(ZoneId zoneId) {
        this.f81992a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f81991b = new a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f81992a.equals(((a) obj).f81992a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f81992a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f81992a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
