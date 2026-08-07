package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.name.NameUtils;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lfo0/p;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "c", "b", DateTokenConverter.CONVERTER_KEY, "Lfo0/p$a;", "Lfo0/p$b;", "Lfo0/p$c;", "Lfo0/p$d;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfo0/p$a;", "Lfo0/p;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            p013kotlin.jvm.internal.s.k(field, "field");
            this.field = field;
        }

        @Override // fo0.p
        /* JADX INFO: renamed from: a */
        public String getString() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.field.getName();
            p013kotlin.jvm.internal.s.j(name, "getName(...)");
            sb2.append(JvmAbi.getterName(name));
            sb2.append("()");
            Class<?> type = this.field.getType();
            p013kotlin.jvm.internal.s.j(type, "getType(...)");
            sb2.append(ReflectClassUtilKt.getDesc(type));
            return sb2.toString();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lfo0/p$b;", "Lfo0/p;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method getterMethod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            p013kotlin.jvm.internal.s.k(getterMethod, "getterMethod");
            this.getterMethod = getterMethod;
            this.setterMethod = method;
        }

        @Override // fo0.p
        /* JADX INFO: renamed from: a */
        public String getString() {
            return g3.d(this.getterMethod);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lfo0/p$c;", "Lfo0/p;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "c", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", InquiryField.StringField.TYPE, "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final PropertyDescriptor descriptor;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ProtoBuf.Property proto;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final JvmProtoBuf.JvmPropertySignature signature;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final NameResolver nameResolver;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final TypeTable typeTable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PropertyDescriptor descriptor, ProtoBuf.Property proto, JvmProtoBuf.JvmPropertySignature signature, NameResolver nameResolver, TypeTable typeTable) {
            String str;
            super(null);
            p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
            p013kotlin.jvm.internal.s.k(proto, "proto");
            p013kotlin.jvm.internal.s.k(signature, "signature");
            p013kotlin.jvm.internal.s.k(nameResolver, "nameResolver");
            p013kotlin.jvm.internal.s.k(typeTable, "typeTable");
            this.descriptor = descriptor;
            this.proto = proto;
            this.signature = signature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (signature.hasGetter()) {
                str = nameResolver.getString(signature.getGetter().getName()) + nameResolver.getString(signature.getGetter().getDesc());
            } else {
                JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, proto, nameResolver, typeTable, false, 8, null);
                if (jvmFieldSignature$default == null) {
                    throw new x2("No field signature for property: " + descriptor);
                }
                String strComponent1 = jvmFieldSignature$default.component1();
                str = JvmAbi.getterName(strComponent1) + c() + "()" + jvmFieldSignature$default.component2();
            }
            this.string = str;
        }

        private final String c() {
            String string;
            DeclarationDescriptor containingDeclaration = this.descriptor.getContainingDeclaration();
            p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
            if (p013kotlin.jvm.internal.s.f(this.descriptor.getVisibility(), DescriptorVisibilities.INTERNAL) && (containingDeclaration instanceof DeserializedClassDescriptor)) {
                ProtoBuf.Class classProto = ((DeserializedClassDescriptor) containingDeclaration).getClassProto();
                GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.classModuleName;
                p013kotlin.jvm.internal.s.j(classModuleName, "classModuleName");
                Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(classProto, classModuleName);
                if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                    string = "main";
                }
                return CoreConstants.DOLLAR + NameUtils.sanitizeAsJavaIdentifier(string);
            }
            if (!p013kotlin.jvm.internal.s.f(this.descriptor.getVisibility(), DescriptorVisibilities.PRIVATE) || !(containingDeclaration instanceof PackageFragmentDescriptor)) {
                return "";
            }
            PropertyDescriptor propertyDescriptor = this.descriptor;
            p013kotlin.jvm.internal.s.i(propertyDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            DeserializedContainerSource containerSource = ((DeserializedPropertyDescriptor) propertyDescriptor).getContainerSource();
            if (!(containerSource instanceof JvmPackagePartSource)) {
                return "";
            }
            JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
            if (jvmPackagePartSource.getFacadeClassName() == null) {
                return "";
            }
            return CoreConstants.DOLLAR + jvmPackagePartSource.getSimpleName().asString();
        }

        @Override // fo0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PropertyDescriptor getDescriptor() {
            return this.descriptor;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final NameResolver getNameResolver() {
            return this.nameResolver;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProtoBuf.Property getProto() {
            return this.proto;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final JvmProtoBuf.JvmPropertySignature getSignature() {
            return this.signature;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TypeTable getTypeTable() {
            return this.typeTable;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lfo0/p$d;", "Lfo0/p;", "Lfo0/n$e;", "getterSignature", "setterSignature", "<init>", "(Lfo0/n$e;Lfo0/n$e;)V", "", "a", "()Ljava/lang/String;", "Lfo0/n$e;", "b", "()Lfo0/n$e;", "c", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n.e getterSignature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final n.e setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n.e getterSignature, n.e eVar) {
            super(null);
            p013kotlin.jvm.internal.s.k(getterSignature, "getterSignature");
            this.getterSignature = getterSignature;
            this.setterSignature = eVar;
        }

        @Override // fo0.p
        /* JADX INFO: renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n.e getGetterSignature() {
            return this.getterSignature;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n.e getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getString();

    private p() {
    }
}
