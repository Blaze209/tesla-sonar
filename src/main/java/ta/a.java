package ta;

import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lta/a;", "Lya/b;", "Lza/c;", "db", "<init>", "(Lza/c;)V", "", "sql", "Lta/e;", "n", "(Ljava/lang/String;)Lta/e;", "Ljn0/h0;", "close", "()V", "a", "Lza/c;", "c", "()Lza/c;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.c db;

    public a(za.c db2) {
        s.k(db2, "db");
        this.db = db2;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final za.c getDb() {
        return this.db;
    }

    @Override // ya.b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.db.close();
    }

    @Override // ya.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e L1(String sql) {
        s.k(sql, "sql");
        return e.INSTANCE.a(this.db, sql);
    }
}
