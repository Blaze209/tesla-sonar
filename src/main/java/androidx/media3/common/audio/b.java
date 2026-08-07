package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f9037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f9038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f9039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f9040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f9041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f9042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9043h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f9024a;
        this.f9041f = byteBuffer;
        this.f9042g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f9026e;
        this.f9039d = aVar;
        this.f9040e = aVar;
        this.f9037b = aVar;
        this.f9038c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean a() {
        return this.f9043h && this.f9042g == AudioProcessor.f9024a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void c() {
        this.f9043h = true;
        i();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f9042g;
        this.f9042g = AudioProcessor.f9024a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.f9039d = aVar;
        this.f9040e = g(aVar);
        return isActive() ? this.f9040e : AudioProcessor.a.f9026e;
    }

    protected final boolean f() {
        return this.f9042g.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f9042g = AudioProcessor.f9024a;
        this.f9043h = false;
        this.f9037b = this.f9039d;
        this.f9038c = this.f9040e;
        h();
    }

    protected abstract AudioProcessor.a g(AudioProcessor.a aVar);

    protected void h() {
    }

    protected void i() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f9040e != AudioProcessor.a.f9026e;
    }

    protected void j() {
    }

    protected final ByteBuffer k(int i11) {
        if (this.f9041f.capacity() < i11) {
            this.f9041f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f9041f.clear();
        }
        ByteBuffer byteBuffer = this.f9041f;
        this.f9042g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        ByteBuffer byteBuffer = AudioProcessor.f9024a;
        this.f9042g = byteBuffer;
        this.f9043h = false;
        this.f9041f = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f9026e;
        this.f9039d = aVar;
        this.f9040e = aVar;
        this.f9037b = aVar;
        this.f9038c = aVar;
        j();
    }
}
