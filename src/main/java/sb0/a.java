package sb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006!"}, d2 = {"Lsb0/a;", "", "", "capacity", "<init>", "(I)V", "", "ptsUs", "", "", "data", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(DLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetUs", "Lkotlin/Pair;", "c", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "I", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "getLogger", "()Lcom/tesla/logging/g;", "logger", "sb0/a$d", "Lsb0/a$d;", "map", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d map;

    /* JADX INFO: renamed from: sb0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.LRUCacheSEI", f = "LRUCacheSEI.kt", i = {0, 0}, l = {43}, m = "clear", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    static final class C2360a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110962n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110963o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f110964p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f110966r;

        C2360a(Continuation<? super C2360a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110964p = obj;
            this.f110966r |= Integer.MIN_VALUE;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.LRUCacheSEI", f = "LRUCacheSEI.kt", i = {0, 0, 0}, l = {43}, m = "getNearestLessOrEqual", n = {"this", "$this$withLock_u24default$iv", "targetUs"}, s = {"L$0", "L$1", "D$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110967n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110968o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f110969p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f110970q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f110972s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110970q = obj;
            this.f110972s |= Integer.MIN_VALUE;
            return a.this.c(0.0d, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.dashcam_viewer.sei.LRUCacheSEI", f = "LRUCacheSEI.kt", i = {0, 0, 0, 0}, l = {43}, m = "insert", n = {"this", "data", "$this$withLock_u24default$iv", "ptsUs"}, s = {"L$0", "L$1", "L$2", "D$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f110973n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f110974o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f110975p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        double f110976q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f110977r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f110979t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110977r = obj;
            this.f110979t |= Integer.MIN_VALUE;
            return a.this.d(0.0d, null, this);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001J+\u0010\b\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"sb0/a$d", "Ljava/util/LinkedHashMap;", "", "", "", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends LinkedHashMap<Double, List<? extends Byte>> {
        d(int i11) {
            super(i11, 0.75f, true);
        }

        public /* bridge */ boolean b(Double d11) {
            return super.containsKey(d11);
        }

        public /* bridge */ boolean c(List<Byte> list) {
            return super.containsValue(list);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof Double) {
                return b((Double) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof List) {
                return c((List) obj);
            }
            return false;
        }

        public /* bridge */ List<Byte> d(Double d11) {
            return (List) super.get(d11);
        }

        public /* bridge */ Set<Map.Entry<Double, List<Byte>>> e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Double, List<Byte>>> entrySet() {
            return e();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof Double) {
                return d((Double) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Double) ? obj2 : i((Double) obj, (List) obj2);
        }

        public /* bridge */ Set<Double> h() {
            return super.keySet();
        }

        public /* bridge */ List<Byte> i(Double d11, List<Byte> list) {
            return (List) super.getOrDefault(d11, list);
        }

        public /* bridge */ int j() {
            return super.size();
        }

        public /* bridge */ Collection<List<Byte>> k() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Double> keySet() {
            return h();
        }

        public /* bridge */ List<Byte> l(Double d11) {
            return (List) super.remove(d11);
        }

        public /* bridge */ boolean m(Double d11, List<Byte> list) {
            return super.remove(d11, list);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof Double) {
                return l((Double) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Double, List<? extends Byte>> eldest) {
            return size() > a.this.capacity;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return j();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<List<Byte>> values() {
            return k();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Double) && (obj2 instanceof List)) {
                return m((Double) obj, (List) obj2);
            }
            return false;
        }
    }

    public a() {
        this(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Continuation<? super h0> continuation) {
        C2360a c2360a;
        a aVar;
        Mutex mutex;
        if (continuation instanceof C2360a) {
            c2360a = (C2360a) continuation;
            int i11 = c2360a.f110966r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2360a.f110966r = i11 - Integer.MIN_VALUE;
            } else {
                c2360a = new C2360a(continuation);
            }
        } else {
            c2360a = new C2360a(continuation);
        }
        Object obj = c2360a.f110964p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c2360a.f110966r;
        if (i12 == 0) {
            t.b(obj);
            Mutex mutex2 = this.mutex;
            c2360a.f110962n = this;
            c2360a.f110963o = mutex2;
            c2360a.f110966r = 1;
            if (mutex2.lock(null, c2360a) == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
            mutex = mutex2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c2360a.f110963o;
            aVar = (a) c2360a.f110962n;
            t.b(obj);
        }
        try {
            aVar.map.clear();
            return h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(double d11, Continuation<? super Pair<Double, ? extends List<Byte>>> continuation) {
        b bVar;
        a aVar;
        Mutex mutex;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f110972s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f110972s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f110970q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f110972s;
        if (i12 == 0) {
            t.b(obj);
            Mutex mutex2 = this.mutex;
            bVar.f110967n = this;
            bVar.f110968o = mutex2;
            bVar.f110969p = d11;
            bVar.f110972s = 1;
            if (mutex2.lock(null, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
            mutex = mutex2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = bVar.f110969p;
            mutex = (Mutex) bVar.f110968o;
            aVar = (a) bVar.f110967n;
            t.b(obj);
        }
        try {
            Set<Double> setKeySet = aVar.map.keySet();
            s.j(setKeySet, "<get-keys>(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                if (((Double) obj2).doubleValue() <= d11) {
                    arrayList.add(obj2);
                }
            }
            Double dF0 = v.F0(arrayList);
            if (dF0 == null) {
                return null;
            }
            Object obj3 = aVar.map.get(dF0);
            s.h(obj3);
            return x.a(dF0, obj3);
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(double d11, List<Byte> list, Continuation<? super h0> continuation) {
        c cVar;
        Mutex mutex;
        a aVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f110979t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f110979t = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f110977r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f110979t;
        if (i12 == 0) {
            t.b(obj);
            mutex = this.mutex;
            cVar.f110973n = this;
            cVar.f110974o = list;
            cVar.f110975p = mutex;
            cVar.f110976q = d11;
            cVar.f110979t = 1;
            if (mutex.lock(null, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = cVar.f110976q;
            Mutex mutex2 = (Mutex) cVar.f110975p;
            List<Byte> list2 = (List) cVar.f110974o;
            aVar = (a) cVar.f110973n;
            t.b(obj);
            mutex = mutex2;
            list = list2;
        }
        try {
            aVar.map.put(Boxing.boxDouble(d11), list);
            return h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }

    public a(int i11) {
        this.capacity = i11;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.logger = g.INSTANCE.a("DashcamViewer_LRUCache");
        this.map = new d(i11);
    }

    public /* synthetic */ a(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1200 : i11);
    }
}
