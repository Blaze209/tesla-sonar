package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;

/* JADX INFO: loaded from: classes4.dex */
public final class Jj implements OD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Coordinate f26473a;

    public Jj(Coordinate location) {
        p013kotlin.jvm.internal.s.k(location, "location");
        this.f26473a = location;
    }

    public final Coordinate a() {
        return this.f26473a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Jj) && p013kotlin.jvm.internal.s.f(this.f26473a, ((Jj) obj).f26473a);
    }

    public int hashCode() {
        return this.f26473a.hashCode();
    }

    public String toString() {
        return "Result(location=" + this.f26473a + ")";
    }
}
