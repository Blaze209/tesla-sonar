package ua;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import za.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lua/a;", "", "Lza/c;", "db", "Ljn0/h0;", "b", "(Lza/c;)V", "Lya/b;", "connection", "a", "(Lya/b;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    default void a(ya.b connection) {
        s.k(connection, "connection");
        if (connection instanceof ta.a) {
            b(((ta.a) connection).getDb());
        }
    }

    default void b(c db2) {
        s.k(db2, "db");
    }
}
