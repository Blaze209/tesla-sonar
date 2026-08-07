package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bo0.n;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NameResolver f88642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BinaryVersion f88643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<ClassId, SourceElement> f88644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<ClassId, ProtoBuf.Class> f88645d;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment proto, NameResolver nameResolver, BinaryVersion metadataVersion, l<? super ClassId, ? extends SourceElement> classSource) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(metadataVersion, "metadataVersion");
        s.k(classSource, "classSource");
        this.f88642a = nameResolver;
        this.f88643b = metadataVersion;
        this.f88644c = classSource;
        List<ProtoBuf.Class> class_List = proto.getClass_List();
        s.j(class_List, "getClass_List(...)");
        List<ProtoBuf.Class> list = class_List;
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.f88642a, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.f88645d = linkedHashMap;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        s.k(classId, "classId");
        ProtoBuf.Class r11 = this.f88645d.get(classId);
        if (r11 == null) {
            return null;
        }
        return new ClassData(this.f88642a, r11, this.f88643b, this.f88644c.invoke(classId));
    }

    public final Collection<ClassId> getAllClassIds() {
        return this.f88645d.keySet();
    }
}
