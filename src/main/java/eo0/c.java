package eo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.h;
import co0.i;
import co0.m;
import co0.q;
import co0.x;
import fo0.a0;
import fo0.i3;
import fo0.j2;
import fo0.t2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lco0/m;", "Ljava/lang/reflect/Field;", "b", "(Lco0/m;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Lco0/m;)Ljava/lang/reflect/Method;", "javaGetter", "Lco0/i;", "e", "(Lco0/i;)Ljava/lang/reflect/Method;", "javaSetter", "Lco0/h;", DateTokenConverter.CONVERTER_KEY, "(Lco0/h;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Lco0/h;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lco0/h;)V", "javaConstructor", "Lco0/q;", "Ljava/lang/reflect/Type;", "f", "(Lco0/q;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final <T> Constructor<T> a(h<? extends T> hVar) {
        go0.h<?> hVarM;
        s.k(hVar, "<this>");
        a0<?> a0VarB = i3.b(hVar);
        Member memberB = (a0VarB == null || (hVarM = a0VarB.M()) == null) ? null : hVarM.b();
        if (memberB instanceof Constructor) {
            return (Constructor) memberB;
        }
        return null;
    }

    public static final Field b(m<?> mVar) {
        s.k(mVar, "<this>");
        j2<?> j2VarD = i3.d(mVar);
        if (j2VarD != null) {
            return j2VarD.d0();
        }
        return null;
    }

    public static final Method c(m<?> mVar) {
        s.k(mVar, "<this>");
        return d(mVar.getGetter());
    }

    public static final Method d(h<?> hVar) {
        go0.h<?> hVarM;
        s.k(hVar, "<this>");
        a0<?> a0VarB = i3.b(hVar);
        Member memberB = (a0VarB == null || (hVarM = a0VarB.M()) == null) ? null : hVarM.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Method e(i<?> iVar) {
        s.k(iVar, "<this>");
        return d(iVar.getSetter());
    }

    public static final Type f(q qVar) {
        s.k(qVar, "<this>");
        Type typeB = ((t2) qVar).b();
        return typeB == null ? x.f(qVar) : typeB;
    }
}
