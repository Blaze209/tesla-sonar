package com.stripe.android.financialconnections.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.b0;
import androidx.p002activity.d0;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.p0;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.p003lifecycle.x;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import l50.FinancialConnectionsSheetNativeActivityArgs;
import p009i2.p1;
import p009i2.q1;
import p009i2.r1;
import p011ja.r;
import p011ja.w;
import p011ja.z;
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
import p020r2.h2;
import p020r2.k2;
import p020r2.w2;
import p020r2.y3;
import p023w50.C4789j;
import q50.TopAppBarState;
import s50.FinancialConnectionsSheetNativeState;
import v1.y;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u0003J-\u0010!\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006M²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020I8\nX\u008a\u0084\u0002²\u0006\u000e\u0010L\u001a\u0004\u0018\u00010K8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Ljn0/h0;", "x", "y", "Lkotlinx/coroutines/Job;", "z", "()Lkotlinx/coroutines/Job;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "initialPane", "", "testMode", "m", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLr2/l;I)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onDestroy", "Lkotlinx/coroutines/flow/SharedFlow;", "Lo50/e;", "navigationChannel", "Lja/w;", "navHostController", "Lz50/j;", "keyboardController", "p", "(Lkotlinx/coroutines/flow/SharedFlow;Lja/w;Lz50/j;Lr2/l;I)V", "Ls50/f;", "f", "Lkotlin/Lazy;", "w", "()Ls50/f;", "viewModel", "Lcom/stripe/android/financialconnections/ui/a;", "g", "Lcom/stripe/android/financialconnections/ui/a;", "visibilityObserver", "Lo30/d;", "h", "Lo30/d;", "v", "()Lo30/d;", "setLogger", "(Lo30/d;)V", "logger", "Lo90/f;", IntegerTokenConverter.CONVERTER_KEY, "Lo90/f;", "u", "()Lo90/f;", "setImageLoader", "(Lo90/f;)V", "imageLoader", "Lk40/a;", "j", "Lk40/a;", "t", "()Lk40/a;", "setBrowserManager", "(Lk40/a;)V", "browserManager", "k", "a", "Ls50/c;", "state", "Lq50/b;", "topAppBarState", "Lja/k;", "backStackEntry", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinancialConnectionsSheetNativeActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50601l = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private a visibilityObserver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public o30.d logger;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public o90.f imageLoader;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public k40.a browserManager;

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ll50/e;", "args", "Landroid/content/Intent;", "c", "(Landroid/content/Context;Ll50/e;)Landroid/content/Intent;", "Landroidx/lifecycle/s0;", "savedStateHandle", "b", "(Landroidx/lifecycle/s0;)Ll50/e;", AnalyticsAttribute.Intent, "a", "(Landroid/content/Intent;)Ll50/e;", "", "EXTRA_ARGS", "Ljava/lang/String;", "EXTRA_RESULT", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinancialConnectionsSheetNativeActivityArgs a(Intent intent) {
            s.k(intent, "intent");
            return (FinancialConnectionsSheetNativeActivityArgs) intent.getParcelableExtra("FinancialConnectionsSheetNativeActivityArgs");
        }

        public final FinancialConnectionsSheetNativeActivityArgs b(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            return (FinancialConnectionsSheetNativeActivityArgs) savedStateHandle.f("FinancialConnectionsSheetNativeActivityArgs");
        }

        public final Intent c(Context context, FinancialConnectionsSheetNativeActivityArgs args) {
            s.k(context, "context");
            s.k(args, "args");
            Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetNativeActivity.class);
            intent.putExtra("FinancialConnectionsSheetNativeActivityArgs", args);
            return intent;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p50.b f50607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetNativeActivity f50608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f50609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y3<TopAppBarState> f50610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o50.b f50611g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetNativeActivity f50612c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ w f50613d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, w wVar) {
                super(0);
                this.f50612c = financialConnectionsSheetNativeActivity;
                this.f50613d = wVar;
            }

            public final void b() {
                s50.f fVarW = this.f50612c.w();
                r rVarF = this.f50613d.F();
                fVarW.S(rVarF != null ? o50.d.b(rVarF) : null);
                if (this.f50613d.Y()) {
                    return;
                }
                this.f50612c.w().T();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C0835b extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetNativeActivity f50614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ y3<TopAppBarState> f50615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ w f50616e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o50.b f50617f;

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$b$b$a */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class a extends u implements p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FinancialConnectionsSheetNativeActivity f50618c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ y3<TopAppBarState> f50619d;

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* synthetic */ class C0836a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
                    C0836a(Object obj) {
                        super(0, obj, s50.f.class, "handleOnCloseClick", "handleOnCloseClick()V", 0);
                    }

                    @Override // wn0.a
                    public /* bridge */ /* synthetic */ h0 invoke() {
                        o();
                        return h0.f84049a;
                    }

                    public final void o() {
                        ((s50.f) this.receiver).O();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, y3<TopAppBarState> y3Var) {
                    super(2);
                    this.f50618c = financialConnectionsSheetNativeActivity;
                    this.f50619d = y3Var;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1045885766, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:197)");
                    }
                    p023w50.o.c(FinancialConnectionsSheetNativeActivity.n(this.f50619d), new C0836a(this.f50618c.w()), lVar, 8);
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

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv1/y;", "it", "Ljn0/h0;", "a", "(Lv1/y;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class C0837b extends u implements q<y, p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ w f50620c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ o50.b f50621d;

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$b$b$b$a */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/u;", "Ljn0/h0;", "a", "(Lja/u;)V"}, k = 3, mv = {1, 9, 0})
                static final class a extends u implements wn0.l<p011ja.u, h0> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final a f50622c = new a();

                    a() {
                        super(1);
                    }

                    public final void a(p011ja.u NavHost) {
                        s.k(NavHost, "$this$NavHost");
                        o50.c.e(NavHost, o50.b.i.f96747i, null, 2, null);
                        o50.c.e(NavHost, o50.b.o.f96753i, null, 2, null);
                        o50.c.e(NavHost, o50.b.v.f96761i, null, 2, null);
                        o50.c.c(NavHost, o50.b.w.f96762i, null, 2, null);
                        o50.c.c(NavHost, o50.b.k.f96749i, null, 2, null);
                        o50.c.e(NavHost, o50.b.l.f96750i, null, 2, null);
                        o50.c.e(NavHost, o50.b.a.f96734i, null, 2, null);
                        o50.c.e(NavHost, o50.b.y.f96764i, null, 2, null);
                        o50.c.e(NavHost, o50.b.x.f96763i, null, 2, null);
                        o50.c.e(NavHost, o50.b.j.f96748i, null, 2, null);
                        o50.c.e(NavHost, o50.b.c.f96737i, null, 2, null);
                        o50.c.e(NavHost, o50.b.r.f96757i, null, 2, null);
                        o50.c.c(NavHost, o50.b.q.f96755i, null, 2, null);
                        o50.c.e(NavHost, o50.b.s.f96758i, null, 2, null);
                        o50.c.e(NavHost, o50.b.t.f96759i, null, 2, null);
                        o50.c.e(NavHost, o50.b.m.f96751i, null, 2, null);
                        o50.c.e(NavHost, o50.b.d.f96738i, null, 2, null);
                        o50.c.e(NavHost, o50.b.n.f96752i, null, 2, null);
                        o50.c.e(NavHost, o50.b.p.f96754i, null, 2, null);
                        o50.c.c(NavHost, o50.b.u.f96760i, null, 2, null);
                        o50.c.c(NavHost, o50.b.C2057b.f96736i, null, 2, null);
                    }

                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ h0 invoke(p011ja.u uVar) {
                        a(uVar);
                        return h0.f84049a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0837b(w wVar, o50.b bVar) {
                    super(3);
                    this.f50620c = wVar;
                    this.f50621d = bVar;
                }

                public final void a(y it, p020r2.l lVar, int i11) {
                    s.k(it, "it");
                    if ((i11 & 81) == 16 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1178447874, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:203)");
                    }
                    ka.m.b(this.f50620c, this.f50621d.g(), null, null, null, null, null, null, null, a.f50622c, lVar, 805306376, 508);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }

                @Override // wn0.q
                public /* bridge */ /* synthetic */ h0 invoke(y yVar, p020r2.l lVar, Integer num) {
                    a(yVar, lVar, num.intValue());
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0835b(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, y3<TopAppBarState> y3Var, w wVar, o50.b bVar) {
                super(2);
                this.f50614c = financialConnectionsSheetNativeActivity;
                this.f50615d = y3Var;
                this.f50616e = wVar;
                this.f50617f = bVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(712780309, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:195)");
                }
                C4789j.a(z2.c.b(lVar, 1045885766, true, new a(this.f50614c, this.f50615d)), z2.c.b(lVar, 1178447874, true, new C0837b(this.f50616e, this.f50617f)), lVar, 54);
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
        b(p50.b bVar, FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, w wVar, y3<TopAppBarState> y3Var, o50.b bVar2) {
            super(2);
            this.f50607c = bVar;
            this.f50608d = financialConnectionsSheetNativeActivity;
            this.f50609e = wVar;
            this.f50610f = y3Var;
            this.f50611g = bVar2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-789697280, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:188)");
            }
            f.d.a(true, new a(this.f50608d, this.f50609e), lVar, 6, 0);
            p023w50.a.b(this.f50607c, z2.c.b(lVar, 712780309, true, new C0835b(this.f50608d, this.f50610f, this.f50609e, this.f50611g)), lVar, q1.f74975e | 48);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane f50624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f50625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f50626f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FinancialConnectionsSessionManifest.Pane pane, boolean z11, int i11) {
            super(2);
            this.f50624d = pane;
            this.f50625e = z11;
            this.f50626f = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            FinancialConnectionsSheetNativeActivity.this.m(this.f50624d, this.f50625e, lVar, k2.a(this.f50626f | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffects$1", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50627n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y3<p011ja.k> f50629p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y3<p011ja.k> y3Var, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f50629p = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeActivity.this.new d(this.f50629p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r destination;
            FinancialConnectionsSessionManifest.Pane paneB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f50627n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            p011ja.k kVarQ = FinancialConnectionsSheetNativeActivity.q(this.f50629p);
            if (kVarQ == null || (destination = kVarQ.getDestination()) == null || (paneB = o50.d.b(destination)) == null) {
                return h0.f84049a;
            }
            FinancialConnectionsSheetNativeActivity.this.w().Q(paneB);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffects$2", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50630n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f50631o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ SharedFlow<o50.e> f50632p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Activity f50633q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ z50.j f50634r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ w f50635s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetNativeActivity f50636t;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo50/e;", AnalyticsAttribute.Intent, "Ljn0/h0;", "<anonymous>", "(Lo50/e;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavigationEffects$2$1", f = "FinancialConnectionsSheetNativeActivity.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "invokeSuspend", n = {AnalyticsAttribute.Intent}, s = {"L$0"})
        static final class a extends SuspendLambda implements p<o50.e, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f50637n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            /* synthetic */ Object f50638o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Activity f50639p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ z50.j f50640q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ w f50641r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetNativeActivity f50642s;

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/z;", "Ljn0/h0;", "a", "(Lja/z;)V"}, k = 3, mv = {1, 9, 0})
            static final class C0838a extends u implements wn0.l<z, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ o50.e f50643c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ String f50644d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0838a(o50.e eVar, String str) {
                    super(1);
                    this.f50643c = eVar;
                    this.f50644d = str;
                }

                public final void a(z navigate) {
                    s.k(navigate, "$this$navigate");
                    navigate.e(((o50.e.NavigateTo) this.f50643c).getIsSingleTop());
                    if (((o50.e.NavigateTo) this.f50643c).getPopUpTo() != null) {
                        v50.b.c(navigate, this.f50644d, ((o50.e.NavigateTo) this.f50643c).getPopUpTo());
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(z zVar) {
                    a(zVar);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity, z50.j jVar, w wVar, FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f50639p = activity;
                this.f50640q = jVar;
                this.f50641r = wVar;
                this.f50642s = financialConnectionsSheetNativeActivity;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o50.e eVar, Continuation<? super h0> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f50639p, this.f50640q, this.f50641r, this.f50642s, continuation);
                aVar.f50638o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                o50.e eVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f50637n;
                if (i11 == 0) {
                    t.b(obj);
                    o50.e eVar2 = (o50.e) this.f50638o;
                    Activity activity = this.f50639p;
                    if (activity != null && activity.isFinishing()) {
                        return h0.f84049a;
                    }
                    z50.j jVar = this.f50640q;
                    this.f50638o = eVar2;
                    this.f50637n = 1;
                    if (jVar.c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = eVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (o50.e) this.f50638o;
                    t.b(obj);
                }
                if (eVar instanceof o50.e.NavigateTo) {
                    r rVarF = this.f50641r.F();
                    String route = rVarF != null ? rVarF.getRoute() : null;
                    String route2 = ((o50.e.NavigateTo) eVar).getRoute();
                    if (route2.length() > 0 && !s.f(route2, route)) {
                        this.f50642s.v().debug("Navigating from " + route + " to " + route2);
                        this.f50641r.U(route2, new C0838a(eVar, route));
                    }
                } else if (s.f(eVar, o50.e.a.f96769a)) {
                    this.f50641r.Y();
                }
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(SharedFlow<? extends o50.e> sharedFlow, Activity activity, z50.j jVar, w wVar, FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f50632p = sharedFlow;
            this.f50633q = activity;
            this.f50634r = jVar;
            this.f50635s = wVar;
            this.f50636t = financialConnectionsSheetNativeActivity;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f50632p, this.f50633q, this.f50634r, this.f50635s, this.f50636t, continuation);
            eVar.f50631o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f50630n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            FlowKt.launchIn(FlowKt.onEach(this.f50632p, new a(this.f50633q, this.f50634r, this.f50635s, this.f50636t, null)), (CoroutineScope) this.f50631o);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SharedFlow<o50.e> f50646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f50647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ z50.j f50648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f50649g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(SharedFlow<? extends o50.e> sharedFlow, w wVar, z50.j jVar, int i11) {
            super(2);
            this.f50646d = sharedFlow;
            this.f50647e = wVar;
            this.f50648f = jVar;
            this.f50649g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            FinancialConnectionsSheetNativeActivity.this.p(this.f50646d, this.f50647e, this.f50648f, lVar, k2.a(this.f50649g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/b0;", "Ljn0/h0;", "a", "(Landroidx/activity/b0;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<b0, h0> {
        g() {
            super(1);
        }

        public final void a(b0 addCallback) {
            s.k(addCallback, "$this$addCallback");
            FinancialConnectionsSheetNativeActivity.this.w().T();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b0 b0Var) {
            a(b0Var);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class h extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        h(Object obj) {
            super(0, obj, s50.f.class, "onBackgrounded", "onBackgrounded()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((s50.f) this.receiver).U();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class i extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        i(Object obj) {
            super(0, obj, s50.f.class, "onForegrounded", "onForegrounded()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((s50.f) this.receiver).Y();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50651n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f50653n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetNativeActivity f50654o;

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$j$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls50/d;", "viewEffect", "Ljn0/h0;", "a", "(Ls50/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            static final class C0839a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FinancialConnectionsSheetNativeActivity f50655a;

                C0839a(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
                    this.f50655a = financialConnectionsSheetNativeActivity;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(s50.d dVar, Continuation<? super h0> continuation) {
                    if (dVar instanceof s50.d.OpenUrl) {
                        FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.f50655a;
                        k40.a aVarT = financialConnectionsSheetNativeActivity.t();
                        Uri uri = Uri.parse(((s50.d.OpenUrl) dVar).getUrl());
                        s.j(uri, "parse(...)");
                        financialConnectionsSheetNativeActivity.startActivity(aVarT.b(uri));
                    } else if (dVar instanceof s50.d.Finish) {
                        this.f50655a.setResult(-1, new Intent().putExtra("result", ((s50.d.Finish) dVar).getResult()));
                        this.f50655a.finish();
                    }
                    this.f50655a.w().c0();
                    return h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Flow<s50.d> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Flow f50656a;

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$j$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class C0840a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ FlowCollector f50657a;

                    /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$j$a$b$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$observeViewEffects$1$1$invokeSuspend$$inlined$map$1$2", f = "FinancialConnectionsSheetNativeActivity.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                    public static final class C0841a extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f50658n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        int f50659o;

                        public C0841a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f50658n = obj;
                            this.f50659o |= Integer.MIN_VALUE;
                            return C0840a.this.emit(null, this);
                        }
                    }

                    public C0840a(FlowCollector flowCollector) {
                        this.f50657a = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        C0841a c0841a;
                        if (continuation instanceof C0841a) {
                            c0841a = (C0841a) continuation;
                            int i11 = c0841a.f50659o;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0841a.f50659o = i11 - Integer.MIN_VALUE;
                            } else {
                                c0841a = new C0841a(continuation);
                            }
                        } else {
                            c0841a = new C0841a(continuation);
                        }
                        Object obj2 = c0841a.f50658n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = c0841a.f50659o;
                        if (i12 == 0) {
                            t.b(obj2);
                            FlowCollector flowCollector = this.f50657a;
                            s50.d viewEffect = ((FinancialConnectionsSheetNativeState) obj).getViewEffect();
                            c0841a.f50659o = 1;
                            if (flowCollector.emit(viewEffect, c0841a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t.b(obj2);
                        }
                        return h0.f84049a;
                    }
                }

                public b(Flow flow) {
                    this.f50656a = flow;
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super s50.d> flowCollector, Continuation continuation) {
                    Object objCollect = this.f50656a.collect(new C0840a(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f50654o = financialConnectionsSheetNativeActivity;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f50654o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f50653n;
                if (i11 == 0) {
                    t.b(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.distinctUntilChanged(new b(this.f50654o.w().h())));
                    C0839a c0839a = new C0839a(this.f50654o);
                    this.f50653n = 1;
                    if (flowFilterNotNull.collect(c0839a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetNativeActivity.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50651n;
            if (i11 == 0) {
                t.b(obj);
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = FinancialConnectionsSheetNativeActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(financialConnectionsSheetNativeActivity, null);
                this.f50651n = 1;
                if (p0.b(financialConnectionsSheetNativeActivity, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetNativeActivityArgs f50661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetNativeActivity f50662d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FinancialConnectionsSheetNativeActivity f50663c;

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* synthetic */ class C0842a extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
                C0842a(Object obj) {
                    super(0, obj, s50.f.class, "onBackPressed", "onBackPressed()V", 0);
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    o();
                    return h0.f84049a;
                }

                public final void o() {
                    ((s50.f) this.receiver).T();
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
            static final class b extends u implements p<p020r2.l, Integer, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FinancialConnectionsSheetNativeActivity f50664c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ y3<FinancialConnectionsSheetNativeState> f50665d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, y3<FinancialConnectionsSheetNativeState> y3Var) {
                    super(2);
                    this.f50664c = financialConnectionsSheetNativeActivity;
                    this.f50665d = y3Var;
                }

                public final void a(p020r2.l lVar, int i11) {
                    if ((i11 & 11) == 2 && lVar.b()) {
                        lVar.j();
                        return;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(1681319268, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:113)");
                    }
                    this.f50664c.m(a.c(this.f50665d).getInitialPane(), a.c(this.f50665d).getTestMode(), lVar, 512);
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
            a(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
                super(2);
                this.f50663c = financialConnectionsSheetNativeActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FinancialConnectionsSheetNativeState c(y3<FinancialConnectionsSheetNativeState> y3Var) {
                return y3Var.getValue();
            }

            public final void b(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1887094632, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.<anonymous>.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:104)");
                }
                p023w50.a.a(j90.h.b(r1.Expanded, null, lVar, 6, 2), null, new C0842a(this.f50663c.w()), z2.c.b(lVar, 1681319268, true, new b(this.f50663c, r90.f.a(this.f50663c.w().h(), lVar, 8))), lVar, j90.g.f83152e | 3072, 2);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                b(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs, FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
            super(2);
            this.f50661c = financialConnectionsSheetNativeActivityArgs;
            this.f50662d = financialConnectionsSheetNativeActivity;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-32931369, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.onCreate.<anonymous> (FinancialConnectionsSheetNativeActivity.kt:103)");
            }
            p026y50.i.a(v50.b.h(this.f50661c), z2.c.b(lVar, 1887094632, true, new a(this.f50662d)), lVar, 48, 0);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    public static final class l extends u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f50666c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f50666c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class m extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50667c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f50667c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f50667c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class n extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f50668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f50669d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f50668c = aVar;
            this.f50669d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f50668c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f50669d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements wn0.a<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f50670c = new o();

        o() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return s50.f.INSTANCE.c();
        }
    }

    public FinancialConnectionsSheetNativeActivity() {
        wn0.a aVar = o.f50670c;
        this.viewModel = new e1(o0.b(s50.f.class), new m(this), aVar == null ? new l(this) : aVar, new n(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState n(y3<TopAppBarState> y3Var) {
        return y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p011ja.k q(y3<p011ja.k> y3Var) {
        return y3Var.getValue();
    }

    private final void x() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        s.j(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        d0.b(onBackPressedDispatcher, null, false, new g(), 3, null);
    }

    private final void y() {
        a aVar = new a(new h(w()), new i(w()));
        getLifecycle().a(aVar);
        this.visibilityObserver = aVar;
    }

    private final Job z() {
        return BuildersKt__Builders_commonKt.launch$default(x.a(this), null, null, new j(null), 3, null);
    }

    public final void m(FinancialConnectionsSessionManifest.Pane initialPane, boolean z11, p020r2.l lVar, int i11) {
        s.k(initialPane, "initialPane");
        p020r2.l lVarV = lVar.v(915147200);
        if (p020r2.o.J()) {
            p020r2.o.S(915147200, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavHost (FinancialConnectionsSheetNativeActivity.kt:164)");
        }
        Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
        lVarV.H(1511327908);
        Object objI = lVarV.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = new v50.a(context, t());
            lVarV.B(objI);
        }
        v50.a aVar = (v50.a) objI;
        lVarV.T();
        lVarV.H(1511330812);
        boolean z12 = (((i11 & 14) ^ 6) > 4 && lVarV.n(initialPane)) || (i11 & 6) == 4;
        Object objI2 = lVarV.I();
        if (z12 || objI2 == companion.a()) {
            objI2 = o50.d.a(initialPane);
            lVarV.B(objI2);
        }
        o50.b bVar = (o50.b) objI2;
        lVarV.T();
        y3 y3VarA = r90.f.a(w().L(), lVarV, 8);
        q1 q1VarJ = p1.j(r1.Hidden, null, null, true, lVarV, 3078, 6);
        lVarV.H(1511340504);
        Object objI3 = lVarV.I();
        if (objI3 == companion.a()) {
            objI3 = new p50.b(q1VarJ);
            lVarV.B(objI3);
        }
        p50.b bVar2 = (p50.b) objI3;
        lVarV.T();
        w wVarE = ka.l.e(new p011ja.d0[]{bVar2}, lVarV, 8);
        p(w().K(), wVarE, z50.l.b(lVarV, 0), lVarV, 4168);
        p020r2.w.b(new h2[]{v50.b.f().d(Boolean.valueOf(z11)), v50.b.e().d(wVarE), v50.b.d().d(u()), z0.t().d(aVar), v50.b.g().d(w())}, z2.c.b(lVarV, -789697280, true, new b(bVar2, this, wVarE, y3VarA, bVar)), lVarV, 56);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(initialPane, z11, i11));
        }
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        s.j(intent, "getIntent(...)");
        FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgsA = companion.a(intent);
        if (financialConnectionsSheetNativeActivityArgsA == null) {
            finish();
            return;
        }
        w().getActivityRetainedComponent().o(this);
        x();
        y();
        z();
        f.e.b(this, null, z2.c.c(-32931369, true, new k(financialConnectionsSheetNativeActivityArgsA, this)), 1, null);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onDestroy() {
        a aVar = this.visibilityObserver;
        if (aVar != null) {
            getLifecycle().d(aVar);
        }
        super.onDestroy();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        w().P(intent);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        w().a0();
    }

    public final void p(SharedFlow<? extends o50.e> navigationChannel, w navHostController, z50.j keyboardController, p020r2.l lVar, int i11) {
        s.k(navigationChannel, "navigationChannel");
        s.k(navHostController, "navHostController");
        s.k(keyboardController, "keyboardController");
        p020r2.l lVarV = lVar.v(1564768138);
        if (p020r2.o.J()) {
            p020r2.o.S(1564768138, i11, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity.NavigationEffects (FinancialConnectionsSheetNativeActivity.kt:259)");
        }
        Object objU = lVarV.U(AndroidCompositionLocals_androidKt.g());
        Activity activity = objU instanceof Activity ? (Activity) objU : null;
        y3<p011ja.k> y3VarD = ka.l.d(navHostController, lVarV, 8);
        Function0.g(q(y3VarD), new d(y3VarD, null), lVarV, 72);
        Activity activity2 = activity;
        Function0.e(activity2, navHostController, navigationChannel, new e(navigationChannel, activity2, keyboardController, navHostController, this, null), lVarV, 4680);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(navigationChannel, navHostController, keyboardController, i11));
        }
    }

    public final k40.a t() {
        k40.a aVar = this.browserManager;
        if (aVar != null) {
            return aVar;
        }
        s.B("browserManager");
        return null;
    }

    public final o90.f u() {
        o90.f fVar = this.imageLoader;
        if (fVar != null) {
            return fVar;
        }
        s.B("imageLoader");
        return null;
    }

    public final o30.d v() {
        o30.d dVar = this.logger;
        if (dVar != null) {
            return dVar;
        }
        s.B("logger");
        return null;
    }

    public final s50.f w() {
        return (s50.f) this.viewModel.getValue();
    }
}
