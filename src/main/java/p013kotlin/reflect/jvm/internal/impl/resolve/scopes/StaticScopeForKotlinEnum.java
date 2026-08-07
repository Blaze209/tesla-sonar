package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import co0.m;
import java.util.Collection;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartList;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f88527e = {o0.k(new f0(o0.b(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), o0.k(new f0(o0.b(StaticScopeForKotlinEnum.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f88528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f88530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f88531d;

    public StaticScopeForKotlinEnum(StorageManager storageManager, ClassDescriptor containingClass, boolean z11) {
        s.k(storageManager, "storageManager");
        s.k(containingClass, "containingClass");
        this.f88528a = containingClass;
        this.f88529b = z11;
        containingClass.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f88530c = storageManager.createLazyValue(new d(this));
        this.f88531d = storageManager.createLazyValue(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return v.p(DescriptorFactory.createEnumValueOfMethod(staticScopeForKotlinEnum.f88528a), DescriptorFactory.createEnumValuesMethod(staticScopeForKotlinEnum.f88528a));
    }

    private final List<SimpleFunctionDescriptor> d() {
        return (List) StorageKt.getValue(this.f88530c, this, (m<?>) f88527e[0]);
    }

    private final List<PropertyDescriptor> e() {
        return (List) StorageKt.getValue(this.f88531d, this, (m<?>) f88527e[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return staticScopeForKotlinEnum.f88529b ? v.q(DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.f88528a)) : v.m();
    }

    public Void getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, l lVar) {
        return getContributedDescriptors(descriptorKindFilter, (l<? super Name, Boolean>) lVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        List<PropertyDescriptor> listE = e();
        SmartList smartList = new SmartList();
        for (Object obj : listE) {
            if (s.f(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) getContributedClassifier(name, lookupLocation);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<CallableMemberDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        return v.P0(d(), e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public SmartList<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        List<SimpleFunctionDescriptor> listD = d();
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : listD) {
            if (s.f(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }
}
