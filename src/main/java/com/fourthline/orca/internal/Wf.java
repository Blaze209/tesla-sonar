package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29546a;

    public Wf(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f29546a = name;
    }

    public final String a() {
        return this.f29546a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Wf) && p013kotlin.jvm.internal.s.f(this.f29546a, ((Wf) obj).f29546a);
    }

    public int hashCode() {
        return this.f29546a.hashCode();
    }

    public String toString() {
        return "FlowDestination(name=" + this.f29546a + ")";
    }
}
