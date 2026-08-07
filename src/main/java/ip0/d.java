package ip0;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import okio.i0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokio/o;", "Lokio/i0;", "path", "Lokio/n;", "c", "(Lokio/o;Lokio/i0;)Lokio/n;", "", "b", "(Lokio/o;Lokio/i0;)Z", "dir", "mustCreate", "Ljn0/h0;", "a", "(Lokio/o;Lokio/i0;Z)V", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void a(okio.o oVar, i0 dir, boolean z11) {
        s.k(oVar, "<this>");
        s.k(dir, "dir");
        p013kotlin.collections.m mVar = new p013kotlin.collections.m();
        for (i0 i0VarG = dir; i0VarG != null && !oVar.J(i0VarG); i0VarG = i0VarG.g()) {
            mVar.addFirst(i0VarG);
        }
        if (z11 && mVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = mVar.iterator();
        while (it.hasNext()) {
            okio.o.C(oVar, (i0) it.next(), false, 2, null);
        }
    }

    public static final boolean b(okio.o oVar, i0 path) {
        s.k(oVar, "<this>");
        s.k(path, "path");
        return oVar.c0(path) != null;
    }

    public static final okio.n c(okio.o oVar, i0 path) throws FileNotFoundException {
        s.k(oVar, "<this>");
        s.k(path, "path");
        okio.n nVarC0 = oVar.c0(path);
        if (nVarC0 != null) {
            return nVarC0;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
