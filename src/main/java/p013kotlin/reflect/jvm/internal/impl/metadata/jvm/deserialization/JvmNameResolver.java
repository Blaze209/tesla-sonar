package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmNameResolver extends JvmNameResolverBase {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JvmProtoBuf.StringTableTypes f88155g;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(JvmProtoBuf.StringTableTypes types, String[] strings) {
        Set setR1;
        s.k(types, "types");
        s.k(strings, "strings");
        List<Integer> localNameList = types.getLocalNameList();
        if (localNameList.isEmpty()) {
            setR1 = d1.d();
        } else {
            s.h(localNameList);
            setR1 = v.r1(localNameList);
        }
        List<JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        s.j(recordList, "getRecordList(...)");
        super(strings, setR1, JvmNameResolverKt.toExpandedRecordsList(recordList));
        this.f88155g = types;
    }
}
