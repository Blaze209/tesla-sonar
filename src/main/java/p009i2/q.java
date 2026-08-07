package p009i2;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import j3.n;
import jn0.h0;
import k3.i4;
import k3.p1;
import m3.Stroke;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.u;
import p019p1.g0;
import p019p1.j;
import p019p1.l1;
import p019p1.m;
import p019p1.m1;
import p019p1.r1;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import q1.i;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001aW\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u001e\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a>\u0010&\u001a\u00020\u0003*\u00020\u00172\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)\"\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)\"\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\f\u00102\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "Ljn0/h0;", "onCheckedChange", "Landroidx/compose/ui/d;", "modifier", "enabled", "Lu1/l;", "interactionSource", "Li2/o;", "colors", "a", "(ZLwn0/l;Landroidx/compose/ui/d;ZLu1/l;Li2/o;Lr2/l;II)V", "Lh4/a;", "state", "Lkotlin/Function0;", "onClick", "h", "(Lh4/a;Lwn0/a;Landroidx/compose/ui/d;ZLu1/l;Li2/o;Lr2/l;II)V", "value", "b", "(ZLh4/a;Landroidx/compose/ui/d;Li2/o;Lr2/l;I)V", "Lm3/f;", "Lk3/p1;", "boxColor", "borderColor", "", "radius", "strokeWidth", "s", "(Lm3/f;JJFF)V", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "Li2/n;", "drawingCache", "t", "(Lm3/f;JFFFLi2/n;)V", "Lw4/h;", Gender.FEMALE, "CheckboxRippleRadius", "CheckboxDefaultPadding", "c", "CheckboxSize", DateTokenConverter.CONVERTER_KEY, "StrokeWidth", "e", "RadiusSize", "checkDrawFraction", "checkCenterGravitationShiftFraction", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f74937b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f74939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f74940e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74936a = w4.h.g(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f74938c = w4.h.g(20);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Boolean, h0> f74941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f74942d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Boolean, h0> lVar, boolean z11) {
            super(0);
            this.f74941c = lVar;
            this.f74942d = z11;
        }

        public final void b() {
            this.f74941c.invoke(Boolean.valueOf(!this.f74942d));
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f74943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Boolean, h0> f74944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f74946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u1.l f74947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o f74948h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f74949i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f74950j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z11, l<? super Boolean, h0> lVar, androidx.compose.ui.d dVar, boolean z12, u1.l lVar2, o oVar, int i11, int i12) {
            super(2);
            this.f74943c = z11;
            this.f74944d = lVar;
            this.f74945e = dVar;
            this.f74946f = z12;
            this.f74947g = lVar2;
            this.f74948h = oVar;
            this.f74949i = i11;
            this.f74950j = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            q.a(this.f74943c, this.f74944d, this.f74945e, this.f74946f, this.f74947g, this.f74948h, lVar, k2.a(this.f74949i | 1), this.f74950j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm3/f;", "Ljn0/h0;", "a", "(Lm3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<m3.f, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f74951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<p1> f74952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y3<p1> f74953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y3<p1> f74954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y3<Float> f74955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y3<Float> f74956h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, y3<p1> y3Var, y3<p1> y3Var2, y3<p1> y3Var3, y3<Float> y3Var4, y3<Float> y3Var5) {
            super(1);
            this.f74951c = nVar;
            this.f74952d = y3Var;
            this.f74953e = y3Var2;
            this.f74954f = y3Var3;
            this.f74955g = y3Var4;
            this.f74956h = y3Var5;
        }

        public final void a(m3.f fVar) {
            float fFloor = (float) Math.floor(fVar.O1(q.f74939d));
            q.s(fVar, q.f(this.f74952d), q.g(this.f74953e), fVar.O1(q.f74940e), fFloor);
            q.t(fVar, q.e(this.f74954f), q.c(this.f74955g), q.d(this.f74956h), fFloor, this.f74951c);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(m3.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f74957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h4.a f74958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f74960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, h4.a aVar, androidx.compose.ui.d dVar, o oVar, int i11) {
            super(2);
            this.f74957c = z11;
            this.f74958d = aVar;
            this.f74959e = dVar;
            this.f74960f = oVar;
            this.f74961g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            q.b(this.f74957c, this.f74958d, this.f74959e, this.f74960f, lVar, k2.a(this.f74961g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lh4/a;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.q<l1.b<h4.a>, p020r2.l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f74962c = new e();

        e() {
            super(3);
        }

        public final g0<Float> a(l1.b<h4.a> bVar, p020r2.l lVar, int i11) {
            g0<Float> g0VarG;
            lVar.o(1075283605);
            if (o.J()) {
                o.S(1075283605, i11, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:282)");
            }
            h4.a initialState = bVar.getInitialState();
            h4.a aVar = h4.a.Off;
            if (initialState == aVar) {
                g0VarG = j.h(0, 1, null);
            } else {
                g0VarG = bVar.e() == aVar ? j.g(100) : j.l(100, 0, null, 6, null);
            }
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return g0VarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<h4.a> bVar, p020r2.l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lh4/a;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.q<l1.b<h4.a>, p020r2.l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f74963c = new f();

        f() {
            super(3);
        }

        public final g0<Float> a(l1.b<h4.a> bVar, p020r2.l lVar, int i11) {
            g0<Float> g0VarG;
            lVar.o(-1707702900);
            if (o.J()) {
                o.S(-1707702900, i11, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:266)");
            }
            h4.a initialState = bVar.getInitialState();
            h4.a aVar = h4.a.Off;
            if (initialState == aVar) {
                g0VarG = j.l(100, 0, null, 6, null);
            } else {
                g0VarG = bVar.e() == aVar ? j.g(100) : j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            }
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return g0VarG;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<h4.a> bVar, p020r2.l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h4.a f74964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f74965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f74967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u1.l f74968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o f74969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f74970i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f74971j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(h4.a aVar, wn0.a<h0> aVar2, androidx.compose.ui.d dVar, boolean z11, u1.l lVar, o oVar, int i11, int i12) {
            super(2);
            this.f74964c = aVar;
            this.f74965d = aVar2;
            this.f74966e = dVar;
            this.f74967f = z11;
            this.f74968g = lVar;
            this.f74969h = oVar;
            this.f74970i = i11;
            this.f74971j = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            q.h(this.f74964c, this.f74965d, this.f74966e, this.f74967f, this.f74968g, this.f74969h, lVar, k2.a(this.f74970i | 1), this.f74971j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74972a;

        static {
            int[] iArr = new int[h4.a.values().length];
            try {
                iArr[h4.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h4.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h4.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f74972a = iArr;
        }
    }

    static {
        float f11 = 2;
        f74937b = w4.h.g(f11);
        f74939d = w4.h.g(f11);
        f74940e = w4.h.g(f11);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x00c4, please report this as an issue */
    public static final void a(boolean z11, l<? super Boolean, h0> lVar, androidx.compose.ui.d dVar, boolean z12, u1.l lVar2, o oVar, p020r2.l lVar3, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z13;
        int i15;
        int i16;
        u1.l lVar4;
        int i17;
        o oVar2;
        wn0.a aVar;
        androidx.compose.ui.d dVar3;
        boolean z14;
        u1.l lVar5;
        androidx.compose.ui.d dVar4;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objI;
        u1.l lVar6;
        o oVar3;
        w2 w2VarX;
        p020r2.l lVarV = lVar3.v(-2118660998);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(lVar) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z13 = z12;
                    if (lVarV.p(z13)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        lVar4 = lVar2;
                        if (lVarV.n(lVar4)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    if ((196608 & i11) == 0) {
                        if ((i12 & 32) == 0) {
                            oVar2 = oVar;
                            int i19 = lVarV.n(oVar2) ? 131072 : 65536;
                            i13 |= i19;
                        } else {
                            oVar2 = oVar;
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    if ((74899 & i13) == 74898 || !lVarV.b()) {
                        lVarV.L();
                        aVar = null;
                        if ((i11 & 1) != 0 || lVarV.k()) {
                            if (i18 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z14 = true;
                            } else {
                                z14 = z13;
                            }
                            if (i16 != 0) {
                                lVar5 = null;
                            } else {
                                lVar5 = lVar4;
                            }
                            if ((i12 & 32) != 0) {
                                o oVarA = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                                lVarV = lVarV;
                                i13 &= -458753;
                                oVar2 = oVarA;
                            }
                            lVar4 = lVar5;
                        } else {
                            lVarV.j();
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                            }
                            z14 = z13;
                            dVar3 = dVar2;
                        }
                        lVarV.C();
                        if (o.J()) {
                            o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                        }
                        h4.a aVarA = h4.b.a(z11);
                        if (lVar != null) {
                            lVarV.o(-1450357672);
                            if ((i13 & 112) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | ((i13 & 14) == 4);
                            objI = lVarV.I();
                            if (z17 || objI == p020r2.l.INSTANCE.a()) {
                                objI = new a(lVar, z11);
                                lVarV.B(objI);
                            }
                            aVar = (wn0.a) objI;
                        } else {
                            lVarV.o(-1450319884);
                        }
                        lVarV.l();
                        h(aVarA, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar3;
                        z15 = z14;
                    } else {
                        lVarV.j();
                        dVar4 = dVar2;
                        z15 = z13;
                    }
                    lVar6 = lVar4;
                    oVar3 = oVar2;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
                    }
                }
                i13 |= 24576;
                lVar4 = lVar2;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        oVar2 = oVar;
                        if (lVarV.n(oVar2)) {
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                if ((74899 & i13) == 74898) {
                    lVarV.L();
                    aVar = null;
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA2 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA2;
                        }
                        lVar4 = lVar5;
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA3 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA3;
                        }
                        lVar4 = lVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                    }
                    h4.a aVarA2 = h4.b.a(z11);
                    if (lVar != null) {
                        lVarV.o(-1450357672);
                        if ((i13 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i13 & 14) == 4);
                        objI = lVarV.I();
                        if (z17) {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        } else {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        }
                        aVar = (wn0.a) objI;
                    } else {
                        lVarV.o(-1450319884);
                    }
                    lVarV.l();
                    h(aVarA2, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    z15 = z14;
                } else {
                    lVarV.L();
                    aVar = null;
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA4 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA4;
                        }
                        lVar4 = lVar5;
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA5 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA5;
                        }
                        lVar4 = lVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                    }
                    h4.a aVarA3 = h4.b.a(z11);
                    if (lVar != null) {
                        lVarV.o(-1450357672);
                        if ((i13 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i13 & 14) == 4);
                        objI = lVarV.I();
                        if (z17) {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        } else {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        }
                        aVar = (wn0.a) objI;
                    } else {
                        lVarV.o(-1450319884);
                    }
                    lVarV.l();
                    h(aVarA3, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    z15 = z14;
                }
                lVar6 = lVar4;
                oVar3 = oVar2;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
                }
            }
            i13 |= 3072;
            z13 = z12;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    lVar4 = lVar2;
                    if (lVarV.n(lVar4)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        oVar2 = oVar;
                        if (lVarV.n(oVar2)) {
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                if ((74899 & i13) == 74898) {
                    lVarV.L();
                    aVar = null;
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA6 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA6;
                        }
                        lVar4 = lVar5;
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA7 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA7;
                        }
                        lVar4 = lVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                    }
                    h4.a aVarA4 = h4.b.a(z11);
                    if (lVar != null) {
                        lVarV.o(-1450357672);
                        if ((i13 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i13 & 14) == 4);
                        objI = lVarV.I();
                        if (z17) {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        } else {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        }
                        aVar = (wn0.a) objI;
                    } else {
                        lVarV.o(-1450319884);
                    }
                    lVarV.l();
                    h(aVarA4, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    z15 = z14;
                } else {
                    lVarV.L();
                    aVar = null;
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA8 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA8;
                        }
                        lVar4 = lVar5;
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA9 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA9;
                        }
                        lVar4 = lVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                    }
                    h4.a aVarA5 = h4.b.a(z11);
                    if (lVar != null) {
                        lVarV.o(-1450357672);
                        if ((i13 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i13 & 14) == 4);
                        objI = lVarV.I();
                        if (z17) {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        } else {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        }
                        aVar = (wn0.a) objI;
                    } else {
                        lVarV.o(-1450319884);
                    }
                    lVarV.l();
                    h(aVarA5, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    z15 = z14;
                }
                lVar6 = lVar4;
                oVar3 = oVar2;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
                }
            }
            i13 |= 24576;
            lVar4 = lVar2;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    oVar2 = oVar;
                    if (lVarV.n(oVar2)) {
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            if ((74899 & i13) == 74898) {
                lVarV.L();
                aVar = null;
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA10 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA10;
                    }
                    lVar4 = lVar5;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA11 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA11;
                    }
                    lVar4 = lVar5;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                }
                h4.a aVarA6 = h4.b.a(z11);
                if (lVar != null) {
                    lVarV.o(-1450357672);
                    if ((i13 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i13 & 14) == 4);
                    objI = lVarV.I();
                    if (z17) {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    } else {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    }
                    aVar = (wn0.a) objI;
                } else {
                    lVarV.o(-1450319884);
                }
                lVarV.l();
                h(aVarA6, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                z15 = z14;
            } else {
                lVarV.L();
                aVar = null;
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA12 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA12;
                    }
                    lVar4 = lVar5;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA13 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA13;
                    }
                    lVar4 = lVar5;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                }
                h4.a aVarA7 = h4.b.a(z11);
                if (lVar != null) {
                    lVarV.o(-1450357672);
                    if ((i13 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i13 & 14) == 4);
                    objI = lVarV.I();
                    if (z17) {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    } else {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    }
                    aVar = (wn0.a) objI;
                } else {
                    lVarV.o(-1450319884);
                }
                lVarV.l();
                h(aVarA7, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                z15 = z14;
            }
            lVar6 = lVar4;
            oVar3 = oVar2;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z13 = z12;
                if (lVarV.p(z13)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    lVar4 = lVar2;
                    if (lVarV.n(lVar4)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        oVar2 = oVar;
                        if (lVarV.n(oVar2)) {
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                if ((74899 & i13) == 74898) {
                    lVarV.L();
                    aVar = null;
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA14 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA14;
                        }
                        lVar4 = lVar5;
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA15 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA15;
                        }
                        lVar4 = lVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                    }
                    h4.a aVarA8 = h4.b.a(z11);
                    if (lVar != null) {
                        lVarV.o(-1450357672);
                        if ((i13 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i13 & 14) == 4);
                        objI = lVarV.I();
                        if (z17) {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        } else {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        }
                        aVar = (wn0.a) objI;
                    } else {
                        lVarV.o(-1450319884);
                    }
                    lVarV.l();
                    h(aVarA8, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    z15 = z14;
                } else {
                    lVarV.L();
                    aVar = null;
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA16 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA16;
                        }
                        lVar4 = lVar5;
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z14 = true;
                        } else {
                            z14 = z13;
                        }
                        if (i16 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar4;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA17 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            oVar2 = oVarA17;
                        }
                        lVar4 = lVar5;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                    }
                    h4.a aVarA9 = h4.b.a(z11);
                    if (lVar != null) {
                        lVarV.o(-1450357672);
                        if ((i13 & 112) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i13 & 14) == 4);
                        objI = lVarV.I();
                        if (z17) {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        } else {
                            objI = new a(lVar, z11);
                            lVarV.B(objI);
                        }
                        aVar = (wn0.a) objI;
                    } else {
                        lVarV.o(-1450319884);
                    }
                    lVarV.l();
                    h(aVarA9, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar3;
                    z15 = z14;
                }
                lVar6 = lVar4;
                oVar3 = oVar2;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
                }
            }
            i13 |= 24576;
            lVar4 = lVar2;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    oVar2 = oVar;
                    if (lVarV.n(oVar2)) {
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            if ((74899 & i13) == 74898) {
                lVarV.L();
                aVar = null;
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA18 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA18;
                    }
                    lVar4 = lVar5;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA19 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA19;
                    }
                    lVar4 = lVar5;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                }
                h4.a aVarA10 = h4.b.a(z11);
                if (lVar != null) {
                    lVarV.o(-1450357672);
                    if ((i13 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i13 & 14) == 4);
                    objI = lVarV.I();
                    if (z17) {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    } else {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    }
                    aVar = (wn0.a) objI;
                } else {
                    lVarV.o(-1450319884);
                }
                lVarV.l();
                h(aVarA10, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                z15 = z14;
            } else {
                lVarV.L();
                aVar = null;
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA110 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA110;
                    }
                    lVar4 = lVar5;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA111 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA111;
                    }
                    lVar4 = lVar5;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                }
                h4.a aVarA11 = h4.b.a(z11);
                if (lVar != null) {
                    lVarV.o(-1450357672);
                    if ((i13 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i13 & 14) == 4);
                    objI = lVarV.I();
                    if (z17) {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    } else {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    }
                    aVar = (wn0.a) objI;
                } else {
                    lVarV.o(-1450319884);
                }
                lVarV.l();
                h(aVarA11, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                z15 = z14;
            }
            lVar6 = lVar4;
            oVar3 = oVar2;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
            }
        }
        i13 |= 3072;
        z13 = z12;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                lVar4 = lVar2;
                if (lVarV.n(lVar4)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    oVar2 = oVar;
                    if (lVarV.n(oVar2)) {
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            if ((74899 & i13) == 74898) {
                lVarV.L();
                aVar = null;
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA112 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA112;
                    }
                    lVar4 = lVar5;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA113 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA113;
                    }
                    lVar4 = lVar5;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                }
                h4.a aVarA12 = h4.b.a(z11);
                if (lVar != null) {
                    lVarV.o(-1450357672);
                    if ((i13 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i13 & 14) == 4);
                    objI = lVarV.I();
                    if (z17) {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    } else {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    }
                    aVar = (wn0.a) objI;
                } else {
                    lVarV.o(-1450319884);
                }
                lVarV.l();
                h(aVarA12, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                z15 = z14;
            } else {
                lVarV.L();
                aVar = null;
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA114 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA114;
                    }
                    lVar4 = lVar5;
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = z13;
                    }
                    if (i16 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA115 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        oVar2 = oVarA115;
                    }
                    lVar4 = lVar5;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
                }
                h4.a aVarA13 = h4.b.a(z11);
                if (lVar != null) {
                    lVarV.o(-1450357672);
                    if ((i13 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i13 & 14) == 4);
                    objI = lVarV.I();
                    if (z17) {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    } else {
                        objI = new a(lVar, z11);
                        lVarV.B(objI);
                    }
                    aVar = (wn0.a) objI;
                } else {
                    lVarV.o(-1450319884);
                }
                lVarV.l();
                h(aVarA13, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar3;
                z15 = z14;
            }
            lVar6 = lVar4;
            oVar3 = oVar2;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
            }
        }
        i13 |= 24576;
        lVar4 = lVar2;
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                oVar2 = oVar;
                if (lVarV.n(oVar2)) {
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            i13 |= i19;
        } else {
            oVar2 = oVar;
        }
        if ((74899 & i13) == 74898) {
            lVarV.L();
            aVar = null;
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                if (i16 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar4;
                }
                if ((i12 & 32) != 0) {
                    o oVarA116 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    oVar2 = oVarA116;
                }
                lVar4 = lVar5;
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                if (i16 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar4;
                }
                if ((i12 & 32) != 0) {
                    o oVarA117 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    oVar2 = oVarA117;
                }
                lVar4 = lVar5;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
            }
            h4.a aVarA14 = h4.b.a(z11);
            if (lVar != null) {
                lVarV.o(-1450357672);
                if ((i13 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i13 & 14) == 4);
                objI = lVarV.I();
                if (z17) {
                    objI = new a(lVar, z11);
                    lVarV.B(objI);
                } else {
                    objI = new a(lVar, z11);
                    lVarV.B(objI);
                }
                aVar = (wn0.a) objI;
            } else {
                lVarV.o(-1450319884);
            }
            lVarV.l();
            h(aVarA14, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar3;
            z15 = z14;
        } else {
            lVarV.L();
            aVar = null;
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                if (i16 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar4;
                }
                if ((i12 & 32) != 0) {
                    o oVarA118 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    oVar2 = oVarA118;
                }
                lVar4 = lVar5;
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                if (i16 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar4;
                }
                if ((i12 & 32) != 0) {
                    o oVarA119 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    oVar2 = oVarA119;
                }
                lVar4 = lVar5;
            }
            lVarV.C();
            if (o.J()) {
                o.S(-2118660998, i13, -1, "androidx.compose.material.Checkbox (Checkbox.kt:91)");
            }
            h4.a aVarA15 = h4.b.a(z11);
            if (lVar != null) {
                lVarV.o(-1450357672);
                if ((i13 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i13 & 14) == 4);
                objI = lVarV.I();
                if (z17) {
                    objI = new a(lVar, z11);
                    lVarV.B(objI);
                } else {
                    objI = new a(lVar, z11);
                    lVarV.B(objI);
                }
                aVar = (wn0.a) objI;
            } else {
                lVarV.o(-1450319884);
            }
            lVarV.l();
            h(aVarA15, aVar, dVar3, z14, lVar4, oVar2, lVarV, i13 & 524160, 0);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar3;
            z15 = z14;
        }
        lVar6 = lVar4;
        oVar3 = oVar2;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z11, lVar, dVar4, z15, lVar6, oVar3, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:112:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x026c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175  */
    /* JADX WARN: Code duplicated, block: B:88:0x017e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad  */
    public static final void b(boolean z11, h4.a aVar, androidx.compose.ui.d dVar, o oVar, p020r2.l lVar, int i11) {
        int i12;
        float f11;
        int i13;
        float f12;
        int i14;
        y3 y3VarD;
        int i15;
        float f13;
        int i16;
        int i17;
        y3 y3VarD2;
        Object objI;
        p020r2.l.Companion companion;
        n nVar;
        y3<p1> y3VarC;
        y3<p1> y3VarA;
        y3<p1> y3VarB;
        boolean zN;
        Object objI2;
        p020r2.l lVarV = lVar.v(-2118895727);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(aVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.n(dVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.n(oVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-2118895727, i12, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:262)");
            }
            int i18 = i12 >> 3;
            int i19 = i18 & 14;
            int i21 = i12;
            l1 l1VarG = m1.g(aVar, null, lVarV, i19, 2);
            f fVar = f.f74963c;
            p013kotlin.jvm.internal.l lVar2 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, m> p1VarE = r1.e(lVar2);
            h4.a aVar2 = (h4.a) l1VarG.i();
            lVarV.o(-1798345588);
            if (o.J()) {
                o.S(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int[] iArr = h.f74972a;
            int i22 = iArr[aVar2.ordinal()];
            float f14 = BitmapDescriptorFactory.HUE_RED;
            if (i22 == 1) {
                f11 = 1.0f;
            } else if (i22 != 2) {
                if (i22 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            Float fValueOf = Float.valueOf(f11);
            h4.a aVar3 = (h4.a) l1VarG.p();
            lVarV.o(-1798345588);
            if (o.J()) {
                i13 = -1;
                o.S(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            } else {
                i13 = -1;
            }
            int i23 = iArr[aVar3.ordinal()];
            if (i23 != 1) {
                if (i23 == 2) {
                    f12 = 0.0f;
                } else if (i23 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (o.J()) {
                    o.R();
                }
                lVarV.l();
                i14 = i13;
                y3VarD = m1.d(l1VarG, fValueOf, Float.valueOf(f12), fVar.invoke(l1VarG.n(), lVarV, 0), p1VarE, "FloatAnimation", lVarV, 0);
                e eVar = e.f74962c;
                p019p1.p1<Float, m> p1VarE2 = r1.e(lVar2);
                h4.a aVar4 = (h4.a) l1VarG.i();
                lVarV.o(-2098942571);
                if (o.J()) {
                    o.S(-2098942571, 0, i14, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                }
                i15 = iArr[aVar4.ordinal()];
                if (i15 != 1 || i15 == 2) {
                    f13 = 0.0f;
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f13 = 1.0f;
                }
                if (o.J()) {
                    o.R();
                }
                lVarV.l();
                Float fValueOf2 = Float.valueOf(f13);
                h4.a aVar5 = (h4.a) l1VarG.p();
                lVarV.o(-2098942571);
                if (o.J()) {
                    o.S(-2098942571, 0, i14, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                }
                i16 = iArr[aVar5.ordinal()];
                if (i16 != 1) {
                    i17 = 2;
                    if (i16 != 2) {
                        if (i16 == 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f14 = 1.0f;
                    }
                } else {
                    i17 = 2;
                }
                if (o.J()) {
                    o.R();
                }
                lVarV.l();
                Float fValueOf3 = Float.valueOf(f14);
                g0<Float> g0VarInvoke = eVar.invoke(l1VarG.n(), lVarV, 0);
                int i24 = i17;
                y3VarD2 = m1.d(l1VarG, fValueOf2, fValueOf3, g0VarInvoke, p1VarE2, "FloatAnimation", lVarV, 0);
                objI = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI == companion.a()) {
                    objI = new n(null, null, null, 7, null);
                    lVarV.B(objI);
                }
                nVar = (n) objI;
                y3VarC = oVar.c(aVar, lVarV, i19 | ((i21 >> 6) & 112));
                int i25 = (i18 & 896) | (i21 & 126);
                y3VarA = oVar.a(z11, aVar, lVarV, i25);
                y3VarB = oVar.b(z11, aVar, lVarV, i25);
                androidx.compose.ui.d dVarM = x.m(x.B(dVar, d3.c.INSTANCE.e(), false, i24, null), f74938c);
                zN = lVarV.n(y3VarA) | lVarV.n(y3VarB) | lVarV.n(y3VarC) | lVarV.n(y3VarD) | lVarV.n(y3VarD2);
                objI2 = lVarV.I();
                if (zN || objI2 == companion.a()) {
                    objI2 = new c(nVar, y3VarA, y3VarB, y3VarC, y3VarD, y3VarD2);
                    lVarV.B(objI2);
                }
                i.a(dVarM, (l) objI2, lVarV, 0);
                if (o.J()) {
                    o.R();
                }
            }
            f12 = 1.0f;
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            i14 = i13;
            y3VarD = m1.d(l1VarG, fValueOf, Float.valueOf(f12), fVar.invoke(l1VarG.n(), lVarV, 0), p1VarE, "FloatAnimation", lVarV, 0);
            e eVar2 = e.f74962c;
            p019p1.p1<Float, m> p1VarE3 = r1.e(lVar2);
            h4.a aVar6 = (h4.a) l1VarG.i();
            lVarV.o(-2098942571);
            if (o.J()) {
                o.S(-2098942571, 0, i14, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
            }
            i15 = iArr[aVar6.ordinal()];
            if (i15 != 1) {
                f13 = 0.0f;
            } else {
                f13 = 0.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            Float fValueOf4 = Float.valueOf(f13);
            h4.a aVar7 = (h4.a) l1VarG.p();
            lVarV.o(-2098942571);
            if (o.J()) {
                o.S(-2098942571, 0, i14, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
            }
            i16 = iArr[aVar7.ordinal()];
            if (i16 != 1) {
                i17 = 2;
                if (i16 != 2) {
                    if (i16 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f14 = 1.0f;
                }
            } else {
                i17 = 2;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            Float fValueOf5 = Float.valueOf(f14);
            g0<Float> g0VarInvoke2 = eVar2.invoke(l1VarG.n(), lVarV, 0);
            int i26 = i17;
            y3VarD2 = m1.d(l1VarG, fValueOf4, fValueOf5, g0VarInvoke2, p1VarE3, "FloatAnimation", lVarV, 0);
            objI = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new n(null, null, null, 7, null);
                lVarV.B(objI);
            }
            nVar = (n) objI;
            y3VarC = oVar.c(aVar, lVarV, i19 | ((i21 >> 6) & 112));
            int i27 = (i18 & 896) | (i21 & 126);
            y3VarA = oVar.a(z11, aVar, lVarV, i27);
            y3VarB = oVar.b(z11, aVar, lVarV, i27);
            androidx.compose.ui.d dVarM2 = x.m(x.B(dVar, d3.c.INSTANCE.e(), false, i26, null), f74938c);
            zN = lVarV.n(y3VarA) | lVarV.n(y3VarB) | lVarV.n(y3VarC) | lVarV.n(y3VarD) | lVarV.n(y3VarD2);
            objI2 = lVarV.I();
            if (zN) {
                objI2 = new c(nVar, y3VarA, y3VarB, y3VarC, y3VarD, y3VarD2);
                lVarV.B(objI2);
            } else {
                objI2 = new c(nVar, y3VarA, y3VarB, y3VarC, y3VarD, y3VarD2);
                lVarV.B(objI2);
            }
            i.a(dVarM2, (l) objI2, lVarV, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(z11, aVar, dVar, oVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(y3<p1> y3Var) {
        return y3Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(y3<p1> y3Var) {
        return y3Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(y3<p1> y3Var) {
        return y3Var.getValue().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:102:0x015d  */
    /* JADX WARN: Code duplicated, block: B:104:0x016d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01af  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static final void h(h4.a aVar, wn0.a<h0> aVar2, androidx.compose.ui.d dVar, boolean z11, u1.l lVar, o oVar, p020r2.l lVar2, int i11, int i12) {
        h4.a aVar3;
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        u1.l lVar3;
        int i17;
        o oVar2;
        androidx.compose.ui.d dVar3;
        boolean z13;
        u1.l lVar4;
        androidx.compose.ui.d dVar4;
        boolean z14;
        o oVar3;
        androidx.compose.ui.d dVarC;
        androidx.compose.ui.d dVarC2;
        o oVar4;
        androidx.compose.ui.d dVar5;
        boolean z15;
        u1.l lVar5;
        w2 w2VarX;
        p020r2.l lVarV = lVar2.v(2031255194);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            aVar3 = aVar;
        } else if ((i11 & 6) == 0) {
            aVar3 = aVar;
            i13 = (lVarV.n(aVar3) ? 4 : 2) | i11;
        } else {
            aVar3 = aVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(aVar2) ? 32 : 16;
        }
        int i18 = i12 & 4;
        if (i18 == 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        lVar3 = lVar;
                        if (lVarV.n(lVar3)) {
                            i17 = 16384;
                        } else {
                            i17 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i17;
                    }
                    if ((196608 & i11) == 0) {
                        if ((i12 & 32) == 0) {
                            oVar2 = oVar;
                            int i19 = lVarV.n(oVar2) ? 131072 : 65536;
                            i13 |= i19;
                        } else {
                            oVar2 = oVar;
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    if ((74899 & i13) == 74898 || !lVarV.b()) {
                        lVarV.L();
                        if ((i11 & 1) != 0 || lVarV.k()) {
                            if (i18 != 0) {
                                dVar3 = androidx.compose.ui.d.INSTANCE;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i14 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i16 != 0) {
                                lVar4 = null;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i12 & 32) != 0) {
                                o oVarA = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                                lVarV = lVarV;
                                i13 &= -458753;
                                dVar4 = dVar3;
                                z14 = z13;
                                lVar3 = lVar4;
                                oVar3 = oVarA;
                            } else {
                                dVar4 = dVar3;
                                z14 = z13;
                                lVar3 = lVar4;
                            }
                            lVarV.C();
                            if (o.J()) {
                                o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                            }
                            if (aVar2 != null) {
                                lVarV.o(1923882473);
                                dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                                lVarV.l();
                            } else {
                                lVarV.o(1924298803);
                                lVarV.l();
                                dVarC = androidx.compose.ui.d.INSTANCE;
                            }
                            if (aVar2 != null) {
                                dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                            } else {
                                dVarC2 = androidx.compose.ui.d.INSTANCE;
                            }
                            o oVar5 = oVar3;
                            b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar5, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                            if (o.J()) {
                                o.R();
                            }
                            oVar4 = oVar5;
                            dVar5 = dVar4;
                            z15 = z14;
                        } else {
                            lVarV.j();
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                            }
                            dVar4 = dVar2;
                            z14 = z12;
                            lVar3 = lVar3;
                        }
                        oVar3 = oVar2;
                        lVarV.C();
                        if (o.J()) {
                            o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                        }
                        if (aVar2 != null) {
                            lVarV.o(1923882473);
                            dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                            lVarV.l();
                        } else {
                            lVarV.o(1924298803);
                            lVarV.l();
                            dVarC = androidx.compose.ui.d.INSTANCE;
                        }
                        if (aVar2 != null) {
                            dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                        } else {
                            dVarC2 = androidx.compose.ui.d.INSTANCE;
                        }
                        o oVar6 = oVar3;
                        b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar6, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                        if (o.J()) {
                            o.R();
                        }
                        oVar4 = oVar6;
                        dVar5 = dVar4;
                        z15 = z14;
                    } else {
                        lVarV.j();
                        dVar5 = dVar2;
                        z15 = z12;
                        oVar4 = oVar2;
                    }
                    lVar5 = lVar3;
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
                    }
                }
                i13 |= 24576;
                lVar3 = lVar;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        oVar2 = oVar;
                        if (lVarV.n(oVar2)) {
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                if ((74899 & i13) == 74898) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA2 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA2;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA3 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA3;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    if (aVar2 != null) {
                        lVarV.o(1923882473);
                        dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                        lVarV.l();
                    } else {
                        lVarV.o(1924298803);
                        lVarV.l();
                        dVarC = androidx.compose.ui.d.INSTANCE;
                    }
                    if (aVar2 != null) {
                        dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                    } else {
                        dVarC2 = androidx.compose.ui.d.INSTANCE;
                    }
                    o oVar7 = oVar3;
                    b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar7, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                    if (o.J()) {
                        o.R();
                    }
                    oVar4 = oVar7;
                    dVar5 = dVar4;
                    z15 = z14;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA4 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA4;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA5 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA5;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    if (aVar2 != null) {
                        lVarV.o(1923882473);
                        dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                        lVarV.l();
                    } else {
                        lVarV.o(1924298803);
                        lVarV.l();
                        dVarC = androidx.compose.ui.d.INSTANCE;
                    }
                    if (aVar2 != null) {
                        dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                    } else {
                        dVarC2 = androidx.compose.ui.d.INSTANCE;
                    }
                    o oVar8 = oVar3;
                    b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar8, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                    if (o.J()) {
                        o.R();
                    }
                    oVar4 = oVar8;
                    dVar5 = dVar4;
                    z15 = z14;
                }
                lVar5 = lVar3;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
                }
            }
            i13 |= 3072;
            z12 = z11;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        oVar2 = oVar;
                        if (lVarV.n(oVar2)) {
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                if ((74899 & i13) == 74898) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA6 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA6;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA7 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA7;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    if (aVar2 != null) {
                        lVarV.o(1923882473);
                        dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                        lVarV.l();
                    } else {
                        lVarV.o(1924298803);
                        lVarV.l();
                        dVarC = androidx.compose.ui.d.INSTANCE;
                    }
                    if (aVar2 != null) {
                        dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                    } else {
                        dVarC2 = androidx.compose.ui.d.INSTANCE;
                    }
                    o oVar9 = oVar3;
                    b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar9, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                    if (o.J()) {
                        o.R();
                    }
                    oVar4 = oVar9;
                    dVar5 = dVar4;
                    z15 = z14;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA8 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA8;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA9 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA9;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    if (aVar2 != null) {
                        lVarV.o(1923882473);
                        dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                        lVarV.l();
                    } else {
                        lVarV.o(1924298803);
                        lVarV.l();
                        dVarC = androidx.compose.ui.d.INSTANCE;
                    }
                    if (aVar2 != null) {
                        dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                    } else {
                        dVarC2 = androidx.compose.ui.d.INSTANCE;
                    }
                    o oVar10 = oVar3;
                    b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar10, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                    if (o.J()) {
                        o.R();
                    }
                    oVar4 = oVar10;
                    dVar5 = dVar4;
                    z15 = z14;
                }
                lVar5 = lVar3;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
                }
            }
            i13 |= 24576;
            lVar3 = lVar;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    oVar2 = oVar;
                    if (lVarV.n(oVar2)) {
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            if ((74899 & i13) == 74898) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA10 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA10;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA11 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA11;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                }
                if (aVar2 != null) {
                    lVarV.o(1923882473);
                    dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                    lVarV.l();
                } else {
                    lVarV.o(1924298803);
                    lVarV.l();
                    dVarC = androidx.compose.ui.d.INSTANCE;
                }
                if (aVar2 != null) {
                    dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                } else {
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                }
                o oVar11 = oVar3;
                b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar11, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                if (o.J()) {
                    o.R();
                }
                oVar4 = oVar11;
                dVar5 = dVar4;
                z15 = z14;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA12 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA12;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA13 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA13;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                }
                if (aVar2 != null) {
                    lVarV.o(1923882473);
                    dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                    lVarV.l();
                } else {
                    lVarV.o(1924298803);
                    lVarV.l();
                    dVarC = androidx.compose.ui.d.INSTANCE;
                }
                if (aVar2 != null) {
                    dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                } else {
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                }
                o oVar12 = oVar3;
                b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar12, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                if (o.J()) {
                    o.R();
                }
                oVar4 = oVar12;
                dVar5 = dVar4;
                z15 = z14;
            }
            lVar5 = lVar3;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        dVar2 = dVar;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    lVar3 = lVar;
                    if (lVarV.n(lVar3)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        oVar2 = oVar;
                        if (lVarV.n(oVar2)) {
                        }
                        i13 |= i19;
                    } else {
                        oVar2 = oVar;
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                if ((74899 & i13) == 74898) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA14 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA14;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA15 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA15;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    if (aVar2 != null) {
                        lVarV.o(1923882473);
                        dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                        lVarV.l();
                    } else {
                        lVarV.o(1924298803);
                        lVarV.l();
                        dVarC = androidx.compose.ui.d.INSTANCE;
                    }
                    if (aVar2 != null) {
                        dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                    } else {
                        dVarC2 = androidx.compose.ui.d.INSTANCE;
                    }
                    o oVar13 = oVar3;
                    b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar13, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                    if (o.J()) {
                        o.R();
                    }
                    oVar4 = oVar13;
                    dVar5 = dVar4;
                    z15 = z14;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA16 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA16;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i16 != 0) {
                            lVar4 = null;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i12 & 32) != 0) {
                            o oVarA17 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                            lVarV = lVarV;
                            i13 &= -458753;
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVarA17;
                        } else {
                            dVar4 = dVar3;
                            z14 = z13;
                            lVar3 = lVar4;
                            oVar3 = oVar2;
                        }
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                    }
                    if (aVar2 != null) {
                        lVarV.o(1923882473);
                        dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                        lVarV.l();
                    } else {
                        lVarV.o(1924298803);
                        lVarV.l();
                        dVarC = androidx.compose.ui.d.INSTANCE;
                    }
                    if (aVar2 != null) {
                        dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                    } else {
                        dVarC2 = androidx.compose.ui.d.INSTANCE;
                    }
                    o oVar14 = oVar3;
                    b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar14, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                    if (o.J()) {
                        o.R();
                    }
                    oVar4 = oVar14;
                    dVar5 = dVar4;
                    z15 = z14;
                }
                lVar5 = lVar3;
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
                }
            }
            i13 |= 24576;
            lVar3 = lVar;
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    oVar2 = oVar;
                    if (lVarV.n(oVar2)) {
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            if ((74899 & i13) == 74898) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA18 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA18;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA19 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA19;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                }
                if (aVar2 != null) {
                    lVarV.o(1923882473);
                    dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                    lVarV.l();
                } else {
                    lVarV.o(1924298803);
                    lVarV.l();
                    dVarC = androidx.compose.ui.d.INSTANCE;
                }
                if (aVar2 != null) {
                    dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                } else {
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                }
                o oVar15 = oVar3;
                b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar15, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                if (o.J()) {
                    o.R();
                }
                oVar4 = oVar15;
                dVar5 = dVar4;
                z15 = z14;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA110 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA110;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA111 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA111;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                }
                if (aVar2 != null) {
                    lVarV.o(1923882473);
                    dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                    lVarV.l();
                } else {
                    lVarV.o(1924298803);
                    lVarV.l();
                    dVarC = androidx.compose.ui.d.INSTANCE;
                }
                if (aVar2 != null) {
                    dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                } else {
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                }
                o oVar16 = oVar3;
                b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar16, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                if (o.J()) {
                    o.R();
                }
                oVar4 = oVar16;
                dVar5 = dVar4;
                z15 = z14;
            }
            lVar5 = lVar3;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
            }
        }
        i13 |= 3072;
        z12 = z11;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                lVar3 = lVar;
                if (lVarV.n(lVar3)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    oVar2 = oVar;
                    if (lVarV.n(oVar2)) {
                    }
                    i13 |= i19;
                } else {
                    oVar2 = oVar;
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            if ((74899 & i13) == 74898) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA112 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA112;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA113 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA113;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                }
                if (aVar2 != null) {
                    lVarV.o(1923882473);
                    dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                    lVarV.l();
                } else {
                    lVarV.o(1924298803);
                    lVarV.l();
                    dVarC = androidx.compose.ui.d.INSTANCE;
                }
                if (aVar2 != null) {
                    dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                } else {
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                }
                o oVar17 = oVar3;
                b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar17, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                if (o.J()) {
                    o.R();
                }
                oVar4 = oVar17;
                dVar5 = dVar4;
                z15 = z14;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA114 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA114;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                } else {
                    if (i18 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i16 != 0) {
                        lVar4 = null;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i12 & 32) != 0) {
                        o oVarA115 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                        lVarV = lVarV;
                        i13 &= -458753;
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVarA115;
                    } else {
                        dVar4 = dVar3;
                        z14 = z13;
                        lVar3 = lVar4;
                        oVar3 = oVar2;
                    }
                }
                lVarV.C();
                if (o.J()) {
                    o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
                }
                if (aVar2 != null) {
                    lVarV.o(1923882473);
                    dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                    lVarV.l();
                } else {
                    lVarV.o(1924298803);
                    lVarV.l();
                    dVarC = androidx.compose.ui.d.INSTANCE;
                }
                if (aVar2 != null) {
                    dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
                } else {
                    dVarC2 = androidx.compose.ui.d.INSTANCE;
                }
                o oVar18 = oVar3;
                b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar18, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
                if (o.J()) {
                    o.R();
                }
                oVar4 = oVar18;
                dVar5 = dVar4;
                z15 = z14;
            }
            lVar5 = lVar3;
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
            }
        }
        i13 |= 24576;
        lVar3 = lVar;
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                oVar2 = oVar;
                if (lVarV.n(oVar2)) {
                }
                i13 |= i19;
            } else {
                oVar2 = oVar;
            }
            i13 |= i19;
        } else {
            oVar2 = oVar;
        }
        if ((74899 & i13) == 74898) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 32) != 0) {
                    o oVarA116 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVarA116;
                } else {
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVar2;
                }
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 32) != 0) {
                    o oVarA117 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVarA117;
                } else {
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVar2;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
            }
            if (aVar2 != null) {
                lVarV.o(1923882473);
                dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                lVarV.l();
            } else {
                lVarV.o(1924298803);
                lVarV.l();
                dVarC = androidx.compose.ui.d.INSTANCE;
            }
            if (aVar2 != null) {
                dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
            } else {
                dVarC2 = androidx.compose.ui.d.INSTANCE;
            }
            o oVar19 = oVar3;
            b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar19, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
            if (o.J()) {
                o.R();
            }
            oVar4 = oVar19;
            dVar5 = dVar4;
            z15 = z14;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 32) != 0) {
                    o oVarA118 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVarA118;
                } else {
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVar2;
                }
            } else {
                if (i18 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i16 != 0) {
                    lVar4 = null;
                } else {
                    lVar4 = lVar3;
                }
                if ((i12 & 32) != 0) {
                    o oVarA119 = p.f74863a.a(0L, 0L, 0L, 0L, 0L, lVarV, 196608, 31);
                    lVarV = lVarV;
                    i13 &= -458753;
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVarA119;
                } else {
                    dVar4 = dVar3;
                    z14 = z13;
                    lVar3 = lVar4;
                    oVar3 = oVar2;
                }
            }
            lVarV.C();
            if (o.J()) {
                o.S(2031255194, i13, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:137)");
            }
            if (aVar2 != null) {
                lVarV.o(1923882473);
                dVarC = androidx.compose.foundation.selection.c.c(androidx.compose.ui.d.INSTANCE, aVar3, lVar3, androidx.compose.material.d.g(false, f74936a, 0L, lVarV, 54, 4), z14, g4.i.h(g4.i.INSTANCE.b()), aVar2);
                lVarV.l();
            } else {
                lVarV.o(1924298803);
                lVarV.l();
                dVarC = androidx.compose.ui.d.INSTANCE;
            }
            if (aVar2 != null) {
                dVarC2 = g1.c(androidx.compose.ui.d.INSTANCE);
            } else {
                dVarC2 = androidx.compose.ui.d.INSTANCE;
            }
            o oVar110 = oVar3;
            b(z14, aVar, t.i(dVar4.g(dVarC2).g(dVarC), f74937b), oVar110, lVarV, ((i13 >> 9) & 14) | ((i13 << 3) & 112) | ((i13 >> 6) & 7168));
            if (o.J()) {
                o.R();
            }
            oVar4 = oVar110;
            dVar5 = dVar4;
            z15 = z14;
        }
        lVar5 = lVar3;
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(aVar, aVar2, dVar5, z15, lVar5, oVar4, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(m3.f fVar, long j11, long j12, float f11, float f12) {
        float f13 = f12 / 2.0f;
        Stroke stroke = new Stroke(f12, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30, null);
        float fK = j3.m.k(fVar.b());
        if (p1.r(j11, j12)) {
            m3.f.D1(fVar, j11, 0L, n.a(fK, fK), j3.b.b(f11, BitmapDescriptorFactory.HUE_RED, 2, null), m3.j.f90966a, BitmapDescriptorFactory.HUE_RED, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, null);
            return;
        }
        float f14 = fK - (2 * f12);
        m3.f.D1(fVar, j11, j3.h.a(f12, f12), n.a(f14, f14), j3.b.b(Math.max(BitmapDescriptorFactory.HUE_RED, f11 - f12), BitmapDescriptorFactory.HUE_RED, 2, null), m3.j.f90966a, BitmapDescriptorFactory.HUE_RED, null, 0, 224, null);
        float f15 = fK - f12;
        m3.f.D1(fVar, j12, j3.h.a(f13, f13), n.a(f15, f15), j3.b.b(f11 - f13, BitmapDescriptorFactory.HUE_RED, 2, null), stroke, BitmapDescriptorFactory.HUE_RED, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(m3.f fVar, long j11, float f11, float f12, float f13, n nVar) {
        Stroke stroke = new Stroke(f13, BitmapDescriptorFactory.HUE_RED, i4.INSTANCE.c(), 0, null, 26, null);
        float fK = j3.m.k(fVar.b());
        float fB = y4.b.b(0.4f, 0.5f, f12);
        float fB2 = y4.b.b(0.7f, 0.5f, f12);
        float fB3 = y4.b.b(0.5f, 0.5f, f12);
        float fB4 = y4.b.b(0.3f, 0.5f, f12);
        nVar.getCheckPath().reset();
        nVar.getCheckPath().moveTo(0.2f * fK, fB3 * fK);
        nVar.getCheckPath().lineTo(fB * fK, fB2 * fK);
        nVar.getCheckPath().lineTo(0.8f * fK, fK * fB4);
        nVar.getPathMeasure().a(nVar.getCheckPath(), false);
        nVar.getPathToDraw().reset();
        nVar.getPathMeasure().b(BitmapDescriptorFactory.HUE_RED, nVar.getPathMeasure().getLength() * f11, nVar.getPathToDraw(), true);
        m3.f.W(fVar, nVar.getPathToDraw(), j11, BitmapDescriptorFactory.HUE_RED, stroke, null, 0, 52, null);
    }
}
