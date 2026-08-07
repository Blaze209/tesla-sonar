package androidx.compose.material3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p016o2.RippleConfiguration;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import q1.c0;
import q1.e0;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\r\u0010\u0010\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"", "bounded", "Lw4/h;", "radius", "Lk3/p1;", "color", "Lq1/e0;", "b", "(ZFJ)Lq1/e0;", "Lq1/c0;", DateTokenConverter.CONVERTER_KEY, "(ZFJLr2/l;II)Lq1/c0;", "Lr2/g2;", "a", "Lr2/g2;", "getLocalUseFallbackRippleImplementation", "()Lr2/g2;", "getLocalUseFallbackRippleImplementation$annotations", "()V", "LocalUseFallbackRippleImplementation", "Lo2/y;", "getLocalRippleConfiguration$annotations", "LocalRippleConfiguration", "Landroidx/compose/material3/b;", "c", "Landroidx/compose/material3/b;", "DefaultBoundedRipple", "DefaultUnboundedRipple", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<Boolean> f5130a = w.f(b.f5135c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g2<RippleConfiguration> f5131b = w.d(null, C0115a.f5134c, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.material3.b f5132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final androidx.compose.material3.b f5133d;

    /* JADX INFO: renamed from: androidx.compose.material3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo2/y;", "b", "()Lo2/y;"}, k = 3, mv = {1, 8, 0})
    static final class C0115a extends u implements wn0.a<RippleConfiguration> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0115a f5134c = new C0115a();

        C0115a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5135c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        h.Companion companion = h.INSTANCE;
        float fC = companion.c();
        p1.Companion companion2 = p1.INSTANCE;
        f5132c = new androidx.compose.material3.b(true, fC, companion2.j(), (DefaultConstructorMarker) null);
        f5133d = new androidx.compose.material3.b(false, companion.c(), companion2.j(), (DefaultConstructorMarker) null);
    }

    public static final g2<RippleConfiguration> a() {
        return f5131b;
    }

    public static final e0 b(boolean z11, float f11, long j11) {
        if (h.i(f11, h.INSTANCE.c()) && p1.r(j11, p1.INSTANCE.j())) {
            return z11 ? f5132c : f5133d;
        }
        return new androidx.compose.material3.b(z11, f11, j11, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ e0 c(boolean z11, float f11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            f11 = h.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            j11 = p1.INSTANCE.j();
        }
        return b(z11, f11, j11);
    }

    public static final c0 d(boolean z11, float f11, long j11, l lVar, int i11, int i12) {
        l lVar2;
        c0 c0VarB;
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i12 & 2) != 0) {
            f11 = h.INSTANCE.c();
        }
        float f12 = f11;
        if ((i12 & 4) != 0) {
            j11 = p1.INSTANCE.j();
        }
        long j12 = j11;
        if (o.J()) {
            o.S(-1315814667, i11, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        lVar.o(-1280632857);
        if (((Boolean) lVar.U(f5130a)).booleanValue()) {
            lVar2 = lVar;
            c0VarB = n2.l.f(z12, f12, j12, lVar2, i11 & 1022, 0);
        } else {
            lVar2 = lVar;
            c0VarB = b(z12, f12, j12);
        }
        lVar2.l();
        if (o.J()) {
            o.R();
        }
        return c0VarB;
    }
}
