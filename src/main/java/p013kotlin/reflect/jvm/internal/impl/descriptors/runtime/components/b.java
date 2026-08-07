package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import p013kotlin.jvm.internal.c;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes9.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f87001a = new b();

    private b() {
    }

    public final String a(Constructor<?> constructor) {
        s.k(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = c.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            s.h(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        s.k(field, "field");
        Class<?> type = field.getType();
        s.j(type, "getType(...)");
        return ReflectClassUtilKt.getDesc(type);
    }

    public final String c(Method method) {
        s.k(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = c.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            s.h(cls);
            sb2.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        s.j(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
