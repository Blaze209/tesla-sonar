package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface p0 extends q0 {

    public interface a extends q0, Cloneable {
        a T(p0 p0Var);

        p0 build();

        p0 buildPartial();

        a x2(h hVar, n nVar);
    }

    void a(CodedOutputStream codedOutputStream);

    x0<? extends p0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    g toByteString();
}
