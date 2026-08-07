package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.v;
import g4.y;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.n3;
import p020r2.w2;
import p020r2.x;
import p020r2.y3;
import z3.i0;
import z3.j0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Ljn0/h0;", "onDismissRequest", "Landroidx/compose/ui/window/j;", "properties", "content", "a", "(Lwn0/a;Landroidx/compose/ui/window/j;Lwn0/p;Lr2/l;II)V", "Landroidx/compose/ui/d;", "modifier", "c", "(Landroidx/compose/ui/d;Lwn0/p;Lr2/l;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f6292c;

        /* JADX INFO: renamed from: androidx.compose.ui.window.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$a$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0139a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f6293a;

            public C0139a(l lVar) {
                this.f6293a = lVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f6293a.dismiss();
                this.f6293a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar) {
            super(1);
            this.f6292c = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f6292c.show();
            return new C0139a(this.f6292c);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class C0140b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f6294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f6295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f6296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w4.t f6297f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0140b(l lVar, wn0.a<h0> aVar, j jVar, w4.t tVar) {
            super(0);
            this.f6294c = lVar;
            this.f6295d = aVar;
            this.f6296e = jVar;
            this.f6297f = tVar;
        }

        public final void b() {
            this.f6294c.l(this.f6295d, this.f6296e, this.f6297f);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f6298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f6299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f6300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6302g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.a<h0> aVar, j jVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f6298c = aVar;
            this.f6299d = jVar;
            this.f6300e = pVar;
            this.f6301f = i11;
            this.f6302g = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.a(this.f6298c, this.f6299d, this.f6300e, lVar, k2.a(this.f6301f | 1), this.f6302g);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y3<wn0.p<p020r2.l, Integer, h0>> f6303c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f6304c = new a();

            a() {
                super(1);
            }

            public final void a(y yVar) {
                v.k(yVar);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
                a(yVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.window.b$d$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C0141b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<wn0.p<p020r2.l, Integer, h0>> f6305c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0141b(y3<? extends wn0.p<? super p020r2.l, ? super Integer, h0>> y3Var) {
                super(2);
                this.f6305c = y3Var;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-533674951, i11, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                }
                b.b(this.f6305c).invoke(lVar, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(y3<? extends wn0.p<? super p020r2.l, ? super Integer, h0>> y3Var) {
            super(2);
            this.f6303c = y3Var;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(488261145, i11, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
            }
            b.c(g4.o.d(androidx.compose.ui.d.INSTANCE, false, a.f6304c, 1, null), z2.c.e(-533674951, true, new C0141b(this.f6303c), lVar, 54), lVar, 48, 0);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<UUID> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f6306c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class f implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f6307a = new f();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<w0> f6308c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends w0> list) {
                super(1);
                this.f6308c = list;
            }

            public final void a(w0.a aVar) {
                List<w0> list = this.f6308c;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    w0.a.l(aVar, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }
        }

        f() {
        }

        @Override // z3.i0
        public final j0 c(z3.k0 k0Var, List<? extends z3.h0> list, long j11) {
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).x0(j11));
            }
            Object obj2 = null;
            int i12 = 1;
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(0);
                int i13 = ((w0) obj).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                int iO = p013kotlin.collections.v.o(arrayList);
                if (1 <= iO) {
                    int i14 = 1;
                    while (true) {
                        Object obj3 = arrayList.get(i14);
                        int i15 = ((w0) obj3).getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                        if (i13 < i15) {
                            obj = obj3;
                            i13 = i15;
                        }
                        if (i14 == iO) {
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                obj = null;
            }
            w0 w0Var = (w0) obj;
            int i16 = w0Var != null ? w0Var.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() : w4.b.n(j11);
            if (!arrayList.isEmpty()) {
                Object obj4 = arrayList.get(0);
                int i17 = ((w0) obj4).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                int iO2 = p013kotlin.collections.v.o(arrayList);
                if (1 <= iO2) {
                    while (true) {
                        Object obj5 = arrayList.get(i12);
                        int i18 = ((w0) obj5).getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                        if (i17 < i18) {
                            obj4 = obj5;
                            i17 = i18;
                        }
                        if (i12 == iO2) {
                            break;
                        }
                        i12++;
                    }
                }
                obj2 = obj4;
            }
            w0 w0Var2 = (w0) obj2;
            return z3.k0.N1(k0Var, i16, w0Var2 != null ? w0Var2.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() : w4.b.m(j11), null, new a(arrayList), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f6309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f6310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6312f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.d dVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f6309c = dVar;
            this.f6310d = pVar;
            this.f6311e = i11;
            this.f6312f = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            b.c(this.f6309c, this.f6310d, lVar, k2.a(this.f6311e | 1), this.f6312f);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0157  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void a(wn0.a<h0> aVar, j jVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        j jVar2;
        int i14;
        View view;
        w4.d dVar;
        w4.t tVar;
        p020r2.q qVarD;
        y3 y3VarO;
        UUID uuid;
        boolean zN;
        j jVar3;
        char c11;
        w4.t tVar2;
        Object obj;
        l lVar2;
        boolean zK;
        Object objI;
        boolean z11;
        boolean z12;
        boolean zN2;
        Object objI2;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(-2032877254);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.K(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 == 0) {
            if ((i11 & 48) == 0) {
                jVar2 = jVar;
                i13 |= lVarV.n(jVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                if (lVarV.K(pVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i13 & 147) == 146 || !lVarV.b()) {
                if (i15 != 0) {
                    jVar2 = new j(false, false, false, 7, (DefaultConstructorMarker) null);
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-2032877254, i13, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
                }
                view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
                dVar = (w4.d) lVarV.U(z0.g());
                tVar = (w4.t) lVarV.U(z0.m());
                qVarD = p020r2.j.d(lVarV, 0);
                y3VarO = n3.o(pVar, lVarV, (i13 >> 6) & 14);
                uuid = (UUID) a3.b.c(new Object[0], null, null, e.f6306c, lVarV, 3072, 6);
                zN = lVarV.n(view) | lVarV.n(dVar);
                Object objI3 = lVarV.I();
                if (!zN || objI3 == p020r2.l.INSTANCE.a()) {
                    jVar3 = jVar2;
                    c11 = 4;
                    tVar2 = tVar;
                    l lVar3 = new l(aVar, jVar3, view, tVar2, dVar, uuid);
                    lVar3.i(qVarD, z2.c.c(488261145, true, new d(y3VarO)));
                    lVarV.B(lVar3);
                    obj = lVar3;
                } else {
                    jVar3 = jVar2;
                    obj = objI3;
                    tVar2 = tVar;
                    c11 = 4;
                }
                lVar2 = (l) obj;
                zK = lVarV.K(lVar2);
                objI = lVarV.I();
                if (zK || objI == p020r2.l.INSTANCE.a()) {
                    objI = new a(lVar2);
                    lVarV.B(objI);
                }
                Function0.c(lVar2, (wn0.l) objI, lVarV, 0);
                boolean zK2 = lVarV.K(lVar2);
                if ((i13 & 14) == c11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = zK2 | z11;
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zN2 = z13 | z12 | lVarV.n(tVar2);
                objI2 = lVarV.I();
                if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                    objI2 = new C0140b(lVar2, aVar, jVar3, tVar2);
                    lVarV.B(objI2);
                }
                Function0.i((wn0.a) objI2, lVarV, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                lVarV.j();
                jVar3 = jVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new c(aVar, jVar3, pVar, i11, i12));
            }
        }
        i13 |= 48;
        jVar2 = jVar;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            if (lVarV.K(pVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 147) == 146) {
            if (i15 != 0) {
                jVar2 = new j(false, false, false, 7, (DefaultConstructorMarker) null);
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2032877254, i13, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
            }
            view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
            dVar = (w4.d) lVarV.U(z0.g());
            tVar = (w4.t) lVarV.U(z0.m());
            qVarD = p020r2.j.d(lVarV, 0);
            y3VarO = n3.o(pVar, lVarV, (i13 >> 6) & 14);
            uuid = (UUID) a3.b.c(new Object[0], null, null, e.f6306c, lVarV, 3072, 6);
            zN = lVarV.n(view) | lVarV.n(dVar);
            Object objI4 = lVarV.I();
            if (zN) {
                jVar3 = jVar2;
                c11 = 4;
                tVar2 = tVar;
                l lVar4 = new l(aVar, jVar3, view, tVar2, dVar, uuid);
                lVar4.i(qVarD, z2.c.c(488261145, true, new d(y3VarO)));
                lVarV.B(lVar4);
                obj = lVar4;
            } else {
                jVar3 = jVar2;
                c11 = 4;
                tVar2 = tVar;
                l lVar5 = new l(aVar, jVar3, view, tVar2, dVar, uuid);
                lVar5.i(qVarD, z2.c.c(488261145, true, new d(y3VarO)));
                lVarV.B(lVar5);
                obj = lVar5;
            }
            lVar2 = (l) obj;
            zK = lVarV.K(lVar2);
            objI = lVarV.I();
            if (zK) {
                objI = new a(lVar2);
                lVarV.B(objI);
            } else {
                objI = new a(lVar2);
                lVarV.B(objI);
            }
            Function0.c(lVar2, (wn0.l) objI, lVarV, 0);
            boolean zK3 = lVarV.K(lVar2);
            if ((i13 & 14) == c11) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = zK3 | z11;
            if ((i13 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            zN2 = z14 | z12 | lVarV.n(tVar2);
            objI2 = lVarV.I();
            if (zN2) {
                objI2 = new C0140b(lVar2, aVar, jVar3, tVar2);
                lVarV.B(objI2);
            } else {
                objI2 = new C0140b(lVar2, aVar, jVar3, tVar2);
                lVarV.B(objI2);
            }
            Function0.i((wn0.a) objI2, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        } else {
            if (i15 != 0) {
                jVar2 = new j(false, false, false, 7, (DefaultConstructorMarker) null);
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-2032877254, i13, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:166)");
            }
            view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
            dVar = (w4.d) lVarV.U(z0.g());
            tVar = (w4.t) lVarV.U(z0.m());
            qVarD = p020r2.j.d(lVarV, 0);
            y3VarO = n3.o(pVar, lVarV, (i13 >> 6) & 14);
            uuid = (UUID) a3.b.c(new Object[0], null, null, e.f6306c, lVarV, 3072, 6);
            zN = lVarV.n(view) | lVarV.n(dVar);
            Object objI5 = lVarV.I();
            if (zN) {
                jVar3 = jVar2;
                c11 = 4;
                tVar2 = tVar;
                l lVar6 = new l(aVar, jVar3, view, tVar2, dVar, uuid);
                lVar6.i(qVarD, z2.c.c(488261145, true, new d(y3VarO)));
                lVarV.B(lVar6);
                obj = lVar6;
            } else {
                jVar3 = jVar2;
                c11 = 4;
                tVar2 = tVar;
                l lVar7 = new l(aVar, jVar3, view, tVar2, dVar, uuid);
                lVar7.i(qVarD, z2.c.c(488261145, true, new d(y3VarO)));
                lVarV.B(lVar7);
                obj = lVar7;
            }
            lVar2 = (l) obj;
            zK = lVarV.K(lVar2);
            objI = lVarV.I();
            if (zK) {
                objI = new a(lVar2);
                lVarV.B(objI);
            } else {
                objI = new a(lVar2);
                lVarV.B(objI);
            }
            Function0.c(lVar2, (wn0.l) objI, lVarV, 0);
            boolean zK4 = lVarV.K(lVar2);
            if ((i13 & 14) == c11) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = zK4 | z11;
            if ((i13 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            zN2 = z15 | z12 | lVarV.n(tVar2);
            objI2 = lVarV.I();
            if (zN2) {
                objI2 = new C0140b(lVar2, aVar, jVar3, tVar2);
                lVarV.B(objI2);
            } else {
                objI2 = new C0140b(lVar2, aVar, jVar3, tVar2);
                lVarV.B(objI2);
            }
            Function0.i((wn0.a) objI2, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(aVar, jVar3, pVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.p<p020r2.l, Integer, h0> b(y3<? extends wn0.p<? super p020r2.l, ? super Integer, h0>> y3Var) {
        return (wn0.p) y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.d dVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(-1177876616);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1177876616, i13, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f fVar = f.f6307a;
            int i15 = ((i13 >> 3) & 14) | KyberEngine.KyberPolyBytes | ((i13 << 3) & 112);
            int iA = p020r2.j.a(lVarV, 0);
            x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            int i16 = ((i15 << 6) & 896) | 6;
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, fVar, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion.d());
            pVar.invoke(lVarV, Integer.valueOf((i16 >> 6) & 14));
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(dVar, pVar, i11, i12));
        }
    }
}
