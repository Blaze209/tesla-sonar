package p019p1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015\u001ak\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Lp1/q;", "V", "Lp1/k;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "f", "(Lp1/k;Ljava/lang/Object;Lp1/q;JJZ)Lp1/k;", "", "Lp1/m;", "velocity", "e", "(Lp1/k;FFJJZ)Lp1/k;", "initialValue", "initialVelocity", "a", "(FFJJZ)Lp1/k;", "Lp1/p1;", "typeConverter", "b", "(Lp1/p1;Ljava/lang/Object;Ljava/lang/Object;JJZ)Lp1/k;", IntegerTokenConverter.CONVERTER_KEY, "(Lp1/p1;Ljava/lang/Object;)Lp1/q;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final AnimationState<Float, m> a(float f11, float f12, long j11, long j12, boolean z11) {
        return new AnimationState<>(r1.e(p013kotlin.jvm.internal.l.f86526a), Float.valueOf(f11), r.a(f12), j11, j12, z11);
    }

    public static final <T, V extends q> AnimationState<T, V> b(p1<T, V> p1Var, T t11, T t12, long j11, long j12, boolean z11) {
        return new AnimationState<>(p1Var, t11, p1Var.a().invoke(t12), j11, j12, z11);
    }

    public static /* synthetic */ AnimationState c(float f11, float f12, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i11 & 4) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i11 & 8) != 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return a(f11, f12, j11, j12, z11);
    }

    public static /* synthetic */ AnimationState d(p1 p1Var, Object obj, Object obj2, long j11, long j12, boolean z11, int i11, Object obj3) {
        if ((i11 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i11 & 16) != 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        return b(p1Var, obj, obj2, j11, j12, z11);
    }

    public static final AnimationState<Float, m> e(AnimationState<Float, m> kVar, float f11, float f12, long j11, long j12, boolean z11) {
        return new AnimationState<>(kVar.o(), Float.valueOf(f11), r.a(f12), j11, j12, z11);
    }

    public static final <T, V extends q> AnimationState<T, V> f(AnimationState<T, V> kVar, T t11, V v11, long j11, long j12, boolean z11) {
        return new AnimationState<>(kVar.o(), t11, v11, j11, j12, z11);
    }

    public static /* synthetic */ AnimationState g(AnimationState kVar, float f11, float f12, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = ((Number) kVar.getValue()).floatValue();
        }
        if ((i11 & 2) != 0) {
            f12 = ((m) kVar.q()).getValue();
        }
        if ((i11 & 4) != 0) {
            j11 = kVar.getLastFrameTimeNanos();
        }
        if ((i11 & 8) != 0) {
            j12 = kVar.getFinishedTimeNanos();
        }
        if ((i11 & 16) != 0) {
            z11 = kVar.getIsRunning();
        }
        boolean z12 = z11;
        long j13 = j12;
        return e(kVar, f11, f12, j11, j13, z12);
    }

    public static /* synthetic */ AnimationState h(AnimationState kVar, Object obj, q qVar, long j11, long j12, boolean z11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = kVar.getValue();
        }
        if ((i11 & 2) != 0) {
            qVar = r.e(kVar.q());
        }
        if ((i11 & 4) != 0) {
            j11 = kVar.getLastFrameTimeNanos();
        }
        if ((i11 & 8) != 0) {
            j12 = kVar.getFinishedTimeNanos();
        }
        if ((i11 & 16) != 0) {
            z11 = kVar.getIsRunning();
        }
        boolean z12 = z11;
        long j13 = j12;
        return f(kVar, obj, qVar, j11, j13, z12);
    }

    public static final <T, V extends q> V i(p1<T, V> p1Var, T t11) {
        V vInvoke = p1Var.a().invoke(t11);
        vInvoke.d();
        return vInvoke;
    }
}
