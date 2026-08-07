package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f86994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BuiltInsResourceLoader f86995b;

    public ReflectKotlinClassFinder(ClassLoader classLoader) {
        s.k(classLoader, "classLoader");
        this.f86994a = classLoader;
        this.f86995b = new BuiltInsResourceLoader();
    }

    private final KotlinClassFinder.Result a(String str) {
        ReflectKotlinClass reflectKotlinClassCreate;
        Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f86994a, str);
        if (clsTryLoadClass == null || (reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(clsTryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassCreate, null, 2, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    public InputStream findBuiltInsData(FqName packageFqName) {
        s.k(packageFqName, "packageFqName");
        if (packageFqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return this.f86995b.loadResource(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(packageFqName));
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result findKotlinClassOrContent(ClassId classId, JvmMetadataVersion jvmMetadataVersion) {
        s.k(classId, "classId");
        s.k(jvmMetadataVersion, "jvmMetadataVersion");
        return a(ReflectKotlinClassFinderKt.a(classId));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result findKotlinClassOrContent(JavaClass javaClass, JvmMetadataVersion jvmMetadataVersion) {
        String strAsString;
        s.k(javaClass, "javaClass");
        s.k(jvmMetadataVersion, "jvmMetadataVersion");
        FqName fqName = javaClass.getFqName();
        if (fqName == null || (strAsString = fqName.asString()) == null) {
            return null;
        }
        return a(strAsString);
    }
}
