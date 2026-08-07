package net.time4j.calendar.astro;

import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import net.time4j.b0;
import net.time4j.engine.z;
import net.time4j.g0;
import net.time4j.tz.k;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f94025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, b> f94026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f94027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f94028d;
    private static final long serialVersionUID = -4816619838743247977L;
    private final int altitude;
    private final String calculator;
    private final double latitude;
    private final double longitude;
    private final k observerZoneID;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f94029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f94030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f94031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f94032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private k f94033e;

        /* synthetic */ a(f fVar) {
            this();
        }

        private static void c(int i11, int i12, double d11, int i13) {
            if (i11 < 0 || i11 > i13 || (i11 == i13 && i13 != 179 && (i12 > 0 || Double.compare(d11, 0.0d) > 0))) {
                throw new IllegalArgumentException("Degrees out of range: " + i11 + " (decimal=" + (((double) i11) + (((double) i12) / 60.0d) + (d11 / 3600.0d)) + ")");
            }
            if (i12 < 0 || i12 >= 60) {
                throw new IllegalArgumentException("Arc minutes out of range: " + i12);
            }
            if (Double.isNaN(d11) || Double.isInfinite(d11)) {
                throw new IllegalArgumentException("Arc seconds must be finite.");
            }
            if (Double.compare(d11, 0.0d) < 0 || Double.compare(d11, 60.0d) >= 0) {
                throw new IllegalArgumentException("Arc seconds out of range: " + d11);
            }
        }

        public a a(int i11) {
            double d11 = i11;
            if (Double.isInfinite(d11) || Double.isNaN(d11)) {
                throw new IllegalArgumentException("Altitude must be finite: " + i11);
            }
            if (i11 >= 0 && i11 < 11000) {
                this.f94031c = i11;
                return this;
            }
            throw new IllegalArgumentException("Meters out of range 0 <= altitude < +11,000: " + i11);
        }

        public g b() {
            if (Double.isNaN(this.f94029a)) {
                throw new IllegalStateException("Latitude was not yet set.");
            }
            if (Double.isNaN(this.f94030b)) {
                throw new IllegalStateException("Longitude was not yet set.");
            }
            return new g(this.f94029a, this.f94030b, this.f94031c, this.f94032d, this.f94033e, null);
        }

        public a d(int i11, int i12, double d11) {
            c(i11, i12, d11, 179);
            if (!Double.isNaN(this.f94030b)) {
                throw new IllegalStateException("Longitude has already been set.");
            }
            this.f94030b = ((double) i11) + (((double) i12) / 60.0d) + (d11 / 3600.0d);
            return this;
        }

        public a e(int i11, int i12, double d11) {
            c(i11, i12, d11, 90);
            if (!Double.isNaN(this.f94029a)) {
                throw new IllegalStateException("Latitude has already been set.");
            }
            this.f94029a = ((double) i11) + (((double) i12) / 60.0d) + (d11 / 3600.0d);
            return this;
        }

        public a f(b bVar) {
            g.f94026b.putIfAbsent(bVar.name(), bVar);
            this.f94032d = bVar.name();
            return this;
        }

        private a() {
            this.f94029a = Double.NaN;
            this.f94030b = Double.NaN;
            this.f94031c = 0;
            this.f94032d = g.f94025a.name();
            this.f94033e = null;
        }
    }

    public interface b {
        double equationOfTime(double d11);

        String name();
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        bVar = null;
        for (b bVar : net.time4j.base.d.c().g(b.class)) {
            concurrentHashMap.put(bVar.name(), bVar);
        }
        for (h hVar : h.values()) {
            concurrentHashMap.put(hVar.name(), hVar);
        }
        f94026b = concurrentHashMap;
        if (bVar == null) {
            bVar = h.NOAA;
        }
        f94025a = bVar;
        a aVarA = f().d(35, 14, 5.0d).e(31, 46, 44.0d).a(721);
        h hVar2 = h.TIME4J;
        f94027c = aVarA.f(hVar2).b();
        f94028d = f().d(39, 49, 34.06d).e(21, 25, 21.22d).a(EnumC4419g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE).f(hVar2).b();
    }

    /* synthetic */ g(double d11, double d12, int i11, String str, k kVar, f fVar) {
        this(d11, d12, i11, str, kVar);
    }

    private static void c(double d11, double d12, int i11, String str) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            throw new IllegalArgumentException("Latitude must be a finite value: " + d11);
        }
        if (Double.isNaN(d12) || Double.isInfinite(d12)) {
            throw new IllegalArgumentException("Longitude must be a finite value: " + d12);
        }
        if (Double.compare(d11, 90.0d) > 0 || Double.compare(d11, -90.0d) < 0) {
            throw new IllegalArgumentException("Degrees out of range -90.0 <= latitude <= +90.0: " + d11);
        }
        if (Double.compare(d12, 180.0d) >= 0 || Double.compare(d12, -180.0d) < 0) {
            throw new IllegalArgumentException("Degrees out of range -180.0 <= longitude < +180.0: " + d12);
        }
        double d13 = i11;
        if (Double.isNaN(d13) || Double.isInfinite(d13)) {
            throw new IllegalArgumentException("Altitude must be finite: " + i11);
        }
        if (i11 < 0 || i11 >= 11000) {
            throw new IllegalArgumentException("Meters out of range 0 <= altitude < +11,000: " + i11);
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing calculator.");
        }
        if (f94026b.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Unknown calculator: " + str);
    }

    private static boolean d(k kVar, k kVar2) {
        if (kVar == null) {
            return kVar2 == null;
        }
        if (kVar2 == null) {
            return false;
        }
        return kVar.a().equals(kVar2.a());
    }

    static b0 e(net.time4j.engine.g gVar, int i11, double d11, String str) {
        b bVar = f94026b.get(str);
        double dH = ((gVar.h() * 86400) + ((long) (i11 * 3600))) - (d11 * 240.0d);
        long jFloor = (long) Math.floor(dH);
        int i12 = (int) ((dH - jFloor) * 1.0E9d);
        fp0.f fVar = fp0.f.UT;
        if (!fp0.d.n().r()) {
            jFloor += 63072000;
            fVar = fp0.f.POSIX;
        }
        b0 b0VarK0 = b0.k0(jFloor, i12, fVar);
        fp0.f fVar2 = fp0.f.TT;
        double dEquationOfTime = bVar.equationOfTime(c.e(b0VarK0, fVar2));
        long jFloor2 = (long) Math.floor(dEquationOfTime);
        int i13 = (int) ((dEquationOfTime - jFloor2) * 1.0E9d);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b0 b0VarG = b0VarK0.G(jFloor2, timeUnit);
        long j11 = i13;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        double dEquationOfTime2 = bVar.equationOfTime(c.e(b0VarG.G(j11, timeUnit2), fVar2));
        long jFloor3 = (long) Math.floor(dEquationOfTime2);
        return b0VarK0.G(jFloor3, timeUnit).G((int) ((dEquationOfTime2 - jFloor3) * 1.0E9d), timeUnit2);
    }

    public static a f() {
        return new a(null);
    }

    static g0 g(net.time4j.engine.g gVar) {
        return gVar instanceof g0 ? (g0) gVar : g0.O0(gVar.h(), z.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        c(this.latitude, this.longitude, this.altitude, this.calculator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.calculator.equals(gVar.calculator) && Double.compare(this.latitude, gVar.latitude) == 0 && Double.compare(this.longitude, gVar.longitude) == 0 && this.altitude == gVar.altitude && d(this.observerZoneID, gVar.observerZoneID)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.calculator.hashCode() + (net.time4j.calendar.astro.a.a(this.latitude) * 7) + (net.time4j.calendar.astro.a.a(this.longitude) * 31) + (this.altitude * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SolarTime[latitude=");
        sb2.append(this.latitude);
        sb2.append(",longitude=");
        sb2.append(this.longitude);
        if (this.altitude != 0) {
            sb2.append(",altitude=");
            sb2.append(this.altitude);
        }
        if (!this.calculator.equals(f94025a.name())) {
            sb2.append(",calculator=");
            sb2.append(this.calculator);
        }
        if (this.observerZoneID != null) {
            sb2.append(",observerZoneID=");
            sb2.append(this.observerZoneID.a());
        }
        sb2.append(']');
        return sb2.toString();
    }

    private g(double d11, double d12, int i11, String str, k kVar) {
        this.latitude = d11;
        this.longitude = d12;
        this.altitude = i11;
        this.calculator = str;
        this.observerZoneID = kVar;
    }
}
