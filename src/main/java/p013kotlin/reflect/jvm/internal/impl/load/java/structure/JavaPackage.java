package p013kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface JavaPackage extends JavaAnnotationOwner {
    Collection<JavaClass> getClasses(l<? super Name, Boolean> lVar);

    FqName getFqName();

    Collection<JavaPackage> getSubPackages();
}
