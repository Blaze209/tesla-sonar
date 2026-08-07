package com.stripe.android.paymentsheet.flowcontroller;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.y;
import g80.Full;
import g80.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import t70.n;
import w70.j;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001%B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010-R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0011\u00107\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/c;", "", "Lg80/h;", "paymentSheetLoader", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/flowcontroller/f;", "viewModel", "Lt70/n;", "paymentSelectionUpdater", "<init>", "(Lg80/h;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/f;Lt70/n;)V", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "", "initializedViaCompose", "Lcom/stripe/android/paymentsheet/y$k$b;", "callback", "Ljn0/h0;", "f", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;ZLcom/stripe/android/paymentsheet/y$k$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg80/l;", "state", "Lcom/stripe/android/paymentsheet/flowcontroller/c$a;", "configureRequest", "j", "(Lg80/l;Lcom/stripe/android/paymentsheet/flowcontroller/c$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "()V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "e", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;ZLcom/stripe/android/paymentsheet/y$k$b;)V", "a", "Lg80/h;", "b", "Lkotlin/coroutines/CoroutineContext;", "c", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/flowcontroller/f;", "Lt70/n;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Ljava/util/concurrent/atomic/AtomicReference;", "job", "g", "Z", "didLastConfigurationFail", IntegerTokenConverter.CONVERTER_KEY, "()Z", "isConfigured", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h paymentSheetLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext uiContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EventReporter eventReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f viewModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n paymentSelectionUpdater;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Job> job;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean didLastConfigurationFail;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.flowcontroller.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/c$a;", "", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/paymentsheet/y$h;", "configuration", "<init>", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/paymentsheet/y$m;", "()Lcom/stripe/android/paymentsheet/y$m;", "b", "Lcom/stripe/android/paymentsheet/y$h;", "getConfiguration", "()Lcom/stripe/android/paymentsheet/y$h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfigureRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.m initializationMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.Configuration configuration;

        public ConfigureRequest(y.m initializationMode, y.Configuration configuration) {
            s.k(initializationMode, "initializationMode");
            s.k(configuration, "configuration");
            this.initializationMode = initializationMode;
            this.configuration = configuration;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y.m getInitializationMode() {
            return this.initializationMode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfigureRequest)) {
                return false;
            }
            ConfigureRequest configureRequest = (ConfigureRequest) other;
            return s.f(this.initializationMode, configureRequest.initializationMode) && s.f(this.configuration, configureRequest.configuration);
        }

        public int hashCode() {
            return (this.initializationMode.hashCode() * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "ConfigureRequest(initializationMode=" + this.initializationMode + ", configuration=" + this.configuration + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$configure$oldJob$1", f = "FlowControllerConfigurationHandler.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53012n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y.m f53014p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y.Configuration f53015q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f53016r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ y.k.b f53017s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y.m mVar, y.Configuration configuration, boolean z11, y.k.b bVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f53014p = mVar;
            this.f53015q = configuration;
            this.f53016r = z11;
            this.f53017s = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(this.f53014p, this.f53015q, this.f53016r, this.f53017s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53012n;
            if (i11 == 0) {
                t.b(obj);
                c cVar = c.this;
                y.m mVar = this.f53014p;
                y.Configuration configuration = this.f53015q;
                boolean z11 = this.f53016r;
                y.k.b bVar = this.f53017s;
                this.f53012n = 1;
                if (cVar.f(mVar, configuration, z11, bVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.flowcontroller.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler", f = "FlowControllerConfigurationHandler.kt", i = {2, 2, 2, 4, 4}, l = {76, 84, 90, 98, 101, 102, 106}, m = "configureInternal", n = {"this", "callback", "configureRequest", "this", "callback"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C1006c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53018n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53019o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f53020p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f53021q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f53023s;

        C1006c(Continuation<? super C1006c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53021q = obj;
            this.f53023s |= Integer.MIN_VALUE;
            return c.this.f(null, null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$configureInternal$onConfigured$2", f = "FlowControllerConfigurationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53024n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Throwable f53026p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y.k.b f53027q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Throwable th2, y.k.b bVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f53026p = th2;
            this.f53027q = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(this.f53026p, this.f53027q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f53024n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            c.this.didLastConfigurationFail = this.f53026p != null;
            c.this.k();
            y.k.b bVar = this.f53027q;
            Throwable th2 = this.f53026p;
            bVar.a(th2 == null, th2);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler$onInitSuccess$2", f = "FlowControllerConfigurationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53028n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Full f53030p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Full full, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f53030p = full;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(this.f53030p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f53028n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            c.this.viewModel.o(this.f53030p);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(h paymentSheetLoader, CoroutineContext uiContext, EventReporter eventReporter, f viewModel, n paymentSelectionUpdater) {
        s.k(paymentSheetLoader, "paymentSheetLoader");
        s.k(uiContext, "uiContext");
        s.k(eventReporter, "eventReporter");
        s.k(viewModel, "viewModel");
        s.k(paymentSelectionUpdater, "paymentSelectionUpdater");
        this.paymentSheetLoader = paymentSheetLoader;
        this.uiContext = uiContext;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
        this.paymentSelectionUpdater = paymentSelectionUpdater;
        this.job = new AtomicReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (h(r10, r14, null, r4, 4, null) == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (g(r12, r9, r11, r4) == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
    
        if (h(r1, r2, null, r4, 4, null) == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        if (g(r12, r9, r15, r4) == r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        if (g(r10, r14, r0, r4) == r7) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.stripe.android.paymentsheet.y.m r11, com.stripe.android.paymentsheet.y.Configuration r12, boolean r13, com.stripe.android.paymentsheet.y.k.b r14, p013kotlin.coroutines.Continuation<? super jn0.h0> r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.c.f(com.stripe.android.paymentsheet.y$m, com.stripe.android.paymentsheet.y$h, boolean, com.stripe.android.paymentsheet.y$k$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final Object g(c cVar, y.k.b bVar, Throwable th2, Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(cVar.uiContext, cVar.new d(th2, bVar, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    static /* synthetic */ Object h(c cVar, y.k.b bVar, Throwable th2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        return g(cVar, bVar, th2, continuation);
    }

    private final Object j(Full full, ConfigureRequest configureRequest, Continuation<? super h0> continuation) {
        this.eventReporter.t(full.getConfig(), configureRequest.getInitializationMode() instanceof y.m.DeferredIntent);
        f fVar = this.viewModel;
        n nVar = this.paymentSelectionUpdater;
        j paymentSelection = fVar.getPaymentSelection();
        Full fullK = this.viewModel.k();
        fVar.m(nVar.a(paymentSelection, fullK != null ? fullK.getConfig() : null, full));
        Object objWithContext = BuildersKt.withContext(this.uiContext, new e(full, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.job.set(null);
    }

    public final void e(CoroutineScope scope, y.m initializationMode, y.Configuration configuration, boolean initializedViaCompose, y.k.b callback) {
        s.k(scope, "scope");
        s.k(initializationMode, "initializationMode");
        s.k(configuration, "configuration");
        s.k(callback, "callback");
        Job andSet = this.job.getAndSet(BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(initializationMode, configuration, initializedViaCompose, callback, null), 3, null));
        if (andSet != null) {
            Job.DefaultImpls.cancel$default(andSet, (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean i() {
        Job job = this.job.get();
        return ((job != null ? job.isCompleted() ^ true : false) || this.didLastConfigurationFail) ? false : true;
    }
}
