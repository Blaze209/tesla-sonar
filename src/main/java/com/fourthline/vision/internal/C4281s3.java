package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4281s3 extends AbstractC4316x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38834b;

    public C4281s3(long j11) {
        super(j11, null);
        this.f38834b = j11;
    }

    public static /* synthetic */ C4281s3 copy$default(C4281s3 c4281s3, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = c4281s3.f38834b;
        }
        return c4281s3.copy(j11);
    }

    public final long component1() {
        return this.f38834b;
    }

    public final C4281s3 copy(long j11) {
        return new C4281s3(j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4281s3) && this.f38834b == ((C4281s3) obj).f38834b;
    }

    @Override // com.fourthline.vision.internal.AbstractC4316x3
    public long getTimestamp() {
        return this.f38834b;
    }

    public int hashCode() {
        return Long.hashCode(this.f38834b);
    }

    public String toString() {
        return "OnStepResults(timestamp=" + this.f38834b + ")";
    }
}
