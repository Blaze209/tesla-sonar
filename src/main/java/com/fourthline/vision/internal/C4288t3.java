package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4288t3 extends AbstractC4316x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38884b;

    public C4288t3(long j11) {
        super(j11, null);
        this.f38884b = j11;
    }

    public static /* synthetic */ C4288t3 copy$default(C4288t3 c4288t3, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = c4288t3.f38884b;
        }
        return c4288t3.copy(j11);
    }

    public final long component1() {
        return this.f38884b;
    }

    public final C4288t3 copy(long j11) {
        return new C4288t3(j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4288t3) && this.f38884b == ((C4288t3) obj).f38884b;
    }

    @Override // com.fourthline.vision.internal.AbstractC4316x3
    public long getTimestamp() {
        return this.f38884b;
    }

    public int hashCode() {
        return Long.hashCode(this.f38884b);
    }

    public String toString() {
        return "OnStepSuccess(timestamp=" + this.f38884b + ")";
    }
}
