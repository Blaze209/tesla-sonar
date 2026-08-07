package expo.modules.kotlin.jni;

import co0.q;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.exception.InvalidExpectedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0003\"\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\b\u0010\r\u001a\u00020\fH\u0007J\u0015\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType;", "", "innerPossibleTypes", "", "Lexpo/modules/kotlin/jni/SingleType;", "<init>", "([Lexpo/modules/kotlin/jni/SingleType;)V", "expectedTypes", "Lexpo/modules/kotlin/jni/CppType;", "([Lexpo/modules/kotlin/jni/CppType;)V", "[Lexpo/modules/kotlin/jni/SingleType;", "innerCombinedTypes", "", "getCombinedTypes", "getPossibleTypes", "()[Lexpo/modules/kotlin/jni/SingleType;", "getFirstType", "hashCode", "equals", "", "other", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class ExpectedType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int innerCombinedTypes;
    private final SingleType[] innerPossibleTypes;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\tJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0013\"\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType$Companion;", "", "<init>", "()V", "Lexpo/modules/kotlin/jni/CppType;", "parameterType", "Lexpo/modules/kotlin/jni/ExpectedType;", "forPrimitiveArray", "(Lexpo/modules/kotlin/jni/CppType;)Lexpo/modules/kotlin/jni/ExpectedType;", "(Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;", "forEnum", "()Lexpo/modules/kotlin/jni/ExpectedType;", "forList", "valueType", "forMap", "Lco0/q;", "type", "fromKType", "(Lco0/q;)Lexpo/modules/kotlin/jni/ExpectedType;", "", "types", "merge", "([Lexpo/modules/kotlin/jni/ExpectedType;)Lexpo/modules/kotlin/jni/ExpectedType;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExpectedType forEnum() {
            return new ExpectedType(CppType.STRING, CppType.INT);
        }

        public final ExpectedType forList(CppType parameterType) {
            s.k(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.LIST, new ExpectedType[]{new ExpectedType(parameterType)}));
        }

        public final ExpectedType forMap(CppType valueType) {
            s.k(valueType, "valueType");
            return new ExpectedType(new SingleType(CppType.MAP, new ExpectedType[]{new ExpectedType(valueType)}));
        }

        public final ExpectedType forPrimitiveArray(CppType parameterType) {
            s.k(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.PRIMITIVE_ARRAY, new ExpectedType[]{new ExpectedType(parameterType)}));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ExpectedType fromKType(q type) throws InvalidExpectedType {
            s.k(type, "type");
            co0.f classifier = type.getClassifier();
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
            if (dVar == null) {
                throw new IllegalArgumentException("Cannot obtain KClass from '" + type + "'");
            }
            int i11 = 2;
            if (s.f(dVar, o0.b(Integer.TYPE))) {
                return new ExpectedType(new SingleType(CppType.INT, objArr12 == true ? 1 : 0, i11, objArr11 == true ? 1 : 0));
            }
            if (s.f(dVar, o0.b(Long.TYPE))) {
                return new ExpectedType(new SingleType(CppType.LONG, objArr10 == true ? 1 : 0, i11, objArr9 == true ? 1 : 0));
            }
            if (s.f(dVar, o0.b(Double.TYPE))) {
                return new ExpectedType(new SingleType(CppType.DOUBLE, objArr8 == true ? 1 : 0, i11, objArr7 == true ? 1 : 0));
            }
            if (s.f(dVar, o0.b(Float.TYPE))) {
                return new ExpectedType(new SingleType(CppType.FLOAT, objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0));
            }
            if (s.f(dVar, o0.b(Boolean.TYPE))) {
                return new ExpectedType(new SingleType(CppType.BOOLEAN, objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0));
            }
            if (s.f(dVar, o0.b(String.class))) {
                return new ExpectedType(new SingleType(CppType.STRING, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0));
            }
            if (vn0.a.b(dVar).isAssignableFrom(List.class)) {
                co0.s sVar = (co0.s) v.q0(type.getArguments());
                q qVarC = sVar != null ? sVar.c() : null;
                if (qVarC != null) {
                    return forList(fromKType(qVarC));
                }
            }
            if (vn0.a.b(dVar).isAssignableFrom(Map.class)) {
                co0.s sVar2 = (co0.s) v.r0(type.getArguments(), 1);
                q qVarC2 = sVar2 != null ? sVar2.c() : null;
                if (qVarC2 != null) {
                    return forMap(fromKType(qVarC2));
                }
            }
            throw new InvalidExpectedType(type);
        }

        public final ExpectedType merge(ExpectedType... types) {
            s.k(types, "types");
            ArrayList arrayList = new ArrayList();
            for (ExpectedType expectedType : types) {
                v.E(arrayList, n.Y(expectedType.innerPossibleTypes));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                CppType expectedCppType$expo_modules_core_release = ((SingleType) obj).getExpectedCppType();
                Object arrayList2 = linkedHashMap.get(expectedCppType$expo_modules_core_release);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(expectedCppType$expo_modules_core_release, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = SingleType.INSTANCE.merge((SingleType) next, (SingleType) it2.next());
                }
                arrayList3.add((SingleType) next);
            }
            SingleType[] singleTypeArr = (SingleType[]) arrayList3.toArray(new SingleType[0]);
            return new ExpectedType((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
        }

        private Companion() {
        }

        public final ExpectedType forList(ExpectedType parameterType) {
            s.k(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.LIST, new ExpectedType[]{parameterType}));
        }

        public final ExpectedType forMap(ExpectedType valueType) {
            s.k(valueType, "valueType");
            return new ExpectedType(new SingleType(CppType.MAP, new ExpectedType[]{valueType}));
        }

        public final ExpectedType forPrimitiveArray(ExpectedType parameterType) {
            s.k(parameterType, "parameterType");
            return new ExpectedType(new SingleType(CppType.PRIMITIVE_ARRAY, new ExpectedType[]{parameterType}));
        }
    }

    public ExpectedType(SingleType... innerPossibleTypes) {
        s.k(innerPossibleTypes, "innerPossibleTypes");
        this.innerPossibleTypes = innerPossibleTypes;
        int cppType = 0;
        for (SingleType singleType : innerPossibleTypes) {
            cppType |= singleType.getCppType();
        }
        this.innerCombinedTypes = cppType;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ExpectedType)) {
            return false;
        }
        SingleType[] singleTypeArr = this.innerPossibleTypes;
        ExpectedType expectedType = (ExpectedType) other;
        if (singleTypeArr.length != expectedType.innerPossibleTypes.length) {
            return false;
        }
        int length = singleTypeArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.innerPossibleTypes[i11].getExpectedCppType() != expectedType.innerPossibleTypes[i11].getExpectedCppType() || !s.f(this.innerPossibleTypes[i11].getFirstParameterType(), expectedType.innerPossibleTypes[i11].getFirstParameterType())) {
                return false;
            }
        }
        return true;
    }

    @DoNotStrip
    /* JADX INFO: renamed from: getCombinedTypes, reason: from getter */
    public final int getInnerCombinedTypes() {
        return this.innerCombinedTypes;
    }

    @DoNotStrip
    public final SingleType getFirstType() {
        return (SingleType) n.k0(this.innerPossibleTypes);
    }

    @DoNotStrip
    /* JADX INFO: renamed from: getPossibleTypes, reason: from getter */
    public final SingleType[] getInnerPossibleTypes() {
        return this.innerPossibleTypes;
    }

    public int hashCode() {
        return (this.innerCombinedTypes * 31) + Arrays.hashCode(this.innerPossibleTypes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpectedType(CppType... expectedTypes) {
        s.k(expectedTypes, "expectedTypes");
        ArrayList arrayList = new ArrayList(expectedTypes.length);
        for (CppType cppType : expectedTypes) {
            arrayList.add(new SingleType(cppType, null, 2, 0 == true ? 1 : 0));
        }
        SingleType[] singleTypeArr = (SingleType[]) arrayList.toArray(new SingleType[0]);
        this((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
    }
}
