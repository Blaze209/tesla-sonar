package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class e8<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f80530a;

    e8(List<T> list) {
        this.f80530a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    public List<T> a() {
        return this.f80530a;
    }
}
