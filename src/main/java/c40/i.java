package c40;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lc40/i;", "Lc40/o;", "Lc40/e;", "elementsSessionManager", "Lkotlin/Function1;", "", "Ln70/r;", "prefsRepositoryFactory", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lc40/e;Lwn0/l;Lkotlin/coroutines/CoroutineContext;)V", "Lc40/j;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw70/m;", IntegerTokenConverter.CONVERTER_KEY, "selection", "Ljn0/h0;", "g", "(Lw70/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lc40/e;", "Lwn0/l;", "c", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e elementsSessionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, n70.r> prefsRepositoryFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource", f = "CustomerSessionSavedSelectionDataSource.kt", i = {0}, l = {45}, m = "createPrefsRepository", n = {"this"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18690n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f18691o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18693q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18691o = obj;
            this.f18693q |= Integer.MIN_VALUE;
            return i.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "Lw70/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2", f = "CustomerSessionSavedSelectionDataSource.kt", i = {}, l = {18, 19}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super j<w70.m>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f18694n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f18695o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new b(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x006c  */
        /* JADX WARN: Code duplicated, block: B:29:0x006f  */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            j.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18695o;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    i iVar = i.this;
                    this.f18695o = 1;
                    obj = iVar.b(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    t.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (j.Companion) this.f18694n;
                    t.b(obj);
                }
                objB = s.b(companion.b((w70.m) obj));
                Throwable thE = s.e(objB);
                return thE == null ? (j.Success) objB : j.INSTANCE.a(thE, null);
                j jVar = (j) obj;
                if (!(jVar instanceof j.Success)) {
                    if (!(jVar instanceof j.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j.Failure failure = (j.Failure) jVar;
                    return j.INSTANCE.a(failure.getCause(), failure.getDisplayMessage());
                }
                s.Companion companion2 = s.INSTANCE;
                j.Companion companion3 = j.INSTANCE;
                n70.r rVar = (n70.r) ((j.Success) jVar).b();
                this.f18694n = companion3;
                this.f18695o = 2;
                obj = rVar.b(true, false, this);
                if (obj != coroutine_suspended) {
                    companion = companion3;
                    objB = s.b(companion.b((w70.m) obj));
                    Throwable thE2 = s.e(objB);
                    if (thE2 == null) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                s.Companion companion4 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super j<w70.m>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lc40/j;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lc40/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$setSavedSelection$2", f = "CustomerSessionSavedSelectionDataSource.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super j<h0>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f18697n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ w70.m f18699p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w70.m mVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f18699p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return i.this.new c(this.f18699p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f18697n;
            if (i11 == 0) {
                t.b(obj);
                i iVar = i.this;
                this.f18697n = 1;
                obj = iVar.b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            j jVar = (j) obj;
            w70.m mVar = this.f18699p;
            if (!(jVar instanceof j.Success)) {
                if (!(jVar instanceof j.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                j.Failure failure = (j.Failure) jVar;
                return j.INSTANCE.a(failure.getCause(), failure.getDisplayMessage());
            }
            try {
                s.Companion companion = s.INSTANCE;
                j.Companion companion2 = j.INSTANCE;
                if (((n70.r) ((j.Success) jVar).b()).a(mVar)) {
                    objB = s.b(companion2.b(h0.f84049a));
                    Throwable thE = s.e(objB);
                    return thE == null ? (j.Success) objB : j.INSTANCE.a(thE, null);
                }
                throw new IOException("Unable to persist payment option " + mVar);
            } catch (Throwable th2) {
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super j<h0>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public i(e elementsSessionManager, wn0.l<String, n70.r> prefsRepositoryFactory, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(elementsSessionManager, "elementsSessionManager");
        p013kotlin.jvm.internal.s.k(prefsRepositoryFactory, "prefsRepositoryFactory");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.elementsSessionManager = elementsSessionManager;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation<? super j<n70.r>> continuation) {
        a aVar;
        Object objA;
        i iVar;
        Object objB;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f18693q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f18693q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f18691o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f18693q;
        if (i12 == 0) {
            t.b(obj);
            e eVar = this.elementsSessionManager;
            aVar.f18690n = this;
            aVar.f18693q = 1;
            objA = eVar.a(aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            iVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) aVar.f18690n;
            t.b(obj);
            objA = ((s) obj).getValue();
        }
        if (s.h(objA)) {
            try {
                objB = s.b(iVar.prefsRepositoryFactory.invoke(((CachedCustomerEphemeralKey) objA).getCustomerId()));
            } catch (Throwable th2) {
                s.Companion companion = s.INSTANCE;
                objA = t.a(th2);
                objB = s.b(objA);
            }
        } else {
            objB = s.b(objA);
        }
        return k.c(objB);
    }

    @Override // c40.o
    public Object g(w70.m mVar, Continuation<? super j<h0>> continuation) {
        return BuildersKt.withContext(this.workContext, new c(mVar, null), continuation);
    }

    @Override // c40.o
    public Object i(Continuation<? super j<w70.m>> continuation) {
        return BuildersKt.withContext(this.workContext, new b(null), continuation);
    }
}
