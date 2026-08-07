package androidx.media3.exoplayer;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10602c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10605c;

        public o1 d() {
            return new o1(this);
        }

        public b e(long j11) {
            s7.a.a(j11 >= 0 || j11 == -9223372036854775807L);
            this.f10605c = j11;
            return this;
        }

        public b f(long j11) {
            this.f10603a = j11;
            return this;
        }

        public b g(float f11) {
            s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED || f11 == -3.4028235E38f);
            this.f10604b = f11;
            return this;
        }

        public b() {
            this.f10603a = -9223372036854775807L;
            this.f10604b = -3.4028235E38f;
            this.f10605c = -9223372036854775807L;
        }

        private b(o1 o1Var) {
            this.f10603a = o1Var.f10600a;
            this.f10604b = o1Var.f10601b;
            this.f10605c = o1Var.f10602c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean b(long j11) {
        long j12 = this.f10602c;
        return (j12 == -9223372036854775807L || j11 == -9223372036854775807L || j12 < j11) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f10600a == o1Var.f10600a && this.f10601b == o1Var.f10601b && this.f10602c == o1Var.f10602c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f10600a), Float.valueOf(this.f10601b), Long.valueOf(this.f10602c));
    }

    private o1(b bVar) {
        this.f10600a = bVar.f10603a;
        this.f10601b = bVar.f10604b;
        this.f10602c = bVar.f10605c;
    }
}
