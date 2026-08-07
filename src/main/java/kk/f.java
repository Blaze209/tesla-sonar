package kk;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public interface a {
        long a();

        String getId();

        long getSize();
    }

    public interface b {
        boolean r();

        void s(jk.j jVar, Object obj);

        ik.a t(Object obj);
    }

    void a();

    b b(String str, Object obj);

    boolean c(String str, Object obj);

    void d();

    boolean e(String str, Object obj);

    long f(a aVar);

    ik.a g(String str, Object obj);

    Collection<a> getEntries();

    boolean isExternal();

    long remove(String str);
}
