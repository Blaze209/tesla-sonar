package p013kotlin.reflect.jvm.internal.impl.serialization;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes9.dex */
public class SerializerExtensionProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtensionRegistryLite f88559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f88560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> f88561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> f88562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f88563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> f88564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f88565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f88566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f88567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f88568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f88569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> f88570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> f88571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> f88572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> f88573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f88574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f88575q;

    public SerializerExtensionProtocol(ExtensionRegistryLite extensionRegistry, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageFqName, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> constructorAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> classAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtension, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyGetterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertySetterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension2, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension3, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtension4, GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> enumEntryAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> compileTimeValue, GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> parameterAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation, GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation) {
        s.k(extensionRegistry, "extensionRegistry");
        s.k(packageFqName, "packageFqName");
        s.k(constructorAnnotation, "constructorAnnotation");
        s.k(classAnnotation, "classAnnotation");
        s.k(functionAnnotation, "functionAnnotation");
        s.k(propertyAnnotation, "propertyAnnotation");
        s.k(propertyGetterAnnotation, "propertyGetterAnnotation");
        s.k(propertySetterAnnotation, "propertySetterAnnotation");
        s.k(enumEntryAnnotation, "enumEntryAnnotation");
        s.k(compileTimeValue, "compileTimeValue");
        s.k(parameterAnnotation, "parameterAnnotation");
        s.k(typeAnnotation, "typeAnnotation");
        s.k(typeParameterAnnotation, "typeParameterAnnotation");
        this.f88559a = extensionRegistry;
        this.f88560b = packageFqName;
        this.f88561c = constructorAnnotation;
        this.f88562d = classAnnotation;
        this.f88563e = functionAnnotation;
        this.f88564f = generatedExtension;
        this.f88565g = propertyAnnotation;
        this.f88566h = propertyGetterAnnotation;
        this.f88567i = propertySetterAnnotation;
        this.f88568j = generatedExtension2;
        this.f88569k = generatedExtension3;
        this.f88570l = generatedExtension4;
        this.f88571m = enumEntryAnnotation;
        this.f88572n = compileTimeValue;
        this.f88573o = parameterAnnotation;
        this.f88574p = typeAnnotation;
        this.f88575q = typeParameterAnnotation;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> getClassAnnotation() {
        return this.f88562d;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> getCompileTimeValue() {
        return this.f88572n;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> getConstructorAnnotation() {
        return this.f88561c;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> getEnumEntryAnnotation() {
        return this.f88571m;
    }

    public final ExtensionRegistryLite getExtensionRegistry() {
        return this.f88559a;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> getFunctionAnnotation() {
        return this.f88563e;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> getFunctionExtensionReceiverAnnotation() {
        return this.f88564f;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> getParameterAnnotation() {
        return this.f88573o;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyAnnotation() {
        return this.f88565g;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyBackingFieldAnnotation() {
        return this.f88569k;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyDelegatedFieldAnnotation() {
        return this.f88570l;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyExtensionReceiverAnnotation() {
        return this.f88568j;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertyGetterAnnotation() {
        return this.f88566h;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> getPropertySetterAnnotation() {
        return this.f88567i;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> getTypeAnnotation() {
        return this.f88574p;
    }

    public final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> getTypeParameterAnnotation() {
        return this.f88575q;
    }
}
