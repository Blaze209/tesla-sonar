package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bo0.n;
import co0.m;
import ho0.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import p013kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f88705e = {o0.k(new f0(o0.b(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), o0.k(new f0(o0.b(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializationContext f88706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f88707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f88708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NullableLazyValue f88709d;

    /* JADX INFO: Access modifiers changed from: private */
    final class OptimizedImplementation implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ m<Object>[] f88710j = {o0.k(new f0(o0.b(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), o0.k(new f0(o0.b(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Name, byte[]> f88711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Name, byte[]> f88712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Name, byte[]> f88713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f88714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f88715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f88716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final NotNullLazyValue f88717g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final NotNullLazyValue f88718h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ DeserializedMemberScope f88719i;

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) throws IOException {
            Map<Name, byte[]> mapI;
            s.k(functionList, "functionList");
            s.k(propertyList, "propertyList");
            s.k(typeAliasList, "typeAliasList");
            this.f88719i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name name = NameResolverUtilKt.getName(deserializedMemberScope.l().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f88711a = n(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f88719i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.l().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(name2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(name2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f88712b = n(linkedHashMap2);
            if (this.f88719i.l().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f88719i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.l().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(name3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(name3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapI = n(linkedHashMap3);
            } else {
                mapI = v0.i();
            }
            this.f88713c = mapI;
            this.f88714d = this.f88719i.l().getStorageManager().createMemoizedFunction(new z(this));
            this.f88715e = this.f88719i.l().getStorageManager().createMemoizedFunction(new a0(this));
            this.f88716f = this.f88719i.l().getStorageManager().createMemoizedFunctionWithNullableValues(new b0(this));
            this.f88717g = this.f88719i.l().getStorageManager().createLazyValue(new c0(this, this.f88719i));
            this.f88718h = this.f88719i.l().getStorageManager().createLazyValue(new d0(this, this.f88719i));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        private final Collection<SimpleFunctionDescriptor> i(Name name) {
            List<ProtoBuf.Function> listM;
            Map<Name, byte[]> map = this.f88711a;
            Parser<ProtoBuf.Function> PARSER = ProtoBuf.Function.PARSER;
            s.j(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.f88719i;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                List listC0 = l.c0(l.r(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), this.f88719i)));
                if (listC0 != null) {
                    listM = listC0;
                } else {
                    listM = v.m();
                }
            } else {
                listM = v.m();
            }
            ArrayList arrayList = new ArrayList(listM.size());
            for (ProtoBuf.Function function : listM) {
                MemberDeserializer memberDeserializer = deserializedMemberScope.l().getMemberDeserializer();
                s.h(function);
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = memberDeserializer.loadFunction(function);
                if (!deserializedMemberScope.s(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            deserializedMemberScope.g(name, arrayList);
            return CollectionsKt.compact(arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        private final Collection<PropertyDescriptor> j(Name name) {
            List<ProtoBuf.Property> listM;
            Map<Name, byte[]> map = this.f88712b;
            Parser<ProtoBuf.Property> PARSER = ProtoBuf.Property.PARSER;
            s.j(PARSER, "PARSER");
            DeserializedMemberScope deserializedMemberScope = this.f88719i;
            byte[] bArr = map.get(name);
            if (bArr != null) {
                List listC0 = l.c0(l.r(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), this.f88719i)));
                if (listC0 != null) {
                    listM = listC0;
                } else {
                    listM = v.m();
                }
            } else {
                listM = v.m();
            }
            ArrayList arrayList = new ArrayList(listM.size());
            for (ProtoBuf.Property property : listM) {
                MemberDeserializer memberDeserializer = deserializedMemberScope.l().getMemberDeserializer();
                s.h(property);
                PropertyDescriptor propertyDescriptorLoadProperty = memberDeserializer.loadProperty(property);
                if (propertyDescriptorLoadProperty != null) {
                    arrayList.add(propertyDescriptorLoadProperty);
                }
            }
            deserializedMemberScope.h(name, arrayList);
            return CollectionsKt.compact(arrayList);
        }

        private final TypeAliasDescriptor k(Name name) {
            ProtoBuf.TypeAlias delimitedFrom;
            byte[] bArr = this.f88713c.get(name);
            if (bArr == null || (delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f88719i.l().getComponents().getExtensionRegistryLite())) == null) {
                return null;
            }
            return this.f88719i.l().getMemberDeserializer().loadTypeAlias(delimitedFrom);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set l(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return d1.n(optimizedImplementation.f88711a.keySet(), deserializedMemberScope.o());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection m(OptimizedImplementation optimizedImplementation, Name it) {
            s.k(it, "it");
            return optimizedImplementation.i(it);
        }

        private final Map<Name, byte[]> n(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(v.y(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractMessageLite) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(h0.f84049a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection o(OptimizedImplementation optimizedImplementation, Name it) {
            s.k(it, "it");
            return optimizedImplementation.j(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TypeAliasDescriptor p(OptimizedImplementation optimizedImplementation, Name it) {
            s.k(it, "it");
            return optimizedImplementation.k(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set q(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return d1.n(optimizedImplementation.f88712b.keySet(), deserializedMemberScope.p());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public TypeAliasDescriptor a(Name name) {
            s.k(name, "name");
            return (TypeAliasDescriptor) this.f88716f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> b() {
            return this.f88713c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void c(Collection<DeclarationDescriptor> result, DescriptorKindFilter kindFilter, wn0.l<? super Name, Boolean> nameFilter, LookupLocation location) {
            s.k(result, "result");
            s.k(kindFilter, "kindFilter");
            s.k(nameFilter, "nameFilter");
            s.k(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                Set<Name> variableNames = getVariableNames();
                ArrayList arrayList = new ArrayList();
                for (Name name : variableNames) {
                    if (nameFilter.invoke(name).booleanValue()) {
                        arrayList.addAll(getContributedVariables(name, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                s.j(INSTANCE, "INSTANCE");
                v.C(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                Set<Name> functionNames = getFunctionNames();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : functionNames) {
                    if (nameFilter.invoke(name2).booleanValue()) {
                        arrayList2.addAll(getContributedFunctions(name2, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                s.j(INSTANCE2, "INSTANCE");
                v.C(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            return !getFunctionNames().contains(name) ? v.m() : (Collection) this.f88714d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            return !getVariableNames().contains(name) ? v.m() : (Collection) this.f88715e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.f88717g, this, (m<?>) f88710j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.f88718h, this, (m<?>) f88710j[1]);
        }
    }

    private interface a {
        TypeAliasDescriptor a(Name name);

        Set<Name> b();

        void c(Collection<DeclarationDescriptor> collection, DescriptorKindFilter descriptorKindFilter, wn0.l<? super Name, Boolean> lVar, LookupLocation lookupLocation);

        Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

        Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation);

        Set<Name> getFunctionNames();

        Set<Name> getVariableNames();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final /* synthetic */ m<Object>[] f88723o = {o0.k(new f0(o0.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), o0.k(new f0(o0.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), o0.k(new f0(o0.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), o0.k(new f0(o0.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), o0.k(new f0(o0.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), o0.k(new f0(o0.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), o0.k(new f0(o0.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), o0.k(new f0(o0.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), o0.k(new f0(o0.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), o0.k(new f0(o0.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<ProtoBuf.Function> f88724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ProtoBuf.Property> f88725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ProtoBuf.TypeAlias> f88726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue f88727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final NotNullLazyValue f88728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final NotNullLazyValue f88729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final NotNullLazyValue f88730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final NotNullLazyValue f88731h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final NotNullLazyValue f88732i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final NotNullLazyValue f88733j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final NotNullLazyValue f88734k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final NotNullLazyValue f88735l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final NotNullLazyValue f88736m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ DeserializedMemberScope f88737n;

        public b(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            s.k(functionList, "functionList");
            s.k(propertyList, "propertyList");
            s.k(typeAliasList, "typeAliasList");
            this.f88737n = deserializedMemberScope;
            this.f88724a = functionList;
            this.f88725b = propertyList;
            this.f88726c = deserializedMemberScope.l().getComponents().getConfiguration().getTypeAliasesAllowed() ? typeAliasList : v.m();
            this.f88727d = deserializedMemberScope.l().getStorageManager().createLazyValue(new p(this));
            this.f88728e = deserializedMemberScope.l().getStorageManager().createLazyValue(new q(this));
            this.f88729f = deserializedMemberScope.l().getStorageManager().createLazyValue(new r(this));
            this.f88730g = deserializedMemberScope.l().getStorageManager().createLazyValue(new s(this));
            this.f88731h = deserializedMemberScope.l().getStorageManager().createLazyValue(new t(this));
            this.f88732i = deserializedMemberScope.l().getStorageManager().createLazyValue(new u(this));
            this.f88733j = deserializedMemberScope.l().getStorageManager().createLazyValue(new v(this));
            this.f88734k = deserializedMemberScope.l().getStorageManager().createLazyValue(new w(this));
            this.f88735l = deserializedMemberScope.l().getStorageManager().createLazyValue(new x(this, deserializedMemberScope));
            this.f88736m = deserializedMemberScope.l().getStorageManager().createLazyValue(new y(this, deserializedMemberScope));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map A(b bVar) {
            List<SimpleFunctionDescriptor> listB = bVar.B();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listB) {
                Name name = ((SimpleFunctionDescriptor) obj).getName();
                s.j(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List<SimpleFunctionDescriptor> B() {
            return (List) StorageKt.getValue(this.f88730g, this, (m<?>) f88723o[3]);
        }

        private final List<PropertyDescriptor> C() {
            return (List) StorageKt.getValue(this.f88731h, this, (m<?>) f88723o[4]);
        }

        private final List<TypeAliasDescriptor> D() {
            return (List) StorageKt.getValue(this.f88729f, this, (m<?>) f88723o[2]);
        }

        private final List<SimpleFunctionDescriptor> E() {
            return (List) StorageKt.getValue(this.f88727d, this, (m<?>) f88723o[0]);
        }

        private final List<PropertyDescriptor> F() {
            return (List) StorageKt.getValue(this.f88728e, this, (m<?>) f88723o[1]);
        }

        private final Map<Name, Collection<SimpleFunctionDescriptor>> G() {
            return (Map) StorageKt.getValue(this.f88733j, this, (m<?>) f88723o[6]);
        }

        private final Map<Name, Collection<PropertyDescriptor>> H() {
            return (Map) StorageKt.getValue(this.f88734k, this, (m<?>) f88723o[7]);
        }

        private final Map<Name, TypeAliasDescriptor> I() {
            return (Map) StorageKt.getValue(this.f88732i, this, (m<?>) f88723o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map J(b bVar) {
            List<PropertyDescriptor> listC = bVar.C();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listC) {
                Name name = ((PropertyDescriptor) obj).getName();
                s.j(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map K(b bVar) {
            List<TypeAliasDescriptor> listD = bVar.D();
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(listD, 10)), 16));
            for (Object obj : listD) {
                Name name = ((TypeAliasDescriptor) obj).getName();
                s.j(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set L(b bVar, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Property> list = bVar.f88725b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = bVar.f88737n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope2.l().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it.next())).getName()));
            }
            return d1.n(linkedHashSet, deserializedMemberScope.p());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List n(b bVar) {
            return v.P0(bVar.E(), bVar.q());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List o(b bVar) {
            return v.P0(bVar.F(), bVar.r());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List p(b bVar) {
            return bVar.w();
        }

        private final List<SimpleFunctionDescriptor> q() {
            Set<Name> setO = this.f88737n.o();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setO.iterator();
            while (it.hasNext()) {
                v.E(arrayList, t((Name) it.next()));
            }
            return arrayList;
        }

        private final List<PropertyDescriptor> r() {
            Set<Name> setP = this.f88737n.p();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setP.iterator();
            while (it.hasNext()) {
                v.E(arrayList, u((Name) it.next()));
            }
            return arrayList;
        }

        private final List<SimpleFunctionDescriptor> s() {
            List<ProtoBuf.Function> list = this.f88724a;
            DeserializedMemberScope deserializedMemberScope = this.f88737n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.l().getMemberDeserializer().loadFunction((ProtoBuf.Function) ((MessageLite) it.next()));
                if (!deserializedMemberScope.s(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            return arrayList;
        }

        private final List<SimpleFunctionDescriptor> t(Name name) {
            List<SimpleFunctionDescriptor> listE = E();
            DeserializedMemberScope deserializedMemberScope = this.f88737n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (s.f(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.g(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<PropertyDescriptor> u(Name name) {
            List<PropertyDescriptor> listF = F();
            DeserializedMemberScope deserializedMemberScope = this.f88737n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (s.f(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.h(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<PropertyDescriptor> v() {
            List<ProtoBuf.Property> list = this.f88725b;
            DeserializedMemberScope deserializedMemberScope = this.f88737n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor propertyDescriptorLoadProperty = deserializedMemberScope.l().getMemberDeserializer().loadProperty((ProtoBuf.Property) ((MessageLite) it.next()));
                if (propertyDescriptorLoadProperty != null) {
                    arrayList.add(propertyDescriptorLoadProperty);
                }
            }
            return arrayList;
        }

        private final List<TypeAliasDescriptor> w() {
            List<ProtoBuf.TypeAlias> list = this.f88726c;
            DeserializedMemberScope deserializedMemberScope = this.f88737n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorLoadTypeAlias = deserializedMemberScope.l().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (typeAliasDescriptorLoadTypeAlias != null) {
                    arrayList.add(typeAliasDescriptorLoadTypeAlias);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List x(b bVar) {
            return bVar.s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List y(b bVar) {
            return bVar.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set z(b bVar, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Function> list = bVar.f88724a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = bVar.f88737n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope2.l().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
            }
            return d1.n(linkedHashSet, deserializedMemberScope.o());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public TypeAliasDescriptor a(Name name) {
            s.k(name, "name");
            return I().get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> b() {
            List<ProtoBuf.TypeAlias> list = this.f88726c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f88737n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.l().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void c(Collection<DeclarationDescriptor> result, DescriptorKindFilter kindFilter, wn0.l<? super Name, Boolean> nameFilter, LookupLocation location) {
            s.k(result, "result");
            s.k(kindFilter, "kindFilter");
            s.k(nameFilter, "nameFilter");
            s.k(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                for (Object obj : C()) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    s.j(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (Object obj2 : B()) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    s.j(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            if (!getFunctionNames().contains(name)) {
                return v.m();
            }
            Collection<SimpleFunctionDescriptor> collection = G().get(name);
            return collection == null ? v.m() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            if (!getVariableNames().contains(name)) {
                return v.m();
            }
            Collection<PropertyDescriptor> collection = H().get(name);
            return collection == null ? v.m() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.f88735l, this, (m<?>) f88723o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.f88736m, this, (m<?>) f88723o[9]);
        }
    }

    protected DeserializedMemberScope(DeserializationContext c11, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList, wn0.a<? extends Collection<Name>> classNames) {
        s.k(c11, "c");
        s.k(functionList, "functionList");
        s.k(propertyList, "propertyList");
        s.k(typeAliasList, "typeAliasList");
        s.k(classNames, "classNames");
        this.f88706a = c11;
        this.f88707b = j(functionList, propertyList, typeAliasList);
        this.f88708c = c11.getStorageManager().createLazyValue(new n(classNames));
        this.f88709d = c11.getStorageManager().createNullableLazyValue(new o(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set d(wn0.a aVar) {
        return v.r1((Iterable) aVar.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set e(DeserializedMemberScope deserializedMemberScope) {
        Set<Name> setN = deserializedMemberScope.n();
        if (setN == null) {
            return null;
        }
        return d1.n(d1.n(deserializedMemberScope.getClassNames$deserialization(), deserializedMemberScope.f88707b.b()), setN);
    }

    private final a j(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f88706a.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new b(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    private final ClassDescriptor k(Name name) {
        return this.f88706a.getComponents().deserializeClass(i(name));
    }

    private final Set<Name> m() {
        return (Set) StorageKt.getValue(this.f88709d, this, (m<?>) f88705e[1]);
    }

    private final TypeAliasDescriptor q(Name name) {
        return this.f88707b.a(name);
    }

    protected abstract void c(Collection<DeclarationDescriptor> collection, wn0.l<? super Name, Boolean> lVar);

    protected final Collection<DeclarationDescriptor> f(DescriptorKindFilter kindFilter, wn0.l<? super Name, Boolean> nameFilter, LookupLocation location) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        s.k(location, "location");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (kindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            c(arrayList, nameFilter);
        }
        this.f88707b.c(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (nameFilter.invoke(name).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, k(name));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : this.f88707b.b()) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, this.f88707b.a(name2));
                }
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    protected void g(Name name, List<SimpleFunctionDescriptor> functions) {
        s.k(name, "name");
        s.k(functions, "functions");
    }

    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.f88708c, this, (m<?>) f88705e[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        if (r(name)) {
            return k(name);
        }
        if (this.f88707b.b().contains(name)) {
            return q(name);
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return this.f88707b.getContributedFunctions(name, location);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return this.f88707b.getContributedVariables(name, location);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.f88707b.getFunctionNames();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.f88707b.getVariableNames();
    }

    protected void h(Name name, List<PropertyDescriptor> descriptors) {
        s.k(name, "name");
        s.k(descriptors, "descriptors");
    }

    protected abstract ClassId i(Name name);

    protected final DeserializationContext l() {
        return this.f88706a;
    }

    protected abstract Set<Name> n();

    protected abstract Set<Name> o();

    protected abstract Set<Name> p();

    protected boolean r(Name name) {
        s.k(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    protected boolean s(SimpleFunctionDescriptor function) {
        s.k(function, "function");
        return true;
    }
}
