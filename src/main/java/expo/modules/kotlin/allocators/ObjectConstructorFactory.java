package expo.modules.kotlin.allocators;

import co0.h;
import co0.l;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\r\u0010\tJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/allocators/ObjectConstructorFactory;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Lexpo/modules/kotlin/allocators/ObjectConstructor;", "tryToUseDefaultConstructor", "(Ljava/lang/Class;)Lexpo/modules/kotlin/allocators/ObjectConstructor;", "Lco0/d;", "tryToUseDefaultKotlinConstructor", "(Lco0/d;)Lexpo/modules/kotlin/allocators/ObjectConstructor;", "useUnsafeAllocator", "get", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObjectConstructorFactory {
    private final <T> ObjectConstructor<T> tryToUseDefaultConstructor(Class<T> clazz) {
        try {
            final Constructor<T> declaredConstructor = clazz.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.b
                @Override // expo.modules.kotlin.allocators.ObjectConstructor
                public final Object construct() {
                    return ObjectConstructorFactory.tryToUseDefaultConstructor$lambda$0(declaredConstructor);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tryToUseDefaultConstructor$lambda$0(Constructor constructor) {
        return constructor.newInstance(null);
    }

    private final <T> ObjectConstructor<T> tryToUseDefaultKotlinConstructor(co0.d<T> clazz) {
        Iterator<T> it = clazz.getConstructors().iterator();
        boolean z11 = false;
        T t11 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z11) {
                    break;
                }
                break;
            }
            T next = it.next();
            List<l> parameters = ((h) next).getParameters();
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it2 = parameters.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((l) it2.next()).e()) {
                        }
                    }
                }
            }
            if (!z11) {
                z11 = true;
                t11 = next;
            }
            t11 = null;
            break;
        }
        final h hVar = (h) t11;
        if (hVar == null) {
            return null;
        }
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.c
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                return ObjectConstructorFactory.tryToUseDefaultKotlinConstructor$lambda$2(hVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object tryToUseDefaultKotlinConstructor$lambda$2(h hVar) {
        return hVar.callBy(v0.i());
    }

    private final <T> ObjectConstructor<T> useUnsafeAllocator(Class<T> clazz) {
        final UnsafeAllocator<T> unsafeAllocatorCreateAllocator = UnsafeAllocator.INSTANCE.createAllocator(clazz);
        return new ObjectConstructor() { // from class: expo.modules.kotlin.allocators.a
            @Override // expo.modules.kotlin.allocators.ObjectConstructor
            public final Object construct() {
                return unsafeAllocatorCreateAllocator.newInstance();
            }
        };
    }

    public final <T> ObjectConstructor<T> get(co0.d<T> clazz) {
        s.k(clazz, "clazz");
        ObjectConstructor<T> objectConstructorTryToUseDefaultConstructor = tryToUseDefaultConstructor(vn0.a.b(clazz));
        return (objectConstructorTryToUseDefaultConstructor == null && (objectConstructorTryToUseDefaultConstructor = tryToUseDefaultKotlinConstructor(clazz)) == null) ? useUnsafeAllocator(vn0.a.b(clazz)) : objectConstructorTryToUseDefaultConstructor;
    }
}
