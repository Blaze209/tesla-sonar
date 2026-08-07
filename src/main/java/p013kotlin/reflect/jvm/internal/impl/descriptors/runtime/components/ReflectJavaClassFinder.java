package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f86991a;

    public ReflectJavaClassFinder(ClassLoader classLoader) {
        s.k(classLoader, "classLoader");
        this.f86991a = classLoader;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaClass findClass(JavaClassFinder.Request request) {
        s.k(request, "request");
        ClassId classId = request.getClassId();
        FqName packageFqName = classId.getPackageFqName();
        String strAsString = classId.getRelativeClassName().asString();
        s.j(strAsString, "asString(...)");
        String strU = t.U(strAsString, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
        if (!packageFqName.isRoot()) {
            strU = packageFqName.asString() + CoreConstants.DOT + strU;
        }
        Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f86991a, strU);
        if (clsTryLoadClass != null) {
            return new ReflectJavaClass(clsTryLoadClass);
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaPackage findPackage(FqName fqName, boolean z11) {
        s.k(fqName, "fqName");
        return new ReflectJavaPackage(fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public Set<String> knownClassNamesInPackage(FqName packageFqName) {
        s.k(packageFqName, "packageFqName");
        return null;
    }
}
