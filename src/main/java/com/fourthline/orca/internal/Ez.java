package com.fourthline.orca.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class Ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3798s4 f25683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f25684c;

    public Ez(String imageId, C3798s4 side, Set errors) {
        p013kotlin.jvm.internal.s.k(imageId, "imageId");
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(errors, "errors");
        this.f25682a = imageId;
        this.f25683b = side;
        this.f25684c = errors;
    }

    public final Set a() {
        return this.f25684c;
    }

    public final String b() {
        return this.f25682a;
    }

    public final C3798s4 c() {
        return this.f25683b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ez)) {
            return false;
        }
        Ez ez2 = (Ez) obj;
        return p013kotlin.jvm.internal.s.f(this.f25682a, ez2.f25682a) && p013kotlin.jvm.internal.s.f(this.f25683b, ez2.f25683b) && p013kotlin.jvm.internal.s.f(this.f25684c, ez2.f25684c);
    }

    public int hashCode() {
        return (((this.f25682a.hashCode() * 31) + this.f25683b.hashCode()) * 31) + this.f25684c.hashCode();
    }

    public String toString() {
        return "StepError(imageId=" + this.f25682a + ", side=" + this.f25683b + ", errors=" + this.f25684c + ")";
    }
}
