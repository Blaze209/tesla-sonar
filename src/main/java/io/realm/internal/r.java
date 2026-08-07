package io.realm.internal;

import io.realm.v;

/* JADX INFO: loaded from: classes9.dex */
public class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f79132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f79133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v.b f79134c;

    public r(OsCollectionChangeSet osCollectionChangeSet) {
        this.f79132a = osCollectionChangeSet;
        boolean zF = osCollectionChangeSet.f();
        Throwable thC = osCollectionChangeSet.c();
        this.f79133b = thC;
        if (thC != null) {
            this.f79134c = v.b.ERROR;
        } else {
            this.f79134c = zF ? v.b.INITIAL : v.b.UPDATE;
        }
    }
}
