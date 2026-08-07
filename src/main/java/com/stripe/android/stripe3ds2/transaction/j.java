package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import java.security.interfaces.ECPublicKey;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import t80.AcsData;
import t80.ChallengeParameters;
import t80.InitChallengeArgs;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001BY\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/j;", "Lt80/n;", "Lt80/q;", "sdkTransactionId", "Lt80/p;", "messageVersionRegistry", "Lt80/o;", "jwsValidator", "Lcom/stripe/android/stripe3ds2/security/k;", "messageTransformer", "Lt80/b;", "acsDataParser", "Lcom/stripe/android/stripe3ds2/transaction/e;", "challengeRequestResultRepository", "Lcom/stripe/android/stripe3ds2/transaction/k$a;", "errorRequestExecutorFactory", "Lq80/m;", "uiCustomization", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/o;", "logger", "<init>", "(Lt80/q;Lt80/p;Lt80/o;Lcom/stripe/android/stripe3ds2/security/k;Lt80/b;Lcom/stripe/android/stripe3ds2/transaction/e;Lcom/stripe/android/stripe3ds2/transaction/k$a;Lq80/m;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/o;)V", "Lt80/e;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transactions/a;", "b", "(Lt80/q;Lt80/e;)Lcom/stripe/android/stripe3ds2/transactions/a;", "Lt80/m;", "args", "Lcom/stripe/android/stripe3ds2/transaction/m;", "a", "(Lt80/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt80/q;", "Lt80/p;", "c", "Lt80/o;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/stripe3ds2/security/k;", "e", "Lt80/b;", "f", "Lcom/stripe/android/stripe3ds2/transaction/e;", "g", "Lcom/stripe/android/stripe3ds2/transaction/k$a;", "h", "Lq80/m;", IntegerTokenConverter.CONVERTER_KEY, "Lr80/c;", "j", "Lcom/stripe/android/stripe3ds2/transaction/o;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j implements t80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t80.q sdkTransactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t80.p messageVersionRegistry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t80.o jwsValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.security.k messageTransformer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t80.b acsDataParser;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e challengeRequestResultRepository;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k.a errorRequestExecutorFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q80.m uiCustomization;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final o logger;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository", f = "InitChallengeRepository.kt", i = {0, 0, 0, 0, 0}, l = {67}, m = "startChallenge", n = {"this", "args", "$this$startChallenge_u24lambda_u240", "errorRequestExecutor", "creqExecutorConfig"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f54029n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f54030o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f54031p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f54032q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f54033r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f54034s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f54036u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54034s = obj;
            this.f54036u |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    public j(t80.q sdkTransactionId, t80.p messageVersionRegistry, t80.o jwsValidator, com.stripe.android.stripe3ds2.security.k messageTransformer, t80.b acsDataParser, e challengeRequestResultRepository, k.a errorRequestExecutorFactory, q80.m uiCustomization, r80.c errorReporter, o logger) {
        s.k(sdkTransactionId, "sdkTransactionId");
        s.k(messageVersionRegistry, "messageVersionRegistry");
        s.k(jwsValidator, "jwsValidator");
        s.k(messageTransformer, "messageTransformer");
        s.k(acsDataParser, "acsDataParser");
        s.k(challengeRequestResultRepository, "challengeRequestResultRepository");
        s.k(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        s.k(uiCustomization, "uiCustomization");
        s.k(errorReporter, "errorReporter");
        s.k(logger, "logger");
        this.sdkTransactionId = sdkTransactionId;
        this.messageVersionRegistry = messageVersionRegistry;
        this.jwsValidator = jwsValidator;
        this.messageTransformer = messageTransformer;
        this.acsDataParser = acsDataParser;
        this.challengeRequestResultRepository = challengeRequestResultRepository;
        this.errorRequestExecutorFactory = errorRequestExecutorFactory;
        this.uiCustomization = uiCustomization;
        this.errorReporter = errorReporter;
        this.logger = logger;
    }

    private final ChallengeRequestData b(t80.q sdkTransactionId, ChallengeParameters challengeParameters) {
        String acsTransactionId = challengeParameters.getAcsTransactionId();
        if (acsTransactionId == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String threeDsServerTransactionId = challengeParameters.getThreeDsServerTransactionId();
        if (threeDsServerTransactionId != null) {
            return new ChallengeRequestData(this.messageVersionRegistry.a(), threeDsServerTransactionId, acsTransactionId, sdkTransactionId, null, null, null, null, null, null, 1008, null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0100 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0104 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0123 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0127 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x013f A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0143 A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x015c A[Catch: all -> 0x00fd, TryCatch #3 {all -> 0x00fd, blocks: (B:27:0x00d0, B:29:0x00d6, B:41:0x0157, B:32:0x0100, B:34:0x0104, B:35:0x0123, B:37:0x0127, B:38:0x013f, B:40:0x0143, B:42:0x015c, B:43:0x0161), top: B:62:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // t80.n
    public Object a(InitChallengeArgs initChallengeArgs, Continuation<? super m> continuation) {
        a aVar;
        j jVar;
        k kVar;
        c.Config config;
        j jVar2;
        Object obj;
        Object objB;
        InitChallengeArgs initChallengeArgs2;
        InitChallengeArgs initChallengeArgs3;
        d dVar;
        Object end;
        Object obj2 = "getEncoded(...)";
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f54036u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f54036u = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f54034s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f54036u;
        if (i12 == 0) {
            t.b(objA);
            this.logger.b("Make initial challenge request.");
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                t80.b bVar = this.acsDataParser;
                t80.o oVar = this.jwsValidator;
                String acsSignedContent = initChallengeArgs.getChallengeParameters().getAcsSignedContent();
                try {
                    if (acsSignedContent == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    AcsData acsDataA = bVar.a(oVar.a(acsSignedContent));
                    String acsUrl = acsDataA.getAcsUrl();
                    ECPublicKey acsEphemPubKey = acsDataA.getAcsEphemPubKey();
                    ChallengeRequestData challengeRequestDataB = b(this.sdkTransactionId, initChallengeArgs.getChallengeParameters());
                    k kVarA = this.errorRequestExecutorFactory.a(acsUrl, this.errorReporter);
                    com.stripe.android.stripe3ds2.security.k kVar2 = this.messageTransformer;
                    String sdkReferenceNumber = initChallengeArgs.getSdkReferenceNumber();
                    byte[] encoded = initChallengeArgs.getSdkKeyPair().getPrivate().getEncoded();
                    s.j(encoded, "getEncoded(...)");
                    byte[] encoded2 = acsEphemPubKey.getEncoded();
                    s.j(encoded2, "getEncoded(...)");
                    c.Config config2 = new c.Config(kVar2, sdkReferenceNumber, challengeRequestDataB, acsUrl, new c.Config.Keys(encoded, encoded2));
                    e eVar = this.challengeRequestResultRepository;
                    aVar.f54029n = this;
                    InitChallengeArgs initChallengeArgs4 = initChallengeArgs;
                    aVar.f54030o = initChallengeArgs4;
                    aVar.f54031p = this;
                    aVar.f54032q = kVarA;
                    aVar.f54033r = config2;
                    aVar.f54036u = 1;
                    objA = eVar.a(config2, challengeRequestDataB, aVar);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar = this;
                    kVar = kVarA;
                    config = config2;
                    jVar2 = jVar;
                    initChallengeArgs3 = initChallengeArgs4;
                    dVar = (d) objA;
                    if (dVar instanceof d.Success) {
                        end = new m.Start(new ChallengeViewArgs(((d.Success) dVar).getCresData(), ((d.Success) dVar).getCreqData(), jVar2.uiCustomization, config, new p.b(config), initChallengeArgs3.getTimeoutMins(), initChallengeArgs3.getIntentData()));
                    } else if (dVar instanceof d.ProtocolError) {
                        kVar.a(((d.ProtocolError) dVar).getData());
                        end = new m.End(new h.ProtocolError(((d.ProtocolError) dVar).getData(), null, initChallengeArgs3.getIntentData()));
                    } else if (dVar instanceof d.Timeout) {
                        kVar.a(((d.Timeout) dVar).getData());
                        end = new m.End(new h.Timeout(null, null, initChallengeArgs3.getIntentData()));
                    } else {
                        if (dVar instanceof d.RuntimeError) {
                            throw new NoWhenBranchMatchedException();
                        }
                        end = new m.End(new h.RuntimeError(((d.RuntimeError) dVar).getThrowable(), null, initChallengeArgs3.getIntentData()));
                    }
                    objB = jn0.s.b(end);
                    initChallengeArgs2 = initChallengeArgs3;
                } catch (Throwable th2) {
                    th = th2;
                    jVar = this;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = initChallengeArgs;
            }
            jVar = this;
            obj = obj2;
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th));
            initChallengeArgs2 = obj;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.Config config3 = (c.Config) aVar.f54033r;
            kVar = (k) aVar.f54032q;
            jVar2 = (j) aVar.f54031p;
            InitChallengeArgs initChallengeArgs5 = (InitChallengeArgs) aVar.f54030o;
            jVar = (j) aVar.f54029n;
            try {
                t.b(objA);
                config = config3;
                initChallengeArgs3 = initChallengeArgs5;
                try {
                    dVar = (d) objA;
                    if (dVar instanceof d.Success) {
                        end = new m.Start(new ChallengeViewArgs(((d.Success) dVar).getCresData(), ((d.Success) dVar).getCreqData(), jVar2.uiCustomization, config, new p.b(config), initChallengeArgs3.getTimeoutMins(), initChallengeArgs3.getIntentData()));
                    } else if (dVar instanceof d.ProtocolError) {
                        kVar.a(((d.ProtocolError) dVar).getData());
                        end = new m.End(new h.ProtocolError(((d.ProtocolError) dVar).getData(), null, initChallengeArgs3.getIntentData()));
                    } else if (dVar instanceof d.Timeout) {
                        kVar.a(((d.Timeout) dVar).getData());
                        end = new m.End(new h.Timeout(null, null, initChallengeArgs3.getIntentData()));
                    } else {
                        if (dVar instanceof d.RuntimeError) {
                            throw new NoWhenBranchMatchedException();
                        }
                        end = new m.End(new h.RuntimeError(((d.RuntimeError) dVar).getThrowable(), null, initChallengeArgs3.getIntentData()));
                    }
                    objB = jn0.s.b(end);
                    initChallengeArgs2 = initChallengeArgs3;
                } catch (Throwable th4) {
                    th = th4;
                    obj = initChallengeArgs3;
                    jn0.s.Companion companion3 = jn0.s.INSTANCE;
                    objB = jn0.s.b(t.a(th));
                    initChallengeArgs2 = obj;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = initChallengeArgs5;
            }
        }
        Throwable thE = jn0.s.e(objB);
        if (thE == null) {
            return objB;
        }
        jVar.errorReporter.Y0(thE);
        jVar.logger.a("Exception during initial challenge request.", thE);
        return new m.End(new h.RuntimeError(thE, null, initChallengeArgs2.getIntentData()));
    }
}
