package qw;

import java.util.Iterator;
import java.util.Set;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f106182b;

    c(Set<f> set, d dVar) {
        this.f106181a = d(set);
        this.f106182b = dVar;
    }

    public static /* synthetic */ i b(yu.d dVar) {
        return new c(dVar.f(f.class), d.a());
    }

    public static yu.c<i> c() {
        return yu.c.c(i.class).b(q.o(f.class)).f(new yu.g() { // from class: qw.b
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return c.b(dVar);
            }
        }).d();
    }

    private static String d(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // qw.i
    public String a() {
        if (this.f106182b.b().isEmpty()) {
            return this.f106181a;
        }
        return this.f106181a + ' ' + d(this.f106182b.b());
    }
}
