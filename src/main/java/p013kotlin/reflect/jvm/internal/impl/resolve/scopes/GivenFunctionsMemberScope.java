package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartList;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f88518c = {o0.k(new f0(o0.b(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f88519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotNullLazyValue f88520b;

    public GivenFunctionsMemberScope(StorageManager storageManager, ClassDescriptor containingClass) {
        s.k(storageManager, "storageManager");
        s.k(containingClass, "containingClass");
        this.f88519a = containingClass;
        this.f88520b = storageManager.createLazyValue(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        List<FunctionDescriptor> listC = givenFunctionsMemberScope.c();
        return v.P0(listC, givenFunctionsMemberScope.d(listC));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<DeclarationDescriptor> d(List<? extends FunctionDescriptor> list) {
        Collection<? extends CallableMemberDescriptor> collectionM;
        final ArrayList arrayList = new ArrayList(3);
        Collection<KotlinType> supertypes = this.f88519a.getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            v.E(arrayList2, ResolutionScope.DefaultImpls.getContributedDescriptors$default(((KotlinType) it.next()).getMemberScope(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            Name name = ((CallableMemberDescriptor) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            s.j(key, "component1(...)");
            Name name2 = (Name) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof FunctionDescriptor);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.DEFAULT;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionM = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (s.f(((FunctionDescriptor) obj4).getName(), name2)) {
                            collectionM.add(obj4);
                        }
                    }
                } else {
                    collectionM = v.m();
                }
                overridingUtil.generateOverridesInFunctionGroup(name2, list4, collectionM, this.f88519a, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                    protected void a(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                        s.k(fromSuper, "fromSuper");
                        s.k(fromCurrent, "fromCurrent");
                        throw new IllegalStateException(("Conflict in scope of " + this.f() + ": " + fromSuper + " vs " + fromCurrent).toString());
                    }

                    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                    public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                        s.k(fakeOverride, "fakeOverride");
                        OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                        arrayList.add(fakeOverride);
                    }
                });
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    private final List<DeclarationDescriptor> e() {
        return (List) StorageKt.getValue(this.f88520b, this, (m<?>) f88518c[0]);
    }

    protected abstract List<FunctionDescriptor> c();

    protected final ClassDescriptor f() {
        return this.f88519a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        return !kindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask()) ? v.m() : e();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        List listM;
        s.k(name, "name");
        s.k(location, "location");
        List<DeclarationDescriptor> listE = e();
        if (listE.isEmpty()) {
            listM = v.m();
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : listE) {
                if ((obj instanceof SimpleFunctionDescriptor) && s.f(((SimpleFunctionDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            listM = smartList;
        }
        return listM;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        List listM;
        s.k(name, "name");
        s.k(location, "location");
        List<DeclarationDescriptor> listE = e();
        if (listE.isEmpty()) {
            listM = v.m();
        } else {
            SmartList smartList = new SmartList();
            for (Object obj : listE) {
                if ((obj instanceof PropertyDescriptor) && s.f(((PropertyDescriptor) obj).getName(), name)) {
                    smartList.add(obj);
                }
            }
            listM = smartList;
        }
        return listM;
    }
}
