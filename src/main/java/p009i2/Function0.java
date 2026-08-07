package p009i2;

import androidx.compose.foundation.layout.t;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import k3.g4;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.h2;
import p020r2.j;
import p020r2.k2;
import p020r2.o;
import p020r2.w;
import p020r2.w2;
import p020r2.x;
import v1.g;
import v1.i;
import w4.h;
import wn0.l;
import wn0.p;
import z3.i0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: renamed from: i2.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001al\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u00020\u0001*\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "buttons", "Landroidx/compose/ui/d;", "modifier", "title", "text", "Lk3/g4;", "shape", "Lk3/p1;", "backgroundColor", "contentColor", "b", "(Lwn0/p;Landroidx/compose/ui/d;Lwn0/p;Lwn0/p;Lk3/g4;JJLr2/l;II)V", "Lv1/i;", "a", "(Lv1/i;Lwn0/p;Lwn0/p;Lr2/l;I)V", "Lw4/h;", "mainAxisSpacing", "crossAxisSpacing", "content", "c", "(FFLwn0/p;Lr2/l;I)V", "Landroidx/compose/ui/d;", "TitlePadding", "TextPadding", "Lw4/v;", "J", "TitleBaselineDistanceFromTop", DateTokenConverter.CONVERTER_KEY, "TextBaselineDistanceFromTitle", "e", "TextBaselineDistanceFromTop", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.d f74072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.d f74073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f74074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f74075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f74076e;

    /* JADX INFO: renamed from: i2.a$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74077a = new a();

        /* JADX INFO: renamed from: i2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class C1548a extends u implements l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w0 f74078c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f74079d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ w0 f74080e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f74081f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1548a(w0 w0Var, int i11, w0 w0Var2, int i12) {
                super(1);
                this.f74078c = w0Var;
                this.f74079d = i11;
                this.f74080e = w0Var2;
                this.f74081f = i12;
            }

            public final void a(w0.a aVar) {
                w0.a aVar2;
                w0 w0Var = this.f74078c;
                if (w0Var != null) {
                    aVar2 = aVar;
                    w0.a.h(aVar2, w0Var, 0, this.f74079d, BitmapDescriptorFactory.HUE_RED, 4, null);
                } else {
                    aVar2 = aVar;
                }
                w0 w0Var2 = this.f74080e;
                if (w0Var2 != null) {
                    w0.a.h(aVar2, w0Var2, 0, this.f74081f, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        a() {
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            z3.h0 h0Var;
            z3.h0 h0Var2;
            int iIntValue;
            int iIntValue2;
            int iIntValue3;
            int i11;
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    h0Var = null;
                    break;
                }
                h0Var = list.get(i13);
                if (s.f(androidx.compose.ui.layout.a.a(h0Var), "title")) {
                    break;
                }
                i13++;
            }
            z3.h0 h0Var3 = h0Var;
            w0 w0VarX0 = h0Var3 != null ? h0Var3.x0(w4.b.d(j11, 0, 0, 0, 0, 11, null)) : null;
            int size2 = list.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    h0Var2 = null;
                    break;
                }
                h0Var2 = list.get(i14);
                if (s.f(androidx.compose.ui.layout.a.a(h0Var2), "text")) {
                    break;
                }
                i14++;
            }
            z3.h0 h0Var4 = h0Var2;
            w0 w0VarX1 = h0Var4 != null ? h0Var4.x0(w4.b.d(j11, 0, 0, 0, 0, 11, null)) : null;
            int iMax = Math.max(w0VarX0 != null ? w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : 0, w0VarX1 != null ? w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : 0);
            if (w0VarX0 == null) {
                iIntValue = 0;
            } else {
                int iIntValue4 = Integer.valueOf(w0VarX0.g0(z3.b.a())).intValue();
                Integer numValueOf = iIntValue4 == Integer.MIN_VALUE ? null : Integer.valueOf(iIntValue4);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
            }
            if (w0VarX0 == null) {
                iIntValue2 = 0;
            } else {
                int iG0 = w0VarX0.g0(z3.b.b());
                Integer numValueOf2 = iG0 == Integer.MIN_VALUE ? null : Integer.valueOf(iG0);
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
            }
            int iQ1 = k0Var.Q1(Function0.f74074c) - iIntValue;
            if (w0VarX1 == null) {
                iIntValue3 = 0;
            } else {
                int iG1 = w0VarX1.g0(z3.b.a());
                Integer numValueOf3 = iG1 != Integer.MIN_VALUE ? Integer.valueOf(iG1) : null;
                if (numValueOf3 != null) {
                    iIntValue3 = numValueOf3.intValue();
                } else {
                    iIntValue3 = 0;
                }
            }
            int iQ2 = w0VarX0 == null ? k0Var.Q1(Function0.f74076e) : k0Var.Q1(Function0.f74075d);
            int i15 = w0VarX0 != null ? w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iQ1 : 0;
            if (w0VarX0 == null) {
                i11 = iQ2 - iIntValue3;
            } else {
                i11 = (iIntValue2 == 0 ? i15 - iIntValue3 : (iQ1 + iIntValue2) - iIntValue3) + iQ2;
            }
            if (w0VarX1 != null) {
                if (iIntValue2 == 0) {
                    i12 = (w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iQ2) - iIntValue3;
                } else {
                    i12 = ((w0VarX1.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() + iQ2) - iIntValue3) - ((w0VarX0 != null ? w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : 0) - iIntValue2);
                }
            }
            return k0.N1(k0Var, iMax, i15 + i12, null, new C1548a(w0VarX0, iQ1, w0VarX1, i11), 4, null);
        }
    }

    /* JADX INFO: renamed from: i2.a$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f74082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f74085f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i iVar, p<? super p020r2.l, ? super Integer, h0> pVar, p<? super p020r2.l, ? super Integer, h0> pVar2, int i11) {
            super(2);
            this.f74082c = iVar;
            this.f74083d = pVar;
            this.f74084e = pVar2;
            this.f74085f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function0.a(this.f74082c, this.f74083d, this.f74084e, lVar, k2.a(this.f74085f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i2.a$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74088e;

        /* JADX INFO: renamed from: i2.a$c$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<p020r2.l, Integer, h0> f74089c;

            /* JADX INFO: renamed from: i2.a$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
            static final class C1549a extends u implements p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p<p020r2.l, Integer, h0> f74090c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1549a(p<? super p020r2.l, ? super Integer, h0> pVar) {
                    super(2);
                    this.f74090c = pVar;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(770166432, i11, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:65)");
                    }
                    v2.a(j1.f74525a.c(lVar, 6).getSubtitle1(), this.f74090c, lVar, 0);
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super p020r2.l, ? super Integer, h0> pVar) {
                super(2);
                this.f74089c = pVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(620104160, i11, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:64)");
                }
                w.a(y.a().d(Float.valueOf(x.f75438a.c(lVar, 6))), z2.c.e(770166432, true, new C1549a(this.f74089c), lVar, 54), lVar, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: i2.a$c$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<p020r2.l, Integer, h0> f74091c;

            /* JADX INFO: renamed from: i2.a$c$b$a */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends u implements p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p<p020r2.l, Integer, h0> f74092c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(p<? super p020r2.l, ? super Integer, h0> pVar) {
                    super(2);
                    this.f74092c = pVar;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(2115920639, i11, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:75)");
                    }
                    v2.a(j1.f74525a.c(lVar, 6).getBody2(), this.f74092c, lVar, 0);
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                    a(lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(p<? super p020r2.l, ? super Integer, h0> pVar) {
                super(2);
                this.f74091c = pVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(1965858367, i11, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:72)");
                }
                w.a(y.a().d(Float.valueOf(x.f75438a.d(lVar, 6))), z2.c.e(2115920639, true, new a(this.f74091c), lVar, 54), lVar, h2.f106566i | 48);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super p020r2.l, ? super Integer, h0> pVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3) {
            super(2);
            this.f74086c = pVar;
            this.f74087d = pVar2;
            this.f74088e = pVar3;
        }

        public final void a(p020r2.l lVar, int i11) {
            z2.a aVarE;
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(629950291, i11, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:60)");
            }
            p<p020r2.l, Integer, h0> pVar = this.f74086c;
            p<p020r2.l, Integer, h0> pVar2 = this.f74087d;
            p<p020r2.l, Integer, h0> pVar3 = this.f74088e;
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            i0 i0VarA = g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, companion);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            v1.j jVar = v1.j.f117505a;
            z2.a aVarE2 = null;
            if (pVar == null) {
                lVar.o(-373537744);
                lVar.l();
                aVarE = null;
            } else {
                lVar.o(-373537743);
                aVarE = z2.c.e(620104160, true, new a(pVar), lVar, 54);
                lVar.l();
            }
            if (pVar2 == null) {
                lVar.o(-373164163);
            } else {
                lVar.o(-373164162);
                aVarE2 = z2.c.e(1965858367, true, new b(pVar2), lVar, 54);
            }
            lVar.l();
            Function0.a(jVar, aVarE, aVarE2, lVar, 6);
            pVar3.invoke(lVar, 0);
            lVar.g();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i2.a$d */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f74094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g4 f74097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f74098h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f74099i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f74100j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f74101k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super p020r2.l, ? super Integer, h0> pVar, androidx.compose.ui.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, g4 g4Var, long j11, long j12, int i11, int i12) {
            super(2);
            this.f74093c = pVar;
            this.f74094d = dVar;
            this.f74095e = pVar2;
            this.f74096f = pVar3;
            this.f74097g = g4Var;
            this.f74098h = j11;
            this.f74099i = j12;
            this.f74100j = i11;
            this.f74101k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function0.b(this.f74093c, this.f74094d, this.f74095e, this.f74096f, this.f74097g, this.f74098h, this.f74099i, lVar, k2.a(this.f74100j | 1), this.f74101k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i2.a$e */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class e implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f74102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f74103b;

        /* JADX INFO: renamed from: i2.a$e$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<List<w0>> f74104c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k0 f74105d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f74106e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f74107f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<Integer> f74108g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<List<w0>> list, k0 k0Var, float f11, int i11, List<Integer> list2) {
                super(1);
                this.f74104c = list;
                this.f74105d = k0Var;
                this.f74106e = f11;
                this.f74107f = i11;
                this.f74108g = list2;
            }

            public final void a(w0.a aVar) {
                List<List<w0>> list = this.f74104c;
                k0 k0Var = this.f74105d;
                float f11 = this.f74106e;
                int i11 = this.f74107f;
                List<Integer> list2 = this.f74108g;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    List<w0> list3 = list.get(i12);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i13 = 0;
                    while (i13 < size2) {
                        iArr[i13] = list3.get(i13).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() + (i13 < v.o(list3) ? k0Var.i1(f11) : 0);
                        i13++;
                    }
                    v1.b.m mVarA = v1.b.f117444a.a();
                    int[] iArr2 = new int[size2];
                    for (int i14 = 0; i14 < size2; i14++) {
                        iArr2[i14] = 0;
                    }
                    mVarA.c(k0Var, i11, iArr, iArr2);
                    int size3 = list3.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        w0.a.h(aVar, list3.get(i15), iArr2[i15], list2.get(i12).intValue(), BitmapDescriptorFactory.HUE_RED, 4, null);
                    }
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        e(float f11, float f12) {
            this.f74102a = f11;
            this.f74103b = f12;
        }

        private static final boolean a(List<w0> list, l0 l0Var, k0 k0Var, float f11, long j11, w0 w0Var) {
            return list.isEmpty() || (l0Var.f86527a + k0Var.i1(f11)) + w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() <= w4.b.l(j11);
        }

        private static final void b(List<List<w0>> list, l0 l0Var, k0 k0Var, float f11, List<w0> list2, List<Integer> list3, l0 l0Var2, List<Integer> list4, l0 l0Var3, l0 l0Var4) {
            if (!list.isEmpty()) {
                l0Var.f86527a += k0Var.i1(f11);
            }
            list.add(0, v.m1(list2));
            list3.add(Integer.valueOf(l0Var2.f86527a));
            list4.add(Integer.valueOf(l0Var.f86527a));
            l0Var.f86527a += l0Var2.f86527a;
            l0Var3.f86527a = Math.max(l0Var3.f86527a, l0Var4.f86527a);
            list2.clear();
            l0Var4.f86527a = 0;
            l0Var2.f86527a = 0;
        }

        @Override // z3.i0
        public final j0 c(k0 k0Var, List<? extends z3.h0> list, long j11) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            l0 l0Var = new l0();
            l0 l0Var2 = new l0();
            ArrayList arrayList4 = new ArrayList();
            l0 l0Var3 = new l0();
            l0 l0Var4 = new l0();
            int i11 = 0;
            long jB = w4.c.b(0, w4.b.l(j11), 0, 0, 13, null);
            float f11 = this.f74102a;
            float f12 = this.f74103b;
            int size = list.size();
            while (i11 < size) {
                ArrayList arrayList5 = arrayList;
                w0 w0VarX0 = list.get(i11).x0(jB);
                long j12 = jB;
                float f13 = f12;
                int i12 = size;
                int i13 = i11;
                l0 l0Var5 = l0Var3;
                l0Var3 = l0Var5;
                if (a(arrayList4, l0Var5, k0Var, f11, j11, w0VarX0)) {
                    arrayList = arrayList5;
                } else {
                    arrayList = arrayList5;
                    b(arrayList, l0Var2, k0Var, f13, arrayList4, arrayList2, l0Var4, arrayList3, l0Var, l0Var3);
                }
                if (!arrayList4.isEmpty()) {
                    l0Var3.f86527a += k0Var.i1(f11);
                }
                arrayList4.add(w0VarX0);
                l0Var3.f86527a += w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                l0Var4.f86527a = Math.max(l0Var4.f86527a, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
                i11 = i13 + 1;
                f12 = f13;
                jB = j12;
                size = i12;
            }
            if (!arrayList4.isEmpty()) {
                b(arrayList, l0Var2, k0Var, this.f74103b, arrayList4, arrayList2, l0Var4, arrayList3, l0Var, l0Var3);
            }
            int iL = w4.b.l(j11) != Integer.MAX_VALUE ? w4.b.l(j11) : Math.max(l0Var.f86527a, w4.b.n(j11));
            return k0.N1(k0Var, iL, Math.max(l0Var2.f86527a, w4.b.m(j11)), null, new a(arrayList, k0Var, this.f74102a, iL, arrayList3), 4, null);
        }
    }

    /* JADX INFO: renamed from: i2.a$f */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f74109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f74110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<p020r2.l, Integer, h0> f74111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f74112f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(float f11, float f12, p<? super p020r2.l, ? super Integer, h0> pVar, int i11) {
            super(2);
            this.f74109c = f11;
            this.f74110d = f12;
            this.f74111e = pVar;
            this.f74112f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            Function0.c(this.f74109c, this.f74110d, this.f74111e, lVar, k2.a(this.f74112f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    static {
        androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
        float f11 = 24;
        f74072a = t.m(companion, h.g(f11), BitmapDescriptorFactory.HUE_RED, h.g(f11), BitmapDescriptorFactory.HUE_RED, 10, null);
        f74073b = t.m(companion, h.g(f11), BitmapDescriptorFactory.HUE_RED, h.g(f11), h.g(28), 2, null);
        f74074c = w4.w.h(40);
        f74075d = w4.w.h(36);
        f74076e = w4.w.h(38);
    }

    public static final void a(i iVar, p<? super p020r2.l, ? super Integer, h0> pVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-555573207);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(pVar2) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(-555573207, i12, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:97)");
            }
            androidx.compose.ui.d dVarA = iVar.a(androidx.compose.ui.d.INSTANCE, 1.0f, false);
            a aVar = a.f74077a;
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarA);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, aVar, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            if (pVar == null) {
                lVarV.o(1310700478);
            } else {
                lVarV.o(1310700479);
                androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(f74072a, "title");
                d3.c.Companion companion2 = d3.c.INSTANCE;
                androidx.compose.ui.d dVarC = iVar.c(dVarB, companion2.k());
                i0 i0VarH = androidx.compose.foundation.layout.g.h(companion2.o(), false);
                int iA2 = j.a(lVarV, 0);
                x xVarC2 = lVarV.c();
                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarC);
                wn0.a<b4.g> aVarA2 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA2);
                } else {
                    lVarV.d();
                }
                p020r2.l lVarA2 = d4.a(lVarV);
                d4.b(lVarA2, i0VarH, companion.c());
                d4.b(lVarA2, xVarC2, companion.e());
                p<b4.g, Integer, h0> pVarB2 = companion.b();
                if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                    lVarA2.B(Integer.valueOf(iA2));
                    lVarA2.f(Integer.valueOf(iA2), pVarB2);
                }
                d4.b(lVarA2, dVarE2, companion.d());
                androidx.compose.foundation.layout.i iVar2 = androidx.compose.foundation.layout.i.f4585a;
                pVar.invoke(lVarV, 0);
                lVarV.g();
            }
            lVarV.l();
            if (pVar2 == null) {
                lVarV.o(1310868994);
            } else {
                lVarV.o(1310868995);
                androidx.compose.ui.d dVarB2 = androidx.compose.ui.layout.a.b(f74073b, "text");
                d3.c.Companion companion3 = d3.c.INSTANCE;
                androidx.compose.ui.d dVarC2 = iVar.c(dVarB2, companion3.k());
                i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion3.o(), false);
                int iA3 = j.a(lVarV, 0);
                x xVarC3 = lVarV.c();
                androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarC2);
                wn0.a<b4.g> aVarA3 = companion.a();
                if (lVarV.w() == null) {
                    j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA3);
                } else {
                    lVarV.d();
                }
                p020r2.l lVarA3 = d4.a(lVarV);
                d4.b(lVarA3, i0VarH2, companion.c());
                d4.b(lVarA3, xVarC3, companion.e());
                p<b4.g, Integer, h0> pVarB3 = companion.b();
                if (lVarA3.getInserting() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                    lVarA3.B(Integer.valueOf(iA3));
                    lVarA3.f(Integer.valueOf(iA3), pVarB3);
                }
                d4.b(lVarA3, dVarE3, companion.d());
                androidx.compose.foundation.layout.i iVar3 = androidx.compose.foundation.layout.i.f4585a;
                pVar2.invoke(lVarV, 0);
                lVarV.g();
            }
            lVarV.l();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(iVar, pVar, pVar2, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0132  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    public static final void b(p<? super p020r2.l, ? super Integer, h0> pVar, androidx.compose.ui.d dVar, p<? super p020r2.l, ? super Integer, h0> pVar2, p<? super p020r2.l, ? super Integer, h0> pVar3, g4 g4Var, long j11, long j12, p020r2.l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        p<? super p020r2.l, ? super Integer, h0> pVar4;
        int i15;
        int i16;
        p<? super p020r2.l, ? super Integer, h0> pVar5;
        int i17;
        g4 medium;
        long jN;
        long jB;
        int i18;
        int i19;
        int i21;
        p020r2.l lVar2;
        p<? super p020r2.l, ? super Integer, h0> pVar6;
        p<? super p020r2.l, ? super Integer, h0> pVar7;
        androidx.compose.ui.d dVar3;
        g4 g4Var2;
        long j13;
        long j14;
        w2 w2VarX;
        int i22;
        int i23;
        p020r2.l lVarV = lVar.v(-453679601);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(pVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    pVar4 = pVar2;
                    if (lVarV.K(pVar4)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        pVar5 = pVar3;
                        if (lVarV.K(pVar5)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i11 & 24576) == 0) {
                        if ((i12 & 16) == 0) {
                            medium = g4Var;
                            if (lVarV.n(medium)) {
                                i23 = 16384;
                            }
                            i13 |= i23;
                        } else {
                            medium = g4Var;
                        }
                        i23 = PKIFailureInfo.certRevoked;
                        i13 |= i23;
                    } else {
                        medium = g4Var;
                    }
                    if ((196608 & i11) == 0) {
                        if ((i12 & 32) == 0) {
                            jN = j11;
                            int i25 = lVarV.s(jN) ? 131072 : 65536;
                            i13 |= i25;
                        } else {
                            jN = j11;
                        }
                        i13 |= i25;
                    } else {
                        jN = j11;
                    }
                    if ((i11 & 1572864) == 0) {
                        if ((i12 & 64) == 0) {
                            jB = j12;
                            if (lVarV.s(jB)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            }
                            i13 |= i22;
                        } else {
                            jB = j12;
                        }
                        i22 = PKIFailureInfo.signerNotTrusted;
                        i13 |= i22;
                    } else {
                        jB = j12;
                    }
                    i18 = i13;
                    if ((i13 & 599187) == 599186 || !lVarV.b()) {
                        lVarV.L();
                        if ((i11 & 1) != 0 || lVarV.k()) {
                            if (i24 != 0) {
                                dVar2 = androidx.compose.ui.d.INSTANCE;
                            }
                            if (i14 != 0) {
                                pVar4 = null;
                            }
                            if (i16 != 0) {
                                pVar5 = null;
                            }
                            if ((i12 & 16) != 0) {
                                i19 = i18 & (-57345);
                                medium = j1.f74525a.b(lVarV, 6).getMedium();
                            } else {
                                i19 = i18;
                            }
                            if ((i12 & 32) != 0) {
                                jN = j1.f74525a.a(lVarV, 6).n();
                                i21 = i19 & (-458753);
                            } else {
                                i21 = i19;
                            }
                            if ((i12 & 64) != 0) {
                                jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                                i21 &= -3670017;
                            }
                        } else {
                            lVarV.j();
                            i21 = (i12 & 16) != 0 ? i18 & (-57345) : i18;
                            if ((i12 & 32) != 0) {
                                i21 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                i21 &= -3670017;
                            }
                        }
                        long j15 = jB;
                        long j16 = jN;
                        g4 g4Var3 = medium;
                        androidx.compose.ui.d dVar4 = dVar2;
                        lVarV.C();
                        if (o.J()) {
                            o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                        }
                        int i26 = ((i21 >> 3) & 14) | 1572864;
                        int i27 = i21 >> 9;
                        lVar2 = lVarV;
                        m2.a(dVar4, g4Var3, j16, j15, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i26 | (i27 & 112) | (i27 & 896) | (i27 & 7168), 48);
                        if (o.J()) {
                            o.R();
                        }
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        dVar3 = dVar4;
                        g4Var2 = g4Var3;
                        j13 = j16;
                        j14 = j15;
                    } else {
                        lVarV.j();
                        lVar2 = lVarV;
                        dVar3 = dVar2;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        g4Var2 = medium;
                        j13 = jN;
                        j14 = jB;
                    }
                    w2VarX = lVar2.x();
                    if (w2VarX != null) {
                        w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
                    }
                }
                i13 |= 3072;
                pVar5 = pVar3;
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        medium = g4Var;
                        if (lVarV.n(medium)) {
                            i23 = 16384;
                        }
                        i13 |= i23;
                    } else {
                        medium = g4Var;
                    }
                    i23 = PKIFailureInfo.certRevoked;
                    i13 |= i23;
                } else {
                    medium = g4Var;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jN = j11;
                        if (lVarV.s(jN)) {
                        }
                        i13 |= i25;
                    } else {
                        jN = j11;
                    }
                    i13 |= i25;
                } else {
                    jN = j11;
                }
                if ((i11 & 1572864) == 0) {
                    if ((i12 & 64) == 0) {
                        jB = j12;
                        if (lVarV.s(jB)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        }
                        i13 |= i22;
                    } else {
                        jB = j12;
                    }
                    i22 = PKIFailureInfo.signerNotTrusted;
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i18 = i13;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    }
                    long j17 = jB;
                    long j18 = jN;
                    g4 g4Var4 = medium;
                    androidx.compose.ui.d dVar5 = dVar2;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                    }
                    int i28 = ((i21 >> 3) & 14) | 1572864;
                    int i29 = i21 >> 9;
                    lVar2 = lVarV;
                    m2.a(dVar5, g4Var4, j18, j17, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i28 | (i29 & 112) | (i29 & 896) | (i29 & 7168), 48);
                    if (o.J()) {
                        o.R();
                    }
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    dVar3 = dVar5;
                    g4Var2 = g4Var4;
                    j13 = j18;
                    j14 = j17;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    }
                    long j19 = jB;
                    long j110 = jN;
                    g4 g4Var5 = medium;
                    androidx.compose.ui.d dVar6 = dVar2;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                    }
                    int i210 = ((i21 >> 3) & 14) | 1572864;
                    int i211 = i21 >> 9;
                    lVar2 = lVarV;
                    m2.a(dVar6, g4Var5, j110, j19, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i210 | (i211 & 112) | (i211 & 896) | (i211 & 7168), 48);
                    if (o.J()) {
                        o.R();
                    }
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    dVar3 = dVar6;
                    g4Var2 = g4Var5;
                    j13 = j110;
                    j14 = j19;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            pVar4 = pVar2;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    pVar5 = pVar3;
                    if (lVarV.K(pVar5)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        medium = g4Var;
                        if (lVarV.n(medium)) {
                            i23 = 16384;
                        }
                        i13 |= i23;
                    } else {
                        medium = g4Var;
                    }
                    i23 = PKIFailureInfo.certRevoked;
                    i13 |= i23;
                } else {
                    medium = g4Var;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jN = j11;
                        if (lVarV.s(jN)) {
                        }
                        i13 |= i25;
                    } else {
                        jN = j11;
                    }
                    i13 |= i25;
                } else {
                    jN = j11;
                }
                if ((i11 & 1572864) == 0) {
                    if ((i12 & 64) == 0) {
                        jB = j12;
                        if (lVarV.s(jB)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        }
                        i13 |= i22;
                    } else {
                        jB = j12;
                    }
                    i22 = PKIFailureInfo.signerNotTrusted;
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i18 = i13;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    }
                    long j111 = jB;
                    long j112 = jN;
                    g4 g4Var6 = medium;
                    androidx.compose.ui.d dVar7 = dVar2;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                    }
                    int i212 = ((i21 >> 3) & 14) | 1572864;
                    int i213 = i21 >> 9;
                    lVar2 = lVarV;
                    m2.a(dVar7, g4Var6, j112, j111, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i212 | (i213 & 112) | (i213 & 896) | (i213 & 7168), 48);
                    if (o.J()) {
                        o.R();
                    }
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    dVar3 = dVar7;
                    g4Var2 = g4Var6;
                    j13 = j112;
                    j14 = j111;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    }
                    long j113 = jB;
                    long j114 = jN;
                    g4 g4Var7 = medium;
                    androidx.compose.ui.d dVar8 = dVar2;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                    }
                    int i214 = ((i21 >> 3) & 14) | 1572864;
                    int i215 = i21 >> 9;
                    lVar2 = lVarV;
                    m2.a(dVar8, g4Var7, j114, j113, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i214 | (i215 & 112) | (i215 & 896) | (i215 & 7168), 48);
                    if (o.J()) {
                        o.R();
                    }
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    dVar3 = dVar8;
                    g4Var2 = g4Var7;
                    j13 = j114;
                    j14 = j113;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
                }
            }
            i13 |= 3072;
            pVar5 = pVar3;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    medium = g4Var;
                    if (lVarV.n(medium)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    medium = g4Var;
                }
                i23 = PKIFailureInfo.certRevoked;
                i13 |= i23;
            } else {
                medium = g4Var;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jN = j11;
                    if (lVarV.s(jN)) {
                    }
                    i13 |= i25;
                } else {
                    jN = j11;
                }
                i13 |= i25;
            } else {
                jN = j11;
            }
            if ((i11 & 1572864) == 0) {
                if ((i12 & 64) == 0) {
                    jB = j12;
                    if (lVarV.s(jB)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    }
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i22 = PKIFailureInfo.signerNotTrusted;
                i13 |= i22;
            } else {
                jB = j12;
            }
            i18 = i13;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                }
                long j115 = jB;
                long j116 = jN;
                g4 g4Var8 = medium;
                androidx.compose.ui.d dVar9 = dVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                }
                int i216 = ((i21 >> 3) & 14) | 1572864;
                int i217 = i21 >> 9;
                lVar2 = lVarV;
                m2.a(dVar9, g4Var8, j116, j115, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i216 | (i217 & 112) | (i217 & 896) | (i217 & 7168), 48);
                if (o.J()) {
                    o.R();
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                dVar3 = dVar9;
                g4Var2 = g4Var8;
                j13 = j116;
                j14 = j115;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                }
                long j117 = jB;
                long j118 = jN;
                g4 g4Var9 = medium;
                androidx.compose.ui.d dVar10 = dVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                }
                int i218 = ((i21 >> 3) & 14) | 1572864;
                int i219 = i21 >> 9;
                lVar2 = lVarV;
                m2.a(dVar10, g4Var9, j118, j117, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i218 | (i219 & 112) | (i219 & 896) | (i219 & 7168), 48);
                if (o.J()) {
                    o.R();
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                dVar3 = dVar10;
                g4Var2 = g4Var9;
                j13 = j118;
                j14 = j117;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                pVar4 = pVar2;
                if (lVarV.K(pVar4)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    pVar5 = pVar3;
                    if (lVarV.K(pVar5)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        medium = g4Var;
                        if (lVarV.n(medium)) {
                            i23 = 16384;
                        }
                        i13 |= i23;
                    } else {
                        medium = g4Var;
                    }
                    i23 = PKIFailureInfo.certRevoked;
                    i13 |= i23;
                } else {
                    medium = g4Var;
                }
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        jN = j11;
                        if (lVarV.s(jN)) {
                        }
                        i13 |= i25;
                    } else {
                        jN = j11;
                    }
                    i13 |= i25;
                } else {
                    jN = j11;
                }
                if ((i11 & 1572864) == 0) {
                    if ((i12 & 64) == 0) {
                        jB = j12;
                        if (lVarV.s(jB)) {
                            i22 = PKIFailureInfo.badCertTemplate;
                        }
                        i13 |= i22;
                    } else {
                        jB = j12;
                    }
                    i22 = PKIFailureInfo.signerNotTrusted;
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i18 = i13;
                if ((i13 & 599187) == 599186) {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    }
                    long j119 = jB;
                    long j1110 = jN;
                    g4 g4Var10 = medium;
                    androidx.compose.ui.d dVar11 = dVar2;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                    }
                    int i2110 = ((i21 >> 3) & 14) | 1572864;
                    int i2111 = i21 >> 9;
                    lVar2 = lVarV;
                    m2.a(dVar11, g4Var10, j1110, j119, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i2110 | (i2111 & 112) | (i2111 & 896) | (i2111 & 7168), 48);
                    if (o.J()) {
                        o.R();
                    }
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    dVar3 = dVar11;
                    g4Var2 = g4Var10;
                    j13 = j1110;
                    j14 = j119;
                } else {
                    lVarV.L();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    } else {
                        if (i24 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            pVar4 = null;
                        }
                        if (i16 != 0) {
                            pVar5 = null;
                        }
                        if ((i12 & 16) != 0) {
                            i19 = i18 & (-57345);
                            medium = j1.f74525a.b(lVarV, 6).getMedium();
                        } else {
                            i19 = i18;
                        }
                        if ((i12 & 32) != 0) {
                            jN = j1.f74525a.a(lVarV, 6).n();
                            i21 = i19 & (-458753);
                        } else {
                            i21 = i19;
                        }
                        if ((i12 & 64) != 0) {
                            jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                            i21 &= -3670017;
                        }
                    }
                    long j1111 = jB;
                    long j1112 = jN;
                    g4 g4Var11 = medium;
                    androidx.compose.ui.d dVar12 = dVar2;
                    lVarV.C();
                    if (o.J()) {
                        o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                    }
                    int i2112 = ((i21 >> 3) & 14) | 1572864;
                    int i2113 = i21 >> 9;
                    lVar2 = lVarV;
                    m2.a(dVar12, g4Var11, j1112, j1111, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i2112 | (i2113 & 112) | (i2113 & 896) | (i2113 & 7168), 48);
                    if (o.J()) {
                        o.R();
                    }
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    dVar3 = dVar12;
                    g4Var2 = g4Var11;
                    j13 = j1112;
                    j14 = j1111;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
                }
            }
            i13 |= 3072;
            pVar5 = pVar3;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    medium = g4Var;
                    if (lVarV.n(medium)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    medium = g4Var;
                }
                i23 = PKIFailureInfo.certRevoked;
                i13 |= i23;
            } else {
                medium = g4Var;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jN = j11;
                    if (lVarV.s(jN)) {
                    }
                    i13 |= i25;
                } else {
                    jN = j11;
                }
                i13 |= i25;
            } else {
                jN = j11;
            }
            if ((i11 & 1572864) == 0) {
                if ((i12 & 64) == 0) {
                    jB = j12;
                    if (lVarV.s(jB)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    }
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i22 = PKIFailureInfo.signerNotTrusted;
                i13 |= i22;
            } else {
                jB = j12;
            }
            i18 = i13;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                }
                long j1113 = jB;
                long j1114 = jN;
                g4 g4Var12 = medium;
                androidx.compose.ui.d dVar13 = dVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                }
                int i2114 = ((i21 >> 3) & 14) | 1572864;
                int i2115 = i21 >> 9;
                lVar2 = lVarV;
                m2.a(dVar13, g4Var12, j1114, j1113, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i2114 | (i2115 & 112) | (i2115 & 896) | (i2115 & 7168), 48);
                if (o.J()) {
                    o.R();
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                dVar3 = dVar13;
                g4Var2 = g4Var12;
                j13 = j1114;
                j14 = j1113;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                }
                long j1115 = jB;
                long j1116 = jN;
                g4 g4Var13 = medium;
                androidx.compose.ui.d dVar14 = dVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                }
                int i2116 = ((i21 >> 3) & 14) | 1572864;
                int i2117 = i21 >> 9;
                lVar2 = lVarV;
                m2.a(dVar14, g4Var13, j1116, j1115, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i2116 | (i2117 & 112) | (i2117 & 896) | (i2117 & 7168), 48);
                if (o.J()) {
                    o.R();
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                dVar3 = dVar14;
                g4Var2 = g4Var13;
                j13 = j1116;
                j14 = j1115;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        pVar4 = pVar2;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                pVar5 = pVar3;
                if (lVarV.K(pVar5)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    medium = g4Var;
                    if (lVarV.n(medium)) {
                        i23 = 16384;
                    }
                    i13 |= i23;
                } else {
                    medium = g4Var;
                }
                i23 = PKIFailureInfo.certRevoked;
                i13 |= i23;
            } else {
                medium = g4Var;
            }
            if ((196608 & i11) == 0) {
                if ((i12 & 32) == 0) {
                    jN = j11;
                    if (lVarV.s(jN)) {
                    }
                    i13 |= i25;
                } else {
                    jN = j11;
                }
                i13 |= i25;
            } else {
                jN = j11;
            }
            if ((i11 & 1572864) == 0) {
                if ((i12 & 64) == 0) {
                    jB = j12;
                    if (lVarV.s(jB)) {
                        i22 = PKIFailureInfo.badCertTemplate;
                    }
                    i13 |= i22;
                } else {
                    jB = j12;
                }
                i22 = PKIFailureInfo.signerNotTrusted;
                i13 |= i22;
            } else {
                jB = j12;
            }
            i18 = i13;
            if ((i13 & 599187) == 599186) {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                }
                long j1117 = jB;
                long j1118 = jN;
                g4 g4Var14 = medium;
                androidx.compose.ui.d dVar15 = dVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                }
                int i2118 = ((i21 >> 3) & 14) | 1572864;
                int i2119 = i21 >> 9;
                lVar2 = lVarV;
                m2.a(dVar15, g4Var14, j1118, j1117, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i2118 | (i2119 & 112) | (i2119 & 896) | (i2119 & 7168), 48);
                if (o.J()) {
                    o.R();
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                dVar3 = dVar15;
                g4Var2 = g4Var14;
                j13 = j1118;
                j14 = j1117;
            } else {
                lVarV.L();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                } else {
                    if (i24 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    }
                    if (i16 != 0) {
                        pVar5 = null;
                    }
                    if ((i12 & 16) != 0) {
                        i19 = i18 & (-57345);
                        medium = j1.f74525a.b(lVarV, 6).getMedium();
                    } else {
                        i19 = i18;
                    }
                    if ((i12 & 32) != 0) {
                        jN = j1.f74525a.a(lVarV, 6).n();
                        i21 = i19 & (-458753);
                    } else {
                        i21 = i19;
                    }
                    if ((i12 & 64) != 0) {
                        jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                        i21 &= -3670017;
                    }
                }
                long j1119 = jB;
                long j11110 = jN;
                g4 g4Var15 = medium;
                androidx.compose.ui.d dVar16 = dVar2;
                lVarV.C();
                if (o.J()) {
                    o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
                }
                int i21110 = ((i21 >> 3) & 14) | 1572864;
                int i21111 = i21 >> 9;
                lVar2 = lVarV;
                m2.a(dVar16, g4Var15, j11110, j1119, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i21110 | (i21111 & 112) | (i21111 & 896) | (i21111 & 7168), 48);
                if (o.J()) {
                    o.R();
                }
                pVar6 = pVar4;
                pVar7 = pVar5;
                dVar3 = dVar16;
                g4Var2 = g4Var15;
                j13 = j11110;
                j14 = j1119;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
            }
        }
        i13 |= 3072;
        pVar5 = pVar3;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                medium = g4Var;
                if (lVarV.n(medium)) {
                    i23 = 16384;
                }
                i13 |= i23;
            } else {
                medium = g4Var;
            }
            i23 = PKIFailureInfo.certRevoked;
            i13 |= i23;
        } else {
            medium = g4Var;
        }
        if ((196608 & i11) == 0) {
            if ((i12 & 32) == 0) {
                jN = j11;
                if (lVarV.s(jN)) {
                }
                i13 |= i25;
            } else {
                jN = j11;
            }
            i13 |= i25;
        } else {
            jN = j11;
        }
        if ((i11 & 1572864) == 0) {
            if ((i12 & 64) == 0) {
                jB = j12;
                if (lVarV.s(jB)) {
                    i22 = PKIFailureInfo.badCertTemplate;
                }
                i13 |= i22;
            } else {
                jB = j12;
            }
            i22 = PKIFailureInfo.signerNotTrusted;
            i13 |= i22;
        } else {
            jB = j12;
        }
        i18 = i13;
        if ((i13 & 599187) == 599186) {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar4 = null;
                }
                if (i16 != 0) {
                    pVar5 = null;
                }
                if ((i12 & 16) != 0) {
                    i19 = i18 & (-57345);
                    medium = j1.f74525a.b(lVarV, 6).getMedium();
                } else {
                    i19 = i18;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i21 = i19 & (-458753);
                } else {
                    i21 = i19;
                }
                if ((i12 & 64) != 0) {
                    jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                    i21 &= -3670017;
                }
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar4 = null;
                }
                if (i16 != 0) {
                    pVar5 = null;
                }
                if ((i12 & 16) != 0) {
                    i19 = i18 & (-57345);
                    medium = j1.f74525a.b(lVarV, 6).getMedium();
                } else {
                    i19 = i18;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i21 = i19 & (-458753);
                } else {
                    i21 = i19;
                }
                if ((i12 & 64) != 0) {
                    jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                    i21 &= -3670017;
                }
            }
            long j11111 = jB;
            long j11112 = jN;
            g4 g4Var16 = medium;
            androidx.compose.ui.d dVar17 = dVar2;
            lVarV.C();
            if (o.J()) {
                o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
            }
            int i21112 = ((i21 >> 3) & 14) | 1572864;
            int i21113 = i21 >> 9;
            lVar2 = lVarV;
            m2.a(dVar17, g4Var16, j11112, j11111, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i21112 | (i21113 & 112) | (i21113 & 896) | (i21113 & 7168), 48);
            if (o.J()) {
                o.R();
            }
            pVar6 = pVar4;
            pVar7 = pVar5;
            dVar3 = dVar17;
            g4Var2 = g4Var16;
            j13 = j11112;
            j14 = j11111;
        } else {
            lVarV.L();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar4 = null;
                }
                if (i16 != 0) {
                    pVar5 = null;
                }
                if ((i12 & 16) != 0) {
                    i19 = i18 & (-57345);
                    medium = j1.f74525a.b(lVarV, 6).getMedium();
                } else {
                    i19 = i18;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i21 = i19 & (-458753);
                } else {
                    i21 = i19;
                }
                if ((i12 & 64) != 0) {
                    jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                    i21 &= -3670017;
                }
            } else {
                if (i24 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    pVar4 = null;
                }
                if (i16 != 0) {
                    pVar5 = null;
                }
                if ((i12 & 16) != 0) {
                    i19 = i18 & (-57345);
                    medium = j1.f74525a.b(lVarV, 6).getMedium();
                } else {
                    i19 = i18;
                }
                if ((i12 & 32) != 0) {
                    jN = j1.f74525a.a(lVarV, 6).n();
                    i21 = i19 & (-458753);
                } else {
                    i21 = i19;
                }
                if ((i12 & 64) != 0) {
                    jB = s.b(jN, lVarV, (i21 >> 15) & 14);
                    i21 &= -3670017;
                }
            }
            long j11113 = jB;
            long j11114 = jN;
            g4 g4Var17 = medium;
            androidx.compose.ui.d dVar18 = dVar2;
            lVarV.C();
            if (o.J()) {
                o.S(-453679601, i21, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:53)");
            }
            int i21114 = ((i21 >> 3) & 14) | 1572864;
            int i21115 = i21 >> 9;
            lVar2 = lVarV;
            m2.a(dVar18, g4Var17, j11114, j11113, null, BitmapDescriptorFactory.HUE_RED, z2.c.e(629950291, true, new c(pVar4, pVar5, pVar), lVarV, 54), lVar2, i21114 | (i21115 & 112) | (i21115 & 896) | (i21115 & 7168), 48);
            if (o.J()) {
                o.R();
            }
            pVar6 = pVar4;
            pVar7 = pVar5;
            dVar3 = dVar18;
            g4Var2 = g4Var17;
            j13 = j11114;
            j14 = j11113;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new d(pVar, dVar3, pVar6, pVar7, g4Var2, j13, j14, i11, i12));
        }
    }

    public static final void c(float f11, float f12, p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(73434452);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.q(f11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.q(f12) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(73434452, i12, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:193)");
            }
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new e(f11, f12);
                lVarV.B(objI);
            }
            i0 i0Var = (i0) objI;
            int i13 = (i12 >> 6) & 14;
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            int iA = j.a(lVarV, 0);
            x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, companion);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            int i14 = ((i13 << 6) & 896) | 6;
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0Var, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            pVar.invoke(lVarV, Integer.valueOf((i14 >> 6) & 14));
            lVarV.g();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(f11, f12, pVar, i11));
        }
    }
}
