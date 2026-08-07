package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4309w3 extends AbstractC4316x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39053b;

    public C4309w3(long j11) {
        super(j11, null);
        this.f39053b = j11;
    }

    public static /* synthetic */ C4309w3 copy$default(C4309w3 c4309w3, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = c4309w3.f39053b;
        }
        return c4309w3.copy(j11);
    }

    public final long component1() {
        return this.f39053b;
    }

    public final C4309w3 copy(long j11) {
        return new C4309w3(j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4309w3) && this.f39053b == ((C4309w3) obj).f39053b;
    }

    @Override // com.fourthline.vision.internal.AbstractC4316x3
    public long getTimestamp() {
        return this.f39053b;
    }

    public int hashCode() {
        return Long.hashCode(this.f39053b);
    }

    public String toString() {
        return "OnRecordingStop(timestamp=" + this.f39053b + ")";
    }
}
