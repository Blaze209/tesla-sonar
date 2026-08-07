package p013kotlin.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import co0.d;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.text.t;
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
import wn0.u;
import wn0.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020+0#8VX\u0097\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010&R\u001a\u00100\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b4\u0010.\u001a\u0004\b3\u00101R\u001a\u00105\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b6\u0010.\u001a\u0004\b5\u00101R\u001a\u00107\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b8\u0010.\u001a\u0004\b7\u00101¨\u0006:"}, d2 = {"Lkotlin/jvm/internal/i;", "Lco0/d;", "", "Lkotlin/jvm/internal/h;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "k", "()Ljava/lang/Void;", "value", "", "j", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "l", "simpleName", "c", "qualifiedName", "", "Lco0/h;", "getConstructors", "()Ljava/util/Collection;", "constructors", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "f", "()Ljava/lang/Object;", "objectInstance", "Lco0/q;", "getSupertypes", "getSupertypes$annotations", "()V", "supertypes", "isAbstract", "()Z", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isInner", "isInner$annotations", "isValue", "isValue$annotations", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements d<Object>, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends jn0.i<?>>, Integer> f86516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f86517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f86518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f86519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f86520g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* JADX INFO: renamed from: kotlin.jvm.internal.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R(\u0010\u001a\u001a\u0016\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lkotlin/jvm/internal/i$a;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "b", "(Ljava/lang/Class;)Ljava/lang/String;", "a", "value", "", "c", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Ljn0/i;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "primitiveFqNames", "Ljava/util/HashMap;", "primitiveWrapperFqNames", "classFqNames", "kotlin.jvm.PlatformType", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            s.k(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) i.f86519f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) i.f86519f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class<?> jClass) {
            String str;
            s.k(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) i.f86520g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) i.f86520g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                s.h(simpleName);
                String strR1 = t.r1(simpleName, enclosingMethod.getName() + CoreConstants.DOLLAR, null, 2, null);
                if (strR1 != null) {
                    return strR1;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                s.h(simpleName);
                return t.q1(simpleName, CoreConstants.DOLLAR, null, 2, null);
            }
            s.h(simpleName);
            return t.r1(simpleName, enclosingConstructor.getName() + CoreConstants.DOLLAR, null, 2, null);
        }

        public final boolean c(Object value, Class<?> jClass) {
            s.k(jClass, "jClass");
            Map map = i.f86516c;
            s.i(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return u0.o(value, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = a.c(a.e(jClass));
            }
            return jClass.isInstance(value);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listP = v.p(wn0.a.class, l.class, p.class, q.class, r.class, s.class, wn0.t.class, u.class, wn0.v.class, w.class, b.class, c.class, wn0.d.class, e.class, f.class, g.class, h.class, wn0.i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(v.y(listP, 10));
        int i11 = 0;
        for (Object obj : listP) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            arrayList.add(x.a((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        f86516c = v0.y(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put(InquiryField.BooleanField.TYPE, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(InquiryField.FloatField.TYPE, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f86517d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f86518e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        s.j(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            s.h(str);
            sb2.append(t.u1(str, CoreConstants.DOT, null, 2, null));
            sb2.append("CompanionObject");
            Pair pairA = x.a(sb2.toString(), str + ".Companion");
            map3.put(pairA.e(), pairA.f());
        }
        for (Map.Entry<Class<? extends jn0.i<?>>, Integer> entry : f86516c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f86519f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            s.h(str2);
            linkedHashMap.put(key, t.u1(str2, CoreConstants.DOT, null, 2, null));
        }
        f86520g = linkedHashMap;
    }

    public i(Class<?> jClass) {
        s.k(jClass, "jClass");
        this.jClass = jClass;
    }

    private final Void k() {
        throw new vn0.c();
    }

    @Override // p013kotlin.jvm.internal.h
    public Class<?> a() {
        return this.jClass;
    }

    @Override // co0.d
    public String c() {
        return INSTANCE.a(a());
    }

    public boolean equals(Object other) {
        return (other instanceof i) && s.f(a.c(this), a.c((d) other));
    }

    @Override // co0.d
    public Object f() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public Collection<co0.h<Object>> getConstructors() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public List<co0.q> getSupertypes() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public int hashCode() {
        return a.c(this).hashCode();
    }

    @Override // co0.d
    public boolean isAbstract() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public boolean isInner() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public boolean isSealed() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public boolean isValue() {
        k();
        throw new KotlinNothingValueException();
    }

    @Override // co0.d
    public boolean j(Object value) {
        return INSTANCE.c(value, a());
    }

    @Override // co0.d
    public String l() {
        return INSTANCE.b(a());
    }

    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }
}
