package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
interface e1<T> {
    void a(T t11, q1 q1Var);

    void b(T t11, d1 d1Var, n nVar);

    boolean equals(T t11, T t12);

    int getSerializedSize(T t11);

    int hashCode(T t11);

    boolean isInitialized(T t11);

    void makeImmutable(T t11);

    void mergeFrom(T t11, T t12);

    T newInstance();
}
