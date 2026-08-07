package p013kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<SyntheticJavaPartsProvider> f88489a;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(List<? extends SyntheticJavaPartsProvider> inner) {
        s.k(inner, "inner");
        this.f88489a = inner;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(ClassDescriptor thisDescriptor, List<ClassConstructorDescriptor> result, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(result, "result");
        s.k(c11, "c");
        Iterator<T> it = this.f88489a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateConstructors(thisDescriptor, result, c11);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(name, "name");
        s.k(result, "result");
        s.k(c11, "c");
        Iterator<T> it = this.f88489a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateMethods(thisDescriptor, name, result, c11);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(ClassDescriptor thisDescriptor, Name name, List<ClassDescriptor> result, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(name, "name");
        s.k(result, "result");
        s.k(c11, "c");
        Iterator<T> it = this.f88489a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateNestedClass(thisDescriptor, name, result, c11);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(name, "name");
        s.k(result, "result");
        s.k(c11, "c");
        Iterator<T> it = this.f88489a.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).generateStaticFunctions(thisDescriptor, name, result, c11);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getMethodNames(ClassDescriptor thisDescriptor, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(c11, "c");
        List<SyntheticJavaPartsProvider> list = this.f88489a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v.E(arrayList, ((SyntheticJavaPartsProvider) it.next()).getMethodNames(thisDescriptor, c11));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getNestedClassNames(ClassDescriptor thisDescriptor, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(c11, "c");
        List<SyntheticJavaPartsProvider> list = this.f88489a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v.E(arrayList, ((SyntheticJavaPartsProvider) it.next()).getNestedClassNames(thisDescriptor, c11));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getStaticFunctionNames(ClassDescriptor thisDescriptor, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(c11, "c");
        List<SyntheticJavaPartsProvider> list = this.f88489a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            v.E(arrayList, ((SyntheticJavaPartsProvider) it.next()).getStaticFunctionNames(thisDescriptor, c11));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public PropertyDescriptorImpl modifyField(ClassDescriptor thisDescriptor, PropertyDescriptorImpl propertyDescriptor, LazyJavaResolverContext c11) {
        s.k(thisDescriptor, "thisDescriptor");
        s.k(propertyDescriptor, "propertyDescriptor");
        s.k(c11, "c");
        Iterator<T> it = this.f88489a.iterator();
        while (it.hasNext()) {
            propertyDescriptor = ((SyntheticJavaPartsProvider) it.next()).modifyField(thisDescriptor, propertyDescriptor, c11);
        }
        return propertyDescriptor;
    }
}
