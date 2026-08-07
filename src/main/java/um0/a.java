package um0;

import io.reactivex.rxjava3.core.h;
import io.reactivex.rxjava3.core.i;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T> extends h<T> implements nr0.b, nr0.a, i<T> {
    public final a<T> z() {
        return this instanceof b ? this : new b(this);
    }
}
