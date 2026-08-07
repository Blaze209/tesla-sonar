package com.fourthline.orca.core.internal.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import androidx.core.view.z0;
import androidx.p002activity.ComponentActivity;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.internal.AbstractC3307gk;
import com.fourthline.orca.internal.AbstractC3311go;
import com.fourthline.orca.internal.AbstractC3871ts;
import com.fourthline.orca.internal.AbstractC3911up;
import com.fourthline.orca.internal.AbstractC4036xk;
import com.fourthline.orca.internal.C3152d;
import com.fourthline.orca.internal.C4079yk;
import com.fourthline.orca.internal.InterfaceC3654op;
import com.fourthline.orca.internal.InterfaceC3697pp;
import com.fourthline.orca.internal.InterfaceC3868tp;
import com.fourthline.orca.internal.InterfaceC3910uo;
import com.fourthline.orca.internal.InterfaceC4001ws;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.e;
import jn0.h0;
import p011ja.d0;
import p011ja.w;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p020r2.d4;
import p020r2.h2;
import p020r2.j;
import p020r2.l;
import p020r2.n3;
import p020r2.o;
import p020r2.y3;
import wn0.a;
import z3.i0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0003R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/fourthline/orca/core/internal/activity/OrcaActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "a", "(Landroid/content/Intent;)V", "Lja/w;", "navController", "Llq/b;", "systemUiController", "Lcom/fourthline/orca/internal/op;", "(Lja/w;Llq/b;)Lcom/fourthline/orca/internal/op;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onNewIntent", "onDestroy", "", "c", "()Z", "isOrcaInstanceCurrent", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrcaActivity extends ComponentActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static InterfaceC3910uo f24869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C3152d f24870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f24871d;

    /* JADX INFO: renamed from: com.fourthline.orca.core.internal.activity.OrcaActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(InterfaceC3910uo interfaceC3910uo) {
            OrcaActivity.f24869b = interfaceC3910uo;
        }

        public final InterfaceC3910uo b() {
            return OrcaActivity.f24869b;
        }

        private Companion() {
        }

        public final C3152d a() {
            return OrcaActivity.f24870c;
        }

        public final void a(String str) {
            OrcaActivity.f24871d = str;
        }
    }

    /* synthetic */ class b extends p implements a {
        b(Object obj) {
            super(0, obj, OrcaActivity.class, "finish", "finish()V", 0);
        }

        public final void a() {
            ((OrcaActivity) this.receiver).finish();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return h0.f84049a;
        }
    }

    static final class c implements wn0.p {

        static final class a implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3654op f24873a;

            /* JADX INFO: renamed from: com.fourthline.orca.core.internal.activity.OrcaActivity$c$a$a, reason: collision with other inner class name */
            static final class C0470a implements wn0.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ y3 f24874a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3654op f24875b;

                C0470a(y3 y3Var, InterfaceC3654op interfaceC3654op) {
                    this.f24874a = y3Var;
                    this.f24875b = interfaceC3654op;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 3) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(1970056118, i11, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrcaActivity.kt:61)");
                    }
                    d dVarA = AbstractC3307gk.a(x.f(d.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), this.f24874a.getValue() == null);
                    InterfaceC3654op interfaceC3654op = this.f24875b;
                    i0 i0VarH = g.h(d3.c.INSTANCE.o(), false);
                    int iA = j.a(lVar, 0);
                    p020r2.x xVarC = lVar.c();
                    d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
                    b4.g.Companion aVar = b4.g.INSTANCE;
                    wn0.a<b4.g> aVarA = aVar.a();
                    if (lVar.w() == null) {
                        j.c();
                    }
                    lVar.h();
                    if (lVar.u()) {
                        lVar.z(aVarA);
                    } else {
                        lVar.d();
                    }
                    l lVarA = d4.a(lVar);
                    d4.b(lVarA, i0VarH, aVar.c());
                    d4.b(lVarA, xVarC, aVar.e());
                    wn0.p<b4.g, Integer, h0> pVarB = aVar.b();
                    if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE, aVar.d());
                    i iVar = i.f4585a;
                    AbstractC4036xk.a(interfaceC3654op, lVar, 0);
                    lVar.g();
                    AbstractC3871ts.a((InterfaceC4001ws) this.f24874a.getValue(), this.f24875b.y().c(), lVar, 0);
                    this.f24875b.p().startDataCollection();
                    if (o.J()) {
                        o.R();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((l) obj, ((Number) obj2).intValue());
                    return h0.f84049a;
                }
            }

            a(InterfaceC3654op interfaceC3654op) {
                this.f24873a = interfaceC3654op;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(659891154, i11, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.onCreate.<anonymous>.<anonymous> (OrcaActivity.kt:55)");
                }
                InterfaceC3654op interfaceC3654op = this.f24873a;
                AbstractC3911up.a((InterfaceC3868tp) n3.b(interfaceC3654op.d().a(), null, lVar, 0, 1).getValue(), z2.c.e(1970056118, true, new C0470a(n3.b(interfaceC3654op.y().d(), null, lVar, 0, 1), interfaceC3654op), lVar, 54), lVar, 48, 0);
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((l) obj, ((Number) obj2).intValue());
                return h0.f84049a;
            }
        }

        c() {
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-533704942, i11, -1, "com.fourthline.orca.core.internal.activity.OrcaActivity.onCreate.<anonymous> (OrcaActivity.kt:46)");
            }
            w wVarE = ka.l.e(new d0[0], lVar, 0);
            lq.b bVarE = lq.c.e(null, lVar, 0, 1);
            InterfaceC3910uo interfaceC3910uoB = OrcaActivity.INSTANCE.b();
            lVar.o(1622280009);
            boolean zN = lVar.n(interfaceC3910uoB);
            OrcaActivity orcaActivity = OrcaActivity.this;
            Object objI = lVar.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = orcaActivity.a(wVarE, bVarE);
                lVar.B(objI);
            }
            lVar.l();
            p020r2.w.a(AbstractC3311go.b().d(OrcaActivity.this), z2.c.e(659891154, true, new a((InterfaceC3654op) objI), lVar, 54), lVar, h2.f106566i | 48);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((l) obj, ((Number) obj2).intValue());
            return h0.f84049a;
        }
    }

    private final boolean c() {
        return s.f(f24871d, getIntent().getStringExtra("productName"));
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        s.k(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C3152d c3152d = f24870c;
        if (c3152d != null) {
            c3152d.a();
        }
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null || f24869b == null) {
            finish();
        } else {
            e.b(this, null, z2.c.c(-533704942, true, new c()), 1, null);
        }
        Window window = getWindow();
        z0.b(window, false);
        z0.a(window, window.getDecorView()).h(2);
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (c()) {
            f24869b = null;
            f24870c = null;
        }
        super.onDestroy();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        s.k(intent, "intent");
        super.onNewIntent(intent);
        C3152d c3152d = f24870c;
        if (c3152d != null) {
            c3152d.a(intent);
        } else {
            a(intent);
        }
    }

    private final void a(Intent intent) {
        String type = intent.getType();
        String str = AnalyticsAttribute.NotAvailable;
        if (type == null) {
            type = AnalyticsAttribute.NotAvailable;
        }
        Pair pairA = jn0.x.a("type", type);
        String str2 = intent.getPackage();
        if (str2 == null) {
            str2 = AnalyticsAttribute.NotAvailable;
        }
        Pair pairA2 = jn0.x.a("package", str2);
        String action = intent.getAction();
        if (action != null) {
            str = action;
        }
        FourthlineAnalytics.e$default(FourthlineAnalytics.INSTANCE, "android_unexpected_intent", null, v0.m(pairA, pairA2, jn0.x.a("action", str)), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3654op a(w navController, lq.b systemUiController) {
        InterfaceC3910uo interfaceC3910uo = f24869b;
        if (interfaceC3910uo != null) {
            InterfaceC3697pp interfaceC3697ppB = interfaceC3910uo.b();
            C3152d c3152d = new C3152d(this, interfaceC3910uo.a().getFlavor().getLocalization(), new b(this));
            f24870c = c3152d;
            InterfaceC3654op interfaceC3654opBuild = interfaceC3697ppB.a(c3152d).a(new C4079yk(navController, systemUiController)).build();
            interfaceC3654opBuild.v().b();
            return interfaceC3654opBuild;
        }
        throw new RuntimeException("FL developer error. Check that component was set!");
    }
}
