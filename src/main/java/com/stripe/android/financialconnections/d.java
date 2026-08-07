package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.react.bridge.BaseJavaModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.model.Token;
import com.stripe.android.model.n0;
import ezvcard.property.Gender;
import j40.FinancialConnectionsEvent;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import l50.InstantDebitsResult;
import n40.b0;
import n40.p0;
import n40.r0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001kBk\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J-\u0010*\u001a\u0004\u0018\u00010\u00032\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010 J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u0010/J\u0017\u00103\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u001c2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u001c2\u0006\u0010;\u001a\u000205H\u0002¢\u0006\u0004\b<\u00108J\u0017\u0010=\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010/J\u0015\u0010>\u001a\u0004\u0018\u000105*\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010?J5\u0010E\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020&2\n\b\u0003\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u001cH\u0000¢\u0006\u0004\bG\u0010 J\r\u0010H\u001a\u00020\u001c¢\u0006\u0004\bH\u0010 J\u000f\u0010I\u001a\u00020\u001cH\u0000¢\u0006\u0004\bI\u0010 J\u000f\u0010J\u001a\u00020\u001cH\u0000¢\u0006\u0004\bJ\u0010 J\u0017\u0010M\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ\u0019\u0010Q\u001a\u00020\u001c2\b\u0010P\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001cH\u0000¢\u0006\u0004\bS\u0010 J\u0019\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010eR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010fR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010gR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010i¨\u0006l"}, d2 = {"Lcom/stripe/android/financialconnections/d;", "Ls50/i;", "Lcom/stripe/android/financialconnections/b;", "", "applicationId", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ln40/b0;", "getOrFetchSync", "Ln40/s;", "fetchFinancialConnectionsSession", "Ln40/t;", "fetchFinancialConnectionsSessionForToken", "Lo30/d;", "logger", "Lk40/a;", "browserManager", "Lj40/k;", "eventReporter", "Lj40/f;", "analyticsTracker", "Ln40/r0;", "nativeRouter", "Ln40/p0;", "nativeAuthFlowCoordinator", "initialState", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/s0;Ln40/b0;Ln40/s;Ln40/t;Lo30/d;Lk40/a;Lj40/k;Lj40/f;Ln40/r0;Ln40/p0;Lcom/stripe/android/financialconnections/b;)V", "Ljn0/h0;", "X", "(Landroidx/lifecycle/s0;)V", Gender.FEMALE, "()V", "Lcom/stripe/android/financialconnections/model/k0;", BaseJavaModule.METHOD_TYPE_SYNC, "W", "(Lcom/stripe/android/financialconnections/model/k0;)V", "hostedAuthUrl", "", "isInstantDebits", "Lcom/stripe/android/model/n0;", "linkMode", "C", "(Ljava/lang/String;ZLcom/stripe/android/model/n0;)Ljava/lang/String;", "J", "state", "D", "(Lcom/stripe/android/financialconnections/b;)V", "E", Gender.UNKNOWN, "unwrappedUriString", "S", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "receivedUrl", Gender.NONE, "(Landroid/net/Uri;)V", "P", "(Lcom/stripe/android/financialconnections/b;Landroid/net/Uri;)V", ImagesContract.URL, "T", Gender.OTHER, "Z", "(Ljava/lang/String;)Landroid/net/Uri;", "Lcom/stripe/android/financialconnections/launcher/b;", "result", "fromNative", "", "finishMessage", "G", "(Lcom/stripe/android/financialconnections/b;Lcom/stripe/android/financialconnections/launcher/b;ZLjava/lang/Integer;)V", "K", Gender.MALE, "R", "L", "Lh/a;", "activityResult", "Q", "(Lh/a;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "I", "(Landroid/content/Intent;)V", "V", "Lq50/c;", "a0", "(Lcom/stripe/android/financialconnections/b;)Lq50/c;", "v", "Ljava/lang/String;", "w", "Ln40/b0;", "x", "Ln40/s;", "y", "Ln40/t;", "z", "Lo30/d;", "A", "Lk40/a;", "B", "Lj40/k;", "Lj40/f;", "Ln40/r0;", "Lcom/stripe/android/financialconnections/b;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends s50.i<FinancialConnectionsSheetState> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 8;
    private static final ViewModelProvider.Factory I;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final k40.a browserManager;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final j40.k eventReporter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final j40.f analyticsTracker;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final r0 nativeRouter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FinancialConnectionsSheetState initialState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final String applicationId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final n40.s fetchFinancialConnectionsSession;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final n40.t fetchFinancialConnectionsSessionForToken;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.financialconnections.launcher.b.Failed f50166c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.financialconnections.launcher.b.Failed failed) {
            super(1);
            this.f50166c = failed;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, null, null, new c.FinishWithResult(this.f50166c, null, 2, null), 15, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lcom/stripe/android/financialconnections/d;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/d;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<CreationExtras, d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f50167c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(CreationExtras initializer) {
            p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
            s0 s0VarA = v0.a(initializer);
            Bundle bundle = (Bundle) s0VarA.f("financial_connections_sheet_state");
            Object objA = initializer.a(ViewModelProvider.a.f8735h);
            p013kotlin.jvm.internal.s.i(objA, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) objA;
            com.stripe.android.financialconnections.launcher.a aVarB = FinancialConnectionsSheetActivity.INSTANCE.b(s0VarA);
            if (aVarB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            FinancialConnectionsSheetState financialConnectionsSheetState = new FinancialConnectionsSheetState(aVarB, bundle);
            return m40.a.a().a(application).b(s0VarA).d(financialConnectionsSheetState).c(financialConnectionsSheetState.getInitialArgs().getConfiguration()).build().a();
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.d$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/d$c;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "", "MAX_ACCOUNTS", "I", "", "QUERY_BANK_NAME", "Ljava/lang/String;", "QUERY_PARAM_LAST4", "QUERY_PARAM_PAYMENT_METHOD_ID", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a() {
            return d.I;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSession$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class C0822d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50168n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetState f50170p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0822d(FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super C0822d> continuation) {
            super(2, continuation);
            this.f50170p = financialConnectionsSheetState;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new C0822d(this.f50170p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50168n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    d dVar = d.this;
                    FinancialConnectionsSheetState financialConnectionsSheetState = this.f50170p;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    n40.s sVar = dVar.fetchFinancialConnectionsSession;
                    String strF = financialConnectionsSheetState.f();
                    this.f50168n = 1;
                    obj = sVar.a(strF, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                objB = jn0.s.b((FinancialConnectionsSession) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            d dVar2 = d.this;
            FinancialConnectionsSheetState financialConnectionsSheetState2 = this.f50170p;
            if (jn0.s.h(objB)) {
                d.H(dVar2, financialConnectionsSheetState2, new com.stripe.android.financialconnections.launcher.b.Completed(null, (FinancialConnectionsSession) objB, null, 5, null), false, null, 12, null);
            }
            d dVar3 = d.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                d.H(dVar3, dVar3.h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(thE), false, null, 12, null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C0822d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchFinancialConnectionsSessionForToken$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50171n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetState f50173p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f50173p = financialConnectionsSheetState;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new e(this.f50173p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50171n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    d dVar = d.this;
                    FinancialConnectionsSheetState financialConnectionsSheetState = this.f50173p;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    n40.t tVar = dVar.fetchFinancialConnectionsSessionForToken;
                    String strF = financialConnectionsSheetState.f();
                    this.f50171n = 1;
                    obj = tVar.a(strF, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                objB = jn0.s.b((Pair) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            d dVar2 = d.this;
            FinancialConnectionsSheetState financialConnectionsSheetState2 = this.f50173p;
            if (jn0.s.h(objB)) {
                Pair pair = (Pair) objB;
                d.H(dVar2, financialConnectionsSheetState2, new com.stripe.android.financialconnections.launcher.b.Completed(null, (FinancialConnectionsSession) pair.a(), (Token) pair.b(), 1, null), false, null, 12, null);
            }
            d dVar3 = d.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                d.H(dVar3, dVar3.h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(thE), false, null, 12, null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$fetchManifest$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50174n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50174n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    d dVar = d.this;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    b0 b0Var = dVar.getOrFetchSync;
                    b0.a.C1985a c1985a = b0.a.C1985a.f93053a;
                    this.f50174n = 1;
                    obj = b0Var.a(c1985a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                objB = jn0.s.b((SynchronizeSessionResponse) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            d dVar2 = d.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                d.H(dVar2, dVar2.h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(thE), false, null, 12, null);
            }
            d dVar3 = d.this;
            if (jn0.s.h(objB)) {
                dVar3.W((SynchronizeSessionResponse) objB);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.financialconnections.launcher.b f50176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f50177d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.financialconnections.launcher.b bVar, Integer num) {
            super(1);
            this.f50176c = bVar;
            this.f50177d = num;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, null, null, new c.FinishWithResult(this.f50176c, this.f50177d), 15, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$handleOnNewIntent$1", f = "FinancialConnectionsSheetViewModel.kt", i = {0}, l = {568}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50178n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50179o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f50180p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f50181q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Intent f50183s;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50184c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.NONE, null, 23, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Intent intent, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f50183s = intent;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new h(this.f50183s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:52:0x010a A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:13:0x0045, B:15:0x004b, B:17:0x0051, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:70:0x015b, B:30:0x00a9, B:32:0x00af, B:34:0x00b7, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00ed, B:46:0x00f4, B:48:0x00fa, B:50:0x0100, B:52:0x010a, B:54:0x0110, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:69:0x0142), top: B:75:0x0045 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x010f  */
        /* JADX WARN: Code duplicated, block: B:56:0x0116 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:13:0x0045, B:15:0x004b, B:17:0x0051, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:70:0x015b, B:30:0x00a9, B:32:0x00af, B:34:0x00b7, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00ed, B:46:0x00f4, B:48:0x00fa, B:50:0x0100, B:52:0x010a, B:54:0x0110, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:69:0x0142), top: B:75:0x0045 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x011a  */
        /* JADX WARN: Code duplicated, block: B:61:0x0127  */
        /* JADX WARN: Code duplicated, block: B:64:0x0132 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:13:0x0045, B:15:0x004b, B:17:0x0051, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:70:0x015b, B:30:0x00a9, B:32:0x00af, B:34:0x00b7, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00ed, B:46:0x00f4, B:48:0x00fa, B:50:0x0100, B:52:0x010a, B:54:0x0110, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:69:0x0142), top: B:75:0x0045 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0137  */
        /* JADX WARN: Code duplicated, block: B:68:0x013e A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:13:0x0045, B:15:0x004b, B:17:0x0051, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:70:0x015b, B:30:0x00a9, B:32:0x00af, B:34:0x00b7, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00ed, B:46:0x00f4, B:48:0x00fa, B:50:0x0100, B:52:0x010a, B:54:0x0110, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:69:0x0142), top: B:75:0x0045 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0142 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:13:0x0045, B:15:0x004b, B:17:0x0051, B:21:0x005b, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:70:0x015b, B:30:0x00a9, B:32:0x00af, B:34:0x00b7, B:36:0x00bd, B:38:0x00c3, B:40:0x00c9, B:42:0x00cf, B:44:0x00ed, B:46:0x00f4, B:48:0x00fa, B:50:0x0100, B:52:0x010a, B:54:0x0110, B:56:0x0116, B:58:0x011c, B:60:0x0122, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x013e, B:69:0x0142), top: B:75:0x0045 }] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Intent intent;
            Mutex mutex;
            d dVar;
            String string;
            Uri uriZ;
            Uri.Builder builderClearQuery;
            String strValueOf;
            FinancialConnectionsSessionManifest manifest;
            String successUrl;
            Uri.Builder builderClearQuery2;
            String strValueOf2;
            FinancialConnectionsSessionManifest manifest2;
            String cancelUrl;
            Uri.Builder builderBuildUpon;
            Uri.Builder builderBuildUpon2;
            Uri.Builder builderClearQuery3;
            Uri uriBuild;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50181q;
            if (i11 == 0) {
                jn0.t.b(obj);
                Mutex mutex2 = d.this.mutex;
                intent = this.f50183s;
                d dVar2 = d.this;
                this.f50178n = mutex2;
                this.f50179o = intent;
                this.f50180p = dVar2;
                this.f50181q = 1;
                if (mutex2.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                dVar = dVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d dVar3 = (d) this.f50180p;
                intent = (Intent) this.f50179o;
                mutex = (Mutex) this.f50178n;
                jn0.t.b(obj);
                dVar = dVar3;
            }
            if (intent != null) {
                try {
                    Uri data = intent.getData();
                    if (data == null || (string = data.toString()) == null) {
                        uriZ = null;
                    } else {
                        uriZ = dVar.Z(string);
                    }
                } finally {
                    mutex.unlock(null);
                }
            } else {
                uriZ = null;
            }
            FinancialConnectionsSheetState value = dVar.h().getValue();
            if (p013kotlin.jvm.internal.s.f(uriZ != null ? uriZ.getHost() : null, "native-redirect")) {
                String string2 = uriZ.toString();
                p013kotlin.jvm.internal.s.j(string2, "toString(...)");
                dVar.S(p013kotlin.text.t.X(string2, "stripe-auth://native-redirect/" + dVar.applicationId + "/", "", false, 4, null));
            } else {
                if (p013kotlin.jvm.internal.s.f(uriZ != null ? uriZ.getHost() : null, "link-accounts")) {
                    Uri.Builder builderBuildUpon3 = uriZ.buildUpon();
                    if (p013kotlin.jvm.internal.s.f((builderBuildUpon3 == null || (builderClearQuery3 = builderBuildUpon3.clearQuery()) == null || (uriBuild = builderClearQuery3.build()) == null) ? null : uriBuild.getPath(), "/" + dVar.applicationId + "/authentication_return")) {
                        dVar.N(uriZ);
                    } else {
                        if (uriZ != null) {
                            builderClearQuery = null;
                        } else {
                            builderClearQuery = null;
                        }
                        strValueOf = String.valueOf(builderClearQuery);
                        manifest = value.getManifest();
                        if (manifest != null) {
                            successUrl = manifest.getSuccessUrl();
                        } else {
                            successUrl = null;
                        }
                        if (p013kotlin.jvm.internal.s.f(strValueOf, successUrl)) {
                            dVar.P(value, uriZ);
                        } else {
                            if (uriZ != null) {
                                builderClearQuery2 = null;
                            } else {
                                builderClearQuery2 = null;
                            }
                            strValueOf2 = String.valueOf(builderClearQuery2);
                            manifest2 = value.getManifest();
                            if (manifest2 != null) {
                                cancelUrl = manifest2.getCancelUrl();
                            } else {
                                cancelUrl = null;
                            }
                            if (p013kotlin.jvm.internal.s.f(strValueOf2, cancelUrl)) {
                                dVar.O(value);
                            } else {
                                dVar.k(a.f50184c);
                                d.H(dVar, value, new com.stripe.android.financialconnections.launcher.b.Failed(new Exception("Error processing FinancialConnectionsSheet intent")), false, null, 12, null);
                            }
                        }
                    }
                } else {
                    if (uriZ != null || (builderBuildUpon2 = uriZ.buildUpon()) == null) {
                        builderClearQuery = null;
                    } else {
                        builderClearQuery = builderBuildUpon2.clearQuery();
                    }
                    strValueOf = String.valueOf(builderClearQuery);
                    manifest = value.getManifest();
                    if (manifest != null) {
                        successUrl = manifest.getSuccessUrl();
                    } else {
                        successUrl = null;
                    }
                    if (p013kotlin.jvm.internal.s.f(strValueOf, successUrl)) {
                        dVar.P(value, uriZ);
                    } else {
                        if (uriZ != null || (builderBuildUpon = uriZ.buildUpon()) == null) {
                            builderClearQuery2 = null;
                        } else {
                            builderClearQuery2 = builderBuildUpon.clearQuery();
                        }
                        strValueOf2 = String.valueOf(builderClearQuery2);
                        manifest2 = value.getManifest();
                        if (manifest2 != null) {
                            cancelUrl = manifest2.getCancelUrl();
                        } else {
                            cancelUrl = null;
                        }
                        if (p013kotlin.jvm.internal.s.f(strValueOf2, cancelUrl)) {
                            dVar.O(value);
                        } else {
                            dVar.k(a.f50184c);
                            d.H(dVar, value, new com.stripe.android.financialconnections.launcher.b.Failed(new Exception("Error processing FinancialConnectionsSheet intent")), false, null, 12, null);
                        }
                    }
                }
            }
            h0 h0Var = h0.f84049a;
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class i extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f50185c = new i();

        i() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, true, null, null, null, 29, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onBrowserActivityResult$1", f = "FinancialConnectionsSheetViewModel.kt", i = {0}, l = {568}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50186n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50187o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f50188p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50190c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.ON_EXTERNAL_ACTIVITY, null, 23, null);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50191a;

            static {
                int[] iArr = new int[FinancialConnectionsSheetState.a.values().length];
                try {
                    iArr[FinancialConnectionsSheetState.a.ON_EXTERNAL_ACTIVITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FinancialConnectionsSheetState.a.INTERMEDIATE_DEEPLINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FinancialConnectionsSheetState.a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f50191a = iArr;
            }
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            d dVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50188p;
            if (i11 == 0) {
                jn0.t.b(obj);
                mutex = d.this.mutex;
                d dVar2 = d.this;
                this.f50186n = mutex;
                this.f50187o = dVar2;
                this.f50188p = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dVar = dVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d dVar3 = (d) this.f50187o;
                mutex = (Mutex) this.f50186n;
                jn0.t.b(obj);
                dVar = dVar3;
            }
            try {
                FinancialConnectionsSheetState value = dVar.h().getValue();
                if (value.getActivityRecreated()) {
                    int i12 = b.f50191a[value.getWebAuthFlowStatus().ordinal()];
                    if (i12 == 1) {
                        d.H(dVar, value, com.stripe.android.financialconnections.launcher.b.a.f50237b, false, null, 12, null);
                    } else if (i12 == 2) {
                        dVar.k(a.f50190c);
                    }
                }
                h0 h0Var = h0.f84049a;
                return h0.f84049a;
            } finally {
                mutex.unlock(null);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f50192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Uri uri) {
            super(1);
            this.f50192c = uri;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            FinancialConnectionsSessionManifest manifest = setState.getManifest();
            p013kotlin.jvm.internal.s.h(manifest);
            return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.INTERMEDIATE_DEEPLINK, new c.OpenAuthFlowWithUrl(manifest.getHostedAuthUrl() + "&startPolling=true&" + this.f50192c.getFragment()), 5, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class l extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f50193c = new l();

        l() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.NONE, null, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class m extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f50194c = new m();

        m() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.NONE, null, 23, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onResume$1", f = "FinancialConnectionsSheetViewModel.kt", i = {0}, l = {568}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    static final class n extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f50195n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f50196o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f50197p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50199c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.ON_EXTERNAL_ACTIVITY, null, 23, null);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50200a;

            static {
                int[] iArr = new int[FinancialConnectionsSheetState.a.values().length];
                try {
                    iArr[FinancialConnectionsSheetState.a.ON_EXTERNAL_ACTIVITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FinancialConnectionsSheetState.a.INTERMEDIATE_DEEPLINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FinancialConnectionsSheetState.a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f50200a = iArr;
            }
        }

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new n(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            d dVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50197p;
            if (i11 == 0) {
                jn0.t.b(obj);
                mutex = d.this.mutex;
                d dVar2 = d.this;
                this.f50195n = mutex;
                this.f50196o = dVar2;
                this.f50197p = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dVar = dVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d dVar3 = (d) this.f50196o;
                mutex = (Mutex) this.f50195n;
                jn0.t.b(obj);
                dVar = dVar3;
            }
            try {
                FinancialConnectionsSheetState value = dVar.h().getValue();
                if (!value.getActivityRecreated()) {
                    int i12 = b.f50200a[value.getWebAuthFlowStatus().ordinal()];
                    if (i12 == 1) {
                        d.H(dVar, value, com.stripe.android.financialconnections.launcher.b.a.f50237b, false, null, 12, null);
                    } else if (i12 == 2) {
                        dVar.k(a.f50199c);
                    }
                }
                h0 h0Var = h0.f84049a;
                return h0.f84049a;
            } finally {
                mutex.unlock(null);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f50201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.f50201c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, null, FinancialConnectionsSheetState.a.INTERMEDIATE_DEEPLINK, new c.OpenAuthFlowWithUrl(this.f50201c), 5, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "it", "Ljn0/h0;", "a", "(Lcom/stripe/android/financialconnections/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class p extends u implements wn0.l<FinancialConnectionsSheetState, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f50203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f50204e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Uri uri) {
            super(1);
            this.f50203d = str;
            this.f50204e = uri;
        }

        public final void a(FinancialConnectionsSheetState it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            d.H(d.this, it, new com.stripe.android.financialconnections.launcher.b.Completed(new InstantDebitsResult(this.f50203d, this.f50204e.getQueryParameter("last4"), this.f50204e.getQueryParameter("bank_name")), null, null), false, null, 12, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(FinancialConnectionsSheetState financialConnectionsSheetState) {
            a(financialConnectionsSheetState);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onUserCancel$1", f = "FinancialConnectionsSheetViewModel.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
    static final class q extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f50205n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetState f50207p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(FinancialConnectionsSheetState financialConnectionsSheetState, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f50207p = financialConnectionsSheetState;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new q(this.f50207p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f50205n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    d dVar = d.this;
                    FinancialConnectionsSheetState financialConnectionsSheetState = this.f50207p;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    n40.s sVar = dVar.fetchFinancialConnectionsSession;
                    String strF = financialConnectionsSheetState.f();
                    this.f50205n = 1;
                    obj = sVar.a(strF, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                objB = jn0.s.b((FinancialConnectionsSession) obj);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            d dVar2 = d.this;
            FinancialConnectionsSheetState financialConnectionsSheetState2 = this.f50207p;
            if (jn0.s.h(objB)) {
                d.H(dVar2, financialConnectionsSheetState2, b50.b.a((FinancialConnectionsSession) objB) ? new com.stripe.android.financialconnections.launcher.b.Failed(new CustomManualEntryRequiredError()) : com.stripe.android.financialconnections.launcher.b.a.f50237b, false, null, 12, null);
            }
            d dVar3 = d.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                d.H(dVar3, dVar3.h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(thE), false, null, 12, null);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class r extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f50208c = new r();

        r() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, null, null, null, 15, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class s extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest f50209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SynchronizeSessionResponse f50210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SynchronizeSessionResponse synchronizeSessionResponse) {
            super(1);
            this.f50209c = financialConnectionsSessionManifest;
            this.f50210d = synchronizeSessionResponse;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, this.f50209c, FinancialConnectionsSheetState.a.NONE, new c.OpenNativeAuthFlow(setState.getInitialArgs().getConfiguration(), this.f50210d, setState.getInitialArgs().getElementsSessionContext()), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/b;", "a", "(Lcom/stripe/android/financialconnections/b;)Lcom/stripe/android/financialconnections/b;"}, k = 3, mv = {1, 9, 0})
    static final class t extends u implements wn0.l<FinancialConnectionsSheetState, FinancialConnectionsSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest f50211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f50212d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str) {
            super(1);
            this.f50211c = financialConnectionsSessionManifest;
            this.f50212d = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetState invoke(FinancialConnectionsSheetState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetState.b(setState, null, false, this.f50211c, FinancialConnectionsSheetState.a.ON_EXTERNAL_ACTIVITY, new c.OpenAuthFlowWithUrl(this.f50212d), 3, null);
        }
    }

    static {
        m7.b bVar = new m7.b();
        bVar.a(o0.b(d.class), b.f50167c);
        I = bVar.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String applicationId, s0 savedStateHandle, b0 getOrFetchSync, n40.s fetchFinancialConnectionsSession, n40.t fetchFinancialConnectionsSessionForToken, o30.d logger, k40.a browserManager, j40.k eventReporter, j40.f analyticsTracker, r0 nativeRouter, p0 nativeAuthFlowCoordinator, FinancialConnectionsSheetState initialState) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(applicationId, "applicationId");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(getOrFetchSync, "getOrFetchSync");
        p013kotlin.jvm.internal.s.k(fetchFinancialConnectionsSession, "fetchFinancialConnectionsSession");
        p013kotlin.jvm.internal.s.k(fetchFinancialConnectionsSessionForToken, "fetchFinancialConnectionsSessionForToken");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(browserManager, "browserManager");
        p013kotlin.jvm.internal.s.k(eventReporter, "eventReporter");
        p013kotlin.jvm.internal.s.k(analyticsTracker, "analyticsTracker");
        p013kotlin.jvm.internal.s.k(nativeRouter, "nativeRouter");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        this.applicationId = applicationId;
        this.getOrFetchSync = getOrFetchSync;
        this.fetchFinancialConnectionsSession = fetchFinancialConnectionsSession;
        this.fetchFinancialConnectionsSessionForToken = fetchFinancialConnectionsSessionForToken;
        this.logger = logger;
        this.browserManager = browserManager;
        this.eventReporter = eventReporter;
        this.analyticsTracker = analyticsTracker;
        this.nativeRouter = nativeRouter;
        this.initialState = initialState;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        X(savedStateHandle);
        if (!initialState.getInitialArgs().c()) {
            k(new a(new com.stripe.android.financialconnections.launcher.b.Failed(new IllegalStateException("Invalid configuration provided when instantiating activity"))));
            return;
        }
        eventReporter.a(initialState.getInitialArgs().getConfiguration());
        if (initialState.getManifest() == null) {
            F();
        }
    }

    private final String C(String hostedAuthUrl, boolean isInstantDebits, n0 linkMode) {
        if (hostedAuthUrl == null) {
            return null;
        }
        List listS = v.s(hostedAuthUrl);
        if (isInstantDebits) {
            listS.add("return_payment_method=true");
            if (linkMode != null) {
                listS.add("link_mode=" + linkMode.getValue());
            }
        }
        return v.y0(listS, "&", null, null, 0, null, null, 62, null);
    }

    private final void D(FinancialConnectionsSheetState state) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new C0822d(state, null), 3, null);
    }

    private final void E(FinancialConnectionsSheetState state) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new e(state, null), 3, null);
    }

    private final void F() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new f(null), 3, null);
    }

    private final void G(FinancialConnectionsSheetState state, com.stripe.android.financialconnections.launcher.b result, boolean fromNative, Integer finishMessage) {
        this.eventReporter.b(state.getInitialArgs().getConfiguration(), result);
        if (!fromNative) {
            if (result instanceof com.stripe.android.financialconnections.launcher.b.Completed) {
                i40.a.c(i40.a.f75822a, FinancialConnectionsEvent.c.SUCCESS, null, 2, null);
            } else if (result instanceof com.stripe.android.financialconnections.launcher.b.a) {
                i40.a.c(i40.a.f75822a, FinancialConnectionsEvent.c.CANCEL, null, 2, null);
            } else if (result instanceof com.stripe.android.financialconnections.launcher.b.Failed) {
                i40.a.f75822a.b(FinancialConnectionsEvent.c.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.a.UNEXPECTED_ERROR, 3, null));
            }
        }
        k(new g(result, finishMessage));
    }

    static /* synthetic */ void H(d dVar, FinancialConnectionsSheetState financialConnectionsSheetState, com.stripe.android.financialconnections.launcher.b bVar, boolean z11, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            num = null;
        }
        dVar.G(financialConnectionsSheetState, bVar, z11, num);
    }

    private final void J() {
        AppInitializationError appInitializationError = new AppInitializationError("No Web browser available to launch AuthFlow");
        j40.h.b(this.analyticsTracker, "error Launching the Auth Flow", appInitializationError, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
        H(this, h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(appInitializationError), false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(Uri receivedUrl) {
        k(new k(receivedUrl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(FinancialConnectionsSheetState state) {
        k(l.f50193c);
        U(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(FinancialConnectionsSheetState state, Uri receivedUrl) {
        if (receivedUrl == null) {
            H(this, state, new com.stripe.android.financialconnections.launcher.b.Failed(new Exception("Intent url received from web flow is null")), false, null, 12, null);
            return;
        }
        k(m.f50194c);
        com.stripe.android.financialconnections.launcher.a initialArgs = state.getInitialArgs();
        if (initialArgs instanceof com.stripe.android.financialconnections.launcher.a.ForData) {
            D(state);
        } else if (initialArgs instanceof com.stripe.android.financialconnections.launcher.a.ForToken) {
            E(state);
        } else if (initialArgs instanceof com.stripe.android.financialconnections.launcher.a.ForInstantDebits) {
            T(receivedUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String unwrappedUriString) {
        k(new o(unwrappedUriString));
    }

    private final void T(Uri url) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            String queryParameter = url.getQueryParameter("payment_method_id");
            if (queryParameter == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            objB = jn0.s.b(queryParameter);
            if (jn0.s.h(objB)) {
                n(new p((String) objB, url));
            }
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                this.logger.error("Could not retrieve payment method parameters from success url", thE);
                H(this, h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(thE), false, null, 12, null);
            }
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
    }

    private final void U(FinancialConnectionsSheetState state) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new q(state, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(SynchronizeSessionResponse sync) {
        if (!this.browserManager.a()) {
            J();
            return;
        }
        FinancialConnectionsSessionManifest manifest = sync.getManifest();
        boolean zJ = h().getValue().j();
        boolean zB = this.nativeRouter.b(manifest);
        this.nativeRouter.a(manifest);
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = this.initialState.getInitialArgs().getElementsSessionContext();
        String strC = C(manifest.getHostedAuthUrl(), zJ, elementsSessionContext != null ? elementsSessionContext.getLinkMode() : null);
        if (strC == null) {
            H(this, h().getValue(), new com.stripe.android.financialconnections.launcher.b.Failed(new IllegalArgumentException("hostedAuthUrl is required!")), false, null, 12, null);
            return;
        }
        i40.a aVar = i40.a.f75822a;
        i40.a.c(aVar, FinancialConnectionsEvent.c.OPEN, null, 2, null);
        if (zB) {
            k(new s(manifest, sync));
        } else {
            i40.a.c(aVar, FinancialConnectionsEvent.c.FLOW_LAUNCHED_IN_BROWSER, null, 2, null);
            k(new t(manifest, strC));
        }
    }

    private final void X(s0 s0Var) {
        s0Var.o("financial_connections_sheet_state", new SavedStateRegistry.c() { // from class: i40.h
            @Override // androidx.savedstate.SavedStateRegistry.c
            public final Bundle a() {
                return com.stripe.android.financialconnections.d.Y(this.f75834a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle Y(d this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        FinancialConnectionsSheetState value = this$0.h().getValue();
        Bundle bundle = new Bundle();
        bundle.putParcelable("financial_connections_sheet_manifest", value.getManifest());
        bundle.putSerializable("financial_connections_sheet_web_auth_flow_status", value.getWebAuthFlowStatus());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri Z(String str) {
        Uri.parse(str).buildUpon().clearQuery();
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return Uri.parse(str);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            Object objB = jn0.s.b(jn0.t.a(th2));
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                this.logger.error("Could not parse web flow url", thE);
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            return (Uri) objB;
        }
    }

    public final void I(Intent intent) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new h(intent, null), 3, null);
    }

    public final void K() {
        k(i.f50185c);
    }

    public final void L() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new j(null), 3, null);
    }

    public final void M() {
        H(this, h().getValue(), com.stripe.android.financialconnections.launcher.b.a.f50237b, false, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.stripe.android.financialconnections.launcher.b] */
    public final void Q(h.a activityResult) {
        p013kotlin.jvm.internal.s.k(activityResult, "activityResult");
        Intent data = activityResult.getData();
        Parcelable parcelable = null;
        if (data != null) {
            Parcelable parcelableExtra = data.getParcelableExtra("result");
            parcelable = (com.stripe.android.financialconnections.launcher.b) (parcelableExtra instanceof com.stripe.android.financialconnections.launcher.b ? parcelableExtra : null);
        }
        ?? r11 = parcelable;
        if (activityResult.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String() != -1 || r11 == 0) {
            H(this, h().getValue(), com.stripe.android.financialconnections.launcher.b.a.f50237b, true, null, 8, null);
        } else {
            H(this, h().getValue(), r11, true, null, 8, null);
        }
    }

    public final void R() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new n(null), 3, null);
    }

    public final void V() {
        k(r.f50208c);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(FinancialConnectionsSheetState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return null;
    }
}
