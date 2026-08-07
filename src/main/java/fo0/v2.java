package fo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lfo0/v2;", "Lco0/r;", "Lfo0/x0;", "Lfo0/w2;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lfo0/w2;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lfo0/w0;", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Lfo0/w0;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "Ljava/lang/Class;", "b", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;)Ljava/lang/Class;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lco0/q;", "Lfo0/z2$a;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "c", "Lfo0/w2;", "getName", "name", "Lco0/t;", "getVariance", "()Lco0/t;", "variance", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v2 implements co0.r, x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f66264d = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(v2.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TypeParameterDescriptor descriptor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z2.a upperBounds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w2 container;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66268a;

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
            f66268a = iArr;
        }
    }

    public v2(w2 w2Var, TypeParameterDescriptor descriptor) {
        w0<?> w0VarE;
        Object objAccept;
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.upperBounds = z2.c(new u2(this));
        if (w2Var == null) {
            DeclarationDescriptor containingDeclaration = getDescriptor().getContainingDeclaration();
            p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
            if (containingDeclaration instanceof ClassDescriptor) {
                objAccept = e((ClassDescriptor) containingDeclaration);
            } else {
                if (!(containingDeclaration instanceof CallableMemberDescriptor)) {
                    throw new x2("Unknown type parameter container: " + containingDeclaration);
                }
                DeclarationDescriptor containingDeclaration2 = ((CallableMemberDescriptor) containingDeclaration).getContainingDeclaration();
                p013kotlin.jvm.internal.s.j(containingDeclaration2, "getContainingDeclaration(...)");
                if (containingDeclaration2 instanceof ClassDescriptor) {
                    w0VarE = e((ClassDescriptor) containingDeclaration2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = containingDeclaration instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) containingDeclaration : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new x2("Non-class callable descriptor must be deserialized: " + containingDeclaration);
                    }
                    co0.d dVarE = vn0.a.e(b(deserializedMemberDescriptor));
                    p013kotlin.jvm.internal.s.i(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    w0VarE = (w0) dVarE;
                }
                objAccept = containingDeclaration.accept(new j(w0VarE), jn0.h0.f84049a);
            }
            w2Var = (w2) objAccept;
        }
        this.container = w2Var;
    }

    private final Class<?> b(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        Class<?> klass;
        DeserializedContainerSource containerSource = deserializedMemberDescriptor.getContainerSource();
        JvmPackagePartSource jvmPackagePartSource = containerSource instanceof JvmPackagePartSource ? (JvmPackagePartSource) containerSource : null;
        KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource != null ? jvmPackagePartSource.getKnownJvmBinaryClass() : null;
        ReflectKotlinClass reflectKotlinClass = knownJvmBinaryClass instanceof ReflectKotlinClass ? (ReflectKotlinClass) knownJvmBinaryClass : null;
        if (reflectKotlinClass != null && (klass = reflectKotlinClass.getKlass()) != null) {
            return klass;
        }
        throw new x2("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
    }

    private final w0<?> e(ClassDescriptor classDescriptor) {
        Class<?> clsQ = i3.q(classDescriptor);
        w0<?> w0Var = (w0) (clsQ != null ? vn0.a.e(clsQ) : null);
        if (w0Var != null) {
            return w0Var;
        }
        throw new x2("Type parameter container is not resolved: " + classDescriptor.getContainingDeclaration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(v2 v2Var) {
        List<KotlinType> upperBounds = v2Var.getDescriptor().getUpperBounds();
        p013kotlin.jvm.internal.s.j(upperBounds, "getUpperBounds(...)");
        List<KotlinType> list = upperBounds;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new t2((KotlinType) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // fo0.x0
    /* JADX INFO: renamed from: d, reason: from getter */
    public TypeParameterDescriptor getDescriptor() {
        return this.descriptor;
    }

    public boolean equals(Object other) {
        if (!(other instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) other;
        return p013kotlin.jvm.internal.s.f(this.container, v2Var.container) && p013kotlin.jvm.internal.s.f(getName(), v2Var.getName());
    }

    @Override // co0.r
    public String getName() {
        String strAsString = getDescriptor().getName().asString();
        p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // co0.r
    public List<co0.q> getUpperBounds() {
        T tB = this.upperBounds.b(this, f66264d[0]);
        p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
        return (List) tB;
    }

    @Override // co0.r
    public co0.t getVariance() {
        int i11 = a.f66268a[getDescriptor().getVariance().ordinal()];
        if (i11 == 1) {
            return co0.t.INVARIANT;
        }
        if (i11 == 2) {
            return co0.t.IN;
        }
        if (i11 == 3) {
            return co0.t.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        return p013kotlin.jvm.internal.v0.INSTANCE.a(this);
    }
}
