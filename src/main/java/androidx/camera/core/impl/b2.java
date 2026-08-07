package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<C> f3130a = new HashSet();

    public void a(@NonNull List<C> list) {
        this.f3130a.addAll(list);
    }

    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract b2<C> clone();

    @NonNull
    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f3130a));
    }
}
