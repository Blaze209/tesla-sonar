package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import k3.BlendModeColorFilter;
import k3.b1;
import k3.i4;
import k3.j4;
import k3.p1;
import k3.q1;
import k3.v3;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lk3/p1;", "other", "", "e", "(JJ)Z", "Lk3/q1;", "f", "(Lk3/q1;)Z", "", "Lp3/h;", "a", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "EmptyPath", "Lk3/i4;", "b", "I", "()I", "DefaultStrokeLineCap", "Lk3/j4;", "c", "DefaultStrokeLineJoin", "Lk3/b1;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Lk3/v3;", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<h> f101038a = v.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f101039b = i4.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f101040c = j4.INSTANCE.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f101041d = b1.INSTANCE.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f101042e = p1.INSTANCE.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f101043f = v3.INSTANCE.b();

    public static final int a() {
        return f101043f;
    }

    public static final int b() {
        return f101039b;
    }

    public static final int c() {
        return f101040c;
    }

    public static final List<h> d() {
        return f101038a;
    }

    public static final boolean e(long j11, long j12) {
        return p1.w(j11) == p1.w(j12) && p1.v(j11) == p1.v(j12) && p1.t(j11) == p1.t(j12);
    }

    public static final boolean f(q1 q1Var) {
        if (!(q1Var instanceof BlendModeColorFilter)) {
            return q1Var == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) q1Var;
        int blendMode = blendModeColorFilter.getBlendMode();
        b1.Companion companion = b1.INSTANCE;
        return b1.E(blendMode, companion.z()) || b1.E(blendModeColorFilter.getBlendMode(), companion.B());
    }
}
