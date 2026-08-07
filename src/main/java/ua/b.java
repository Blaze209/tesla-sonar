package ua;

import jn0.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import za.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lua/b;", "", "", "startVersion", "endVersion", "<init>", "(II)V", "Lza/c;", "db", "Ljn0/h0;", "b", "(Lza/c;)V", "Lya/b;", "connection", "a", "(Lya/b;)V", "I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int startVersion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int endVersion;

    public b(int i11, int i12) {
        this.startVersion = i11;
        this.endVersion = i12;
    }

    public void a(ya.b connection) {
        s.k(connection, "connection");
        if (!(connection instanceof ta.a)) {
            throw new q("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((ta.a) connection).getDb());
    }

    public void b(c db2) {
        s.k(db2, "db");
        throw new q("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
