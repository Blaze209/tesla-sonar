package p016o2;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.z0;
import b4.g;
import bo0.n;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
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
import v1.y;
import w4.h;
import w4.t;
import wn0.p;
import wn0.q;
import y4.b;
import z3.i0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÁ\u0001\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aR\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ar\u0010.\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a¡\u0001\u0010?\u001a\u00020\u0003*\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001032\b\u00107\u001a\u0004\u0018\u0001032\b\u00108\u001a\u0004\u0018\u0001032\b\u00109\u001a\u0004\u0018\u0001032\b\u0010:\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b?\u0010@\u001a\u0087\u0001\u0010B\u001a\u00020\u0003*\u0002002\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u0010A\u001a\u0002032\b\u00106\u001a\u0004\u0018\u0001032\b\u00107\u001a\u0004\u0018\u0001032\b\u00108\u001a\u0004\u0018\u0001032\b\u00109\u001a\u0004\u0018\u0001032\b\u0010:\u001a\u0004\u0018\u0001032\u0006\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bB\u0010C\"\u001a\u0010H\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "textField", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "placeholder", "leading", "trailing", "prefix", "suffix", "", "singleLine", "", "animationProgress", "container", "supporting", "Lv1/y;", "paddingValues", "a", "(Landroidx/compose/ui/d;Lwn0/p;Lwn0/p;Lwn0/q;Lwn0/p;Lwn0/p;Lwn0/p;Lwn0/p;ZFLwn0/p;Lwn0/p;Lv1/y;Lr2/l;II)V", "", "from", "l", "(II)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "h", "(IIIIIIIJ)I", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "density", "g", "(IIIIIIIIFJFLv1/y;)I", "Lz3/w0$a;", Snapshot.WIDTH, "totalHeight", "Lz3/w0;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", IntegerTokenConverter.CONVERTER_KEY, "(Lz3/w0$a;IILz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;ZIIFF)V", "textPlaceable", "j", "(Lz3/w0$a;IILz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;Lz3/w0;ZFLv1/y;)V", "Lw4/h;", Gender.FEMALE, "getTextFieldWithLabelVerticalPadding", "()F", "TextFieldWithLabelVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f96047a = h.g(8);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f96048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<d, l, Integer, h0> f96051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96052g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96054i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96055j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f96056k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f96057l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96058m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f96059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y f96060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f96061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f96062q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d dVar, p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, q<? super d, ? super l, ? super Integer, h0> qVar, p<? super l, ? super Integer, h0> pVar3, p<? super l, ? super Integer, h0> pVar4, p<? super l, ? super Integer, h0> pVar5, p<? super l, ? super Integer, h0> pVar6, boolean z11, float f11, p<? super l, ? super Integer, h0> pVar7, p<? super l, ? super Integer, h0> pVar8, y yVar, int i11, int i12) {
            super(2);
            this.f96048c = dVar;
            this.f96049d = pVar;
            this.f96050e = pVar2;
            this.f96051f = qVar;
            this.f96052g = pVar3;
            this.f96053h = pVar4;
            this.f96054i = pVar5;
            this.f96055j = pVar6;
            this.f96056k = z11;
            this.f96057l = f11;
            this.f96058m = pVar7;
            this.f96059n = pVar8;
            this.f96060o = yVar;
            this.f96061p = i11;
            this.f96062q = i12;
        }

        public final void a(l lVar, int i11) {
            p0.a(this.f96048c, this.f96049d, this.f96050e, this.f96051f, this.f96052g, this.f96053h, this.f96054i, this.f96055j, this.f96056k, this.f96057l, this.f96058m, this.f96059n, this.f96060o, lVar, k2.a(this.f96061p | 1), k2.a(this.f96062q));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(d dVar, p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, q<? super d, ? super l, ? super Integer, h0> qVar, p<? super l, ? super Integer, h0> pVar3, p<? super l, ? super Integer, h0> pVar4, p<? super l, ? super Integer, h0> pVar5, p<? super l, ? super Integer, h0> pVar6, boolean z11, float f11, p<? super l, ? super Integer, h0> pVar7, p<? super l, ? super Integer, h0> pVar8, y yVar, l lVar, int i11, int i12) {
        int i13;
        int i14;
        y yVar2;
        int i15;
        float f12;
        p<? super l, ? super Integer, h0> pVar9;
        p<? super l, ? super Integer, h0> pVar10;
        l lVarV = lVar.v(-1830307184);
        if ((i11 & 6) == 0) {
            i13 = i11 | (lVarV.n(dVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(pVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= lVarV.K(qVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= lVarV.K(pVar3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i11) == 0) {
            i13 |= lVarV.K(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= lVarV.K(pVar5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i11) == 0) {
            i13 |= lVarV.K(pVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= lVarV.p(z11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= lVarV.q(f11) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i16 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (lVarV.K(pVar7) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= lVarV.K(pVar8) ? 32 : 16;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            yVar2 = yVar;
            i14 |= lVarV.n(yVar2) ? 256 : 128;
        } else {
            yVar2 = yVar;
        }
        int i17 = i14;
        if ((i16 & 306783379) == 306783378 && (i17 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            pVar9 = pVar;
            pVar10 = pVar8;
        } else {
            if (o.J()) {
                o.S(-1830307184, i16, i17, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z12 = ((1879048192 & i16) == 536870912) | ((234881024 & i16) == 67108864) | ((i17 & 896) == 256);
            Object objI = lVarV.I();
            if (z12 || objI == l.INSTANCE.a()) {
                objI = new q0(z11, f11, yVar2);
                lVarV.B(objI);
            }
            q0 q0Var = (q0) objI;
            t tVar = (t) lVarV.U(z0.m());
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            d dVarE = c.e(lVarV, dVar);
            g.Companion companion = g.INSTANCE;
            wn0.a<g> aVarA = companion.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, q0Var, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            pVar7.invoke(lVarV, Integer.valueOf(i17 & 14));
            lVarV.o(1341517187);
            if (pVar3 != null) {
                d dVarG = androidx.compose.ui.layout.a.b(d.INSTANCE, "Leading").g(p2.j.k());
                i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                int iA2 = j.a(lVarV, 0);
                x xVarC2 = lVarV.c();
                d dVarE2 = c.e(lVarV, dVarG);
                wn0.a<g> aVarA2 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                l lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarH, companion.c());
                d4.b(lVarA2, xVarC2, companion.e());
                p<g, Integer, h0> pVarB2 = companion.b();
                if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                d4.b(lVarA2, dVarE2, companion.d());
                i iVar = i.f4585a;
                pVar3.invoke(lVarV, Integer.valueOf((i16 >> 12) & 14));
                lVarV.g();
            }
            lVarV.l();
            lVarV.o(1341526310);
            if (pVar4 != null) {
                d dVarG2 = androidx.compose.ui.layout.a.b(d.INSTANCE, "Trailing").g(p2.j.k());
                i0 i0VarH2 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.e(), false);
                int iA3 = j.a(lVarV, 0);
                x xVarC3 = lVarV.c();
                d dVarE3 = c.e(lVarV, dVarG2);
                wn0.a<g> aVarA3 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                l lVarA3 = d4.a(lVarV);
                d4.b(lVarA3, i0VarH2, companion.c());
                d4.b(lVarA3, xVarC3, companion.e());
                p<g, Integer, h0> pVarB3 = companion.b();
                if (lVarA3.getInserting() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                d4.b(lVarA3, dVarE3, companion.d());
                i iVar2 = i.f4585a;
                pVar4.invoke(lVarV, Integer.valueOf((i16 >> 15) & 14));
                lVarV.g();
            }
            lVarV.l();
            float fG = androidx.compose.foundation.layout.t.g(yVar2, tVar);
            float f13 = androidx.compose.foundation.layout.t.f(yVar2, tVar);
            if (pVar3 != null) {
                i15 = 0;
                fG = h.g(n.e(h.g(fG - p2.j.j()), h.g(0)));
            } else {
                i15 = 0;
            }
            float fG2 = fG;
            if (pVar4 != null) {
                f13 = h.g(n.e(h.g(f13 - p2.j.j()), h.g(i15)));
            }
            lVarV.o(1341556924);
            if (pVar5 != null) {
                d dVarM = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.z(androidx.compose.foundation.layout.x.k(androidx.compose.ui.layout.a.b(d.INSTANCE, "Prefix"), p2.j.o(), BitmapDescriptorFactory.HUE_RED, 2, null), null, false, 3, null), fG2, BitmapDescriptorFactory.HUE_RED, p2.j.p(), BitmapDescriptorFactory.HUE_RED, 10, null);
                i0 i0VarH3 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
                int iA4 = j.a(lVarV, 0);
                x xVarC4 = lVarV.c();
                d dVarE4 = c.e(lVarV, dVarM);
                wn0.a<g> aVarA4 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA4);
                } else {
                    lVarV.d();
                }
                l lVarA4 = d4.a(lVarV);
                d4.b(lVarA4, i0VarH3, companion.c());
                d4.b(lVarA4, xVarC4, companion.e());
                p<g, Integer, h0> pVarB4 = companion.b();
                if (lVarA4.getInserting() || !s.f(lVarA4.I(), Integer.valueOf(iA4))) {
                    lVarA4.B(Integer.valueOf(iA4));
                    lVarA4.f(Integer.valueOf(iA4), pVarB4);
                }
                d4.b(lVarA4, dVarE4, companion.d());
                i iVar3 = i.f4585a;
                pVar5.invoke(lVarV, Integer.valueOf((i16 >> 18) & 14));
                lVarV.g();
            }
            lVarV.l();
            lVarV.o(1341568890);
            if (pVar6 != null) {
                float f14 = f13;
                d dVarM2 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.z(androidx.compose.foundation.layout.x.k(androidx.compose.ui.layout.a.b(d.INSTANCE, "Suffix"), p2.j.o(), BitmapDescriptorFactory.HUE_RED, 2, null), null, false, 3, null), p2.j.p(), BitmapDescriptorFactory.HUE_RED, f14, BitmapDescriptorFactory.HUE_RED, 10, null);
                f12 = f14;
                i0 i0VarH4 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
                int iA5 = j.a(lVarV, 0);
                x xVarC5 = lVarV.c();
                d dVarE5 = c.e(lVarV, dVarM2);
                wn0.a<g> aVarA5 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA5);
                } else {
                    lVarV.d();
                }
                l lVarA5 = d4.a(lVarV);
                d4.b(lVarA5, i0VarH4, companion.c());
                d4.b(lVarA5, xVarC5, companion.e());
                p<g, Integer, h0> pVarB5 = companion.b();
                if (lVarA5.getInserting() || !s.f(lVarA5.I(), Integer.valueOf(iA5))) {
                    lVarA5.B(Integer.valueOf(iA5));
                    lVarA5.f(Integer.valueOf(iA5), pVarB5);
                }
                d4.b(lVarA5, dVarE5, companion.d());
                i iVar4 = i.f4585a;
                pVar6.invoke(lVarV, Integer.valueOf((i16 >> 21) & 14));
                lVarV.g();
            } else {
                f12 = f13;
            }
            lVarV.l();
            lVarV.o(1341581092);
            if (pVar2 != null) {
                d dVarM3 = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.z(androidx.compose.foundation.layout.x.k(androidx.compose.ui.layout.a.b(d.INSTANCE, "Label"), w4.i.c(p2.j.o(), p2.j.m(), f11), BitmapDescriptorFactory.HUE_RED, 2, null), null, false, 3, null), fG2, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, 10, null);
                i0 i0VarH5 = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
                int iA6 = j.a(lVarV, 0);
                x xVarC6 = lVarV.c();
                d dVarE6 = c.e(lVarV, dVarM3);
                wn0.a<g> aVarA6 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA6);
                } else {
                    lVarV.d();
                }
                l lVarA6 = d4.a(lVarV);
                d4.b(lVarA6, i0VarH5, companion.c());
                d4.b(lVarA6, xVarC6, companion.e());
                p<g, Integer, h0> pVarB6 = companion.b();
                if (lVarA6.getInserting() || !s.f(lVarA6.I(), Integer.valueOf(iA6))) {
                    lVarA6.B(Integer.valueOf(iA6));
                    lVarA6.f(Integer.valueOf(iA6), pVarB6);
                }
                d4.b(lVarA6, dVarE6, companion.d());
                i iVar5 = i.f4585a;
                pVar2.invoke(lVarV, Integer.valueOf((i16 >> 6) & 14));
                lVarV.g();
            }
            lVarV.l();
            d.Companion companion2 = d.INSTANCE;
            d dVarZ = androidx.compose.foundation.layout.x.z(androidx.compose.foundation.layout.x.k(companion2, p2.j.o(), BitmapDescriptorFactory.HUE_RED, 2, null), null, false, 3, null);
            if (pVar5 != null) {
                fG2 = h.g(0);
            }
            d dVarM4 = androidx.compose.foundation.layout.t.m(dVarZ, fG2, BitmapDescriptorFactory.HUE_RED, pVar6 == null ? f12 : h.g(0), BitmapDescriptorFactory.HUE_RED, 10, null);
            lVarV.o(1341611627);
            if (qVar != null) {
                qVar.invoke(androidx.compose.ui.layout.a.b(companion2, "Hint").g(dVarM4), lVarV, Integer.valueOf((i16 >> 6) & 112));
            }
            lVarV.l();
            d dVarG3 = androidx.compose.ui.layout.a.b(companion2, "TextField").g(dVarM4);
            d3.c.Companion companion3 = d3.c.INSTANCE;
            i0 i0VarH6 = androidx.compose.foundation.layout.g.h(companion3.o(), true);
            int iA7 = j.a(lVarV, 0);
            x xVarC7 = lVarV.c();
            d dVarE7 = c.e(lVarV, dVarG3);
            wn0.a<g> aVarA7 = companion.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA7);
            } else {
                lVarV.d();
            }
            l lVarA7 = d4.a(lVarV);
            d4.b(lVarA7, i0VarH6, companion.c());
            d4.b(lVarA7, xVarC7, companion.e());
            p<g, Integer, h0> pVarB7 = companion.b();
            if (lVarA7.getInserting() || !s.f(lVarA7.I(), Integer.valueOf(iA7))) {
                lVarA7.B(Integer.valueOf(iA7));
                lVarA7.f(Integer.valueOf(iA7), pVarB7);
            }
            d4.b(lVarA7, dVarE7, companion.d());
            i iVar6 = i.f4585a;
            pVar9 = pVar;
            pVar9.invoke(lVarV, Integer.valueOf((i16 >> 3) & 14));
            lVarV.g();
            lVarV.o(1341622624);
            if (pVar8 != null) {
                d dVarH = androidx.compose.foundation.layout.t.h(androidx.compose.foundation.layout.x.z(androidx.compose.foundation.layout.x.k(androidx.compose.ui.layout.a.b(companion2, "Supporting"), p2.j.n(), BitmapDescriptorFactory.HUE_RED, 2, null), null, false, 3, null), o0.b(o0.f96037a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15, null));
                i0 i0VarH7 = androidx.compose.foundation.layout.g.h(companion3.o(), false);
                int iA8 = j.a(lVarV, 0);
                x xVarC8 = lVarV.c();
                d dVarE8 = c.e(lVarV, dVarH);
                wn0.a<g> aVarA8 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA8);
                } else {
                    lVarV.d();
                }
                l lVarA8 = d4.a(lVarV);
                d4.b(lVarA8, i0VarH7, companion.c());
                d4.b(lVarA8, xVarC8, companion.e());
                p<g, Integer, h0> pVarB8 = companion.b();
                if (lVarA8.getInserting() || !s.f(lVarA8.I(), Integer.valueOf(iA8))) {
                    lVarA8.B(Integer.valueOf(iA8));
                    lVarA8.f(Integer.valueOf(iA8), pVarB8);
                }
                d4.b(lVarA8, dVarE8, companion.d());
                pVar10 = pVar8;
                pVar10.invoke(lVarV, Integer.valueOf((i17 >> 3) & 14));
                lVarV.g();
            } else {
                pVar10 = pVar8;
            }
            lVarV.l();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(dVar, pVar9, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z11, f11, pVar7, pVar10, yVar2, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f11, long j11, float f12, y yVar) {
        boolean z11 = i12 > 0;
        float fG = h.g(yVar.getTop() + yVar.getBottom()) * f12;
        if (z11) {
            fG = b.b(h.g(p2.j.r() * 2) * f12, fG, f11);
        }
        return Math.max(w4.b.m(j11), Math.max(i13, Math.max(i14, yn0.a.d(fG + b.c(0, i12, f11) + mn0.a.h(i11, i17, i15, i16, b.c(i12, 0, f11))))) + i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11) {
        int i18 = i13 + i14;
        return Math.max(i11 + Math.max(i15 + i18, Math.max(i17 + i18, i16)) + i12, w4.b.n(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(w0.a aVar, int i11, int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, boolean z11, int i13, int i14, float f11, float f12) {
        w0.a.j(aVar, w0Var8, w4.n.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, 2, null);
        int iT = i12 - p2.j.t(w0Var9);
        if (w0Var4 != null) {
            w0.a.l(aVar, w0Var4, 0, d3.c.INSTANCE.i().a(w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iT), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var2 != null) {
            int iA = z11 ? d3.c.INSTANCE.i().a(w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iT) : yn0.a.d(p2.j.r() * f12);
            w0.a.l(aVar, w0Var2, p2.j.v(w0Var4), iA - yn0.a.d((iA - i13) * f11), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var6 != null) {
            w0.a.l(aVar, w0Var6, p2.j.v(w0Var4), i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        int iV = p2.j.v(w0Var4) + p2.j.v(w0Var6);
        w0.a.l(aVar, w0Var, iV, i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (w0Var3 != null) {
            w0.a.l(aVar, w0Var3, iV, i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var7 != null) {
            w0.a.l(aVar, w0Var7, (i11 - p2.j.v(w0Var5)) - w0Var7.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), i14, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var5 != null) {
            w0.a.l(aVar, w0Var5, i11 - w0Var5.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), d3.c.INSTANCE.i().a(w0Var5.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iT), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var9 != null) {
            w0.a.l(aVar, w0Var9, 0, iT, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(w0.a aVar, int i11, int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, boolean z11, float f11, y yVar) {
        w0.a.j(aVar, w0Var7, w4.n.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, 2, null);
        int iT = i12 - p2.j.t(w0Var8);
        int iD = yn0.a.d(yVar.getTop() * f11);
        if (w0Var3 != null) {
            w0.a.l(aVar, w0Var3, 0, d3.c.INSTANCE.i().a(w0Var3.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iT), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var5 != null) {
            w0.a.l(aVar, w0Var5, p2.j.v(w0Var3), k(z11, iT, iD, w0Var5), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        int iV = p2.j.v(w0Var5) + p2.j.v(w0Var3);
        w0.a.l(aVar, w0Var, iV, k(z11, iT, iD, w0Var), BitmapDescriptorFactory.HUE_RED, 4, null);
        if (w0Var2 != null) {
            w0.a.l(aVar, w0Var2, iV, k(z11, iT, iD, w0Var2), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var6 != null) {
            w0.a.l(aVar, w0Var6, (i11 - p2.j.v(w0Var4)) - w0Var6.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), k(z11, iT, iD, w0Var6), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var4 != null) {
            w0.a.l(aVar, w0Var4, i11 - w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), d3.c.INSTANCE.i().a(w0Var4.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), iT), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        if (w0Var8 != null) {
            w0.a.l(aVar, w0Var8, 0, iT, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    private static final int k(boolean z11, int i11, int i12, w0 w0Var) {
        return z11 ? d3.c.INSTANCE.i().a(w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), i11) : i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i11, int i12) {
        return i11 == Integer.MAX_VALUE ? i11 : i11 - i12;
    }
}
