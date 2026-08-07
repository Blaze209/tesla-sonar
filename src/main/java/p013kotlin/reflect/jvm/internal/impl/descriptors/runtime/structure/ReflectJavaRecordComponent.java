package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f87046a;

    public ReflectJavaRecordComponent(Object recordComponent) {
        s.k(recordComponent, "recordComponent");
        this.f87046a = recordComponent;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member getMember() throws IllegalAccessException, InvocationTargetException {
        Method methodC = Java16RecordComponentsLoader.f87002a.c(this.f87046a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsD = Java16RecordComponentsLoader.f87002a.d(this.f87046a);
        if (clsD != null) {
            return new ReflectJavaClassifierType(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean isVararg() {
        return false;
    }
}
