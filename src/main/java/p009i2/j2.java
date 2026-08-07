package p009i2;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.x;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jn0.h0;
import k3.g4;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.h2;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import v1.g0;
import wn0.p;
import wn0.q;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001an\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c\"\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "action", "", "actionOnNewLine", "Lk3/g4;", "shape", "Lk3/p1;", "backgroundColor", "contentColor", "Lw4/h;", "elevation", "content", "c", "(Landroidx/compose/ui/d;Lwn0/p;ZLk3/g4;JJFLwn0/p;Lr2/l;II)V", "Li2/e2;", "snackbarData", "actionColor", DateTokenConverter.CONVERTER_KEY, "(Li2/e2;Landroidx/compose/ui/d;ZLk3/g4;JJJFLr2/l;II)V", "e", "(Lwn0/p;Lr2/l;I)V", "text", "a", "(Lwn0/p;Lwn0/p;Lr2/l;I)V", "b", Gender.FEMALE, "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "f", "TextEndExtraSpacing", "g", "LongButtonVerticalOffset", "h", "SnackbarMinHeightOneLine", IntegerTokenConverter.CONVERTER_KEY, "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f74529c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f74532f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f74527a = w4.h.g(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f74528b = w4.h.g(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f74530d = w4.h.g(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f74531e = w4.h.g(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f74533g = w4.h.g(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f74534h = w4.h.g(48);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f74535i = w4.h.g(68);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f74538e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, int i11) {
            super(2);
            this.f74536c = pVar;
            this.f74537d = pVar2;
            this.f74538e = i11;
        }

        public final void a(l lVar, int i11) {
            j2.a(this.f74536c, this.f74537d, lVar, k2.a(this.f74538e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class b implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f74539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f74540b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f74541c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f74542d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ w0 f74543e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f74544f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f74545g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w0 w0Var, int i11, w0 w0Var2, int i12, int i13) {
                super(1);
                this.f74541c = w0Var;
                this.f74542d = i11;
                this.f74543e = w0Var2;
                this.f74544f = i12;
                this.f74545g = i13;
            }

            public final void a(w0.a aVar) {
                w0.a.l(aVar, this.f74541c, 0, this.f74542d, BitmapDescriptorFactory.HUE_RED, 4, null);
                w0.a.l(aVar, this.f74543e, this.f74544f, this.f74545g, BitmapDescriptorFactory.HUE_RED, 4, null);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        b(String str, String str2) {
            this.f74539a = str;
            this.f74540b = str2;
        }

        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            int iI1;
            int iMax;
            String str = this.f74539a;
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                z3.h0 h0Var = list.get(i12);
                if (s.f(androidx.compose.ui.layout.a.a(h0Var), str)) {
                    long j12 = j11;
                    w0 w0VarX0 = h0Var.x0(j12);
                    int iF = n.f((w4.b.l(j12) - w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String()) - k0Var.i1(j2.f74532f), w4.b.n(j12));
                    String str2 = this.f74540b;
                    int size2 = list.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        z3.h0 h0Var2 = list.get(i13);
                        if (s.f(androidx.compose.ui.layout.a.a(h0Var2), str2)) {
                            w0 w0VarX1 = h0Var2.x0(w4.b.d(j12, 0, iF, 0, 0, 9, null));
                            int iG0 = w0VarX1.g0(z3.b.a());
                            int iG1 = w0VarX1.g0(z3.b.b());
                            boolean z11 = true;
                            boolean z12 = (iG0 == Integer.MIN_VALUE || iG1 == Integer.MIN_VALUE) ? false : true;
                            if (iG0 != iG1 && z12) {
                                z11 = false;
                            }
                            int iL = w4.b.l(j11) - w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                            if (z11) {
                                iMax = Math.max(k0Var.i1(j2.f74534h), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
                                iI1 = (iMax - w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) / 2;
                                int iG2 = w0VarX0.g0(z3.b.a());
                                if (iG2 != Integer.MIN_VALUE) {
                                    i11 = (iG0 + iI1) - iG2;
                                }
                            } else {
                                iI1 = k0Var.i1(j2.f74527a) - iG0;
                                iMax = Math.max(k0Var.i1(j2.f74535i), w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iI1);
                                i11 = (iMax - w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) / 2;
                            }
                            return k0.N1(k0Var, w4.b.l(j11), iMax, null, new a(w0VarX1, iI1, w0VarX0, iL, i11), 4, null);
                        }
                        i13++;
                        k0Var = k0Var;
                        j12 = j11;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f74548e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, int i11) {
            super(2);
            this.f74546c = pVar;
            this.f74547d = pVar2;
            this.f74548e = i11;
        }

        public final void a(l lVar, int i11) {
            j2.b(this.f74546c, this.f74547d, lVar, k2.a(this.f74548e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74551e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<l, Integer, h0> f74552c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p<l, Integer, h0> f74553d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f74554e;

            /* JADX INFO: renamed from: i2.j2$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
            static final class C1558a extends u implements p<l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p<l, Integer, h0> f74555c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ p<l, Integer, h0> f74556d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f74557e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1558a(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, boolean z11) {
                    super(2);
                    this.f74555c = pVar;
                    this.f74556d = pVar2;
                    this.f74557e = z11;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(225114541, i11, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:103)");
                    }
                    if (this.f74555c == null) {
                        lVar.o(1850967489);
                        j2.e(this.f74556d, lVar, 0);
                        lVar.l();
                    } else if (this.f74557e) {
                        lVar.o(1850969582);
                        j2.a(this.f74556d, this.f74555c, lVar, 0);
                        lVar.l();
                    } else {
                        lVar.o(1850971719);
                        j2.b(this.f74556d, this.f74555c, lVar, 0);
                        lVar.l();
                    }
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, boolean z11) {
                super(2);
                this.f74552c = pVar;
                this.f74553d = pVar2;
                this.f74554e = z11;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(1939362236, i11, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:101)");
                }
                v2.a(j1.f74525a.c(lVar, 6).getBody2(), z2.c.e(225114541, true, new C1558a(this.f74552c, this.f74553d, this.f74554e), lVar, 54), lVar, 48);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, boolean z11) {
            super(2);
            this.f74549c = pVar;
            this.f74550d = pVar2;
            this.f74551e = z11;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-2084221700, i11, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:100)");
            }
            w.a(y.a().d(Float.valueOf(x.f75438a.c(lVar, 6))), z2.c.e(1939362236, true, new a(this.f74549c, this.f74550d, this.f74551e), lVar, 54), lVar, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f74561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f74562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f74563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f74564i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f74566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f74567l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.d dVar, p<? super l, ? super Integer, h0> pVar, boolean z11, g4 g4Var, long j11, long j12, float f11, p<? super l, ? super Integer, h0> pVar2, int i11, int i12) {
            super(2);
            this.f74558c = dVar;
            this.f74559d = pVar;
            this.f74560e = z11;
            this.f74561f = g4Var;
            this.f74562g = j11;
            this.f74563h = j12;
            this.f74564i = f11;
            this.f74565j = pVar2;
            this.f74566k = i11;
            this.f74567l = i12;
        }

        public final void a(l lVar, int i11) {
            j2.c(this.f74558c, this.f74559d, this.f74560e, this.f74561f, this.f74562g, this.f74563h, this.f74564i, this.f74565j, lVar, k2.a(this.f74566k | 1), this.f74567l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2 f74568c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(e2 e2Var) {
            super(2);
            this.f74568c = e2Var;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-261845785, i11, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:178)");
            }
            v2.b(this.f74568c.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2 f74569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4 f74572f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f74573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f74574h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f74575i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f74576j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f74577k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f74578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e2 e2Var, androidx.compose.ui.d dVar, boolean z11, g4 g4Var, long j11, long j12, long j13, float f11, int i11, int i12) {
            super(2);
            this.f74569c = e2Var;
            this.f74570d = dVar;
            this.f74571e = z11;
            this.f74572f = g4Var;
            this.f74573g = j11;
            this.f74574h = j12;
            this.f74575i = j13;
            this.f74576j = f11;
            this.f74577k = i11;
            this.f74578l = i12;
        }

        public final void a(l lVar, int i11) {
            j2.d(this.f74569c, this.f74570d, this.f74571e, this.f74572f, this.f74573g, this.f74574h, this.f74575i, this.f74576j, lVar, k2.a(this.f74577k | 1), this.f74578l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f74579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e2 f74580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f74581e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e2 f74582c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e2 e2Var) {
                super(0);
                this.f74582c = e2Var;
            }

            public final void b() {
                this.f74582c.a();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements q<g0, l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f74583c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f74583c = str;
            }

            public final void a(g0 g0Var, l lVar, int i11) {
                if ((i11 & 17) == 16 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-929149933, i11, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:170)");
                }
                v2.b(this.f74583c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var, l lVar, Integer num) {
                a(g0Var, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j11, e2 e2Var, String str) {
            super(2);
            this.f74579c = j11;
            this.f74580d = e2Var;
            this.f74581e = str;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1843479216, i11, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:167)");
            }
            p009i2.i iVarG = p009i2.j.f74513a.g(0L, this.f74579c, 0L, lVar, 3072, 5);
            boolean zK = lVar.K(this.f74580d);
            e2 e2Var = this.f74580d;
            Object objI = lVar.I();
            if (zK || objI == l.INSTANCE.a()) {
                objI = new a(e2Var);
                lVar.B(objI);
            }
            C4672l.c((wn0.a) objI, null, false, null, null, null, null, iVarG, null, z2.c.e(-929149933, true, new b(this.f74581e), lVar, 54), lVar, 805306368, 382);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class i implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f74584a = new i();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList<w0> f74585c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f74586d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList<w0> arrayList, int i11) {
                super(1);
                this.f74585c = arrayList;
                this.f74586d = i11;
            }

            public final void a(w0.a aVar) {
                ArrayList<w0> arrayList = this.f74585c;
                int i11 = this.f74586d;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    w0 w0Var = arrayList.get(i12);
                    w0.a.l(aVar, w0Var, 0, (i11 - w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) / 2, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        i() {
        }

        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z11 = false;
            int iG0 = Integer.MIN_VALUE;
            int iG1 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                w0 w0VarX0 = list.get(i11).x0(j11);
                arrayList.add(w0VarX0);
                if (w0VarX0.g0(z3.b.a()) != Integer.MIN_VALUE && (iG0 == Integer.MIN_VALUE || w0VarX0.g0(z3.b.a()) < iG0)) {
                    iG0 = w0VarX0.g0(z3.b.a());
                }
                if (w0VarX0.g0(z3.b.b()) != Integer.MIN_VALUE && (iG1 == Integer.MIN_VALUE || w0VarX0.g0(z3.b.b()) > iG1)) {
                    iG1 = w0VarX0.g0(z3.b.b());
                }
                iMax = Math.max(iMax, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
            }
            if (iG0 != Integer.MIN_VALUE && iG1 != Integer.MIN_VALUE) {
                z11 = true;
            }
            int iMax2 = Math.max(k0Var.i1((iG0 == iG1 || !z11) ? j2.f74534h : j2.f74535i), iMax);
            return k0.N1(k0Var, w4.b.l(j11), iMax2, null, new a(arrayList, iMax2), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f74587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f74588d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(p<? super l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f74587c = pVar;
            this.f74588d = i11;
        }

        public final void a(l lVar, int i11) {
            j2.e(this.f74587c, lVar, k2.a(this.f74588d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    static {
        float f11 = 8;
        f74529c = w4.h.g(f11);
        f74532f = w4.h.g(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(-1229075900);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-1229075900, i12, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:293)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH = x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            float f11 = f74528b;
            float f12 = f74529c;
            androidx.compose.ui.d dVarM = t.m(dVarH, f11, BitmapDescriptorFactory.HUE_RED, f12, f74530d, 2, null);
            v1.b.m mVarG = v1.b.f117444a.g();
            d3.c.Companion companion2 = d3.c.INSTANCE;
            i0 i0VarA = v1.g.a(mVarG, companion2.k(), lVarV, 0);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarM);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarA, companion3.c());
            d4.b(lVarA, xVarC, companion3.e());
            p<b4.g, Integer, h0> pVarB = companion3.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion3.d());
            v1.j jVar = v1.j.f117505a;
            androidx.compose.ui.d dVarM2 = t.m(androidx.compose.foundation.layout.a.g(companion, f74527a, f74533g), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f12, BitmapDescriptorFactory.HUE_RED, 11, null);
            i0 i0VarH = androidx.compose.foundation.layout.g.h(companion2.o(), false);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarM2);
            wn0.a<b4.g> aVarA2 = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarH, companion3.c());
            d4.b(lVarA2, xVarC2, companion3.e());
            p<b4.g, Integer, h0> pVarB2 = companion3.b();
            if (lVarA2.u() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            d4.b(lVarA2, dVarE2, companion3.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVarV, Integer.valueOf(i12 & 14));
            lVarV.g();
            androidx.compose.ui.d dVarC = jVar.c(companion, companion2.j());
            i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion2.o(), false);
            int iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarC);
            wn0.a<b4.g> aVarA3 = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            l lVarA3 = d4.a(lVarV);
            d4.b(lVarA3, i0VarH2, companion3.c());
            d4.b(lVarA3, xVarC3, companion3.e());
            p<b4.g, Integer, h0> pVarB3 = companion3.b();
            if (lVarA3.u() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            d4.b(lVarA3, dVarE3, companion3.d());
            pVar2.invoke(lVarV, Integer.valueOf((i12 >> 3) & 14));
            lVarV.g();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(pVar, pVar2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p<? super l, ? super Integer, h0> pVar, p<? super l, ? super Integer, h0> pVar2, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(-534813202);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-534813202, i12, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:314)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarM = t.m(companion, f74528b, BitmapDescriptorFactory.HUE_RED, f74529c, BitmapDescriptorFactory.HUE_RED, 10, null);
            Object objI = lVarV.I();
            if (objI == l.INSTANCE.a()) {
                objI = new b("action", "text");
                lVarV.B(objI);
            }
            i0 i0Var = (i0) objI;
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarM);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0Var, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.ui.d dVarK = t.k(androidx.compose.ui.layout.a.b(companion, "text"), BitmapDescriptorFactory.HUE_RED, f74531e, 1, null);
            d3.c.Companion companion3 = d3.c.INSTANCE;
            i0 i0VarH = androidx.compose.foundation.layout.g.h(companion3.o(), false);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarK);
            wn0.a<b4.g> aVarA2 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarH, companion2.c());
            d4.b(lVarA2, xVarC2, companion2.e());
            p<b4.g, Integer, h0> pVarB2 = companion2.b();
            if (lVarA2.u() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            d4.b(lVarA2, dVarE2, companion2.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVarV, Integer.valueOf(i12 & 14));
            lVarV.g();
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(companion, "action");
            i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion3.o(), false);
            int iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarB);
            wn0.a<b4.g> aVarA3 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            l lVarA3 = d4.a(lVarV);
            d4.b(lVarA3, i0VarH2, companion2.c());
            d4.b(lVarA3, xVarC3, companion2.e());
            p<b4.g, Integer, h0> pVarB3 = companion2.b();
            if (lVarA3.u() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            d4.b(lVarA3, dVarE3, companion2.d());
            pVar2.invoke(lVarV, Integer.valueOf((i12 >> 3) & 14));
            lVarV.g();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(pVar, pVar2, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:123:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    public static final void c(androidx.compose.ui.d dVar, p<? super l, ? super Integer, h0> pVar, boolean z11, g4 g4Var, long j11, long j12, float f11, p<? super l, ? super Integer, h0> pVar2, l lVar, int i11, int i12) {
        int i13;
        p<? super l, ? super Integer, h0> pVar3;
        int i14;
        boolean z12;
        int i15;
        g4 g4Var2;
        long jA;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.ui.d dVar2;
        p<? super l, ? super Integer, h0> pVar4;
        boolean z13;
        g4 small;
        long jN;
        long j13;
        float fG;
        g4 g4Var3;
        long j14;
        int i21;
        l lVar2;
        p<? super l, ? super Integer, h0> pVar5;
        boolean z14;
        androidx.compose.ui.d dVar3;
        g4 g4Var4;
        long j15;
        long j16;
        float f12;
        w2 w2VarX;
        int i22;
        int i23;
        l lVarV = lVar.v(-558258760);
        int i24 = i12 & 1;
        if (i24 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i25 = i12 & 2;
        if (i25 == 0) {
            if ((i11 & 48) == 0) {
                pVar3 = pVar;
                i13 |= lVarV.K(pVar3) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        g4Var2 = g4Var;
                        int i26 = lVarV.n(g4Var2) ? 2048 : 1024;
                        i13 |= i26;
                    } else {
                        g4Var2 = g4Var;
                    }
                    i13 |= i26;
                } else {
                    g4Var2 = g4Var;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jA = j11;
                        if (lVarV.s(jA)) {
                            i23 = 16384;
                        }
                        i13 |= i23;
                    } else {
                        jA = j11;
                    }
                    i23 = PKIFailureInfo.certRevoked;
                    i13 |= i23;
                } else {
                    jA = j11;
                }
                if ((196608 & i11) != 0) {
                    if ((i12 & 32) == 0 || !lVarV.s(j12)) {
                        i22 = 65536;
                    } else {
                        i22 = 131072;
                    }
                    i13 |= i22;
                }
                i16 = i12 & 64;
                i17 = 1572864;
                if (i16 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (lVarV.q(f11)) {
                        i18 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.K(pVar2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((4793491 & i13) == 4793490 || !lVarV.b()) {
                    lVarV.L();
                    if ((i11 & 1) != 0 || lVarV.k()) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i25 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar3;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if ((i12 & 8) != 0) {
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                            i13 &= -7169;
                        } else {
                            small = g4Var2;
                        }
                        if ((i12 & 16) != 0) {
                            jA = f2.f74340a.a(lVarV, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i13 = (-458753) & i13;
                        } else {
                            jN = j12;
                        }
                        if (i16 != 0) {
                            j13 = jA;
                            fG = w4.h.g(6);
                        } else {
                            j13 = jA;
                            fG = f11;
                        }
                        g4Var3 = small;
                        j14 = jN;
                        i21 = -558258760;
                    } else {
                        lVarV.j();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        j14 = j12;
                        fG = f11;
                        pVar4 = pVar3;
                        z13 = z12;
                        i17 = 1572864;
                        i21 = -558258760;
                        j13 = jA;
                        dVar2 = dVar;
                        g4Var3 = g4Var2;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
                    }
                    int i27 = i13 >> 6;
                    lVar2 = lVarV;
                    m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | ((i13 >> 3) & 458752), 16);
                    if (o.J()) {
                        o.R();
                    }
                    pVar5 = pVar4;
                    z14 = z13;
                    dVar3 = dVar2;
                    g4Var4 = g4Var3;
                    j15 = j13;
                    j16 = j14;
                    f12 = fG;
                } else {
                    lVarV.j();
                    lVar2 = lVarV;
                    pVar5 = pVar3;
                    z14 = z12;
                    g4Var4 = g4Var2;
                    j15 = jA;
                    dVar3 = dVar;
                    j16 = j12;
                    f12 = f11;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(dVar3, pVar5, z14, g4Var4, j15, j16, f12, pVar2, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    g4Var2 = g4Var;
                    if (lVarV.n(g4Var2)) {
                    }
                    i13 |= i26;
                } else {
                    g4Var2 = g4Var;
                }
                i13 |= i26;
            } else {
                g4Var2 = g4Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jA = j11;
                    if (lVarV.s(jA)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    jA = j11;
                }
                i23 = PKIFailureInfo.certRevoked;
                i13 |= i23;
            } else {
                jA = j11;
            }
            if ((196608 & i11) != 0) {
                if ((i12 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i13 |= i22;
            }
            i16 = i12 & 64;
            i17 = 1572864;
            if (i16 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.q(f11)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(pVar2)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((4793491 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
                }
                int i28 = i13 >> 6;
                lVar2 = lVarV;
                m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | ((i13 >> 3) & 458752), 16);
                if (o.J()) {
                    o.R();
                }
                pVar5 = pVar4;
                z14 = z13;
                dVar3 = dVar2;
                g4Var4 = g4Var3;
                j15 = j13;
                j16 = j14;
                f12 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
                }
                int i29 = i13 >> 6;
                lVar2 = lVarV;
                m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | ((i13 >> 3) & 458752), 16);
                if (o.J()) {
                    o.R();
                }
                pVar5 = pVar4;
                z14 = z13;
                dVar3 = dVar2;
                g4Var4 = g4Var3;
                j15 = j13;
                j16 = j14;
                f12 = fG;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new e(dVar3, pVar5, z14, g4Var4, j15, j16, f12, pVar2, i11, i12));
            }
        }
        i13 |= 48;
        pVar3 = pVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    g4Var2 = g4Var;
                    if (lVarV.n(g4Var2)) {
                    }
                    i13 |= i26;
                } else {
                    g4Var2 = g4Var;
                }
                i13 |= i26;
            } else {
                g4Var2 = g4Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jA = j11;
                    if (lVarV.s(jA)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    jA = j11;
                }
                i23 = PKIFailureInfo.certRevoked;
                i13 |= i23;
            } else {
                jA = j11;
            }
            if ((196608 & i11) != 0) {
                if ((i12 & 32) == 0) {
                    i22 = 65536;
                } else {
                    i22 = 65536;
                }
                i13 |= i22;
            }
            i16 = i12 & 64;
            i17 = 1572864;
            if (i16 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (lVarV.q(f11)) {
                    i18 = PKIFailureInfo.badCertTemplate;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.K(pVar2)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((4793491 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
                }
                int i210 = i13 >> 6;
                lVar2 = lVarV;
                m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i210 & 112) | (i210 & 896) | (i210 & 7168) | ((i13 >> 3) & 458752), 16);
                if (o.J()) {
                    o.R();
                }
                pVar5 = pVar4;
                z14 = z13;
                dVar3 = dVar2;
                g4Var4 = g4Var3;
                j15 = j13;
                j16 = j14;
                f12 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i25 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar3;
                    }
                    if (i14 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if ((i12 & 8) != 0) {
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                        i13 &= -7169;
                    } else {
                        small = g4Var2;
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 = (-458753) & i13;
                    } else {
                        jN = j12;
                    }
                    if (i16 != 0) {
                        j13 = jA;
                        fG = w4.h.g(6);
                    } else {
                        j13 = jA;
                        fG = f11;
                    }
                    g4Var3 = small;
                    j14 = jN;
                    i21 = -558258760;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
                }
                int i211 = i13 >> 6;
                lVar2 = lVarV;
                m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i211 & 112) | (i211 & 896) | (i211 & 7168) | ((i13 >> 3) & 458752), 16);
                if (o.J()) {
                    o.R();
                }
                pVar5 = pVar4;
                z14 = z13;
                dVar3 = dVar2;
                g4Var4 = g4Var3;
                j15 = j13;
                j16 = j14;
                f12 = fG;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new e(dVar3, pVar5, z14, g4Var4, j15, j16, f12, pVar2, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                g4Var2 = g4Var;
                if (lVarV.n(g4Var2)) {
                }
                i13 |= i26;
            } else {
                g4Var2 = g4Var;
            }
            i13 |= i26;
        } else {
            g4Var2 = g4Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jA = j11;
                if (lVarV.s(jA)) {
                    i23 = 16384;
                }
                i13 |= i23;
            } else {
                jA = j11;
            }
            i23 = PKIFailureInfo.certRevoked;
            i13 |= i23;
        } else {
            jA = j11;
        }
        if ((196608 & i11) != 0) {
            if ((i12 & 32) == 0) {
                i22 = 65536;
            } else {
                i22 = 65536;
            }
            i13 |= i22;
        }
        i16 = i12 & 64;
        i17 = 1572864;
        if (i16 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (lVarV.q(f11)) {
                i18 = PKIFailureInfo.badCertTemplate;
            } else {
                i18 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i18;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (lVarV.K(pVar2)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i13 |= i19;
        }
        if ((4793491 & i13) == 4793490) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i13 &= -7169;
                } else {
                    small = g4Var2;
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 = (-458753) & i13;
                } else {
                    jN = j12;
                }
                if (i16 != 0) {
                    j13 = jA;
                    fG = w4.h.g(6);
                } else {
                    j13 = jA;
                    fG = f11;
                }
                g4Var3 = small;
                j14 = jN;
                i21 = -558258760;
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i13 &= -7169;
                } else {
                    small = g4Var2;
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 = (-458753) & i13;
                } else {
                    jN = j12;
                }
                if (i16 != 0) {
                    j13 = jA;
                    fG = w4.h.g(6);
                } else {
                    j13 = jA;
                    fG = f11;
                }
                g4Var3 = small;
                j14 = jN;
                i21 = -558258760;
            }
            lVarV.C();
            if (o.J()) {
                o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
            }
            int i212 = i13 >> 6;
            lVar2 = lVarV;
            m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i212 & 112) | (i212 & 896) | (i212 & 7168) | ((i13 >> 3) & 458752), 16);
            if (o.J()) {
                o.R();
            }
            pVar5 = pVar4;
            z14 = z13;
            dVar3 = dVar2;
            g4Var4 = g4Var3;
            j15 = j13;
            j16 = j14;
            f12 = fG;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i13 &= -7169;
                } else {
                    small = g4Var2;
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 = (-458753) & i13;
                } else {
                    jN = j12;
                }
                if (i16 != 0) {
                    j13 = jA;
                    fG = w4.h.g(6);
                } else {
                    j13 = jA;
                    fG = f11;
                }
                g4Var3 = small;
                j14 = jN;
                i21 = -558258760;
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar2 = dVar;
                }
                if (i25 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar3;
                }
                if (i14 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if ((i12 & 8) != 0) {
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                    i13 &= -7169;
                } else {
                    small = g4Var2;
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 = (-458753) & i13;
                } else {
                    jN = j12;
                }
                if (i16 != 0) {
                    j13 = jA;
                    fG = w4.h.g(6);
                } else {
                    j13 = jA;
                    fG = f11;
                }
                g4Var3 = small;
                j14 = jN;
                i21 = -558258760;
            }
            lVarV.C();
            if (o.J()) {
                o.S(i21, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:92)");
            }
            int i213 = i13 >> 6;
            lVar2 = lVarV;
            m2.a(dVar2, g4Var3, j13, j14, null, fG, z2.c.e(-2084221700, true, new d(pVar4, pVar2, z13), lVarV, 54), lVar2, i17 | (i13 & 14) | (i213 & 112) | (i213 & 896) | (i213 & 7168) | ((i13 >> 3) & 458752), 16);
            if (o.J()) {
                o.R();
            }
            pVar5 = pVar4;
            z14 = z13;
            dVar3 = dVar2;
            g4Var4 = g4Var3;
            j15 = j13;
            j16 = j14;
            f12 = fG;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new e(dVar3, pVar5, z14, g4Var4, j15, j16, f12, pVar2, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:130:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x0229  */
    /* JADX WARN: Code duplicated, block: B:149:0x023e  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    public static final void d(e2 e2Var, androidx.compose.ui.d dVar, boolean z11, g4 g4Var, long j11, long j12, long j13, float f11, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        boolean z12;
        int i15;
        g4 small;
        long jA;
        long jN;
        int i16;
        int i17;
        long jB;
        float fG;
        long j14;
        long j15;
        boolean z13;
        g4 g4Var2;
        long j16;
        String strB;
        e2 e2Var2;
        z2.a aVarE;
        l lVar2;
        long j17;
        androidx.compose.ui.d dVar3;
        boolean z14;
        g4 g4Var3;
        long j18;
        long j19;
        float f12;
        w2 w2VarX;
        int i18;
        int i19;
        int i21;
        l lVarV = lVar.v(258660814);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(e2Var) : lVarV.K(e2Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        small = g4Var;
                        int i23 = lVarV.n(small) ? 2048 : 1024;
                        i13 |= i23;
                    } else {
                        small = g4Var;
                    }
                    i13 |= i23;
                } else {
                    small = g4Var;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jA = j11;
                        if (lVarV.s(jA)) {
                            i21 = 16384;
                        }
                        i13 |= i21;
                    } else {
                        jA = j11;
                    }
                    i21 = PKIFailureInfo.certRevoked;
                    i13 |= i21;
                } else {
                    jA = j11;
                }
                if ((196608 & i11) == 0) {
                    jN = j12;
                    if ((i12 & 32) == 0 || !lVarV.s(jN)) {
                        i19 = 65536;
                    } else {
                        i19 = 131072;
                    }
                    i13 |= i19;
                } else {
                    jN = j12;
                }
                if ((1572864 & i11) != 0) {
                    if ((i12 & 64) == 0 || !lVarV.s(j13)) {
                        i18 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i18 = PKIFailureInfo.badCertTemplate;
                    }
                    i13 |= i18;
                }
                i16 = i12 & 128;
                if (i16 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (lVarV.q(f11)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((4793491 & i13) == 4793490 || !lVarV.b()) {
                    lVarV.L();
                    if ((i11 & 1) != 0 || lVarV.k()) {
                        if (i22 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            z12 = false;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                            small = j1.f74525a.b(lVarV, 6).getSmall();
                        }
                        if ((i12 & 16) != 0) {
                            jA = f2.f74340a.a(lVarV, 6);
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jB = f2.f74340a.b(lVarV, 6);
                            i13 &= -3670017;
                        } else {
                            jB = j13;
                        }
                        if (i16 != 0) {
                            fG = w4.h.g(6);
                        } else {
                            fG = f11;
                        }
                        j14 = jN;
                        j15 = jB;
                        z13 = z12;
                        g4Var2 = small;
                        j16 = jA;
                    } else {
                        lVarV.j();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        j15 = j13;
                        fG = f11;
                        g4Var2 = small;
                        j16 = jA;
                        j14 = jN;
                        z13 = z12;
                    }
                    lVarV.C();
                    if (o.J()) {
                        o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
                    }
                    strB = e2Var.b();
                    if (strB != null) {
                        lVarV.o(1609178760);
                        e2Var2 = e2Var;
                        aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                        lVarV.l();
                    } else {
                        e2Var2 = e2Var;
                        lVarV.o(1609445763);
                        lVarV.l();
                        aVarE = null;
                    }
                    lVar2 = lVarV;
                    c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
                    if (o.J()) {
                        o.R();
                    }
                    j17 = j15;
                    dVar3 = dVar2;
                    z14 = z13;
                    g4Var3 = g4Var2;
                    j18 = j16;
                    j19 = j14;
                    f12 = fG;
                } else {
                    lVarV.j();
                    f12 = f11;
                    lVar2 = lVarV;
                    dVar3 = dVar2;
                    z14 = z12;
                    g4Var3 = small;
                    j18 = jA;
                    j19 = jN;
                    j17 = j13;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new g(e2Var, dVar3, z14, g4Var3, j18, j19, j17, f12, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            z12 = z11;
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    small = g4Var;
                    if (lVarV.n(small)) {
                    }
                    i13 |= i23;
                } else {
                    small = g4Var;
                }
                i13 |= i23;
            } else {
                small = g4Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jA = j11;
                    if (lVarV.s(jA)) {
                        i21 = 16384;
                    }
                    i13 |= i21;
                } else {
                    jA = j11;
                }
                i21 = PKIFailureInfo.certRevoked;
                i13 |= i21;
            } else {
                jA = j11;
            }
            if ((196608 & i11) == 0) {
                jN = j12;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                jN = j12;
            }
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    i18 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.q(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((4793491 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
                }
                strB = e2Var.b();
                if (strB != null) {
                    lVarV.o(1609178760);
                    e2Var2 = e2Var;
                    aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                    lVarV.l();
                } else {
                    e2Var2 = e2Var;
                    lVarV.o(1609445763);
                    lVarV.l();
                    aVarE = null;
                }
                lVar2 = lVarV;
                c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                j17 = j15;
                dVar3 = dVar2;
                z14 = z13;
                g4Var3 = g4Var2;
                j18 = j16;
                j19 = j14;
                f12 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
                }
                strB = e2Var.b();
                if (strB != null) {
                    lVarV.o(1609178760);
                    e2Var2 = e2Var;
                    aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                    lVarV.l();
                } else {
                    e2Var2 = e2Var;
                    lVarV.o(1609445763);
                    lVarV.l();
                    aVarE = null;
                }
                lVar2 = lVarV;
                c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                j17 = j15;
                dVar3 = dVar2;
                z14 = z13;
                g4Var3 = g4Var2;
                j18 = j16;
                j19 = j14;
                f12 = fG;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new g(e2Var, dVar3, z14, g4Var3, j18, j19, j17, f12, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    small = g4Var;
                    if (lVarV.n(small)) {
                    }
                    i13 |= i23;
                } else {
                    small = g4Var;
                }
                i13 |= i23;
            } else {
                small = g4Var;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jA = j11;
                    if (lVarV.s(jA)) {
                        i21 = 16384;
                    }
                    i13 |= i21;
                } else {
                    jA = j11;
                }
                i21 = PKIFailureInfo.certRevoked;
                i13 |= i21;
            } else {
                jA = j11;
            }
            if ((196608 & i11) == 0) {
                jN = j12;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                jN = j12;
            }
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    i18 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i18 = PKIFailureInfo.signerNotTrusted;
                }
                i13 |= i18;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (lVarV.q(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((4793491 & i13) == 4793490) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
                }
                strB = e2Var.b();
                if (strB != null) {
                    lVarV.o(1609178760);
                    e2Var2 = e2Var;
                    aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                    lVarV.l();
                } else {
                    e2Var2 = e2Var;
                    lVarV.o(1609445763);
                    lVarV.l();
                    aVarE = null;
                }
                lVar2 = lVarV;
                c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                j17 = j15;
                dVar3 = dVar2;
                z14 = z13;
                g4Var3 = g4Var2;
                j18 = j16;
                j19 = j14;
                f12 = fG;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                } else {
                    if (i22 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        z12 = false;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        small = j1.f74525a.b(lVarV, 6).getSmall();
                    }
                    if ((i12 & 16) != 0) {
                        jA = f2.f74340a.a(lVarV, 6);
                        i13 &= -57345;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jB = f2.f74340a.b(lVarV, 6);
                        i13 &= -3670017;
                    } else {
                        jB = j13;
                    }
                    if (i16 != 0) {
                        fG = w4.h.g(6);
                    } else {
                        fG = f11;
                    }
                    j14 = jN;
                    j15 = jB;
                    z13 = z12;
                    g4Var2 = small;
                    j16 = jA;
                }
                lVarV.C();
                if (o.J()) {
                    o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
                }
                strB = e2Var.b();
                if (strB != null) {
                    lVarV.o(1609178760);
                    e2Var2 = e2Var;
                    aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                    lVarV.l();
                } else {
                    e2Var2 = e2Var;
                    lVarV.o(1609445763);
                    lVarV.l();
                    aVarE = null;
                }
                lVar2 = lVarV;
                c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
                if (o.J()) {
                    o.R();
                }
                j17 = j15;
                dVar3 = dVar2;
                z14 = z13;
                g4Var3 = g4Var2;
                j18 = j16;
                j19 = j14;
                f12 = fG;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new g(e2Var, dVar3, z14, g4Var3, j18, j19, j17, f12, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        z12 = z11;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                small = g4Var;
                if (lVarV.n(small)) {
                }
                i13 |= i23;
            } else {
                small = g4Var;
            }
            i13 |= i23;
        } else {
            small = g4Var;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jA = j11;
                if (lVarV.s(jA)) {
                    i21 = 16384;
                }
                i13 |= i21;
            } else {
                jA = j11;
            }
            i21 = PKIFailureInfo.certRevoked;
            i13 |= i21;
        } else {
            jA = j11;
        }
        if ((196608 & i11) == 0) {
            jN = j12;
            if ((i12 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        } else {
            jN = j12;
        }
        if ((1572864 & i11) != 0) {
            if ((i12 & 64) == 0) {
                i18 = PKIFailureInfo.signerNotTrusted;
            } else {
                i18 = PKIFailureInfo.signerNotTrusted;
            }
            i13 |= i18;
        }
        i16 = i12 & 128;
        if (i16 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (lVarV.q(f11)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((4793491 & i13) == 4793490) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jB = f2.f74340a.b(lVarV, 6);
                    i13 &= -3670017;
                } else {
                    jB = j13;
                }
                if (i16 != 0) {
                    fG = w4.h.g(6);
                } else {
                    fG = f11;
                }
                j14 = jN;
                j15 = jB;
                z13 = z12;
                g4Var2 = small;
                j16 = jA;
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jB = f2.f74340a.b(lVarV, 6);
                    i13 &= -3670017;
                } else {
                    jB = j13;
                }
                if (i16 != 0) {
                    fG = w4.h.g(6);
                } else {
                    fG = f11;
                }
                j14 = jN;
                j15 = jB;
                z13 = z12;
                g4Var2 = small;
                j16 = jA;
            }
            lVarV.C();
            if (o.J()) {
                o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
            }
            strB = e2Var.b();
            if (strB != null) {
                lVarV.o(1609178760);
                e2Var2 = e2Var;
                aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                lVarV.l();
            } else {
                e2Var2 = e2Var;
                lVarV.o(1609445763);
                lVarV.l();
                aVarE = null;
            }
            lVar2 = lVarV;
            c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
            if (o.J()) {
                o.R();
            }
            j17 = j15;
            dVar3 = dVar2;
            z14 = z13;
            g4Var3 = g4Var2;
            j18 = j16;
            j19 = j14;
            f12 = fG;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jB = f2.f74340a.b(lVarV, 6);
                    i13 &= -3670017;
                } else {
                    jB = j13;
                }
                if (i16 != 0) {
                    fG = w4.h.g(6);
                } else {
                    fG = f11;
                }
                j14 = jN;
                j15 = jB;
                z13 = z12;
                g4Var2 = small;
                j16 = jA;
            } else {
                if (i22 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    z12 = false;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    small = j1.f74525a.b(lVarV, 6).getSmall();
                }
                if ((i12 & 16) != 0) {
                    jA = f2.f74340a.a(lVarV, 6);
                    i13 &= -57345;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jB = f2.f74340a.b(lVarV, 6);
                    i13 &= -3670017;
                } else {
                    jB = j13;
                }
                if (i16 != 0) {
                    fG = w4.h.g(6);
                } else {
                    fG = f11;
                }
                j14 = jN;
                j15 = jB;
                z13 = z12;
                g4Var2 = small;
                j16 = jA;
            }
            lVarV.C();
            if (o.J()) {
                o.S(258660814, i13, -1, "androidx.compose.material.Snackbar (Snackbar.kt:163)");
            }
            strB = e2Var.b();
            if (strB != null) {
                lVarV.o(1609178760);
                e2Var2 = e2Var;
                aVarE = z2.c.e(1843479216, true, new h(j15, e2Var2, strB), lVarV, 54);
                lVarV.l();
            } else {
                e2Var2 = e2Var;
                lVarV.o(1609445763);
                lVarV.l();
                aVarE = null;
            }
            lVar2 = lVarV;
            c(t.i(dVar2, w4.h.g(12)), aVarE, z13, g4Var2, j16, j14, fG, z2.c.e(-261845785, true, new f(e2Var2), lVarV, 54), lVar2, 12582912 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | ((i13 >> 3) & 3670016), 0);
            if (o.J()) {
                o.R();
            }
            j17 = j15;
            dVar3 = dVar2;
            z14 = z13;
            g4Var3 = g4Var2;
            j18 = j16;
            j19 = j14;
            f12 = fG;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new g(e2Var, dVar3, z14, g4Var3, j18, j19, j17, f12, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p<? super l, ? super Integer, h0> pVar, l lVar, int i11) {
        int i12;
        l lVarV = lVar.v(917397959);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(917397959, i12, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:238)");
            }
            i iVar = i.f74584a;
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, companion);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, iVar, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.ui.d dVarJ = t.j(companion, f74528b, f74531e);
            i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarJ);
            wn0.a<b4.g> aVarA2 = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            l lVarA2 = d4.a(lVarV);
            d4.b(lVarA2, i0VarH, companion2.c());
            d4.b(lVarA2, xVarC2, companion2.e());
            p<b4.g, Integer, h0> pVarB2 = companion2.b();
            if (lVarA2.u() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            d4.b(lVarA2, dVarE2, companion2.d());
            androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVarV, Integer.valueOf(i12 & 14));
            lVarV.g();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new j(pVar, i11));
        }
    }
}
