package p008h80;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import f90.StripeTypography;
import f90.m;
import f90.n;
import g4.g;
import g4.v;
import g4.y;
import j5.h;
import jn0.h0;
import p009i2.j1;
import p009i2.v2;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p014n4.k;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", AnalyticsAttribute.Error, "Landroidx/compose/ui/d;", "modifier", "Ljn0/h0;", "a", "(Ljava/lang/String;Landroidx/compose/ui/d;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<y, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f71296c = new a();

        a() {
            super(1);
        }

        public final void a(y semantics) {
            s.k(semantics, "$this$semantics");
            v.h0(semantics, g.INSTANCE.a());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
            a(yVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f71298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f71299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f71300f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, d dVar, int i11, int i12) {
            super(2);
            this.f71297c = str;
            this.f71298d = dVar;
            this.f71299e = i11;
            this.f71300f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            p.a(this.f71297c, this.f71298d, lVar, k2.a(this.f71299e | 1), this.f71300f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(String error, d dVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        d dVar3;
        w4.d dVar4;
        StripeTypography stripeTypographyP;
        boolean zN;
        Object objI;
        Integer fontFamily;
        Typeface typefaceH;
        boolean zN2;
        Object objI2;
        p020r2.l lVar2;
        w2 w2VarX;
        s.k(error, "error");
        p020r2.l lVarV = lVar.v(228805126);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = i11 | (lVarV.n(error) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i13 & 91) == 18 || !lVarV.b()) {
                if (i14 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(228805126, i13, -1, "com.stripe.android.paymentsheet.ui.ErrorMessage (ErrorMessage.kt:23)");
                }
                Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                dVar4 = (w4.d) lVarV.U(z0.g());
                j1 j1Var = j1.f74525a;
                int i15 = j1.f74526b;
                stripeTypographyP = n.p(j1Var, lVarV, i15);
                lVarV.H(72788359);
                zN = lVarV.n(stripeTypographyP);
                objI = lVarV.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    fontFamily = stripeTypographyP.getFontFamily();
                    if (fontFamily != null || (typefaceH = h.h(context, fontFamily.intValue())) == null) {
                        typefaceH = Typeface.DEFAULT;
                    }
                    objI = typefaceH;
                    lVarV.B(objI);
                }
                Typeface typeface = (Typeface) objI;
                lVarV.T();
                lVarV.H(72793700);
                zN2 = lVarV.n(stripeTypographyP);
                objI2 = lVarV.I();
                if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = w4.v.b(dVar4.E(w4.h.g(w4.h.g(w4.v.h(m.f64661a.f().getSmallFontSize())) * stripeTypographyP.getFontSizeMultiplier())));
                    lVarV.B(objI2);
                }
                long packedValue = ((w4.v) objI2).getPackedValue();
                lVarV.T();
                long jD = j1Var.a(lVarV, i15).d();
                s.h(typeface);
                lVar2 = lVarV;
                d dVar5 = dVar3;
                v2.b(error, g4.o.d(dVar3, false, a.f71296c, 1, null), jD, packedValue, null, null, k.a(typeface), 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar2, i13 & 14, 0, 130992);
                if (o.J()) {
                    o.R();
                }
                dVar2 = dVar5;
            } else {
                lVarV.j();
                lVar2 = lVarV;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new b(error, dVar2, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i13 & 91) == 18) {
            if (i14 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(228805126, i13, -1, "com.stripe.android.paymentsheet.ui.ErrorMessage (ErrorMessage.kt:23)");
            }
            Context context2 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            dVar4 = (w4.d) lVarV.U(z0.g());
            j1 j1Var2 = j1.f74525a;
            int i16 = j1.f74526b;
            stripeTypographyP = n.p(j1Var2, lVarV, i16);
            lVarV.H(72788359);
            zN = lVarV.n(stripeTypographyP);
            objI = lVarV.I();
            if (zN) {
                fontFamily = stripeTypographyP.getFontFamily();
                if (fontFamily != null) {
                    typefaceH = Typeface.DEFAULT;
                } else {
                    typefaceH = Typeface.DEFAULT;
                }
                objI = typefaceH;
                lVarV.B(objI);
            } else {
                fontFamily = stripeTypographyP.getFontFamily();
                if (fontFamily != null) {
                    typefaceH = Typeface.DEFAULT;
                } else {
                    typefaceH = Typeface.DEFAULT;
                }
                objI = typefaceH;
                lVarV.B(objI);
            }
            Typeface typeface2 = (Typeface) objI;
            lVarV.T();
            lVarV.H(72793700);
            zN2 = lVarV.n(stripeTypographyP);
            objI2 = lVarV.I();
            if (zN2) {
                objI2 = w4.v.b(dVar4.E(w4.h.g(w4.h.g(w4.v.h(m.f64661a.f().getSmallFontSize())) * stripeTypographyP.getFontSizeMultiplier())));
                lVarV.B(objI2);
            } else {
                objI2 = w4.v.b(dVar4.E(w4.h.g(w4.h.g(w4.v.h(m.f64661a.f().getSmallFontSize())) * stripeTypographyP.getFontSizeMultiplier())));
                lVarV.B(objI2);
            }
            long packedValue2 = ((w4.v) objI2).getPackedValue();
            lVarV.T();
            long jD2 = j1Var2.a(lVarV, i16).d();
            s.h(typeface2);
            lVar2 = lVarV;
            d dVar6 = dVar3;
            v2.b(error, g4.o.d(dVar3, false, a.f71296c, 1, null), jD2, packedValue2, null, null, k.a(typeface2), 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar2, i13 & 14, 0, 130992);
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar6;
        } else {
            if (i14 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(228805126, i13, -1, "com.stripe.android.paymentsheet.ui.ErrorMessage (ErrorMessage.kt:23)");
            }
            Context context3 = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            dVar4 = (w4.d) lVarV.U(z0.g());
            j1 j1Var3 = j1.f74525a;
            int i17 = j1.f74526b;
            stripeTypographyP = n.p(j1Var3, lVarV, i17);
            lVarV.H(72788359);
            zN = lVarV.n(stripeTypographyP);
            objI = lVarV.I();
            if (zN) {
                fontFamily = stripeTypographyP.getFontFamily();
                if (fontFamily != null) {
                    typefaceH = Typeface.DEFAULT;
                } else {
                    typefaceH = Typeface.DEFAULT;
                }
                objI = typefaceH;
                lVarV.B(objI);
            } else {
                fontFamily = stripeTypographyP.getFontFamily();
                if (fontFamily != null) {
                    typefaceH = Typeface.DEFAULT;
                } else {
                    typefaceH = Typeface.DEFAULT;
                }
                objI = typefaceH;
                lVarV.B(objI);
            }
            Typeface typeface3 = (Typeface) objI;
            lVarV.T();
            lVarV.H(72793700);
            zN2 = lVarV.n(stripeTypographyP);
            objI2 = lVarV.I();
            if (zN2) {
                objI2 = w4.v.b(dVar4.E(w4.h.g(w4.h.g(w4.v.h(m.f64661a.f().getSmallFontSize())) * stripeTypographyP.getFontSizeMultiplier())));
                lVarV.B(objI2);
            } else {
                objI2 = w4.v.b(dVar4.E(w4.h.g(w4.h.g(w4.v.h(m.f64661a.f().getSmallFontSize())) * stripeTypographyP.getFontSizeMultiplier())));
                lVarV.B(objI2);
            }
            long packedValue3 = ((w4.v) objI2).getPackedValue();
            lVarV.T();
            long jD3 = j1Var3.a(lVarV, i17).d();
            s.h(typeface3);
            lVar2 = lVarV;
            d dVar7 = dVar3;
            v2.b(error, g4.o.d(dVar3, false, a.f71296c, 1, null), jD3, packedValue3, null, null, k.a(typeface3), 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar2, i13 & 14, 0, 130992);
            if (o.J()) {
                o.R();
            }
            dVar2 = dVar7;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new b(error, dVar2, i11, i12));
        }
    }
}
