package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/room/f0;", "Landroidx/room/g0;", "", "version", "", "identityHash", "legacyIdentityHash", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Lya/b;", "connection", "Ljn0/h0;", "f", "(Lya/b;)V", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/room/f0$a;", "j", "(Lya/b;)Landroidx/room/f0$a;", "h", "g", "a", "b", "I", "e", "()I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String identityHash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String legacyIdentityHash;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/f0$a;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final boolean isValid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String expectedFoundMsg;

        public a(boolean z11, String str) {
            this.isValid = z11;
            this.expectedFoundMsg = str;
        }
    }

    public f0(int i11, String identityHash, String legacyIdentityHash) {
        p013kotlin.jvm.internal.s.k(identityHash, "identityHash");
        p013kotlin.jvm.internal.s.k(legacyIdentityHash, "legacyIdentityHash");
        this.version = i11;
        this.identityHash = identityHash;
        this.legacyIdentityHash = legacyIdentityHash;
    }

    public abstract void a(ya.b connection);

    public abstract void b(ya.b connection);

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIdentityHash() {
        return this.identityHash;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLegacyIdentityHash() {
        return this.legacyIdentityHash;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public abstract void f(ya.b connection);

    public abstract void g(ya.b connection);

    public abstract void h(ya.b connection);

    public abstract void i(ya.b connection);

    public abstract a j(ya.b connection);
}
