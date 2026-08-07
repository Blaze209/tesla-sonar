package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.t;
import androidx.compose.ui.d;
import androidx.p002activity.ComponentActivity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f.e;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import jn0.h0;
import p009i2.C4668c1;
import p009i2.z1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.d4;
import p020r2.e3;
import p020r2.j;
import p020r2.l;
import p020r2.m1;
import p020r2.o;
import p020r2.x;
import v1.y;
import wn0.p;
import wn0.q;
import z3.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "composableFqn", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "f", "Ljava/lang/String;", "TAG", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreviewActivity extends ComponentActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String TAG = "PreviewActivity";

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(2);
            this.f6154c = str;
            this.f6155d = str2;
        }

        public final void a(l lVar, int i11) throws Exception {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-840626948, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
            }
            u4.a.f115362a.g(this.f6154c, this.f6155d, lVar, new Object[0]);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) throws Exception {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object[] f6156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f6158e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object[] f6159c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ m1 f6160d;

            /* JADX INFO: renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
            static final class C0133a extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ m1 f6161c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Object[] f6162d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0133a(m1 m1Var, Object[] objArr) {
                    super(0);
                    this.f6161c = m1Var;
                    this.f6162d = objArr;
                }

                public final void b() {
                    m1 m1Var = this.f6161c;
                    m1Var.a((m1Var.b() + 1) % this.f6162d.length);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object[] objArr, m1 m1Var) {
                super(2);
                this.f6159c = objArr;
                this.f6160d = m1Var;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(958604965, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)");
                }
                p<l, Integer, h0> pVarA = u4.b.f115363a.a();
                boolean zK = lVar.K(this.f6159c);
                m1 m1Var = this.f6160d;
                Object[] objArr = this.f6159c;
                Object objI = lVar.I();
                if (zK || objI == l.INSTANCE.a()) {
                    objI = new C0133a(m1Var, objArr);
                    lVar.B(objI);
                }
                C4668c1.a(pVarA, (wn0.a) objI, null, null, null, null, 0L, 0L, null, lVar, 6, 508);
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

        /* JADX INFO: renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/y;", "padding", "Ljn0/h0;", "a", "(Lv1/y;Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C0134b extends u implements q<y, l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f6163c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f6164d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f6165e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m1 f6166f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0134b(String str, String str2, Object[] objArr, m1 m1Var) {
                super(3);
                this.f6163c = str;
                this.f6164d = str2;
                this.f6165e = objArr;
                this.f6166f = m1Var;
            }

            public final void a(y yVar, l lVar, int i11) throws Exception {
                if ((i11 & 6) == 0) {
                    i11 |= lVar.n(yVar) ? 4 : 2;
                }
                if ((i11 & 19) == 18 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(57310875, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)");
                }
                d dVarH = t.h(d.INSTANCE, yVar);
                String str = this.f6163c;
                String str2 = this.f6164d;
                Object[] objArr = this.f6165e;
                m1 m1Var = this.f6166f;
                i0 i0VarH = g.h(d3.c.INSTANCE.o(), false);
                int iA = j.a(lVar, 0);
                x xVarC = lVar.c();
                d dVarE = androidx.compose.ui.c.e(lVar, dVarH);
                b4.g.Companion companion = b4.g.INSTANCE;
                wn0.a<b4.g> aVarA = companion.a();
                if (lVar.w() == null) {
                    j.c();
                }
                lVar.h();
                if (lVar.getInserting()) {
                    lVar.z(aVarA);
                } else {
                    lVar.d();
                }
                l lVarA = d4.a(lVar);
                d4.b(lVarA, i0VarH, companion.c());
                d4.b(lVarA, xVarC, companion.e());
                p<b4.g, Integer, h0> pVarB = companion.b();
                if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE, companion.d());
                i iVar = i.f4585a;
                u4.a.f115362a.g(str, str2, lVar, objArr[m1Var.b()]);
                lVar.g();
                if (o.J()) {
                    o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(y yVar, l lVar, Integer num) throws Exception {
                a(yVar, lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, String str, String str2) {
            super(2);
            this.f6156c = objArr;
            this.f6157d = str;
            this.f6158e = str2;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-861939235, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
            }
            Object objI = lVar.I();
            if (objI == l.INSTANCE.a()) {
                objI = e3.a(0);
                lVar.B(objI);
            }
            m1 m1Var = (m1) objI;
            z1.a(null, null, null, null, null, z2.c.e(958604965, true, new a(this.f6156c, m1Var), lVar, 54), 0, false, null, false, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, 0L, 0L, z2.c.e(57310875, true, new C0134b(this.f6157d, this.f6158e, this.f6156c, m1Var), lVar, 54), lVar, 196608, 12582912, 131039);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object[] f6169e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Object[] objArr) {
            super(2);
            this.f6167c = str;
            this.f6168d = str2;
            this.f6169e = objArr;
        }

        public final void a(l lVar, int i11) throws Exception {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(-1901447514, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
            }
            u4.a aVar = u4.a.f115362a;
            String str = this.f6167c;
            String str2 = this.f6168d;
            Object[] objArr = this.f6169e;
            aVar.g(str, str2, lVar, Arrays.copyOf(objArr, objArr.length));
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) throws Exception {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    private final void i(String composableFqn) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Log.d(this.TAG, "PreviewActivity has composable " + composableFqn);
        String strC1 = p013kotlin.text.t.C1(composableFqn, CoreConstants.DOT, null, 2, null);
        String strU1 = p013kotlin.text.t.u1(composableFqn, CoreConstants.DOT, null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            j(strC1, strU1, stringExtra);
            return;
        }
        Log.d(this.TAG, "Previewing '" + strU1 + "' without a parameter provider.");
        e.b(this, null, z2.c.c(-840626948, true, new a(strC1, strU1)), 1, null);
    }

    private final void j(String className, String methodName, String parameterProvider) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Log.d(this.TAG, "Previewing '" + methodName + "' with parameter provider: '" + parameterProvider + CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArrB = u4.d.b(u4.d.a(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrB.length > 1) {
            e.b(this, null, z2.c.c(-861939235, true, new b(objArrB, className, methodName)), 1, null);
        } else {
            e.b(this, null, z2.c.c(-1901447514, true, new c(className, methodName, objArrB)), 1, null);
        }
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        i(stringExtra);
    }
}
