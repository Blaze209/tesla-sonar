package p0;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class u<T> implements Consumer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Consumer<T> f100205a;

    public void a(@NonNull Consumer<T> consumer) {
        this.f100205a = consumer;
    }

    @Override // androidx.core.util.Consumer
    public void accept(@NonNull T t11) {
        p013kotlin.jvm.internal.s.i(this.f100205a, "Listener is not set.");
        this.f100205a.accept(t11);
    }
}
