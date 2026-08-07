package p013kotlin.reflect.jvm.internal.impl.builtins.functions;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class FunctionTypeKindExtractor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FunctionTypeKindExtractor f86610c = new FunctionTypeKindExtractor(v.p(FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<FunctionTypeKind> f86611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<FqName, List<FunctionTypeKind>> f86612b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.f86610c;
        }

        private Companion() {
        }
    }

    public static final class KindWithArity {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FunctionTypeKind f86613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f86614b;

        public KindWithArity(FunctionTypeKind kind, int i11) {
            s.k(kind, "kind");
            this.f86613a = kind;
            this.f86614b = i11;
        }

        public final FunctionTypeKind component1() {
            return this.f86613a;
        }

        public final int component2() {
            return this.f86614b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return s.f(this.f86613a, kindWithArity.f86613a) && this.f86614b == kindWithArity.f86614b;
        }

        public final FunctionTypeKind getKind() {
            return this.f86613a;
        }

        public int hashCode() {
            return (this.f86613a.hashCode() * 31) + Integer.hashCode(this.f86614b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f86613a + ", arity=" + this.f86614b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(List<? extends FunctionTypeKind> kinds) {
        s.k(kinds, "kinds");
        this.f86611a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            FqName packageFqName = ((FunctionTypeKind) obj).getPackageFqName();
            Object arrayList = linkedHashMap.get(packageFqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(packageFqName, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f86612b = linkedHashMap;
    }

    private final Integer a(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int iCharAt = str.charAt(i12) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i11 = (i11 * 10) + iCharAt;
        }
        return Integer.valueOf(i11);
    }

    public final FunctionTypeKind getFunctionalClassKind(FqName packageFqName, String className) {
        s.k(packageFqName, "packageFqName");
        s.k(className, "className");
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(packageFqName, className);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    public final KindWithArity getFunctionalClassKindWithArity(FqName packageFqName, String className) {
        s.k(packageFqName, "packageFqName");
        s.k(className, "className");
        List<FunctionTypeKind> list = this.f86612b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            if (t.b0(className, functionTypeKind.getClassNamePrefix(), false, 2, null)) {
                String strSubstring = className.substring(functionTypeKind.getClassNamePrefix().length());
                s.j(strSubstring, "substring(...)");
                Integer numA = a(strSubstring);
                if (numA != null) {
                    return new KindWithArity(functionTypeKind, numA.intValue());
                }
            }
        }
        return null;
    }
}
