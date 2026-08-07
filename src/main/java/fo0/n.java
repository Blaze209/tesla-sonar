package fo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lfo0/n;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "e", DateTokenConverter.CONVERTER_KEY, "c", "b", "Lfo0/n$a;", "Lfo0/n$b;", "Lfo0/n$c;", "Lfo0/n$d;", "Lfo0/n$e;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfo0/n$a;", "Lfo0/n;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "methods", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Class<?> jClass;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method> methods;

        /* JADX INFO: renamed from: fo0.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class C1350a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(((Method) t11).getName(), ((Method) t12).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> jClass) {
            super(null);
            p013kotlin.jvm.internal.s.k(jClass, "jClass");
            this.jClass = jClass;
            Method[] declaredMethods = jClass.getDeclaredMethods();
            p013kotlin.jvm.internal.s.j(declaredMethods, "getDeclaredMethods(...)");
            this.methods = p013kotlin.collections.n.k1(declaredMethods, new C1350a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Method method) {
            Class<?> returnType = method.getReturnType();
            p013kotlin.jvm.internal.s.j(returnType, "getReturnType(...)");
            return ReflectClassUtilKt.getDesc(returnType);
        }

        @Override // fo0.n
        /* JADX INFO: renamed from: a */
        public String get_signature() {
            return p013kotlin.collections.v.y0(this.methods, "", "<init>(", ")V", 0, null, m.f66185a, 24, null);
        }

        public final List<Method> d() {
            return this.methods;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfo0/n$b;", "Lfo0/n;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            p013kotlin.jvm.internal.s.k(constructor, "constructor");
            this.constructor = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(Class cls) {
            p013kotlin.jvm.internal.s.h(cls);
            return ReflectClassUtilKt.getDesc(cls);
        }

        @Override // fo0.n
        /* JADX INFO: renamed from: a */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            p013kotlin.jvm.internal.s.j(parameterTypes, "getParameterTypes(...)");
            return p013kotlin.collections.n.T0(parameterTypes, "", "<init>(", ")V", 0, null, o.f66201a, 24, null);
        }

        public final Constructor<?> d() {
            return this.constructor;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfo0/n$c;", "Lfo0/n;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            p013kotlin.jvm.internal.s.k(method, "method");
            this.method = method;
        }

        @Override // fo0.n
        /* JADX INFO: renamed from: a */
        public String get_signature() {
            return g3.d(this.method);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lfo0/n$d;", "Lfo0/n;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "constructorDesc", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JvmMemberSignature.Method signature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JvmMemberSignature.Method signature) {
            super(null);
            p013kotlin.jvm.internal.s.k(signature, "signature");
            this.signature = signature;
            this._signature = signature.asString();
        }

        @Override // fo0.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String b() {
            return this.signature.getDesc();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, d2 = {"Lfo0/n$e;", "Lfo0/n;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "c", "methodName", "methodDesc", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JvmMemberSignature.Method signature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JvmMemberSignature.Method signature) {
            super(null);
            p013kotlin.jvm.internal.s.k(signature, "signature");
            this.signature = signature;
            this._signature = signature.asString();
        }

        @Override // fo0.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        public final String b() {
            return this.signature.getDesc();
        }

        public final String c() {
            return this.signature.getName();
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String get_signature();

    private n() {
    }
}
