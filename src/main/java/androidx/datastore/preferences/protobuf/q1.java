package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface q1 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    void a(int i11, g gVar);

    void b(int i11, Object obj, e1 e1Var);

    <K, V> void c(int i11, i0.a<K, V> aVar, Map<K, V> map);

    @Deprecated
    void d(int i11, List<?> list, e1 e1Var);

    @Deprecated
    void e(int i11, Object obj, e1 e1Var);

    void f(int i11, List<?> list, e1 e1Var);

    a fieldOrder();

    void writeBool(int i11, boolean z11);

    void writeBoolList(int i11, List<Boolean> list, boolean z11);

    void writeBytesList(int i11, List<g> list);

    void writeDouble(int i11, double d11);

    void writeDoubleList(int i11, List<Double> list, boolean z11);

    @Deprecated
    void writeEndGroup(int i11);

    void writeEnum(int i11, int i12);

    void writeEnumList(int i11, List<Integer> list, boolean z11);

    void writeFixed32(int i11, int i12);

    void writeFixed32List(int i11, List<Integer> list, boolean z11);

    void writeFixed64(int i11, long j11);

    void writeFixed64List(int i11, List<Long> list, boolean z11);

    void writeFloat(int i11, float f11);

    void writeFloatList(int i11, List<Float> list, boolean z11);

    void writeInt32(int i11, int i12);

    void writeInt32List(int i11, List<Integer> list, boolean z11);

    void writeInt64(int i11, long j11);

    void writeInt64List(int i11, List<Long> list, boolean z11);

    void writeMessageSetItem(int i11, Object obj);

    void writeSFixed32(int i11, int i12);

    void writeSFixed32List(int i11, List<Integer> list, boolean z11);

    void writeSFixed64(int i11, long j11);

    void writeSFixed64List(int i11, List<Long> list, boolean z11);

    void writeSInt32(int i11, int i12);

    void writeSInt32List(int i11, List<Integer> list, boolean z11);

    void writeSInt64(int i11, long j11);

    void writeSInt64List(int i11, List<Long> list, boolean z11);

    @Deprecated
    void writeStartGroup(int i11);

    void writeString(int i11, String str);

    void writeStringList(int i11, List<String> list);

    void writeUInt32(int i11, int i12);

    void writeUInt32List(int i11, List<Integer> list, boolean z11);

    void writeUInt64(int i11, long j11);

    void writeUInt64List(int i11, List<Long> list, boolean z11);
}
