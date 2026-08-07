package fo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u00108R\u0014\u0010:\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006;"}, d2 = {"Lfo0/x1;", "Lco0/l;", "Lfo0/a0;", "callable", "", "index", "Lco0/l$a;", "kind", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "computeDescriptor", "<init>", "(Lfo0/a0;ILco0/l$a;Lwn0/a;)V", "", "Ljava/lang/reflect/Type;", "types", "k", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lfo0/a0;", "m", "()Lfo0/a0;", "b", "I", "getIndex", "c", "Lco0/l$a;", "getKind", "()Lco0/l$a;", DateTokenConverter.CONVERTER_KEY, "Lfo0/z2$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "Lco0/q;", "getType", "()Lco0/q;", "type", "()Z", "isOptional", "isVararg", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 implements co0.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f66296f = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(x1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(x1.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a0<?> callable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final co0.l.a kind;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z2.a descriptor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z2.a annotations;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfo0/x1$a;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "[Ljava/lang/reflect/Type;", "getTypes", "()[Ljava/lang/reflect/Type;", "b", "I", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements Type {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Type[] types;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int hashCode;

        public a(Type[] types) {
            p013kotlin.jvm.internal.s.k(types, "types");
            this.types = types;
            this.hashCode = Arrays.hashCode(types);
        }

        public boolean equals(Object other) {
            return (other instanceof a) && Arrays.equals(this.types, ((a) other).types);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return p013kotlin.collections.n.T0(this.types, ", ", "[", "]", 0, null, null, 56, null);
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public x1(a0<?> callable, int i11, co0.l.a kind, wn0.a<? extends ParameterDescriptor> computeDescriptor) {
        p013kotlin.jvm.internal.s.k(callable, "callable");
        p013kotlin.jvm.internal.s.k(kind, "kind");
        p013kotlin.jvm.internal.s.k(computeDescriptor, "computeDescriptor");
        this.callable = callable;
        this.index = i11;
        this.kind = kind;
        this.descriptor = z2.c(computeDescriptor);
        this.annotations = z2.c(new v1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type a(x1 x1Var) {
        List listX0;
        ParameterDescriptor parameterDescriptorO = x1Var.o();
        if ((parameterDescriptorO instanceof ReceiverParameterDescriptor) && p013kotlin.jvm.internal.s.f(i3.i(x1Var.callable.U()), parameterDescriptorO) && x1Var.callable.U().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            DeclarationDescriptor containingDeclaration = x1Var.callable.U().getContainingDeclaration();
            p013kotlin.jvm.internal.s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> clsQ = i3.q((ClassDescriptor) containingDeclaration);
            if (clsQ != null) {
                return clsQ;
            }
            throw new x2("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorO);
        }
        go0.h<?> hVarM = x1Var.callable.M();
        if (!(hVarM instanceof go0.n)) {
            if (!(hVarM instanceof go0.n.b)) {
                return hVarM.a().get(x1Var.getIndex());
            }
            Class[] clsArr = (Class[]) ((go0.n.b) hVarM).d().get(x1Var.getIndex()).toArray(new Class[0]);
            return x1Var.k((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (x1Var.callable.S()) {
            go0.n nVar = (go0.n) hVarM;
            bo0.j jVarF = nVar.f(x1Var.getIndex() + 1);
            int last = nVar.f(0).getLast() + 1;
            listX0 = p013kotlin.collections.v.X0(nVar.a(), new bo0.j(jVarF.getFirst() - last, jVarF.getLast() - last));
        } else {
            go0.n nVar2 = (go0.n) hVarM;
            listX0 = p013kotlin.collections.v.X0(nVar2.a(), nVar2.f(x1Var.getIndex()));
        }
        Type[] typeArr = (Type[]) listX0.toArray(new Type[0]);
        return x1Var.k((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(x1 x1Var) {
        return i3.e(x1Var.o());
    }

    private final Type k(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new a(types) : (Type) p013kotlin.collections.n.e1(types);
        }
        throw new vn0.c("Expected at least 1 type for compound type");
    }

    private final ParameterDescriptor o() {
        T tB = this.descriptor.b(this, f66296f[0]);
        p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
        return (ParameterDescriptor) tB;
    }

    @Override // co0.l
    public boolean e() {
        ParameterDescriptor parameterDescriptorO = o();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorO instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorO : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    public boolean equals(Object other) {
        if (!(other instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) other;
        return p013kotlin.jvm.internal.s.f(this.callable, x1Var.callable) && getIndex() == x1Var.getIndex();
    }

    @Override // co0.b
    public List<Annotation> getAnnotations() {
        T tB = this.annotations.b(this, f66296f[1]);
        p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
        return (List) tB;
    }

    @Override // co0.l
    public int getIndex() {
        return this.index;
    }

    @Override // co0.l
    public co0.l.a getKind() {
        return this.kind;
    }

    @Override // co0.l
    public String getName() {
        ParameterDescriptor parameterDescriptorO = o();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorO instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorO : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        p013kotlin.jvm.internal.s.j(name, "getName(...)");
        if (name.isSpecial()) {
            return null;
        }
        return name.asString();
    }

    @Override // co0.l
    public co0.q getType() {
        KotlinType type = o().getType();
        p013kotlin.jvm.internal.s.j(type, "getType(...)");
        return new t2(type, new w1(this));
    }

    public int hashCode() {
        return (this.callable.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    @Override // co0.l
    public boolean isVararg() {
        ParameterDescriptor parameterDescriptorO = o();
        return (parameterDescriptorO instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorO).getVarargElementType() != null;
    }

    public final a0<?> m() {
        return this.callable;
    }

    public String toString() {
        return d3.f66112a.j(this);
    }
}
