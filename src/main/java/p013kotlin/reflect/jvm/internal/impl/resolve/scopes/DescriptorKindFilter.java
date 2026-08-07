package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorKindFilter {
    public static final DescriptorKindFilter ALL;
    public static final DescriptorKindFilter CALLABLES;
    public static final DescriptorKindFilter CLASSIFIERS;
    public static final Companion Companion;
    public static final DescriptorKindFilter FUNCTIONS;
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;
    public static final DescriptorKindFilter PACKAGES;
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;
    public static final DescriptorKindFilter TYPE_ALIASES;
    public static final DescriptorKindFilter VALUES;
    public static final DescriptorKindFilter VARIABLES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f88501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f88502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f88503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f88504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f88505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f88506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f88507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f88508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f88509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f88510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f88511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List<Companion.a> f88512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final List<Companion.a> f88513o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<DescriptorKindExclude> f88514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f88515b;

    public static final class Companion {

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f88516a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f88517b;

            public a(int i11, String name) {
                s.k(name, "name");
                this.f88516a = i11;
                this.f88517b = name;
            }

            public final int a() {
                return this.f88516a;
            }

            public final String b() {
                return this.f88517b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a() {
            int i11 = DescriptorKindFilter.f88501c;
            DescriptorKindFilter.f88501c <<= 1;
            return i11;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.f88508j;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.f88509k;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.f88506h;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f88502d;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.f88505g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f88503e;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.f88504f;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.f88507i;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion.a aVar;
        Companion.a aVar2;
        Companion companion = new Companion(null);
        Companion = companion;
        f88501c = 1;
        int iA = companion.a();
        f88502d = iA;
        int iA2 = companion.a();
        f88503e = iA2;
        int iA3 = companion.a();
        f88504f = iA3;
        int iA4 = companion.a();
        f88505g = iA4;
        int iA5 = companion.a();
        f88506h = iA5;
        int iA6 = companion.a();
        f88507i = iA6;
        int iA7 = companion.a() - 1;
        f88508j = iA7;
        int i11 = iA | iA2 | iA3;
        f88509k = i11;
        int i12 = iA2 | iA5 | iA6;
        f88510l = i12;
        int i13 = iA5 | iA6;
        f88511m = i13;
        int i14 = 2;
        ALL = new DescriptorKindFilter(iA7, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        CALLABLES = new DescriptorKindFilter(i13, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iA, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iA2, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        TYPE_ALIASES = new DescriptorKindFilter(iA3, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        CLASSIFIERS = new DescriptorKindFilter(i11, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        PACKAGES = new DescriptorKindFilter(iA4, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        FUNCTIONS = new DescriptorKindFilter(iA5, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        VARIABLES = new DescriptorKindFilter(iA6, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        VALUES = new DescriptorKindFilter(i12, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
        Field[] fields = DescriptorKindFilter.class.getFields();
        s.j(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i15 = descriptorKindFilter.f88515b;
                String name = field2.getName();
                s.j(name, "getName(...)");
                aVar2 = new Companion.a(i15, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f88512n = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        s.j(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (s.f(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            s.i(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                s.j(name2, "getName(...)");
                aVar = new Companion.a(iIntValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f88513o = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i11, List<? extends DescriptorKindExclude> excludes) {
        s.k(excludes, "excludes");
        this.f88514a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i11 &= ~((DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.f88515b = i11;
    }

    public final boolean acceptsKinds(int i11) {
        return (i11 & this.f88515b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.f(DescriptorKindFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        s.i(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return s.f(this.f88514a, descriptorKindFilter.f88514a) && this.f88515b == descriptorKindFilter.f88515b;
    }

    public final List<DescriptorKindExclude> getExcludes() {
        return this.f88514a;
    }

    public final int getKindMask() {
        return this.f88515b;
    }

    public int hashCode() {
        return (this.f88514a.hashCode() * 31) + this.f88515b;
    }

    public final DescriptorKindFilter restrictedToKindsOrNull(int i11) {
        int i12 = i11 & this.f88515b;
        if (i12 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i12, this.f88514a);
    }

    public String toString() {
        Object next;
        Iterator<T> it = f88512n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Companion.a) next).a() != this.f88515b);
        Companion.a aVar = (Companion.a) next;
        String strB = aVar != null ? aVar.b() : null;
        if (strB == null) {
            List<Companion.a> list = f88513o;
            ArrayList arrayList = new ArrayList();
            for (Companion.a aVar2 : list) {
                String strB2 = acceptsKinds(aVar2.a()) ? aVar2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = v.y0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f88514a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ DescriptorKindFilter(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? v.m() : list);
    }
}
