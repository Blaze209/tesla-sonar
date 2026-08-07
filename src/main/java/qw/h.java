package qw;

import android.content.Context;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    public interface a<T> {
        String a(T t11);
    }

    public static yu.c<?> b(String str, String str2) {
        return yu.c.l(f.a(str, str2), f.class);
    }

    public static yu.c<?> c(final String str, final a<Context> aVar) {
        return yu.c.m(f.class).b(q.k(Context.class)).f(new yu.g() { // from class: qw.g
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return f.a(str, aVar.a((Context) dVar.a(Context.class)));
            }
        }).d();
    }
}
