package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch.qos.logback.core.pattern.parser.Parser;
import java.util.Map;
import jn0.h0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes9.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final JavaTypeQualifiers f87437a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final JavaTypeQualifiers f87438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JavaTypeQualifiers f87439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, PredefinedFunctionEnhancementInfo> f87440d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f87438b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f87439c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents.javaLang("Object");
        String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new f(strJavaFunction3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new q(signatureBuildingComponents), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Collection"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "removeIf", null, new b0(strJavaFunction), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "stream", null, new i0(strJavaUtil), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder, "parallelStream", null, new j0(strJavaUtil), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("List"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder2, "replaceAll", null, new k0(strJavaFunction6), 2, null);
        classEnhancementBuilder2.function("addFirst", "2.1", new l0(strJavaLang));
        classEnhancementBuilder2.function("addLast", "2.1", new m0(strJavaLang));
        classEnhancementBuilder2.function("removeFirst", "2.1", new n0(strJavaLang));
        classEnhancementBuilder2.function("removeLast", "2.1", new o0(strJavaLang));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("LinkedList"));
        classEnhancementBuilder3.function("addFirst", "2.1", new g(strJavaLang));
        classEnhancementBuilder3.function("addLast", "2.1", new h(strJavaLang));
        classEnhancementBuilder3.function("removeFirst", "2.1", new i(strJavaLang));
        classEnhancementBuilder3.function("removeLast", "2.1", new j(strJavaLang));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Map"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "forEach", null, new k(strJavaFunction5), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "putIfAbsent", null, new l(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, Parser.REPLACE_CONVERTER_WORD, null, new m(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, Parser.REPLACE_CONVERTER_WORD, null, new n(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "replaceAll", null, new o(strJavaFunction4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "compute", null, new p(strJavaLang, strJavaFunction4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "computeIfAbsent", null, new r(strJavaLang, strJavaFunction2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "computeIfPresent", null, new s(strJavaLang, strJavaFunction4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder4, "merge", null, new t(strJavaLang, strJavaFunction4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaUtil2);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "empty", null, new u(strJavaUtil2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "of", null, new v(strJavaLang, strJavaUtil2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "ofNullable", null, new w(strJavaLang, strJavaUtil2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "get", null, new x(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(classEnhancementBuilder5, "ifPresent", null, new y(strJavaFunction3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new z(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction), "test", null, new a0(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new c0(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction3), "accept", null, new d0(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction5), "accept", null, new e0(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction2), "apply", null, new f0(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction4), "apply", null, new g0(strJavaLang), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new h0(strJavaLang), 2, null);
        f87440d = signatureEnhancementBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 A(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 B(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 C(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 D(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 E(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 F(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 G(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 H(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 I(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.returns(str, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 J(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.returns(str, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 e(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b);
        return h0.f84049a;
    }

    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return f87440d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87438b);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 l(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, f87437a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(str, f87437a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str, javaTypeQualifiers);
        function.returns(JvmPrimitiveType.BOOLEAN);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f87437a;
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
        function.returns(str, javaTypeQualifiers2);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 q(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        function.returns(str, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f87439c;
        JavaTypeQualifiers javaTypeQualifiers3 = f87437a;
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
        function.returns(str, javaTypeQualifiers3);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.parameter(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f87439c;
        function.parameter(str, javaTypeQualifiers2);
        JavaTypeQualifiers javaTypeQualifiers3 = f87437a;
        function.parameter(str2, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
        function.returns(str, javaTypeQualifiers3);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 t(SignatureBuildingComponents signatureBuildingComponents, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        String strJavaUtil = signatureBuildingComponents.javaUtil("Spliterator");
        JavaTypeQualifiers javaTypeQualifiers = f87438b;
        function.returns(strJavaUtil, javaTypeQualifiers, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87438b, f87439c);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f87439c;
        function.parameter(str, javaTypeQualifiers);
        function.returns(str2, f87438b, javaTypeQualifiers);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 w(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87437a);
        function.returns(str2, f87438b, f87439c);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 x(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87439c);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 y(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.parameter(str, f87438b, f87439c);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 z(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        s.k(function, "$this$function");
        function.returns(str, f87437a);
        return h0.f84049a;
    }
}
