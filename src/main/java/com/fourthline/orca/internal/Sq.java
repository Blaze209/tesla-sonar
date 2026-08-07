package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27799a;

    public Sq(List items) {
        p013kotlin.jvm.internal.s.k(items, "items");
        this.f27799a = items;
    }

    public final List a() {
        return this.f27799a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Sq) && p013kotlin.jvm.internal.s.f(this.f27799a, ((Sq) obj).f27799a);
    }

    public int hashCode() {
        return this.f27799a.hashCode();
    }

    public String toString() {
        return "Menu(items=" + this.f27799a + ")";
    }
}
