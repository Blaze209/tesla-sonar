package p012k90;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.platform.z0;
import b4.g;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import d3.c;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import v1.y;
import w4.b;
import w4.h;
import w4.t;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;
import z3.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aZ\u0010#\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a{\u00100\u001a\u00020\u0003*\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010(2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u00101\u001aa\u00103\u001a\u00020\u0003*\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u00102\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010(2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u00104\u001a\u0019\u00106\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b6\u00107\u001a\u0019\u00108\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b8\u00107\"\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:\"\u001a\u0010@\u001a\u0004\u0018\u00010=*\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "textField", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "placeholder", "leading", "trailing", "", "singleLine", "", "animationProgress", "Lv1/y;", "paddingValues", "a", "(Landroidx/compose/ui/d;Lwn0/p;Lwn0/p;Lwn0/q;Lwn0/p;Lwn0/p;ZFLv1/y;Lr2/l;I)V", "", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "k", "(IIIIIJ)I", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "j", "(IZIIIIJFLv1/y;)I", "Lz3/w0$a;", Snapshot.WIDTH, Snapshot.HEIGHT, "Lz3/w0;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "n", "(Lz3/w0$a;IILz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;ZIIFF)V", "textPlaceable", "o", "(Lz3/w0$a;IILz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;ZFLv1/y;)V", "placeable", "p", "(Lz3/w0;)I", "m", "Lw4/h;", Gender.FEMALE, "TextFieldTopPadding", "Lz3/q;", "", "l", "(Lz3/q;)Ljava/lang/Object;", "layoutId", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f85539a = h.g(4);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f85540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f85541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f85542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<androidx.compose.ui.d, l, Integer, h0> f85543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f85544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f85545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f85546i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f85547j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ y f85548k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f85549l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.d dVar, p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, q<? super androidx.compose.ui.d, ? super l, ? super Integer, h0> qVar, p<? super l, ? super Integer, h0> pVar3, p<? super l, ? super Integer, h0> pVar4, boolean z11, float f11, y yVar, int i11) {
            super(2);
            this.f85540c = dVar;
            this.f85541d = pVar;
            this.f85542e = pVar2;
            this.f85543f = qVar;
            this.f85544g = pVar3;
            this.f85545h = pVar4;
            this.f85546i = z11;
            this.f85547j = f11;
            this.f85548k = yVar;
            this.f85549l = i11;
        }

        public final void a(l lVar, int i11) {
            d.a(this.f85540c, this.f85541d, this.f85542e, this.f85543f, this.f85544g, this.f85545h, this.f85546i, this.f85547j, this.f85548k, lVar, k2.a(this.f85549l | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(androidx.compose.ui.d modifier, p<? super l, ? super Integer, h0> textField, p<? super l, ? super Integer, h0> pVar, q<? super androidx.compose.ui.d, ? super l, ? super Integer, h0> qVar, p<? super l, ? super Integer, h0> pVar2, p<? super l, ? super Integer, h0> pVar3, boolean z11, float f11, y paddingValues, l lVar, int i11) {
        int i12;
        int i13;
        s.k(modifier, "modifier");
        s.k(textField, "textField");
        s.k(paddingValues, "paddingValues");
        l lVarV = lVar.v(2074181738);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(textField) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.K(qVar) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= lVarV.K(pVar2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= lVarV.K(pVar3) ? 131072 : 65536;
        }
        if ((i11 & 3670016) == 0) {
            i12 |= lVarV.p(z11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i11 & 29360128) == 0) {
            i12 |= lVarV.q(f11) ? 8388608 : 4194304;
        }
        if ((i11 & 234881024) == 0) {
            i12 |= lVarV.n(paddingValues) ? 67108864 : 33554432;
        }
        if ((i12 & 191739611) == 38347922 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(2074181738, i12, -1, "com.stripe.android.uicore.elements.compat.TextFieldLayout (TextFieldLayout.kt:65)");
            }
            lVarV.H(925993573);
            boolean z12 = ((i12 & 3670016) == 1048576) | ((i12 & 29360128) == 8388608) | ((i12 & 234881024) == 67108864);
            Object objI = lVarV.I();
            if (z12 || objI == l.INSTANCE.a()) {
                objI = new e(z11, f11, paddingValues);
                lVarV.B(objI);
            }
            e eVar = (e) objI;
            lVarV.T();
            t tVar = (t) lVarV.U(z0.m());
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            g.Companion companion = g.INSTANCE;
            wn0.a<g> aVarA = companion.a();
            q<y2<g>, l, Integer, h0> qVarA = a0.a(modifier);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, eVar, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<g, Integer, h0> pVarB = companion.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            lVarV.H(1047033705);
            if (pVar2 != null) {
                androidx.compose.ui.d dVarG = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.INSTANCE, "Leading").g(p012k90.a.b());
                c cVarE = c.INSTANCE.e();
                lVarV.H(733328855);
                i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
                lVarV.H(-1323940314);
                int iA2 = j.a(lVarV, 0);
                x xVarC2 = lVarV.c();
                wn0.a<g> aVarA2 = companion.a();
                q<y2<g>, l, Integer, h0> qVarA2 = a0.a(dVarG);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                l lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarJ, companion.c());
                d4.b(lVarA2, xVarC2, companion.e());
                p<g, Integer, h0> pVarB2 = companion.b();
                if (lVarA2.u() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                qVarA2.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                i iVar = i.f4585a;
                pVar2.invoke(lVarV, Integer.valueOf((i12 >> 12) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
            }
            lVarV.T();
            lVarV.H(1047042828);
            if (pVar3 != null) {
                androidx.compose.ui.d dVarG2 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.INSTANCE, "Trailing").g(p012k90.a.b());
                c cVarE2 = c.INSTANCE.e();
                lVarV.H(733328855);
                i0 i0VarJ2 = androidx.compose.foundation.layout.g.j(cVarE2, false, lVarV, 6);
                lVarV.H(-1323940314);
                int iA3 = j.a(lVarV, 0);
                x xVarC3 = lVarV.c();
                wn0.a<g> aVarA3 = companion.a();
                q<y2<g>, l, Integer, h0> qVarA3 = a0.a(dVarG2);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                l lVarA3 = d4.a(lVarV);
                d4.b(lVarA3, i0VarJ2, companion.c());
                d4.b(lVarA3, xVarC3, companion.e());
                p<g, Integer, h0> pVarB3 = companion.b();
                if (lVarA3.u() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                qVarA3.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                i iVar2 = i.f4585a;
                pVar3.invoke(lVarV, Integer.valueOf((i12 >> 15) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
            }
            lVarV.T();
            float fG = androidx.compose.foundation.layout.t.g(paddingValues, tVar);
            float f12 = androidx.compose.foundation.layout.t.f(paddingValues, tVar);
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            if (pVar2 != null) {
                i13 = 0;
                fG = h.g(n.e(h.g(fG - p012k90.a.a()), h.g(0)));
            } else {
                i13 = 0;
            }
            float f13 = fG;
            if (pVar3 != null) {
                f12 = h.g(n.e(h.g(f12 - p012k90.a.a()), h.g(i13)));
            }
            androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(companion2, f13, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, 10, null);
            lVarV.H(1047075021);
            if (qVar != null) {
                qVar.invoke(androidx.compose.ui.layout.a.b(companion2, "Hint").g(dVarM), lVarV, Integer.valueOf((i12 >> 6) & 112));
            }
            lVarV.T();
            lVarV.H(1047079141);
            if (pVar != null) {
                androidx.compose.ui.d dVarG3 = androidx.compose.ui.layout.a.b(companion2, "Label").g(dVarM);
                lVarV.H(733328855);
                i0 i0VarJ3 = androidx.compose.foundation.layout.g.j(c.INSTANCE.o(), false, lVarV, 0);
                lVarV.H(-1323940314);
                int iA4 = j.a(lVarV, 0);
                x xVarC4 = lVarV.c();
                wn0.a<g> aVarA4 = companion.a();
                q<y2<g>, l, Integer, h0> qVarA4 = a0.a(dVarG3);
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.u()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                l lVarA4 = d4.a(lVarV);
                d4.b(lVarA4, i0VarJ3, companion.c());
                d4.b(lVarA4, xVarC4, companion.e());
                p<g, Integer, h0> pVarB4 = companion.b();
                if (lVarA4.u() || !s.f(lVarA4.I(), Integer.valueOf(iA4))) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                qVarA4.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
                lVarV.H(2058660585);
                i iVar3 = i.f4585a;
                pVar.invoke(lVarV, Integer.valueOf((i12 >> 6) & 14));
                lVarV.T();
                lVarV.g();
                lVarV.T();
                lVarV.T();
            }
            lVarV.T();
            androidx.compose.ui.d dVarG4 = androidx.compose.ui.layout.a.b(companion2, "TextField").g(dVarM);
            lVarV.H(733328855);
            i0 i0VarJ4 = androidx.compose.foundation.layout.g.j(c.INSTANCE.o(), true, lVarV, 48);
            lVarV.H(-1323940314);
            int iA5 = j.a(lVarV, 0);
            x xVarC5 = lVarV.c();
            wn0.a<g> aVarA5 = companion.a();
            q<y2<g>, l, Integer, h0> qVarA5 = a0.a(dVarG4);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA5);
            } else {
                lVarV.d();
            }
            l lVarA5 = d4.a(lVarV);
            d4.b(lVarA5, i0VarJ4, companion.c());
            d4.b(lVarA5, xVarC5, companion.e());
            p<g, Integer, h0> pVarB5 = companion.b();
            if (lVarA5.u() || !s.f(lVarA5.I(), Integer.valueOf(iA5))) {
                lVarA5.B(Integer.valueOf(iA5));
                lVarA5.f(Integer.valueOf(iA5), pVarB5);
            }
            qVarA5.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            i iVar4 = i.f4585a;
            textField.invoke(lVarV, Integer.valueOf((i12 >> 3) & 14));
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            lVarV.T();
            lVarV.g();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(modifier, textField, pVar, qVar, pVar2, pVar3, z11, f11, paddingValues, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i11, boolean z11, int i12, int i13, int i14, int i15, long j11, float f11, y yVar) {
        float f12 = f85539a * f11;
        float top = yVar.getTop() * f11;
        float bottom = yVar.getBottom() * f11;
        int iMax = Math.max(i11, i15);
        return Math.max(yn0.a.d(z11 ? i12 + f12 + iMax + bottom : top + iMax + bottom), Math.max(Math.max(i13, i14), b.m(j11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i11, int i12, int i13, int i14, int i15, long j11) {
        return Math.max(i11 + Math.max(i13, Math.max(i14, i15)) + i12, b.n(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(z3.q qVar) {
        Object parentData = qVar.getParentData();
        z3.y yVar = parentData instanceof z3.y ? (z3.y) parentData : null;
        if (yVar != null) {
            return yVar.getLayoutId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(w0 w0Var) {
        if (w0Var != null) {
            return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(w0.a aVar, int i11, int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, boolean z11, int i13, int i14, float f11, float f12) {
        if (w0Var4 != null) {
            w0.a.l(aVar, w0Var4, 0, c.INSTANCE.i().a(w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var5 != null) {
            w0.a.l(aVar, w0Var5, i11 - w0Var5.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), c.INSTANCE.i().a(w0Var5.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var2 != null) {
            int iA = z11 ? c.INSTANCE.i().a(w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12) : yn0.a.d(p012k90.a.c() * f12);
            w0.a.l(aVar, w0Var2, p(w0Var4), iA - yn0.a.d((iA - i13) * f11), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        w0.a.l(aVar, w0Var, p(w0Var4), i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (w0Var3 != null) {
            w0.a.l(aVar, w0Var3, p(w0Var4), i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(w0.a aVar, int i11, int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, boolean z11, float f11, y yVar) {
        int iD = yn0.a.d(yVar.getTop() * f11);
        if (w0Var3 != null) {
            w0.a.l(aVar, w0Var3, 0, c.INSTANCE.i().a(w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var4 != null) {
            w0.a.l(aVar, w0Var4, i11 - w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), c.INSTANCE.i().a(w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        w0.a.l(aVar, w0Var, p(w0Var3), z11 ? c.INSTANCE.i().a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12) : iD, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (w0Var2 != null) {
            if (z11) {
                iD = c.INSTANCE.i().a(w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i12);
            }
            w0.a.l(aVar, w0Var2, p(w0Var3), iD, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(w0 w0Var) {
        if (w0Var != null) {
            return w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
        }
        return 0;
    }
}
