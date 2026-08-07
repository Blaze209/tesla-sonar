package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4274r3 extends AbstractC4316x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I5 f38808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4274r3(I5 stepConfig, long j11) {
        super(j11, null);
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        this.f38808b = stepConfig;
        this.f38809c = j11;
    }

    public static /* synthetic */ C4274r3 copy$default(C4274r3 c4274r3, I5 i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = c4274r3.f38808b;
        }
        if ((i12 & 2) != 0) {
            j11 = c4274r3.f38809c;
        }
        return c4274r3.copy(i11, j11);
    }

    public final I5 component1() {
        return this.f38808b;
    }

    public final long component2() {
        return this.f38809c;
    }

    public final C4274r3 copy(I5 stepConfig, long j11) {
        p013kotlin.jvm.internal.s.k(stepConfig, "stepConfig");
        return new C4274r3(stepConfig, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4274r3)) {
            return false;
        }
        C4274r3 c4274r3 = (C4274r3) obj;
        return p013kotlin.jvm.internal.s.f(this.f38808b, c4274r3.f38808b) && this.f38809c == c4274r3.f38809c;
    }

    public final I5 getStepConfig() {
        return this.f38808b;
    }

    @Override // com.fourthline.vision.internal.AbstractC4316x3
    public long getTimestamp() {
        return this.f38809c;
    }

    public int hashCode() {
        return (this.f38808b.hashCode() * 31) + Long.hashCode(this.f38809c);
    }

    public String toString() {
        return "ManualTrigger(stepConfig=" + this.f38808b + ", timestamp=" + this.f38809c + ")";
    }
}
