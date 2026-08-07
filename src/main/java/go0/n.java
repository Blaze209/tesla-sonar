package go0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import fo0.c1;
import fo0.i3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0015\u0017B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010+¨\u0006-"}, d2 = {"Lgo0/n;", "Ljava/lang/reflect/Member;", Gender.MALE, "Lgo0/h;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lgo0/h;Z)V", "", "index", "Lbo0/j;", "f", "(I)Lbo0/j;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Z", "b", "Lgo0/h;", "caller", "c", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "Lgo0/n$a;", DateTokenConverter.CONVERTER_KEY, "Lgo0/n$a;", "data", "e", "[Lbo0/j;", "slices", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n<M extends Member> implements h<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<M> caller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bo0.j[] slices;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasMfvcParameters;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo0/n$a;", "", "Lbo0/j;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Lbo0/j;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "a", "Lbo0/j;", "()Lbo0/j;", "b", "[Ljava/util/List;", "c", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final bo0.j argumentRange;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method>[] unboxParameters;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Method box;

        public a(bo0.j argumentRange, List<Method>[] unboxParameters, Method method) {
            s.k(argumentRange, "argumentRange");
            s.k(unboxParameters, "unboxParameters");
            this.argumentRange = argumentRange;
            this.unboxParameters = unboxParameters;
            this.box = method;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final bo0.j getArgumentRange() {
            return this.argumentRange;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getBox() {
            return this.box;
        }

        public final List<Method>[] c() {
            return this.unboxParameters;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u0014\u0010\u001eR\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010#R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lgo0/n$b;", "Lgo0/h;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "Lfo0/c1;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lfo0/c1;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "constructorImpl", "b", "boxMethod", "c", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "e", "parameterTypes", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method constructorImpl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method boxMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<List<Method>> parameterUnboxMethods;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<List<Class<?>>> originalParametersGroups;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<Type> parameterTypes;

        public b(FunctionDescriptor descriptor, c1 container, String constructorDesc, List<? extends ParameterDescriptor> originalParameters) {
            Collection collectionE;
            s.k(descriptor, "descriptor");
            s.k(container, "container");
            s.k(constructorDesc, "constructorDesc");
            s.k(originalParameters, "originalParameters");
            Method methodU = container.u("constructor-impl", constructorDesc);
            s.h(methodU);
            this.constructorImpl = methodU;
            Method methodU2 = container.u("box-impl", t.W0(constructorDesc, "V") + ReflectClassUtilKt.getDesc(container.a()));
            s.h(methodU2);
            this.boxMethod = methodU2;
            List<? extends ParameterDescriptor> list = originalParameters;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                s.j(type, "getType(...)");
                arrayList.add(o.p(TypeSubstitutionKt.asSimpleType(type), descriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(v.y(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = ((ParameterDescriptor) obj).getType().getConstructor().mo500getDeclarationDescriptor();
                s.i(classifierDescriptorMo500getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
                List<Method> list2 = this.parameterUnboxMethods.get(i11);
                if (list2 != null) {
                    List<Method> list3 = list2;
                    collectionE = new ArrayList(v.y(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsQ = i3.q(classDescriptor);
                    s.h(clsQ);
                    collectionE = v.e(clsQ);
                }
                arrayList2.add(collectionE);
                i11 = i12;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = v.A(arrayList2);
        }

        @Override // go0.h
        public List<Type> a() {
            return this.parameterTypes;
        }

        @Override // go0.h
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) c();
        }

        public Void c() {
            return null;
        }

        @Override // go0.h
        public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
            Collection collectionE;
            s.k(args, "args");
            List<Pair> listN1 = p013kotlin.collections.n.N1(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listN1) {
                Object objA = pair.a();
                List list = (List) pair.b();
                if (list != null) {
                    List list2 = list;
                    collectionE = new ArrayList(v.y(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = v.e(objA);
                }
                v.E(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        public final List<List<Class<?>>> d() {
            return this.originalParametersGroups;
        }

        @Override // go0.h
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            s.j(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[LOOP:1: B:25:0x007c->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    public n(CallableMemberDescriptor descriptor, h<? extends M> oldCaller, boolean z11) {
        Class clsT;
        int i11;
        a aVar;
        KotlinType kotlinTypeSubstitutedUnderlyingType;
        ArrayList arrayList;
        Iterator<T> it;
        s.k(descriptor, "descriptor");
        s.k(oldCaller, "oldCaller");
        this.isDefault = z11;
        boolean z12 = false;
        if (oldCaller instanceof i.h.c) {
            ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            extensionReceiverParameter = extensionReceiverParameter == null ? descriptor.getDispatchReceiverParameter() : extensionReceiverParameter;
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null && InlineClassesUtilsKt.needsMfvcFlattening(type)) {
                if (z11) {
                    List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                    s.j(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list = valueParameters;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                    List<Method> listN = o.n(TypeSubstitutionKt.asSimpleType(type));
                                    s.h(listN);
                                    List<Method> list2 = listN;
                                    arrayList = new ArrayList(v.y(list2, 10));
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((i.h.c) oldCaller).getBoundReceiver(), null));
                                    }
                                    oldCaller = new i.h.d(((i.h) oldCaller).b(), arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    List<Method> listN2 = o.n(TypeSubstitutionKt.asSimpleType(type));
                    s.h(listN2);
                    List<Method> list3 = listN2;
                    arrayList = new ArrayList(v.y(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((i.h.c) oldCaller).getBoundReceiver(), null));
                    }
                    oldCaller = new i.h.d(((i.h) oldCaller).b(), arrayList.toArray(new Object[0]));
                }
            }
        }
        this.caller = (h<M>) oldCaller;
        this.member = (M) oldCaller.b();
        KotlinType returnType = descriptor.getReturnType();
        s.h(returnType);
        boolean z13 = descriptor instanceof FunctionDescriptor;
        Method methodK = ((z13 && ((FunctionDescriptor) descriptor).isSuspend() && (kotlinTypeSubstitutedUnderlyingType = InlineClassesUtilsKt.substitutedUnderlyingType(returnType)) != null && KotlinBuiltIns.isPrimitiveType(kotlinTypeSubstitutedUnderlyingType)) || (clsT = o.t(returnType)) == null) ? null : o.k(clsT, descriptor);
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            aVar = new a(bo0.j.INSTANCE.a(), new List[0], methodK);
        } else {
            int i12 = -1;
            if (!(oldCaller instanceof i.h.c) && !(oldCaller instanceof i.h.d)) {
                if (descriptor instanceof ConstructorDescriptor) {
                    if (!(oldCaller instanceof g)) {
                        i12 = 0;
                    }
                } else if (descriptor.getDispatchReceiverParameter() == null || (oldCaller instanceof g)) {
                    i12 = 0;
                } else {
                    DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                    s.j(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                }
            }
            int i13 = oldCaller instanceof i.h.d ? -oldCaller.h() : i12;
            List listR = o.r(descriptor, oldCaller.b(), m.f69291a);
            if (this.isDefault) {
                Iterator it3 = listR.iterator();
                int iE = 0;
                while (it3.hasNext()) {
                    iE += e((KotlinType) it3.next());
                }
                i11 = ((iE + 31) / 32) + 1;
            } else {
                i11 = 0;
            }
            int i14 = i11 + ((z13 && ((FunctionDescriptor) descriptor).isSuspend()) ? 1 : 0);
            Iterator it4 = listR.iterator();
            int iE2 = 0;
            while (it4.hasNext()) {
                iE2 += e((KotlinType) it4.next());
            }
            int i15 = iE2 + i13 + i14;
            o.g(this, i15, descriptor, this.isDefault);
            bo0.j jVarW = bo0.n.w(Math.max(i12, 0), listR.size() + i12);
            List[] listArr = new List[i15];
            int i16 = 0;
            while (i16 < i15) {
                listArr[i16] = (i16 > jVarW.getLast() || jVarW.getFirst() > i16) ? null : o.p(TypeSubstitutionKt.asSimpleType((KotlinType) listR.get(i16 - i12)), descriptor);
                i16++;
            }
            aVar = new a(jVarW, listArr, methodK);
        }
        this.data = aVar;
        List listC = v.c();
        h<M> hVar = this.caller;
        int length = hVar instanceof i.h.d ? ((i.h.d) hVar).getBoundReceiverComponents().length : hVar instanceof i.h.c ? 1 : 0;
        if (length > 0) {
            listC.add(bo0.n.w(0, length));
        }
        List<Method>[] listArrC = aVar.c();
        int length2 = listArrC.length;
        int i17 = 0;
        while (i17 < length2) {
            List<Method> list4 = listArrC[i17];
            int size = (list4 != null ? list4.size() : 1) + length;
            listC.add(bo0.n.w(length, size));
            i17++;
            length = size;
        }
        this.slices = (bo0.j[]) v.a(listC).toArray(new bo0.j[0]);
        Iterable argumentRange = this.data.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it5 = argumentRange.iterator();
            while (it5.hasNext()) {
                List<Method> list5 = this.data.c()[((s0) it5).nextInt()];
                if (list5 != null && list5.size() > 1) {
                    z12 = true;
                    break;
                }
            }
        }
        this.hasMfvcParameters = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(ClassDescriptor makeKotlinParameterTypes) {
        s.k(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return InlineClassesUtilsKt.isValueClass(makeKotlinParameterTypes);
    }

    private static final int e(KotlinType kotlinType) {
        List<Method> listN = o.n(TypeSubstitutionKt.asSimpleType(kotlinType));
        if (listN != null) {
            return listN.size();
        }
        return 1;
    }

    @Override // go0.h
    public List<Type> a() {
        return this.caller.a();
    }

    @Override // go0.h
    public M b() {
        return this.member;
    }

    @Override // go0.h
    public Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        s.k(args, "args");
        bo0.j argumentRange = this.data.getArgumentRange();
        List<Method>[] listArrC = this.data.c();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listD = v.d(args.length);
                int first = argumentRange.getFirst();
                for (int i11 = 0; i11 < first; i11++) {
                    listD.add(args[i11]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = listArrC[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listD;
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    s.j(returnType, "getReturnType(...)");
                                    objG2 = i3.g(returnType);
                                }
                                list2.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int iU0 = p013kotlin.collections.n.u0(args);
                if (last2 <= iU0) {
                    while (true) {
                        listD.add(args[last2]);
                        if (last2 == iU0) {
                            break;
                        }
                        last2++;
                    }
                }
                args = v.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i12 = 0; i12 < length; i12++) {
                    int first3 = argumentRange.getFirst();
                    if (i12 > argumentRange.getLast() || first3 > i12) {
                        objG = args[i12];
                    } else {
                        List<Method> list3 = listArrC[i12];
                        Method method2 = list3 != null ? (Method) v.U0(list3) : null;
                        objG = args[i12];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                s.j(returnType2, "getReturnType(...)");
                                objG = i3.g(returnType2);
                            }
                        }
                    }
                    objArr[i12] = objG;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == IntrinsicsKt.getCOROUTINE_SUSPENDED() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final bo0.j f(int index) {
        if (index >= 0) {
            bo0.j[] jVarArr = this.slices;
            if (index < jVarArr.length) {
                return jVarArr[index];
            }
        }
        bo0.j[] jVarArr2 = this.slices;
        if (jVarArr2.length == 0) {
            return new bo0.j(index, index);
        }
        int length = (index - jVarArr2.length) + ((bo0.j) p013kotlin.collections.n.U0(jVarArr2)).getLast() + 1;
        return new bo0.j(length, length);
    }

    @Override // go0.h
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
