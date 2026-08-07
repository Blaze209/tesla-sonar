package io.ktor.utils.io;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jn0.h0;
import kotlinx.coroutines.CopyableThrowable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0012\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0082\u0010¢\u0006\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016\":\u0010\u001b\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bj\u0002`\t0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a*(\b\u0002\u0010\u001c\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b2\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b¨\u0006\u001d"}, d2 = {"", "E", "exception", "cause", "e", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/reflect/Constructor;", "constructor", "Lkotlin/Function1;", "Lio/ktor/utils/io/Ctor;", "a", "(Ljava/lang/reflect/Constructor;)Lwn0/l;", "Ljava/lang/Class;", "", "defaultValue", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;I)I", "accumulator", "b", "I", "throwableFields", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "Ctor", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f78840a = d(Throwable.class, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f78841b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, wn0.l<Throwable, Throwable>> f78842c = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Constructor f78843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f78843c = constructor;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e11) {
            Object objB;
            p013kotlin.jvm.internal.s.k(e11, "e");
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                Object objNewInstance = this.f78843c.newInstance(e11.getMessage(), e11);
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                objB = jn0.s.b((Throwable) objNewInstance);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            return (Throwable) objB;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Constructor f78844c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f78844c = constructor;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e11) {
            Object objB;
            p013kotlin.jvm.internal.s.k(e11, "e");
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                Object objNewInstance = this.f78844c.newInstance(e11);
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                objB = jn0.s.b((Throwable) objNewInstance);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            return (Throwable) objB;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Constructor f78845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f78845c = constructor;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e11) {
            Object objB;
            p013kotlin.jvm.internal.s.k(e11, "e");
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                Object objNewInstance = this.f78845c.newInstance(e11.getMessage());
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) objNewInstance;
                th2.initCause(e11);
                objB = jn0.s.b(th2);
            } catch (Throwable th3) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th3));
            }
            if (jn0.s.g(objB)) {
                objB = null;
            }
            return (Throwable) objB;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, Throwable> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Constructor f78846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f78846c = constructor;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e11) {
            Object objB;
            p013kotlin.jvm.internal.s.k(e11, "e");
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                Object objNewInstance = this.f78846c.newInstance(null);
                p013kotlin.jvm.internal.s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) objNewInstance;
                th2.initCause(e11);
                objB = jn0.s.b(th2);
            } catch (Throwable th3) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th3));
            }
            return (Throwable) (jn0.s.g(objB) ? null : objB);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(((Constructor) t12).getParameterTypes().length), Integer.valueOf(((Constructor) t11).getParameterTypes().length));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f78847c = new f();

        f() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f78848c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return null;
        }
    }

    private static final wn0.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && p013kotlin.jvm.internal.s.f(parameterTypes[0], String.class) && p013kotlin.jvm.internal.s.f(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (p013kotlin.jvm.internal.s.f(cls, Throwable.class)) {
            return new b(constructor);
        }
        if (p013kotlin.jvm.internal.s.f(cls, String.class)) {
            return new c(constructor);
        }
        return null;
    }

    private static final int b(Class<?> cls, int i11) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            p013kotlin.jvm.internal.s.j(declaredFields, "declaredFields");
            int i12 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i12++;
                }
            }
            i11 += i12;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i11;
    }

    static /* synthetic */ int c(Class cls, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return b(cls, i11);
    }

    private static final int d(Class<?> cls, int i11) {
        Object objB;
        vn0.a.e(cls);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (jn0.s.g(objB)) {
            objB = numValueOf;
        }
        return ((Number) objB).intValue();
    }

    public static final <E extends Throwable> E e(E exception, Throwable cause) {
        Object objB;
        p013kotlin.jvm.internal.s.k(exception, "exception");
        p013kotlin.jvm.internal.s.k(cause, "cause");
        if (exception instanceof CopyableThrowable) {
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                objB = jn0.s.b(((CopyableThrowable) exception).createCopy());
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            return (E) (jn0.s.g(objB) ? null : objB);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f78841b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            wn0.l<Throwable, Throwable> lVar = f78842c.get(exception.getClass());
            lock.unlock();
            if (lVar != null) {
                return (E) lVar.invoke(exception);
            }
            int i11 = 0;
            if (f78840a != d(exception.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i12 = 0; i12 < readHoldCount; i12++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f78842c.put((Class<? extends Throwable>) exception.getClass(), f.f78847c);
                    h0 h0Var = h0.f84049a;
                    while (i11 < readHoldCount) {
                        lock2.lock();
                        i11++;
                    }
                    return null;
                } finally {
                    while (i11 < readHoldCount) {
                        lock2.lock();
                        i11++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            p013kotlin.jvm.internal.s.j(constructors, "exception.javaClass.constructors");
            wn0.l<Throwable, Throwable> lVarA = null;
            for (Constructor constructor : p013kotlin.collections.n.k1(constructors, new e())) {
                p013kotlin.jvm.internal.s.j(constructor, "constructor");
                lVarA = a(constructor);
                if (lVarA != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f78841b;
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock2.readLock();
            int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i13 = 0; i13 < readHoldCount2; i13++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            try {
                f78842c.put((Class<? extends Throwable>) exception.getClass(), lVarA == null ? g.f78848c : lVarA);
                h0 h0Var2 = h0.f84049a;
                while (i11 < readHoldCount2) {
                    lock3.lock();
                    i11++;
                }
                writeLock2.unlock();
                if (lVarA != null) {
                    return (E) lVarA.invoke(cause);
                }
                return null;
            } catch (Throwable th3) {
                while (i11 < readHoldCount2) {
                    lock3.lock();
                    i11++;
                }
                writeLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            lock.unlock();
            throw th4;
        }
    }
}
