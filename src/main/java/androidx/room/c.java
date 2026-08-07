package androidx.room;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\"\u0010\u001d\u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010 \u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u00182\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b(\u0010\u0012¨\u0006+"}, d2 = {"Landroidx/room/c;", "Lya/d;", "delegate", "<init>", "(Lya/d;)V", "", "index", "", "getBlob", "(I)[B", "", "getLong", "(I)J", "", "q3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "I1", "()Z", "Ljn0/h0;", "reset", "()V", "close", "value", "y", "(I[B)V", "", "G", "(ID)V", "x", "(IJ)V", "c2", "(ILjava/lang/String;)V", "A", "(I)V", "getBoolean", "b", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c implements ya.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ya.d f13663a;

    public c(ya.d delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.f13663a = delegate;
    }

    @Override // ya.d
    public void A(int index) {
        this.f13663a.A(index);
    }

    @Override // ya.d
    public void G(int index, double value) {
        this.f13663a.G(index, value);
    }

    @Override // ya.d
    public boolean I1() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public void c2(int index, String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f13663a.c2(index, value);
    }

    @Override // ya.d, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public byte[] getBlob(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public boolean getBoolean(int index) {
        return this.f13663a.getBoolean(index);
    }

    @Override // ya.d
    public int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public String getColumnName(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public long getLong(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public boolean isNull(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public String q3(int index) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // ya.d
    public void x(int index, long value) {
        this.f13663a.x(index, value);
    }

    @Override // ya.d
    public void y(int index, byte[] value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f13663a.y(index, value);
    }
}
