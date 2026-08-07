package co0;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lco0/q;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(Lco0/q;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lco0/s;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(Lco0/q;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lco0/q;)V", "javaType", "g", "(Lco0/s;)Ljava/lang/reflect/Type;", "(Lco0/s;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19463a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19463a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<Class<?>, Class<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f19464a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return p11.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(q qVar, boolean z11) {
        f classifier = qVar.getClassifier();
        if (classifier instanceof r) {
            return new w((r) classifier);
        }
        if (!(classifier instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + qVar);
        }
        d dVar = (d) classifier;
        Class clsC = z11 ? vn0.a.c(dVar) : vn0.a.b(dVar);
        List<s> arguments = qVar.getArguments();
        if (arguments.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, arguments);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        s sVar = (s) p013kotlin.collections.v.W0(arguments);
        if (sVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + qVar);
        }
        t variance = sVar.getVariance();
        q type = sVar.getType();
        int i11 = variance == null ? -1 : a.f19463a[variance.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return clsC;
        }
        if (i11 != 2 && i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        p013kotlin.jvm.internal.s.h(type);
        Type typeD = d(type, false, 1, null);
        return typeD instanceof Class ? clsC : new co0.a(typeD);
    }

    static /* synthetic */ Type d(q qVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(qVar, z11);
    }

    private static final Type e(Class<?> cls, List<s> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<s> list2 = list;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((s) it.next()));
            }
            return new v(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<s> list3 = list;
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((s) it2.next()));
            }
            return new v(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<s> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((s) it3.next()));
        }
        return new v(cls, typeE, arrayList3);
    }

    public static final Type f(q qVar) {
        Type typeB;
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        return (!(qVar instanceof p013kotlin.jvm.internal.t) || (typeB = ((p013kotlin.jvm.internal.t) qVar).b()) == null) ? d(qVar, false, 1, null) : typeB;
    }

    private static final Type g(s sVar) {
        t tVarD = sVar.d();
        if (tVarD == null) {
            return y.f19465c.a();
        }
        q qVarC = sVar.c();
        p013kotlin.jvm.internal.s.h(qVarC);
        int i11 = a.f19463a[tVarD.ordinal()];
        if (i11 == 1) {
            return new y(null, c(qVarC, true));
        }
        if (i11 == 2) {
            return c(qVarC, true);
        }
        if (i11 == 3) {
            return new y(c(qVarC, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            p013kotlin.jvm.internal.s.j(name, "getName(...)");
            return name;
        }
        ho0.i iVarQ = ho0.l.q(type, b.f19464a);
        return ((Class) ho0.l.S(iVarQ)).getName() + p013kotlin.text.t.R(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, ho0.l.B(iVarQ));
    }
}
