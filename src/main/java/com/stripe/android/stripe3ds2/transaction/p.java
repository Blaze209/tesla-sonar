package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import u80.ErrorData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0002#&Be\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/p;", "Lcom/stripe/android/stripe3ds2/transaction/c;", "Lcom/stripe/android/stripe3ds2/security/k;", "messageTransformer", "", "sdkReferenceId", "Ljava/security/PrivateKey;", "sdkPrivateKey", "Ljava/security/interfaces/ECPublicKey;", "acsPublicKey", "acsUrl", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/security/d;", "dhKeyGenerator", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lt80/k;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/g;", "responseProcessorFactory", "<init>", "(Lcom/stripe/android/stripe3ds2/security/k;Ljava/lang/String;Ljava/security/PrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lr80/c;Lcom/stripe/android/stripe3ds2/security/d;Lkotlin/coroutines/CoroutineContext;Lt80/k;Lcom/stripe/android/stripe3ds2/transaction/c$a;Lcom/stripe/android/stripe3ds2/transaction/g;)V", "Lorg/json/JSONObject;", StatusResponse.PAYLOAD, "g", "(Lorg/json/JSONObject;)Ljava/lang/String;", "Ljavax/crypto/SecretKey;", "f", "()Ljavax/crypto/SecretKey;", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/d;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/security/k;", "b", "Ljava/lang/String;", "c", "Ljava/security/PrivateKey;", DateTokenConverter.CONVERTER_KEY, "Ljava/security/interfaces/ECPublicKey;", "e", "Lr80/c;", "Lcom/stripe/android/stripe3ds2/security/d;", "Lkotlin/coroutines/CoroutineContext;", "h", "Lt80/k;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "j", "Ljavax/crypto/SecretKey;", "secretKey", "Lcom/stripe/android/stripe3ds2/transaction/f;", "k", "Lcom/stripe/android/stripe3ds2/transaction/f;", "responseProcessor", "l", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p implements com.stripe.android.stripe3ds2.transaction.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f54057m = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.security.k messageTransformer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sdkReferenceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PrivateKey sdkPrivateKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ECPublicKey acsPublicKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.security.d dhKeyGenerator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t80.k httpClient;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.transaction.c.Config creqExecutorConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SecretKey secretKey;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f responseProcessor;

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transaction.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/p$a;", "", "<init>", "()V", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lcom/stripe/android/stripe3ds2/transaction/d$e;", "b", "(Lcom/stripe/android/stripe3ds2/transactions/a;)Lcom/stripe/android/stripe3ds2/transaction/d$e;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.stripe.android.stripe3ds2.transaction.d.Timeout b(ChallengeRequestData creqData) {
            t80.q sdkTransId = creqData.getSdkTransId();
            String messageVersion = creqData.getMessageVersion();
            String acsTransId = creqData.getAcsTransId();
            String threeDsServerTransId = creqData.getThreeDsServerTransId();
            u80.b bVar = u80.b.TransactionTimedout;
            return new com.stripe.android.stripe3ds2.transaction.d.Timeout(new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(bVar.getCode()), ErrorData.c.ThreeDsSdk, bVar.getDescription(), "Challenge request timed-out", "CReq", messageVersion, sdkTransId, 4, null));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/p$b;", "Lcom/stripe/android/stripe3ds2/transaction/c$b;", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "config", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/c$a;)V", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/stripe3ds2/transaction/c;", "I2", "(Lr80/c;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/stripe3ds2/transaction/c;", "a", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.stripe.android.stripe3ds2.transaction.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.stripe3ds2.transaction.c.Config config;

        public b(com.stripe.android.stripe3ds2.transaction.c.Config config) {
            s.k(config, "config");
            this.config = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.c.b
        public com.stripe.android.stripe3ds2.transaction.c I2(r80.c errorReporter, CoroutineContext workContext) {
            s.k(errorReporter, "errorReporter");
            s.k(workContext, "workContext");
            com.stripe.android.stripe3ds2.security.f fVar = new com.stripe.android.stripe3ds2.security.f(errorReporter);
            return new p(this.config.getMessageTransformer(), this.config.getSdkReferenceId(), fVar.a(this.config.getKeys().getSdkPrivateKeyEncoded()), fVar.b(this.config.getKeys().getAcsPublicKeyEncoded()), this.config.getAcsUrl(), errorReporter, new com.stripe.android.stripe3ds2.security.m(errorReporter), workContext, null, this.config, null, 1280, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor", f = "StripeChallengeRequestExecutor.kt", i = {0}, l = {60}, m = "execute", n = {"creqData"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54070n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f54071o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f54073q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54071o = obj;
            this.f54073q |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/stripe3ds2/transaction/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/stripe3ds2/transaction/d;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2", f = "StripeChallengeRequestExecutor.kt", i = {}, l = {62, 70}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super com.stripe.android.stripe3ds2.transaction.d>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54074n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f54075o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ChallengeRequestData f54077q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ChallengeRequestData challengeRequestData, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f54077q = challengeRequestData;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = p.this.new d(this.f54077q, continuation);
            dVar.f54075o = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        
            if (r6 == r0) goto L27;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f54074n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L7d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> L1e
                goto L44
            L1e:
                r6 = move-exception
                goto L4b
            L20:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f54075o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                com.stripe.android.stripe3ds2.transaction.p r6 = com.stripe.android.stripe3ds2.transaction.p.this
                com.stripe.android.stripe3ds2.transactions.a r1 = r5.f54077q
                jn0.s$a r4 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L1e
                t80.k r4 = com.stripe.android.stripe3ds2.transaction.p.c(r6)     // Catch: java.lang.Throwable -> L1e
                org.json.JSONObject r1 = r1.j()     // Catch: java.lang.Throwable -> L1e
                java.lang.String r6 = com.stripe.android.stripe3ds2.transaction.p.d(r6, r1)     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = "application/jose; charset=UTF-8"
                r5.f54074n = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r6 = r4.a(r6, r1, r5)     // Catch: java.lang.Throwable -> L1e
                if (r6 != r0) goto L44
                goto L7c
            L44:
                t80.l r6 = (t80.l) r6     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r6 = jn0.s.b(r6)     // Catch: java.lang.Throwable -> L1e
                goto L55
            L4b:
                jn0.s$a r1 = jn0.s.INSTANCE
                java.lang.Object r6 = jn0.t.a(r6)
                java.lang.Object r6 = jn0.s.b(r6)
            L55:
                com.stripe.android.stripe3ds2.transaction.p r1 = com.stripe.android.stripe3ds2.transaction.p.this
                java.lang.Throwable r3 = jn0.s.e(r6)
                if (r3 == 0) goto L64
                r80.c r1 = com.stripe.android.stripe3ds2.transaction.p.b(r1)
                r1.Y0(r3)
            L64:
                com.stripe.android.stripe3ds2.transaction.p r1 = com.stripe.android.stripe3ds2.transaction.p.this
                com.stripe.android.stripe3ds2.transactions.a r3 = r5.f54077q
                java.lang.Throwable r4 = jn0.s.e(r6)
                if (r4 != 0) goto L80
                t80.l r6 = (t80.l) r6
                com.stripe.android.stripe3ds2.transaction.f r1 = com.stripe.android.stripe3ds2.transaction.p.e(r1)
                r5.f54074n = r2
                java.lang.Object r6 = r1.a(r3, r6, r5)
                if (r6 != r0) goto L7d
            L7c:
                return r0
            L7d:
                com.stripe.android.stripe3ds2.transaction.d r6 = (com.stripe.android.stripe3ds2.transaction.d) r6
                goto L90
            L80:
                boolean r6 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
                if (r6 == 0) goto L8b
                com.stripe.android.stripe3ds2.transaction.p$a r6 = com.stripe.android.stripe3ds2.transaction.p.INSTANCE
                com.stripe.android.stripe3ds2.transaction.d$e r6 = com.stripe.android.stripe3ds2.transaction.p.Companion.a(r6, r3)
                goto L90
            L8b:
                com.stripe.android.stripe3ds2.transaction.d$c r6 = new com.stripe.android.stripe3ds2.transaction.d$c
                r6.<init>(r4)
            L90:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.p.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.stripe.android.stripe3ds2.transaction.d> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public p(com.stripe.android.stripe3ds2.security.k messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, r80.c errorReporter, com.stripe.android.stripe3ds2.security.d dhKeyGenerator, CoroutineContext workContext, t80.k httpClient, com.stripe.android.stripe3ds2.transaction.c.Config creqExecutorConfig, g responseProcessorFactory) {
        s.k(messageTransformer, "messageTransformer");
        s.k(sdkReferenceId, "sdkReferenceId");
        s.k(sdkPrivateKey, "sdkPrivateKey");
        s.k(acsPublicKey, "acsPublicKey");
        s.k(acsUrl, "acsUrl");
        s.k(errorReporter, "errorReporter");
        s.k(dhKeyGenerator, "dhKeyGenerator");
        s.k(workContext, "workContext");
        s.k(httpClient, "httpClient");
        s.k(creqExecutorConfig, "creqExecutorConfig");
        s.k(responseProcessorFactory, "responseProcessorFactory");
        this.messageTransformer = messageTransformer;
        this.sdkReferenceId = sdkReferenceId;
        this.sdkPrivateKey = sdkPrivateKey;
        this.acsPublicKey = acsPublicKey;
        this.errorReporter = errorReporter;
        this.dhKeyGenerator = dhKeyGenerator;
        this.workContext = workContext;
        this.httpClient = httpClient;
        this.creqExecutorConfig = creqExecutorConfig;
        SecretKey secretKeyF = f();
        this.secretKey = secretKeyF;
        this.responseProcessor = responseProcessorFactory.a(secretKeyF);
    }

    private final SecretKey f() {
        com.stripe.android.stripe3ds2.security.d dVar = this.dhKeyGenerator;
        ECPublicKey eCPublicKey = this.acsPublicKey;
        PrivateKey privateKey = this.sdkPrivateKey;
        s.i(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return dVar.e1(eCPublicKey, (ECPrivateKey) privateKey, this.sdkReferenceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(JSONObject payload) {
        return this.messageTransformer.K0(payload, this.secretKey);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.stripe.android.stripe3ds2.transaction.c
    public Object a(ChallengeRequestData challengeRequestData, Continuation<? super com.stripe.android.stripe3ds2.transaction.d> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f54073q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f54073q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithTimeoutOrNull = cVar.f54071o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f54073q;
        if (i12 == 0) {
            t.b(objWithTimeoutOrNull);
            long j11 = f54057m;
            d dVar = new d(challengeRequestData, null);
            cVar.f54070n = challengeRequestData;
            cVar.f54073q = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j11, dVar, cVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            challengeRequestData = (ChallengeRequestData) cVar.f54070n;
            t.b(objWithTimeoutOrNull);
        }
        com.stripe.android.stripe3ds2.transaction.d dVar2 = (com.stripe.android.stripe3ds2.transaction.d) objWithTimeoutOrNull;
        return dVar2 == null ? INSTANCE.b(challengeRequestData) : dVar2;
    }

    public /* synthetic */ p(com.stripe.android.stripe3ds2.security.k kVar, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, r80.c cVar, com.stripe.android.stripe3ds2.security.d dVar, CoroutineContext coroutineContext, t80.k kVar2, com.stripe.android.stripe3ds2.transaction.c.Config config, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        t80.k rVar;
        com.stripe.android.stripe3ds2.security.k kVar3;
        r80.c cVar2;
        com.stripe.android.stripe3ds2.transaction.c.Config config2;
        g aVar;
        if ((i11 & 256) != 0) {
            rVar = new r(str2, null, cVar, coroutineContext, 2, null);
        } else {
            rVar = kVar2;
        }
        if ((i11 & 1024) != 0) {
            kVar3 = kVar;
            aVar = new g.a(kVar3, cVar, config);
            config2 = config;
            cVar2 = cVar;
        } else {
            kVar3 = kVar;
            cVar2 = cVar;
            config2 = config;
            aVar = gVar;
        }
        this(kVar3, str, privateKey, eCPublicKey, str2, cVar2, dVar, coroutineContext, rVar, config2, aVar);
    }
}
