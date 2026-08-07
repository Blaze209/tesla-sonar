package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Set;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import p013kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializedDescriptorResolver {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<KotlinClassHeader.Kind> f87560a = d1.c(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<KotlinClassHeader.Kind> f87561b = d1.i(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JvmMetadataVersion f87562c = new JvmMetadataVersion(1, 1, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final JvmMetadataVersion f87563d = new JvmMetadataVersion(1, 1, 11);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final JvmMetadataVersion f87564e = new JvmMetadataVersion(1, 1, 13);
    public DeserializationComponents components;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.f87564e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection b() {
        return v.m();
    }

    private final DeserializedContainerAbiStability c(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getAllowUnstableDependencies()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        return kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    private final IncompatibleVersionErrorData<JvmMetadataVersion> d(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (f() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(e())) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), JvmMetadataVersion.INSTANCE, e(), e().lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
    }

    private final JvmMetadataVersion e() {
        return DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration());
    }

    private final boolean f() {
        return getComponents().getConfiguration().getSkipMetadataVersionCheck();
    }

    private final boolean g(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return !getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && s.f(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f87563d);
    }

    private final boolean h(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || s.f(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f87562c))) || g(kotlinJvmBinaryClass);
    }

    private final String[] i(KotlinJvmBinaryClass kotlinJvmBinaryClass, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null || !set.contains(classHeader.getKind())) {
            return null;
        }
        return data;
    }

    public final MemberScope createKotlinPackagePartScope(PackageFragmentDescriptor descriptor, KotlinJvmBinaryClass kotlinClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom;
        s.k(descriptor, "descriptor");
        s.k(kotlinClass, "kotlinClass");
        String[] strArrI = i(kotlinClass, f87561b);
        if (strArrI == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(strArrI, strings);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
            }
        } catch (Throwable th2) {
            if (f() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(e())) {
                throw th2;
            }
            packageDataFrom = null;
        }
        if (packageDataFrom == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverA = packageDataFrom.a();
        ProtoBuf.Package packageB = packageDataFrom.b();
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, packageB, jvmNameResolverA, d(kotlinClass), h(kotlinClass), c(kotlinClass));
        return new DeserializedPackageMemberScope(descriptor, packageB, jvmNameResolverA, kotlinClass.getClassHeader().getMetadataVersion(), jvmPackagePartSource, getComponents(), "scope for " + jvmPackagePartSource + " in " + descriptor, d.f87611a);
    }

    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        s.B("components");
        return null;
    }

    public final ClassData readClassData$descriptors_jvm(KotlinJvmBinaryClass kotlinClass) {
        String[] strings;
        Pair<JvmNameResolver, ProtoBuf.Class> classDataFrom;
        s.k(kotlinClass, "kotlinClass");
        String[] strArrI = i(kotlinClass, f87560a);
        if (strArrI == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                classDataFrom = JvmProtoBufUtil.readClassDataFrom(strArrI, strings);
            } catch (InvalidProtocolBufferException e11) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e11);
            }
        } catch (Throwable th2) {
            if (f() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(e())) {
                throw th2;
            }
            classDataFrom = null;
        }
        if (classDataFrom == null) {
            return null;
        }
        return new ClassData(classDataFrom.a(), classDataFrom.b(), kotlinClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinClass, d(kotlinClass), h(kotlinClass), c(kotlinClass)));
    }

    public final ClassDescriptor resolveClass(KotlinJvmBinaryClass kotlinClass) {
        s.k(kotlinClass, "kotlinClass");
        ClassData classData$descriptors_jvm = readClassData$descriptors_jvm(kotlinClass);
        if (classData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinClass.getClassId(), classData$descriptors_jvm);
    }

    public final void setComponents(DeserializationComponents deserializationComponents) {
        s.k(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    public final void setComponents(DeserializationComponentsForJava components) {
        s.k(components, "components");
        setComponents(components.getComponents());
    }
}
