package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lk3/p1;", "backgroundColor", "Lw4/h;", "elevation", "b", "(JFLr2/l;I)J", "Lr2/g2;", "Li2/s0;", "a", "Lr2/g2;", DateTokenConverter.CONVERTER_KEY, "()Lr2/g2;", "LocalElevationOverlay", "c", "LocalAbsoluteElevation", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<s0> f75186a = w.f(b.f75189c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<h> f75187b = w.d(null, a.f75188c, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw4/h;", "b", "()F"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75188c = new a();

        a() {
            super(0);
        }

        public final float b() {
            return h.g(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h invoke() {
            return h.d(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li2/s0;", "b", "()Li2/s0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<s0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f75189c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s0 invoke() {
            return d0.f74284a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j11, float f11, l lVar, int i11) {
        if (o.J()) {
            o.S(1613340891, i11, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long jP = p1.p(s.b(j11, lVar, i11 & 14), ((((float) Math.log(f11 + 1)) * 4.5f) + 2.0f) / 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (o.J()) {
            o.R();
        }
        return jP;
    }

    public static final g2<h> c() {
        return f75187b;
    }

    public static final g2<s0> d() {
        return f75186a;
    }
}
