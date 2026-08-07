package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface d1 {
    <T> T a(Class<T> cls, n nVar);

    <T> void b(T t11, e1<T> e1Var, n nVar);

    <T> void c(List<T> list, e1<T> e1Var, n nVar);

    @Deprecated
    <T> T d(Class<T> cls, n nVar);

    <K, V> void e(Map<K, V> map, i0.a<K, V> aVar, n nVar);

    <T> void f(T t11, e1<T> e1Var, n nVar);

    @Deprecated
    <T> void g(List<T> list, e1<T> e1Var, n nVar);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List<Boolean> list);

    g readBytes();

    void readBytesList(List<g> list);

    double readDouble();

    void readDoubleList(List<Double> list);

    int readEnum();

    void readEnumList(List<Integer> list);

    int readFixed32();

    void readFixed32List(List<Integer> list);

    long readFixed64();

    void readFixed64List(List<Long> list);

    float readFloat();

    void readFloatList(List<Float> list);

    int readInt32();

    void readInt32List(List<Integer> list);

    long readInt64();

    void readInt64List(List<Long> list);

    int readSFixed32();

    void readSFixed32List(List<Integer> list);

    long readSFixed64();

    void readSFixed64List(List<Long> list);

    int readSInt32();

    void readSInt32List(List<Integer> list);

    long readSInt64();

    void readSInt64List(List<Long> list);

    String readString();

    void readStringList(List<String> list);

    void readStringListRequireUtf8(List<String> list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List<Integer> list);

    long readUInt64();

    void readUInt64List(List<Long> list);

    boolean skipField();
}
