package com.teslamotors.plugins.ble.card;

import android.content.Context;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.teslamotors.plugins.ble.beacon.OemWalletInjector;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import com.teslamotors.plugins.ble.j0;
import com.teslamotors.plugins.ble.k0;
import ie0.e0;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.AbstractCoroutineContextElement;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import xe0.OemWalletSupportStatus;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bg\u0018\u0000 +2\u00020\u0001:\u0001,J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0013J+\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\nH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\"\u0010\u0006J0\u0010'\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u0006-"}, d2 = {"Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSupported", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", "init", "(Landroid/content/Context;)V", "", "vin", "carType", "macAddress", "issueCard", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withdrawCard", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withdrawAllCard", "(Landroid/content/Context;)Z", "cardIssued", "currentAuthStatus", "Lkotlin/Function1;", "resultListener", "authorize", "(Landroid/content/Context;Lwn0/l;)V", "unauthorize", "getBrandName", "()Ljava/lang/String;", "onBLEServiceInitialized", "(Ljava/lang/String;Landroid/content/Context;)V", "localNotSupportedReason", "(Landroid/content/Context;)Ljava/lang/String;", "Lxe0/c;", "checkModelSupportWallet", "", "pullDoorTimeMS", "", "failReasonType", "handlePulledWithoutAuthReport", "(Landroid/content/Context;Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVendor", "vendor", "Companion", "a", "tesla-oem-wallet_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OemWalletProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f56808a;

    /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006\""}, d2 = {"Lcom/teslamotors/plugins/ble/card/OemWalletProvider$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "e", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Ljava/lang/String;", "Ljn0/h0;", "f", "(Landroid/content/Context;)V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "getLogger$tesla_oem_wallet_globalPlayRelease", "()Lcom/tesla/logging/g;", "logger", "", "c", "Lkotlin/Lazy;", "()Ljava/util/List;", "instance", "", "Z", "isProviderResolved", "Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "supportedProvider", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "resolutionMutex", "tesla-oem-wallet_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static volatile boolean isProviderResolved;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static volatile OemWalletProvider supportedProvider;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f56808a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final g logger = g.INSTANCE.a("OemWallet");

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final Lazy<List<OemWalletProvider>> instance = m.b(new wn0.a() { // from class: xe0.b
            @Override // wn0.a
            public final Object invoke() {
                return OemWalletProvider.Companion.g();
            }
        });

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Mutex resolutionMutex = MutexKt.Mutex$default(false, 1, null);

        /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletProvider$Companion", f = "OemWalletProvider.kt", i = {0, 0, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 145}, m = "getSupportedProvider", n = {CoreConstants.CONTEXT_SCOPE_VALUE, "$this$withLock_u24default$iv", CoreConstants.CONTEXT_SCOPE_VALUE, "$this$withLock_u24default$iv", "provider"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3"})
        static final class C1148a extends ContinuationImpl {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f56814n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f56815o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f56816p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f56817q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f56818r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f56820t;

            C1148a(Continuation<? super C1148a> continuation) {
                super(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f56818r = obj;
                this.f56820t |= Integer.MIN_VALUE;
                return Companion.this.e(null, this);
            }
        }

        /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$b */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "Ljn0/h0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public b(CoroutineExceptionHandler.Companion companion) {
                super(companion);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(CoroutineContext context, Throwable exception) {
                Companion.logger.d("OemWallet listener coroutine failed", exception);
            }
        }

        /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$c */
        @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/teslamotors/plugins/ble/card/OemWalletProvider$a$c", "Lcom/teslamotors/plugins/ble/j0;", "", "vin", "Landroid/content/Context;", "ctx", "Ljn0/h0;", "onBLEServiceInitialized", "(Ljava/lang/String;Landroid/content/Context;)V", "withdrawAllCard", "(Landroid/content/Context;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "", "pullDoorTimeMS", "", "failReasonType", "a", "(Landroid/content/Context;Ljava/lang/String;JI)V", "tesla-oem-wallet_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c implements j0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoroutineScope f56821a;

            /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletProvider$Companion$initProviders$1$onBLEServiceInitialized$1", f = "OemWalletProvider.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
            static final class C1149a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f56822n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Context f56823o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ String f56824p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1149a(Context context, String str, Continuation<? super C1149a> continuation) {
                    super(2, continuation);
                    this.f56823o = context;
                    this.f56824p = str;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1149a(this.f56823o, this.f56824p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f56822n;
                    if (i11 == 0) {
                        t.b(obj);
                        Companion companion = Companion.f56808a;
                        Context context = this.f56823o;
                        this.f56822n = 1;
                        obj = companion.e(context, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    OemWalletProvider oemWalletProvider = (OemWalletProvider) obj;
                    if (oemWalletProvider != null) {
                        oemWalletProvider.onBLEServiceInitialized(this.f56824p, this.f56823o);
                    }
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C1149a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$c$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletProvider$Companion$initProviders$1$reportHandlePulledWithoutAuth$1", f = "OemWalletProvider.kt", i = {}, l = {183, 183}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f56825n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Context f56826o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ String f56827p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ long f56828q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ int f56829r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Context context, String str, long j11, int i11, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f56826o = context;
                    this.f56827p = str;
                    this.f56828q = j11;
                    this.f56829r = i11;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f56826o, this.f56827p, this.f56828q, this.f56829r, continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
                
                    if (r3.handlePulledWithoutAuthReport(r4, r5, r6, r8, r10) == r0) goto L17;
                 */
                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r10.f56825n
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        jn0.t.b(r11)
                        goto L45
                    L12:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1a:
                        jn0.t.b(r11)
                        goto L2e
                    L1e:
                        jn0.t.b(r11)
                        com.teslamotors.plugins.ble.card.OemWalletProvider$a r11 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.f56808a
                        android.content.Context r1 = r10.f56826o
                        r10.f56825n = r3
                        java.lang.Object r11 = r11.e(r1, r10)
                        if (r11 != r0) goto L2e
                        goto L44
                    L2e:
                        r3 = r11
                        com.teslamotors.plugins.ble.card.OemWalletProvider r3 = (com.teslamotors.plugins.ble.card.OemWalletProvider) r3
                        if (r3 == 0) goto L45
                        android.content.Context r4 = r10.f56826o
                        java.lang.String r5 = r10.f56827p
                        long r6 = r10.f56828q
                        int r8 = r10.f56829r
                        r10.f56825n = r2
                        r9 = r10
                        java.lang.Object r11 = r3.handlePulledWithoutAuthReport(r4, r5, r6, r8, r9)
                        if (r11 != r0) goto L45
                    L44:
                        return r0
                    L45:
                        jn0.h0 r11 = jn0.h0.f84049a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX INFO: renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$c$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.teslamotors.plugins.ble.card.OemWalletProvider$Companion$initProviders$1$withdrawAllCard$1", f = "OemWalletProvider.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
            static final class C1150c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f56830n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Context f56831o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1150c(Context context, Continuation<? super C1150c> continuation) {
                    super(2, continuation);
                    this.f56831o = context;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1150c(this.f56831o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f56830n;
                    if (i11 == 0) {
                        t.b(obj);
                        Companion companion = Companion.f56808a;
                        Context context = this.f56831o;
                        this.f56830n = 1;
                        obj = companion.e(context, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    OemWalletProvider oemWalletProvider = (OemWalletProvider) obj;
                    if (oemWalletProvider != null) {
                        Boxing.boxBoolean(oemWalletProvider.withdrawAllCard(this.f56831o));
                    }
                    return h0.f84049a;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                    return ((C1150c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            c(CoroutineScope coroutineScope) {
                this.f56821a = coroutineScope;
            }

            @Override // com.teslamotors.plugins.ble.j0
            public void a(Context context, String vin, long pullDoorTimeMS, int failReasonType) {
                s.k(context, "context");
                s.k(vin, "vin");
                BuildersKt__Builders_commonKt.launch$default(this.f56821a, null, null, new b(context, vin, pullDoorTimeMS, failReasonType, null), 3, null);
            }

            @Override // com.teslamotors.plugins.ble.j0
            public void onBLEServiceInitialized(String vin, Context ctx) {
                s.k(vin, "vin");
                s.k(ctx, "ctx");
                BuildersKt__Builders_commonKt.launch$default(this.f56821a, null, null, new C1149a(ctx, vin, null), 3, null);
            }

            @Override // com.teslamotors.plugins.ble.j0
            public void withdrawAllCard(Context ctx) {
                s.k(ctx, "ctx");
                BuildersKt__Builders_commonKt.launch$default(this.f56821a, null, null, new C1150c(ctx, null), 3, null);
            }
        }

        private Companion() {
        }

        private final List<OemWalletProvider> c() {
            return instance.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g() {
            List list = null;
            try {
                OemWalletInjector oemWalletInjector = OemWalletInjector.INSTANCE;
                Object objInvoke = OemWalletInjector.class.getDeclaredMethod("inject", null).invoke(OemWalletInjector.class.getDeclaredField("INSTANCE").get(null), null);
                if (!(objInvoke instanceof List)) {
                    objInvoke = null;
                }
                list = (List) objInvoke;
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("ReflectionHelper", "can not invoke static method# inject on class# com.teslamotors.plugins.ble.beacon.OemWalletInjector", e11);
            }
            return list == null ? v.m() : list;
        }

        public final String d(Context context) {
            s.k(context, "context");
            Iterator<T> it = c().iterator();
            while (it.hasNext()) {
                String strLocalNotSupportedReason = ((OemWalletProvider) it.next()).localNotSupportedReason(context);
                if (strLocalNotSupportedReason != null) {
                    return strLocalNotSupportedReason;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x008c A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0039, B:39:0x00a3, B:34:0x0086, B:36:0x008c, B:43:0x00ad, B:28:0x0070, B:30:0x0074, B:33:0x007a), top: B:48:0x0023 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
        
            if (r10 == r1) goto L38;
         */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x00b7: INVOKE (r6 I:kotlinx.coroutines.sync.Mutex), (r5 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:184), block:B:46:0x00b7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a0 -> B:39:0x00a3). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object e(android.content.Context r9, p013kotlin.coroutines.Continuation<? super com.teslamotors.plugins.ble.card.OemWalletProvider> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.C1148a
                if (r0 == 0) goto L13
                r0 = r10
                com.teslamotors.plugins.ble.card.OemWalletProvider$a$a r0 = (com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.C1148a) r0
                int r1 = r0.f56820t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f56820t = r1
                goto L18
            L13:
                com.teslamotors.plugins.ble.card.OemWalletProvider$a$a r0 = new com.teslamotors.plugins.ble.card.OemWalletProvider$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f56818r
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f56820t
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L56
                if (r2 == r4) goto L48
                if (r2 != r3) goto L40
                java.lang.Object r9 = r0.f56817q
                com.teslamotors.plugins.ble.card.OemWalletProvider r9 = (com.teslamotors.plugins.ble.card.OemWalletProvider) r9
                java.lang.Object r2 = r0.f56816p
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r6 = r0.f56815o
                kotlinx.coroutines.sync.Mutex r6 = (kotlinx.coroutines.sync.Mutex) r6
                java.lang.Object r7 = r0.f56814n
                android.content.Context r7 = (android.content.Context) r7
                jn0.t.b(r10)     // Catch: java.lang.Throwable -> L3d
                goto La3
            L3d:
                r9 = move-exception
                goto Lb7
            L40:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L48:
                java.lang.Object r9 = r0.f56815o
                kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
                java.lang.Object r2 = r0.f56814n
                android.content.Context r2 = (android.content.Context) r2
                jn0.t.b(r10)
                r6 = r9
                r9 = r2
                goto L70
            L56:
                jn0.t.b(r10)
                boolean r10 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.isProviderResolved
                if (r10 == 0) goto L60
                com.teslamotors.plugins.ble.card.OemWalletProvider r9 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.supportedProvider
                return r9
            L60:
                kotlinx.coroutines.sync.Mutex r10 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.resolutionMutex
                r0.f56814n = r9
                r0.f56815o = r10
                r0.f56820t = r4
                java.lang.Object r2 = r10.lock(r5, r0)
                if (r2 != r1) goto L6f
                goto La2
            L6f:
                r6 = r10
            L70:
                boolean r10 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.isProviderResolved     // Catch: java.lang.Throwable -> L3d
                if (r10 == 0) goto L7a
                com.teslamotors.plugins.ble.card.OemWalletProvider r9 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.supportedProvider     // Catch: java.lang.Throwable -> L3d
                r6.unlock(r5)
                return r9
            L7a:
                com.teslamotors.plugins.ble.card.OemWalletProvider$a r10 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.f56808a     // Catch: java.lang.Throwable -> L3d
                java.util.List r10 = r10.c()     // Catch: java.lang.Throwable -> L3d
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L3d
                r7 = r9
                r2 = r10
            L86:
                boolean r9 = r2.hasNext()     // Catch: java.lang.Throwable -> L3d
                if (r9 == 0) goto Lac
                java.lang.Object r9 = r2.next()     // Catch: java.lang.Throwable -> L3d
                com.teslamotors.plugins.ble.card.OemWalletProvider r9 = (com.teslamotors.plugins.ble.card.OemWalletProvider) r9     // Catch: java.lang.Throwable -> L3d
                r0.f56814n = r7     // Catch: java.lang.Throwable -> L3d
                r0.f56815o = r6     // Catch: java.lang.Throwable -> L3d
                r0.f56816p = r2     // Catch: java.lang.Throwable -> L3d
                r0.f56817q = r9     // Catch: java.lang.Throwable -> L3d
                r0.f56820t = r3     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r10 = r9.isSupported(r7, r0)     // Catch: java.lang.Throwable -> L3d
                if (r10 != r1) goto La3
            La2:
                return r1
            La3:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L3d
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L3d
                if (r10 == 0) goto L86
                goto Lad
            Lac:
                r9 = r5
            Lad:
                com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.supportedProvider = r9     // Catch: java.lang.Throwable -> L3d
                com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.isProviderResolved = r4     // Catch: java.lang.Throwable -> L3d
                com.teslamotors.plugins.ble.card.OemWalletProvider r9 = com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.supportedProvider     // Catch: java.lang.Throwable -> L3d
                r6.unlock(r5)
                return r9
            Lb7:
                r6.unlock(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.card.OemWalletProvider.Companion.e(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final void f(Context context) {
            s.k(context, "context");
            if (e0.g(context) || e0.e(context)) {
                k0.f56924a.b(new c(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new b(CoroutineExceptionHandler.INSTANCE)))));
                logger.j("init providers");
                Iterator<T> it = c().iterator();
                while (it.hasNext()) {
                    ((OemWalletProvider) it.next()).init(context);
                }
            }
        }
    }

    static String getLocalNotSupportedReason(Context context) {
        return INSTANCE.d(context);
    }

    static Object getSupportedProvider(Context context, Continuation<? super OemWalletProvider> continuation) {
        return INSTANCE.e(context, continuation);
    }

    void authorize(Context context, l<? super Boolean, h0> resultListener);

    Object cardIssued(String str, Context context, Continuation<? super Boolean> continuation);

    Object checkModelSupportWallet(Context context, Continuation<? super OemWalletSupportStatus> continuation);

    boolean currentAuthStatus(Context context);

    String getBrandName();

    String getVendor();

    Object handlePulledWithoutAuthReport(Context context, String str, long j11, int i11, Continuation<? super h0> continuation);

    void init(Context context);

    Object isSupported(Context context, Continuation<? super Boolean> continuation);

    Object issueCard(String str, String str2, String str3, Context context, Continuation<? super Boolean> continuation);

    String localNotSupportedReason(Context context);

    void onBLEServiceInitialized(String vin, Context context);

    boolean unauthorize(Context context);

    boolean withdrawAllCard(Context context);

    Object withdrawCard(String str, Context context, Continuation<? super Boolean> continuation);
}
