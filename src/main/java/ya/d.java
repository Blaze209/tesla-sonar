package ya;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J!\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u0003H&¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0019H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H&¢\u0006\u0004\b&\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lya/d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "index", "", "value", "Ljn0/h0;", "y", "(I[B)V", "", "G", "(ID)V", "", "x", "(IJ)V", "", "c2", "(ILjava/lang/String;)V", "A", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "", "getBoolean", "(I)Z", "q3", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "I1", "()Z", "reset", "()V", "close", "sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d extends AutoCloseable {
    void A(int index);

    void G(int index, double value);

    boolean I1();

    void c2(int index, String value);

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(int index);

    default boolean getBoolean(int index) {
        return getLong(index) != 0;
    }

    int getColumnCount();

    String getColumnName(int index);

    long getLong(int index);

    boolean isNull(int index);

    String q3(int index);

    void reset();

    void x(int index, long value);

    void y(int index, byte[] value);
}
