package fe;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfe/c;", "Lfe/a;", "Lde/a$b;", "<init>", "()V", "event", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lde/a$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "size", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "events", "c", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "list", "Lkotlinx/coroutines/sync/Mutex;", "b", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements fe.a<de.a.Log> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinkedList<de.a.Log> list = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore", f = "LogAnalyticsLocalDataStore.kt", i = {0, 0, 0}, l = {43}, m = "fetchEvents", n = {"this", "$this$withLock_u24default$iv", "size"}, s = {"L$0", "L$1", "I$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65766n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65767o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f65768p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65769q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65771s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65769q = obj;
            this.f65771s |= Integer.MIN_VALUE;
            return c.this.a(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore", f = "LogAnalyticsLocalDataStore.kt", i = {0, 0, 0}, l = {43}, m = "removeEvents", n = {"this", "events", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f65774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65775q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65777s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65775q = obj;
            this.f65777s |= Integer.MIN_VALUE;
            return c.this.c(null, this);
        }
    }

    /* JADX INFO: renamed from: fe.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.local.LogAnalyticsLocalDataStore", f = "LogAnalyticsLocalDataStore.kt", i = {0, 0, 0}, l = {43}, m = "storeEvent", n = {"this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class C1342c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65778n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65779o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f65780p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65781q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65783s;

        C1342c(Continuation<? super C1342c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65781q = obj;
            this.f65783s |= Integer.MIN_VALUE;
            return c.this.b(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe.a
    public Object a(int i11, Continuation<? super List<? extends de.a.Log>> continuation) {
        a aVar;
        c cVar;
        Mutex mutex;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f65771s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f65771s = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f65769q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = aVar.f65771s;
        if (i13 == 0) {
            t.b(obj);
            Mutex mutex2 = this.mutex;
            aVar.f65766n = this;
            aVar.f65767o = mutex2;
            aVar.f65768p = i11;
            aVar.f65771s = 1;
            if (mutex2.lock(null, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
            mutex = mutex2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = aVar.f65768p;
            mutex = (Mutex) aVar.f65767o;
            cVar = (c) aVar.f65766n;
            t.b(obj);
        }
        try {
            return v.e1(cVar.list, i11);
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe.a
    public Object c(List<? extends de.a.Log> list, Continuation<? super h0> continuation) {
        b bVar;
        Mutex mutex;
        c cVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f65777s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f65777s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f65775q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f65777s;
        if (i12 == 0) {
            t.b(obj);
            mutex = this.mutex;
            bVar.f65772n = this;
            bVar.f65773o = list;
            bVar.f65774p = mutex;
            bVar.f65777s = 1;
            if (mutex.lock(null, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) bVar.f65774p;
            List<? extends de.a.Log> list2 = (List) bVar.f65773o;
            cVar = (c) bVar.f65772n;
            t.b(obj);
            mutex = mutex2;
            list = list2;
        }
        try {
            cVar.list.removeAll(v.r1(list));
            return h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object b(de.a.Log log, Continuation<? super h0> continuation) {
        C1342c c1342c;
        Mutex mutex;
        c cVar;
        if (continuation instanceof C1342c) {
            c1342c = (C1342c) continuation;
            int i11 = c1342c.f65783s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1342c.f65783s = i11 - Integer.MIN_VALUE;
            } else {
                c1342c = new C1342c(continuation);
            }
        } else {
            c1342c = new C1342c(continuation);
        }
        Object obj = c1342c.f65781q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1342c.f65783s;
        if (i12 == 0) {
            t.b(obj);
            mutex = this.mutex;
            c1342c.f65778n = this;
            c1342c.f65779o = log;
            c1342c.f65780p = mutex;
            c1342c.f65783s = 1;
            if (mutex.lock(null, c1342c) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c1342c.f65780p;
            de.a.Log log2 = (de.a.Log) c1342c.f65779o;
            cVar = (c) c1342c.f65778n;
            t.b(obj);
            mutex = mutex2;
            log = log2;
        }
        try {
            cVar.list.add(log);
            return h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }
}
