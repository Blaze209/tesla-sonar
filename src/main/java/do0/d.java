package do0;

import ch.qos.logback.core.CoreConstants;
import co0.f;
import co0.q;
import co0.s;
import co0.t;
import fo0.t2;
import fo0.x0;
import fo0.x2;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lco0/f;", "", "Lco0/s;", "arguments", "", "nullable", "", "annotations", "Lco0/q;", "b", "(Lco0/f;Ljava/util/List;ZLjava/util/List;)Lco0/q;", "Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;", "attributes", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "a", "(Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60798a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60798a = iArr;
        }
    }

    private static final SimpleType a(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<s> list, boolean z11) {
        TypeProjectionBase starProjectionImpl;
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        p013kotlin.jvm.internal.s.j(parameters, "getParameters(...)");
        List<s> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            s sVar = (s) obj;
            t2 t2Var = (t2) sVar.c();
            KotlinType kotlinTypeS = t2Var != null ? t2Var.getType() : null;
            t tVarD = sVar.d();
            int i13 = tVarD == null ? -1 : a.f60798a[tVarD.ordinal()];
            if (i13 == -1) {
                TypeParameterDescriptor typeParameterDescriptor = parameters.get(i11);
                p013kotlin.jvm.internal.s.j(typeParameterDescriptor, "get(...)");
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            } else if (i13 == 1) {
                Variance variance = Variance.INVARIANT;
                p013kotlin.jvm.internal.s.h(kotlinTypeS);
                starProjectionImpl = new TypeProjectionImpl(variance, kotlinTypeS);
            } else if (i13 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                p013kotlin.jvm.internal.s.h(kotlinTypeS);
                starProjectionImpl = new TypeProjectionImpl(variance2, kotlinTypeS);
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                p013kotlin.jvm.internal.s.h(kotlinTypeS);
                starProjectionImpl = new TypeProjectionImpl(variance3, kotlinTypeS);
            }
            arrayList.add(starProjectionImpl);
            i11 = i12;
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, arrayList, z11, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q b(f fVar, List<s> arguments, boolean z11, List<? extends Annotation> annotations) {
        ClassifierDescriptor descriptor;
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        p013kotlin.jvm.internal.s.k(annotations, "annotations");
        wn0.a aVar = null;
        Object[] objArr = 0;
        x0 x0Var = fVar instanceof x0 ? (x0) fVar : null;
        if (x0Var == null || (descriptor = x0Var.getDescriptor()) == null) {
            throw new x2("Cannot create type for an unsupported classifier: " + fVar + " (" + fVar.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        p013kotlin.jvm.internal.s.j(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        p013kotlin.jvm.internal.s.j(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new t2(a(annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.getEmpty(), typeConstructor, arguments, z11), aVar, 2, objArr == true ? 1 : 0);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }

    public static /* synthetic */ q c(f fVar, List list, boolean z11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = v.m();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            list2 = v.m();
        }
        return b(fVar, list, z11, list2);
    }
}
