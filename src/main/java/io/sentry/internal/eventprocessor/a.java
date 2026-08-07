package io.sentry.internal.eventprocessor;

import io.sentry.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f80664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f80665b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f80665b.compareTo(aVar.f80665b);
    }

    public c0 b() {
        return this.f80664a;
    }
}
