package l9;

import com.google.common.collect.p;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p7.f0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f89715a;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator<a> f89716d = new Comparator() { // from class: l9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return p.j().e(aVar.f89717a, aVar2.f89717a).e(aVar.f89718b, aVar2.f89718b).d(aVar.f89719c, aVar2.f89719c).i();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f89717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f89718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f89719c;

        public a(long j11, long j12, int i11) {
            s7.a.a(j11 < j12);
            this.f89717a = j11;
            this.f89718b = j12;
            this.f89719c = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f89717a == aVar.f89717a && this.f89718b == aVar.f89718b && this.f89719c == aVar.f89719c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f89717a), Long.valueOf(this.f89718b), Integer.valueOf(this.f89719c));
        }

        public String toString() {
            return q0.J("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f89717a), Long.valueOf(this.f89718b), Integer.valueOf(this.f89719c));
        }
    }

    public c(List<a> list) {
        this.f89715a = list;
        s7.a.a(!a(list));
    }

    private static boolean a(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j11 = list.get(0).f89718b;
        for (int i11 = 1; i11 < list.size(); i11++) {
            if (list.get(i11).f89717a < j11) {
                return true;
            }
            j11 = list.get(i11).f89718b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f89715a.equals(((c) obj).f89715a);
    }

    public int hashCode() {
        return this.f89715a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f89715a;
    }
}
