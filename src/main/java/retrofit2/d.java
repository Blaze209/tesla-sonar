package retrofit2;

import okhttp3.Request;
import okio.s0;

/* JADX INFO: loaded from: classes10.dex */
public interface d<T> extends Cloneable {
    void cancel();

    d<T> clone();

    void enqueue(f<T> fVar);

    y<T> execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    s0 timeout();
}
