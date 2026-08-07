package p013kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ProtoBuf.Type> f88075a;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        s.k(typeTable, "typeTable");
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            s.j(typeList2, "getTypeList(...)");
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i11 >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().setNullable(true).build();
                }
                arrayList.add(typeBuild);
                i11 = i12;
            }
            typeList = arrayList;
        }
        s.j(typeList, "run(...)");
        this.f88075a = typeList;
    }

    public final ProtoBuf.Type get(int i11) {
        return this.f88075a.get(i11);
    }
}
