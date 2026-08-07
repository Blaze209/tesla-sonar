package o7;

import androidx.p003lifecycle.c1;
import java.lang.reflect.InvocationTargetException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo7/d;", "", "<init>", "()V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f96785a = new d();

    private d() {
    }

    public final <T extends c1> T a(Class<T> modelClass) throws InvocationTargetException {
        s.k(modelClass, "modelClass");
        try {
            T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            s.j(tNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return tNewInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e13);
        }
    }
}
