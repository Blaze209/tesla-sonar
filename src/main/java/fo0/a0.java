package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.reflect.full.IllegalCallableAccessException;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J3\u0010\u001f\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020# $*\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R.\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n $*\n\u0012\u0004\u0012\u00020\n\u0018\u00010(0(0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\"\u0010-\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010+0+0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R.\u00100\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. $*\n\u0012\u0004\u0012\u00020.\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R2\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 $*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0006\u0012\u0002\b\u0003088&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u0001088&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010L\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010FR\u0016\u0010S\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010CR\u0014\u0010U\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010CR\u0014\u0010V\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010CR\u0014\u0010W\u001a\u0002048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010CR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lfo0/a0;", "R", "Lco0/c;", "Lfo0/w2;", "<init>", "()V", "", "", "L", "()[Ljava/lang/Object;", "Lco0/l;", "parameter", "", "Q", "(Lco0/l;)I", "", "args", "H", "(Ljava/util/Map;)Ljava/lang/Object;", "Lco0/q;", "type", "J", "(Lco0/q;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "K", "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/Continuation;", "continuationArgument", "I", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfo0/z2$a;", "", "", "kotlin.jvm.PlatformType", "a", "Lfo0/z2$a;", "_annotations", "Ljava/util/ArrayList;", "b", "_parameters", "Lfo0/t2;", "c", "_returnType", "Lfo0/v2;", DateTokenConverter.CONVERTER_KEY, "_typeParameters", "e", "_absentArguments", "Lkotlin/Lazy;", "", "f", "Lkotlin/Lazy;", "parametersNeedMFVCFlattening", "Lgo0/h;", Gender.MALE, "()Lgo0/h;", "caller", Gender.OTHER, "defaultCaller", "Lfo0/c1;", Gender.NONE, "()Lfo0/c1;", "container", "S", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lco0/q;", "returnType", "Lco0/r;", "getTypeParameters", "typeParameters", "Lco0/u;", "getVisibility", "()Lco0/u;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a0<R> implements co0.c<R>, w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z2.a<List<Annotation>> _annotations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z2.a<ArrayList<co0.l>> _parameters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z2.a<t2> _returnType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z2.a<List<v2>> _typeParameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z2.a<Object[]> _absentArguments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Boolean> parametersNeedMFVCFlattening;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((co0.l) t11).getName(), ((co0.l) t12).getName());
        }
    }

    public a0() {
        z2.a<List<Annotation>> aVarC = z2.c(new q(this));
        p013kotlin.jvm.internal.s.j(aVarC, "lazySoft(...)");
        this._annotations = aVarC;
        z2.a<ArrayList<co0.l>> aVarC2 = z2.c(new r(this));
        p013kotlin.jvm.internal.s.j(aVarC2, "lazySoft(...)");
        this._parameters = aVarC2;
        z2.a<t2> aVarC3 = z2.c(new s(this));
        p013kotlin.jvm.internal.s.j(aVarC3, "lazySoft(...)");
        this._returnType = aVarC3;
        z2.a<List<v2>> aVarC4 = z2.c(new t(this));
        p013kotlin.jvm.internal.s.j(aVarC4, "lazySoft(...)");
        this._typeParameters = aVarC4;
        z2.a<Object[]> aVarC5 = z2.c(new u(this));
        p013kotlin.jvm.internal.s.j(aVarC5, "lazySoft(...)");
        this._absentArguments = aVarC5;
        this.parametersNeedMFVCFlattening = jn0.m.a(jn0.p.PUBLICATION, new v(this));
    }

    private final R H(Map<co0.l, ? extends Object> args) throws IllegalCallableAccessException {
        Object objJ;
        List<co0.l> parameters = getParameters();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(parameters, 10));
        for (co0.l lVar : parameters) {
            if (args.containsKey(lVar)) {
                objJ = args.get(lVar);
                if (objJ == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + lVar + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            } else if (lVar.e()) {
                objJ = null;
            } else {
                if (!lVar.isVararg()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
                }
                objJ = J(lVar.getType());
            }
            arrayList.add(objJ);
        }
        go0.h<?> hVarO = O();
        if (hVarO != null) {
            try {
                return (R) hVarO.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        throw new x2("This callable does not support a default call: " + U());
    }

    private final Object J(co0.q type) {
        Class clsB = vn0.a.b(eo0.b.b(type));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            p013kotlin.jvm.internal.s.j(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new x2("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type K() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objC0 = p013kotlin.collections.v.C0(M().a());
            ParameterizedType parameterizedType = objC0 instanceof ParameterizedType ? (ParameterizedType) objC0 : null;
            if (p013kotlin.jvm.internal.s.f(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                p013kotlin.jvm.internal.s.j(actualTypeArguments, "getActualTypeArguments(...)");
                Object objE1 = p013kotlin.collections.n.e1(actualTypeArguments);
                WildcardType wildcardType = objE1 instanceof WildcardType ? (WildcardType) objE1 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) p013kotlin.collections.n.k0(lowerBounds);
                }
            }
        }
        return null;
    }

    private final Object[] L() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    private final int Q(co0.l parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!i3.k(parameter.getType())) {
            return 1;
        }
        co0.q type = parameter.getType();
        p013kotlin.jvm.internal.s.i(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> listN = go0.o.n(TypeSubstitutionKt.asSimpleType(((t2) type).getType()));
        p013kotlin.jvm.internal.s.h(listN);
        return listN.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T(a0 a0Var) {
        List<co0.l> parameters = a0Var.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (i3.k(((co0.l) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] o(a0 a0Var) {
        int iQ;
        List<co0.l> parameters = a0Var.getParameters();
        int size = parameters.size() + (a0Var.isSuspend() ? 1 : 0);
        if (a0Var.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            iQ = 0;
            for (co0.l lVar : parameters) {
                iQ += lVar.getKind() == co0.l.a.VALUE ? a0Var.Q(lVar) : 0;
            }
        } else {
            List<co0.l> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                iQ = 0;
            } else {
                Iterator<T> it = list.iterator();
                iQ = 0;
                while (it.hasNext()) {
                    if (((co0.l) it.next()).getKind() == co0.l.a.VALUE && (iQ = iQ + 1) < 0) {
                        p013kotlin.collections.v.w();
                    }
                }
            }
        }
        int i11 = (iQ + 31) / 32;
        Object[] objArr = new Object[size + i11 + 1];
        for (co0.l lVar2 : parameters) {
            if (lVar2.e() && !i3.l(lVar2.getType())) {
                objArr[lVar2.getIndex()] = i3.g(eo0.c.f(lVar2.getType()));
            } else if (lVar2.isVararg()) {
                objArr[lVar2.getIndex()] = a0Var.J(lVar2.getType());
            }
        }
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[size + i12] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(a0 a0Var) {
        return i3.e(a0Var.U());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList q(a0 a0Var) {
        int i11;
        CallableMemberDescriptor callableMemberDescriptorP = a0Var.U();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (a0Var.S()) {
            i11 = 0;
        } else {
            ReceiverParameterDescriptor receiverParameterDescriptorI = i3.i(callableMemberDescriptorP);
            if (receiverParameterDescriptorI != null) {
                arrayList.add(new x1(a0Var, 0, co0.l.a.INSTANCE, new w(receiverParameterDescriptorI)));
                i11 = 1;
            } else {
                i11 = 0;
            }
            ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptorP.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                arrayList.add(new x1(a0Var, i11, co0.l.a.EXTENSION_RECEIVER, new x(extensionReceiverParameter)));
                i11++;
            }
        }
        int size = callableMemberDescriptorP.getValueParameters().size();
        while (i12 < size) {
            arrayList.add(new x1(a0Var, i11, co0.l.a.VALUE, new y(callableMemberDescriptorP, i12)));
            i12++;
            i11++;
        }
        if (a0Var.R() && (callableMemberDescriptorP instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            p013kotlin.collections.v.C(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor t(CallableMemberDescriptor callableMemberDescriptor, int i11) {
        ValueParameterDescriptor valueParameterDescriptor = callableMemberDescriptor.getValueParameters().get(i11);
        p013kotlin.jvm.internal.s.j(valueParameterDescriptor, "get(...)");
        return valueParameterDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t2 u(a0 a0Var) {
        KotlinType returnType = a0Var.U().getReturnType();
        p013kotlin.jvm.internal.s.h(returnType);
        return new t2(returnType, new z(a0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type v(a0 a0Var) {
        Type typeK = a0Var.K();
        return typeK == null ? a0Var.M().getReturnType() : typeK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(a0 a0Var) {
        List<TypeParameterDescriptor> typeParameters = a0Var.U().getTypeParameters();
        p013kotlin.jvm.internal.s.j(typeParameters, "getTypeParameters(...)");
        List<TypeParameterDescriptor> list = typeParameters;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            p013kotlin.jvm.internal.s.h(typeParameterDescriptor);
            arrayList.add(new v2(a0Var, typeParameterDescriptor));
        }
        return arrayList;
    }

    public final R I(Map<co0.l, ? extends Object> args, Continuation<?> continuationArgument) throws IllegalCallableAccessException {
        p013kotlin.jvm.internal.s.k(args, "args");
        List<co0.l> parameters = getParameters();
        boolean z11 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) M().call(isSuspend() ? new Continuation[]{continuationArgument} : new Continuation[0]);
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrL = L();
        if (isSuspend()) {
            objArrL[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i11 = 0;
        for (co0.l lVar : parameters) {
            int iQ = zBooleanValue ? Q(lVar) : 1;
            if (args.containsKey(lVar)) {
                objArrL[lVar.getIndex()] = args.get(lVar);
            } else if (lVar.e()) {
                if (zBooleanValue) {
                    int i12 = i11 + iQ;
                    for (int i13 = i11; i13 < i12; i13++) {
                        int i14 = (i13 / 32) + size;
                        Object obj = objArrL[i14];
                        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrL[i14] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i13 % 32)));
                    }
                } else {
                    int i15 = (i11 / 32) + size;
                    Object obj2 = objArrL[i15];
                    p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrL[i15] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i11 % 32)));
                }
                z11 = true;
            } else if (!lVar.isVararg()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + lVar);
            }
            if (lVar.getKind() == co0.l.a.VALUE) {
                i11 += iQ;
            }
        }
        if (!z11) {
            try {
                go0.h<?> hVarM = M();
                Object[] objArrCopyOf = Arrays.copyOf(objArrL, size);
                p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(...)");
                return (R) hVarM.call(objArrCopyOf);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        go0.h<?> hVarO = O();
        if (hVarO != null) {
            try {
                return (R) hVarO.call(objArrL);
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        throw new x2("This callable does not support a default call: " + U());
    }

    public abstract go0.h<?> M();

    /* JADX INFO: renamed from: N */
    public abstract c1 getContainer();

    public abstract go0.h<?> O();

    /* JADX INFO: renamed from: P */
    public abstract CallableMemberDescriptor U();

    protected final boolean R() {
        return p013kotlin.jvm.internal.s.f(getName(), "<init>") && getContainer().a().isAnnotation();
    }

    public abstract boolean S();

    @Override // co0.c
    public R call(Object... args) throws IllegalCallableAccessException {
        p013kotlin.jvm.internal.s.k(args, "args");
        try {
            return (R) M().call(args);
        } catch (IllegalAccessException e11) {
            throw new IllegalCallableAccessException(e11);
        }
    }

    @Override // co0.c
    public R callBy(Map<co0.l, ? extends Object> args) {
        p013kotlin.jvm.internal.s.k(args, "args");
        return R() ? H(args) : I(args, null);
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        p013kotlin.jvm.internal.s.j(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // co0.c
    public List<co0.l> getParameters() {
        ArrayList<co0.l> arrayListInvoke = this._parameters.invoke();
        p013kotlin.jvm.internal.s.j(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // co0.c
    public co0.q getReturnType() {
        t2 t2VarInvoke = this._returnType.invoke();
        p013kotlin.jvm.internal.s.j(t2VarInvoke, "invoke(...)");
        return t2VarInvoke;
    }

    @Override // co0.c
    public List<co0.r> getTypeParameters() {
        List<v2> listInvoke = this._typeParameters.invoke();
        p013kotlin.jvm.internal.s.j(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // co0.c
    public co0.u getVisibility() {
        DescriptorVisibility visibility = U().getVisibility();
        p013kotlin.jvm.internal.s.j(visibility, "getVisibility(...)");
        return i3.r(visibility);
    }

    @Override // co0.c
    public boolean isAbstract() {
        return U().getModality() == Modality.ABSTRACT;
    }

    @Override // co0.c
    public boolean isFinal() {
        return U().getModality() == Modality.FINAL;
    }

    @Override // co0.c
    public boolean isOpen() {
        return U().getModality() == Modality.OPEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor r(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor s(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }
}
