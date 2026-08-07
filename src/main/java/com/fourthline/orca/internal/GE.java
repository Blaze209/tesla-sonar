package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class GE implements PD, BE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Of f25935a;

    public GE(Of flowAction) {
        p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
        this.f25935a = flowAction;
    }

    public final Of c() {
        return this.f25935a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GE) && p013kotlin.jvm.internal.s.f(this.f25935a, ((GE) obj).f25935a);
    }

    public int hashCode() {
        return this.f25935a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f25935a + ")";
    }
}
