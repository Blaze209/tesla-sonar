package z80;

import androidx.compose.ui.platform.s2;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4669d;
import p009i2.C4672l;
import p009i2.v2;
import p013kotlin.Metadata;
import p020r2.w2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "titleText", "messageText", "confirmText", "dismissText", "", "destructive", "Lkotlin/Function0;", "Ljn0/h0;", "onConfirmListener", "onDismissListener", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLwn0/a;Lwn0/a;Lr2/l;II)V", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h2 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f127513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f127514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f127515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f127516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f127517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f127518h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f127519i;

        /* JADX INFO: renamed from: z80.h2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C2772a extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f127520c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2772a(String str) {
                super(2);
                this.f127520c = str;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1346550194, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:45)");
                }
                p010i90.f0.a(this.f127520c, null, lVar, 0, 2);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.a<jn0.h0> f127521c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(wn0.a<jn0.h0> aVar) {
                super(0);
                this.f127521c = aVar;
            }

            public final void b() {
                this.f127521c.invoke();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.a<jn0.h0> f127522c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f127523d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f127524e;

            /* JADX INFO: renamed from: z80.h2$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C2773a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.a<jn0.h0> f127525c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2773a(wn0.a<jn0.h0> aVar) {
                    super(0);
                    this.f127525c = aVar;
                }

                public final void b() {
                    this.f127525c.invoke();
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                    b();
                    return jn0.h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class b extends p013kotlin.jvm.internal.u implements wn0.q<v1.g0, p020r2.l, Integer, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f127526c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f127527d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, boolean z11) {
                    super(3);
                    this.f127526c = str;
                    this.f127527d = z11;
                }

                public final void a(v1.g0 TextButton, p020r2.l lVar, int i11) {
                    p013kotlin.jvm.internal.s.k(TextButton, "$this$TextButton");
                    if ((i11 & 81) == 16 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1956887564, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:55)");
                    }
                    String str = this.f127526c;
                    lVar.H(399781910);
                    long jD = this.f127527d ? p009i2.j1.f74525a.a(lVar, p009i2.j1.f74526b).d() : k3.p1.INSTANCE.j();
                    lVar.T();
                    v2.b(str, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131066);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }

                @Override // wn0.q
                public /* bridge */ /* synthetic */ jn0.h0 invoke(v1.g0 g0Var, p020r2.l lVar, Integer num) {
                    a(g0Var, lVar, num.intValue());
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(wn0.a<jn0.h0> aVar, String str, boolean z11) {
                super(2);
                this.f127522c = aVar;
                this.f127523d = str;
                this.f127524e = z11;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(707616169, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:49)");
                }
                androidx.compose.ui.d dVarA = s2.a(androidx.compose.ui.d.INSTANCE, "simple_dialog_confirm_button");
                lVar.H(-1803938456);
                boolean zN = lVar.n(this.f127522c);
                wn0.a<jn0.h0> aVar = this.f127522c;
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new C2773a(aVar);
                    lVar.B(objI);
                }
                lVar.T();
                C4672l.c((wn0.a) objI, dVarA, false, null, null, null, null, null, null, z2.c.b(lVar, 1956887564, true, new b(this.f127523d, this.f127524e)), lVar, 805306416, 508);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.a<jn0.h0> f127528c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f127529d;

            /* JADX INFO: renamed from: z80.h2$a$d$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
            static final class C2774a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ wn0.a<jn0.h0> f127530c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2774a(wn0.a<jn0.h0> aVar) {
                    super(0);
                    this.f127530c = aVar;
                }

                public final void b() {
                    this.f127530c.invoke();
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                    b();
                    return jn0.h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/g0;", "Ljn0/h0;", "a", "(Lv1/g0;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class b extends p013kotlin.jvm.internal.u implements wn0.q<v1.g0, p020r2.l, Integer, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f127531c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str) {
                    super(3);
                    this.f127531c = str;
                }

                public final void a(v1.g0 TextButton, p020r2.l lVar, int i11) {
                    p013kotlin.jvm.internal.s.k(TextButton, "$this$TextButton");
                    if ((i11 & 81) == 16 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(180812490, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:72)");
                    }
                    v2.b(this.f127531c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }

                @Override // wn0.q
                public /* bridge */ /* synthetic */ jn0.h0 invoke(v1.g0 g0Var, p020r2.l lVar, Integer num) {
                    a(g0Var, lVar, num.intValue());
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(wn0.a<jn0.h0> aVar, String str) {
                super(2);
                this.f127528c = aVar;
                this.f127529d = str;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1068458905, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:66)");
                }
                androidx.compose.ui.d dVarA = s2.a(androidx.compose.ui.d.INSTANCE, "simple_dialog_dismiss_button");
                lVar.H(-1803919448);
                boolean zN = lVar.n(this.f127528c);
                wn0.a<jn0.h0> aVar = this.f127528c;
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new C2774a(aVar);
                    lVar.B(objI);
                }
                lVar.T();
                C4672l.c((wn0.a) objI, dVarA, false, null, null, null, null, null, null, z2.c.b(lVar, 180812490, true, new b(this.f127529d)), lVar, 805306416, 508);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class e extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f127532c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(2);
                this.f127532c = str;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1956496442, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous>.<anonymous> (SimpleDialogElementUI.kt:41)");
                }
                g1.a(this.f127532c, null, lVar, 0, 2);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, wn0.a<jn0.h0> aVar, wn0.a<jn0.h0> aVar2, String str2, boolean z11, String str3, String str4) {
            super(2);
            this.f127513c = str;
            this.f127514d = aVar;
            this.f127515e = aVar2;
            this.f127516f = str2;
            this.f127517g = z11;
            this.f127518h = str3;
            this.f127519i = str4;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1799194383, i11, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI.<anonymous> (SimpleDialogElementUI.kt:35)");
            }
            androidx.compose.ui.d dVarA = s2.a(androidx.compose.ui.d.INSTANCE, "simple_dialog");
            String str = this.f127513c;
            z2.a aVarB = str != null ? z2.c.b(lVar, 1346550194, true, new C2772a(str)) : null;
            lVar.H(-1105766663);
            boolean zN = lVar.n(this.f127514d);
            wn0.a<jn0.h0> aVar = this.f127514d;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new b(aVar);
                lVar.B(objI);
            }
            lVar.T();
            C4669d.a((wn0.a) objI, z2.c.b(lVar, 707616169, true, new c(this.f127515e, this.f127516f, this.f127517g)), dVarA, z2.c.b(lVar, -1068458905, true, new d(this.f127514d, this.f127518h)), z2.c.b(lVar, -1956496442, true, new e(this.f127519i)), aVarB, null, 0L, 0L, null, lVar, 28080, 960);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f127533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f127534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f127535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f127536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f127537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f127538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.a<jn0.h0> f127539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127541k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3, String str4, boolean z11, wn0.a<jn0.h0> aVar, wn0.a<jn0.h0> aVar2, int i11, int i12) {
            super(2);
            this.f127533c = str;
            this.f127534d = str2;
            this.f127535e = str3;
            this.f127536f = str4;
            this.f127537g = z11;
            this.f127538h = aVar;
            this.f127539i = aVar2;
            this.f127540j = i11;
            this.f127541k = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            h2.a(this.f127533c, this.f127534d, this.f127535e, this.f127536f, this.f127537g, this.f127538h, this.f127539i, lVar, p020r2.k2.a(this.f127540j | 1), this.f127541k);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(String titleText, String str, String confirmText, String dismissText, boolean z11, wn0.a<jn0.h0> onConfirmListener, wn0.a<jn0.h0> onDismissListener, p020r2.l lVar, int i11, int i12) {
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        int i19;
        boolean z13;
        boolean z14;
        w2 w2VarX;
        p013kotlin.jvm.internal.s.k(titleText, "titleText");
        p013kotlin.jvm.internal.s.k(confirmText, "confirmText");
        p013kotlin.jvm.internal.s.k(dismissText, "dismissText");
        p013kotlin.jvm.internal.s.k(onConfirmListener, "onConfirmListener");
        p013kotlin.jvm.internal.s.k(onDismissListener, "onDismissListener");
        p020r2.l lVarV = lVar.v(-165056289);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(titleText) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) == 0) {
            if ((i11 & 112) == 0) {
                str2 = str;
                i13 |= lVarV.n(str2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & 896) == 0) {
                if (lVarV.n(confirmText)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (lVarV.n(dismissText)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((57344 & i11) == 0) {
                    z12 = z11;
                    if (lVarV.p(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i17;
                }
                if ((i12 & 32) != 0) {
                    if ((458752 & i11) == 0) {
                        if (lVarV.K(onConfirmListener)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        if ((3670016 & i11) == 0) {
                            if (lVarV.K(onDismissListener)) {
                                i19 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i19 = PKIFailureInfo.signerNotTrusted;
                            }
                        }
                        if ((2995931 & i13) == 599186 || !lVarV.b()) {
                            if (i16 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                            }
                            String str3 = str2;
                            z14 = z13;
                            f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str3, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                        } else {
                            lVarV.j();
                            z14 = z12;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                        }
                    }
                    i19 = 1572864;
                    i13 |= i19;
                    if ((2995931 & i13) == 599186) {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str4 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str4, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str5 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str5, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                    }
                }
                i18 = 196608;
                i13 |= i18;
                if ((i12 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (lVarV.K(onDismissListener)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((2995931 & i13) == 599186) {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str6 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str6, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str7 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str7, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                    }
                }
                i19 = 1572864;
                i13 |= i19;
                if ((2995931 & i13) == 599186) {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str8 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str8, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str9 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str9, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                }
            }
            i13 |= 24576;
            z12 = z11;
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (lVarV.K(onConfirmListener)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (lVarV.K(onDismissListener)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((2995931 & i13) == 599186) {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str10 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str10, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str11 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str11, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                    }
                }
                i19 = 1572864;
                i13 |= i19;
                if ((2995931 & i13) == 599186) {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str12 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str12, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str13 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str13, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                }
            }
            i18 = 196608;
            i13 |= i18;
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (lVarV.K(onDismissListener)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((2995931 & i13) == 599186) {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str14 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str14, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str15 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str15, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                }
            }
            i19 = 1572864;
            i13 |= i19;
            if ((2995931 & i13) == 599186) {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str16 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str16, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str17 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str17, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
            }
        }
        i13 |= 48;
        str2 = str;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            if (lVarV.n(confirmText)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (lVarV.n(dismissText)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((57344 & i11) == 0) {
                z12 = z11;
                if (lVarV.p(z12)) {
                    i17 = 16384;
                } else {
                    i17 = PKIFailureInfo.certRevoked;
                }
                i13 |= i17;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (lVarV.K(onConfirmListener)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (lVarV.K(onDismissListener)) {
                            i19 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i19 = PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    if ((2995931 & i13) == 599186) {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str18 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str18, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    } else {
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                        }
                        String str19 = str2;
                        z14 = z13;
                        f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str19, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                    }
                }
                i19 = 1572864;
                i13 |= i19;
                if ((2995931 & i13) == 599186) {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str110 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str110, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str111 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str111, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                }
            }
            i18 = 196608;
            i13 |= i18;
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (lVarV.K(onDismissListener)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((2995931 & i13) == 599186) {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str112 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str112, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str113 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str113, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                }
            }
            i19 = 1572864;
            i13 |= i19;
            if ((2995931 & i13) == 599186) {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str114 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str114, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str115 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str115, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
            }
        }
        i13 |= 24576;
        z12 = z11;
        if ((i12 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (lVarV.K(onConfirmListener)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
            }
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (lVarV.K(onDismissListener)) {
                        i19 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i19 = PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((2995931 & i13) == 599186) {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str116 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str116, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                } else {
                    if (i16 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                    }
                    String str117 = str2;
                    z14 = z13;
                    f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str117, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
                }
            }
            i19 = 1572864;
            i13 |= i19;
            if ((2995931 & i13) == 599186) {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str118 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str118, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str119 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str119, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
            }
        }
        i18 = 196608;
        i13 |= i18;
        if ((i12 & 64) != 0) {
            if ((3670016 & i11) == 0) {
                if (lVarV.K(onDismissListener)) {
                    i19 = PKIFailureInfo.badCertTemplate;
                } else {
                    i19 = PKIFailureInfo.signerNotTrusted;
                }
            }
            if ((2995931 & i13) == 599186) {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str1110 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str1110, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                if (i16 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
                }
                String str1111 = str2;
                z14 = z13;
                f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str1111, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
            }
        }
        i19 = 1572864;
        i13 |= i19;
        if ((2995931 & i13) == 599186) {
            if (i16 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
            }
            String str1112 = str2;
            z14 = z13;
            f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str1112, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        } else {
            if (i16 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-165056289, i13, -1, "com.stripe.android.ui.core.elements.SimpleDialogElementUI (SimpleDialogElementUI.kt:33)");
            }
            String str1113 = str2;
            z14 = z13;
            f90.n.a(null, null, null, z2.c.b(lVarV, -1799194383, true, new a(str1113, onDismissListener, onConfirmListener, confirmText, z14, dismissText, titleText)), lVarV, 3072, 7);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(titleText, str, confirmText, dismissText, z14, onConfirmListener, onDismissListener, i11, i12));
        }
    }
}
