package p010i90;

import f90.n;
import i4.PlatformTextStyle;
import i4.TextStyle;
import k3.Shadow;
import m3.g;
import p009i2.j1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.q;
import p014n4.t0;
import p020r2.l;
import p020r2.o;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;
import t4.a;
import t4.e;
import t4.f;
import t4.j;
import t4.k;
import t4.s;
import w4.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/n0;", "", "<init>", "()V", "Li4/r0;", "a", "(Lr2/l;I)Li4/r0;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f76716a = new n0();

    private n0() {
    }

    public final TextStyle a(l lVar, int i11) {
        lVar.H(-1771981384);
        if (o.J()) {
            o.S(-1771981384, i11, -1, "com.stripe.android.uicore.elements.OTPElementUI.defaultTextStyle (OTPElementUI.kt:285)");
        }
        t0 t0VarA = q.INSTANCE.a();
        FontWeight fontWeightE = FontWeight.INSTANCE.e();
        TextStyle textStyle = new TextStyle(n.n(j1.f74525a, lVar, j1.f74526b).getOnComponent(), w.h(24), fontWeightE, (b0) null, (c0) null, t0VarA, (String) null, 0L, (a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (g) null, j.h(j.INSTANCE.a()), (t4.l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (e) null, (s) null, 16744408, (DefaultConstructorMarker) null);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return textStyle;
    }
}
