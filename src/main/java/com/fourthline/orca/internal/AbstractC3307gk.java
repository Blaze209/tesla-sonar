package com.fourthline.orca.internal;

import android.graphics.Paint;
import android.view.KeyEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m3.Stroke;
import o4.TextFieldValue;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3307gk {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gk$a */
    static final class a implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f32034a;

        a(p020r2.p1 p1Var) {
            this.f32034a = p1Var;
        }

        public final Boolean a(KeyEvent event) {
            p013kotlin.jvm.internal.s.k(event, "event");
            if (t3.c.e(t3.d.b(event), t3.c.INSTANCE.a()) && t3.a.q(t3.d.a(event), t3.a.INSTANCE.b())) {
                String strH = ((TextFieldValue) this.f32034a.getValue()).h();
                int iN = i4.p0.n(((TextFieldValue) this.f32034a.getValue()).getSelection());
                if (!t3.d.e(event) && strH.length() > 0 && p013kotlin.jvm.internal.s.f(((TextFieldValue) this.f32034a.getValue()).h(), strH) && iN > 0) {
                    int i11 = iN - 1;
                    this.f32034a.setValue(new TextFieldValue(p013kotlin.text.t.U0(strH, i11, iN).toString(), i4.q0.a(i11), (i4.p0) null, 4, (DefaultConstructorMarker) null));
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((t3.b) obj).getNativeKeyEvent());
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gk$b */
    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f32036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g4.i f32037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a f32038d;

        b(boolean z11, String str, g4.i iVar, wn0.a aVar) {
            this.f32035a = z11;
            this.f32036b = str;
            this.f32037c = iVar;
            this.f32038d = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d composed, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composed, "$this$composed");
            lVar.o(1245072741);
            if (p020r2.o.J()) {
                p020r2.o.S(1245072741, i11, -1, "com.fourthline.orca.core.internal.extension.clickableWithoutAnimation.<anonymous> (ModifierExtensions.kt:116)");
            }
            lVar.o(-293812583);
            Object objI = lVar.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = u1.k.a();
                lVar.B(objI);
            }
            lVar.l();
            androidx.compose.ui.d dVarA = androidx.compose.foundation.d.a(composed, (u1.l) objI, null, this.f32035a, this.f32036b, this.f32037c, this.f32038d);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarA;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d drawBehindWithShadow, long j11, long j12, float f11, float f12, float f13, float f14, float f15) {
        p013kotlin.jvm.internal.s.k(drawBehindWithShadow, "$this$drawBehindWithShadow");
        return androidx.compose.ui.c.c(drawBehindWithShadow, null, new c(j12, f11, j11, f13, f15, f14, f12), 1, null);
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, String name) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(name, "name");
        return a(dVar, name, (String) null, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(String str, g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        if (str != null) {
            g4.v.c0(semantics, str);
        }
        return jn0.h0.f84049a;
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d drawOutlineWithShadow, final long j11, long j12, long j13, final float f11, final float f12, float f13, float f14) {
        p013kotlin.jvm.internal.s.k(drawOutlineWithShadow, "$this$drawOutlineWithShadow");
        return androidx.compose.ui.draw.b.b(a(drawOutlineWithShadow, j13, j12, BitmapDescriptorFactory.HUE_RED, f14, f13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 100, (Object) null), new wn0.l() { // from class: com.fourthline.orca.internal.g21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.a(j11, f12, f11, (m3.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.v.z0(semantics, true);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(String str, g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.v.c0(semantics, str);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(long j11, float f11, float f12, m3.f drawBehind) {
        p013kotlin.jvm.internal.s.k(drawBehind, "$this$drawBehind");
        m3.f.D1(drawBehind, j11, 0L, j3.n.a(j3.m.k(drawBehind.b()), j3.m.i(drawBehind.b())), j3.b.a(f11, f11), new Stroke(f12, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null), BitmapDescriptorFactory.HUE_RED, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.gk$c */
    static final class c implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f32039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f32040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f32041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f32042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f32043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f32044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f32045g;

        c(long j11, float f11, long j12, float f12, float f13, float f14, float f15) {
            this.f32039a = j11;
            this.f32040b = f11;
            this.f32041c = j12;
            this.f32042d = f12;
            this.f32043e = f13;
            this.f32044f = f14;
            this.f32045g = f15;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d composed, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(composed, "$this$composed");
            lVar.o(-165560258);
            if (p020r2.o.J()) {
                p020r2.o.S(-165560258, i11, -1, "com.fourthline.orca.core.internal.extension.drawBehindWithShadow.<anonymous> (ModifierExtensions.kt:55)");
            }
            final int iK = k3.r1.k(k3.p1.p(this.f32039a, this.f32040b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
            final int iK2 = k3.r1.k(this.f32041c);
            lVar.o(276395789);
            boolean zR = lVar.r(iK2) | lVar.q(this.f32042d) | lVar.q(this.f32043e) | lVar.q(this.f32044f) | lVar.r(iK) | lVar.q(this.f32045g);
            final float f11 = this.f32042d;
            final float f12 = this.f32043e;
            final float f13 = this.f32044f;
            final float f14 = this.f32045g;
            Object objI = lVar.I();
            if (zR || objI == p020r2.l.INSTANCE.a()) {
                wn0.l lVar2 = new wn0.l() { // from class: com.fourthline.orca.internal.l21
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3307gk.c.a(iK2, f11, f12, f13, iK, f14, (m3.f) obj);
                    }
                };
                lVar.B(lVar2);
                objI = lVar2;
            }
            lVar.l();
            androidx.compose.ui.d dVarB = androidx.compose.ui.draw.b.b(composed, (wn0.l) objI);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return dVarB;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(int i11, float f11, float f12, float f13, int i12, float f14, m3.f drawBehind) {
            p013kotlin.jvm.internal.s.k(drawBehind, "$this$drawBehind");
            k3.j1 j1VarA = drawBehind.getDrawContext().a();
            k3.r3 r3VarA = k3.q0.a();
            Paint internalPaint = r3VarA.getInternalPaint();
            internalPaint.setColor(i11);
            internalPaint.setShadowLayer(drawBehind.O1(f11), drawBehind.O1(f12), drawBehind.O1(f13), i12);
            j1VarA.m(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, j3.m.k(drawBehind.b()), j3.m.i(drawBehind.b()), drawBehind.O1(f14), drawBehind.O1(f14), r3VarA);
            return jn0.h0.f84049a;
        }
    }

    public static /* synthetic */ androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z11, String str, g4.i iVar, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return a(dVar, z11, str, iVar, aVar);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d clickableWithoutAnimation, boolean z11, String str, g4.i iVar, wn0.a onClick) {
        p013kotlin.jvm.internal.s.k(clickableWithoutAnimation, "$this$clickableWithoutAnimation");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        return androidx.compose.ui.c.c(clickableWithoutAnimation, null, new b(z11, str, iVar, onClick), 1, null);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return g4.o.d(dVar, false, new wn0.l() { // from class: com.fourthline.orca.internal.d21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.b((g4.y) obj);
            }
        }, 1, null);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, final float f11) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return g4.o.d(dVar, false, new wn0.l() { // from class: com.fourthline.orca.internal.e21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.a(f11, (g4.y) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(float f11, g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.v.A0(semantics, f11);
        return jn0.h0.f84049a;
    }

    public static /* synthetic */ androidx.compose.ui.d a(androidx.compose.ui.d dVar, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a(dVar, str, z11);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, final String description, boolean z11) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(description, "description");
        if (z11) {
            return g4.o.a(dVar, new wn0.l() { // from class: com.fourthline.orca.internal.h21
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return AbstractC3307gk.a(description, (g4.y) obj);
                }
            });
        }
        return g4.o.d(dVar, false, new wn0.l() { // from class: com.fourthline.orca.internal.i21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.b(description, (g4.y) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(String str, g4.y clearAndSetSemantics) {
        p013kotlin.jvm.internal.s.k(clearAndSetSemantics, "$this$clearAndSetSemantics");
        g4.v.c0(clearAndSetSemantics, str);
        return jn0.h0.f84049a;
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, final Float f11, final String currentValue, final String description, final Mh format) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(currentValue, "currentValue");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(format, "format");
        return g4.o.d(dVar, false, new wn0.l() { // from class: com.fourthline.orca.internal.j21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.a(f11, format, currentValue, description, (g4.y) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Float f11, Mh mh2, String str, String str2, g4.y semantics) {
        String strY0;
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        if (f11 != null) {
            g4.v.A0(semantics, f11.floatValue());
        }
        if (mh2 == Mh.Date) {
            List listP = p013kotlin.collections.v.p(p013kotlin.text.t.T1(str, 2), p013kotlin.text.t.T1(p013kotlin.text.t.M1(str, 2), 2), p013kotlin.text.t.M1(str, 4));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listP) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            strY0 = p013kotlin.collections.v.y0(arrayList, " ", null, null, 0, null, null, 62, null);
        } else {
            strY0 = mh2 == Mh.NumberOrIdentifier ? p013kotlin.collections.v.y0(p013kotlin.text.t.f1(str, new String[]{""}, false, 0, 6, null), " ", null, null, 0, null, null, 62, null) : str;
        }
        if (mh2 == Mh.DropDown) {
            g4.v.k0(semantics, g4.i.INSTANCE.c());
            g4.v.c0(semantics, str2);
        } else {
            g4.v.e0(semantics, new i4.d(str2 + ". " + strY0 + ".", null, null, 6, null));
        }
        return jn0.h0.f84049a;
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z11, p020r2.p1 textFieldValue) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(textFieldValue, "textFieldValue");
        return z11 ? androidx.compose.ui.input.key.a.a(dVar, new a(textFieldValue)) : dVar;
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, final String str) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return g4.o.c(dVar, true, new wn0.l() { // from class: com.fourthline.orca.internal.k21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.c(str, (g4.y) obj);
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.d a(androidx.compose.ui.d dVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return a(dVar, str);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z11) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return !z11 ? g4.o.a(dVar, new wn0.l() { // from class: com.fourthline.orca.internal.f21
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return AbstractC3307gk.a((g4.y) obj);
            }
        }) : dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(g4.y clearAndSetSemantics) {
        p013kotlin.jvm.internal.s.k(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return jn0.h0.f84049a;
    }

    public static /* synthetic */ androidx.compose.ui.d a(androidx.compose.ui.d dVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return a(dVar, str, str2);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, String tag, String prefix) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        if (prefix.length() != 0) {
            Locale ROOT = Locale.ROOT;
            p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
            tag = prefix + p013kotlin.text.t.B(tag, ROOT);
        }
        return androidx.compose.ui.platform.s2.a(dVar, tag);
    }

    public static /* synthetic */ androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f11, float f12, long j11, k3.g4 g4Var, int i11, Object obj) {
        float f13;
        if ((i11 & 4) != 0) {
            j11 = k3.r1.e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f12, null, 16, null);
            f13 = f12;
        } else {
            f13 = f12;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            g4Var = k3.a4.a();
        }
        return a(dVar, f11, f13, j12, g4Var);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d elevation, float f11, float f12, long j11, k3.g4 shape) {
        p013kotlin.jvm.internal.s.k(elevation, "$this$elevation");
        p013kotlin.jvm.internal.s.k(shape, "shape");
        return h3.l.b(elevation, f11, shape, false, 0L, j11, 12, null);
    }

    public static /* synthetic */ androidx.compose.ui.d a(androidx.compose.ui.d dVar, long j11, long j12, float f11, float f12, float f13, float f14, float f15, int i11, Object obj) {
        return a(dVar, j11, j12, (i11 & 4) != 0 ? 0.2f : f11, (i11 & 8) != 0 ? w4.h.g(0) : f12, (i11 & 16) != 0 ? w4.h.g(20) : f13, (i11 & 32) != 0 ? w4.h.g(0) : f14, (i11 & 64) != 0 ? w4.h.g(0) : f15);
    }
}
