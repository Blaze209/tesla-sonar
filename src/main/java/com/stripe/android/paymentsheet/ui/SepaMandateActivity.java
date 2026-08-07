package com.stripe.android.paymentsheet.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.z0;
import f90.n;
import j90.g;
import j90.h;
import jn0.h0;
import jn0.t;
import p008h80.w0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.l;
import p020r2.o;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SepaMandateActivity extends androidx.appcompat.app.c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f53611d;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C1048a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ SepaMandateActivity f53612c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f53613d;

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class C1049a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
                C1049a(Object obj) {
                    super(0, obj, SepaMandateActivity.class, "finish", "finish()V", 0);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    o();
                    return h0.f84049a;
                }

                public final void o() {
                    ((SepaMandateActivity) this.receiver).finish();
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class b extends u implements p<l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f53614c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ SepaMandateActivity f53615d;

                /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
                static final class C1050a extends u implements wn0.a<h0> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f53616c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1050a(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f53616c = sepaMandateActivity;
                    }

                    public final void b() {
                        Intent intentPutExtra = new Intent().putExtra("extra_activity_result", e.a.f53785a);
                        s.j(intentPutExtra, "putExtra(...)");
                        this.f53616c.setResult(-1, intentPutExtra);
                        this.f53616c.finish();
                    }

                    @Override // wn0.a
                    public /* bridge */ /* synthetic */ h0 invoke() {
                        b();
                        return h0.f84049a;
                    }
                }

                /* JADX INFO: renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
                static final class C1051b extends u implements wn0.a<h0> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f53617c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1051b(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f53617c = sepaMandateActivity;
                    }

                    public final void b() {
                        this.f53617c.finish();
                    }

                    @Override // wn0.a
                    public /* bridge */ /* synthetic */ h0 invoke() {
                        b();
                        return h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, SepaMandateActivity sepaMandateActivity) {
                    super(2);
                    this.f53614c = str;
                    this.f53615d = sepaMandateActivity;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-380837143, i11, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SepaMandateActivity.kt:58)");
                    }
                    String str = this.f53614c;
                    lVar.H(-3848641);
                    boolean zN = lVar.n(this.f53615d);
                    SepaMandateActivity sepaMandateActivity = this.f53615d;
                    Object objI = lVar.I();
                    if (zN || objI == l.INSTANCE.a()) {
                        objI = new C1050a(sepaMandateActivity);
                        lVar.B(objI);
                    }
                    wn0.a aVar = (wn0.a) objI;
                    lVar.T();
                    lVar.H(-3836662);
                    boolean zN2 = lVar.n(this.f53615d);
                    SepaMandateActivity sepaMandateActivity2 = this.f53615d;
                    Object objI2 = lVar.I();
                    if (zN2 || objI2 == l.INSTANCE.a()) {
                        objI2 = new C1051b(sepaMandateActivity2);
                        lVar.B(objI2);
                    }
                    lVar.T();
                    w0.a(str, aVar, (wn0.a) objI2, lVar, 0);
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
            C1048a(SepaMandateActivity sepaMandateActivity, String str) {
                super(2);
                this.f53612c = sepaMandateActivity;
                this.f53613d = str;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(-620021374, i11, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous> (SepaMandateActivity.kt:52)");
                }
                g gVarB = h.b(null, null, lVar, 0, 3);
                SepaMandateActivity sepaMandateActivity = this.f53612c;
                lVar.H(-934017577);
                boolean zN = lVar.n(sepaMandateActivity);
                Object objI = lVar.I();
                if (zN || objI == l.INSTANCE.a()) {
                    objI = new C1049a(sepaMandateActivity);
                    lVar.B(objI);
                }
                lVar.T();
                m30.a.a(gVarB, null, (wn0.a) ((co0.h) objI), z2.c.b(lVar, -380837143, true, new b(this.f53613d, this.f53612c)), lVar, g.f83152e | 3072, 2);
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
        a(String str) {
            super(2);
            this.f53611d = str;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(2089289300, i11, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous> (SepaMandateActivity.kt:51)");
            }
            n.a(null, null, null, z2.c.b(lVar, -620021374, true, new C1048a(SepaMandateActivity.this, this.f53611d)), lVar, 3072, 7);
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

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objB;
        super.onCreate(savedInstanceState);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            SepaMandateContract.Args.Companion companion2 = SepaMandateContract.Args.INSTANCE;
            Intent intent = getIntent();
            s.j(intent, "getIntent(...)");
            SepaMandateContract.Args argsA = companion2.a(intent);
            if (argsA == null) {
                throw new IllegalArgumentException("SepaMandateActivity was started without arguments.");
            }
            objB = jn0.s.b(argsA);
            if (jn0.s.g(objB)) {
                objB = null;
            }
            SepaMandateContract.Args args = (SepaMandateContract.Args) objB;
            String merchantName = args != null ? args.getMerchantName() : null;
            if (merchantName == null) {
                finish();
            } else {
                z0.b(getWindow(), false);
                f.e.b(this, null, z2.c.c(2089289300, true, new a(merchantName)), 1, null);
            }
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
    }
}
