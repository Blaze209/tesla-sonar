package s50;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.UnclassifiedError;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.f0;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Gender;
import j40.FinancialConnectionsEvent;
import java.util.Map;
import jn0.h0;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import l50.FinancialConnectionsSheetNativeActivityArgs;
import l50.InstantDebitsResult;
import n40.p0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarState;
import q50.TopAppBarStateUpdate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 z2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u008d\u0001Bc\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020$2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u000209*\u00020/H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u001b2\u0006\u0010<\u001a\u000209H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00020\u001b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020$2\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001b¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020$¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u0016¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u001b¢\u0006\u0004\bN\u0010HJ\u0017\u0010O\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bO\u0010(J\u0015\u0010Q\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020+¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u001b¢\u0006\u0004\bS\u0010HJ\u001f\u0010U\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\b\u0010T\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u001b¢\u0006\u0004\bW\u0010HJ\r\u0010X\u001a\u00020\u001b¢\u0006\u0004\bX\u0010HJ\u0017\u0010Z\u001a\u00020\u001b2\u0006\u0010Y\u001a\u000209H\u0016¢\u0006\u0004\bZ\u0010>J\u0015\u0010[\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b[\u0010(J\u0019\u0010]\u001a\u0004\u0018\u00010?2\u0006\u0010\\\u001a\u00020\u0002H\u0016¢\u0006\u0004\b]\u0010^R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020x0w8\u0006¢\u0006\f\n\u0004\b-\u0010y\u001a\u0004\bz\u0010{R\u001e\u0010\u0082\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0084\u0001R*\u0010\u0087\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020}0\u0086\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010\u0084\u0001R#\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020}0\u0088\u00018\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008e\u0001"}, d2 = {"Ls50/f;", "Ls50/i;", "Ls50/c;", "Lq50/a;", "Lm40/p;", "activityRetainedComponent", "Landroidx/lifecycle/s0;", "savedStateHandle", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lz50/p;", "uriUtils", "Ln40/i;", "completeFinancialConnectionsSession", "Ln40/n;", "createInstantDebitsResult", "Lj40/f;", "eventTracker", "Lo30/d;", "logger", "Lo50/f;", "navigationManager", "", "applicationId", "initialState", "<init>", "(Lm40/p;Landroidx/lifecycle/s0;Ln40/p0;Lz50/p;Ln40/i;Ln40/n;Lj40/f;Lo30/d;Lo50/f;Ljava/lang/String;Ls50/c;)V", "Ljn0/h0;", "e0", "(Landroidx/lifecycle/s0;)V", "receivedUrl", PermissionsResponse.STATUS_KEY, "b0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "Lkotlinx/coroutines/Job;", "X", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lkotlinx/coroutines/Job;", "W", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "Ln40/p0$a$c$a;", "earlyTerminationCause", "", "closeAuthFlowError", Gender.FEMALE, "(Ln40/p0$a$c$a;Ljava/lang/Throwable;)Lkotlinx/coroutines/Job;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "session", Gender.MALE, "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", Gender.NONE, "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/launcher/b;", "result", "H", "(Lcom/stripe/android/financialconnections/launcher/b;)V", "", "R", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)Z", "backgrounded", "g0", "(Z)V", "Lq50/c;", "update", "i0", "(Lq50/c;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "P", "(Landroid/content/Intent;)Lkotlinx/coroutines/Job;", Gender.OTHER, "()V", "a0", "()Lkotlinx/coroutines/Job;", ImagesContract.URL, "d0", "(Ljava/lang/String;)V", "c0", "S", AnalyticsAttribute.Error, "V", "(Ljava/lang/Throwable;)V", "T", "referrer", "Z", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", Gender.UNKNOWN, "Y", "isElevated", "b", "Q", "state", "h0", "(Ls50/c;)Lq50/c;", "v", "Lm40/p;", "I", "()Lm40/p;", "w", "Ln40/p0;", "x", "Lz50/p;", "y", "Ln40/i;", "z", "Ln40/n;", "A", "Lj40/f;", "B", "Lo30/d;", "C", "Lo50/f;", "D", "Ljava/lang/String;", "Lkotlinx/coroutines/sync/Mutex;", "E", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/flow/SharedFlow;", "Lo50/e;", "Lkotlinx/coroutines/flow/SharedFlow;", "K", "()Lkotlinx/coroutines/flow/SharedFlow;", "navigationFlow", "Lq50/b;", "G", "Lkotlin/Lazy;", "J", "()Lq50/b;", "defaultTopAppBarState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentPane", "", "topAppBarStateUpdatesByPane", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "L", "()Lkotlinx/coroutines/flow/StateFlow;", "topAppBarState", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f extends s50.i<FinancialConnectionsSheetNativeState> implements q50.a {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int L = 8;
    private static final ViewModelProvider.Factory M;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final String applicationId;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final SharedFlow<o50.e> navigationFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Lazy defaultTopAppBarState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final MutableStateFlow<FinancialConnectionsSessionManifest.Pane> currentPane;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final MutableStateFlow<Map<FinancialConnectionsSessionManifest.Pane, TopAppBarState>> topAppBarStateUpdatesByPane;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final StateFlow<TopAppBarState> topAppBarState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final m40.p activityRetainedComponent;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0 nativeAuthFlowCoordinator;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final z50.p uriUtils;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final n40.i completeFinancialConnectionsSession;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n40.n createInstantDebitsResult;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f110226c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.b(setState, null, false, null, false, false, null, false, null, null, false, null, 2045, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$2", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110227n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln40/p0$a;", "message", "Ljn0/h0;", "a", "(Ln40/p0$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f110229a;

            /* JADX INFO: renamed from: s50.f$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
            static final class C2342a extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C2342a f110230c = new C2342a();

                C2342a() {
                    super(1);
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
                    p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                    return FinancialConnectionsSheetNativeState.b(setState, s50.j.e.f110334a, false, null, false, false, null, false, null, null, false, null, 2046, null);
                }
            }

            a(f fVar) {
                this.f110229a = fVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(p0.a aVar, Continuation<? super h0> continuation) {
                if (p013kotlin.jvm.internal.s.f(aVar, p0.a.C1987a.f93230a)) {
                    this.f110229a.k(C2342a.f110230c);
                } else if (aVar instanceof p0.a.Complete) {
                    f.G(this.f110229a, ((p0.a.Complete) aVar).getCause(), null, 2, null);
                } else if (aVar instanceof p0.a.CloseWithError) {
                    f.G(this.f110229a, null, ((p0.a.CloseWithError) aVar).getCause(), 1, null);
                } else if (aVar instanceof p0.a.UpdateTopAppBar) {
                    this.f110229a.i0(((p0.a.UpdateTopAppBar) aVar).getUpdate());
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110227n;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableSharedFlow<p0.a> mutableSharedFlowA = f.this.nativeAuthFlowCoordinator.a();
                a aVar = new a(f.this);
                this.f110227n = 1;
                if (mutableSharedFlowA.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Ls50/f;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Ls50/f;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<CreationExtras, f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f110231c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(CreationExtras initializer) {
            p013kotlin.jvm.internal.s.k(initializer, "$this$initializer");
            s0 s0VarA = v0.a(initializer);
            Object objA = initializer.a(ViewModelProvider.a.f8735h);
            p013kotlin.jvm.internal.s.i(objA, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) objA;
            FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgsB = FinancialConnectionsSheetNativeActivity.INSTANCE.b(s0VarA);
            if (financialConnectionsSheetNativeActivityArgsB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = new FinancialConnectionsSheetNativeState(financialConnectionsSheetNativeActivityArgsB, (Bundle) s0VarA.f("FinancialConnectionsSheetNativeState"));
            m40.p.a aVarA = m40.c.a();
            SynchronizeSessionResponse initialSyncResponse = financialConnectionsSheetNativeActivityArgsB.getInitialSyncResponse();
            if (!financialConnectionsSheetNativeState.getFirstInit()) {
                initialSyncResponse = null;
            }
            return aVarA.d(initialSyncResponse).a(application).c(financialConnectionsSheetNativeState.getConfiguration()).b(s0VarA).e(financialConnectionsSheetNativeState).build().a();
        }
    }

    /* JADX INFO: renamed from: s50.f$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Ls50/f$d;", "", "<init>", "()V", "", "applicationId", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "c", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "PARAM_CODE", "Ljava/lang/String;", "PARAM_ERROR_REASON", "PARAM_STATUS", "STATUS_FAILURE", "STATUS_SUCCESS", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String applicationId) {
            return "stripe://auth-redirect/" + applicationId;
        }

        public final ViewModelProvider.Factory c() {
            return f.M;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$closeAuthFlow$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0, 0, 1, 1, 2}, l = {631, EnumC4419g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE, 335}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "state", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$3", "L$0"})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110232n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110233o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f110234p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f110235q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f110236r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f110237s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p0.a.Complete.EnumC1988a f110239u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Throwable f110240v;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f110241c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return FinancialConnectionsSheetNativeState.b(setState, null, false, null, false, false, null, true, null, null, false, null, 1983, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p0.a.Complete.EnumC1988a enumC1988a, Throwable th2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f110239u = enumC1988a;
            this.f110240v = th2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = f.this.new e(this.f110239u, this.f110240v, continuation);
            eVar.f110237s = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0109 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0121 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0127 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x012d A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x013e A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0142 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:49:0x0144 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x014d A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #1 {all -> 0x011e, blocks: (B:35:0x00cf, B:37:0x0109, B:40:0x0121, B:42:0x0127, B:44:0x012d, B:47:0x013e, B:49:0x0144, B:50:0x014d, B:32:0x00b6), top: B:68:0x00b6 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0171 A[Catch: all -> 0x00ae, TryCatch #3 {all -> 0x00ae, blocks: (B:55:0x016b, B:57:0x0171, B:60:0x0199, B:61:0x019f, B:54:0x0161, B:24:0x0098, B:26:0x00a8, B:31:0x00b1), top: B:71:0x0098 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0198  */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x013b, code lost:
        
            if (r7.N(r10, r18) == r0) goto L46;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s50.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: s50.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq50/b;", "b", "()Lq50/b;"}, k = 3, mv = {1, 9, 0})
    static final class C2343f extends u implements wn0.a<TopAppBarState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSheetNativeState f110242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2343f(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
            super(0);
            this.f110242c = financialConnectionsSheetNativeState;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TopAppBarState invoke() {
            return s50.g.c(this.f110242c, true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.financialconnections.launcher.b f110243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.stripe.android.financialconnections.launcher.b bVar) {
            super(1);
            this.f110243c = bVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.b(setState, null, false, null, false, false, new d.Finish(this.f110243c), false, null, null, false, null, 2015, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0}, l = {KyberEngine.KyberPolyBytes}, m = "handleInstantDebitsCompletion", n = {"this"}, s = {"L$0"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110244n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f110245o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f110247q;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110245o = obj;
            this.f110247q |= Integer.MIN_VALUE;
            return f.this.N(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$handleOnNewIntent$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0, 1}, l = {631, 172}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110248n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110249o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f110250p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f110251q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Intent f110253s;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f110254c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f110254c = str;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return FinancialConnectionsSheetNativeState.b(setState, new s50.j.Canceled(this.f110254c), false, null, false, false, null, false, null, null, false, null, 2046, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Intent intent, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f110253s = intent;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new i(this.f110253s, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0069  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            Intent intent;
            f fVar;
            Mutex mutex2;
            Throwable th2;
            String string;
            f fVar2;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110251q;
            if (i11 == 0) {
                jn0.t.b(obj);
                mutex = f.this.mutex;
                intent = this.f110253s;
                fVar = f.this;
                this.f110248n = mutex;
                this.f110249o = intent;
                this.f110250p = fVar;
                this.f110251q = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar2 = (f) this.f110250p;
                str = (String) this.f110249o;
                mutex2 = (Mutex) this.f110248n;
                try {
                    jn0.t.b(obj);
                    fVar2.b0(str, (String) obj);
                    h0 h0Var = h0.f84049a;
                    mutex2.unlock(null);
                    return h0.f84049a;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            fVar = (f) this.f110250p;
            intent = (Intent) this.f110249o;
            Mutex mutex3 = (Mutex) this.f110248n;
            jn0.t.b(obj);
            mutex = mutex3;
            if (intent != null) {
                try {
                    Uri data = intent.getData();
                    if (data != null) {
                        string = data.toString();
                    } else {
                        string = null;
                    }
                } catch (Throwable th4) {
                    mutex2 = mutex;
                    th2 = th4;
                    mutex2.unlock(null);
                    throw th2;
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            if (p013kotlin.text.t.f0(string, "authentication_return", true)) {
                z50.p pVar = fVar.uriUtils;
                this.f110248n = mutex;
                this.f110249o = string;
                this.f110250p = fVar;
                this.f110251q = 2;
                Object objC = pVar.c(string, "code", this);
                if (objC != coroutine_suspended) {
                    mutex2 = mutex;
                    obj = objC;
                    fVar2 = fVar;
                    str = string;
                    fVar2.b0(str, (String) obj);
                }
                return coroutine_suspended;
            }
            if (fVar.uriUtils.a(string, f.INSTANCE.b(fVar.applicationId))) {
                fVar.b0(string, fVar.uriUtils.b(string, PermissionsResponse.STATUS_KEY));
            } else {
                fVar.k(new a(string));
            }
            mutex2 = mutex;
            h0 h0Var2 = h0.f84049a;
            mutex2.unlock(null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onBackClick$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110255n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane f110256o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f f110257p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FinancialConnectionsSessionManifest.Pane pane, f fVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f110256o = pane;
            this.f110257p = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new j(this.f110256o, this.f110257p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110255n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            FinancialConnectionsSessionManifest.Pane pane = this.f110256o;
            if (pane != null) {
                this.f110257p.eventTracker.a(new FinancialConnectionsEvent.l(pane));
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onCloseNoConfirmationClick$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110258n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane f110260p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(FinancialConnectionsSessionManifest.Pane pane, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f110260p = pane;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new k(this.f110260p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110258n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            f.this.eventTracker.a(new FinancialConnectionsEvent.m(this.f110260p));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onCloseWithConfirmationClick$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110261n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane f110263p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(FinancialConnectionsSessionManifest.Pane pane, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f110263p = pane;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new l(this.f110263p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110261n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            f.this.eventTracker.a(new FinancialConnectionsEvent.m(this.f110263p));
            o50.f.a.a(f.this.navigationManager, o50.b.k(o50.b.k.f96749i, this.f110263p, null, 2, null), null, false, 6, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onPaneLaunched$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110264n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane f110266p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSessionManifest.Pane f110267q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSessionManifest.Pane pane2, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f110266p = pane;
            this.f110267q = pane2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new m(this.f110266p, this.f110267q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110264n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            f.this.eventTracker.a(new FinancialConnectionsEvent.v(this.f110266p, this.f110267q));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onResume$1", f = "FinancialConnectionsSheetNativeViewModel.kt", i = {0}, l = {631}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    static final class n extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110268n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110269o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f110270p;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f110272c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
                p013kotlin.jvm.internal.s.k(setState, "$this$setState");
                return FinancialConnectionsSheetNativeState.b(setState, new s50.j.Canceled(null), false, null, false, false, null, false, null, null, false, null, 2046, null);
            }
        }

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return f.this.new n(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutex;
            f fVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110270p;
            if (i11 == 0) {
                jn0.t.b(obj);
                mutex = f.this.mutex;
                f fVar2 = f.this;
                this.f110268n = mutex;
                this.f110269o = fVar2;
                this.f110270p = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar = fVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) this.f110269o;
                mutex = (Mutex) this.f110268n;
                jn0.t.b(obj);
            }
            try {
                if (fVar.h().getValue().getWebAuthFlow() instanceof s50.j.c) {
                    fVar.k(a.f110272c);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class o extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.f110273c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.b(setState, new s50.j.Success(this.f110273c), false, null, false, false, null, false, null, null, false, null, 2046, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class p extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f110275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, String str2) {
            super(1);
            this.f110274c = str;
            this.f110275d = str2;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            String str = this.f110274c;
            return FinancialConnectionsSheetNativeState.b(setState, new s50.j.Failed(str, "Received return_url with failed status: " + str, this.f110275d), false, null, false, false, null, false, null, null, false, null, 2046, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class q extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110276c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f110276c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.b(setState, new s50.j.Canceled(this.f110276c), false, null, false, false, null, false, null, null, false, null, 2046, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class r extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f110277c = new r();

        r() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.b(setState, null, false, null, false, false, null, false, null, null, false, null, 2015, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ls50/c;", "a", "(Ls50/c;)Ls50/c;"}, k = 3, mv = {1, 9, 0})
    static final class s extends u implements wn0.l<FinancialConnectionsSheetNativeState, FinancialConnectionsSheetNativeState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(1);
            this.f110278c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSheetNativeState invoke(FinancialConnectionsSheetNativeState setState) {
            p013kotlin.jvm.internal.s.k(setState, "$this$setState");
            return FinancialConnectionsSheetNativeState.b(setState, s50.j.c.f110332a, false, null, false, false, new d.OpenUrl(this.f110278c), false, null, null, false, null, 2014, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq50/b;", "it", "a", "(Lq50/b;)Lq50/b;"}, k = 3, mv = {1, 9, 0})
    static final class t extends u implements wn0.l<TopAppBarState, TopAppBarState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110279c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z11) {
            super(1);
            this.f110279c = z11;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TopAppBarState invoke(TopAppBarState it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return TopAppBarState.c(it, false, false, false, null, false, false, this.f110279c, null, 191, null);
        }
    }

    static {
        m7.b bVar = new m7.b();
        bVar.a(o0.b(f.class), c.f110231c);
        M = bVar.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m40.p activityRetainedComponent, s0 savedStateHandle, p0 nativeAuthFlowCoordinator, z50.p uriUtils, n40.i completeFinancialConnectionsSession, n40.n createInstantDebitsResult, j40.f eventTracker, o30.d logger, o50.f navigationManager, String applicationId, FinancialConnectionsSheetNativeState initialState) {
        super(initialState, nativeAuthFlowCoordinator);
        p013kotlin.jvm.internal.s.k(activityRetainedComponent, "activityRetainedComponent");
        p013kotlin.jvm.internal.s.k(savedStateHandle, "savedStateHandle");
        p013kotlin.jvm.internal.s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        p013kotlin.jvm.internal.s.k(uriUtils, "uriUtils");
        p013kotlin.jvm.internal.s.k(completeFinancialConnectionsSession, "completeFinancialConnectionsSession");
        p013kotlin.jvm.internal.s.k(createInstantDebitsResult, "createInstantDebitsResult");
        p013kotlin.jvm.internal.s.k(eventTracker, "eventTracker");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(navigationManager, "navigationManager");
        p013kotlin.jvm.internal.s.k(applicationId, "applicationId");
        p013kotlin.jvm.internal.s.k(initialState, "initialState");
        this.activityRetainedComponent = activityRetainedComponent;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.uriUtils = uriUtils;
        this.completeFinancialConnectionsSession = completeFinancialConnectionsSession;
        this.createInstantDebitsResult = createInstantDebitsResult;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.navigationManager = navigationManager;
        this.applicationId = applicationId;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.navigationFlow = navigationManager.b();
        this.defaultTopAppBarState = jn0.m.b(new C2343f(initialState));
        MutableStateFlow<FinancialConnectionsSessionManifest.Pane> MutableStateFlow = StateFlowKt.MutableStateFlow(initialState.getInitialPane());
        this.currentPane = MutableStateFlow;
        MutableStateFlow<Map<FinancialConnectionsSessionManifest.Pane, TopAppBarState>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(p013kotlin.collections.v0.f(x.a(initialState.getInitialPane(), J())));
        this.topAppBarStateUpdatesByPane = MutableStateFlow2;
        this.topAppBarState = FlowKt.stateIn(z50.i.a(MutableStateFlow2, MutableStateFlow), d1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, 0L, 2, null), J());
        e0(savedStateHandle);
        k(a.f110226c);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(null), 3, null);
    }

    private final Job F(p0.a.Complete.EnumC1988a earlyTerminationCause, Throwable closeAuthFlowError) {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new e(earlyTerminationCause, closeAuthFlowError, null), 3, null);
    }

    static /* synthetic */ Job G(f fVar, p0.a.Complete.EnumC1988a enumC1988a, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enumC1988a = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        return fVar.F(enumC1988a, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(com.stripe.android.financialconnections.launcher.b result) {
        k(new g(result));
    }

    private final TopAppBarState J() {
        return (TopAppBarState) this.defaultTopAppBarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(FinancialConnectionsSession session) {
        i40.a.f75822a.b(j40.FinancialConnectionsEvent.c.SUCCESS, new j40.FinancialConnectionsEvent.Metadata(null, Boolean.valueOf(session.getPaymentAccount() instanceof BankAccount), null, 5, null));
        H(new com.stripe.android.financialconnections.launcher.b.Completed(null, session, session.d(), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(FinancialConnectionsSession financialConnectionsSession, Continuation<? super h0> continuation) {
        h hVar;
        InstantDebitsResult instantDebitsResult;
        f fVar;
        InstantDebitsResult instantDebitsResult2;
        com.stripe.android.financialconnections.launcher.b failed;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f110247q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f110247q = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objA = hVar.f110245o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f110247q;
        if (i12 == 0) {
            jn0.t.b(objA);
            f0 paymentAccount = financialConnectionsSession.getPaymentAccount();
            if (paymentAccount != null) {
                n40.n nVar = this.createInstantDebitsResult;
                String id2 = paymentAccount.getId();
                hVar.f110244n = this;
                hVar.f110247q = 1;
                objA = nVar.a(id2, hVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar = this;
            } else {
                instantDebitsResult = null;
                fVar = this;
            }
            instantDebitsResult2 = instantDebitsResult;
            if (instantDebitsResult2 != null) {
                failed = new com.stripe.android.financialconnections.launcher.b.Completed(instantDebitsResult2, null, null, 6, null);
            } else {
                failed = new com.stripe.android.financialconnections.launcher.b.Failed(new UnclassifiedError("InstantDebitsCompletionError", "Unable to complete Instant Debits flow due to missing PaymentAccount"));
            }
            fVar.H(failed);
            return h0.f84049a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = (f) hVar.f110244n;
        jn0.t.b(objA);
        instantDebitsResult = (InstantDebitsResult) objA;
        instantDebitsResult2 = instantDebitsResult;
        if (instantDebitsResult2 != null) {
            failed = new com.stripe.android.financialconnections.launcher.b.Completed(instantDebitsResult2, null, null, 6, null);
        } else {
            failed = new com.stripe.android.financialconnections.launcher.b.Failed(new UnclassifiedError("InstantDebitsCompletionError", "Unable to complete Instant Debits flow due to missing PaymentAccount"));
        }
        fVar.H(failed);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(FinancialConnectionsSession financialConnectionsSession) {
        return (financialConnectionsSession.a().b().isEmpty() && financialConnectionsSession.getPaymentAccount() == null && financialConnectionsSession.getBankAccountToken() == null) ? false : true;
    }

    private final void W(FinancialConnectionsSessionManifest.Pane pane) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new k(pane, null), 3, null);
        G(this, null, null, 1, null);
    }

    private final Job X(FinancialConnectionsSessionManifest.Pane pane) {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new l(pane, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(String receivedUrl, String status) {
        if (p013kotlin.jvm.internal.s.f(status, "success")) {
            k(new o(receivedUrl));
        } else if (p013kotlin.jvm.internal.s.f(status, "failure")) {
            k(new p(receivedUrl, this.uriUtils.b(receivedUrl, "error_reason")));
        } else {
            k(new q(receivedUrl));
        }
    }

    private final void e0(s0 s0Var) {
        s0Var.o("FinancialConnectionsSheetNativeState", new SavedStateRegistry.c() { // from class: s50.e
            @Override // androidx.savedstate.SavedStateRegistry.c
            public final Bundle a() {
                return f.f0(this.f110220a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle f0(f this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        FinancialConnectionsSheetNativeState value = this$0.h().getValue();
        Bundle bundle = new Bundle();
        bundle.putParcelable("webAuthFlow", value.getWebAuthFlow());
        bundle.putBoolean("firstInit", value.getFirstInit());
        return bundle;
    }

    private final void g0(boolean backgrounded) {
        this.eventTracker.a(new FinancialConnectionsEvent.d(this.currentPane.getValue(), backgrounded));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(TopAppBarStateUpdate update) {
        if (update != null) {
            z50.i.c(this.topAppBarStateUpdatesByPane, x.a(update.getPane(), J().a(update)));
        }
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final m40.p getActivityRetainedComponent() {
        return this.activityRetainedComponent;
    }

    public final SharedFlow<o50.e> K() {
        return this.navigationFlow;
    }

    public final StateFlow<TopAppBarState> L() {
        return this.topAppBarState;
    }

    public final void O() {
        FinancialConnectionsSessionManifest.Pane value = this.currentPane.getValue();
        TopAppBarState value2 = this.topAppBarState.getValue();
        if (value2.getError() != null) {
            V(value2.getError());
        } else if (o50.d.a(value).getCloseWithoutConfirmation()) {
            W(value);
        } else {
            X(value);
        }
    }

    public final Job P(Intent intent) {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new i(intent, null), 3, null);
    }

    public final void Q(FinancialConnectionsSessionManifest.Pane pane) {
        p013kotlin.jvm.internal.s.k(pane, "pane");
        this.currentPane.setValue(pane);
    }

    public final void S(FinancialConnectionsSessionManifest.Pane pane) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new j(pane, this, null), 3, null);
    }

    public final void T() {
        G(this, null, null, 1, null);
    }

    public final void U() {
        g0(true);
    }

    public final void V(Throwable error) {
        StripeException stripeException;
        p013kotlin.jvm.internal.s.k(error, "error");
        FinancialConnectionsError financialConnectionsError = error instanceof FinancialConnectionsError ? (FinancialConnectionsError) error : null;
        if (financialConnectionsError != null && (stripeException = financialConnectionsError.getStripeException()) != null) {
            error = stripeException;
        }
        G(this, null, error, 1, null);
    }

    public final void Y() {
        g0(false);
    }

    public final void Z(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSessionManifest.Pane referrer) {
        p013kotlin.jvm.internal.s.k(pane, "pane");
        if (o50.d.a(pane).getLogPaneLaunched()) {
            BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new m(pane, referrer, null), 3, null);
        }
    }

    public final Job a0() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new n(null), 3, null);
    }

    @Override // q50.a
    public void b(boolean isElevated) {
        z50.i.b(this.topAppBarStateUpdatesByPane, this.currentPane.getValue(), new t(isElevated));
    }

    public final void c0() {
        k(r.f110277c);
    }

    public final void d0(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        k(new s(url));
    }

    @Override // s50.i
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(FinancialConnectionsSheetNativeState state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return null;
    }
}
