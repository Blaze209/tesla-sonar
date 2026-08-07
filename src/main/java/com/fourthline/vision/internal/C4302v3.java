package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4302v3 extends AbstractC4316x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39027b;

    public C4302v3(long j11) {
        super(j11, null);
        this.f39027b = j11;
    }

    public static /* synthetic */ C4302v3 copy$default(C4302v3 c4302v3, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = c4302v3.f39027b;
        }
        return c4302v3.copy(j11);
    }

    public final long component1() {
        return this.f39027b;
    }

    public final C4302v3 copy(long j11) {
        return new C4302v3(j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4302v3) && this.f39027b == ((C4302v3) obj).f39027b;
    }

    @Override // com.fourthline.vision.internal.AbstractC4316x3
    public long getTimestamp() {
        return this.f39027b;
    }

    public int hashCode() {
        return Long.hashCode(this.f39027b);
    }

    public String toString() {
        return "OnRecordingStart(timestamp=" + this.f39027b + ")";
    }
}
