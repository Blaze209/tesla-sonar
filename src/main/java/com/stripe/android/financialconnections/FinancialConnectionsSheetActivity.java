package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.foundation.layout.x;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import l50.FinancialConnectionsSheetNativeActivityArgs;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import p022s40.Function1;
import p026y50.i;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010'\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00190\u00190#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00190\u00190#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Ljn0/h0;", "p", "(Lr2/l;I)V", "Lcom/stripe/android/financialconnections/c;", "viewEffect", "Lj90/g;", "bottomSheetState", "u", "(Lcom/stripe/android/financialconnections/c;Lj90/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/c$c;", "v", "(Lcom/stripe/android/financialconnections/c$c;)V", "Lcom/stripe/android/financialconnections/launcher/b;", "result", "s", "(Lcom/stripe/android/financialconnections/launcher/b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/stripe/android/financialconnections/d;", "f", "Lkotlin/Lazy;", "t", "()Lcom/stripe/android/financialconnections/d;", "viewModel", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "g", "Landroidx/activity/result/ActivityResultLauncher;", "startBrowserForResult", "h", "startNativeAuthFlowForResult", "Lk40/a;", IntegerTokenConverter.CONVERTER_KEY, "Lk40/a;", "browserManager", "j", "a", "Lcom/stripe/android/financialconnections/b;", "state", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinancialConnectionsSheetActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50106k = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<Intent> startBrowserForResult;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<Intent> startNativeAuthFlowForResult;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private k40.a browserManager;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/financialconnections/launcher/a;", "args", "Landroid/content/Intent;", "c", "(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/a;)Landroid/content/Intent;", "Landroidx/lifecycle/s0;", "savedStateHandle", "b", "(Landroidx/lifecycle/s0;)Lcom/stripe/android/financialconnections/launcher/a;", AnalyticsAttribute.Intent, "a", "(Landroid/content/Intent;)Lcom/stripe/android/financialconnections/launcher/a;", "", "EXTRA_ARGS", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.stripe.android.financialconnections.launcher.a a(Intent intent) {
            s.k(intent, "intent");
            return (com.stripe.android.financialconnections.launcher.a) intent.getParcelableExtra("FinancialConnectionsSheetActivityArgs");
        }

        public final com.stripe.android.financialconnections.launcher.a b(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            return (com.stripe.android.financialconnections.launcher.a) savedStateHandle.f("FinancialConnectionsSheetActivityArgs");
        }

        public final Intent c(Context context, com.stripe.android.financialconnections.launcher.a args) {
            s.k(context, "context");
            s.k(args, "args");
            Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetActivity.class);
            intent.addFlags(65536);
            intent.putExtra("FinancialConnectionsSheetActivityArgs", args);
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f50112d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f50112d = i11;
        }

        public final void a(l lVar, int i11) {
            FinancialConnectionsSheetActivity.this.p(lVar, k2.a(this.f50112d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity", f = "FinancialConnectionsSheetActivity.kt", i = {0, 0}, l = {138}, m = "handleViewEffect", n = {"this", "viewEffect"}, s = {"L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50113n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50114o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f50115p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f50117r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50115p = obj;
            this.f50117r |= Integer.MIN_VALUE;
            return FinancialConnectionsSheetActivity.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<l, Integer, h0> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$onCreate$1$1", f = "FinancialConnectionsSheetActivity.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f50119n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int f50120o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ y3<FinancialConnectionsSheetState> f50121p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetActivity f50122q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ j90.g f50123r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y3<FinancialConnectionsSheetState> y3Var, FinancialConnectionsSheetActivity financialConnectionsSheetActivity, j90.g gVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f50121p = y3Var;
                this.f50122q = financialConnectionsSheetActivity;
                this.f50123r = gVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f50121p, this.f50122q, this.f50123r, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f50120o;
                if (i11 == 0) {
                    t.b(obj);
                    com.stripe.android.financialconnections.c viewEffect = d.c(this.f50121p).getViewEffect();
                    if (viewEffect != null) {
                        FinancialConnectionsSheetActivity financialConnectionsSheetActivity2 = this.f50122q;
                        j90.g gVar = this.f50123r;
                        this.f50119n = financialConnectionsSheetActivity2;
                        this.f50120o = 1;
                        if (financialConnectionsSheetActivity2.u(viewEffect, gVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        financialConnectionsSheetActivity = financialConnectionsSheetActivity2;
                    }
                    return h0.f84049a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSheetActivity = (FinancialConnectionsSheetActivity) this.f50119n;
                t.b(obj);
                financialConnectionsSheetActivity.t().V();
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetActivity f50124c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
                super(0);
                this.f50124c = financialConnectionsSheetActivity;
            }

            public final void b() {
                this.f50124c.t().M();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends u implements p<l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j90.g f50125c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetActivity f50126d;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
                a(Object obj) {
                    super(0, obj, com.stripe.android.financialconnections.d.class, "onDismissed", "onDismissed()V", 0);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    o();
                    return h0.f84049a;
                }

                public final void o() {
                    ((com.stripe.android.financialconnections.d) this.receiver).M();
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class b extends u implements p<l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FinancialConnectionsSheetActivity f50127c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
                    super(2);
                    this.f50127c = financialConnectionsSheetActivity;
                }

                public final void a(l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (o.J()) {
                        o.S(-627568770, i11, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetActivity.kt:91)");
                    }
                    this.f50127c.p(lVar, 8);
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
            c(j90.g gVar, FinancialConnectionsSheetActivity financialConnectionsSheetActivity) {
                super(2);
                this.f50125c = gVar;
                this.f50126d = financialConnectionsSheetActivity;
            }

            public final void a(l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (o.J()) {
                    o.S(2096424442, i11, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous>.<anonymous> (FinancialConnectionsSheetActivity.kt:87)");
                }
                p023w50.a.a(this.f50125c, null, new a(this.f50126d.t()), z2.c.b(lVar, -627568770, true, new b(this.f50126d)), lVar, j90.g.f83152e | 3072, 2);
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

        d() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FinancialConnectionsSheetState c(y3<FinancialConnectionsSheetState> y3Var) {
            return y3Var.getValue();
        }

        public final void b(l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(906787691, i11, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.onCreate.<anonymous> (FinancialConnectionsSheetActivity.kt:69)");
            }
            j90.g gVarB = j90.h.b(null, null, lVar, 0, 3);
            y3 y3VarA = r90.f.a(FinancialConnectionsSheetActivity.this.t().h(), lVar, 8);
            Function0.g(c(y3VarA).getViewEffect(), new a(y3VarA, FinancialConnectionsSheetActivity.this, gVarB, null), lVar, 64);
            f.d.a(false, new b(FinancialConnectionsSheetActivity.this), lVar, 0, 1);
            i.a(c(y3VarA).g(), z2.c.b(lVar, 2096424442, true, new c(gVarB, FinancialConnectionsSheetActivity.this)), lVar, 48, 0);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    public static final class e extends u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50128c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f50128c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f50128c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class f extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50129c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f50129c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f50129c.getStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class g extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f50130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50131d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f50130c = aVar;
            this.f50131d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f50130c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f50131d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f50132c = new h();

        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return com.stripe.android.financialconnections.d.INSTANCE.a();
        }
    }

    public FinancialConnectionsSheetActivity() {
        wn0.a aVar = h.f50132c;
        this.viewModel = new e1(o0.b(com.stripe.android.financialconnections.d.class), new f(this), aVar == null ? new e(this) : aVar, new g(null, this));
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: i40.b
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FinancialConnectionsSheetActivity.w(this.f75825a, (h.a) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.startBrowserForResult = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: i40.c
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FinancialConnectionsSheetActivity.x(this.f75826a, (h.a) obj);
            }
        });
        s.j(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.startNativeAuthFlowForResult = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(l lVar, int i11) {
        l lVarV = lVar.v(1849528791);
        if ((i11 & 1) == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1849528791, i11, -1, "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity.Loading (FinancialConnectionsSheetActivity.kt:98)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarF = x.f(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            d3.c cVarE = d3.c.INSTANCE.e();
            lVarV.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarF);
            if (lVarV.w() == null) {
                j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.u() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            Function1.g(x.q(companion, w4.h.g(52)), BitmapDescriptorFactory.HUE_RED, null, lVarV, 6, 6);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(i11));
        }
    }

    private final void s(com.stripe.android.financialconnections.launcher.b result) {
        setResult(-1, new Intent().putExtras(result.a()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(com.stripe.android.financialconnections.c cVar, j90.g gVar, Continuation<? super h0> continuation) {
        c cVar2;
        FinancialConnectionsSheetActivity financialConnectionsSheetActivity;
        if (continuation instanceof c) {
            cVar2 = (c) continuation;
            int i11 = cVar2.f50117r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f50117r = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(continuation);
            }
        } else {
            cVar2 = new c(continuation);
        }
        Object obj = cVar2.f50115p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f50117r;
        if (i12 == 0) {
            t.b(obj);
            if (cVar instanceof com.stripe.android.financialconnections.c.OpenAuthFlowWithUrl) {
                ActivityResultLauncher<Intent> activityResultLauncher = this.startBrowserForResult;
                k40.a aVar = this.browserManager;
                if (aVar == null) {
                    s.B("browserManager");
                    aVar = null;
                }
                Uri uri = Uri.parse(((com.stripe.android.financialconnections.c.OpenAuthFlowWithUrl) cVar).getUrl());
                s.j(uri, "parse(...)");
                activityResultLauncher.b(aVar.b(uri));
            } else if (cVar instanceof com.stripe.android.financialconnections.c.FinishWithResult) {
                Integer finishToast = ((com.stripe.android.financialconnections.c.FinishWithResult) cVar).getFinishToast();
                if (finishToast != null) {
                    Toast.makeText(this, finishToast.intValue(), 1).show();
                }
                cVar2.f50113n = this;
                cVar2.f50114o = cVar;
                cVar2.f50117r = 1;
                if (gVar.c(cVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsSheetActivity = this;
            } else if (cVar instanceof com.stripe.android.financialconnections.c.OpenNativeAuthFlow) {
                v((com.stripe.android.financialconnections.c.OpenNativeAuthFlow) cVar);
            }
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = (com.stripe.android.financialconnections.c) cVar2.f50114o;
        financialConnectionsSheetActivity = (FinancialConnectionsSheetActivity) cVar2.f50113n;
        t.b(obj);
        financialConnectionsSheetActivity.s(((com.stripe.android.financialconnections.c.FinishWithResult) cVar).getResult());
        return h0.f84049a;
    }

    private final void v(com.stripe.android.financialconnections.c.OpenNativeAuthFlow viewEffect) {
        this.startNativeAuthFlowForResult.b(FinancialConnectionsSheetNativeActivity.INSTANCE.c(this, new FinancialConnectionsSheetNativeActivityArgs(viewEffect.getConfiguration(), viewEffect.getInitialSyncResponse(), viewEffect.getElementsSessionContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(FinancialConnectionsSheetActivity this$0, h.a aVar) {
        s.k(this$0, "this$0");
        this$0.t().L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FinancialConnectionsSheetActivity this$0, h.a aVar) {
        s.k(this$0, "this$0");
        com.stripe.android.financialconnections.d dVarT = this$0.t();
        s.h(aVar);
        dVarT.Q(aVar);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        s.j(intent, "getIntent(...)");
        if (companion.a(intent) == null) {
            finish();
            return;
        }
        Application application = getApplication();
        s.j(application, "getApplication(...)");
        this.browserManager = new k40.a(application);
        if (savedInstanceState != null) {
            t().K();
        }
        f.e.b(this, null, z2.c.c(906787691, true, new d()), 1, null);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        t().I(intent);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        t().R();
    }

    public final com.stripe.android.financialconnections.d t() {
        return (com.stripe.android.financialconnections.d) this.viewModel.getValue();
    }
}
