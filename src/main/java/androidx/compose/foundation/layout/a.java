package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/d;", "Lz3/a;", "alignmentLine", "Lw4/h;", "before", "after", "e", "(Landroidx/compose/ui/d;Lz3/a;FF)Landroidx/compose/ui/d;", "top", "bottom", "g", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/a;FFLz3/h0;J)Lz3/j0;", "", DateTokenConverter.CONVERTER_KEY, "(Lz3/a;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class C0099a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z3.a f4532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f4536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f4537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f4538i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0099a(z3.a aVar, float f11, int i11, int i12, int i13, w0 w0Var, int i14) {
            super(1);
            this.f4532c = aVar;
            this.f4533d = f11;
            this.f4534e = i11;
            this.f4535f = i12;
            this.f4536g = i13;
            this.f4537h = w0Var;
            this.f4538i = i14;
        }

        public final void a(w0.a aVar) {
            int i11;
            int i12 = 0;
            if (a.d(this.f4532c)) {
                i11 = 0;
            } else {
                i11 = !w4.h.i(this.f4533d, w4.h.INSTANCE.c()) ? this.f4534e : (this.f4535f - this.f4536g) - this.f4537h.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
            }
            if (a.d(this.f4532c)) {
                i12 = !w4.h.i(this.f4533d, w4.h.INSTANCE.c()) ? this.f4534e : (this.f4538i - this.f4536g) - this.f4537h.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
            }
            w0.a.l(aVar, this.f4537h, i11, i12, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z3.a f4539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4541e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z3.a aVar, float f11, float f12) {
            super(1);
            this.f4539c = aVar;
            this.f4540d = f11;
            this.f4541e = f12;
        }

        public final void a(q1 q1Var) {
            q1Var.b("paddingFrom");
            q1Var.getProperties().a("alignmentLine", this.f4539c);
            q1Var.getProperties().a("before", w4.h.d(this.f4540d));
            q1Var.getProperties().a("after", w4.h.d(this.f4541e));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 c(k0 k0Var, z3.a aVar, float f11, float f12, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(d(aVar) ? w4.b.d(j11, 0, 0, 0, 0, 11, null) : w4.b.d(j11, 0, 0, 0, 0, 14, null));
        int iG0 = w0VarX0.g0(aVar);
        if (iG0 == Integer.MIN_VALUE) {
            iG0 = 0;
        }
        int i11 = d(aVar) ? w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
        int iK = d(aVar) ? w4.b.k(j11) : w4.b.l(j11);
        w4.h.Companion companion = w4.h.INSTANCE;
        int i12 = iK - i11;
        int iN = bo0.n.n((!w4.h.i(f11, companion.c()) ? k0Var.i1(f11) : 0) - iG0, 0, i12);
        int iN2 = bo0.n.n(((!w4.h.i(f12, companion.c()) ? k0Var.i1(f12) : 0) - i11) + iG0, 0, i12 - iN);
        int i13 = d(aVar) ? w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : Math.max(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() + iN + iN2, w4.b.n(j11));
        int iMax = d(aVar) ? Math.max(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iN + iN2, w4.b.m(j11)) : w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
        int i14 = i13;
        return k0.N1(k0Var, i14, iMax, null, new C0099a(aVar, f11, iN, i14, iN2, w0VarX0, iMax), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(z3.a aVar) {
        return aVar instanceof z3.p;
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, z3.a aVar, float f11, float f12) {
        return dVar.g(new AlignmentLineOffsetDpElement(aVar, f11, f12, o1.b() ? new b(aVar, f11, f12) : o1.a(), null));
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, z3.a aVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i11 & 4) != 0) {
            f12 = w4.h.INSTANCE.c();
        }
        return e(dVar, aVar, f11, f12);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f11, float f12) {
        w4.h.Companion companion = w4.h.INSTANCE;
        return dVar.g(!w4.h.i(f11, companion.c()) ? f(androidx.compose.ui.d.INSTANCE, z3.b.a(), f11, BitmapDescriptorFactory.HUE_RED, 4, null) : androidx.compose.ui.d.INSTANCE).g(!w4.h.i(f12, companion.c()) ? f(androidx.compose.ui.d.INSTANCE, z3.b.b(), BitmapDescriptorFactory.HUE_RED, f12, 2, null) : androidx.compose.ui.d.INSTANCE);
    }
}
