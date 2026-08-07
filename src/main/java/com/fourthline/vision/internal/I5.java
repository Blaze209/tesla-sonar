package com.fourthline.vision.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37792b;

    public I5(Object obj, boolean z11) {
        this.f37791a = obj;
        this.f37792b = z11;
    }

    public static /* synthetic */ I5 copy$default(I5 i11, Object obj, boolean z11, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = i11.f37791a;
        }
        if ((i12 & 2) != 0) {
            z11 = i11.f37792b;
        }
        return i11.copy(obj, z11);
    }

    public final Object component1() {
        return this.f37791a;
    }

    public final boolean component2() {
        return this.f37792b;
    }

    public final I5 copy(Object obj, boolean z11) {
        return new I5(obj, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I5)) {
            return false;
        }
        I5 i11 = (I5) obj;
        return p013kotlin.jvm.internal.s.f(this.f37791a, i11.f37791a) && this.f37792b == i11.f37792b;
    }

    public final boolean getShouldDelayVideo() {
        return this.f37792b;
    }

    public final Object getStepType() {
        return this.f37791a;
    }

    public int hashCode() {
        Object obj = this.f37791a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + Boolean.hashCode(this.f37792b);
    }

    public String toString() {
        return "StepConfig(stepType=" + this.f37791a + ", shouldDelayVideo=" + this.f37792b + ")";
    }

    public /* synthetic */ I5(Object obj, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? false : z11);
    }
}
