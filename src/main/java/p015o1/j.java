package p015o1;

import androidx.collection.k0;
import androidx.collection.u0;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import jn0.h0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.g0;
import p019p1.l1;
import p019p1.m;
import p019p1.m1;
import p019p1.p1;
import p019p1.r1;
import p020r2.d4;
import p020r2.k2;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y3;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u0012\u0010\u0013\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {"T", "targetState", "Landroidx/compose/ui/d;", "modifier", "Lp1/g0;", "", "animationSpec", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Ljn0/h0;", "content", "a", "(Ljava/lang/Object;Landroidx/compose/ui/d;Lp1/g0;Ljava/lang/String;Lwn0/q;Lr2/l;II)V", "Lp1/l1;", "", "contentKey", "b", "(Lp1/l1;Landroidx/compose/ui/d;Lp1/g0;Lwn0/l;Lwn0/q;Lr2/l;II)V", "alpha", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f95654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0<Float> f95656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f95657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<T, l, Integer, h0> f95658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f95659h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95660i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t11, androidx.compose.ui.d dVar, g0<Float> g0Var, String str, q<? super T, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f95654c = t11;
            this.f95655d = dVar;
            this.f95656e = g0Var;
            this.f95657f = str;
            this.f95658g = qVar;
            this.f95659h = i11;
            this.f95660i = i12;
        }

        public final void a(l lVar, int i11) {
            j.a(this.f95654c, this.f95655d, this.f95656e, this.f95657f, this.f95658g, lVar, k2.a(this.f95659h | 1), this.f95660i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<T> extends u implements wn0.l<T, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f95662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l1<T> l1Var) {
            super(1);
            this.f95662c = l1Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // wn0.l
        public final Boolean invoke(T t11) {
            return Boolean.valueOf(!s.f(t11, this.f95662c.p()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f95663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0<Float> f95664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f95665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<T, l, Integer, h0> f95666f;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<androidx.compose.ui.graphics.c, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<Float> f95667c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<Float> y3Var) {
                super(1);
                this.f95667c = y3Var;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.a(d.c(this.f95667c));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(androidx.compose.ui.graphics.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lp1/l1$b;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> extends u implements q<l1.b<T>, l, Integer, g0<Float>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0<Float> f95668c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(g0<Float> g0Var) {
                super(3);
                this.f95668c = g0Var;
            }

            public final g0<Float> a(l1.b<T> bVar, l lVar, int i11) {
                lVar.o(438406499);
                if (o.J()) {
                    o.S(438406499, i11, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
                }
                g0<Float> g0Var = this.f95668c;
                if (o.J()) {
                    o.R();
                }
                lVar.l();
                return g0Var;
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ g0<Float> invoke(Object obj, l lVar, Integer num) {
                return a((l1.b) obj, lVar, num.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(l1<T> l1Var, g0<Float> g0Var, T t11, q<? super T, ? super l, ? super Integer, h0> qVar) {
            super(2);
            this.f95663c = l1Var;
            this.f95664d = g0Var;
            this.f95665e = t11;
            this.f95666f = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float c(y3<Float> y3Var) {
            return y3Var.getValue().floatValue();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void b(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1426421288, i11, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            l1<T> l1Var = this.f95663c;
            b bVar = new b(this.f95664d);
            T t11 = this.f95665e;
            p1<Float, m> p1VarE = r1.e(p013kotlin.jvm.internal.l.f86526a);
            Object objI = l1Var.i();
            lVar.o(-438678252);
            if (o.J()) {
                o.S(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            boolean zF = s.f(objI, t11);
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float f12 = zF ? 1.0f : 0.0f;
            if (o.J()) {
                o.R();
            }
            lVar.l();
            Float fValueOf = Float.valueOf(f12);
            Object objP = l1Var.p();
            lVar.o(-438678252);
            if (o.J()) {
                o.S(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            if (s.f(objP, t11)) {
                f11 = 1.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVar.l();
            y3 y3VarD = m1.d(l1Var, fValueOf, Float.valueOf(f11), bVar.invoke(l1Var.n(), lVar, 0), p1VarE, "FloatAnimation", lVar, 0);
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            boolean zN = lVar.n(y3VarD);
            Object objI2 = lVar.I();
            if (zN || objI2 == l.INSTANCE.a()) {
                objI2 = new a(y3VarD);
                lVar.B(objI2);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.b.a(companion, (wn0.l) objI2);
            q<T, l, Integer, h0> qVar = this.f95666f;
            T t12 = this.f95665e;
            i0 i0VarH = g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarH, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, companion2.d());
            i iVar = i.f4585a;
            qVar.invoke(t12, lVar, 0);
            lVar.g();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            b(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l1<T> f95669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f95670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g0<Float> f95671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<T, Object> f95672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<T, l, Integer, h0> f95673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f95674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f95675i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(l1<T> l1Var, androidx.compose.ui.d dVar, g0<Float> g0Var, wn0.l<? super T, ? extends Object> lVar, q<? super T, ? super l, ? super Integer, h0> qVar, int i11, int i12) {
            super(2);
            this.f95669c = l1Var;
            this.f95670d = dVar;
            this.f95671e = g0Var;
            this.f95672f = lVar;
            this.f95673g = qVar;
            this.f95674h = i11;
            this.f95675i = i12;
        }

        public final void a(l lVar, int i11) {
            j.b(this.f95669c, this.f95670d, this.f95671e, this.f95672f, this.f95673g, lVar, k2.a(this.f95674h | 1), this.f95675i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final <T> void a(T t11, androidx.compose.ui.d dVar, g0<Float> g0Var, String str, q<? super T, ? super l, ? super Integer, h0> qVar, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        g0<Float> g0Var2;
        int i15;
        int i16;
        String str2;
        int i17;
        q<? super T, ? super l, ? super Integer, h0> qVar2;
        int i18;
        androidx.compose.ui.d dVar3;
        g0<Float> g0VarL;
        String str3;
        androidx.compose.ui.d dVar4;
        g0<Float> g0Var3;
        String str4;
        w2 w2VarX;
        l lVarV = lVar.v(-310686752);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? lVarV.n(t11) : lVarV.K(t11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    g0Var2 = g0Var;
                    if (lVarV.K(g0Var2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        str2 = str;
                        if (lVarV.n(str2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 16) != 0) {
                        i13 |= 24576;
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar;
                        if ((i11 & 24576) == 0) {
                            if (lVarV.K(qVar2)) {
                                i18 = 16384;
                            } else {
                                i18 = PKIFailureInfo.certRevoked;
                            }
                            i13 |= i18;
                        }
                    }
                    if ((i13 & 9363) == 9362 || !lVarV.b()) {
                        if (i19 != 0) {
                            dVar3 = androidx.compose.ui.d.INSTANCE;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i14 != 0) {
                            g0VarL = p019p1.j.l(0, 0, null, 7, null);
                        } else {
                            g0VarL = g0Var2;
                        }
                        if (i16 != 0) {
                            str3 = "Crossfade";
                        } else {
                            str3 = str2;
                        }
                        if (o.J()) {
                            o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        androidx.compose.ui.d dVar5 = dVar3;
                        g0<Float> g0Var4 = g0VarL;
                        b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar5, g0Var4, null, qVar2, lVarV, i13 & 58352, 4);
                        if (o.J()) {
                            o.R();
                        }
                        dVar4 = dVar5;
                        g0Var3 = g0Var4;
                        str4 = str3;
                    } else {
                        lVarV.j();
                        dVar4 = dVar2;
                        g0Var3 = g0Var2;
                        str4 = str2;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
                    }
                }
                i13 |= 3072;
                str2 = str;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 24576) == 0) {
                        if (lVarV.K(qVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    androidx.compose.ui.d dVar6 = dVar3;
                    g0<Float> g0Var5 = g0VarL;
                    b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar6, g0Var5, null, qVar2, lVarV, i13 & 58352, 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar6;
                    g0Var3 = g0Var5;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    androidx.compose.ui.d dVar7 = dVar3;
                    g0<Float> g0Var6 = g0VarL;
                    b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar7, g0Var6, null, qVar2, lVarV, i13 & 58352, 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar7;
                    g0Var3 = g0Var6;
                    str4 = str3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            g0Var2 = g0Var;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 24576) == 0) {
                        if (lVarV.K(qVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    androidx.compose.ui.d dVar8 = dVar3;
                    g0<Float> g0Var7 = g0VarL;
                    b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar8, g0Var7, null, qVar2, lVarV, i13 & 58352, 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar8;
                    g0Var3 = g0Var7;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    androidx.compose.ui.d dVar9 = dVar3;
                    g0<Float> g0Var8 = g0VarL;
                    b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar9, g0Var8, null, qVar2, lVarV, i13 & 58352, 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar9;
                    g0Var3 = g0Var8;
                    str4 = str3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            str2 = str;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 24576) == 0) {
                    if (lVarV.K(qVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                androidx.compose.ui.d dVar10 = dVar3;
                g0<Float> g0Var9 = g0VarL;
                b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar10, g0Var9, null, qVar2, lVarV, i13 & 58352, 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar10;
                g0Var3 = g0Var9;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                androidx.compose.ui.d dVar11 = dVar3;
                g0<Float> g0Var10 = g0VarL;
                b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar11, g0Var10, null, qVar2, lVarV, i13 & 58352, 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar11;
                g0Var3 = g0Var10;
                str4 = str3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                g0Var2 = g0Var;
                if (lVarV.K(g0Var2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    str2 = str;
                    if (lVarV.n(str2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                    qVar2 = qVar;
                } else {
                    qVar2 = qVar;
                    if ((i11 & 24576) == 0) {
                        if (lVarV.K(qVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    androidx.compose.ui.d dVar12 = dVar3;
                    g0<Float> g0Var11 = g0VarL;
                    b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar12, g0Var11, null, qVar2, lVarV, i13 & 58352, 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar12;
                    g0Var3 = g0Var11;
                    str4 = str3;
                } else {
                    if (i19 != 0) {
                        dVar3 = androidx.compose.ui.d.INSTANCE;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (o.J()) {
                        o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    androidx.compose.ui.d dVar13 = dVar3;
                    g0<Float> g0Var12 = g0VarL;
                    b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar13, g0Var12, null, qVar2, lVarV, i13 & 58352, 4);
                    if (o.J()) {
                        o.R();
                    }
                    dVar4 = dVar13;
                    g0Var3 = g0Var12;
                    str4 = str3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            str2 = str;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 24576) == 0) {
                    if (lVarV.K(qVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                androidx.compose.ui.d dVar14 = dVar3;
                g0<Float> g0Var13 = g0VarL;
                b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar14, g0Var13, null, qVar2, lVarV, i13 & 58352, 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar14;
                g0Var3 = g0Var13;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                androidx.compose.ui.d dVar15 = dVar3;
                g0<Float> g0Var14 = g0VarL;
                b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar15, g0Var14, null, qVar2, lVarV, i13 & 58352, 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar15;
                g0Var3 = g0Var14;
                str4 = str3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        g0Var2 = g0Var;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                str2 = str;
                if (lVarV.n(str2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i11 & 24576) == 0) {
                    if (lVarV.K(qVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                androidx.compose.ui.d dVar16 = dVar3;
                g0<Float> g0Var15 = g0VarL;
                b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar16, g0Var15, null, qVar2, lVarV, i13 & 58352, 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar16;
                g0Var3 = g0Var15;
                str4 = str3;
            } else {
                if (i19 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (o.J()) {
                    o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                androidx.compose.ui.d dVar17 = dVar3;
                g0<Float> g0Var16 = g0VarL;
                b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar17, g0Var16, null, qVar2, lVarV, i13 & 58352, 4);
                if (o.J()) {
                    o.R();
                }
                dVar4 = dVar17;
                g0Var3 = g0Var16;
                str4 = str3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        str2 = str;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i11 & 24576) == 0) {
                if (lVarV.K(qVar2)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
        }
        if ((i13 & 9363) == 9362) {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                g0VarL = p019p1.j.l(0, 0, null, 7, null);
            } else {
                g0VarL = g0Var2;
            }
            if (i16 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            androidx.compose.ui.d dVar18 = dVar3;
            g0<Float> g0Var17 = g0VarL;
            b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar18, g0Var17, null, qVar2, lVarV, i13 & 58352, 4);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar18;
            g0Var3 = g0Var17;
            str4 = str3;
        } else {
            if (i19 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (i14 != 0) {
                g0VarL = p019p1.j.l(0, 0, null, 7, null);
            } else {
                g0VarL = g0Var2;
            }
            if (i16 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (o.J()) {
                o.S(-310686752, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            androidx.compose.ui.d dVar19 = dVar3;
            g0<Float> g0Var18 = g0VarL;
            b(m1.g(t11, str3, lVarV, (i13 & 14) | ((i13 >> 6) & 112), 0), dVar19, g0Var18, null, qVar2, lVarV, i13 & 58352, 4);
            if (o.J()) {
                o.R();
            }
            dVar4 = dVar19;
            g0Var3 = g0Var18;
            str4 = str3;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(t11, dVar4, g0Var3, str4, qVar, i11, i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016d  */
    /* JADX WARN: Code duplicated, block: B:105:0x017e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195 A[LOOP:0: B:103:0x0178->B:108:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x019b  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b4 A[LOOP:1: B:114:0x01b2->B:115:0x01b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0208  */
    /* JADX WARN: Code duplicated, block: B:124:0x020c  */
    /* JADX WARN: Code duplicated, block: B:127:0x022b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0239  */
    /* JADX WARN: Code duplicated, block: B:132:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0273  */
    /* JADX WARN: Code duplicated, block: B:135:0x027e  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0199 A[EDGE_INSN: B:146:0x0199->B:110:0x0199 BREAK  A[LOOP:0: B:103:0x0178->B:108:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:88:0x012a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x015a  */
    public static final <T> void b(l1<T> l1Var, androidx.compose.ui.d dVar, g0<Float> g0Var, wn0.l<? super T, ? extends Object> lVar, q<? super T, ? super l, ? super Integer, h0> qVar, l lVar2, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        g0<Float> g0Var2;
        int i15;
        int i16;
        wn0.l<? super T, ? extends Object> lVar3;
        int i17;
        int i18;
        g0<Float> g0VarL;
        wn0.l<? super T, ? extends Object> lVar4;
        Object objI;
        l.Companion companion;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objI2;
        k0 k0Var;
        int iA;
        wn0.a<b4.g> aVarA;
        l lVarA;
        p<b4.g, Integer, h0> pVarB;
        int size;
        int i19;
        g0<Float> g0Var3;
        wn0.l<? super T, ? extends Object> lVar5;
        p pVar;
        Iterator<T> it;
        int i21;
        int size2;
        int i22;
        boolean z11;
        Object objI3;
        w2 w2VarX;
        l lVarV = lVar2.v(679005231);
        if ((i12 & Integer.MIN_VALUE) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(l1Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i23 = i12 & 1;
        if (i23 == 0) {
            if ((i11 & 48) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            i14 = i12 & 2;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    g0Var2 = g0Var;
                    if (lVarV.K(g0Var2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 4;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        lVar3 = lVar;
                        if (lVarV.K(lVar3)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 8) != 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        if (lVarV.K(qVar)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 9363) == 9362 || !lVarV.b()) {
                        if (i23 != 0) {
                            dVar2 = androidx.compose.ui.d.INSTANCE;
                        }
                        if (i14 != 0) {
                            g0VarL = p019p1.j.l(0, 0, null, 7, null);
                        } else {
                            g0VarL = g0Var2;
                        }
                        if (i16 != 0) {
                            lVar4 = b.f95661c;
                        } else {
                            lVar4 = lVar3;
                        }
                        if (o.J()) {
                            o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                        }
                        objI = lVarV.I();
                        companion = l.INSTANCE;
                        obj = objI;
                        if (objI == companion.a()) {
                            SnapshotStateList snapshotStateListF = n3.f();
                            snapshotStateListF.add(l1Var.i());
                            lVarV.B(snapshotStateListF);
                            obj = snapshotStateListF;
                        }
                        snapshotStateList = (SnapshotStateList) obj;
                        objI2 = lVarV.I();
                        if (objI2 == companion.a()) {
                            objI2 = u0.d();
                            lVarV.B(objI2);
                        }
                        k0Var = (k0) objI2;
                        if (s.f(l1Var.i(), l1Var.p())) {
                            lVarV.o(860660313);
                            if (snapshotStateList.size() == 1 || !s.f(snapshotStateList.get(0), l1Var.p())) {
                                lVarV.o(860794667);
                                if ((i13 & 14) == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objI3 = lVarV.I();
                                if (z11 || objI3 == companion.a()) {
                                    objI3 = new c(l1Var);
                                    lVarV.B(objI3);
                                }
                                v.L(snapshotStateList, (wn0.l) objI3);
                                k0Var.i();
                                lVarV.l();
                            } else {
                                lVarV.o(860984945);
                                lVarV.l();
                            }
                            lVarV.l();
                        } else {
                            lVarV.o(860990897);
                            lVarV.l();
                        }
                        if (k0Var.a(l1Var.p())) {
                            lVarV.o(861812273);
                            lVarV.l();
                        } else {
                            lVarV.o(861052122);
                            it = snapshotStateList.iterator();
                            i21 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i21 = -1;
                                    break;
                                } else if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                } else {
                                    i21++;
                                }
                            }
                            if (i21 == -1) {
                                snapshotStateList.add(l1Var.p());
                            } else {
                                snapshotStateList.set(i21, l1Var.p());
                            }
                            k0Var.i();
                            size2 = snapshotStateList.size();
                            for (i22 = 0; i22 < size2; i22++) {
                                T t11 = snapshotStateList.get(i22);
                                k0Var.s(t11, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t11, qVar), lVarV, 54));
                            }
                            lVarV.l();
                        }
                        i0 i0VarH = g.h(d3.c.INSTANCE.o(), false);
                        iA = p020r2.j.a(lVarV, 0);
                        x xVarC = lVarV.c();
                        androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVar2);
                        b4.g.Companion companion2 = b4.g.INSTANCE;
                        aVarA = companion2.a();
                        if (lVarV.w() == null) {
                            p020r2.j.c();
                        }
                        lVarV.h();
                        if (lVarV.getInserting()) {
                            lVarV.z(aVarA);
                        } else {
                            lVarV.d();
                        }
                        lVarA = d4.a(lVarV);
                        d4.b(lVarA, i0VarH, companion2.c());
                        d4.b(lVarA, xVarC, companion2.e());
                        pVarB = companion2.b();
                        if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                            lVarA.B(Integer.valueOf(iA));
                            lVarA.f(Integer.valueOf(iA), pVarB);
                        }
                        d4.b(lVarA, dVarE, companion2.d());
                        i iVar = i.f4585a;
                        lVarV.o(-187482432);
                        size = snapshotStateList.size();
                        for (i19 = 0; i19 < size; i19++) {
                            T t12 = snapshotStateList.get(i19);
                            lVarV.M(-1081873445, lVar4.invoke(t12));
                            pVar = (p) k0Var.c(t12);
                            if (pVar == null) {
                                lVarV.o(821713034);
                                lVarV.l();
                            } else {
                                lVarV.o(-1081871785);
                                pVar.invoke(lVarV, 0);
                                lVarV.l();
                            }
                            lVarV.S();
                        }
                        lVarV.l();
                        lVarV.g();
                        if (o.J()) {
                            o.R();
                        }
                        g0Var3 = g0VarL;
                        lVar5 = lVar4;
                    } else {
                        lVarV.j();
                        g0Var3 = g0Var2;
                        lVar5 = lVar3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
                    }
                }
                i13 |= 3072;
                lVar3 = lVar;
                if ((i12 & 8) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        lVar4 = b.f95661c;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    obj = objI;
                    if (objI == companion.a()) {
                        SnapshotStateList snapshotStateListF2 = n3.f();
                        snapshotStateListF2.add(l1Var.i());
                        lVarV.B(snapshotStateListF2);
                        obj = snapshotStateListF2;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = u0.d();
                        lVarV.B(objI2);
                    }
                    k0Var = (k0) objI2;
                    if (s.f(l1Var.i(), l1Var.p())) {
                        lVarV.o(860660313);
                        if (snapshotStateList.size() == 1) {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        } else {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(860990897);
                        lVarV.l();
                    }
                    if (k0Var.a(l1Var.p())) {
                        lVarV.o(861052122);
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else {
                                if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(l1Var.p());
                        } else {
                            snapshotStateList.set(i21, l1Var.p());
                        }
                        k0Var.i();
                        size2 = snapshotStateList.size();
                        while (i22 < size2) {
                            T t13 = snapshotStateList.get(i22);
                            k0Var.s(t13, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t13, qVar), lVarV, 54));
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(861812273);
                        lVarV.l();
                    }
                    i0 i0VarH2 = g.h(d3.c.INSTANCE.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC2 = lVarV.c();
                    androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVar2);
                    b4.g.Companion companion3 = b4.g.INSTANCE;
                    aVarA = companion3.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarH2, companion3.c());
                    d4.b(lVarA, xVarC2, companion3.e());
                    pVarB = companion3.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE2, companion3.d());
                    i iVar2 = i.f4585a;
                    lVarV.o(-187482432);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        T t14 = snapshotStateList.get(i19);
                        lVarV.M(-1081873445, lVar4.invoke(t14));
                        pVar = (p) k0Var.c(t14);
                        if (pVar == null) {
                            lVarV.o(821713034);
                            lVarV.l();
                        } else {
                            lVarV.o(-1081871785);
                            pVar.invoke(lVarV, 0);
                            lVarV.l();
                        }
                        lVarV.S();
                    }
                    lVarV.l();
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    g0Var3 = g0VarL;
                    lVar5 = lVar4;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        lVar4 = b.f95661c;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    obj = objI;
                    if (objI == companion.a()) {
                        SnapshotStateList snapshotStateListF3 = n3.f();
                        snapshotStateListF3.add(l1Var.i());
                        lVarV.B(snapshotStateListF3);
                        obj = snapshotStateListF3;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = u0.d();
                        lVarV.B(objI2);
                    }
                    k0Var = (k0) objI2;
                    if (s.f(l1Var.i(), l1Var.p())) {
                        lVarV.o(860660313);
                        if (snapshotStateList.size() == 1) {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        } else {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(860990897);
                        lVarV.l();
                    }
                    if (k0Var.a(l1Var.p())) {
                        lVarV.o(861052122);
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else {
                                if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(l1Var.p());
                        } else {
                            snapshotStateList.set(i21, l1Var.p());
                        }
                        k0Var.i();
                        size2 = snapshotStateList.size();
                        while (i22 < size2) {
                            T t15 = snapshotStateList.get(i22);
                            k0Var.s(t15, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t15, qVar), lVarV, 54));
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(861812273);
                        lVarV.l();
                    }
                    i0 i0VarH3 = g.h(d3.c.INSTANCE.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC3 = lVarV.c();
                    androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVar2);
                    b4.g.Companion companion4 = b4.g.INSTANCE;
                    aVarA = companion4.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarH3, companion4.c());
                    d4.b(lVarA, xVarC3, companion4.e());
                    pVarB = companion4.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE3, companion4.d());
                    i iVar3 = i.f4585a;
                    lVarV.o(-187482432);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        T t16 = snapshotStateList.get(i19);
                        lVarV.M(-1081873445, lVar4.invoke(t16));
                        pVar = (p) k0Var.c(t16);
                        if (pVar == null) {
                            lVarV.o(821713034);
                            lVarV.l();
                        } else {
                            lVarV.o(-1081871785);
                            pVar.invoke(lVarV, 0);
                            lVarV.l();
                        }
                        lVarV.S();
                    }
                    lVarV.l();
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    g0Var3 = g0VarL;
                    lVar5 = lVar4;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            g0Var2 = g0Var;
            i16 = i12 & 4;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    lVar3 = lVar;
                    if (lVarV.K(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        lVar4 = b.f95661c;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    obj = objI;
                    if (objI == companion.a()) {
                        SnapshotStateList snapshotStateListF4 = n3.f();
                        snapshotStateListF4.add(l1Var.i());
                        lVarV.B(snapshotStateListF4);
                        obj = snapshotStateListF4;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = u0.d();
                        lVarV.B(objI2);
                    }
                    k0Var = (k0) objI2;
                    if (s.f(l1Var.i(), l1Var.p())) {
                        lVarV.o(860660313);
                        if (snapshotStateList.size() == 1) {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        } else {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(860990897);
                        lVarV.l();
                    }
                    if (k0Var.a(l1Var.p())) {
                        lVarV.o(861052122);
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else {
                                if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(l1Var.p());
                        } else {
                            snapshotStateList.set(i21, l1Var.p());
                        }
                        k0Var.i();
                        size2 = snapshotStateList.size();
                        while (i22 < size2) {
                            T t17 = snapshotStateList.get(i22);
                            k0Var.s(t17, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t17, qVar), lVarV, 54));
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(861812273);
                        lVarV.l();
                    }
                    i0 i0VarH4 = g.h(d3.c.INSTANCE.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC4 = lVarV.c();
                    androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVar2);
                    b4.g.Companion companion5 = b4.g.INSTANCE;
                    aVarA = companion5.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarH4, companion5.c());
                    d4.b(lVarA, xVarC4, companion5.e());
                    pVarB = companion5.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE4, companion5.d());
                    i iVar4 = i.f4585a;
                    lVarV.o(-187482432);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        T t18 = snapshotStateList.get(i19);
                        lVarV.M(-1081873445, lVar4.invoke(t18));
                        pVar = (p) k0Var.c(t18);
                        if (pVar == null) {
                            lVarV.o(821713034);
                            lVarV.l();
                        } else {
                            lVarV.o(-1081871785);
                            pVar.invoke(lVarV, 0);
                            lVarV.l();
                        }
                        lVarV.S();
                    }
                    lVarV.l();
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    g0Var3 = g0VarL;
                    lVar5 = lVar4;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        lVar4 = b.f95661c;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    obj = objI;
                    if (objI == companion.a()) {
                        SnapshotStateList snapshotStateListF5 = n3.f();
                        snapshotStateListF5.add(l1Var.i());
                        lVarV.B(snapshotStateListF5);
                        obj = snapshotStateListF5;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = u0.d();
                        lVarV.B(objI2);
                    }
                    k0Var = (k0) objI2;
                    if (s.f(l1Var.i(), l1Var.p())) {
                        lVarV.o(860660313);
                        if (snapshotStateList.size() == 1) {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        } else {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(860990897);
                        lVarV.l();
                    }
                    if (k0Var.a(l1Var.p())) {
                        lVarV.o(861052122);
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else {
                                if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(l1Var.p());
                        } else {
                            snapshotStateList.set(i21, l1Var.p());
                        }
                        k0Var.i();
                        size2 = snapshotStateList.size();
                        while (i22 < size2) {
                            T t19 = snapshotStateList.get(i22);
                            k0Var.s(t19, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t19, qVar), lVarV, 54));
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(861812273);
                        lVarV.l();
                    }
                    i0 i0VarH5 = g.h(d3.c.INSTANCE.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC5 = lVarV.c();
                    androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVarV, dVar2);
                    b4.g.Companion companion6 = b4.g.INSTANCE;
                    aVarA = companion6.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarH5, companion6.c());
                    d4.b(lVarA, xVarC5, companion6.e());
                    pVarB = companion6.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE5, companion6.d());
                    i iVar5 = i.f4585a;
                    lVarV.o(-187482432);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        T t110 = snapshotStateList.get(i19);
                        lVarV.M(-1081873445, lVar4.invoke(t110));
                        pVar = (p) k0Var.c(t110);
                        if (pVar == null) {
                            lVarV.o(821713034);
                            lVarV.l();
                        } else {
                            lVarV.o(-1081871785);
                            pVar.invoke(lVarV, 0);
                            lVarV.l();
                        }
                        lVarV.S();
                    }
                    lVarV.l();
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    g0Var3 = g0VarL;
                    lVar5 = lVar4;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            lVar3 = lVar;
            if ((i12 & 8) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    lVar4 = b.f95661c;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                obj = objI;
                if (objI == companion.a()) {
                    SnapshotStateList snapshotStateListF6 = n3.f();
                    snapshotStateListF6.add(l1Var.i());
                    lVarV.B(snapshotStateListF6);
                    obj = snapshotStateListF6;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = u0.d();
                    lVarV.B(objI2);
                }
                k0Var = (k0) objI2;
                if (s.f(l1Var.i(), l1Var.p())) {
                    lVarV.o(860660313);
                    if (snapshotStateList.size() == 1) {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    } else {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(860990897);
                    lVarV.l();
                }
                if (k0Var.a(l1Var.p())) {
                    lVarV.o(861052122);
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(l1Var.p());
                    } else {
                        snapshotStateList.set(i21, l1Var.p());
                    }
                    k0Var.i();
                    size2 = snapshotStateList.size();
                    while (i22 < size2) {
                        T t111 = snapshotStateList.get(i22);
                        k0Var.s(t111, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t111, qVar), lVarV, 54));
                    }
                    lVarV.l();
                } else {
                    lVarV.o(861812273);
                    lVarV.l();
                }
                i0 i0VarH6 = g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC6 = lVarV.c();
                androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVarV, dVar2);
                b4.g.Companion companion7 = b4.g.INSTANCE;
                aVarA = companion7.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH6, companion7.c());
                d4.b(lVarA, xVarC6, companion7.e());
                pVarB = companion7.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE6, companion7.d());
                i iVar6 = i.f4585a;
                lVarV.o(-187482432);
                size = snapshotStateList.size();
                while (i19 < size) {
                    T t112 = snapshotStateList.get(i19);
                    lVarV.M(-1081873445, lVar4.invoke(t112));
                    pVar = (p) k0Var.c(t112);
                    if (pVar == null) {
                        lVarV.o(821713034);
                        lVarV.l();
                    } else {
                        lVarV.o(-1081871785);
                        pVar.invoke(lVarV, 0);
                        lVarV.l();
                    }
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                g0Var3 = g0VarL;
                lVar5 = lVar4;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    lVar4 = b.f95661c;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                obj = objI;
                if (objI == companion.a()) {
                    SnapshotStateList snapshotStateListF7 = n3.f();
                    snapshotStateListF7.add(l1Var.i());
                    lVarV.B(snapshotStateListF7);
                    obj = snapshotStateListF7;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = u0.d();
                    lVarV.B(objI2);
                }
                k0Var = (k0) objI2;
                if (s.f(l1Var.i(), l1Var.p())) {
                    lVarV.o(860660313);
                    if (snapshotStateList.size() == 1) {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    } else {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(860990897);
                    lVarV.l();
                }
                if (k0Var.a(l1Var.p())) {
                    lVarV.o(861052122);
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(l1Var.p());
                    } else {
                        snapshotStateList.set(i21, l1Var.p());
                    }
                    k0Var.i();
                    size2 = snapshotStateList.size();
                    while (i22 < size2) {
                        T t113 = snapshotStateList.get(i22);
                        k0Var.s(t113, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t113, qVar), lVarV, 54));
                    }
                    lVarV.l();
                } else {
                    lVarV.o(861812273);
                    lVarV.l();
                }
                i0 i0VarH7 = g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC7 = lVarV.c();
                androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVarV, dVar2);
                b4.g.Companion companion8 = b4.g.INSTANCE;
                aVarA = companion8.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH7, companion8.c());
                d4.b(lVarA, xVarC7, companion8.e());
                pVarB = companion8.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE7, companion8.d());
                i iVar7 = i.f4585a;
                lVarV.o(-187482432);
                size = snapshotStateList.size();
                while (i19 < size) {
                    T t114 = snapshotStateList.get(i19);
                    lVarV.M(-1081873445, lVar4.invoke(t114));
                    pVar = (p) k0Var.c(t114);
                    if (pVar == null) {
                        lVarV.o(821713034);
                        lVarV.l();
                    } else {
                        lVarV.o(-1081871785);
                        pVar.invoke(lVarV, 0);
                        lVarV.l();
                    }
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                g0Var3 = g0VarL;
                lVar5 = lVar4;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        i14 = i12 & 2;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                g0Var2 = g0Var;
                if (lVarV.K(g0Var2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 4;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    lVar3 = lVar;
                    if (lVarV.K(lVar3)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    if (lVarV.K(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        lVar4 = b.f95661c;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    obj = objI;
                    if (objI == companion.a()) {
                        SnapshotStateList snapshotStateListF8 = n3.f();
                        snapshotStateListF8.add(l1Var.i());
                        lVarV.B(snapshotStateListF8);
                        obj = snapshotStateListF8;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = u0.d();
                        lVarV.B(objI2);
                    }
                    k0Var = (k0) objI2;
                    if (s.f(l1Var.i(), l1Var.p())) {
                        lVarV.o(860660313);
                        if (snapshotStateList.size() == 1) {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        } else {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(860990897);
                        lVarV.l();
                    }
                    if (k0Var.a(l1Var.p())) {
                        lVarV.o(861052122);
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else {
                                if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(l1Var.p());
                        } else {
                            snapshotStateList.set(i21, l1Var.p());
                        }
                        k0Var.i();
                        size2 = snapshotStateList.size();
                        while (i22 < size2) {
                            T t115 = snapshotStateList.get(i22);
                            k0Var.s(t115, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t115, qVar), lVarV, 54));
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(861812273);
                        lVarV.l();
                    }
                    i0 i0VarH8 = g.h(d3.c.INSTANCE.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC8 = lVarV.c();
                    androidx.compose.ui.d dVarE8 = androidx.compose.ui.c.e(lVarV, dVar2);
                    b4.g.Companion companion9 = b4.g.INSTANCE;
                    aVarA = companion9.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarH8, companion9.c());
                    d4.b(lVarA, xVarC8, companion9.e());
                    pVarB = companion9.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE8, companion9.d());
                    i iVar8 = i.f4585a;
                    lVarV.o(-187482432);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        T t116 = snapshotStateList.get(i19);
                        lVarV.M(-1081873445, lVar4.invoke(t116));
                        pVar = (p) k0Var.c(t116);
                        if (pVar == null) {
                            lVarV.o(821713034);
                            lVarV.l();
                        } else {
                            lVarV.o(-1081871785);
                            pVar.invoke(lVarV, 0);
                            lVarV.l();
                        }
                        lVarV.S();
                    }
                    lVarV.l();
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    g0Var3 = g0VarL;
                    lVar5 = lVar4;
                } else {
                    if (i23 != 0) {
                        dVar2 = androidx.compose.ui.d.INSTANCE;
                    }
                    if (i14 != 0) {
                        g0VarL = p019p1.j.l(0, 0, null, 7, null);
                    } else {
                        g0VarL = g0Var2;
                    }
                    if (i16 != 0) {
                        lVar4 = b.f95661c;
                    } else {
                        lVar4 = lVar3;
                    }
                    if (o.J()) {
                        o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                    }
                    objI = lVarV.I();
                    companion = l.INSTANCE;
                    obj = objI;
                    if (objI == companion.a()) {
                        SnapshotStateList snapshotStateListF9 = n3.f();
                        snapshotStateListF9.add(l1Var.i());
                        lVarV.B(snapshotStateListF9);
                        obj = snapshotStateListF9;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objI2 = lVarV.I();
                    if (objI2 == companion.a()) {
                        objI2 = u0.d();
                        lVarV.B(objI2);
                    }
                    k0Var = (k0) objI2;
                    if (s.f(l1Var.i(), l1Var.p())) {
                        lVarV.o(860660313);
                        if (snapshotStateList.size() == 1) {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        } else {
                            lVarV.o(860794667);
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI3 = lVarV.I();
                            if (z11) {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            } else {
                                objI3 = new c(l1Var);
                                lVarV.B(objI3);
                            }
                            v.L(snapshotStateList, (wn0.l) objI3);
                            k0Var.i();
                            lVarV.l();
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(860990897);
                        lVarV.l();
                    }
                    if (k0Var.a(l1Var.p())) {
                        lVarV.o(861052122);
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else {
                                if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                    break;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(l1Var.p());
                        } else {
                            snapshotStateList.set(i21, l1Var.p());
                        }
                        k0Var.i();
                        size2 = snapshotStateList.size();
                        while (i22 < size2) {
                            T t117 = snapshotStateList.get(i22);
                            k0Var.s(t117, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t117, qVar), lVarV, 54));
                        }
                        lVarV.l();
                    } else {
                        lVarV.o(861812273);
                        lVarV.l();
                    }
                    i0 i0VarH9 = g.h(d3.c.INSTANCE.o(), false);
                    iA = p020r2.j.a(lVarV, 0);
                    x xVarC9 = lVarV.c();
                    androidx.compose.ui.d dVarE9 = androidx.compose.ui.c.e(lVarV, dVar2);
                    b4.g.Companion companion10 = b4.g.INSTANCE;
                    aVarA = companion10.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = d4.a(lVarV);
                    d4.b(lVarA, i0VarH9, companion10.c());
                    d4.b(lVarA, xVarC9, companion10.e());
                    pVarB = companion10.b();
                    if (lVarA.getInserting()) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    } else {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE9, companion10.d());
                    i iVar9 = i.f4585a;
                    lVarV.o(-187482432);
                    size = snapshotStateList.size();
                    while (i19 < size) {
                        T t118 = snapshotStateList.get(i19);
                        lVarV.M(-1081873445, lVar4.invoke(t118));
                        pVar = (p) k0Var.c(t118);
                        if (pVar == null) {
                            lVarV.o(821713034);
                            lVarV.l();
                        } else {
                            lVarV.o(-1081871785);
                            pVar.invoke(lVarV, 0);
                            lVarV.l();
                        }
                        lVarV.S();
                    }
                    lVarV.l();
                    lVarV.g();
                    if (o.J()) {
                        o.R();
                    }
                    g0Var3 = g0VarL;
                    lVar5 = lVar4;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
                }
            }
            i13 |= 3072;
            lVar3 = lVar;
            if ((i12 & 8) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    lVar4 = b.f95661c;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                obj = objI;
                if (objI == companion.a()) {
                    SnapshotStateList snapshotStateListF10 = n3.f();
                    snapshotStateListF10.add(l1Var.i());
                    lVarV.B(snapshotStateListF10);
                    obj = snapshotStateListF10;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = u0.d();
                    lVarV.B(objI2);
                }
                k0Var = (k0) objI2;
                if (s.f(l1Var.i(), l1Var.p())) {
                    lVarV.o(860660313);
                    if (snapshotStateList.size() == 1) {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    } else {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(860990897);
                    lVarV.l();
                }
                if (k0Var.a(l1Var.p())) {
                    lVarV.o(861052122);
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(l1Var.p());
                    } else {
                        snapshotStateList.set(i21, l1Var.p());
                    }
                    k0Var.i();
                    size2 = snapshotStateList.size();
                    while (i22 < size2) {
                        T t119 = snapshotStateList.get(i22);
                        k0Var.s(t119, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t119, qVar), lVarV, 54));
                    }
                    lVarV.l();
                } else {
                    lVarV.o(861812273);
                    lVarV.l();
                }
                i0 i0VarH10 = g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC10 = lVarV.c();
                androidx.compose.ui.d dVarE10 = androidx.compose.ui.c.e(lVarV, dVar2);
                b4.g.Companion companion11 = b4.g.INSTANCE;
                aVarA = companion11.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH10, companion11.c());
                d4.b(lVarA, xVarC10, companion11.e());
                pVarB = companion11.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE10, companion11.d());
                i iVar10 = i.f4585a;
                lVarV.o(-187482432);
                size = snapshotStateList.size();
                while (i19 < size) {
                    T t1110 = snapshotStateList.get(i19);
                    lVarV.M(-1081873445, lVar4.invoke(t1110));
                    pVar = (p) k0Var.c(t1110);
                    if (pVar == null) {
                        lVarV.o(821713034);
                        lVarV.l();
                    } else {
                        lVarV.o(-1081871785);
                        pVar.invoke(lVarV, 0);
                        lVarV.l();
                    }
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                g0Var3 = g0VarL;
                lVar5 = lVar4;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    lVar4 = b.f95661c;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                obj = objI;
                if (objI == companion.a()) {
                    SnapshotStateList snapshotStateListF11 = n3.f();
                    snapshotStateListF11.add(l1Var.i());
                    lVarV.B(snapshotStateListF11);
                    obj = snapshotStateListF11;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = u0.d();
                    lVarV.B(objI2);
                }
                k0Var = (k0) objI2;
                if (s.f(l1Var.i(), l1Var.p())) {
                    lVarV.o(860660313);
                    if (snapshotStateList.size() == 1) {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    } else {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(860990897);
                    lVarV.l();
                }
                if (k0Var.a(l1Var.p())) {
                    lVarV.o(861052122);
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(l1Var.p());
                    } else {
                        snapshotStateList.set(i21, l1Var.p());
                    }
                    k0Var.i();
                    size2 = snapshotStateList.size();
                    while (i22 < size2) {
                        T t1111 = snapshotStateList.get(i22);
                        k0Var.s(t1111, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t1111, qVar), lVarV, 54));
                    }
                    lVarV.l();
                } else {
                    lVarV.o(861812273);
                    lVarV.l();
                }
                i0 i0VarH11 = g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC11 = lVarV.c();
                androidx.compose.ui.d dVarE11 = androidx.compose.ui.c.e(lVarV, dVar2);
                b4.g.Companion companion12 = b4.g.INSTANCE;
                aVarA = companion12.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH11, companion12.c());
                d4.b(lVarA, xVarC11, companion12.e());
                pVarB = companion12.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE11, companion12.d());
                i iVar11 = i.f4585a;
                lVarV.o(-187482432);
                size = snapshotStateList.size();
                while (i19 < size) {
                    T t1112 = snapshotStateList.get(i19);
                    lVarV.M(-1081873445, lVar4.invoke(t1112));
                    pVar = (p) k0Var.c(t1112);
                    if (pVar == null) {
                        lVarV.o(821713034);
                        lVarV.l();
                    } else {
                        lVarV.o(-1081871785);
                        pVar.invoke(lVarV, 0);
                        lVarV.l();
                    }
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                g0Var3 = g0VarL;
                lVar5 = lVar4;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        g0Var2 = g0Var;
        i16 = i12 & 4;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                lVar3 = lVar;
                if (lVarV.K(lVar3)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i12 & 8) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    lVar4 = b.f95661c;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                obj = objI;
                if (objI == companion.a()) {
                    SnapshotStateList snapshotStateListF12 = n3.f();
                    snapshotStateListF12.add(l1Var.i());
                    lVarV.B(snapshotStateListF12);
                    obj = snapshotStateListF12;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = u0.d();
                    lVarV.B(objI2);
                }
                k0Var = (k0) objI2;
                if (s.f(l1Var.i(), l1Var.p())) {
                    lVarV.o(860660313);
                    if (snapshotStateList.size() == 1) {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    } else {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(860990897);
                    lVarV.l();
                }
                if (k0Var.a(l1Var.p())) {
                    lVarV.o(861052122);
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(l1Var.p());
                    } else {
                        snapshotStateList.set(i21, l1Var.p());
                    }
                    k0Var.i();
                    size2 = snapshotStateList.size();
                    while (i22 < size2) {
                        T t1113 = snapshotStateList.get(i22);
                        k0Var.s(t1113, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t1113, qVar), lVarV, 54));
                    }
                    lVarV.l();
                } else {
                    lVarV.o(861812273);
                    lVarV.l();
                }
                i0 i0VarH12 = g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC12 = lVarV.c();
                androidx.compose.ui.d dVarE12 = androidx.compose.ui.c.e(lVarV, dVar2);
                b4.g.Companion companion13 = b4.g.INSTANCE;
                aVarA = companion13.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH12, companion13.c());
                d4.b(lVarA, xVarC12, companion13.e());
                pVarB = companion13.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE12, companion13.d());
                i iVar12 = i.f4585a;
                lVarV.o(-187482432);
                size = snapshotStateList.size();
                while (i19 < size) {
                    T t1114 = snapshotStateList.get(i19);
                    lVarV.M(-1081873445, lVar4.invoke(t1114));
                    pVar = (p) k0Var.c(t1114);
                    if (pVar == null) {
                        lVarV.o(821713034);
                        lVarV.l();
                    } else {
                        lVarV.o(-1081871785);
                        pVar.invoke(lVarV, 0);
                        lVarV.l();
                    }
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                g0Var3 = g0VarL;
                lVar5 = lVar4;
            } else {
                if (i23 != 0) {
                    dVar2 = androidx.compose.ui.d.INSTANCE;
                }
                if (i14 != 0) {
                    g0VarL = p019p1.j.l(0, 0, null, 7, null);
                } else {
                    g0VarL = g0Var2;
                }
                if (i16 != 0) {
                    lVar4 = b.f95661c;
                } else {
                    lVar4 = lVar3;
                }
                if (o.J()) {
                    o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                }
                objI = lVarV.I();
                companion = l.INSTANCE;
                obj = objI;
                if (objI == companion.a()) {
                    SnapshotStateList snapshotStateListF13 = n3.f();
                    snapshotStateListF13.add(l1Var.i());
                    lVarV.B(snapshotStateListF13);
                    obj = snapshotStateListF13;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = u0.d();
                    lVarV.B(objI2);
                }
                k0Var = (k0) objI2;
                if (s.f(l1Var.i(), l1Var.p())) {
                    lVarV.o(860660313);
                    if (snapshotStateList.size() == 1) {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    } else {
                        lVarV.o(860794667);
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI3 = lVarV.I();
                        if (z11) {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        } else {
                            objI3 = new c(l1Var);
                            lVarV.B(objI3);
                        }
                        v.L(snapshotStateList, (wn0.l) objI3);
                        k0Var.i();
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    lVarV.o(860990897);
                    lVarV.l();
                }
                if (k0Var.a(l1Var.p())) {
                    lVarV.o(861052122);
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(l1Var.p());
                    } else {
                        snapshotStateList.set(i21, l1Var.p());
                    }
                    k0Var.i();
                    size2 = snapshotStateList.size();
                    while (i22 < size2) {
                        T t1115 = snapshotStateList.get(i22);
                        k0Var.s(t1115, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t1115, qVar), lVarV, 54));
                    }
                    lVarV.l();
                } else {
                    lVarV.o(861812273);
                    lVarV.l();
                }
                i0 i0VarH13 = g.h(d3.c.INSTANCE.o(), false);
                iA = p020r2.j.a(lVarV, 0);
                x xVarC13 = lVarV.c();
                androidx.compose.ui.d dVarE13 = androidx.compose.ui.c.e(lVarV, dVar2);
                b4.g.Companion companion14 = b4.g.INSTANCE;
                aVarA = companion14.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = d4.a(lVarV);
                d4.b(lVarA, i0VarH13, companion14.c());
                d4.b(lVarA, xVarC13, companion14.e());
                pVarB = companion14.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE13, companion14.d());
                i iVar13 = i.f4585a;
                lVarV.o(-187482432);
                size = snapshotStateList.size();
                while (i19 < size) {
                    T t1116 = snapshotStateList.get(i19);
                    lVarV.M(-1081873445, lVar4.invoke(t1116));
                    pVar = (p) k0Var.c(t1116);
                    if (pVar == null) {
                        lVarV.o(821713034);
                        lVarV.l();
                    } else {
                        lVarV.o(-1081871785);
                        pVar.invoke(lVarV, 0);
                        lVarV.l();
                    }
                    lVarV.S();
                }
                lVarV.l();
                lVarV.g();
                if (o.J()) {
                    o.R();
                }
                g0Var3 = g0VarL;
                lVar5 = lVar4;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
            }
        }
        i13 |= 3072;
        lVar3 = lVar;
        if ((i12 & 8) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(qVar)) {
                i18 = 16384;
            } else {
                i18 = PKIFailureInfo.certRevoked;
            }
            i13 |= i18;
        }
        if ((i13 & 9363) == 9362) {
            if (i23 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i14 != 0) {
                g0VarL = p019p1.j.l(0, 0, null, 7, null);
            } else {
                g0VarL = g0Var2;
            }
            if (i16 != 0) {
                lVar4 = b.f95661c;
            } else {
                lVar4 = lVar3;
            }
            if (o.J()) {
                o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
            }
            objI = lVarV.I();
            companion = l.INSTANCE;
            obj = objI;
            if (objI == companion.a()) {
                SnapshotStateList snapshotStateListF14 = n3.f();
                snapshotStateListF14.add(l1Var.i());
                lVarV.B(snapshotStateListF14);
                obj = snapshotStateListF14;
            }
            snapshotStateList = (SnapshotStateList) obj;
            objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = u0.d();
                lVarV.B(objI2);
            }
            k0Var = (k0) objI2;
            if (s.f(l1Var.i(), l1Var.p())) {
                lVarV.o(860660313);
                if (snapshotStateList.size() == 1) {
                    lVarV.o(860794667);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI3 = lVarV.I();
                    if (z11) {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    }
                    v.L(snapshotStateList, (wn0.l) objI3);
                    k0Var.i();
                    lVarV.l();
                } else {
                    lVarV.o(860794667);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI3 = lVarV.I();
                    if (z11) {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    }
                    v.L(snapshotStateList, (wn0.l) objI3);
                    k0Var.i();
                    lVarV.l();
                }
                lVarV.l();
            } else {
                lVarV.o(860990897);
                lVarV.l();
            }
            if (k0Var.a(l1Var.p())) {
                lVarV.o(861052122);
                it = snapshotStateList.iterator();
                i21 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i21 = -1;
                        break;
                    } else {
                        if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                            break;
                            break;
                        }
                        i21++;
                    }
                }
                if (i21 == -1) {
                    snapshotStateList.add(l1Var.p());
                } else {
                    snapshotStateList.set(i21, l1Var.p());
                }
                k0Var.i();
                size2 = snapshotStateList.size();
                while (i22 < size2) {
                    T t1117 = snapshotStateList.get(i22);
                    k0Var.s(t1117, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t1117, qVar), lVarV, 54));
                }
                lVarV.l();
            } else {
                lVarV.o(861812273);
                lVarV.l();
            }
            i0 i0VarH14 = g.h(d3.c.INSTANCE.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC14 = lVarV.c();
            androidx.compose.ui.d dVarE14 = androidx.compose.ui.c.e(lVarV, dVar2);
            b4.g.Companion companion15 = b4.g.INSTANCE;
            aVarA = companion15.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarH14, companion15.c());
            d4.b(lVarA, xVarC14, companion15.e());
            pVarB = companion15.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE14, companion15.d());
            i iVar14 = i.f4585a;
            lVarV.o(-187482432);
            size = snapshotStateList.size();
            while (i19 < size) {
                T t1118 = snapshotStateList.get(i19);
                lVarV.M(-1081873445, lVar4.invoke(t1118));
                pVar = (p) k0Var.c(t1118);
                if (pVar == null) {
                    lVarV.o(821713034);
                    lVarV.l();
                } else {
                    lVarV.o(-1081871785);
                    pVar.invoke(lVarV, 0);
                    lVarV.l();
                }
                lVarV.S();
            }
            lVarV.l();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
            g0Var3 = g0VarL;
            lVar5 = lVar4;
        } else {
            if (i23 != 0) {
                dVar2 = androidx.compose.ui.d.INSTANCE;
            }
            if (i14 != 0) {
                g0VarL = p019p1.j.l(0, 0, null, 7, null);
            } else {
                g0VarL = g0Var2;
            }
            if (i16 != 0) {
                lVar4 = b.f95661c;
            } else {
                lVar4 = lVar3;
            }
            if (o.J()) {
                o.S(679005231, i13, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
            }
            objI = lVarV.I();
            companion = l.INSTANCE;
            obj = objI;
            if (objI == companion.a()) {
                SnapshotStateList snapshotStateListF15 = n3.f();
                snapshotStateListF15.add(l1Var.i());
                lVarV.B(snapshotStateListF15);
                obj = snapshotStateListF15;
            }
            snapshotStateList = (SnapshotStateList) obj;
            objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = u0.d();
                lVarV.B(objI2);
            }
            k0Var = (k0) objI2;
            if (s.f(l1Var.i(), l1Var.p())) {
                lVarV.o(860660313);
                if (snapshotStateList.size() == 1) {
                    lVarV.o(860794667);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI3 = lVarV.I();
                    if (z11) {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    }
                    v.L(snapshotStateList, (wn0.l) objI3);
                    k0Var.i();
                    lVarV.l();
                } else {
                    lVarV.o(860794667);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI3 = lVarV.I();
                    if (z11) {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    } else {
                        objI3 = new c(l1Var);
                        lVarV.B(objI3);
                    }
                    v.L(snapshotStateList, (wn0.l) objI3);
                    k0Var.i();
                    lVarV.l();
                }
                lVarV.l();
            } else {
                lVarV.o(860990897);
                lVarV.l();
            }
            if (k0Var.a(l1Var.p())) {
                lVarV.o(861052122);
                it = snapshotStateList.iterator();
                i21 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i21 = -1;
                        break;
                    } else {
                        if (s.f(lVar4.invoke(it.next()), lVar4.invoke(l1Var.p()))) {
                            break;
                            break;
                        }
                        i21++;
                    }
                }
                if (i21 == -1) {
                    snapshotStateList.add(l1Var.p());
                } else {
                    snapshotStateList.set(i21, l1Var.p());
                }
                k0Var.i();
                size2 = snapshotStateList.size();
                while (i22 < size2) {
                    T t1119 = snapshotStateList.get(i22);
                    k0Var.s(t1119, z2.c.e(-1426421288, true, new d(l1Var, g0VarL, t1119, qVar), lVarV, 54));
                }
                lVarV.l();
            } else {
                lVarV.o(861812273);
                lVarV.l();
            }
            i0 i0VarH15 = g.h(d3.c.INSTANCE.o(), false);
            iA = p020r2.j.a(lVarV, 0);
            x xVarC15 = lVarV.c();
            androidx.compose.ui.d dVarE15 = androidx.compose.ui.c.e(lVarV, dVar2);
            b4.g.Companion companion16 = b4.g.INSTANCE;
            aVarA = companion16.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarH15, companion16.c());
            d4.b(lVarA, xVarC15, companion16.e());
            pVarB = companion16.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE15, companion16.d());
            i iVar15 = i.f4585a;
            lVarV.o(-187482432);
            size = snapshotStateList.size();
            while (i19 < size) {
                T t11110 = snapshotStateList.get(i19);
                lVarV.M(-1081873445, lVar4.invoke(t11110));
                pVar = (p) k0Var.c(t11110);
                if (pVar == null) {
                    lVarV.o(821713034);
                    lVarV.l();
                } else {
                    lVarV.o(-1081871785);
                    pVar.invoke(lVarV, 0);
                    lVarV.l();
                }
                lVarV.S();
            }
            lVarV.l();
            lVarV.g();
            if (o.J()) {
                o.R();
            }
            g0Var3 = g0VarL;
            lVar5 = lVar4;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(l1Var, dVar2, g0Var3, lVar5, qVar, i11, i12));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b<T> extends u implements wn0.l<T, T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f95661c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        public final T invoke(T t11) {
            return t11;
        }
    }
}
