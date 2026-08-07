package sv;

import androidx.annotation.NonNull;
import rv.c;
import sv.b;

/* JADX INFO: loaded from: classes5.dex */
public interface b<T extends b<T>> {
    @NonNull
    <U> T registerEncoder(@NonNull Class<U> cls, @NonNull c<? super U> cVar);
}
