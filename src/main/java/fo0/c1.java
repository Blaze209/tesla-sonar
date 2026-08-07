package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 K2\u00020\u0001:\u0004LMNKB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J)\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040'2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bC\u0010BR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lfo0/c1;", "Lkotlin/jvm/internal/h;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", Gender.FEMALE, "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "J", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "I", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "valueParameters", "isConstructor", "Ljn0/h0;", "o", "(Ljava/util/List;Ljava/util/List;Z)V", "desc", "parseReturnType", "Lfo0/c1$c;", "G", "(Ljava/lang/String;Z)Lfo0/c1$c;", "", "begin", "end", "H", "(Ljava/lang/String;II)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "E", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "A", "index", "B", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lfo0/c1$d;", "belonginess", "Lfo0/a0;", "C", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lfo0/c1$d;)Ljava/util/Collection;", "signature", "v", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "s", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "u", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "r", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "p", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "q", "D", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "z", "()Ljava/util/Collection;", "constructorDescriptors", "a", "b", DateTokenConverter.CONVERTER_KEY, "c", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class c1 implements p013kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f66097b = DefaultConstructorMarker.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p013kotlin.text.q f66098c = new p013kotlin.text.q("<v#(\\d+)>");

    /* JADX INFO: renamed from: fo0.c1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfo0/c1$a;", "", "<init>", "()V", "Lkotlin/text/q;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/q;", "a", "()Lkotlin/text/q;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p013kotlin.text.q a() {
            return c1.f66098c;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lfo0/c1$b;", "", "<init>", "(Lfo0/c1;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "Lfo0/z2$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ co0.m<Object>[] f66099c = {p013kotlin.jvm.internal.o0.k(new p013kotlin.jvm.internal.f0(p013kotlin.jvm.internal.o0.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final z2.a moduleData;

        public b() {
            this.moduleData = z2.c(new d1(c1.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RuntimeModuleData c(c1 c1Var) {
            return y2.a(c1Var.a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final RuntimeModuleData b() {
            T tB = this.moduleData.b(this, f66099c[0]);
            p013kotlin.jvm.internal.s.j(tB, "getValue(...)");
            return (RuntimeModuleData) tB;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lfo0/c1$c;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Class<?>> parameters;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Class<?>> parameters, Class<?> cls) {
            p013kotlin.jvm.internal.s.k(parameters, "parameters");
            this.parameters = parameters;
            this.returnType = cls;
        }

        public final List<Class<?>> a() {
            return this.parameters;
        }

        public final Class<?> b() {
            return this.returnType;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lfo0/c1$d;", "", "<init>", "(Ljava/lang/String;I)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "member", "", "accept", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "DECLARED", ActionConst.INHERITED, "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected enum d {
        DECLARED,
        INHERITED;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public final boolean accept(CallableMemberDescriptor member) {
            p013kotlin.jvm.internal.s.k(member, "member");
            return member.getKind().isReal() == (this == DECLARED);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"fo0/c1$e", "Lfo0/j;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "descriptor", "Ljn0/h0;", "data", "Lfo0/a0;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Ljn0/h0;)Lfo0/a0;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends j {
        e(c1 c1Var) {
            super(c1Var);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a0<?> visitConstructorDescriptor(ConstructorDescriptor descriptor, jn0.h0 data) {
            p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
            p013kotlin.jvm.internal.s.k(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    private final Method F(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z11) {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z12;
        if (z11) {
            clsArr[0] = cls;
        }
        Method methodJ = J(cls, str, clsArr, cls2);
        if (methodJ != null) {
            return methodJ;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodF = F(superclass, str, clsArr, cls2, z11);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z12 = z11;
            if (methodF != null) {
                return methodF;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z12 = z11;
        }
        Iterator itA = p013kotlin.jvm.internal.c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class<?> cls4 = (Class) itA.next();
            p013kotlin.jvm.internal.s.h(cls4);
            Method methodF2 = F(cls4, str2, clsArr2, cls3, z12);
            if (methodF2 != null) {
                return methodF2;
            }
            if (z12) {
                Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls4), cls4.getName() + "$DefaultImpls");
                if (clsTryLoadClass != null) {
                    clsArr2[0] = cls4;
                    Method methodJ2 = J(clsTryLoadClass, str2, clsArr2, cls3);
                    if (methodJ2 != null) {
                        return methodJ2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c G(String desc, boolean parseReturnType) {
        String str;
        int iU0;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (true) {
            if (desc.charAt(i11) == ')') {
                String str2 = desc;
                return new c(arrayList, parseReturnType ? H(str2, i11 + 1, str2.length()) : null);
            }
            int i12 = i11;
            while (desc.charAt(i12) == '[') {
                i12++;
            }
            char cCharAt = desc.charAt(i12);
            if (p013kotlin.text.t.g0("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i13 = i12 + 1;
                str = desc;
                iU0 = i13;
            } else {
                if (cCharAt != 'L') {
                    throw new x2("Unknown type prefix in the method signature: " + desc);
                }
                str = desc;
                iU0 = p013kotlin.text.t.u0(str, ';', i11, false, 4, null) + 1;
            }
            arrayList.add(H(str, i11, iU0));
            i11 = iU0;
            desc = str;
        }
    }

    private final Class<?> H(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(a());
            String strSubstring = desc.substring(begin + 1, end - 1);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            Class<?> clsLoadClass = safeClassLoader.loadClass(p013kotlin.text.t.U(strSubstring, '/', CoreConstants.DOT, false, 4, null));
            p013kotlin.jvm.internal.s.j(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class<?> TYPE = Void.TYPE;
            p013kotlin.jvm.internal.s.j(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return i3.f(H(desc, begin + 1, end));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new x2("Unknown type prefix in the method signature: " + desc);
        }
    }

    private final Constructor<?> I(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method J(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (p013kotlin.jvm.internal.s.f(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            p013kotlin.jvm.internal.s.j(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (p013kotlin.jvm.internal.s.f(method.getName(), str) && p013kotlin.jvm.internal.s.f(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    private final void o(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        if (p013kotlin.jvm.internal.s.f(p013kotlin.collections.v.C0(valueParameters), f66097b)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i11 = 0; i11 < size; i11++) {
            Class<?> TYPE = Integer.TYPE;
            p013kotlin.jvm.internal.s.j(TYPE, "TYPE");
            result.add(TYPE);
        }
        Class<?> cls = isConstructor ? f66097b : Object.class;
        p013kotlin.jvm.internal.s.h(cls);
        result.add(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence t(FunctionDescriptor descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + e3.f66120a.g(descriptor).get_signature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer numCompare = DescriptorVisibilities.compare(descriptorVisibility, descriptorVisibility2);
        if (numCompare != null) {
            return numCompare.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(wn0.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence y(PropertyDescriptor descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + e3.f66120a.f(descriptor).getString();
    }

    public abstract Collection<FunctionDescriptor> A(Name name);

    public abstract PropertyDescriptor B(int index);

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    protected final Collection<a0<?>> C(MemberScope scope, d belonginess) {
        a0 a0Var;
        p013kotlin.jvm.internal.s.k(scope, "scope");
        p013kotlin.jvm.internal.s.k(belonginess, "belonginess");
        e eVar = new e(this);
        Collection<DeclarationDescriptor> contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(scope, null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : contributedDescriptors$default) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (p013kotlin.jvm.internal.s.f(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.INVISIBLE_FAKE) || !belonginess.accept(callableMemberDescriptor)) {
                    a0Var = null;
                } else {
                    a0Var = (a0) declarationDescriptor.accept(eVar, jn0.h0.f84049a);
                }
            } else {
                a0Var = null;
            }
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        return p013kotlin.collections.v.m1(arrayList);
    }

    protected Class<?> D() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(a());
        return wrapperByPrimitive == null ? a() : wrapperByPrimitive;
    }

    public abstract Collection<PropertyDescriptor> E(Name name);

    public final Constructor<?> p(String desc) {
        p013kotlin.jvm.internal.s.k(desc, "desc");
        return I(a(), G(desc, false).a());
    }

    public final Constructor<?> q(String desc) {
        p013kotlin.jvm.internal.s.k(desc, "desc");
        Class<?> clsA = a();
        ArrayList arrayList = new ArrayList();
        o(arrayList, G(desc, false).a(), true);
        jn0.h0 h0Var = jn0.h0.f84049a;
        return I(clsA, arrayList);
    }

    public final Method r(String name, String desc, boolean isMember) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(desc, "desc");
        if (p013kotlin.jvm.internal.s.f(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(a());
        }
        c cVarG = G(desc, true);
        o(arrayList, cVarG.a(), false);
        Class<?> clsD = D();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> clsB = cVarG.b();
        p013kotlin.jvm.internal.s.h(clsB);
        return F(clsD, str, clsArr, clsB, isMember);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ad  */
    public final FunctionDescriptor s(String name, String signature) {
        List listA;
        ArrayList arrayList;
        String strA;
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        if (p013kotlin.jvm.internal.s.f(name, "<init>")) {
            listA = p013kotlin.collections.v.m1(z());
            arrayList = new ArrayList();
            for (Object obj : listA) {
                ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) obj;
                if (constructorDescriptor.isPrimary()) {
                    ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                    p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration)) {
                        String strA2 = e3.f66120a.g(constructorDescriptor).get_signature();
                        if (!p013kotlin.text.t.b0(strA2, "constructor-impl", false, 2, null) || !p013kotlin.text.t.L(strA2, ")V", false, 2, null)) {
                            throw new IllegalArgumentException(("Invalid signature of " + constructorDescriptor + ": " + strA2).toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(p013kotlin.text.t.W0(strA2, "V"));
                        ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
                        p013kotlin.jvm.internal.s.j(containingDeclaration2, "getContainingDeclaration(...)");
                        sb2.append(go0.o.u(containingDeclaration2));
                        strA = sb2.toString();
                    } else {
                        strA = e3.f66120a.g(constructorDescriptor).get_signature();
                    }
                } else {
                    strA = e3.f66120a.g(constructorDescriptor).get_signature();
                }
                if (p013kotlin.jvm.internal.s.f(strA, signature)) {
                    arrayList.add(obj);
                }
            }
        } else {
            Name nameIdentifier = Name.identifier(name);
            p013kotlin.jvm.internal.s.j(nameIdentifier, "identifier(...)");
            listA = A(nameIdentifier);
            arrayList = new ArrayList();
            for (Object obj2 : listA) {
                if (p013kotlin.jvm.internal.s.f(e3.f66120a.g((FunctionDescriptor) obj2).get_signature(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (FunctionDescriptor) p013kotlin.collections.v.U0(arrayList);
        }
        String strY0 = p013kotlin.collections.v.y0(listA, "\n", null, null, 0, null, b1.f66091a, 30, null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Function '");
        sb3.append(name);
        sb3.append("' (JVM signature: ");
        sb3.append(signature);
        sb3.append(") not resolved in ");
        sb3.append(this);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(strY0.length() == 0 ? " no members found" : '\n' + strY0);
        throw new x2(sb3.toString());
    }

    public final Method u(String name, String desc) {
        Method methodF;
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(desc, "desc");
        if (p013kotlin.jvm.internal.s.f(name, "<init>")) {
            return null;
        }
        c cVarG = G(desc, true);
        Class<?>[] clsArr = (Class[]) cVarG.a().toArray(new Class[0]);
        Class<?> clsB = cVarG.b();
        p013kotlin.jvm.internal.s.h(clsB);
        Method methodF2 = F(D(), name, clsArr, clsB, false);
        if (methodF2 != null) {
            return methodF2;
        }
        if (!D().isInterface() || (methodF = F(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodF;
    }

    public final PropertyDescriptor v(String name, String signature) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(signature, "signature");
        p013kotlin.text.m mVarH = f66098c.h(signature);
        if (mVarH != null) {
            String str = mVarH.a().getMatch().c().get(1);
            PropertyDescriptor propertyDescriptorB = B(Integer.parseInt(str));
            if (propertyDescriptorB != null) {
                return propertyDescriptorB;
            }
            throw new x2("Local property #" + str + " not found in " + a());
        }
        Name nameIdentifier = Name.identifier(name);
        p013kotlin.jvm.internal.s.j(nameIdentifier, "identifier(...)");
        Collection<PropertyDescriptor> collectionE = E(nameIdentifier);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (p013kotlin.jvm.internal.s.f(e3.f66120a.f((PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new x2("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) p013kotlin.collections.v.U0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            DescriptorVisibility visibility = ((PropertyDescriptor) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = p013kotlin.collections.v0.h(linkedHashMap, new z0(y0.f66306a)).values();
        p013kotlin.jvm.internal.s.j(collectionValues, "<get-values>(...)");
        List list = (List) p013kotlin.collections.v.z0(collectionValues);
        if (list.size() == 1) {
            p013kotlin.jvm.internal.s.h(list);
            return (PropertyDescriptor) p013kotlin.collections.v.o0(list);
        }
        Name nameIdentifier2 = Name.identifier(name);
        p013kotlin.jvm.internal.s.j(nameIdentifier2, "identifier(...)");
        String strY0 = p013kotlin.collections.v.y0(E(nameIdentifier2), "\n", null, null, 0, null, a1.f66086a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(strY0.length() == 0 ? " no members found" : '\n' + strY0);
        throw new x2(sb2.toString());
    }

    public abstract Collection<ConstructorDescriptor> z();
}
