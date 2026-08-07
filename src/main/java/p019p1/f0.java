package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lp1/d0;", "a", "Lp1/d0;", "c", "()Lp1/d0;", "FastOutSlowInEasing", "b", "e", "LinearOutSlowInEasing", "getFastOutLinearInEasing", "FastOutLinearInEasing", DateTokenConverter.CONVERTER_KEY, "LinearEasing", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f100363a = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f100364b = new CubicBezierEasing(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f100365c = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d0 f100366d = new d0() { // from class: p1.e0
        @Override // p019p1.d0
        public final float a(float f11) {
            return f0.b(f11);
        }
    };

    public static final d0 c() {
        return f100363a;
    }

    public static final d0 d() {
        return f100366d;
    }

    public static final d0 e() {
        return f100364b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f11) {
        return f11;
    }
}
