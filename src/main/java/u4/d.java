package u4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ho0.i;
import ho0.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Ljava/lang/Class;", "Lv4/a;", "a", "(Ljava/lang/String;)Ljava/lang/Class;", "parameterProviderClass", "", "parameterProviderIndex", "", "", "b", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "classToCheck", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "Lho0/i;", "size", "c", "(Lho0/i;I)[Ljava/lang/Object;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final Class<? extends v4.a<?>> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            c.INSTANCE.a("Unable to find PreviewProvider '" + str + CoreConstants.SINGLE_QUOTE_CHAR, e11);
            return null;
        }
    }

    public static final Object[] b(Class<? extends v4.a<?>> cls, int i11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i12 = 0;
            boolean z11 = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i12 >= length) {
                    if (z11) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i12];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z11) {
                            z11 = true;
                            constructor = constructor2;
                        }
                    }
                    i12++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            s.i(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            v4.a aVar = (v4.a) objNewInstance;
            if (i11 < 0) {
                return c(aVar.a(), aVar.getCount());
            }
            List listE = v.e(l.E(aVar.a(), i11));
            ArrayList arrayList = new ArrayList(v.y(listE, 10));
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(d(it.next()));
            }
            return arrayList.toArray(new Object[0]);
        } catch (vn0.c unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    private static final Object[] c(i<? extends Object> iVar, int i11) {
        Iterator<? extends Object> it = iVar.iterator();
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = it.next();
        }
        return objArr;
    }

    private static final Object d(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof vn0.b) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
