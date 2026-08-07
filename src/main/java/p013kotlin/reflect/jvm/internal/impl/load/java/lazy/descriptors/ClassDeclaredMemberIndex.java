package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bo0.n;
import ho0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JavaClass f87253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<JavaMember, Boolean> f87254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<JavaMethod, Boolean> f87255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Name, List<JavaMethod>> f87256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Name, JavaField> f87257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Name, JavaRecordComponent> f87258f;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(JavaClass jClass, l<? super JavaMember, Boolean> memberFilter) {
        s.k(jClass, "jClass");
        s.k(memberFilter, "memberFilter");
        this.f87253a = jClass;
        this.f87254b = memberFilter;
        a aVar = new a(this);
        this.f87255c = aVar;
        i iVarH = ho0.l.H(v.e0(jClass.getMethods()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : iVarH) {
            Name name = ((JavaMethod) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f87256d = linkedHashMap;
        i iVarH2 = ho0.l.H(v.e0(this.f87253a.getFields()), this.f87254b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : iVarH2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.f87257e = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.f87253a.getRecordComponents();
        l<JavaMember, Boolean> lVar = this.f87254b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : recordComponents) {
            if (lVar.invoke((JavaMember) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(n.f(v0.e(v.y(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj4).getName(), obj4);
        }
        this.f87258f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(ClassDeclaredMemberIndex classDeclaredMemberIndex, JavaMethod m11) {
        s.k(m11, "m");
        return classDeclaredMemberIndex.f87254b.invoke(m11).booleanValue() && !JavaLoadingKt.isObjectMethodInInterface(m11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaField findFieldByName(Name name) {
        s.k(name, "name");
        return this.f87257e.get(name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Collection<JavaMethod> findMethodsByName(Name name) {
        s.k(name, "name");
        List<JavaMethod> list = this.f87256d.get(name);
        return list != null ? list : v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public JavaRecordComponent findRecordComponentByName(Name name) {
        s.k(name, "name");
        return this.f87258f.get(name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getFieldNames() {
        i iVarH = ho0.l.H(v.e0(this.f87253a.getFields()), this.f87254b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iVarH.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getMethodNames() {
        i iVarH = ho0.l.H(v.e0(this.f87253a.getMethods()), this.f87255c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iVarH.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public Set<Name> getRecordComponentNames() {
        return this.f87258f.keySet();
    }
}
