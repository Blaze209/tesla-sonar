package com.tesla.oapi.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.plaid.internal.EnumC4419g;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.tasks.TasksKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001HB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0003JL\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0003J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/tesla/oapi/auth/IntegrityProviderImpl;", "Lcom/tesla/oapi/auth/IntegrityProvider;", "<init>", "()V", "", "request", "getRequestHash", "(Ljava/lang/String;)Ljava/lang/String;", "Ljn0/h0;", "warmupIntegrityTokenProvider", "forceTokenRefresh", "T", "", "retries", "", "startDelay", "maxDelay", "", "factor", "Lkotlin/Function0;", "Lcom/google/android/gms/tasks/Task;", "block", "exponentialBackoff", "(IJJDLwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "errorCode", "", "isRecoverable", "(I)Z", "type", "startTime", AnalyticsAttribute.Reason, "Lcom/tesla/oapi/auth/IntegrityProviderImpl$LOGLEVEL;", "logLevel", "sendTelemetry", "(Ljava/lang/String;JLjava/lang/String;Lcom/tesla/oapi/auth/IntegrityProviderImpl$LOGLEVEL;)V", "Landroid/content/Context;", "applicationContext", "onWarmupComplete", "initialize", "(Landroid/content/Context;Lwn0/a;)V", "enableAttestation", "disableAttestation", "Lcom/tesla/oapi/auth/IntegrityResult;", "requestIntegrityVerdict", "(Ljava/lang/String;)Lcom/tesla/oapi/auth/IntegrityResult;", "TAG", "Ljava/lang/String;", "PREFS_NAME", "KEY_ATTESTATION_ENABLED", "Lcom/tesla/logging/g;", "log", "Lcom/tesla/logging/g;", "Lkotlinx/coroutines/CoroutineScope;", "dispatcherScope", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "Lcom/google/android/play/core/integrity/a;", "standardIntegrityManager", "Lcom/google/android/play/core/integrity/a;", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isWarmingUp", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAttestationEnabled", "forceRefreshCallback", "Lwn0/a;", "isProviderFailureNonTransient", "Z", "Lcom/google/android/play/core/integrity/a$c;", "standardIntegrityTokenProvider", "Lcom/google/android/play/core/integrity/a$c;", "LOGLEVEL", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntegrityProviderImpl implements IntegrityProvider {
    private static final String KEY_ATTESTATION_ENABLED = "attestation_enabled";
    private static final String PREFS_NAME = "play_integrity_prefs";
    private static Context appContext;
    private static volatile wn0.a<h0> forceRefreshCallback;
    private static volatile boolean isProviderFailureNonTransient;
    private static com.google.android.play.core.integrity.a standardIntegrityManager;
    private static volatile com.google.android.play.core.integrity.a.c standardIntegrityTokenProvider;
    public static final IntegrityProviderImpl INSTANCE = new IntegrityProviderImpl();
    private static final String TAG = "IntegrityProviderImpl";
    private static final g log = g.INSTANCE.a(TAG);
    private static final CoroutineScope dispatcherScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(CoroutineDispatcher.limitedParallelism$default(Dispatchers.getIO(), 1, null, 2, null)));
    private static final CoroutineScope mainScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    private static final AtomicBoolean isWarmingUp = new AtomicBoolean(false);
    private static final AtomicBoolean isAttestationEnabled = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/oapi/auth/IntegrityProviderImpl$LOGLEVEL;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "INFO", "WARNING", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum LOGLEVEL {
        ERROR,
        INFO,
        WARNING;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<LOGLEVEL> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LOGLEVEL.values().length];
            try {
                iArr[LOGLEVEL.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LOGLEVEL.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$disableAttestation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$disableAttestation$1", f = "IntegrityProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (!IntegrityProviderImpl.isAttestationEnabled.compareAndSet(true, false)) {
                return h0.f84049a;
            }
            if (IntegrityProviderImpl.appContext != null) {
                Context context = IntegrityProviderImpl.appContext;
                if (context == null) {
                    s.B("appContext");
                    context = null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(IntegrityProviderImpl.PREFS_NAME, 0);
                s.j(sharedPreferences, "getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(IntegrityProviderImpl.KEY_ATTESTATION_ENABLED, false);
                editorEdit.apply();
            }
            IntegrityProviderImpl.log.j("Attestation Disabled");
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$enableAttestation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$enableAttestation$1", f = "IntegrityProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C46041 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        int label;

        C46041(Continuation<? super C46041> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C46041(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (!IntegrityProviderImpl.isAttestationEnabled.compareAndSet(false, true)) {
                return h0.f84049a;
            }
            if (IntegrityProviderImpl.appContext != null) {
                Context context = IntegrityProviderImpl.appContext;
                if (context == null) {
                    s.B("appContext");
                    context = null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(IntegrityProviderImpl.PREFS_NAME, 0);
                s.j(sharedPreferences, "getSharedPreferences(...)");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(IntegrityProviderImpl.KEY_ATTESTATION_ENABLED, true);
                editorEdit.apply();
            }
            IntegrityProviderImpl.log.j("Attestation Enabled");
            if (IntegrityProviderImpl.standardIntegrityTokenProvider != null) {
                IntegrityProviderImpl.INSTANCE.forceTokenRefresh();
            } else if (IntegrityProviderImpl.standardIntegrityManager != null && !IntegrityProviderImpl.isProviderFailureNonTransient) {
                IntegrityProviderImpl.INSTANCE.warmupIntegrityTokenProvider();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C46041) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$exponentialBackoff$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl", f = "IntegrityProviderImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m = "exponentialBackoff", n = {"block", "currentDelay", "retries", "maxDelay", "factor", "attemptNumber", "block", "currentDelay", "retries", "maxDelay", "factor"}, s = {"L$0", "L$1", "I$0", "J$0", "D$0", "I$3", "L$0", "L$1", "I$0", "J$0", "D$0"})
    static final class C46051<T> extends ContinuationImpl {
        double D$0;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C46051(Continuation<? super C46051> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IntegrityProviderImpl.this.exponentialBackoff(0, 0L, 0L, 0.0d, null, this);
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$forceTokenRefresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$forceTokenRefresh$1", f = "IntegrityProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C46061 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        int label;

        C46061(Continuation<? super C46061> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C46061(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            wn0.a aVar = IntegrityProviderImpl.forceRefreshCallback;
            if (aVar != null) {
                aVar.invoke();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C46061) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$initialize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$initialize$1", f = "IntegrityProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C46071 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ wn0.a<h0> $onWarmupComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46071(Context context, wn0.a<h0> aVar, Continuation<? super C46071> continuation) {
            super(2, continuation);
            this.$applicationContext = context;
            this.$onWarmupComplete = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C46071(this.$applicationContext, this.$onWarmupComplete, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            IntegrityProviderImpl integrityProviderImpl = IntegrityProviderImpl.INSTANCE;
            IntegrityProviderImpl.appContext = this.$applicationContext;
            IntegrityProviderImpl.forceRefreshCallback = this.$onWarmupComplete;
            IntegrityProviderImpl.standardIntegrityManager = zt.a.a(this.$applicationContext);
            boolean z11 = this.$applicationContext.getSharedPreferences(IntegrityProviderImpl.PREFS_NAME, 0).getBoolean(IntegrityProviderImpl.KEY_ATTESTATION_ENABLED, false);
            IntegrityProviderImpl.log.j("Attestation persisted state: " + (z11 ? "enabled" : "disabled"));
            if (z11) {
                IntegrityProviderImpl.isAttestationEnabled.set(true);
                IntegrityProviderImpl.INSTANCE.warmupIntegrityTokenProvider();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C46071) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$requestIntegrityVerdict$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/tesla/oapi/auth/IntegrityResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$requestIntegrityVerdict$1", f = "IntegrityProviderImpl.kt", i = {0}, l = {136}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    static final class C46081 extends SuspendLambda implements p<CoroutineScope, Continuation<? super IntegrityResult>, Object> {
        final /* synthetic */ String $request;
        final /* synthetic */ long $startTime;
        final /* synthetic */ com.google.android.play.core.integrity.a.c $tokenProvider;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$requestIntegrityVerdict$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/tesla/oapi/auth/IntegrityResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$requestIntegrityVerdict$1$1", f = "IntegrityProviderImpl.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        static final class C11401 extends SuspendLambda implements p<CoroutineScope, Continuation<? super IntegrityResult>, Object> {
            final /* synthetic */ String $request;
            final /* synthetic */ long $startTime;
            final /* synthetic */ com.google.android.play.core.integrity.a.c $tokenProvider;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11401(String str, com.google.android.play.core.integrity.a.c cVar, long j11, Continuation<? super C11401> continuation) {
                super(2, continuation);
                this.$request = str;
                this.$tokenProvider = cVar;
                this.$startTime = j11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C11401(this.$request, this.$tokenProvider, this.$startTime, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                try {
                    if (i11 == 0) {
                        t.b(obj);
                        Task<com.google.android.play.core.integrity.a.b> taskA = this.$tokenProvider.a(com.google.android.play.core.integrity.a.d.a().b(IntegrityProviderImpl.INSTANCE.getRequestHash(this.$request)).a());
                        s.j(taskA, "request(...)");
                        this.label = 1;
                        obj = TasksKt.await(taskA, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    IntegrityProviderImpl.sendTelemetry$default(IntegrityProviderImpl.INSTANCE, "Request-Integrity-Verdict-Success", this.$startTime, null, null, 12, null);
                    String strA = ((com.google.android.play.core.integrity.a.b) obj).a();
                    s.j(strA, "token(...)");
                    return new IntegrityResult.Success(strA);
                } catch (StandardIntegrityException e11) {
                    if (e11.a() != -19) {
                        IntegrityProviderImpl.INSTANCE.sendTelemetry("Request-Integrity-Verdict-Failure", this.$startTime, "error code: " + e11.a(), LOGLEVEL.WARNING);
                        return new IntegrityResult.Failure("IntegrityServiceException, error code: " + e11.a());
                    }
                    IntegrityProviderImpl.standardIntegrityTokenProvider = null;
                    IntegrityProviderImpl integrityProviderImpl = IntegrityProviderImpl.INSTANCE;
                    integrityProviderImpl.warmupIntegrityTokenProvider();
                    integrityProviderImpl.sendTelemetry("Request-Integrity-Verdict-Failure", this.$startTime, "error code: " + e11.a(), LOGLEVEL.WARNING);
                    return new IntegrityResult.Failure("TokenProvider invalid (reinitializing), error code: " + e11.a());
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IntegrityResult> continuation) {
                return ((C11401) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C46081(String str, com.google.android.play.core.integrity.a.c cVar, long j11, Continuation<? super C46081> continuation) {
            super(2, continuation);
            this.$request = str;
            this.$tokenProvider = cVar;
            this.$startTime = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C46081 c46081 = new C46081(this.$request, this.$tokenProvider, this.$startTime, continuation);
            c46081.L$0 = obj;
            return c46081;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                C11401 c11401 = new C11401(this.$request, this.$tokenProvider, this.$startTime, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = TimeoutKt.withTimeoutOrNull(1000L, c11401, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            IntegrityResult integrityResult = (IntegrityResult) obj;
            if (integrityResult != null) {
                return integrityResult;
            }
            IntegrityProviderImpl.INSTANCE.sendTelemetry("Request-Integrity-Verdict-Timeout", this.$startTime, "Timed out", LOGLEVEL.WARNING);
            return new IntegrityResult.Failure("Timed out after 1s");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IntegrityResult> continuation) {
            return ((C46081) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.tesla.oapi.auth.IntegrityProviderImpl$warmupIntegrityTokenProvider$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.oapi.auth.IntegrityProviderImpl$warmupIntegrityTokenProvider$1", f = "IntegrityProviderImpl.kt", i = {0}, l = {186}, m = "invokeSuspend", n = {"startTime"}, s = {"J$0"})
    static final class C46091 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        C46091(Continuation<? super C46091> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Task invokeSuspend$lambda$1(CoroutineScope coroutineScope, long j11) {
            CoroutineScopeKt.ensureActive(coroutineScope);
            com.google.android.play.core.integrity.a aVar = IntegrityProviderImpl.standardIntegrityManager;
            if (aVar == null) {
                s.B("standardIntegrityManager");
                aVar = null;
            }
            Task<com.google.android.play.core.integrity.a.c> taskA = aVar.a(com.google.android.play.core.integrity.a.AbstractC0673a.c().b(j11).a());
            s.j(taskA, "prepareIntegrityToken(...)");
            return taskA;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C46091 c46091 = new C46091(continuation);
            c46091.L$0 = obj;
            return c46091;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005b A[Catch: all -> 0x0015, StandardIntegrityException -> 0x006e, TryCatch #1 {StandardIntegrityException -> 0x006e, blocks: (B:21:0x0057, B:23:0x005b, B:26:0x0070, B:31:0x0081, B:37:0x009a), top: B:47:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0070 A[Catch: all -> 0x0015, StandardIntegrityException -> 0x006e, TryCatch #1 {StandardIntegrityException -> 0x006e, blocks: (B:21:0x0057, B:23:0x005b, B:26:0x0070, B:31:0x0081, B:37:0x009a), top: B:47:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x007a  */
        /* JADX WARN: Code duplicated, block: B:30:0x007e  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j11;
            Object objExponentialBackoff;
            long j12;
            com.google.android.play.core.integrity.a.c cVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                try {
                    if (i11 == 0) {
                        t.b(obj);
                        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            Long lZ = p013kotlin.text.t.z("596800703674");
                            if (lZ == null) {
                                IntegrityProviderImpl.INSTANCE.sendTelemetry("Token-Provider-Warmup-Failure", jCurrentTimeMillis, "GOOGLE_CLOUD_PROJECT_NUMBER is missing or invalid", LOGLEVEL.ERROR);
                                h0 h0Var = h0.f84049a;
                                IntegrityProviderImpl.isWarmingUp.set(false);
                                return h0Var;
                            }
                            final long jLongValue = lZ.longValue();
                            IntegrityProviderImpl integrityProviderImpl = IntegrityProviderImpl.INSTANCE;
                            wn0.a aVar = new wn0.a() { // from class: com.tesla.oapi.auth.b
                                @Override // wn0.a
                                public final Object invoke() {
                                    return IntegrityProviderImpl.C46091.invokeSuspend$lambda$1(coroutineScope, jLongValue);
                                }
                            };
                            this.J$0 = jCurrentTimeMillis;
                            this.label = 1;
                            objExponentialBackoff = integrityProviderImpl.exponentialBackoff(3, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, 2.0d, aVar, this);
                            if (objExponentialBackoff == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j12 = jCurrentTimeMillis;
                            cVar = (com.google.android.play.core.integrity.a.c) objExponentialBackoff;
                            if (cVar != null) {
                                IntegrityProviderImpl.standardIntegrityTokenProvider = cVar;
                                IntegrityProviderImpl integrityProviderImpl2 = IntegrityProviderImpl.INSTANCE;
                                IntegrityProviderImpl.sendTelemetry$default(integrityProviderImpl2, "Token-Provider-Warmup-Success", j12, null, null, 12, null);
                                integrityProviderImpl2.forceTokenRefresh();
                            } else {
                                IntegrityProviderImpl integrityProviderImpl3 = IntegrityProviderImpl.INSTANCE;
                                if (IntegrityProviderImpl.isProviderFailureNonTransient) {
                                    str = "Non-transient error";
                                } else {
                                    str = "All retry attempts exhausted";
                                }
                                integrityProviderImpl3.sendTelemetry("Token-Provider-Warmup-Failure", j12, str, LOGLEVEL.ERROR);
                            }
                        } catch (StandardIntegrityException e11) {
                            e = e11;
                            j11 = jCurrentTimeMillis;
                            IntegrityProviderImpl.isProviderFailureNonTransient = true;
                            IntegrityProviderImpl.INSTANCE.sendTelemetry("Token-Provider-Warmup-Failure", j11, "Non-transient error, error code: " + e.a(), LOGLEVEL.ERROR);
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j13 = this.J$0;
                        try {
                            t.b(obj);
                            objExponentialBackoff = obj;
                            j12 = j13;
                            cVar = (com.google.android.play.core.integrity.a.c) objExponentialBackoff;
                            if (cVar != null) {
                                IntegrityProviderImpl.standardIntegrityTokenProvider = cVar;
                                IntegrityProviderImpl integrityProviderImpl4 = IntegrityProviderImpl.INSTANCE;
                                IntegrityProviderImpl.sendTelemetry$default(integrityProviderImpl4, "Token-Provider-Warmup-Success", j12, null, null, 12, null);
                                integrityProviderImpl4.forceTokenRefresh();
                            } else {
                                IntegrityProviderImpl integrityProviderImpl5 = IntegrityProviderImpl.INSTANCE;
                                if (IntegrityProviderImpl.isProviderFailureNonTransient) {
                                    str = "Non-transient error";
                                } else {
                                    str = "All retry attempts exhausted";
                                }
                                integrityProviderImpl5.sendTelemetry("Token-Provider-Warmup-Failure", j12, str, LOGLEVEL.ERROR);
                            }
                        } catch (StandardIntegrityException e12) {
                            e = e12;
                            j11 = j13;
                            IntegrityProviderImpl.isProviderFailureNonTransient = true;
                            IntegrityProviderImpl.INSTANCE.sendTelemetry("Token-Provider-Warmup-Failure", j11, "Non-transient error, error code: " + e.a(), LOGLEVEL.ERROR);
                        }
                    }
                } catch (StandardIntegrityException e13) {
                    e = e13;
                }
                IntegrityProviderImpl.isWarmingUp.set(false);
                return h0.f84049a;
            } catch (Throwable th2) {
                IntegrityProviderImpl.isWarmingUp.set(false);
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C46091) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private IntegrityProviderImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(3:46|23|(2:25|39)(1:26)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        r16 = r6;
        r6 = r1;
        r1 = r12;
        r12 = r11;
        r10 = r9;
        r9 = r14;
        r14 = r4;
        r5 = r16;
        r16 = r8;
        r4 = r13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x017f -> B:13:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0196 -> B:42:0x01a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object exponentialBackoff(int r23, long r24, long r26, double r28, wn0.a<? extends com.google.android.gms.tasks.Task<T>> r30, p013kotlin.coroutines.Continuation<? super T> r31) throws com.google.android.play.core.integrity.StandardIntegrityException {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.oapi.auth.IntegrityProviderImpl.exponentialBackoff(int, long, long, double, wn0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forceTokenRefresh() {
        BuildersKt__Builders_commonKt.launch$default(mainScope, null, null, new C46061(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRequestHash(String request) throws NoSuchAlgorithmException {
        byte[] bytes = request.getBytes(p013kotlin.text.d.UTF_8);
        s.j(bytes, "getBytes(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        s.j(messageDigest, "getInstance(...)");
        messageDigest.update(bytes);
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
        s.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private final boolean isRecoverable(int errorCode) {
        return errorCode == -100 || errorCode == -18 || errorCode == -12 || errorCode == -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendTelemetry(String type, long startTime, String reason, LOGLEVEL logLevel) {
        long jCurrentTimeMillis = System.currentTimeMillis() - startTime;
        String str = type + ", " + (reason == null ? "" : reason);
        int i11 = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i11 == 1) {
            g gVar = log;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        } else if (i11 != 2) {
            log.j(str);
        } else {
            log.n(str);
        }
        Map mapO = v0.o(x.a("event", "mobile-app-play-integrity-telemetry"), x.a("type", type), x.a("duration_ms", Long.valueOf(jCurrentTimeMillis)));
        if (reason != null) {
            mapO.put(AnalyticsAttribute.Reason, reason);
        }
        ud0.a.b(mapO, true, null, 4, null);
    }

    static /* synthetic */ void sendTelemetry$default(IntegrityProviderImpl integrityProviderImpl, String str, long j11, String str2, LOGLEVEL loglevel, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i11 & 8) != 0) {
            loglevel = LOGLEVEL.INFO;
        }
        integrityProviderImpl.sendTelemetry(str, j11, str3, loglevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void warmupIntegrityTokenProvider() {
        if (isWarmingUp.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(dispatcherScope, null, null, new C46091(null), 3, null);
        } else {
            log.j("Warmup already in progress, skipping");
        }
    }

    @Override // com.tesla.oapi.auth.IntegrityProvider
    public void disableAttestation() {
        BuildersKt__Builders_commonKt.launch$default(dispatcherScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.tesla.oapi.auth.IntegrityProvider
    public void enableAttestation() {
        BuildersKt__Builders_commonKt.launch$default(dispatcherScope, null, null, new C46041(null), 3, null);
    }

    @Override // com.tesla.oapi.auth.IntegrityProvider
    public void initialize(Context applicationContext, wn0.a<h0> onWarmupComplete) {
        s.k(applicationContext, "applicationContext");
        BuildersKt__Builders_commonKt.launch$default(dispatcherScope, null, null, new C46071(applicationContext, onWarmupComplete, null), 3, null);
    }

    @Override // com.tesla.oapi.auth.IntegrityProvider
    public IntegrityResult requestIntegrityVerdict(String request) {
        s.k(request, "request");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!isAttestationEnabled.get()) {
            return IntegrityResult.AttestationDisabled.INSTANCE;
        }
        if (standardIntegrityManager == null) {
            sendTelemetry("Request-Integrity-Verdict-Failure", jCurrentTimeMillis, "StandardIntegrityManager has not initialized", LOGLEVEL.WARNING);
            return new IntegrityResult.Failure("StandardIntegrityManager has not initialized");
        }
        com.google.android.play.core.integrity.a.c cVar = standardIntegrityTokenProvider;
        if (cVar != null) {
            return (IntegrityResult) BuildersKt.runBlocking(dispatcherScope.getCoroutineContext(), new C46081(request, cVar, jCurrentTimeMillis, null));
        }
        if (!isProviderFailureNonTransient) {
            warmupIntegrityTokenProvider();
        }
        sendTelemetry("Request-Integrity-Verdict-Failure", jCurrentTimeMillis, "Token provider not warmed up yet", LOGLEVEL.WARNING);
        return new IntegrityResult.Failure("StandardIntegrityTokenProvider not warmed up yet.");
    }
}
