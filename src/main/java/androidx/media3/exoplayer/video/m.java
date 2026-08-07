package androidx.media3.exoplayer.video;

import android.util.Range;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f11313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range<Double> f11314d;

    public m(float f11) {
        s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f11)));
        this.f11314d = range;
        this.f11313c = ((Double) range.getUpper()).doubleValue();
        this.f11311a = -9223372036854775807L;
        this.f11312b = -9223372036854775807L;
    }

    private double a(long j11, long j12) {
        long j13 = this.f11311a;
        if (j13 != -9223372036854775807L) {
            long j14 = this.f11312b;
            if (j14 != -9223372036854775807L && j11 != j13) {
                return (j12 - j14) / (j11 - j13);
            }
        }
        return ((Double) this.f11314d.getUpper()).doubleValue();
    }

    private void f(double d11) {
        this.f11313c = (this.f11313c * 0.800000011920929d) + (d11 * 0.20000000298023224d);
    }

    public void b(long j11, long j12) {
        s7.a.a(j11 != -9223372036854775807L);
        s7.a.a(j12 != -9223372036854775807L);
        f(((Double) this.f11314d.clamp(Double.valueOf(a(j11, j12)))).doubleValue());
        this.f11311a = j11;
        this.f11312b = j12;
    }

    public long c(long j11) {
        long j12 = this.f11311a;
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f11312b + ((j11 - j12) * this.f11313c));
    }

    public void d() {
        this.f11313c = ((Double) this.f11314d.getUpper()).doubleValue();
        this.f11311a = -9223372036854775807L;
        this.f11312b = -9223372036854775807L;
    }

    public void e(float f11) {
        s7.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        this.f11314d = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f11)));
        d();
    }
}
