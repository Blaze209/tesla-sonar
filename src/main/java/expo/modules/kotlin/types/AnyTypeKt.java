package expo.modules.kotlin.types;

import co0.q;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0018\u001a\u0018\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0006\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\u000b\u001a\u00020\n\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u000b\u001a\u00020\n\"\u0006\b\u0000\u0010\u0000\u0018\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u000b\u0010\r\u001a:\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001aR\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0016\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0019\u001a\u0082\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u001a\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u001c\u001a\u009a\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u001a\u0018\u0001\"\u0006\b\u0004\u0010\u001d\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010\u001f\u001a²\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u001a\u0018\u0001\"\u0006\b\u0004\u0010\u001d\u0018\u0001\"\u0006\b\u0005\u0010 \u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u000f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00050\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010\"\u001aÊ\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u001a\u0018\u0001\"\u0006\b\u0004\u0010\u001d\u0018\u0001\"\u0006\b\u0005\u0010 \u0018\u0001\"\u0006\b\u0006\u0010#\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u000f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00050\u000f2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00060\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010%\u001aâ\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\"\u0006\b\u0000\u0010\u000e\u0018\u0001\"\u0006\b\u0001\u0010\u0014\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u001a\u0018\u0001\"\u0006\b\u0004\u0010\u001d\u0018\u0001\"\u0006\b\u0005\u0010 \u0018\u0001\"\u0006\b\u0006\u0010#\u0018\u0001\"\u0006\b\u0007\u0010&\u0018\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00030\u000f2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00040\u000f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00050\u000f2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00060\u000f2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00070\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0004\b\u0012\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"T", "Lexpo/modules/kotlin/types/LazyKType;", "lazyTypeOf", "()Lexpo/modules/kotlin/types/LazyKType;", "Lkotlin/Function0;", "Lco0/q;", "toLazyType", "(Lwn0/a;)Lexpo/modules/kotlin/types/LazyKType;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converterProvider", "Lexpo/modules/kotlin/types/AnyType;", "toAnyType", "(Lwn0/a;Lexpo/modules/kotlin/types/TypeConverterProvider;)Lexpo/modules/kotlin/types/AnyType;", "(Lexpo/modules/kotlin/types/TypeConverterProvider;)Lexpo/modules/kotlin/types/AnyType;", "P0", "Ljava/lang/Class;", "p0", "", "toArgsArray", "(Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P1", "p1", "(Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P2", "p2", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P3", "p3", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P4", "p4", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P5", "p5", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P6", "p6", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "P7", "p7", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lexpo/modules/kotlin/types/TypeConverterProvider;)[Lexpo/modules/kotlin/types/AnyType;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnyTypeKt {

    /* JADX INFO: renamed from: expo.modules.kotlin.types.AnyTypeKt$toAnyType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class C46511 implements wn0.a<q> {
        public static final C46511 INSTANCE = new C46511();

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // wn0.a
        public final q invoke() {
            s.q(6, "T");
            return null;
        }
    }

    public static final /* synthetic */ <T> LazyKType lazyTypeOf() {
        s.p();
        AnonymousClass1 anonymousClass1 = new wn0.a<q>() { // from class: expo.modules.kotlin.types.AnyTypeKt.lazyTypeOf.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.a
            public final q invoke() {
                s.q(6, "T");
                return null;
            }
        };
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        return new LazyKType(dVarB, false, anonymousClass1);
    }

    public static final /* synthetic */ <T> AnyType toAnyType(wn0.a<? extends q> aVar, TypeConverterProvider typeConverterProvider) {
        s.k(aVar, "<this>");
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        return new AnyType(new LazyKType(dVarB, false, aVar), typeConverterProvider);
    }

    public static /* synthetic */ AnyType toAnyType$default(wn0.a aVar, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeConverterProvider = null;
        }
        s.k(aVar, "<this>");
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        return new AnyType(new LazyKType(dVarB, false, aVar), typeConverterProvider);
    }

    public static final /* synthetic */ <P0> AnyType[] toArgsArray(Class<P0> p11, TypeConverterProvider typeConverterProvider) {
        s.k(p11, "p0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$1 anyTypeKt$toArgsArray$$inlined$toAnyType$1 = AnyTypeKt$toArgsArray$$inlined$toAnyType$1.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$1), typeConverterProvider);
        }
        return new AnyType[]{anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p11, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        }
        if ((i11 & 2) != 0) {
            typeConverterProvider = null;
        }
        s.k(p11, "p0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$1 anyTypeKt$toArgsArray$$inlined$toAnyType$1 = AnyTypeKt$toArgsArray$$inlined$toAnyType$1.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$1), typeConverterProvider);
        }
        return new AnyType[]{anyType};
    }

    public static final /* synthetic */ <T> LazyKType toLazyType(wn0.a<? extends q> aVar) {
        s.k(aVar, "<this>");
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        return new LazyKType(dVarB, false, aVar);
    }

    public static final /* synthetic */ <T> AnyType toAnyType(TypeConverterProvider typeConverterProvider) {
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType != null) {
            return anyType;
        }
        s.p();
        C46511 c46511 = C46511.INSTANCE;
        s.q(4, "T");
        co0.d dVarB2 = o0.b(Object.class);
        s.q(3, "T");
        return new AnyType(new LazyKType(dVarB2, false, c46511), typeConverterProvider);
    }

    public static /* synthetic */ AnyType toAnyType$default(TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeConverterProvider = null;
        }
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType != null) {
            return anyType;
        }
        s.p();
        C46511 c46511 = C46511.INSTANCE;
        s.q(4, "T");
        co0.d dVarB2 = o0.b(Object.class);
        s.q(3, "T");
        return new AnyType(new LazyKType(dVarB2, false, c46511), typeConverterProvider);
    }

    public static final /* synthetic */ <P0, P1> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, TypeConverterProvider typeConverterProvider) {
        s.k(p11, "p0");
        s.k(p12, "p1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$2 anyTypeKt$toArgsArray$$inlined$toAnyType$2 = AnyTypeKt$toArgsArray$$inlined$toAnyType$2.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$2), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$3 anyTypeKt$toArgsArray$$inlined$toAnyType$3 = AnyTypeKt$toArgsArray$$inlined$toAnyType$3.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$3), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p11, Class p12, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        }
        if ((i11 & 4) != 0) {
            typeConverterProvider = null;
        }
        s.k(p11, "p0");
        s.k(p12, "p1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$2 anyTypeKt$toArgsArray$$inlined$toAnyType$2 = AnyTypeKt$toArgsArray$$inlined$toAnyType$2.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$2), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$3 anyTypeKt$toArgsArray$$inlined$toAnyType$3 = AnyTypeKt$toArgsArray$$inlined$toAnyType$3.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$3), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2};
    }

    public static final /* synthetic */ <P0, P1, P2> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, Class<P2> p13, TypeConverterProvider typeConverterProvider) {
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$4 anyTypeKt$toArgsArray$$inlined$toAnyType$4 = AnyTypeKt$toArgsArray$$inlined$toAnyType$4.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$4), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$5 anyTypeKt$toArgsArray$$inlined$toAnyType$5 = AnyTypeKt$toArgsArray$$inlined$toAnyType$5.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$5), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$6 anyTypeKt$toArgsArray$$inlined$toAnyType$6 = AnyTypeKt$toArgsArray$$inlined$toAnyType$6.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$6), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p11, Class p12, Class p13, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        }
        if ((i11 & 4) != 0) {
            s.q(4, "P2");
            p13 = Object.class;
        }
        if ((i11 & 8) != 0) {
            typeConverterProvider = null;
        }
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$4 anyTypeKt$toArgsArray$$inlined$toAnyType$4 = AnyTypeKt$toArgsArray$$inlined$toAnyType$4.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$4), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$5 anyTypeKt$toArgsArray$$inlined$toAnyType$5 = AnyTypeKt$toArgsArray$$inlined$toAnyType$5.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$5), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$6 anyTypeKt$toArgsArray$$inlined$toAnyType$6 = AnyTypeKt$toArgsArray$$inlined$toAnyType$6.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$6), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3};
    }

    public static final /* synthetic */ <P0, P1, P2, P3> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, Class<P2> p13, Class<P3> p14, TypeConverterProvider typeConverterProvider) {
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$7 anyTypeKt$toArgsArray$$inlined$toAnyType$7 = AnyTypeKt$toArgsArray$$inlined$toAnyType$7.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$7), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$8 anyTypeKt$toArgsArray$$inlined$toAnyType$8 = AnyTypeKt$toArgsArray$$inlined$toAnyType$8.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$8), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$9 anyTypeKt$toArgsArray$$inlined$toAnyType$9 = AnyTypeKt$toArgsArray$$inlined$toAnyType$9.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$9), typeConverterProvider);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$10 anyTypeKt$toArgsArray$$inlined$toAnyType$10 = AnyTypeKt$toArgsArray$$inlined$toAnyType$10.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$10), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class p11, Class p12, Class p13, Class p14, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        }
        if ((i11 & 4) != 0) {
            s.q(4, "P2");
            p13 = Object.class;
        }
        if ((i11 & 8) != 0) {
            s.q(4, "P3");
            p14 = Object.class;
        }
        if ((i11 & 16) != 0) {
            typeConverterProvider = null;
        }
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$7 anyTypeKt$toArgsArray$$inlined$toAnyType$7 = AnyTypeKt$toArgsArray$$inlined$toAnyType$7.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$7), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$8 anyTypeKt$toArgsArray$$inlined$toAnyType$8 = AnyTypeKt$toArgsArray$$inlined$toAnyType$8.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$8), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$9 anyTypeKt$toArgsArray$$inlined$toAnyType$9 = AnyTypeKt$toArgsArray$$inlined$toAnyType$9.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$9), typeConverterProvider);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$10 anyTypeKt$toArgsArray$$inlined$toAnyType$10 = AnyTypeKt$toArgsArray$$inlined$toAnyType$10.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$10), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, Class<P2> p13, Class<P3> p14, Class<P4> p15, TypeConverterProvider typeConverterProvider) {
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$11 anyTypeKt$toArgsArray$$inlined$toAnyType$11 = AnyTypeKt$toArgsArray$$inlined$toAnyType$11.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$11), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$12 anyTypeKt$toArgsArray$$inlined$toAnyType$12 = AnyTypeKt$toArgsArray$$inlined$toAnyType$12.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$12), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$13 anyTypeKt$toArgsArray$$inlined$toAnyType$13 = AnyTypeKt$toArgsArray$$inlined$toAnyType$13.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$13), typeConverterProvider);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$14 anyTypeKt$toArgsArray$$inlined$toAnyType$14 = AnyTypeKt$toArgsArray$$inlined$toAnyType$14.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$14), typeConverterProvider);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$15 anyTypeKt$toArgsArray$$inlined$toAnyType$15 = AnyTypeKt$toArgsArray$$inlined$toAnyType$15.INSTANCE;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$15), typeConverterProvider);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        Class p11;
        Class p12;
        Class p13;
        Class p14;
        Class p15;
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        } else {
            p11 = cls;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i11 & 4) != 0) {
            s.q(4, "P2");
            p13 = Object.class;
        } else {
            p13 = cls3;
        }
        if ((i11 & 8) != 0) {
            s.q(4, "P3");
            p14 = Object.class;
        } else {
            p14 = cls4;
        }
        if ((i11 & 16) != 0) {
            s.q(4, "P4");
            p15 = Object.class;
        } else {
            p15 = cls5;
        }
        TypeConverterProvider typeConverterProvider2 = (i11 & 32) != 0 ? null : typeConverterProvider;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$11 anyTypeKt$toArgsArray$$inlined$toAnyType$11 = AnyTypeKt$toArgsArray$$inlined$toAnyType$11.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$11), typeConverterProvider2);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$12 anyTypeKt$toArgsArray$$inlined$toAnyType$12 = AnyTypeKt$toArgsArray$$inlined$toAnyType$12.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$12), typeConverterProvider2);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$13 anyTypeKt$toArgsArray$$inlined$toAnyType$13 = AnyTypeKt$toArgsArray$$inlined$toAnyType$13.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$13), typeConverterProvider2);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$14 anyTypeKt$toArgsArray$$inlined$toAnyType$14 = AnyTypeKt$toArgsArray$$inlined$toAnyType$14.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$14), typeConverterProvider2);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$15 anyTypeKt$toArgsArray$$inlined$toAnyType$15 = AnyTypeKt$toArgsArray$$inlined$toAnyType$15.INSTANCE;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$15), typeConverterProvider2);
        }
        return new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4, P5> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, Class<P2> p13, Class<P3> p14, Class<P4> p15, Class<P5> p16, TypeConverterProvider typeConverterProvider) {
        AnyType anyType;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        s.k(p16, "p5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$16 anyTypeKt$toArgsArray$$inlined$toAnyType$16 = AnyTypeKt$toArgsArray$$inlined$toAnyType$16.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$16), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$17 anyTypeKt$toArgsArray$$inlined$toAnyType$17 = AnyTypeKt$toArgsArray$$inlined$toAnyType$17.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$17), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$18 anyTypeKt$toArgsArray$$inlined$toAnyType$18 = AnyTypeKt$toArgsArray$$inlined$toAnyType$18.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$18), typeConverterProvider);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$19 anyTypeKt$toArgsArray$$inlined$toAnyType$19 = AnyTypeKt$toArgsArray$$inlined$toAnyType$19.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$19), typeConverterProvider);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$20 anyTypeKt$toArgsArray$$inlined$toAnyType$20 = AnyTypeKt$toArgsArray$$inlined$toAnyType$20.INSTANCE;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$20), typeConverterProvider);
        }
        s.q(4, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$21 anyTypeKt$toArgsArray$$inlined$toAnyType$21 = AnyTypeKt$toArgsArray$$inlined$toAnyType$21.INSTANCE;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$21), typeConverterProvider);
        } else {
            anyType = anyType7;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        Class p11;
        Class p12;
        Class p13;
        Class p14;
        Class p15;
        Class p16;
        TypeConverterProvider typeConverterProvider2;
        AnyType anyType;
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        } else {
            p11 = cls;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i11 & 4) != 0) {
            s.q(4, "P2");
            p13 = Object.class;
        } else {
            p13 = cls3;
        }
        if ((i11 & 8) != 0) {
            s.q(4, "P3");
            p14 = Object.class;
        } else {
            p14 = cls4;
        }
        if ((i11 & 16) != 0) {
            s.q(4, "P4");
            p15 = Object.class;
        } else {
            p15 = cls5;
        }
        if ((i11 & 32) != 0) {
            s.q(4, "P5");
            p16 = Object.class;
        } else {
            p16 = cls6;
        }
        TypeConverterProvider typeConverterProvider3 = (i11 & 64) != 0 ? null : typeConverterProvider;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        s.k(p16, "p5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$16 anyTypeKt$toArgsArray$$inlined$toAnyType$16 = AnyTypeKt$toArgsArray$$inlined$toAnyType$16.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            typeConverterProvider2 = typeConverterProvider3;
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$16), typeConverterProvider2);
        } else {
            typeConverterProvider2 = typeConverterProvider3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$17 anyTypeKt$toArgsArray$$inlined$toAnyType$17 = AnyTypeKt$toArgsArray$$inlined$toAnyType$17.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$17), typeConverterProvider2);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$18 anyTypeKt$toArgsArray$$inlined$toAnyType$18 = AnyTypeKt$toArgsArray$$inlined$toAnyType$18.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$18), typeConverterProvider2);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$19 anyTypeKt$toArgsArray$$inlined$toAnyType$19 = AnyTypeKt$toArgsArray$$inlined$toAnyType$19.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$19), typeConverterProvider2);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$20 anyTypeKt$toArgsArray$$inlined$toAnyType$20 = AnyTypeKt$toArgsArray$$inlined$toAnyType$20.INSTANCE;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$20), typeConverterProvider2);
        }
        s.q(4, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$21 anyTypeKt$toArgsArray$$inlined$toAnyType$21 = AnyTypeKt$toArgsArray$$inlined$toAnyType$21.INSTANCE;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$21), typeConverterProvider2);
        } else {
            anyType = anyType7;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, Class<P2> p13, Class<P3> p14, Class<P4> p15, Class<P5> p16, Class<P6> p17, TypeConverterProvider typeConverterProvider) {
        AnyType anyType;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        s.k(p16, "p5");
        s.k(p17, "p6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$22 anyTypeKt$toArgsArray$$inlined$toAnyType$22 = AnyTypeKt$toArgsArray$$inlined$toAnyType$22.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$22), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$23 anyTypeKt$toArgsArray$$inlined$toAnyType$23 = AnyTypeKt$toArgsArray$$inlined$toAnyType$23.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$23), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$24 anyTypeKt$toArgsArray$$inlined$toAnyType$24 = AnyTypeKt$toArgsArray$$inlined$toAnyType$24.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$24), typeConverterProvider);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$25 anyTypeKt$toArgsArray$$inlined$toAnyType$25 = AnyTypeKt$toArgsArray$$inlined$toAnyType$25.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$25), typeConverterProvider);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$26 anyTypeKt$toArgsArray$$inlined$toAnyType$26 = AnyTypeKt$toArgsArray$$inlined$toAnyType$26.INSTANCE;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$26), typeConverterProvider);
        }
        s.q(4, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$27 anyTypeKt$toArgsArray$$inlined$toAnyType$27 = AnyTypeKt$toArgsArray$$inlined$toAnyType$27.INSTANCE;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$27), typeConverterProvider);
        }
        s.q(4, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$28 anyTypeKt$toArgsArray$$inlined$toAnyType$28 = AnyTypeKt$toArgsArray$$inlined$toAnyType$28.INSTANCE;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            s.q(3, "P6");
            anyType = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$28), typeConverterProvider);
        } else {
            anyType = anyType8;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        Class p11;
        Class p12;
        Class p13;
        Class p14;
        Class p15;
        Class p16;
        Class p17;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        AnyType anyType;
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        } else {
            p11 = cls;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i11 & 4) != 0) {
            s.q(4, "P2");
            p13 = Object.class;
        } else {
            p13 = cls3;
        }
        if ((i11 & 8) != 0) {
            s.q(4, "P3");
            p14 = Object.class;
        } else {
            p14 = cls4;
        }
        if ((i11 & 16) != 0) {
            s.q(4, "P4");
            p15 = Object.class;
        } else {
            p15 = cls5;
        }
        if ((i11 & 32) != 0) {
            s.q(4, "P5");
            p16 = Object.class;
        } else {
            p16 = cls6;
        }
        if ((i11 & 64) != 0) {
            s.q(4, "P6");
            p17 = Object.class;
        } else {
            p17 = cls7;
        }
        TypeConverterProvider typeConverterProvider2 = (i11 & 128) != 0 ? null : typeConverterProvider;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        s.k(p16, "p5");
        s.k(p17, "p6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$22 anyTypeKt$toArgsArray$$inlined$toAnyType$22 = AnyTypeKt$toArgsArray$$inlined$toAnyType$22.INSTANCE;
            i12 = 4;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$22), typeConverterProvider2);
        } else {
            i12 = 4;
        }
        s.q(i12, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$23 anyTypeKt$toArgsArray$$inlined$toAnyType$23 = AnyTypeKt$toArgsArray$$inlined$toAnyType$23.INSTANCE;
            i13 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$23), typeConverterProvider2);
        } else {
            i13 = 4;
        }
        s.q(i13, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$24 anyTypeKt$toArgsArray$$inlined$toAnyType$24 = AnyTypeKt$toArgsArray$$inlined$toAnyType$24.INSTANCE;
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$24), typeConverterProvider2);
        } else {
            i14 = 4;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$25 anyTypeKt$toArgsArray$$inlined$toAnyType$25 = AnyTypeKt$toArgsArray$$inlined$toAnyType$25.INSTANCE;
            i15 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$25), typeConverterProvider2);
        } else {
            i15 = 4;
        }
        s.q(i15, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$26 anyTypeKt$toArgsArray$$inlined$toAnyType$26 = AnyTypeKt$toArgsArray$$inlined$toAnyType$26.INSTANCE;
            i16 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$26), typeConverterProvider2);
        } else {
            i16 = 4;
        }
        s.q(i16, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$27 anyTypeKt$toArgsArray$$inlined$toAnyType$27 = AnyTypeKt$toArgsArray$$inlined$toAnyType$27.INSTANCE;
            i17 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$27), typeConverterProvider2);
        } else {
            i17 = 4;
        }
        s.q(i17, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$28 anyTypeKt$toArgsArray$$inlined$toAnyType$28 = AnyTypeKt$toArgsArray$$inlined$toAnyType$28.INSTANCE;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            s.q(3, "P6");
            anyType = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$28), typeConverterProvider2);
        } else {
            anyType = anyType8;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType};
    }

    public static final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6, P7> AnyType[] toArgsArray(Class<P0> p11, Class<P1> p12, Class<P2> p13, Class<P3> p14, Class<P4> p15, Class<P5> p16, Class<P6> p17, Class<P7> p18, TypeConverterProvider typeConverterProvider) {
        AnyType anyType;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        s.k(p16, "p5");
        s.k(p17, "p6");
        s.k(p18, "p7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$29 anyTypeKt$toArgsArray$$inlined$toAnyType$29 = AnyTypeKt$toArgsArray$$inlined$toAnyType$29.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$29), typeConverterProvider);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$30 anyTypeKt$toArgsArray$$inlined$toAnyType$30 = AnyTypeKt$toArgsArray$$inlined$toAnyType$30.INSTANCE;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$30), typeConverterProvider);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$31 anyTypeKt$toArgsArray$$inlined$toAnyType$31 = AnyTypeKt$toArgsArray$$inlined$toAnyType$31.INSTANCE;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$31), typeConverterProvider);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$32 anyTypeKt$toArgsArray$$inlined$toAnyType$32 = AnyTypeKt$toArgsArray$$inlined$toAnyType$32.INSTANCE;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$32), typeConverterProvider);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$33 anyTypeKt$toArgsArray$$inlined$toAnyType$33 = AnyTypeKt$toArgsArray$$inlined$toAnyType$33.INSTANCE;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$33), typeConverterProvider);
        }
        s.q(4, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$34 anyTypeKt$toArgsArray$$inlined$toAnyType$34 = AnyTypeKt$toArgsArray$$inlined$toAnyType$34.INSTANCE;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$34), typeConverterProvider);
        }
        s.q(4, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$35 anyTypeKt$toArgsArray$$inlined$toAnyType$35 = AnyTypeKt$toArgsArray$$inlined$toAnyType$35.INSTANCE;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            s.q(3, "P6");
            anyType8 = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$35), typeConverterProvider);
        }
        s.q(4, "P7");
        co0.d dVarB15 = o0.b(Object.class);
        s.q(3, "P7");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType9 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$36 anyTypeKt$toArgsArray$$inlined$toAnyType$36 = AnyTypeKt$toArgsArray$$inlined$toAnyType$36.INSTANCE;
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(Object.class);
            s.q(3, "P7");
            anyType = new AnyType(new LazyKType(dVarB16, false, anyTypeKt$toArgsArray$$inlined$toAnyType$36), typeConverterProvider);
        } else {
            anyType = anyType9;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8, anyType};
    }

    public static /* synthetic */ AnyType[] toArgsArray$default(Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, TypeConverterProvider typeConverterProvider, int i11, Object obj) {
        Class p11;
        Class p12;
        Class p13;
        Class p14;
        Class p15;
        Class p16;
        Class cls9;
        Class p17;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        AnyType anyType;
        if ((i11 & 1) != 0) {
            s.q(4, "P0");
            p11 = Object.class;
        } else {
            p11 = cls;
        }
        if ((i11 & 2) != 0) {
            s.q(4, "P1");
            p12 = Object.class;
        } else {
            p12 = cls2;
        }
        if ((i11 & 4) != 0) {
            s.q(4, "P2");
            p13 = Object.class;
        } else {
            p13 = cls3;
        }
        if ((i11 & 8) != 0) {
            s.q(4, "P3");
            p14 = Object.class;
        } else {
            p14 = cls4;
        }
        if ((i11 & 16) != 0) {
            s.q(4, "P4");
            p15 = Object.class;
        } else {
            p15 = cls5;
        }
        if ((i11 & 32) != 0) {
            s.q(4, "P5");
            p16 = Object.class;
        } else {
            p16 = cls6;
        }
        if ((i11 & 64) != 0) {
            s.q(4, "P6");
            cls9 = Object.class;
        } else {
            cls9 = cls7;
        }
        if ((i11 & 128) != 0) {
            s.q(4, "P7");
            p17 = Object.class;
        } else {
            p17 = cls8;
        }
        TypeConverterProvider typeConverterProvider2 = (i11 & 256) != 0 ? null : typeConverterProvider;
        s.k(p11, "p0");
        s.k(p12, "p1");
        s.k(p13, "p2");
        s.k(p14, "p3");
        s.k(p15, "p4");
        s.k(p16, "p5");
        Class p18 = cls9;
        s.k(p18, "p6");
        s.k(p17, "p7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$29 anyTypeKt$toArgsArray$$inlined$toAnyType$29 = AnyTypeKt$toArgsArray$$inlined$toAnyType$29.INSTANCE;
            i12 = 4;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, anyTypeKt$toArgsArray$$inlined$toAnyType$29), typeConverterProvider2);
        } else {
            i12 = 4;
        }
        s.q(i12, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType3 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$30 anyTypeKt$toArgsArray$$inlined$toAnyType$30 = AnyTypeKt$toArgsArray$$inlined$toAnyType$30.INSTANCE;
            i13 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType3 = new AnyType(new LazyKType(dVarB4, false, anyTypeKt$toArgsArray$$inlined$toAnyType$30), typeConverterProvider2);
        } else {
            i13 = 4;
        }
        s.q(i13, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType4 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$31 anyTypeKt$toArgsArray$$inlined$toAnyType$31 = AnyTypeKt$toArgsArray$$inlined$toAnyType$31.INSTANCE;
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType4 = new AnyType(new LazyKType(dVarB6, false, anyTypeKt$toArgsArray$$inlined$toAnyType$31), typeConverterProvider2);
        } else {
            i14 = 4;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType5 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$32 anyTypeKt$toArgsArray$$inlined$toAnyType$32 = AnyTypeKt$toArgsArray$$inlined$toAnyType$32.INSTANCE;
            i15 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType5 = new AnyType(new LazyKType(dVarB8, false, anyTypeKt$toArgsArray$$inlined$toAnyType$32), typeConverterProvider2);
        } else {
            i15 = 4;
        }
        s.q(i15, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType6 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$33 anyTypeKt$toArgsArray$$inlined$toAnyType$33 = AnyTypeKt$toArgsArray$$inlined$toAnyType$33.INSTANCE;
            i16 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType6 = new AnyType(new LazyKType(dVarB10, false, anyTypeKt$toArgsArray$$inlined$toAnyType$33), typeConverterProvider2);
        } else {
            i16 = 4;
        }
        s.q(i16, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(3, "P5");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType7 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$34 anyTypeKt$toArgsArray$$inlined$toAnyType$34 = AnyTypeKt$toArgsArray$$inlined$toAnyType$34.INSTANCE;
            i17 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType7 = new AnyType(new LazyKType(dVarB12, false, anyTypeKt$toArgsArray$$inlined$toAnyType$34), typeConverterProvider2);
        } else {
            i17 = 4;
        }
        s.q(i17, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(3, "P6");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType8 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$35 anyTypeKt$toArgsArray$$inlined$toAnyType$35 = AnyTypeKt$toArgsArray$$inlined$toAnyType$35.INSTANCE;
            i18 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            s.q(3, "P6");
            anyType8 = new AnyType(new LazyKType(dVarB14, false, anyTypeKt$toArgsArray$$inlined$toAnyType$35), typeConverterProvider2);
        } else {
            i18 = 4;
        }
        s.q(i18, "P7");
        co0.d dVarB15 = o0.b(Object.class);
        s.q(3, "P7");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType9 == null) {
            s.p();
            AnyTypeKt$toArgsArray$$inlined$toAnyType$36 anyTypeKt$toArgsArray$$inlined$toAnyType$36 = AnyTypeKt$toArgsArray$$inlined$toAnyType$36.INSTANCE;
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(Object.class);
            s.q(3, "P7");
            anyType = new AnyType(new LazyKType(dVarB16, false, anyTypeKt$toArgsArray$$inlined$toAnyType$36), typeConverterProvider2);
        } else {
            anyType = anyType9;
        }
        return new AnyType[]{anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8, anyType};
    }
}
