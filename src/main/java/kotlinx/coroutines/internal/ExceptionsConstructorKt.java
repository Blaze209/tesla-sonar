package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.CopyableThrowable;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*(\b\u0002\u0010\u0019\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001a"}, d2 = {"", "E", "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "createConstructor", "(Ljava/lang/Class;)Lwn0/l;", "block", "safeCtor", "(Lwn0/l;)Lwn0/l;", "", "defaultValue", "fieldsCountOrDefault", "(Ljava/lang/Class;I)I", "accumulator", "fieldsCount", "throwableFields", "I", "Lkotlinx/coroutines/internal/CtorCache;", "ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> l<Throwable, Throwable> createConstructor(Class<E> cls) {
        Object next;
        l<Throwable, Throwable> lVar;
        Pair pairA;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new l() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // wn0.l
            public final Void invoke(Throwable th2) {
                return null;
            }
        };
        if (throwableFields == fieldsCountOrDefault(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i11 = 0;
            while (true) {
                next = null;
                if (i11 >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i11];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    pairA = x.a(safeCtor(new l() { // from class: kotlinx.coroutines.internal.e
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, (Throwable) obj);
                        }
                    }), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (s.f(cls2, String.class)) {
                        pairA = x.a(safeCtor(new l() { // from class: kotlinx.coroutines.internal.c
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, (Throwable) obj);
                            }
                        }), 2);
                    } else {
                        pairA = s.f(cls2, Throwable.class) ? x.a(safeCtor(new l() { // from class: kotlinx.coroutines.internal.d
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, (Throwable) obj);
                            }
                        }), 1) : x.a(null, -1);
                    }
                } else if (length2 != 2) {
                    pairA = x.a(null, -1);
                } else {
                    pairA = (s.f(parameterTypes[0], String.class) && s.f(parameterTypes[1], Throwable.class)) ? x.a(safeCtor(new l() { // from class: kotlinx.coroutines.internal.b
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, (Throwable) obj);
                        }
                    }), 3) : x.a(null, -1);
                }
                arrayList.add(pairA);
                i11++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).f()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).f()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair = (Pair) next;
            if (pair != null && (lVar = (l) pair.e()) != null) {
                return lVar;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage(), th2);
        s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2.getMessage());
        s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th2);
        s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(null);
        s.i(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th3 = (Throwable) objNewInstance;
        th3.initCause(th2);
        return th3;
    }

    private static final int fieldsCount(Class<?> cls, int i11) {
        do {
            int i12 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i12++;
                }
            }
            i11 += i12;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i11;
    }

    static /* synthetic */ int fieldsCount$default(Class cls, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return fieldsCount(cls, i11);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i11) {
        Object objB;
        vn0.a.e(cls);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (jn0.s.g(objB)) {
            objB = numValueOf;
        }
        return ((Number) objB).intValue();
    }

    private static final l<Throwable, Throwable> safeCtor(final l<? super Throwable, ? extends Throwable> lVar) {
        return new l() { // from class: kotlinx.coroutines.internal.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ExceptionsConstructorKt.safeCtor$lambda$9(lVar, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable safeCtor$lambda$9(l lVar, Throwable th2) {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Throwable th3 = (Throwable) lVar.invoke(th2);
            if (!s.f(th2.getMessage(), th3.getMessage()) && !s.f(th3.getMessage(), th2.toString())) {
                th3 = null;
            }
            objB = jn0.s.b(th3);
        } catch (Throwable th4) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th4));
        }
        return (Throwable) (jn0.s.g(objB) ? null : objB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e11) {
        Object objB;
        if (!(e11 instanceof CopyableThrowable)) {
            return (E) ctorCache.get(e11.getClass()).invoke(e11);
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(((CopyableThrowable) e11).createCopy());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        return (E) objB;
    }
}
