package gh0;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.UUID;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, d2 = {"Lgh0/a;", "", "Landroid/content/Context;", "applicationContext", "Lkh0/e$a;", "loggerFactory", "Lgh0/f;", "standardIntegrityManagerFactory", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Lkh0/e$a;Lgh0/f;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "cloudProjectNumber", "Ljn0/h0;", "h", "(Ljava/lang/String;)V", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", IntegerTokenConverter.CONVERTER_KEY, "a", "Landroid/content/Context;", "b", "Lkh0/e$a;", "c", "Lgh0/f;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkh0/e;", "e", "Lkh0/e;", "logger", "Lkotlinx/coroutines/sync/Mutex;", "f", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgh0/a$b;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "playIntegrityState", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f68910j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kh0.e.a loggerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f standardIntegrityManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final kh0.e logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<b> playIntegrityState;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lgh0/a$b;", "", "b", "c", "a", DateTokenConverter.CONVERTER_KEY, "Lgh0/a$b$a;", "Lgh0/a$b$b;", "Lgh0/a$b$c;", "Lgh0/a$b$d;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: gh0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgh0/a$b$a;", "Lgh0/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C1408a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1408a f68919a = new C1408a();

            private C1408a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1408a);
            }

            public int hashCode() {
                return 1174409699;
            }

            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: gh0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgh0/a$b$b;", "Lgh0/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C1409b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1409b f68920a = new C1409b();

            private C1409b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1409b);
            }

            public int hashCode() {
                return -384804045;
            }

            public String toString() {
                return "NotStarted";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgh0/a$b$c;", "Lgh0/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f68921a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -230105505;
            }

            public String toString() {
                return "Preparing";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lgh0/a$b$d;", "Lgh0/a$b;", "Lcom/google/android/play/core/integrity/a$c;", "integrityTokenProvider", "<init>", "(Lcom/google/android/play/core/integrity/a$c;)V", "a", "Lcom/google/android/play/core/integrity/a$c;", "()Lcom/google/android/play/core/integrity/a$c;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.google.android.play.core.integrity.a.c integrityTokenProvider;

            public d(com.google.android.play.core.integrity.a.c integrityTokenProvider) {
                s.k(integrityTokenProvider, "integrityTokenProvider");
                this.integrityTokenProvider = integrityTokenProvider;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.google.android.play.core.integrity.a.c getIntegrityTokenProvider() {
                return this.integrityTokenProvider;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2", f = "PlayIntegrityHelper.kt", i = {1}, l = {119, 158}, m = "invokeSuspend", n = {"integrityTokenProvider"}, s = {"L$0"})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68923n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f68924o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f68925p;

        /* JADX INFO: renamed from: gh0.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1410a implements l<com.google.android.play.core.integrity.a.b, h0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<String> f68927a;

            /* JADX WARN: Multi-variable type inference failed */
            C1410a(CancellableContinuation<? super String> cancellableContinuation) {
                this.f68927a = cancellableContinuation;
            }

            public final void a(com.google.android.play.core.integrity.a.b bVar) {
                CancellableContinuation<String> cancellableContinuation = this.f68927a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(bVar.a()));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(com.google.android.play.core.integrity.a.b bVar) {
                a(bVar);
                return h0.f84049a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b implements OnFailureListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f68928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<String> f68929b;

            /* JADX WARN: Multi-variable type inference failed */
            b(a aVar, CancellableContinuation<? super String> cancellableContinuation) {
                this.f68928a = aVar;
                this.f68929b = cancellableContinuation;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                s.k(it, "it");
                this.f68928a.logger.a("integrity:request:" + it.getMessage());
                this.f68929b.resumeWith(jn0.s.b(null));
            }
        }

        /* JADX INFO: renamed from: gh0.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lgh0/a$b;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", f = "PlayIntegrityHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1411c extends SuspendLambda implements q<FlowCollector<? super b>, Throwable, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f68930n;

            C1411c(Continuation<? super C1411c> continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f68930n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                b.C1408a c1408a = b.C1408a.f68919a;
                return h0.f84049a;
            }

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super b> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
                return new C1411c(continuation).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d implements Flow<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f68931a;

            /* JADX INFO: renamed from: gh0.a$c$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C1412a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f68932a;

                /* JADX INFO: renamed from: gh0.a$c$d$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$filter$1$2", f = "PlayIntegrityHelper.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class C1413a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f68933n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f68934o;

                    public C1413a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68933n = obj;
                        this.f68934o |= Integer.MIN_VALUE;
                        return C1412a.this.emit(null, this);
                    }
                }

                public C1412a(FlowCollector flowCollector) {
                    this.f68932a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    C1413a c1413a;
                    if (continuation instanceof C1413a) {
                        c1413a = (C1413a) continuation;
                        int i11 = c1413a.f68934o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c1413a.f68934o = i11 - Integer.MIN_VALUE;
                        } else {
                            c1413a = new C1413a(continuation);
                        }
                    } else {
                        c1413a = new C1413a(continuation);
                    }
                    Object obj2 = c1413a.f68933n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c1413a.f68934o;
                    if (i12 == 0) {
                        t.b(obj2);
                        FlowCollector flowCollector = this.f68932a;
                        b bVar = (b) obj;
                        if ((bVar instanceof b.C1408a) || (bVar instanceof b.d)) {
                            c1413a.f68934o = 1;
                            if (flowCollector.emit(obj, c1413a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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

            public d(Flow flow) {
                this.f68931a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super b> flowCollector, Continuation continuation) {
                Object objCollect = this.f68931a.collect(new C1412a(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e implements Flow<com.google.android.play.core.integrity.a.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f68936a;

            /* JADX INFO: renamed from: gh0.a$c$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C1414a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f68937a;

                /* JADX INFO: renamed from: gh0.a$c$e$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$invokeSuspend$$inlined$map$1$2", f = "PlayIntegrityHelper.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class C1415a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f68938n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f68939o;

                    public C1415a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f68938n = obj;
                        this.f68939o |= Integer.MIN_VALUE;
                        return C1414a.this.emit(null, this);
                    }
                }

                public C1414a(FlowCollector flowCollector) {
                    this.f68937a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    C1415a c1415a;
                    if (continuation instanceof C1415a) {
                        c1415a = (C1415a) continuation;
                        int i11 = c1415a.f68939o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c1415a.f68939o = i11 - Integer.MIN_VALUE;
                        } else {
                            c1415a = new C1415a(continuation);
                        }
                    } else {
                        c1415a = new C1415a(continuation);
                    }
                    Object obj2 = c1415a.f68938n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c1415a.f68939o;
                    if (i12 == 0) {
                        t.b(obj2);
                        FlowCollector flowCollector = this.f68937a;
                        b bVar = (b) obj;
                        b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
                        com.google.android.play.core.integrity.a.c integrityTokenProvider = dVar != null ? dVar.getIntegrityTokenProvider() : null;
                        c1415a.f68939o = 1;
                        if (flowCollector.emit(integrityTokenProvider, c1415a) == coroutine_suspended) {
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

            public e(Flow flow) {
                this.f68936a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super com.google.android.play.core.integrity.a.c> flowCollector, Continuation continuation) {
                Object objCollect = this.f68936a.collect(new C1414a(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f68925p;
            if (i11 == 0) {
                t.b(obj);
                if (a.this.playIntegrityState.getValue() instanceof b.C1409b) {
                    return null;
                }
                e eVar = new e(FlowKt.m548catch(FlowKt.m551timeoutHG0u8IE(new d(a.this.playIntegrityState), a.f68910j), new C1411c(null)));
                this.f68925p = 1;
                obj = FlowKt.firstOrNull(eVar, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            com.google.android.play.core.integrity.a.c cVar = (com.google.android.play.core.integrity.a.c) obj;
            if (cVar == null) {
                return null;
            }
            a aVar = a.this;
            this.f68923n = cVar;
            this.f68924o = aVar;
            this.f68925p = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            cVar.a(com.google.android.play.core.integrity.a.d.a().b(UUID.randomUUID().toString()).a()).addOnSuccessListener(new gh0.b(new C1410a(cancellableContinuationImpl))).addOnFailureListener(new b(aVar, cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1", f = "PlayIntegrityHelper.kt", i = {0, 1, 2, 2, 2, 2, 3, 4}, l = {153, 72, 156, 91, 95}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "standardIntegrityManager", "tokenRequest", "$completion$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$2", "L$3", "L$4", "L$0", "L$0"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68941n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f68942o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f68943p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f68944q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f68945r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f68946s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f68948u;

        /* JADX INFO: renamed from: gh0.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1416a implements l<com.google.android.play.core.integrity.a.c, h0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<jn0.s<? extends com.google.android.play.core.integrity.a.c>> f68949a;

            /* JADX WARN: Multi-variable type inference failed */
            C1416a(CancellableContinuation<? super jn0.s<? extends com.google.android.play.core.integrity.a.c>> cancellableContinuation) {
                this.f68949a = cancellableContinuation;
            }

            public final void a(com.google.android.play.core.integrity.a.c cVar) {
                this.f68949a.resumeWith(jn0.s.b(jn0.s.a(jn0.s.b(cVar))));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(com.google.android.play.core.integrity.a.c cVar) {
                a(cVar);
                return h0.f84049a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b implements OnFailureListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<jn0.s<? extends com.google.android.play.core.integrity.a.c>> f68950a;

            /* JADX WARN: Multi-variable type inference failed */
            b(CancellableContinuation<? super jn0.s<? extends com.google.android.play.core.integrity.a.c>> cancellableContinuation) {
                this.f68950a = cancellableContinuation;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                s.k(it, "it");
                CancellableContinuation<jn0.s<? extends com.google.android.play.core.integrity.a.c>> cancellableContinuation = this.f68950a;
                jn0.s.Companion companion = jn0.s.INSTANCE;
                cancellableContinuation.resumeWith(jn0.s.b(jn0.s.a(jn0.s.b(t.a(it)))));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f68948u = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(this.f68948u, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x011c A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #2 {all -> 0x00a6, blocks: (B:41:0x00c4, B:43:0x011c, B:30:0x0090, B:32:0x00a0, B:37:0x00ac), top: B:64:0x0090 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0122  */
        /* JADX WARN: Code duplicated, block: B:49:0x0131 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:17:0x0040, B:47:0x0125, B:49:0x0131, B:53:0x0151), top: B:63:0x0040 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x014e  */
        /* JADX WARN: Code duplicated, block: B:53:0x0151 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #1 {all -> 0x0045, blocks: (B:17:0x0040, B:47:0x0125, B:49:0x0131, B:53:0x0151), top: B:63:0x0040 }] */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0183, code lost:
        
            if (r14.emit(r1, r13) == r0) goto L55;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:53:0x0151, please report this as an issue */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gh0.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$release$2", f = "PlayIntegrityHelper.kt", i = {0, 1}, l = {153, 144}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68951n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f68952o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f68953p;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            a aVar;
            Mutex mutex2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f68953p;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    mutex = a.this.mutex;
                    aVar = a.this;
                    this.f68951n = mutex;
                    this.f68952o = aVar;
                    this.f68953p = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.f68951n;
                    try {
                        t.b(obj);
                        h0 h0Var = h0.f84049a;
                        mutex2.unlock(null);
                        return h0.f84049a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                aVar = (a) this.f68952o;
                Mutex mutex3 = (Mutex) this.f68951n;
                t.b(obj);
                mutex = mutex3;
                MutableStateFlow mutableStateFlow = aVar.playIntegrityState;
                b.C1409b c1409b = b.C1409b.f68920a;
                this.f68951n = mutex;
                this.f68952o = null;
                this.f68953p = 2;
                if (mutableStateFlow.emit(c1409b, this) != coroutine_suspended) {
                    mutex2 = mutex;
                    h0 h0Var2 = h0.f84049a;
                    mutex2.unlock(null);
                    return h0.f84049a;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                mutex2 = mutex;
                th2 = th4;
                mutex2.unlock(null);
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        io0.b.Companion companion = io0.b.INSTANCE;
        f68910j = io0.d.s(10, io0.e.SECONDS);
    }

    public a(Context applicationContext, kh0.e.a loggerFactory, f standardIntegrityManagerFactory, CoroutineDispatcher dispatcher) {
        s.k(applicationContext, "applicationContext");
        s.k(loggerFactory, "loggerFactory");
        s.k(standardIntegrityManagerFactory, "standardIntegrityManagerFactory");
        s.k(dispatcher, "dispatcher");
        this.applicationContext = applicationContext;
        this.loggerFactory = loggerFactory;
        this.standardIntegrityManagerFactory = standardIntegrityManagerFactory;
        this.dispatcher = dispatcher;
        this.logger = loggerFactory.a("com.withpersona.sdk2.inquiry.integrity");
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.playIntegrityState = StateFlowKt.MutableStateFlow(b.C1409b.f68920a);
    }

    public final Object g(Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new c(null), continuation);
    }

    public final void h(String cloudProjectNumber) {
        s.k(cloudProjectNumber, "cloudProjectNumber");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(cloudProjectNumber, null), 3, null);
    }

    public final Object i(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new e(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }
}
