package p009i2;

import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.graphics.f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import k3.o4;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.f0;
import p019p1.g0;
import p019p1.l1;
import p019p1.o1;
import p019p1.r1;
import p019p1.u0;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.p1;
import p020r2.w2;
import p020r2.x;
import p020r2.y3;
import v1.g;
import v1.i;
import v1.w;
import w4.h;
import wn0.l;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aQ\u0010\u000e\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016\"\u001a\u0010\u001b\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016\"\u001a\u0010 \u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u001a\"\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016\"\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016\"\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0016¨\u0006(²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"Lp1/u0;", "", "expandedStates", "Lr2/p1;", "Landroidx/compose/ui/graphics/f;", "transformOriginState", "Landroidx/compose/foundation/o;", "scrollState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Lv1/i;", "Ljn0/h0;", "content", "a", "(Lp1/u0;Lr2/p1;Landroidx/compose/foundation/o;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "Lw4/p;", "parentBounds", "menuBounds", "f", "(Lw4/p;Lw4/p;)J", "Lw4/h;", Gender.FEMALE, "MenuElevation", "b", "h", "()F", "MenuVerticalMargin", "c", "DropdownMenuItemHorizontalPadding", DateTokenConverter.CONVERTER_KEY, "g", "DropdownMenuVerticalPadding", "e", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMinHeight", "", "scale", "alpha", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f74699b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f74701d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f74704g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f74700c = h.g(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f74702e = h.g(112);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f74703f = h.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<androidx.compose.ui.graphics.c, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1<f> f74705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<Float> f74706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y3<Float> f74707e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p1<f> p1Var, y3<Float> y3Var, y3<Float> y3Var2) {
            super(1);
            this.f74705c = p1Var;
            this.f74706d = y3Var;
            this.f74707e = y3Var2;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.k(m1.b(this.f74706d));
            cVar.l(m1.b(this.f74706d));
            cVar.a(m1.c(this.f74707e));
            cVar.k0(this.f74705c.getValue().getPackedValue());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f74709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<i, p020r2.l, Integer, h0> f74710e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.d dVar, o oVar, q<? super i, ? super p020r2.l, ? super Integer, h0> qVar) {
            super(2);
            this.f74708c = dVar;
            this.f74709d = oVar;
            this.f74710e = qVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(895555282, i11, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:122)");
            }
            androidx.compose.ui.d dVarD = m.d(n.b(t.k(this.f74708c, BitmapDescriptorFactory.HUE_RED, m1.g(), 1, null), w.Max), this.f74709d, false, null, false, 14, null);
            q<i, p020r2.l, Integer, h0> qVar = this.f74710e;
            i0 i0VarA = g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarD);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            qVar.invoke(v1.j.f117505a, lVar, 6);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u0<Boolean> f74711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p1<f> f74712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f74713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<i, p020r2.l, Integer, h0> f74715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f74716h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f74717i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(u0<Boolean> u0Var, p1<f> p1Var, o oVar, androidx.compose.ui.d dVar, q<? super i, ? super p020r2.l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f74711c = u0Var;
            this.f74712d = p1Var;
            this.f74713e = oVar;
            this.f74714f = dVar;
            this.f74715g = qVar;
            this.f74716h = i11;
            this.f74717i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            m1.a(this.f74711c, this.f74712d, this.f74713e, this.f74714f, this.f74715g, lVar, k2.a(this.f74716h | 1), this.f74717i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements q<l1.b<Boolean>, p020r2.l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f74718c = new d();

        d() {
            super(3);
        }

        public final g0<Float> a(l1.b<Boolean> bVar, p020r2.l lVar, int i11) {
            lVar.o(-2065494304);
            if (p020r2.o.J()) {
                p020r2.o.S(-2065494304, i11, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:96)");
            }
            o1 o1VarL = bVar.b(Boolean.FALSE, Boolean.TRUE) ? p019p1.j.l(30, 0, null, 6, null) : p019p1.j.l(75, 0, null, 6, null);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<Boolean> bVar, p020r2.l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements q<l1.b<Boolean>, p020r2.l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f74719c = new e();

        e() {
            super(3);
        }

        public final g0<Float> a(l1.b<Boolean> bVar, p020r2.l lVar, int i11) {
            lVar.o(-800950068);
            if (p020r2.o.J()) {
                p020r2.o.S(-800950068, i11, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:70)");
            }
            o1 o1VarL = bVar.b(Boolean.FALSE, Boolean.TRUE) ? p019p1.j.l(120, 0, f0.e(), 2, null) : p019p1.j.l(1, 74, null, 4, null);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVar.l();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<Boolean> bVar, p020r2.l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    static {
        float f11 = 8;
        f74698a = h.g(f11);
        float f12 = 48;
        f74699b = h.g(f12);
        f74701d = h.g(f11);
        f74704g = h.g(f12);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0220  */
    /* JADX WARN: Code duplicated, block: B:120:0x022a  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0174  */
    /* JADX WARN: Code duplicated, block: B:93:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    public static final void a(u0<Boolean> u0Var, p1<f> p1Var, o oVar, androidx.compose.ui.d dVar, q<? super i, ? super p020r2.l, ? super Integer, h0> qVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        androidx.compose.ui.d dVar3;
        boolean zBooleanValue;
        float f11;
        y3 y3VarD;
        boolean zBooleanValue2;
        float f12;
        y3 y3VarD2;
        boolean zN;
        Object objI;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(435109845);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(u0Var) : lVarV.K(u0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(p1Var) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(oVar) ? 256 : 128;
        }
        int i15 = i12 & 8;
        if (i15 == 0) {
            if ((i11 & 3072) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 2048 : 1024;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(qVar)) {
                    i14 = 16384;
                } else {
                    i14 = PKIFailureInfo.certRevoked;
                }
                i13 |= i14;
            }
            if ((i13 & 9363) == 9362 || !lVarV.b()) {
                if (i15 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(435109845, i13, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:64)");
                }
                l1 l1VarF = p019p1.m1.f(u0Var, "DropDownMenu", lVarV, u0.f100644d | 48 | (i13 & 14), 0);
                e eVar = e.f74719c;
                p013kotlin.jvm.internal.l lVar2 = p013kotlin.jvm.internal.l.f86526a;
                p019p1.p1<Float, p019p1.m> p1VarE = r1.e(lVar2);
                zBooleanValue = ((Boolean) l1VarF.i()).booleanValue();
                lVarV.o(1652594929);
                if (p020r2.o.J()) {
                    p020r2.o.S(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)");
                }
                if (zBooleanValue) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf = Float.valueOf(f11);
                boolean zBooleanValue3 = ((Boolean) l1VarF.p()).booleanValue();
                lVarV.o(1652594929);
                if (p020r2.o.J()) {
                    p020r2.o.S(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)");
                }
                float f13 = zBooleanValue3 ? 1.0f : 0.8f;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                androidx.compose.ui.d dVar5 = dVar3;
                int i16 = i13;
                y3VarD = p019p1.m1.d(l1VarF, fValueOf, Float.valueOf(f13), eVar.invoke(l1VarF.n(), lVarV, 0), p1VarE, "FloatAnimation", lVarV, 0);
                d dVar6 = d.f74718c;
                p019p1.p1<Float, p019p1.m> p1VarE2 = r1.e(lVar2);
                zBooleanValue2 = ((Boolean) l1VarF.i()).booleanValue();
                lVarV.o(388050693);
                if (p020r2.o.J()) {
                    p020r2.o.S(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)");
                }
                if (zBooleanValue2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                Float fValueOf2 = Float.valueOf(f12);
                boolean zBooleanValue4 = ((Boolean) l1VarF.p()).booleanValue();
                lVarV.o(388050693);
                if (p020r2.o.J()) {
                    p020r2.o.S(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)");
                }
                float f14 = zBooleanValue4 ? 1.0f : 0.0f;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                lVarV.l();
                y3VarD2 = p019p1.m1.d(l1VarF, fValueOf2, Float.valueOf(f14), dVar6.invoke(l1VarF.n(), lVarV, 0), p1VarE2, "FloatAnimation", lVarV, 0);
                androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                zN = ((i16 & 112) == 32) | lVarV.n(y3VarD) | lVarV.n(y3VarD2);
                objI = lVarV.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new a(p1Var, y3VarD, y3VarD2);
                    lVarV.B(objI);
                }
                m.a(androidx.compose.ui.graphics.b.a(companion, (l) objI), null, 0L, 0L, null, f74698a, z2.c.e(895555282, true, new b(dVar5, oVar, qVar), lVarV, 54), lVarV, 1769472, 30);
                lVarV = lVarV;
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar5;
            } else {
                lVarV.j();
                dVar4 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(u0Var, p1Var, oVar, dVar4, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        dVar2 = dVar;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(qVar)) {
                i14 = 16384;
            } else {
                i14 = PKIFailureInfo.certRevoked;
            }
            i13 |= i14;
        }
        if ((i13 & 9363) == 9362) {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(435109845, i13, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:64)");
            }
            l1 l1VarF2 = p019p1.m1.f(u0Var, "DropDownMenu", lVarV, u0.f100644d | 48 | (i13 & 14), 0);
            e eVar2 = e.f74719c;
            p013kotlin.jvm.internal.l lVar3 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, p019p1.m> p1VarE3 = r1.e(lVar3);
            zBooleanValue = ((Boolean) l1VarF2.i()).booleanValue();
            lVarV.o(1652594929);
            if (p020r2.o.J()) {
                p020r2.o.S(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)");
            }
            if (zBooleanValue) {
                f11 = 1.0f;
            } else {
                f11 = 0.8f;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf3 = Float.valueOf(f11);
            boolean zBooleanValue5 = ((Boolean) l1VarF2.p()).booleanValue();
            lVarV.o(1652594929);
            if (p020r2.o.J()) {
                p020r2.o.S(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)");
            }
            if (zBooleanValue5) {
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            androidx.compose.ui.d dVar7 = dVar3;
            int i17 = i13;
            y3VarD = p019p1.m1.d(l1VarF2, fValueOf3, Float.valueOf(f13), eVar2.invoke(l1VarF2.n(), lVarV, 0), p1VarE3, "FloatAnimation", lVarV, 0);
            d dVar8 = d.f74718c;
            p019p1.p1<Float, p019p1.m> p1VarE4 = r1.e(lVar3);
            zBooleanValue2 = ((Boolean) l1VarF2.i()).booleanValue();
            lVarV.o(388050693);
            if (p020r2.o.J()) {
                p020r2.o.S(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)");
            }
            if (zBooleanValue2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf4 = Float.valueOf(f12);
            boolean zBooleanValue6 = ((Boolean) l1VarF2.p()).booleanValue();
            lVarV.o(388050693);
            if (p020r2.o.J()) {
                p020r2.o.S(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)");
            }
            if (zBooleanValue6) {
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD2 = p019p1.m1.d(l1VarF2, fValueOf4, Float.valueOf(f14), dVar8.invoke(l1VarF2.n(), lVarV, 0), p1VarE4, "FloatAnimation", lVarV, 0);
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            zN = ((i17 & 112) == 32) | lVarV.n(y3VarD) | lVarV.n(y3VarD2);
            objI = lVarV.I();
            if (zN) {
                objI = new a(p1Var, y3VarD, y3VarD2);
                lVarV.B(objI);
            } else {
                objI = new a(p1Var, y3VarD, y3VarD2);
                lVarV.B(objI);
            }
            m.a(androidx.compose.ui.graphics.b.a(companion2, (l) objI), null, 0L, 0L, null, f74698a, z2.c.e(895555282, true, new b(dVar7, oVar, qVar), lVarV, 54), lVarV, 1769472, 30);
            lVarV = lVarV;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar7;
        } else {
            if (i15 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(435109845, i13, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:64)");
            }
            l1 l1VarF3 = p019p1.m1.f(u0Var, "DropDownMenu", lVarV, u0.f100644d | 48 | (i13 & 14), 0);
            e eVar3 = e.f74719c;
            p013kotlin.jvm.internal.l lVar4 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, p019p1.m> p1VarE5 = r1.e(lVar4);
            zBooleanValue = ((Boolean) l1VarF3.i()).booleanValue();
            lVarV.o(1652594929);
            if (p020r2.o.J()) {
                p020r2.o.S(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)");
            }
            if (zBooleanValue) {
                f11 = 1.0f;
            } else {
                f11 = 0.8f;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf5 = Float.valueOf(f11);
            boolean zBooleanValue7 = ((Boolean) l1VarF3.p()).booleanValue();
            lVarV.o(1652594929);
            if (p020r2.o.J()) {
                p020r2.o.S(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:85)");
            }
            if (zBooleanValue7) {
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            androidx.compose.ui.d dVar9 = dVar3;
            int i18 = i13;
            y3VarD = p019p1.m1.d(l1VarF3, fValueOf5, Float.valueOf(f13), eVar3.invoke(l1VarF3.n(), lVarV, 0), p1VarE5, "FloatAnimation", lVarV, 0);
            d dVar10 = d.f74718c;
            p019p1.p1<Float, p019p1.m> p1VarE6 = r1.e(lVar4);
            zBooleanValue2 = ((Boolean) l1VarF3.i()).booleanValue();
            lVarV.o(388050693);
            if (p020r2.o.J()) {
                p020r2.o.S(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)");
            }
            if (zBooleanValue2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            Float fValueOf6 = Float.valueOf(f12);
            boolean zBooleanValue8 = ((Boolean) l1VarF3.p()).booleanValue();
            lVarV.o(388050693);
            if (p020r2.o.J()) {
                p020r2.o.S(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:105)");
            }
            if (zBooleanValue8) {
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            lVarV.l();
            y3VarD2 = p019p1.m1.d(l1VarF3, fValueOf6, Float.valueOf(f14), dVar10.invoke(l1VarF3.n(), lVarV, 0), p1VarE6, "FloatAnimation", lVarV, 0);
            androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
            zN = ((i18 & 112) == 32) | lVarV.n(y3VarD) | lVarV.n(y3VarD2);
            objI = lVarV.I();
            if (zN) {
                objI = new a(p1Var, y3VarD, y3VarD2);
                lVarV.B(objI);
            } else {
                objI = new a(p1Var, y3VarD, y3VarD2);
                lVarV.B(objI);
            }
            m.a(androidx.compose.ui.graphics.b.a(companion3, (l) objI), null, 0L, 0L, null, f74698a, z2.c.e(895555282, true, new b(dVar9, oVar, qVar), lVarV, 54), lVarV, 1769472, 30);
            lVarV = lVarV;
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar9;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(u0Var, p1Var, oVar, dVar4, qVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static final long f(w4.p pVar, w4.p pVar2) {
        float fMax;
        float fMax2 = 1.0f;
        if (pVar2.getLeft() >= pVar.getRight()) {
            fMax = 0.0f;
        } else if (pVar2.getRight() <= pVar.getLeft()) {
            fMax = 1.0f;
        } else if (pVar2.k() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((Math.max(pVar.getLeft(), pVar2.getLeft()) + Math.min(pVar.getRight(), pVar2.getRight())) / 2) - pVar2.getLeft()) / pVar2.k();
        }
        if (pVar2.getTop() >= pVar.getBottom()) {
            fMax2 = 0.0f;
        } else if (pVar2.getBottom() > pVar.getTop()) {
            if (pVar2.e() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(pVar.getTop(), pVar2.getTop()) + Math.min(pVar.getBottom(), pVar2.getBottom())) / 2) - pVar2.getTop()) / pVar2.e();
            }
        }
        return o4.a(fMax, fMax2);
    }

    public static final float g() {
        return f74701d;
    }

    public static final float h() {
        return f74699b;
    }
}
