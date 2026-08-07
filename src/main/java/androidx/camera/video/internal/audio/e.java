package androidx.camera.video.internal.audio;

/* JADX INFO: loaded from: classes.dex */
final class e extends AudioStream.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3634b;

    e(int i11, long j11) {
        this.f3633a = i11;
        this.f3634b = j11;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.b
    public int a() {
        return this.f3633a;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.b
    public long b() {
        return this.f3634b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStream.b) {
            AudioStream.b bVar = (AudioStream.b) obj;
            if (this.f3633a == bVar.a() && this.f3634b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (this.f3633a ^ 1000003) * 1000003;
        long j11 = this.f3634b;
        return i11 ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f3633a + ", timestampNs=" + this.f3634b + "}";
    }
}
