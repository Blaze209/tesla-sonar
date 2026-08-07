package p009i2;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.d;
import b4.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.List;
import java.util.NoSuchElementException;
import jn0.h0;
import jn0.x;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.o;
import p020r2.w2;
import v1.c;
import w4.h;
import w4.w;
import wn0.l;
import wn0.p;
import wn0.q;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: renamed from: i2.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u001a\u0010\u0018\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u001a\u0010\u001a\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Lv1/c;", "Ljn0/h0;", "badge", "Landroidx/compose/ui/d;", "modifier", "content", "a", "(Lwn0/q;Landroidx/compose/ui/d;Lwn0/q;Lr2/l;II)V", "Lw4/h;", Gender.FEMALE, "c", "()F", "BadgeRadius", "b", "getBadgeWithContentRadius", "BadgeWithContentRadius", "Lw4/v;", "J", "BadgeContentFontSize", DateTokenConverter.CONVERTER_KEY, "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalPadding", "e", "BadgeWithContentHorizontalOffset", "f", "BadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74421a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f74424d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f74426f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f74422b = h.g(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f74423c = w.h(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f74425e = h.g(-h.g(6));

    /* JADX INFO: renamed from: i2.h$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74427a = new a();

        /* JADX INFO: renamed from: i2.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C1556a extends u implements l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f74428c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k0 f74429d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ w0 f74430e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1556a(w0 w0Var, k0 k0Var, w0 w0Var2) {
                super(1);
                this.f74428c = w0Var;
                this.f74429d = k0Var;
                this.f74430e = w0Var2;
            }

            public final void a(w0.a aVar) {
                float fD = this.f74428c.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() > this.f74429d.i1(Function1.c()) * 2 ? Function1.d() : Function1.b();
                w0.a.l(aVar, this.f74430e, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                w0.a.l(aVar, this.f74428c, this.f74430e.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() + this.f74429d.i1(fD), (-this.f74428c.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) / 2, BitmapDescriptorFactory.HUE_RED, 4, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        a() {
        }

        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                z3.h0 h0Var = list.get(i11);
                if (s.f(androidx.compose.ui.layout.a.a(h0Var), "badge")) {
                    w0 w0VarX0 = h0Var.x0(w4.b.d(j11, 0, 0, 0, 0, 11, null));
                    int size2 = list.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        z3.h0 h0Var2 = list.get(i12);
                        if (s.f(androidx.compose.ui.layout.a.a(h0Var2), "anchor")) {
                            w0 w0VarX1 = h0Var2.x0(j11);
                            return k0Var.b1(w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), v0.m(x.a(z3.b.a(), Integer.valueOf(w0VarX1.g0(z3.b.a()))), x.a(z3.b.b(), Integer.valueOf(w0VarX1.g0(z3.b.b())))), new C1556a(w0VarX0, k0Var, w0VarX1));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX INFO: renamed from: i2.h$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q<c, p020r2.l, Integer, h0> f74431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f74432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<c, p020r2.l, Integer, h0> f74433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f74434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f74435g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super c, ? super p020r2.l, ? super Integer, h0> qVar, d dVar, q<? super c, ? super p020r2.l, ? super Integer, h0> qVar2, int i11, int i12) {
            super(2);
            this.f74431c = qVar;
            this.f74432d = dVar;
            this.f74433e = qVar2;
            this.f74434f = i11;
            this.f74435g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function1.a(this.f74431c, this.f74432d, this.f74433e, lVar, k2.a(this.f74434f | 1), this.f74435g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    static {
        float f11 = 4;
        f74421a = h.g(f11);
        f74424d = h.g(f11);
        f74426f = h.g(-h.g(f11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void a(q<? super c, ? super p020r2.l, ? super Integer, h0> qVar, d dVar, q<? super c, ? super p020r2.l, ? super Integer, h0> qVar2, p020r2.l lVar, int i11, int i12) {
        int i13;
        d dVar2;
        int i14;
        d dVar3;
        int iA;
        wn0.a<g> aVarA;
        p020r2.l lVarA;
        p<g, Integer, h0> pVarB;
        int iA2;
        wn0.a<g> aVarA2;
        p020r2.l lVarA2;
        p<g, Integer, h0> pVarB2;
        int iA3;
        wn0.a<g> aVarA3;
        p020r2.l lVarA3;
        p<g, Integer, h0> pVarB3;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(859805272);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(qVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(qVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i13 & 147) == 146 || !lVarV.b()) {
                if (i15 != 0) {
                    dVar3 = d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(859805272, i13, -1, "androidx.compose.material.BadgedBox (Badge.kt:63)");
                }
                a aVar = a.f74427a;
                iA = j.a(lVarV, 0);
                p020r2.x xVarC = lVarV.c();
                d dVarE = androidx.compose.ui.c.e(lVarV, dVar3);
                g.Companion companion = g.INSTANCE;
                aVarA = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, aVar, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                pVarB = companion.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE, companion.d());
                d.Companion companion2 = d.INSTANCE;
                d dVarB = androidx.compose.ui.layout.a.b(companion2, "anchor");
                d3.c.Companion companion3 = d3.c.INSTANCE;
                int i16 = ((i13 << 3) & 7168) | 54;
                i0 i0VarH = androidx.compose.foundation.layout.g.h(companion3.e(), false);
                iA2 = j.a(lVarV, 0);
                p020r2.x xVarC2 = lVarV.c();
                d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarB);
                aVarA2 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarH, companion.c());
                d4.b(lVarA2, xVarC2, companion.e());
                pVarB2 = companion.b();
                if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                d4.b(lVarA2, dVarE2, companion.d());
                i iVar = i.f4585a;
                qVar2.invoke(iVar, lVarV, Integer.valueOf(((i16 >> 6) & 112) | 6));
                lVarV.g();
                d dVarB2 = androidx.compose.ui.layout.a.b(companion2, "badge");
                int i17 = ((i13 << 9) & 7168) | 6;
                i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion3.o(), false);
                iA3 = j.a(lVarV, 0);
                p020r2.x xVarC3 = lVarV.c();
                d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarB2);
                aVarA3 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                lVarA3 = d4.a(lVarV);
                d4.b(lVarA3, i0VarH2, companion.c());
                d4.b(lVarA3, xVarC3, companion.e());
                pVarB3 = companion.b();
                if (lVarA3.getInserting() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                d4.b(lVarA3, dVarE3, companion.d());
                qVar.invoke(iVar, lVarV, Integer.valueOf(((i17 >> 6) & 112) | 6));
                lVarV.g();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                dVar3 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(qVar, dVar3, qVar2, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(qVar2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 147) == 146) {
            if (i15 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(859805272, i13, -1, "androidx.compose.material.BadgedBox (Badge.kt:63)");
            }
            a aVar2 = a.f74427a;
            iA = j.a(lVarV, 0);
            p020r2.x xVarC4 = lVarV.c();
            d dVarE4 = androidx.compose.ui.c.e(lVarV, dVar3);
            g.Companion companion4 = g.INSTANCE;
            aVarA = companion4.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, aVar2, companion4.c());
            d4.b(lVarA, xVarC4, companion4.e());
            pVarB = companion4.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE4, companion4.d());
            d.Companion companion5 = d.INSTANCE;
            d dVarB3 = androidx.compose.ui.layout.a.b(companion5, "anchor");
            d3.c.Companion companion6 = d3.c.INSTANCE;
            int i18 = ((i13 << 3) & 7168) | 54;
            i0 i0VarH3 = androidx.compose.foundation.layout.g.h(companion6.e(), false);
            iA2 = j.a(lVarV, 0);
            p020r2.x xVarC5 = lVarV.c();
            d dVarE5 = androidx.compose.ui.c.e(lVarV, dVarB3);
            aVarA2 = companion4.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarH3, companion4.c());
            d4.b(lVarA2, xVarC5, companion4.e());
            pVarB2 = companion4.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            d4.b(lVarA2, dVarE5, companion4.d());
            i iVar2 = i.f4585a;
            qVar2.invoke(iVar2, lVarV, Integer.valueOf(((i18 >> 6) & 112) | 6));
            lVarV.g();
            d dVarB4 = androidx.compose.ui.layout.a.b(companion5, "badge");
            int i19 = ((i13 << 9) & 7168) | 6;
            i0 i0VarH4 = androidx.compose.foundation.layout.g.h(companion6.o(), false);
            iA3 = j.a(lVarV, 0);
            p020r2.x xVarC6 = lVarV.c();
            d dVarE6 = androidx.compose.ui.c.e(lVarV, dVarB4);
            aVarA3 = companion4.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            lVarA3 = d4.a(lVarV);
            d4.b(lVarA3, i0VarH4, companion4.c());
            d4.b(lVarA3, xVarC6, companion4.e());
            pVarB3 = companion4.b();
            if (lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            d4.b(lVarA3, dVarE6, companion4.d());
            qVar.invoke(iVar2, lVarV, Integer.valueOf(((i19 >> 6) & 112) | 6));
            lVarV.g();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        } else {
            if (i15 != 0) {
                dVar3 = d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(859805272, i13, -1, "androidx.compose.material.BadgedBox (Badge.kt:63)");
            }
            a aVar3 = a.f74427a;
            iA = j.a(lVarV, 0);
            p020r2.x xVarC7 = lVarV.c();
            d dVarE7 = androidx.compose.ui.c.e(lVarV, dVar3);
            g.Companion companion7 = g.INSTANCE;
            aVarA = companion7.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, aVar3, companion7.c());
            d4.b(lVarA, xVarC7, companion7.e());
            pVarB = companion7.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE7, companion7.d());
            d.Companion companion8 = d.INSTANCE;
            d dVarB5 = androidx.compose.ui.layout.a.b(companion8, "anchor");
            d3.c.Companion companion9 = d3.c.INSTANCE;
            int i110 = ((i13 << 3) & 7168) | 54;
            i0 i0VarH5 = androidx.compose.foundation.layout.g.h(companion9.e(), false);
            iA2 = j.a(lVarV, 0);
            p020r2.x xVarC8 = lVarV.c();
            d dVarE8 = androidx.compose.ui.c.e(lVarV, dVarB5);
            aVarA2 = companion7.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarH5, companion7.c());
            d4.b(lVarA2, xVarC8, companion7.e());
            pVarB2 = companion7.b();
            if (lVarA2.getInserting()) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            } else {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            d4.b(lVarA2, dVarE8, companion7.d());
            i iVar3 = i.f4585a;
            qVar2.invoke(iVar3, lVarV, Integer.valueOf(((i110 >> 6) & 112) | 6));
            lVarV.g();
            d dVarB6 = androidx.compose.ui.layout.a.b(companion8, "badge");
            int i111 = ((i13 << 9) & 7168) | 6;
            i0 i0VarH6 = androidx.compose.foundation.layout.g.h(companion9.o(), false);
            iA3 = j.a(lVarV, 0);
            p020r2.x xVarC9 = lVarV.c();
            d dVarE9 = androidx.compose.ui.c.e(lVarV, dVarB6);
            aVarA3 = companion7.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            lVarA3 = d4.a(lVarV);
            d4.b(lVarA3, i0VarH6, companion7.c());
            d4.b(lVarA3, xVarC9, companion7.e());
            pVarB3 = companion7.b();
            if (lVarA3.getInserting()) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            } else {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            d4.b(lVarA3, dVarE9, companion7.d());
            qVar.invoke(iVar3, lVarV, Integer.valueOf(((i111 >> 6) & 112) | 6));
            lVarV.g();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(qVar, dVar3, qVar2, i11, i12));
        }
    }

    public static final float b() {
        return f74426f;
    }

    public static final float c() {
        return f74421a;
    }

    public static final float d() {
        return f74425e;
    }
}
