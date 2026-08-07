package fo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 R!\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010(R\u0014\u0010*\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&¨\u00060²\u0006\u0012\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\nX\u008a\u0084\u0002"}, d2 = {"Lfo0/t2;", "Lkotlin/jvm/internal/t;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lwn0/a;)V", "Lco0/f;", "r", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Lco0/f;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "Lfo0/z2$a;", "b", "Lfo0/z2$a;", "c", "getClassifier", "()Lco0/f;", "classifier", "", "Lco0/s;", DateTokenConverter.CONVERTER_KEY, "getArguments", "()Ljava/util/List;", "arguments", "()Ljava/lang/reflect/Type;", "javaType", "isMarkedNullable", "()Z", "", "getAnnotations", "annotations", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t2 implements p013kotlin.jvm.internal.t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f66241e = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(t2.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(t2.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KotlinType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z2.a<Type> computeJavaType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z2.a classifier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z2.a arguments;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66246a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66246a = iArr;
        }
    }

    public t2(KotlinType type, wn0.a<? extends Type> aVar) {
        p013kotlin.jvm.internal.s.k(type, "type");
        this.type = type;
        z2.a<Type> aVarC = null;
        z2.a<Type> aVar2 = aVar instanceof z2.a ? (z2.a) aVar : null;
        if (aVar2 != null) {
            aVarC = aVar2;
        } else if (aVar != null) {
            aVarC = z2.c(aVar);
        }
        this.computeJavaType = aVarC;
        this.classifier = z2.c(new p2(this));
        this.arguments = z2.c(new q2(this, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(t2 t2Var, wn0.a aVar) {
        co0.s sVarD;
        List<TypeProjection> arguments = t2Var.type.getArguments();
        if (arguments.isEmpty()) {
            return p013kotlin.collections.v.m();
        }
        Lazy lazyA = jn0.m.a(jn0.p.PUBLICATION, new r2(t2Var));
        List<TypeProjection> list = arguments;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                sVarD = co0.s.INSTANCE.c();
            } else {
                KotlinType type = typeProjection.getType();
                p013kotlin.jvm.internal.s.j(type, "getType(...)");
                t2 t2Var2 = new t2(type, aVar == null ? null : new s2(t2Var, i11, lazyA));
                int i13 = a.f66246a[typeProjection.getProjectionKind().ordinal()];
                if (i13 == 1) {
                    sVarD = co0.s.INSTANCE.d(t2Var2);
                } else if (i13 == 2) {
                    sVarD = co0.s.INSTANCE.a(t2Var2);
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVarD = co0.s.INSTANCE.b(t2Var2);
                }
            }
            arrayList.add(sVarD);
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(t2 t2Var) {
        Type typeB = t2Var.b();
        p013kotlin.jvm.internal.s.h(typeB);
        return ReflectClassUtilKt.getParameterizedTypeArguments(typeB);
    }

    private static final List<Type> o(Lazy<? extends List<? extends Type>> lazy) {
        return (List) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type p(t2 t2Var, int i11, Lazy<? extends List<? extends Type>> lazy) {
        Type typeB = t2Var.b();
        if (typeB instanceof Class) {
            Class cls = (Class) typeB;
            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            p013kotlin.jvm.internal.s.h(componentType);
            return componentType;
        }
        if (typeB instanceof GenericArrayType) {
            if (i11 == 0) {
                Type genericComponentType = ((GenericArrayType) typeB).getGenericComponentType();
                p013kotlin.jvm.internal.s.h(genericComponentType);
                return genericComponentType;
            }
            throw new x2("Array type has been queried for a non-0th argument: " + t2Var);
        }
        if (!(typeB instanceof ParameterizedType)) {
            throw new x2("Non-generic type has been queried for arguments: " + t2Var);
        }
        Type type = o(lazy).get(i11);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        p013kotlin.jvm.internal.s.j(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) p013kotlin.collections.n.l0(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            p013kotlin.jvm.internal.s.j(upperBounds, "getUpperBounds(...)");
            type2 = (Type) p013kotlin.collections.n.k0(upperBounds);
        }
        p013kotlin.jvm.internal.s.h(type2);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final co0.f q(t2 t2Var) {
        return t2Var.r(t2Var.type);
    }

    private final co0.f r(KotlinType type) {
        KotlinType type2;
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = type.getConstructor().mo500getDeclarationDescriptor();
        if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor)) {
            if (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new v2(null, (TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor);
            }
            if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                return null;
            }
            throw new jn0.q("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> clsQ = i3.q((ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (TypeUtils.isNullableType(type)) {
                return new w0(clsQ);
            }
            Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(clsQ);
            if (primitiveByWrapper != null) {
                clsQ = primitiveByWrapper;
            }
            return new w0(clsQ);
        }
        TypeProjection typeProjection = (TypeProjection) p013kotlin.collections.v.W0(type.getArguments());
        if (typeProjection == null || (type2 = typeProjection.getType()) == null) {
            return new w0(clsQ);
        }
        co0.f fVarR = r(type2);
        if (fVarR != null) {
            return new w0(i3.f(vn0.a.b(eo0.b.a(fVarR))));
        }
        throw new x2("Cannot determine classifier for array element type: " + this);
    }

    @Override // p013kotlin.jvm.internal.t
    public Type b() {
        z2.a<Type> aVar = this.computeJavaType;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public boolean equals(Object other) {
        if (!(other instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) other;
        return p013kotlin.jvm.internal.s.f(this.type, t2Var.type) && p013kotlin.jvm.internal.s.f(getClassifier(), t2Var.getClassifier()) && p013kotlin.jvm.internal.s.f(getArguments(), t2Var.getArguments());
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        return i3.e(this.type);
    }

    @Override // co0.q
    public List<co0.s> getArguments() {
        T tB = this.arguments.b(this, f66241e[1]);
        p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
        return (List) tB;
    }

    @Override // co0.q
    public co0.f getClassifier() {
        return (co0.f) this.classifier.b(this, f66241e[0]);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        co0.f classifier = getClassifier();
        return ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31) + getArguments().hashCode();
    }

    @Override // co0.q
    /* JADX INFO: renamed from: isMarkedNullable */
    public boolean getIsMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final KotlinType getType() {
        return this.type;
    }

    public String toString() {
        return d3.f66112a.l(this.type);
    }

    public /* synthetic */ t2(KotlinType kotlinType, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i11 & 2) != 0 ? null : aVar);
    }
}
