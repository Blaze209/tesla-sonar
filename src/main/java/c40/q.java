package c40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.y;
import java.util.List;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\"H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lc40/q;", "Lc40/e;", "Lf80/b;", "elementsSessionRepository", "Lkotlin/Function1;", "", "Ln70/r;", "prefsRepositoryFactory", "Lcom/stripe/android/customersheet/d$e;", "customerSessionProvider", "Lh70/h;", "errorReporter", "Lkotlin/Function0;", "", "timeProvider", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lf80/b;Lwn0/l;Lcom/stripe/android/customersheet/d$e;Lh70/h;Lwn0/a;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/model/h0;", "elementsSession", "customerSessionClientSecret", "Lc40/d;", "o", "(Lcom/stripe/android/model/h0;Ljava/lang/String;)Lc40/d;", "Ljn0/h0;", "q", "()V", "", "cause", "p", "(Ljava/lang/Throwable;)V", "r", "(Ljava/lang/String;)V", "Ljn0/s;", "Lc40/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lf80/b;", "Lwn0/l;", "c", "Lcom/stripe/android/customersheet/d$e;", DateTokenConverter.CONVERTER_KEY, "Lh70/h;", "e", "Lwn0/a;", "f", "Lkotlin/coroutines/CoroutineContext;", "g", "Lc40/a;", "cachedCustomerEphemeralKey", "Lcom/stripe/android/customersheet/d$f;", "h", "Lcom/stripe/android/customersheet/d$f;", "intentConfiguration", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f80.b elementsSessionRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, n70.r> prefsRepositoryFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.d.e customerSessionProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Long> timeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile CachedCustomerEphemeralKey cachedCustomerEphemeralKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.customersheet.d.f intentConfiguration;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager", f = "CustomerSessionElementsSessionManager.kt", i = {}, l = {48}, m = "fetchCustomerSessionEphemeralKey-IoAF18A", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18718n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18720p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18718n = obj;
            this.f18720p |= Integer.MIN_VALUE;
            Object objA = q.this.a(this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lc40/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager$fetchCustomerSessionEphemeralKey$2", f = "CustomerSessionElementsSessionManager.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super s<? extends CachedCustomerEphemeralKey>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18721n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f18722o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = q.this.new b(continuation);
            bVar.f18722o = obj;
            return bVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends CachedCustomerEphemeralKey>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<CachedCustomerEphemeralKey>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            CachedCustomerEphemeralKey ephemeralKey;
            Object objB2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18721n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    q qVar = q.this;
                    s.Companion companion = s.INSTANCE;
                    ephemeralKey = qVar.cachedCustomerEphemeralKey;
                    if (ephemeralKey == null || ephemeralKey.d(((Number) qVar.timeProvider.invoke()).longValue())) {
                        ephemeralKey = null;
                    }
                    if (ephemeralKey == null) {
                        this.f18721n = 1;
                        objB2 = qVar.b(this);
                        if (objB2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    objB = s.b(ephemeralKey);
                    return s.a(objB);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objB2 = ((s) obj).getValue();
                t.b(objB2);
                ephemeralKey = ((CustomerSessionElementsSession) objB2).getEphemeralKey();
                objB = s.b(ephemeralKey);
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            return s.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<CachedCustomerEphemeralKey>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager", f = "CustomerSessionElementsSessionManager.kt", i = {}, l = {59}, m = "fetchElementsSession-IoAF18A", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f18724n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18726p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18724n = obj;
            this.f18726p |= Integer.MIN_VALUE;
            Object objB = q.this.b(this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lc40/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.DefaultCustomerSessionElementsSessionManager$fetchElementsSession$2", f = "CustomerSessionElementsSessionManager.kt", i = {1, 2, 2, 3}, l = {62, 67, 74, 79}, m = "invokeSuspend", n = {"intentConfiguration", "customerSessionClientSecret", "intentConfiguration", "customerSessionClientSecret"}, s = {"L$1", "L$1", "L$2", "L$1"})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super s<? extends CustomerSessionElementsSession>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18727n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f18728o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f18729p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f18730q;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = q.this.new d(continuation);
            dVar.f18730q = obj;
            return dVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends CustomerSessionElementsSession>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<CustomerSessionElementsSession>>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00df  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e7 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x001e, B:55:0x013a, B:57:0x0140, B:58:0x0146, B:60:0x014c, B:61:0x014f, B:68:0x0174, B:70:0x017a, B:71:0x0184, B:67:0x0170, B:66:0x0165, B:16:0x0042, B:42:0x00e2, B:44:0x00e7, B:47:0x00ed, B:49:0x010e, B:51:0x0115, B:19:0x0053, B:38:0x00b6, B:22:0x0063, B:30:0x0090, B:32:0x0096, B:33:0x009c, B:34:0x00a2, B:25:0x0078, B:27:0x0080, B:63:0x0155), top: B:78:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:49:0x010e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x001e, B:55:0x013a, B:57:0x0140, B:58:0x0146, B:60:0x014c, B:61:0x014f, B:68:0x0174, B:70:0x017a, B:71:0x0184, B:67:0x0170, B:66:0x0165, B:16:0x0042, B:42:0x00e2, B:44:0x00e7, B:47:0x00ed, B:49:0x010e, B:51:0x0115, B:19:0x0053, B:38:0x00b6, B:22:0x0063, B:30:0x0090, B:32:0x0096, B:33:0x009c, B:34:0x00a2, B:25:0x0078, B:27:0x0080, B:63:0x0155), top: B:78:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0114  */
        /* JADX WARN: Code duplicated, block: B:54:0x0138  */
        /* JADX WARN: Code duplicated, block: B:57:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x001e, B:55:0x013a, B:57:0x0140, B:58:0x0146, B:60:0x014c, B:61:0x014f, B:68:0x0174, B:70:0x017a, B:71:0x0184, B:67:0x0170, B:66:0x0165, B:16:0x0042, B:42:0x00e2, B:44:0x00e7, B:47:0x00ed, B:49:0x010e, B:51:0x0115, B:19:0x0053, B:38:0x00b6, B:22:0x0063, B:30:0x0090, B:32:0x0096, B:33:0x009c, B:34:0x00a2, B:25:0x0078, B:27:0x0080, B:63:0x0155), top: B:78:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x014c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x001e, B:55:0x013a, B:57:0x0140, B:58:0x0146, B:60:0x014c, B:61:0x014f, B:68:0x0174, B:70:0x017a, B:71:0x0184, B:67:0x0170, B:66:0x0165, B:16:0x0042, B:42:0x00e2, B:44:0x00e7, B:47:0x00ed, B:49:0x010e, B:51:0x0115, B:19:0x0053, B:38:0x00b6, B:22:0x0063, B:30:0x0090, B:32:0x0096, B:33:0x009c, B:34:0x00a2, B:25:0x0078, B:27:0x0080, B:63:0x0155), top: B:78:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0170 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x001e, B:55:0x013a, B:57:0x0140, B:58:0x0146, B:60:0x014c, B:61:0x014f, B:68:0x0174, B:70:0x017a, B:71:0x0184, B:67:0x0170, B:66:0x0165, B:16:0x0042, B:42:0x00e2, B:44:0x00e7, B:47:0x00ed, B:49:0x010e, B:51:0x0115, B:19:0x0053, B:38:0x00b6, B:22:0x0063, B:30:0x0090, B:32:0x0096, B:33:0x009c, B:34:0x00a2, B:25:0x0078, B:27:0x0080, B:63:0x0155), top: B:78:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x017a A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x001e, B:55:0x013a, B:57:0x0140, B:58:0x0146, B:60:0x014c, B:61:0x014f, B:68:0x0174, B:70:0x017a, B:71:0x0184, B:67:0x0170, B:66:0x0165, B:16:0x0042, B:42:0x00e2, B:44:0x00e7, B:47:0x00ed, B:49:0x010e, B:51:0x0115, B:19:0x0053, B:38:0x00b6, B:22:0x0063, B:30:0x0090, B:32:0x0096, B:33:0x009c, B:34:0x00a2, B:25:0x0078, B:27:0x0080, B:63:0x0155), top: B:78:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            q qVar;
            com.stripe.android.customersheet.d.f fVar;
            Object objA;
            Object objD;
            q qVar2;
            com.stripe.android.customersheet.d.f fVar2;
            com.stripe.android.customersheet.d.CustomerSessionClientSecret customerSessionClientSecret;
            Object objB2;
            q qVar3;
            com.stripe.android.customersheet.d.CustomerSessionClientSecret customerSessionClientSecret2;
            w70.m.PaymentMethod paymentMethod;
            String id2;
            Object objA2;
            com.stripe.android.customersheet.d.CustomerSessionClientSecret customerSessionClientSecret3;
            q qVar4;
            Throwable thE;
            Object objB3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18729p;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    qVar = q.this;
                    s.Companion companion = s.INSTANCE;
                    fVar = qVar.intentConfiguration;
                    if (fVar == null) {
                        com.stripe.android.customersheet.d.e eVar = qVar.customerSessionProvider;
                        this.f18730q = qVar;
                        this.f18729p = 1;
                        objA = eVar.a(this);
                        if (objA == coroutine_suspended) {
                        }
                    } else {
                        com.stripe.android.customersheet.d.e eVar2 = qVar.customerSessionProvider;
                        this.f18730q = qVar;
                        this.f18727n = fVar;
                        this.f18729p = 2;
                        objD = eVar2.d(this);
                        if (objD == coroutine_suspended) {
                            qVar2 = qVar;
                            fVar2 = fVar;
                            t.b(objD);
                            customerSessionClientSecret = (com.stripe.android.customersheet.d.CustomerSessionClientSecret) objD;
                            qVar2.r(customerSessionClientSecret.getClientSecret());
                            n70.r rVar = (n70.r) qVar2.prefsRepositoryFactory.invoke(customerSessionClientSecret.getCustomerId());
                            this.f18730q = qVar2;
                            this.f18727n = customerSessionClientSecret;
                            this.f18728o = fVar2;
                            this.f18729p = 3;
                            objB2 = rVar.b(false, false, this);
                            if (objB2 != coroutine_suspended) {
                                qVar3 = qVar2;
                                customerSessionClientSecret2 = customerSessionClientSecret;
                                if (objB2 instanceof w70.m.PaymentMethod) {
                                    paymentMethod = (w70.m.PaymentMethod) objB2;
                                } else {
                                    paymentMethod = null;
                                }
                                com.stripe.android.customersheet.d.f fVar3 = fVar2;
                                f80.b bVar = qVar3.elementsSessionRepository;
                                y.m.DeferredIntent deferredIntent = new y.m.DeferredIntent(new y.n(new y.n.d.b(null, null, 3, null), fVar3.a(), null, null, false, 28, null));
                                if (paymentMethod != null) {
                                    id2 = paymentMethod.getId();
                                } else {
                                    id2 = null;
                                }
                                y.CustomerConfiguration customerConfigurationA = y.CustomerConfiguration.INSTANCE.a(customerSessionClientSecret2.getCustomerId(), customerSessionClientSecret2.getClientSecret());
                                List<String> listM = v.m();
                                this.f18730q = qVar3;
                                this.f18727n = customerSessionClientSecret2;
                                this.f18728o = null;
                                this.f18729p = 4;
                                objA2 = bVar.a(deferredIntent, customerConfigurationA, listM, id2, this);
                                if (objA2 != coroutine_suspended) {
                                    customerSessionClientSecret3 = customerSessionClientSecret2;
                                    qVar4 = qVar3;
                                    if (s.h(objA2)) {
                                        qVar4.q();
                                    }
                                    thE = s.e(objA2);
                                    if (thE != null) {
                                        qVar4.p(thE);
                                    }
                                    if (s.h(objA2)) {
                                        objB3 = s.b(qVar4.o((ElementsSession) objA2, customerSessionClientSecret3.getClientSecret()));
                                    } else {
                                        objB3 = s.b(objA2);
                                    }
                                    if (s.h(objB3)) {
                                        qVar4.cachedCustomerEphemeralKey = ((CustomerSessionElementsSession) objB3).getEphemeralKey();
                                    }
                                    t.b(objB3);
                                    objB = s.b((CustomerSessionElementsSession) objB3);
                                    return s.a(objB);
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    qVar = (q) this.f18730q;
                    t.b(obj);
                    objA = ((s) obj).getValue();
                } else {
                    if (i11 == 2) {
                        fVar2 = (com.stripe.android.customersheet.d.f) this.f18727n;
                        qVar2 = (q) this.f18730q;
                        t.b(obj);
                        objD = ((s) obj).getValue();
                        t.b(objD);
                        customerSessionClientSecret = (com.stripe.android.customersheet.d.CustomerSessionClientSecret) objD;
                        qVar2.r(customerSessionClientSecret.getClientSecret());
                        n70.r rVar2 = (n70.r) qVar2.prefsRepositoryFactory.invoke(customerSessionClientSecret.getCustomerId());
                        this.f18730q = qVar2;
                        this.f18727n = customerSessionClientSecret;
                        this.f18728o = fVar2;
                        this.f18729p = 3;
                        objB2 = rVar2.b(false, false, this);
                        if (objB2 != coroutine_suspended) {
                            qVar3 = qVar2;
                            customerSessionClientSecret2 = customerSessionClientSecret;
                            if (objB2 instanceof w70.m.PaymentMethod) {
                                paymentMethod = (w70.m.PaymentMethod) objB2;
                            } else {
                                paymentMethod = null;
                            }
                            com.stripe.android.customersheet.d.f fVar4 = fVar2;
                            f80.b bVar2 = qVar3.elementsSessionRepository;
                            y.m.DeferredIntent deferredIntent2 = new y.m.DeferredIntent(new y.n(new y.n.d.b(null, null, 3, null), fVar4.a(), null, null, false, 28, null));
                            if (paymentMethod != null) {
                                id2 = paymentMethod.getId();
                            } else {
                                id2 = null;
                            }
                            y.CustomerConfiguration customerConfigurationA2 = y.CustomerConfiguration.INSTANCE.a(customerSessionClientSecret2.getCustomerId(), customerSessionClientSecret2.getClientSecret());
                            List<String> listM2 = v.m();
                            this.f18730q = qVar3;
                            this.f18727n = customerSessionClientSecret2;
                            this.f18728o = null;
                            this.f18729p = 4;
                            objA2 = bVar2.a(deferredIntent2, customerConfigurationA2, listM2, id2, this);
                            if (objA2 != coroutine_suspended) {
                                customerSessionClientSecret3 = customerSessionClientSecret2;
                                qVar4 = qVar3;
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i11 == 3) {
                        fVar2 = (com.stripe.android.customersheet.d.f) this.f18728o;
                        com.stripe.android.customersheet.d.CustomerSessionClientSecret customerSessionClientSecret4 = (com.stripe.android.customersheet.d.CustomerSessionClientSecret) this.f18727n;
                        q qVar5 = (q) this.f18730q;
                        t.b(obj);
                        objB2 = obj;
                        customerSessionClientSecret2 = customerSessionClientSecret4;
                        qVar3 = qVar5;
                        if (objB2 instanceof w70.m.PaymentMethod) {
                            paymentMethod = (w70.m.PaymentMethod) objB2;
                        } else {
                            paymentMethod = null;
                        }
                        com.stripe.android.customersheet.d.f fVar5 = fVar2;
                        f80.b bVar3 = qVar3.elementsSessionRepository;
                        y.m.DeferredIntent deferredIntent3 = new y.m.DeferredIntent(new y.n(new y.n.d.b(null, null, 3, null), fVar5.a(), null, null, false, 28, null));
                        if (paymentMethod != null) {
                            id2 = paymentMethod.getId();
                        } else {
                            id2 = null;
                        }
                        y.CustomerConfiguration customerConfigurationA3 = y.CustomerConfiguration.INSTANCE.a(customerSessionClientSecret2.getCustomerId(), customerSessionClientSecret2.getClientSecret());
                        List<String> listM3 = v.m();
                        this.f18730q = qVar3;
                        this.f18727n = customerSessionClientSecret2;
                        this.f18728o = null;
                        this.f18729p = 4;
                        objA2 = bVar3.a(deferredIntent3, customerConfigurationA3, listM3, id2, this);
                        if (objA2 != coroutine_suspended) {
                            customerSessionClientSecret3 = customerSessionClientSecret2;
                            qVar4 = qVar3;
                        }
                        return coroutine_suspended;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    customerSessionClientSecret3 = (com.stripe.android.customersheet.d.CustomerSessionClientSecret) this.f18727n;
                    qVar4 = (q) this.f18730q;
                    t.b(obj);
                    objA2 = ((s) obj).getValue();
                }
                if (s.h(objA2)) {
                    qVar4.q();
                }
                thE = s.e(objA2);
                if (thE != null) {
                    qVar4.p(thE);
                }
                if (s.h(objA2)) {
                    try {
                        objB3 = s.b(qVar4.o((ElementsSession) objA2, customerSessionClientSecret3.getClientSecret()));
                    } catch (Throwable th2) {
                        s.Companion companion2 = s.INSTANCE;
                        objB3 = s.b(t.a(th2));
                    }
                } else {
                    objB3 = s.b(objA2);
                }
                if (s.h(objB3)) {
                    qVar4.cachedCustomerEphemeralKey = ((CustomerSessionElementsSession) objB3).getEphemeralKey();
                }
                t.b(objB3);
                objB = s.b((CustomerSessionElementsSession) objB3);
                return s.a(objB);
                if (s.h(objA)) {
                    qVar.intentConfiguration = (com.stripe.android.customersheet.d.f) objA;
                }
                t.b(objA);
                fVar = (com.stripe.android.customersheet.d.f) objA;
                com.stripe.android.customersheet.d.e eVar3 = qVar.customerSessionProvider;
                this.f18730q = qVar;
                this.f18727n = fVar;
                this.f18729p = 2;
                objD = eVar3.d(this);
                if (objD == coroutine_suspended) {
                    qVar2 = qVar;
                    fVar2 = fVar;
                    t.b(objD);
                    customerSessionClientSecret = (com.stripe.android.customersheet.d.CustomerSessionClientSecret) objD;
                    qVar2.r(customerSessionClientSecret.getClientSecret());
                    n70.r rVar3 = (n70.r) qVar2.prefsRepositoryFactory.invoke(customerSessionClientSecret.getCustomerId());
                    this.f18730q = qVar2;
                    this.f18727n = customerSessionClientSecret;
                    this.f18728o = fVar2;
                    this.f18729p = 3;
                    objB2 = rVar3.b(false, false, this);
                    if (objB2 != coroutine_suspended) {
                        qVar3 = qVar2;
                        customerSessionClientSecret2 = customerSessionClientSecret;
                        if (objB2 instanceof w70.m.PaymentMethod) {
                            paymentMethod = (w70.m.PaymentMethod) objB2;
                        } else {
                            paymentMethod = null;
                        }
                        com.stripe.android.customersheet.d.f fVar6 = fVar2;
                        f80.b bVar4 = qVar3.elementsSessionRepository;
                        y.m.DeferredIntent deferredIntent4 = new y.m.DeferredIntent(new y.n(new y.n.d.b(null, null, 3, null), fVar6.a(), null, null, false, 28, null));
                        if (paymentMethod != null) {
                            id2 = paymentMethod.getId();
                        } else {
                            id2 = null;
                        }
                        y.CustomerConfiguration customerConfigurationA4 = y.CustomerConfiguration.INSTANCE.a(customerSessionClientSecret2.getCustomerId(), customerSessionClientSecret2.getClientSecret());
                        List<String> listM4 = v.m();
                        this.f18730q = qVar3;
                        this.f18727n = customerSessionClientSecret2;
                        this.f18728o = null;
                        this.f18729p = 4;
                        objA2 = bVar4.a(deferredIntent4, customerConfigurationA4, listM4, id2, this);
                        if (objA2 != coroutine_suspended) {
                            customerSessionClientSecret3 = customerSessionClientSecret2;
                            qVar4 = qVar3;
                            if (s.h(objA2)) {
                                qVar4.q();
                            }
                            thE = s.e(objA2);
                            if (thE != null) {
                                qVar4.p(thE);
                            }
                            if (s.h(objA2)) {
                                objB3 = s.b(qVar4.o((ElementsSession) objA2, customerSessionClientSecret3.getClientSecret()));
                            } else {
                                objB3 = s.b(objA2);
                            }
                            if (s.h(objB3)) {
                                qVar4.cachedCustomerEphemeralKey = ((CustomerSessionElementsSession) objB3).getEphemeralKey();
                            }
                            t.b(objB3);
                            objB = s.b((CustomerSessionElementsSession) objB3);
                            return s.a(objB);
                        }
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th3));
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<CustomerSessionElementsSession>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public q(f80.b elementsSessionRepository, wn0.l<String, n70.r> prefsRepositoryFactory, com.stripe.android.customersheet.d.e customerSessionProvider, h70.h errorReporter, wn0.a<Long> timeProvider, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(elementsSessionRepository, "elementsSessionRepository");
        p013kotlin.jvm.internal.s.k(prefsRepositoryFactory, "prefsRepositoryFactory");
        p013kotlin.jvm.internal.s.k(customerSessionProvider, "customerSessionProvider");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(timeProvider, "timeProvider");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.elementsSessionRepository = elementsSessionRepository;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.customerSessionProvider = customerSessionProvider;
        this.errorReporter = errorReporter;
        this.timeProvider = timeProvider;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSessionElementsSession o(ElementsSession elementsSession, String customerSessionClientSecret) {
        ElementsSession.Customer customer = elementsSession.getCustomer();
        if (customer != null) {
            ElementsSession.Customer.Session session = customer.getSession();
            return new CustomerSessionElementsSession(elementsSession, customer, new CachedCustomerEphemeralKey(session.getCustomerId(), customerSessionClientSecret, session.getApiKey(), session.getApiKeyExpiry()));
        }
        h70.h.b.a(this.errorReporter, h70.h.f.CUSTOMER_SESSION_ON_CUSTOMER_SHEET_ELEMENTS_SESSION_NO_CUSTOMER_FIELD, null, null, 6, null);
        throw new IllegalStateException("`customer` field should be available when using `CustomerSession` in elements/session!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Throwable cause) {
        h70.h.b.a(this.errorReporter, h70.h.d.CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_FAILURE, StripeException.INSTANCE.b(cause), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        h70.h.b.a(this.errorReporter, h70.h.e.CUSTOMER_SHEET_CUSTOMER_SESSION_ELEMENTS_SESSION_LOAD_SUCCESS, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String customerSessionClientSecret) {
        String str;
        n30.d.a aVarA = n30.d.f92877a.a(customerSessionClientSecret);
        if (aVarA instanceof n30.a) {
            str = "The provided 'customerSessionClientSecret' cannot be an empty string.";
        } else if (aVarA instanceof n30.b) {
            str = "Provided secret looks like an Ephemeral Key secret, but expecting a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create";
        } else if (aVarA instanceof n30.c) {
            str = "Provided secret does not look like a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create";
        } else {
            if (!(aVarA instanceof n30.d.a.C1983a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str != null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c40.e
    public Object a(Continuation<? super s<CachedCustomerEphemeralKey>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f18720p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f18720p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f18718n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f18720p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            b bVar = new b(null);
            aVar.f18720p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c40.e
    public Object b(Continuation<? super s<CustomerSessionElementsSession>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f18726p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f18726p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.f18724n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f18726p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            d dVar = new d(null);
            cVar.f18726p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, dVar, cVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }
}
