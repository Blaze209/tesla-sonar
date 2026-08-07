package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.q1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import v1.PaddingValues;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/d;", "Lw4/h;", "start", "top", "end", "bottom", "l", "(Landroidx/compose/ui/d;FFFF)Landroidx/compose/ui/d;", "horizontal", "vertical", "j", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "all", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "Lv1/y;", "paddingValues", "h", "(Landroidx/compose/ui/d;Lv1/y;)Landroidx/compose/ui/d;", "Lw4/t;", "layoutDirection", "g", "(Lv1/y;Lw4/t;)F", "f", "a", "(F)Lv1/y;", "b", "(FF)Lv1/y;", DateTokenConverter.CONVERTER_KEY, "(FFFF)Lv1/y;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f4625f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f11, float f12, float f13, float f14) {
            super(1);
            this.f4622c = f11;
            this.f4623d = f12;
            this.f4624e = f13;
            this.f4625f = f14;
        }

        public final void a(q1 q1Var) {
            q1Var.b("padding");
            q1Var.getProperties().a("start", w4.h.d(this.f4622c));
            q1Var.getProperties().a("top", w4.h.d(this.f4623d));
            q1Var.getProperties().a("end", w4.h.d(this.f4624e));
            q1Var.getProperties().a("bottom", w4.h.d(this.f4625f));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4627d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f11, float f12) {
            super(1);
            this.f4626c = f11;
            this.f4627d = f12;
        }

        public final void a(q1 q1Var) {
            q1Var.b("padding");
            q1Var.getProperties().a("horizontal", w4.h.d(this.f4626c));
            q1Var.getProperties().a("vertical", w4.h.d(this.f4627d));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f11) {
            super(1);
            this.f4628c = f11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("padding");
            q1Var.c(w4.h.d(this.f4628c));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1.y f4629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v1.y yVar) {
            super(1);
            this.f4629c = yVar;
        }

        public final void a(q1 q1Var) {
            q1Var.b("padding");
            q1Var.getProperties().a("paddingValues", this.f4629c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    public static final v1.y a(float f11) {
        return new PaddingValues(f11, f11, f11, f11, null);
    }

    public static final v1.y b(float f11, float f12) {
        return new PaddingValues(f11, f12, f11, f12, null);
    }

    public static /* synthetic */ v1.y c(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.g(0);
        }
        return b(f11, f12);
    }

    public static final v1.y d(float f11, float f12, float f13, float f14) {
        return new PaddingValues(f11, f12, f13, f14, null);
    }

    public static /* synthetic */ v1.y e(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.g(0);
        }
        if ((i11 & 4) != 0) {
            f13 = w4.h.g(0);
        }
        if ((i11 & 8) != 0) {
            f14 = w4.h.g(0);
        }
        return d(f11, f12, f13, f14);
    }

    public static final float f(v1.y yVar, w4.t tVar) {
        return tVar == w4.t.Ltr ? yVar.b(tVar) : yVar.c(tVar);
    }

    public static final float g(v1.y yVar, w4.t tVar) {
        return tVar == w4.t.Ltr ? yVar.c(tVar) : yVar.b(tVar);
    }

    public static final androidx.compose.ui.d h(androidx.compose.ui.d dVar, v1.y yVar) {
        return dVar.g(new PaddingValuesElement(yVar, new d(yVar)));
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f11) {
        return dVar.g(new PaddingElement(f11, f11, f11, f11, true, new c(f11), null));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f11, float f12) {
        return dVar.g(new PaddingElement(f11, f12, f11, f12, true, new b(f11, f12), null));
    }

    public static /* synthetic */ androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.g(0);
        }
        return j(dVar, f11, f12);
    }

    public static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14) {
        return dVar.g(new PaddingElement(f11, f12, f13, f14, true, new a(f11, f12, f13, f14), null));
    }

    public static /* synthetic */ androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.g(0);
        }
        if ((i11 & 4) != 0) {
            f13 = w4.h.g(0);
        }
        if ((i11 & 8) != 0) {
            f14 = w4.h.g(0);
        }
        return l(dVar, f11, f12, f13, f14);
    }
}
