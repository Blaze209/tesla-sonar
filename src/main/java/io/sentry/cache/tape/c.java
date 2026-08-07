package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c<T> implements Iterable<T>, Closeable {

    public interface a<T> {
        void a(T t11, OutputStream outputStream);

        T b(byte[] bArr);
    }

    public static <T> c<T> p(d dVar, a<T> aVar) {
        return new b(dVar, aVar);
    }

    public static <T> c<T> t() {
        return new io.sentry.cache.tape.a();
    }

    public List<T> B(int i11) {
        int iMin = Math.min(i11, size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator<T> it = iterator();
        for (int i12 = 0; i12 < iMin; i12++) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public abstract void C(int i11);

    public void clear() {
        C(size());
    }

    public abstract void n(T t11);

    public List<T> o() {
        return B(size());
    }

    public abstract int size();
}
