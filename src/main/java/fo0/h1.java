package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ5\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\"2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001f\u0010>\u001a\u0006\u0012\u0002\b\u0003098VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R!\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u0001098VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010,R\u0014\u0010I\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010*R\u0014\u0010J\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0014\u0010K\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010ER\u0014\u0010L\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010ER\u0014\u0010M\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010ER\u0014\u0010N\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010E¨\u0006O"}, d2 = {"Lfo0/h1;", "Lfo0/a0;", "", "Lco0/h;", "Lkotlin/jvm/internal/n;", "Lfo0/l;", "Lfo0/c1;", "container", "", "name", "signature", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lfo0/c1;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(Lfo0/c1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "g0", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "Ljava/lang/reflect/Method;", "member", "", "h0", "(Ljava/lang/reflect/Method;)Z", "Lgo0/i$h;", "b0", "(Ljava/lang/reflect/Method;)Lgo0/i$h;", "a0", "Z", "Ljava/lang/reflect/Constructor;", "isDefault", "Lgo0/i;", "Y", "(Ljava/lang/reflect/Constructor;Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;Z)Lgo0/i;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "Lfo0/c1;", Gender.NONE, "()Lfo0/c1;", "h", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "j", "Lfo0/z2$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lgo0/h;", "k", "Lkotlin/Lazy;", Gender.MALE, "()Lgo0/h;", "caller", "l", Gender.OTHER, "defaultCaller", "e0", "()Ljava/lang/Object;", "S", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1 extends a0<Object> implements p013kotlin.jvm.internal.n<Object>, co0.h<Object>, l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f66139m = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(h1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c1 container;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final z2.a descriptor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy caller;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy defaultCaller;

    /* synthetic */ h1(c1 c1Var, String str, String str2, FunctionDescriptor functionDescriptor, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, str, str2, functionDescriptor, (i11 & 16) != 0 ? p013kotlin.jvm.internal.f.NO_RECEIVER : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final go0.h X(h1 h1Var) {
        Object objD;
        go0.i<Constructor<?>> iVarA0;
        n nVarG = e3.f66120a.g(h1Var.U());
        if (nVarG instanceof n.d) {
            if (h1Var.R()) {
                Class<?> clsA = h1Var.getContainer().a();
                List<co0.l> parameters = h1Var.getParameters();
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((co0.l) it.next()).getName();
                    p013kotlin.jvm.internal.s.h(name);
                    arrayList.add(name);
                }
                return new go0.a(clsA, arrayList, go0.a.EnumC1418a.POSITIONAL_CALL, go0.a.b.KOTLIN, null, 16, null);
            }
            objD = h1Var.getContainer().p(((n.d) nVarG).b());
        } else if (nVarG instanceof n.e) {
            FunctionDescriptor functionDescriptorU = h1Var.U();
            DeclarationDescriptor containingDeclaration = functionDescriptorU.getContainingDeclaration();
            p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
            if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (functionDescriptorU instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorU).isPrimary()) {
                FunctionDescriptor functionDescriptorU2 = h1Var.U();
                c1 container = h1Var.getContainer();
                String strB = ((n.e) nVarG).b();
                List<ValueParameterDescriptor> valueParameters = h1Var.U().getValueParameters();
                p013kotlin.jvm.internal.s.j(valueParameters, "getValueParameters(...)");
                return new go0.n.b(functionDescriptorU2, container, strB, valueParameters);
            }
            n.e eVar = (n.e) nVarG;
            objD = h1Var.getContainer().u(eVar.c(), eVar.b());
        } else if (nVarG instanceof n.c) {
            objD = ((n.c) nVarG).getMethod();
            p013kotlin.jvm.internal.s.i(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(nVarG instanceof n.b)) {
                if (!(nVarG instanceof n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Method> listD = ((n.a) nVarG).d();
                Class<?> clsA2 = h1Var.getContainer().a();
                List<Method> list = listD;
                ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new go0.a(clsA2, arrayList2, go0.a.EnumC1418a.POSITIONAL_CALL, go0.a.b.JAVA, listD);
            }
            objD = ((n.b) nVarG).d();
            p013kotlin.jvm.internal.s.i(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            iVarA0 = h1Var.Y((Constructor) objD, h1Var.U(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new x2("Could not compute caller for function: " + h1Var.U() + " (member = " + objD + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            Method method = (Method) objD;
            if (Modifier.isStatic(method.getModifiers())) {
                iVarA0 = h1Var.U().getAnnotations().mo496findAnnotation(i3.j()) != null ? h1Var.a0(method) : h1Var.b0(method);
            } else {
                iVarA0 = h1Var.Z(method);
            }
        }
        return go0.o.j(iVarA0, h1Var.U(), false, 2, null);
    }

    private final go0.i<Constructor<?>> Y(Constructor<?> member, FunctionDescriptor descriptor, boolean isDefault) {
        if (isDefault || !InlineClassManglingRulesKt.shouldHideConstructorDueToValueClassTypeValueParameters(descriptor)) {
            return S() ? new go0.i.c(member, e0()) : new go0.i.e(member);
        }
        return S() ? new go0.i.a(member, e0()) : new go0.i.b(member);
    }

    private final go0.i.h Z(Method member) {
        return S() ? new go0.i.h.a(member, e0()) : new go0.i.h.e(member);
    }

    private final go0.i.h a0(Method member) {
        return S() ? new go0.i.h.b(member) : new go0.i.h.f(member);
    }

    private final go0.i.h b0(Method member) {
        if (S()) {
            return new go0.i.h.c(member, h0(member) ? this.rawBoundReceiver : e0());
        }
        return new go0.i.h.g(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    public static final go0.h c0(h1 h1Var) {
        GenericDeclaration genericDeclarationQ;
        go0.i<Constructor<?>> iVarB0;
        e3 e3Var = e3.f66120a;
        n nVarG = e3Var.g(h1Var.U());
        if (nVarG instanceof n.e) {
            FunctionDescriptor functionDescriptorU = h1Var.U();
            DeclarationDescriptor containingDeclaration = functionDescriptorU.getContainingDeclaration();
            p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
            if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (functionDescriptorU instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorU).isPrimary()) {
                throw new x2(h1Var.U().getContainingDeclaration() + " cannot have default arguments");
            }
            FunctionDescriptor functionDescriptorG0 = h1Var.g0(h1Var.U());
            if (functionDescriptorG0 != null) {
                n nVarG2 = e3Var.g(functionDescriptorG0);
                p013kotlin.jvm.internal.s.i(nVarG2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                n.e eVar = (n.e) nVarG2;
                genericDeclarationQ = h1Var.getContainer().r(eVar.c(), eVar.b(), true);
            } else {
                c1 container = h1Var.getContainer();
                n.e eVar2 = (n.e) nVarG;
                String strC = eVar2.c();
                String strB = eVar2.b();
                Member memberB = h1Var.M().b();
                p013kotlin.jvm.internal.s.h(memberB);
                genericDeclarationQ = container.r(strC, strB, !Modifier.isStatic(memberB.getModifiers()));
            }
        } else if (nVarG instanceof n.d) {
            if (h1Var.R()) {
                Class<?> clsA = h1Var.getContainer().a();
                List<co0.l> parameters = h1Var.getParameters();
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((co0.l) it.next()).getName();
                    p013kotlin.jvm.internal.s.h(name);
                    arrayList.add(name);
                }
                return new go0.a(clsA, arrayList, go0.a.EnumC1418a.CALL_BY_NAME, go0.a.b.KOTLIN, null, 16, null);
            }
            genericDeclarationQ = h1Var.getContainer().q(((n.d) nVarG).b());
        } else {
            if (nVarG instanceof n.a) {
                List<Method> listD = ((n.a) nVarG).d();
                Class<?> clsA2 = h1Var.getContainer().a();
                List<Method> list = listD;
                ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new go0.a(clsA2, arrayList2, go0.a.EnumC1418a.CALL_BY_NAME, go0.a.b.JAVA, listD);
            }
            genericDeclarationQ = null;
        }
        if (genericDeclarationQ instanceof Constructor) {
            iVarB0 = h1Var.Y((Constructor) genericDeclarationQ, h1Var.U(), true);
        } else if (!(genericDeclarationQ instanceof Method)) {
            iVarB0 = null;
        } else if (h1Var.U().getAnnotations().mo496findAnnotation(i3.j()) != null) {
            DeclarationDescriptor containingDeclaration2 = h1Var.U().getContainingDeclaration();
            p013kotlin.jvm.internal.s.i(containingDeclaration2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (((ClassDescriptor) containingDeclaration2).isCompanionObject()) {
                iVarB0 = h1Var.b0((Method) genericDeclarationQ);
            } else {
                iVarB0 = h1Var.a0((Method) genericDeclarationQ);
            }
        } else {
            iVarB0 = h1Var.b0((Method) genericDeclarationQ);
        }
        if (iVarB0 != null) {
            return go0.o.i(iVarB0, h1Var.U(), true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FunctionDescriptor d0(h1 h1Var, String str) {
        return h1Var.getContainer().s(str, h1Var.signature);
    }

    private final Object e0() {
        return go0.o.h(this.rawBoundReceiver, U());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[EDGE_INSN: B:40:0x009b->B:32:0x009b BREAK  A[LOOP:0: B:18:0x005f->B:41:0x005f, LOOP_LABEL: LOOP:0: B:18:0x005f->B:41:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:26:0x0087->B:44:?, LOOP_END, SYNTHETIC] */
    private final FunctionDescriptor g0(FunctionDescriptor descriptor) {
        DeclarationDescriptor containingDeclaration;
        Member memberB;
        Iterator<CallableMemberDescriptor> it;
        CallableMemberDescriptor next;
        List<ValueParameterDescriptor> list;
        Iterator<T> it2;
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        p013kotlin.jvm.internal.s.j(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list2 = valueParameters;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            containingDeclaration = descriptor.getContainingDeclaration();
            p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
            if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                memberB = M().b();
                p013kotlin.jvm.internal.s.h(memberB);
                if (Modifier.isStatic(memberB.getModifiers())) {
                    it = DescriptorUtilsKt.overriddenTreeAsSequence(descriptor, false).iterator();
                    loop0: while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List<ValueParameterDescriptor> valueParameters2 = next.getValueParameters();
                        p013kotlin.jvm.internal.s.j(valueParameters2, "getValueParameters(...)");
                        list = valueParameters2;
                        if (list instanceof Collection) {
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                break loop0;
                                break loop0;
                            }
                        }
                    }
                    if (next instanceof FunctionDescriptor) {
                        return (FunctionDescriptor) next;
                    }
                }
            }
        } else {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (((ValueParameterDescriptor) it3.next()).declaresDefaultValue()) {
                }
            }
            containingDeclaration = descriptor.getContainingDeclaration();
            p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
            if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                memberB = M().b();
                p013kotlin.jvm.internal.s.h(memberB);
                if (Modifier.isStatic(memberB.getModifiers())) {
                    it = DescriptorUtilsKt.overriddenTreeAsSequence(descriptor, false).iterator();
                    loop0: while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        List<ValueParameterDescriptor> valueParameters3 = next.getValueParameters();
                        p013kotlin.jvm.internal.s.j(valueParameters3, "getValueParameters(...)");
                        list = valueParameters3;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (next instanceof FunctionDescriptor) {
                        return (FunctionDescriptor) next;
                    }
                }
            }
        }
        return null;
    }

    private final boolean h0(Method member) {
        KotlinType type;
        ReceiverParameterDescriptor dispatchReceiverParameter = U().getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null || (type = dispatchReceiverParameter.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(type)) {
            return false;
        }
        Class<?>[] parameterTypes = member.getParameterTypes();
        p013kotlin.jvm.internal.s.j(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) p013kotlin.collections.n.l0(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // fo0.a0
    public go0.h<?> M() {
        return (go0.h) this.caller.getValue();
    }

    @Override // fo0.a0
    /* JADX INFO: renamed from: N, reason: from getter */
    public c1 getContainer() {
        return this.container;
    }

    @Override // fo0.a0
    public go0.h<?> O() {
        return (go0.h) this.defaultCaller.getValue();
    }

    @Override // fo0.a0
    public boolean S() {
        return this.rawBoundReceiver != p013kotlin.jvm.internal.f.NO_RECEIVER;
    }

    @Override // wn0.s
    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    public boolean equals(Object other) {
        h1 h1VarC = i3.c(other);
        return h1VarC != null && p013kotlin.jvm.internal.s.f(getContainer(), h1VarC.getContainer()) && p013kotlin.jvm.internal.s.f(getName(), h1VarC.getName()) && p013kotlin.jvm.internal.s.f(this.signature, h1VarC.signature) && p013kotlin.jvm.internal.s.f(this.rawBoundReceiver, h1VarC.rawBoundReceiver);
    }

    @Override // fo0.a0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public FunctionDescriptor U() {
        T tB = this.descriptor.b(this, f66139m[0]);
        p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
        return (FunctionDescriptor) tB;
    }

    @Override // wn0.v
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return l.a.i(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // p013kotlin.jvm.internal.n
    public int getArity() {
        return go0.j.a(M());
    }

    @Override // co0.c
    public String getName() {
        String strAsString = U().getName().asString();
        p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
        return strAsString;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // wn0.t
    public Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return l.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // wn0.a
    public Object invoke() {
        return l.a.a(this);
    }

    @Override // co0.h
    public boolean isExternal() {
        return U().isExternal();
    }

    @Override // co0.h
    public boolean isInfix() {
        return U().isInfix();
    }

    @Override // co0.h
    public boolean isInline() {
        return U().isInline();
    }

    @Override // co0.h
    public boolean isOperator() {
        return U().isOperator();
    }

    @Override // co0.c
    public boolean isSuspend() {
        return U().isSuspend();
    }

    @Override // wn0.u
    public Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return l.a.h(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // wn0.w
    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return l.a.j(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public String toString() {
        return d3.f66112a.f(U());
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return l.a.b(this, obj);
    }

    private h1(c1 c1Var, String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.container = c1Var;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = z2.b(functionDescriptor, new e1(this, str));
        jn0.p pVar = jn0.p.PUBLICATION;
        this.caller = jn0.m.a(pVar, new f1(this));
        this.defaultCaller = jn0.m.a(pVar, new g1(this));
    }

    @Override // wn0.p
    public Object invoke(Object obj, Object obj2) {
        return l.a.c(this, obj, obj2);
    }

    @Override // wn0.q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return l.a.d(this, obj, obj2, obj3);
    }

    @Override // wn0.r
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return l.a.e(this, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(c1 container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h1(c1 container, FunctionDescriptor descriptor) {
        p013kotlin.jvm.internal.s.k(container, "container");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
        this(container, strAsString, e3.f66120a.g(descriptor).get_signature(), descriptor, null, 16, null);
    }
}
