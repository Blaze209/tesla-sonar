package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import ch.qos.logback.core.CoreConstants;
import co0.d;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.i;
import jn0.x;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import vn0.a;
import wn0.b;
import wn0.c;
import wn0.e;
import wn0.f;
import wn0.g;
import wn0.h;
import wn0.j;
import wn0.k;
import wn0.l;
import wn0.m;
import wn0.n;
import wn0.o;
import wn0.p;
import wn0.q;
import wn0.r;
import wn0.s;
import wn0.t;
import wn0.u;
import wn0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<d<? extends Object>> f87016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f87017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f87018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Class<? extends i<?>>, Integer> f87019d;

    static {
        int i11 = 0;
        List<d<? extends Object>> listP = v.p(o0.b(Boolean.TYPE), o0.b(Byte.TYPE), o0.b(Character.TYPE), o0.b(Double.TYPE), o0.b(Float.TYPE), o0.b(Integer.TYPE), o0.b(Long.TYPE), o0.b(Short.TYPE));
        f87016a = listP;
        List<d<? extends Object>> list = listP;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            arrayList.add(x.a(a.c(dVar), a.d(dVar)));
        }
        f87017b = v0.y(arrayList);
        List<d<? extends Object>> list2 = f87016a;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            arrayList2.add(x.a(a.d(dVar2), a.c(dVar2)));
        }
        f87018c = v0.y(arrayList2);
        List listP2 = v.p(wn0.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, wn0.v.class, w.class, b.class, c.class, wn0.d.class, e.class, f.class, g.class, h.class, wn0.i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList3 = new ArrayList(v.y(listP2, 10));
        for (Object obj : listP2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            arrayList3.add(x.a((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        f87019d = v0.y(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.i b(ParameterizedType it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        p013kotlin.jvm.internal.s.j(actualTypeArguments, "getActualTypeArguments(...)");
        return p013kotlin.collections.n.Z(actualTypeArguments);
    }

    public static final ClassId getClassId(Class<?> cls) {
        ClassId classId;
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (classId = getClassId(declaringClass)) != null) {
                    Name nameIdentifier = Name.identifier(cls.getSimpleName());
                    p013kotlin.jvm.internal.s.j(nameIdentifier, "identifier(...)");
                    ClassId classIdCreateNestedClassId = classId.createNestedClassId(nameIdentifier);
                    if (classIdCreateNestedClassId != null) {
                        return classIdCreateNestedClassId;
                    }
                }
                return ClassId.Companion.topLevel(new FqName(cls.getName()));
            }
        }
        FqName fqName = new FqName(cls.getName());
        FqName fqNameParent = fqName.parent();
        p013kotlin.jvm.internal.s.j(fqNameParent, "parent(...)");
        FqName fqName2 = FqName.topLevel(fqName.shortName());
        p013kotlin.jvm.internal.s.j(fqName2, "topLevel(...)");
        return new ClassId(fqNameParent, fqName2, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String getDesc(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                p013kotlin.jvm.internal.s.j(name, "getName(...)");
                return p013kotlin.text.t.U(name, CoreConstants.DOT, '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            p013kotlin.jvm.internal.s.j(name2, "getName(...)");
            sb2.append(p013kotlin.text.t.U(name2, CoreConstants.DOT, '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals(InquiryField.BooleanField.TYPE)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals(InquiryField.FloatField.TYPE)) {
                    return Gender.FEMALE;
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer getFunctionClassArity(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        return f87019d.get(cls);
    }

    public static final List<Type> getParameterizedTypeArguments(Type type) {
        p013kotlin.jvm.internal.s.k(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return v.m();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return ho0.l.c0(ho0.l.N(ho0.l.q(type, a.f87055a), b.f87056a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        p013kotlin.jvm.internal.s.j(actualTypeArguments, "getActualTypeArguments(...)");
        return p013kotlin.collections.n.w1(actualTypeArguments);
    }

    public static final Class<?> getPrimitiveByWrapper(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        return f87017b.get(cls);
    }

    public static final ClassLoader getSafeClassLoader(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        p013kotlin.jvm.internal.s.j(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> getWrapperByPrimitive(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        return f87018c.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(Class<?> cls) {
        p013kotlin.jvm.internal.s.k(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
