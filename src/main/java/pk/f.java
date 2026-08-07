package pk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f<E> extends ArrayList<E> {
    private f(int i11) {
        super(i11);
    }

    public static <E> f<E> a(List<E> list) {
        return new f<>(list);
    }

    public static <E> f<E> b(E... eArr) {
        f<E> fVar = new f<>(eArr.length);
        Collections.addAll(fVar, eArr);
        return fVar;
    }

    private f(List<E> list) {
        super(list);
    }
}
