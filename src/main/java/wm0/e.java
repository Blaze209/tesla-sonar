package wm0;

import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e<T> extends o<T> implements s<T> {
    public abstract boolean Y();

    public abstract boolean Z();

    public abstract boolean a0();

    public final e<T> b0() {
        return this instanceof d ? this : new d(this);
    }
}
