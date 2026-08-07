package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4295u3 extends AbstractC4316x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I5 f38936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4295u3(I5 stepConfig, long j11) {
        super(j11, null);
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        this.f38936b = stepConfig;
        this.f38937c = j11;
    }

    public static /* synthetic */ C4295u3 copy$default(C4295u3 c4295u3, I5 i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = c4295u3.f38936b;
        }
        if ((i12 & 2) != 0) {
            j11 = c4295u3.f38937c;
        }
        return c4295u3.copy(i11, j11);
    }

    public final I5 component1() {
        return this.f38936b;
    }

    public final long component2() {
        return this.f38937c;
    }

    public final C4295u3 copy(I5 stepConfig, long j11) {
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        return new C4295u3(stepConfig, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4295u3)) {
            return false;
        }
        C4295u3 c4295u3 = (C4295u3) obj;
        return p013kotlin.jvm.internal.s.f(this.f38936b, c4295u3.f38936b) && this.f38937c == c4295u3.f38937c;
    }

    public final I5 getStepConfig() {
        return this.f38936b;
    }

    @Override // com.fourthline.vision.internal.AbstractC4316x3
    public long getTimestamp() {
        return this.f38937c;
    }

    public int hashCode() {
        return (this.f38936b.hashCode() * 31) + Long.hashCode(this.f38937c);
    }

    public String toString() {
        return "OnStepUpdate(stepConfig=" + this.f38936b + ", timestamp=" + this.f38937c + ")";
    }
}
