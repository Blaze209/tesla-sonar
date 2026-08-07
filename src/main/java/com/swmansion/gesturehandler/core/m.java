package com.swmansion.gesturehandler.core;

import android.view.VelocityTracker;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/swmansion/gesturehandler/core/m;", "", "", "x", "y", "<init>", "(DD)V", "vector", "j", "(Lcom/swmansion/gesturehandler/core/m;)D", "threshold", "", "l", "(Lcom/swmansion/gesturehandler/core/m;D)Z", "a", "D", "getX", "()D", "b", "getY", "c", "unitX", DateTokenConverter.CONVERTER_KEY, "unitY", "e", "k", "magnitude", "f", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final m f55369g = new m(-1.0d, 0.0d);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final m f55370h = new m(1.0d, 0.0d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final m f55371i = new m(0.0d, -1.0d);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final m f55372j = new m(0.0d, 1.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final m f55373k = new m(1.0d, -1.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final m f55374l = new m(1.0d, 1.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final m f55375m = new m(-1.0d, -1.0d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final m f55376n = new m(-1.0d, 1.0d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final m f55377o = new m(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double unitX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final double unitY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final double magnitude;

    /* JADX INFO: renamed from: com.swmansion.gesturehandler.core.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/swmansion/gesturehandler/core/m$a;", "", "<init>", "()V", "", "direction", "Lcom/swmansion/gesturehandler/core/m;", "a", "(I)Lcom/swmansion/gesturehandler/core/m;", "Landroid/view/VelocityTracker;", "tracker", "b", "(Landroid/view/VelocityTracker;)Lcom/swmansion/gesturehandler/core/m;", "VECTOR_LEFT", "Lcom/swmansion/gesturehandler/core/m;", "VECTOR_RIGHT", "VECTOR_UP", "VECTOR_DOWN", "VECTOR_RIGHT_UP", "VECTOR_RIGHT_DOWN", "VECTOR_LEFT_UP", "VECTOR_LEFT_DOWN", "VECTOR_ZERO", "", "MINIMAL_RECOGNIZABLE_MAGNITUDE", "D", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(int direction) {
            switch (direction) {
                case 1:
                    return m.f55370h;
                case 2:
                    return m.f55369g;
                case 3:
                case 7:
                default:
                    return m.f55377o;
                case 4:
                    return m.f55371i;
                case 5:
                    return m.f55373k;
                case 6:
                    return m.f55375m;
                case 8:
                    return m.f55372j;
                case 9:
                    return m.f55374l;
                case 10:
                    return m.f55376n;
            }
        }

        public final m b(VelocityTracker tracker) {
            s.k(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new m(tracker.getXVelocity(), tracker.getYVelocity());
        }

        private Companion() {
        }
    }

    public m(double d11, double d12) {
        this.x = d11;
        this.y = d12;
        double dHypot = Math.hypot(d11, d12);
        this.magnitude = dHypot;
        boolean z11 = dHypot > 0.1d;
        this.unitX = z11 ? d11 / dHypot : 0.0d;
        this.unitY = z11 ? d12 / dHypot : 0.0d;
    }

    private final double j(m vector) {
        return (this.unitX * vector.unitX) + (this.unitY * vector.unitY);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getMagnitude() {
        return this.magnitude;
    }

    public final boolean l(m vector, double threshold) {
        s.k(vector, "vector");
        return j(vector) > threshold;
    }
}
