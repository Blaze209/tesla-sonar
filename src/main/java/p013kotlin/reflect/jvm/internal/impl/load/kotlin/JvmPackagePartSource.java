package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmClassName f87570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JvmClassName f87571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncompatibleVersionErrorData<JvmMetadataVersion> f87572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f87573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DeserializedContainerAbiStability f87574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final KotlinJvmBinaryClass f87575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f87576g;

    public JvmPackagePartSource(JvmClassName className, JvmClassName jvmClassName, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z11, DeserializedContainerAbiStability abiStability, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        s.k(className, "className");
        s.k(packageProto, "packageProto");
        s.k(nameResolver, "nameResolver");
        s.k(abiStability, "abiStability");
        this.f87570a = className;
        this.f87571b = jvmClassName;
        this.f87572c = incompatibleVersionErrorData;
        this.f87573d = z11;
        this.f87574e = abiStability;
        this.f87575f = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.packageModuleName;
        s.j(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(packageProto, packageModuleName);
        this.f87576g = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    public final ClassId getClassId() {
        FqName packageFqName = getClassName().getPackageFqName();
        s.j(packageFqName, "getPackageFqName(...)");
        return new ClassId(packageFqName, getSimpleName());
    }

    public JvmClassName getClassName() {
        return this.f87570a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        s.j(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public JvmClassName getFacadeClassName() {
        return this.f87571b;
    }

    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.f87575f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + CoreConstants.SINGLE_QUOTE_CHAR;
    }

    public final Name getSimpleName() {
        String internalName = getClassName().getInternalName();
        s.j(internalName, "getInternalName(...)");
        Name nameIdentifier = Name.identifier(t.u1(internalName, '/', null, 2, null));
        s.j(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    public String toString() {
        return JvmPackagePartSource.class.getSimpleName() + ": " + getClassName();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinClass, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z11, DeserializedContainerAbiStability abiStability) {
        s.k(kotlinClass, "kotlinClass");
        s.k(packageProto, "packageProto");
        s.k(nameResolver, "nameResolver");
        s.k(abiStability, "abiStability");
        JvmClassName jvmClassNameByClassId = JvmClassName.byClassId(kotlinClass.getClassId());
        s.j(jvmClassNameByClassId, "byClassId(...)");
        String multifileClassName = kotlinClass.getClassHeader().getMultifileClassName();
        JvmClassName jvmClassNameByInternalName = null;
        if (multifileClassName != null && multifileClassName.length() > 0) {
            jvmClassNameByInternalName = JvmClassName.byInternalName(multifileClassName);
        }
        this(jvmClassNameByClassId, jvmClassNameByInternalName, packageProto, nameResolver, incompatibleVersionErrorData, z11, abiStability, kotlinClass);
    }
}
