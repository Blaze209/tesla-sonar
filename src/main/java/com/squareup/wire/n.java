package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001e*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0019B\u001f\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/squareup/wire/n;", "Lcom/squareup/wire/p;", "E", "Lcom/squareup/wire/a;", "Ljava/lang/Class;", "javaType", "Lcom/squareup/wire/o;", "syntax", "<init>", "(Ljava/lang/Class;Lcom/squareup/wire/o;)V", "(Ljava/lang/Class;)V", "Ljava/lang/reflect/Method;", "f", "()Ljava/lang/reflect/Method;", "", "value", DateTokenConverter.CONVERTER_KEY, "(I)Lcom/squareup/wire/p;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/reflect/Method;", "fromValueMethod", "b", "Ljava/lang/Class;", "c", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class n<E extends p> extends a<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Method fromValueMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Class<E> javaType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Class<E> javaType, o syntax) {
        super(vn0.a.e(javaType), syntax, x20.d.f(javaType));
        s.k(javaType, "javaType");
        s.k(syntax, "syntax");
        this.javaType = javaType;
    }

    private final Method f() throws NoSuchMethodException {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        Method method2 = this.javaType.getMethod("fromValue", Integer.TYPE);
        this.fromValueMethod = method2;
        s.j(method2, "javaType.getMethod(\"from…romValueMethod = it\n    }");
        return method2;
    }

    @Override // com.squareup.wire.a
    protected E d(int value) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = f().invoke(null, Integer.valueOf(value));
        if (objInvoke != null) {
            return (E) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type E");
    }

    public boolean equals(Object other) {
        return (other instanceof n) && s.f(((n) other).getType(), getType());
    }

    public int hashCode() {
        co0.d<?> type = getType();
        if (type != null) {
            return type.hashCode();
        }
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Class<E> javaType) {
        this(javaType, o.PROTO_2);
        s.k(javaType, "javaType");
    }
}
