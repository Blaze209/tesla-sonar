package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentMap f82234g = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f82235h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayOfWeek f82236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient u f82238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient u f82239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient u f82240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient u f82241f;

    static {
        new v(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        f82235h = i.f82206d;
    }

    public static v a(DayOfWeek dayOfWeek, int i11) {
        String str = dayOfWeek.toString() + i11;
        ConcurrentMap concurrentMap = f82234g;
        v vVar = (v) concurrentMap.get(str);
        if (vVar != null) {
            return vVar;
        }
        concurrentMap.putIfAbsent(str, new v(dayOfWeek, i11));
        return (v) concurrentMap.get(str);
    }

    public v(DayOfWeek dayOfWeek, int i11) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f82238c = new u("DayOfWeek", this, chronoUnit, chronoUnit2, u.f82225f);
        this.f82239d = new u("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, u.f82226g);
        h hVar = i.f82206d;
        this.f82240e = new u("WeekOfWeekBasedYear", this, chronoUnit2, hVar, u.f82228i);
        this.f82241f = new u("WeekBasedYear", this, hVar, ChronoUnit.FOREVER, a.YEAR.f82197b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i11 < 1 || i11 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f82236a = dayOfWeek;
        this.f82237b = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f82236a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i11 = this.f82237b;
        if (i11 < 1 || i11 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f82236a, this.f82237b);
        } catch (IllegalArgumentException e11) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e11.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f82236a.ordinal() * 7) + this.f82237b;
    }

    public final String toString() {
        return "WeekFields[" + this.f82236a + "," + this.f82237b + "]";
    }
}
