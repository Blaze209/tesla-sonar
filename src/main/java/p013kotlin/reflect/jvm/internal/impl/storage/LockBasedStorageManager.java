package p013kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import jn0.h0;
import p013kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SimpleLock f88827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExceptionHandlingStrategy f88828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f88829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f88826d = t.B1(LockBasedStorageManager.class.getCanonicalName(), ".", "");
    public static final StorageManager NO_LOCKS = new a("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE);

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new a();

        static class a implements ExceptionHandlingStrategy {
            a() {
            }

            private static /* synthetic */ void a(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            public RuntimeException handleException(Throwable th2) {
                if (th2 == null) {
                    a(0);
                }
                throw ExceptionUtilsKt.rethrow(th2);
            }
        }

        RuntimeException handleException(Throwable th2);
    }

    static class a extends LockBasedStorageManager {
        a(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
            super(str, exceptionHandlingStrategy, simpleLock, null);
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i11 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        protected <K, V> n<V> e(String str, K k11) {
            if (str == null) {
                a(0);
            }
            n<V> nVarA = n.a();
            if (nVarA == null) {
                a(1);
            }
            return nVarA;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends i<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f88830d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LockBasedStorageManager lockBasedStorageManager, wn0.a aVar, Object obj) {
            super(lockBasedStorageManager, aVar);
            this.f88830d = obj;
        }

        private static /* synthetic */ void a(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        protected n<T> c(boolean z11) {
            n<T> nVarD = n.d(this.f88830d);
            if (nVarD == null) {
                a(0);
            }
            return nVarD;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> extends j<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l f88832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l f88833f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LockBasedStorageManager lockBasedStorageManager, wn0.a aVar, wn0.l lVar, wn0.l lVar2) {
            super(lockBasedStorageManager, aVar);
            this.f88832e = lVar;
            this.f88833f = lVar2;
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i11 != 2 ? 2 : 3];
            if (i11 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i11 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i11 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        protected n<T> c(boolean z11) {
            wn0.l lVar = this.f88832e;
            if (lVar == null) {
                n<T> nVarC = super.c(z11);
                if (nVarC == null) {
                    a(0);
                }
                return nVarC;
            }
            n<T> nVarD = n.d(lVar.invoke(Boolean.valueOf(z11)));
            if (nVarD == null) {
                a(1);
            }
            return nVarD;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h
        protected void e(T t11) {
            if (t11 == null) {
                a(2);
            }
            this.f88833f.invoke(t11);
        }
    }

    private static class d<K, V> extends e<K, V> implements CacheWithNotNullValues<K, V> {
        /* synthetic */ d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "computation";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i11 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.e, p013kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        public V computeIfAbsent(K k11, wn0.a<? extends V> aVar) {
            if (aVar == null) {
                a(2);
            }
            V v11 = (V) super.computeIfAbsent(k11, aVar);
            if (v11 == null) {
                a(3);
            }
            return v11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, null);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
        }
    }

    private static class e<K, V> extends k<f<K, V>, V> implements CacheWithNullableValues<K, V> {

        class a implements wn0.l<f<K, V>, V> {
            a() {
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public V invoke(f<K, V> fVar) {
                return (V) ((f) fVar).f88836b.invoke();
            }
        }

        /* synthetic */ e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            this(lockBasedStorageManager, concurrentMap);
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i11 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V computeIfAbsent(K k11, wn0.a<? extends V> aVar) {
            if (aVar == null) {
                a(2);
            }
            return invoke(new f(k11, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<f<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new a());
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
        }
    }

    private static class f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f88835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.a<? extends V> f88836b;

        public f(K k11, wn0.a<? extends V> aVar) {
            this.f88835a = k11;
            this.f88836b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f88835a.equals(((f) obj).f88835a);
        }

        public int hashCode() {
            return this.f88835a.hashCode();
        }
    }

    private static class g<T> implements NullableLazyValue<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LockBasedStorageManager f88837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final wn0.a<? extends T> f88838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f88839c;

        public g(LockBasedStorageManager lockBasedStorageManager, wn0.a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f88839c = m.NOT_COMPUTED;
            this.f88837a = lockBasedStorageManager;
            this.f88838b = aVar;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 2 || i11 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 3) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 == 2 || i11 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i11 != 2 && i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        protected void b(T t11) {
        }

        protected n<T> c(boolean z11) {
            n<T> nVarE = this.f88837a.e("in a lazy value", null);
            if (nVarE == null) {
                a(2);
            }
            return nVarE;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, wn0.a
        public T invoke() {
            T tInvoke;
            n<T> nVarC;
            Object obj = this.f88839c;
            if (!(obj instanceof m)) {
                return (T) WrappedValues.unescapeThrowable(obj);
            }
            this.f88837a.f88827a.lock();
            try {
                Object obj2 = this.f88839c;
                if (obj2 instanceof m) {
                    m mVar = m.COMPUTING;
                    if (obj2 == mVar) {
                        this.f88839c = m.RECURSION_WAS_DETECTED;
                        n<T> nVarC2 = c(true);
                        if (!nVarC2.c()) {
                            tInvoke = nVarC2.b();
                        } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                            nVarC = c(false);
                            if (nVarC.c()) {
                                this.f88839c = mVar;
                                try {
                                    tInvoke = this.f88838b.invoke();
                                    b(tInvoke);
                                    this.f88839c = tInvoke;
                                } catch (Throwable th2) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                        this.f88839c = m.NOT_COMPUTED;
                                        throw th2;
                                    }
                                    if (this.f88839c == m.COMPUTING) {
                                        this.f88839c = WrappedValues.escapeThrowable(th2);
                                    }
                                    throw this.f88837a.f88828b.handleException(th2);
                                }
                            } else {
                                tInvoke = nVarC.b();
                            }
                        } else {
                            this.f88839c = mVar;
                            tInvoke = this.f88838b.invoke();
                            b(tInvoke);
                            this.f88839c = tInvoke;
                        }
                    } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                        nVarC = c(false);
                        if (nVarC.c()) {
                            tInvoke = nVarC.b();
                        } else {
                            this.f88839c = mVar;
                            tInvoke = this.f88838b.invoke();
                            b(tInvoke);
                            this.f88839c = tInvoke;
                        }
                    } else {
                        this.f88839c = mVar;
                        tInvoke = this.f88838b.invoke();
                        b(tInvoke);
                        this.f88839c = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.unescapeThrowable(obj2);
                }
                this.f88837a.f88827a.unlock();
                return tInvoke;
            } catch (Throwable th3) {
                this.f88837a.f88827a.unlock();
                throw th3;
            }
        }

        public boolean isComputed() {
            return (this.f88839c == m.NOT_COMPUTED || this.f88839c == m.COMPUTING) ? false : true;
        }
    }

    private static abstract class h<T> extends g<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile p013kotlin.reflect.jvm.internal.impl.storage.a<T> f88840d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LockBasedStorageManager lockBasedStorageManager, wn0.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f88840d = null;
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g
        protected final void b(T t11) {
            this.f88840d = new p013kotlin.reflect.jvm.internal.impl.storage.a<>(t11);
            try {
                e(t11);
            } finally {
                this.f88840d = null;
            }
        }

        protected abstract void e(T t11);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, wn0.a
        public T invoke() {
            p013kotlin.reflect.jvm.internal.impl.storage.a<T> aVar = this.f88840d;
            return (aVar == null || !aVar.b()) ? (T) super.invoke() : aVar.a();
        }
    }

    private static class i<T> extends g<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(LockBasedStorageManager lockBasedStorageManager, wn0.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, wn0.a
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                a(2);
            }
            return t11;
        }
    }

    private static abstract class j<T> extends h<T> implements NotNullLazyValue<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LockBasedStorageManager lockBasedStorageManager, wn0.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.h, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.g, p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue, wn0.a
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                a(2);
            }
            return t11;
        }
    }

    private static class k<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LockBasedStorageManager f88841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<K, Object> f88842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wn0.l<? super K, ? extends V> f88843c;

        public k(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, wn0.l<? super K, ? extends V> lVar) {
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
            if (lVar == null) {
                a(2);
            }
            this.f88841a = lockBasedStorageManager;
            this.f88842b = concurrentMap;
            this.f88843c = lVar;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 == 3 || i11 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError b(K k11, Object obj) {
            return (AssertionError) LockBasedStorageManager.f(new AssertionError("Inconsistent key detected. " + m.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k11 + " under " + this.f88841a));
        }

        private AssertionError c(K k11, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.f(new AssertionError("Race condition detected on input " + k11 + ". Old value is " + obj + " under " + this.f88841a));
            if (assertionError == null) {
                a(4);
            }
            return assertionError;
        }

        private AssertionError f(K k11, Throwable th2) {
            return (AssertionError) LockBasedStorageManager.f(new AssertionError("Unable to remove " + k11 + " under " + this.f88841a, th2));
        }

        protected n<V> e(K k11, boolean z11) {
            n<V> nVarE = this.f88841a.e("", k11);
            if (nVarE == null) {
                a(3);
            }
            return nVarE;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x005a, outer: #1 }] */
        @Override // p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, wn0.l
        public V invoke(K k11) {
            AssertionError assertionErrorC;
            V vInvoke;
            Object objPut;
            V vB;
            n<V> nVarE;
            Object obj = this.f88842b.get(k11);
            if (obj != null && obj != m.COMPUTING) {
                return (V) WrappedValues.unescapeExceptionOrNull(obj);
            }
            this.f88841a.f88827a.lock();
            try {
                Object obj2 = this.f88842b.get(k11);
                m mVar = m.COMPUTING;
                if (obj2 == mVar) {
                    obj2 = m.RECURSION_WAS_DETECTED;
                    n<V> nVarE2 = e(k11, true);
                    if (!nVarE2.c()) {
                        vB = nVarE2.b();
                    } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                        nVarE = e(k11, false);
                        if (!nVarE.c()) {
                            vB = nVarE.b();
                        } else {
                            if (obj2 != null) {
                                assertionErrorC = null;
                                try {
                                    this.f88842b.put(k11, mVar);
                                    vInvoke = this.f88843c.invoke(k11);
                                    objPut = this.f88842b.put(k11, WrappedValues.escapeNull(vInvoke));
                                    if (objPut == mVar) {
                                        this.f88841a.f88827a.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorC = c(k11, objPut);
                                    throw assertionErrorC;
                                } catch (Throwable th2) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                        try {
                                            Object objRemove = this.f88842b.remove(k11);
                                            if (objRemove != m.COMPUTING) {
                                                throw b(k11, objRemove);
                                            }
                                            throw th2;
                                        } catch (Throwable th3) {
                                            throw f(k11, th3);
                                        }
                                    }
                                    if (th2 != assertionErrorC) {
                                        Object objPut2 = this.f88842b.put(k11, WrappedValues.escapeThrowable(th2));
                                        if (objPut2 != m.COMPUTING) {
                                            throw c(k11, objPut2);
                                        }
                                        throw this.f88841a.f88828b.handleException(th2);
                                    }
                                    try {
                                        this.f88842b.remove(k11);
                                        throw this.f88841a.f88828b.handleException(th2);
                                    } catch (Throwable th4) {
                                        throw f(k11, th4);
                                    }
                                }
                                this.f88841a.f88827a.unlock();
                                throw th;
                            }
                            vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorC = null;
                            this.f88842b.put(k11, mVar);
                            vInvoke = this.f88843c.invoke(k11);
                            objPut = this.f88842b.put(k11, WrappedValues.escapeNull(vInvoke));
                            if (objPut == mVar) {
                                this.f88841a.f88827a.unlock();
                                return vInvoke;
                            }
                            assertionErrorC = c(k11, objPut);
                            throw assertionErrorC;
                            this.f88841a.f88827a.unlock();
                            throw th;
                        }
                        vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else if (obj2 == m.RECURSION_WAS_DETECTED) {
                    nVarE = e(k11, false);
                    if (!nVarE.c()) {
                        vB = nVarE.b();
                    } else {
                        if (obj2 != null) {
                            assertionErrorC = null;
                            this.f88842b.put(k11, mVar);
                            vInvoke = this.f88843c.invoke(k11);
                            objPut = this.f88842b.put(k11, WrappedValues.escapeNull(vInvoke));
                            if (objPut == mVar) {
                                this.f88841a.f88827a.unlock();
                                return vInvoke;
                            }
                            assertionErrorC = c(k11, objPut);
                            throw assertionErrorC;
                            this.f88841a.f88827a.unlock();
                            throw th;
                        }
                        vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorC = null;
                        this.f88842b.put(k11, mVar);
                        vInvoke = this.f88843c.invoke(k11);
                        objPut = this.f88842b.put(k11, WrappedValues.escapeNull(vInvoke));
                        if (objPut == mVar) {
                            this.f88841a.f88827a.unlock();
                            return vInvoke;
                        }
                        assertionErrorC = c(k11, objPut);
                        throw assertionErrorC;
                        this.f88841a.f88827a.unlock();
                        throw th;
                    }
                    vB = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                }
                this.f88841a.f88827a.unlock();
                return vB;
            } catch (Throwable th5) {
                this.f88841a.f88827a.unlock();
                throw th5;
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k11) {
            Object obj = this.f88842b.get(k11);
            return (obj == null || obj == m.COMPUTING) ? false : true;
        }
    }

    private static class l<K, V> extends k<K, V> implements MemoizedFunctionToNotNull<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, wn0.l<? super K, ? extends V> lVar) {
            super(lockBasedStorageManager, concurrentMap, lVar);
            if (lockBasedStorageManager == null) {
                a(0);
            }
            if (concurrentMap == null) {
                a(1);
            }
            if (lVar == null) {
                a(2);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.k, p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable, wn0.l
        public V invoke(K k11) {
            V v11 = (V) super.invoke(k11);
            if (v11 == null) {
                a(3);
            }
            return v11;
        }
    }

    private enum m {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class n<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f88844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f88845b;

        private n(T t11, boolean z11) {
            this.f88844a = t11;
            this.f88845b = z11;
        }

        public static <T> n<T> a() {
            return new n<>(null, true);
        }

        public static <T> n<T> d(T t11) {
            return new n<>(t11, false);
        }

        public T b() {
            return this.f88844a;
        }

        public boolean c() {
            return this.f88845b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f88844a);
        }
    }

    /* synthetic */ LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock, a aVar) {
        this(str, exceptionHandlingStrategy, simpleLock);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 10 || i11 == 13 || i11 == 20 || i11 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 10 || i11 == 13 || i11 == 20 || i11 == 37) ? 2 : 3];
        if (i11 == 1 || i11 == 3 || i11 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i11 != 6) {
            switch (i11) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i11 == 10 || i11 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i11 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i11 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 10 && i11 != 13 && i11 != 20 && i11 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private static <K> ConcurrentMap<K, Object> d() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T f(T t11) {
        if (t11 == null) {
            a(36);
        }
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = 0;
        while (i11 < length) {
            if (!stackTrace[i11].getClassName().startsWith(f88826d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i11, length);
                t11.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return t11;
            }
            i11++;
        }
        i11 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i11, length);
        t11.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return t11;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(wn0.a<? extends T> aVar) {
        if (aVar == null) {
            a(34);
        }
        this.f88827a.lock();
        try {
            T tInvoke = aVar.invoke();
            this.f88827a.unlock();
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw this.f88828b.handleException(th2);
            } catch (Throwable th3) {
                this.f88827a.unlock();
                throw th3;
            }
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new d(this, d(), null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new e(this, d(), null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createLazyValue(wn0.a<? extends T> aVar) {
        if (aVar == null) {
            a(23);
        }
        return new i(this, aVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(wn0.a<? extends T> aVar, wn0.l<? super Boolean, ? extends T> lVar, wn0.l<? super T, h0> lVar2) {
        if (aVar == null) {
            a(28);
        }
        if (lVar2 == null) {
            a(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(wn0.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            a(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(lVar, d());
        if (memoizedFunctionToNotNullCreateMemoizedFunction == null) {
            a(10);
        }
        return memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(wn0.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            a(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(lVar, d());
        if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues == null) {
            a(20);
        }
        return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NullableLazyValue<T> createNullableLazyValue(wn0.a<? extends T> aVar) {
        if (aVar == null) {
            a(30);
        }
        return new g(this, aVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(wn0.a<? extends T> aVar, T t11) {
        if (aVar == null) {
            a(26);
        }
        if (t11 == null) {
            a(27);
        }
        return new b(this, aVar, t11);
    }

    protected <K, V> n<V> e(String str, K k11) {
        String str2;
        if (str == null) {
            a(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k11 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k11;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) f(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f88829c + ")";
    }

    private LockBasedStorageManager(String str, ExceptionHandlingStrategy exceptionHandlingStrategy, SimpleLock simpleLock) {
        if (str == null) {
            a(4);
        }
        if (exceptionHandlingStrategy == null) {
            a(5);
        }
        if (simpleLock == null) {
            a(6);
        }
        this.f88827a = simpleLock;
        this.f88828b = exceptionHandlingStrategy;
        this.f88829c = str;
    }

    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(wn0.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            a(14);
        }
        if (concurrentMap == null) {
            a(15);
        }
        return new l(this, concurrentMap, lVar);
    }

    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(wn0.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            a(21);
        }
        if (concurrentMap == null) {
            a(22);
        }
        return new k(this, concurrentMap, lVar);
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (wn0.l<InterruptedException, h0>) null);
    }

    public LockBasedStorageManager(String str, Runnable runnable, wn0.l<InterruptedException, h0> lVar) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, lVar));
    }
}
