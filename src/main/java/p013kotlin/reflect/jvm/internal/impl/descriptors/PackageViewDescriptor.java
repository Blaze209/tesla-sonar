package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes9.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    FqName getFqName();

    List<PackageFragmentDescriptor> getFragments();

    MemberScope getMemberScope();

    ModuleDescriptor getModule();

    boolean isEmpty();
}
