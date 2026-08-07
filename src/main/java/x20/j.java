package x20;

import com.squareup.wire.o;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Ljava/lang/Class;", "messageType", "", "typeUrl", "Lcom/squareup/wire/o;", "syntax", "Lx20/k;", "a", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/o;)Lx20/k;", "Ljava/lang/reflect/Field;", "messageField", "", "Lcom/squareup/wire/h$a;", "c", "(Ljava/lang/reflect/Field;)Ljava/util/Set;", "b", "(Ljava/lang/Class;)Ljava/lang/Class;", "wire-runtime"}, k = 2, mv = {1, 4, 0})
public final class j {
    public static final <M extends com.squareup.wire.f<M, B>, B extends com.squareup.wire.f.a<M, B>> k<M, B> a(Class<M> messageType, String str, o syntax) {
        s.k(messageType, "messageType");
        s.k(syntax, "syntax");
        Class clsB = b(messageType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field messageField : messageType.getDeclaredFields()) {
            q qVar = (q) messageField.getAnnotation(q.class);
            if (qVar != null) {
                Integer numValueOf = Integer.valueOf(qVar.tag());
                s.j(messageField, "messageField");
                linkedHashMap.put(numValueOf, new a(qVar, messageField, clsB));
            } else {
                s.j(messageField, "messageField");
                if (s.f(messageField.getType(), com.squareup.wire.h.class)) {
                    for (com.squareup.wire.h.a<?> aVar : c(messageField)) {
                        linkedHashMap.put(Integer.valueOf(aVar.getTag()), new i(messageField, clsB, aVar));
                    }
                }
            }
        }
        co0.d dVarE = vn0.a.e(messageType);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        s.j(mapUnmodifiableMap, "Collections.unmodifiableMap(fields)");
        return new k<>(new l(dVarE, clsB, mapUnmodifiableMap, str, syntax));
    }

    private static final <M extends com.squareup.wire.f<M, B>, B extends com.squareup.wire.f.a<M, B>> Class<B> b(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName() + "$Builder");
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("No builder class found for message type " + cls.getName());
        }
    }

    private static final <M extends com.squareup.wire.f<M, B>, B extends com.squareup.wire.f.a<M, B>> Set<com.squareup.wire.h.a<?>> c(Field field) throws IllegalAccessException, NoSuchFieldException {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        s.j(name, "messageField.name");
        Field keysField = declaringClass.getDeclaredField(d.b(name));
        s.j(keysField, "keysField");
        keysField.setAccessible(true);
        Object obj = keysField.get(null);
        if (obj != null) {
            return (Set) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
    }
}
