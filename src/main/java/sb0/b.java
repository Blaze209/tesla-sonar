package sb0;

import android.view.Choreographer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020&0*8\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b'\u0010,R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0016\u00107\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010<¨\u0006>"}, d2 = {"Lsb0/b;", "Landroid/view/Choreographer$FrameCallback;", "Lsb0/a;", "cache", "", "toleranceMicroSecond", "<init>", "(Lsb0/a;J)V", "Ljn0/h0;", "j", "()V", "k", "", "ptsUs", "g", "(D)V", "", "", "raw", "f", "(DLjava/util/List;)V", "h", "frameTimeNanos", "doFrame", "(J)V", "a", "Lsb0/a;", "b", "J", "Lkotlinx/coroutines/CompletableJob;", "c", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlinx/coroutines/CoroutineScope;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lsb0/c;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_metadata", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", OrcaKeys.METADATA, "", "Z", "getHasReceivedSEIData", "()Z", IntegerTokenConverter.CONVERTER_KEY, "(Z)V", "hasReceivedSEIData", "D", "lastPtsUs", "isRunning", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "cacheMutex", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "frameJob", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sb0.a cache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long toleranceMicroSecond;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CompletableJob job;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<SEIMetadataProcessed> _metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<SEIMetadataProcessed> metadata;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile boolean hasReceivedSEIData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile double lastPtsUs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isRunning;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Mutex cacheMutex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Job frameJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$doFrame$1", f = "SEIFrameClock.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 103, 107, 112}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110992n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110993o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f110994p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f110995q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ double f110997s;

        /* JADX INFO: renamed from: sb0.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$doFrame$1$1", f = "SEIFrameClock.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2361a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f110998n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f110999o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2361a(b bVar, Continuation<? super C2361a> continuation) {
                super(2, continuation);
                this.f110999o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2361a(this.f110999o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f110998n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f110999o._metadata.setValue(SEIMetadataProcessed.INSTANCE.a());
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2361a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX INFO: renamed from: sb0.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$doFrame$1$2", f = "SEIFrameClock.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2362b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f111000n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f111001o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ SEIMetadataProcessed f111002p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2362b(b bVar, SEIMetadataProcessed sEIMetadataProcessed, Continuation<? super C2362b> continuation) {
                super(2, continuation);
                this.f111001o = bVar;
                this.f111002p = sEIMetadataProcessed;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new C2362b(this.f111001o, this.f111002p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f111000n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f111001o._metadata.setValue(this.f111002p);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2362b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f110997s = d11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f110997s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r11, r1, r10) == r0) goto L35;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sb0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: sb0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$insertSei$1", f = "SEIFrameClock.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 72}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    static final class C2363b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111003n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111004o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f111005p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        double f111006q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f111007r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ double f111009t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ List<Byte> f111010u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2363b(double d11, List<Byte> list, Continuation<? super C2363b> continuation) {
            super(2, continuation);
            this.f111009t = d11;
            this.f111010u = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new C2363b(this.f111009t, this.f111010u, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            b bVar;
            double d11;
            List<Byte> list;
            Mutex mutex2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f111007r;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    mutex = b.this.cacheMutex;
                    bVar = b.this;
                    d11 = this.f111009t;
                    list = this.f111010u;
                    this.f111003n = mutex;
                    this.f111004o = bVar;
                    this.f111005p = list;
                    this.f111006q = d11;
                    this.f111007r = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.f111003n;
                    try {
                        t.b(obj);
                        h0 h0Var = h0.f84049a;
                        mutex2.unlock(null);
                        b.this.i(true);
                        return h0.f84049a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                d11 = this.f111006q;
                list = (List) this.f111005p;
                bVar = (b) this.f111004o;
                Mutex mutex3 = (Mutex) this.f111003n;
                t.b(obj);
                mutex = mutex3;
                sb0.a aVar = bVar.cache;
                this.f111003n = mutex;
                this.f111004o = null;
                this.f111005p = null;
                this.f111007r = 2;
                if (aVar.d(d11, list, this) != coroutine_suspended) {
                    mutex2 = mutex;
                    h0 h0Var2 = h0.f84049a;
                    mutex2.unlock(null);
                    b.this.i(true);
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
            return ((C2363b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$resetForNewClip$1", f = "SEIFrameClock.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 84, 87}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111011n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111012o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f111013p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$resetForNewClip$1$2", f = "SEIFrameClock.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f111015n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ b f111016o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f111016o = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f111016o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f111015n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.f111016o._metadata.setValue(SEIMetadataProcessed.INSTANCE.a());
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L26;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f111013p
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L36
                if (r1 == r4) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                jn0.t.b(r7)
                goto L85
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f111011n
                kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
                jn0.t.b(r7)     // Catch: java.lang.Throwable -> L27
                goto L60
            L27:
                r7 = move-exception
                goto L8b
            L29:
                java.lang.Object r1 = r6.f111012o
                sb0.b r1 = (sb0.b) r1
                java.lang.Object r4 = r6.f111011n
                kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
                jn0.t.b(r7)
                r7 = r4
                goto L4e
            L36:
                jn0.t.b(r7)
                sb0.b r7 = sb0.b.this
                kotlinx.coroutines.sync.Mutex r7 = sb0.b.b(r7)
                sb0.b r1 = sb0.b.this
                r6.f111011n = r7
                r6.f111012o = r1
                r6.f111013p = r4
                java.lang.Object r4 = r7.lock(r5, r6)
                if (r4 != r0) goto L4e
                goto L84
            L4e:
                sb0.a r1 = sb0.b.a(r1)     // Catch: java.lang.Throwable -> L88
                r6.f111011n = r7     // Catch: java.lang.Throwable -> L88
                r6.f111012o = r5     // Catch: java.lang.Throwable -> L88
                r6.f111013p = r3     // Catch: java.lang.Throwable -> L88
                java.lang.Object r1 = r1.b(r6)     // Catch: java.lang.Throwable -> L88
                if (r1 != r0) goto L5f
                goto L84
            L5f:
                r1 = r7
            L60:
                jn0.h0 r7 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L27
                r1.unlock(r5)
                sb0.b r7 = sb0.b.this
                r1 = 0
                r7.i(r1)
                kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
                kotlinx.coroutines.MainCoroutineDispatcher r7 = r7.getImmediate()
                sb0.b$c$a r1 = new sb0.b$c$a
                sb0.b r3 = sb0.b.this
                r1.<init>(r3, r5)
                r6.f111011n = r5
                r6.f111013p = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
                if (r7 != r0) goto L85
            L84:
                return r0
            L85:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            L88:
                r0 = move-exception
                r1 = r7
                r7 = r0
            L8b:
                r1.unlock(r5)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sb0.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$stop$1", f = "SEIFrameClock.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f111017n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f111017n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            b.this._metadata.setValue(SEIMetadataProcessed.INSTANCE.a());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.SEIFrameClock$stop$2", f = "SEIFrameClock.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 56}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f111019n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f111020o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f111021p;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            b bVar;
            Mutex mutex2;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f111021p;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    mutex = b.this.cacheMutex;
                    bVar = b.this;
                    this.f111019n = mutex;
                    this.f111020o = bVar;
                    this.f111021p = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.f111019n;
                    try {
                        t.b(obj);
                        h0 h0Var = h0.f84049a;
                        mutex2.unlock(null);
                        b.this.i(false);
                        return h0.f84049a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mutex2.unlock(null);
                        throw th2;
                    }
                }
                bVar = (b) this.f111020o;
                Mutex mutex3 = (Mutex) this.f111019n;
                t.b(obj);
                mutex = mutex3;
                sb0.a aVar = bVar.cache;
                this.f111019n = mutex;
                this.f111020o = null;
                this.f111021p = 2;
                if (aVar.b(this) != coroutine_suspended) {
                    mutex2 = mutex;
                    h0 h0Var2 = h0.f84049a;
                    mutex2.unlock(null);
                    b.this.i(false);
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

    public b() {
        this(null, 0L, 3, null);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isRunning) {
            double d11 = this.lastPtsUs;
            Job job = this.frameJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.frameJob = BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getDefault(), null, new a(d11, null), 2, null);
            if (this.isRunning) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    public final StateFlow<SEIMetadataProcessed> e() {
        return this.metadata;
    }

    public final void f(double ptsUs, List<Byte> raw) {
        s.k(raw, "raw");
        if (this.isRunning) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getDefault(), null, new C2363b(ptsUs, raw, null), 2, null);
        }
    }

    public final void g(double ptsUs) {
        this.lastPtsUs = ptsUs;
    }

    public final void h() {
        if (this.isRunning) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getDefault(), null, new c(null), 2, null);
        }
    }

    public final void i(boolean z11) {
        this.hasReceivedSEIData = z11;
    }

    public final void j() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        Choreographer.getInstance().postFrameCallback(this);
    }

    public final void k() {
        if (this.isRunning) {
            this.isRunning = false;
            Choreographer.getInstance().removeFrameCallback(this);
            Job job = this.frameJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.frameJob = null;
            BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getMain().getImmediate(), null, new d(null), 2, null);
            BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getDefault(), null, new e(null), 2, null);
        }
    }

    public b(sb0.a cache, long j11) {
        s.k(cache, "cache");
        this.cache = cache;
        this.toleranceMicroSecond = j11;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.job = completableJobSupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(Dispatchers.getMain().getImmediate()));
        MutableStateFlow<SEIMetadataProcessed> MutableStateFlow = StateFlowKt.MutableStateFlow(SEIMetadataProcessed.INSTANCE.a());
        this._metadata = MutableStateFlow;
        this.metadata = FlowKt.asStateFlow(MutableStateFlow);
        this.cacheMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public /* synthetic */ b(sb0.a aVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new sb0.a(0, 1, null) : aVar, (i11 & 2) != 0 ? 1000000L : j11);
    }
}
