package kotlin;

import androidx.compose.ui.d;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h3.e;
import i4.TextLayoutResult;
import j3.i;
import jn0.h0;
import o4.TextFieldValue;
import o4.TransformedText;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import p021s1.C4788y;
import p021s1.p;
import p021s1.x;
import w4.t;
import wn0.l;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u001c\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/d;", "Lb2/y0;", "scrollerPosition", "Lu1/l;", "interactionSource", "", "enabled", DateTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d;Lb2/y0;Lu1/l;Z)Landroidx/compose/ui/d;", "Lo4/o0;", "textFieldValue", "Lo4/z0;", "visualTransformation", "Lkotlin/Function0;", "Lb2/c1;", "textLayoutResultProvider", "c", "(Landroidx/compose/ui/d;Lb2/y0;Lo4/o0;Lo4/z0;Lwn0/a;)Landroidx/compose/ui/d;", "Lw4/d;", "", "cursorOffset", "Lo4/x0;", "transformedText", "Li4/m0;", "textLayoutResult", "rtl", "textFieldWidth", "Lj3/i;", "b", "(Lw4/d;ILo4/x0;Li4/m0;ZI)Lj3/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x0 {

    @p013kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15940a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15940a = iArr;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/platform/q1;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends u implements l<q1, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0 f15941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u1.l f15942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15943e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y0 y0Var, u1.l lVar, boolean z11) {
            super(1);
            this.f15941c = y0Var;
            this.f15942d = lVar;
            this.f15943e = z11;
        }

        public final void a(q1 q1Var) {
            q1Var.b("textFieldScrollable");
            q1Var.getProperties().a("scrollerPosition", this.f15941c);
            q1Var.getProperties().a("interactionSource", this.f15942d);
            q1Var.getProperties().a("enabled", Boolean.valueOf(this.f15943e));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(q1 q1Var) {
            a(q1Var);
            return h0.f84049a;
        }
    }

    @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;Lr2/l;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements q<d, p020r2.l, Integer, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y0 f15944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f15945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u1.l f15946e;

        @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "delta", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<Float, Float> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y0 f15947c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var) {
                super(1);
                this.f15947c = y0Var;
            }

            public final Float a(float f11) {
                float fD = this.f15947c.d() + f11;
                if (fD > this.f15947c.c()) {
                    f11 = this.f15947c.c() - this.f15947c.d();
                } else if (fD < BitmapDescriptorFactory.HUE_RED) {
                    f11 = -this.f15947c.d();
                }
                y0 y0Var = this.f15947c;
                y0Var.h(y0Var.d() + f11);
                return Float.valueOf(f11);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return a(f11.floatValue());
            }
        }

        @p013kotlin.Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096A¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"b2/x0$c$b", "Ls1/x;", "", "delta", DateTokenConverter.CONVERTER_KEY, "(F)F", "Lq1/h0;", "scrollPriority", "Lkotlin/Function2;", "Ls1/u;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "b", "(Lq1/h0;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lr2/y3;", "c", "()Z", "canScrollForward", "e", "canScrollBackward", "a", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x f15948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final y3 canScrollForward;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final y3 canScrollBackward;

            @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class a extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ y0 f15951c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(y0 y0Var) {
                    super(0);
                    this.f15951c = y0Var;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f15951c.d() > BitmapDescriptorFactory.HUE_RED);
                }
            }

            /* JADX INFO: renamed from: b2.x0$c$b$b, reason: collision with other inner class name */
            @p013kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            static final class C0302b extends u implements wn0.a<Boolean> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ y0 f15952c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0302b(y0 y0Var) {
                    super(0);
                    this.f15952c = y0Var;
                }

                @Override // wn0.a
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f15952c.d() < this.f15952c.c());
                }
            }

            b(x xVar, y0 y0Var) {
                this.f15948a = xVar;
                this.canScrollForward = n3.e(new C0302b(y0Var));
                this.canScrollBackward = n3.e(new a(y0Var));
            }

            @Override // p021s1.x
            public boolean a() {
                return this.f15948a.a();
            }

            @Override // p021s1.x
            public Object b(q1.h0 h0Var, wn0.p<? super p021s1.u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation) {
                return this.f15948a.b(h0Var, pVar, continuation);
            }

            @Override // p021s1.x
            public boolean c() {
                return ((Boolean) this.canScrollForward.getValue()).booleanValue();
            }

            @Override // p021s1.x
            public float d(float delta) {
                return this.f15948a.d(delta);
            }

            @Override // p021s1.x
            public boolean e() {
                return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var, boolean z11, u1.l lVar) {
            super(3);
            this.f15944c = y0Var;
            this.f15945d = z11;
            this.f15946e = lVar;
        }

        public final d a(d dVar, p020r2.l lVar, int i11) {
            lVar.o(805428266);
            if (o.J()) {
                o.S(805428266, i11, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z11 = this.f15944c.f() == p.Vertical || !(lVar.U(z0.m()) == t.Rtl);
            boolean zN = lVar.n(this.f15944c);
            y0 y0Var = this.f15944c;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(y0Var);
                lVar.B(objI);
            }
            x xVarB = C4788y.b((l) objI, lVar, 0);
            boolean zN2 = lVar.n(xVarB) | lVar.n(this.f15944c);
            y0 y0Var2 = this.f15944c;
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(xVarB, y0Var2);
                lVar.B(objI2);
            }
            d dVarI = androidx.compose.foundation.gestures.d.i(d.INSTANCE, (b) objI2, this.f15944c.f(), this.f15945d && this.f15944c.c() != BitmapDescriptorFactory.HUE_RED, z11, null, this.f15946e, 16, null);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return dVarI;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ d invoke(d dVar, p020r2.l lVar, Integer num) {
            return a(dVar, lVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i b(w4.d dVar, int i11, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z11, int i12) {
        i iVarA;
        if (textLayoutResult == null || (iVarA = textLayoutResult.e(transformedText.getOffsetMapping().originalToTransformed(i11))) == null) {
            iVarA = i.INSTANCE.a();
        }
        i iVar = iVarA;
        int iI1 = dVar.i1(o0.b());
        return i.d(iVar, z11 ? (i12 - iVar.getLeft()) - iI1 : iVar.getLeft(), BitmapDescriptorFactory.HUE_RED, z11 ? i12 - iVar.getLeft() : iI1 + iVar.getLeft(), BitmapDescriptorFactory.HUE_RED, 10, null);
    }

    public static final d c(d dVar, y0 y0Var, TextFieldValue textFieldValue, o4.z0 z0Var, wn0.a<c1> aVar) {
        d s1Var;
        p pVarF = y0Var.f();
        int iE = y0Var.e(textFieldValue.getSelection());
        y0Var.i(textFieldValue.getSelection());
        TransformedText transformedTextC = r1.c(z0Var, textFieldValue.getText());
        int i11 = a.f15940a[pVarF.ordinal()];
        if (i11 == 1) {
            s1Var = new s1(y0Var, iE, transformedTextC, aVar);
        } else {
            if (i11 != 2) {
                throw new p013kotlin.NoWhenBranchMatchedException();
            }
            s1Var = new p(y0Var, iE, transformedTextC, aVar);
        }
        return e.b(dVar).g(s1Var);
    }

    public static final d d(d dVar, y0 y0Var, u1.l lVar, boolean z11) {
        return androidx.compose.ui.c.b(dVar, o1.b() ? new b(y0Var, lVar, z11) : o1.a(), new c(y0Var, z11, lVar));
    }
}
