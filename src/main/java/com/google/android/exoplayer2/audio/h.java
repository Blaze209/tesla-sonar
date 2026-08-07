package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class h implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f39585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f39586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f39587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f39588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f39589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f39590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39591h;

    public h() {
        ByteBuffer byteBuffer = AudioProcessor.f39415a;
        this.f39589f = byteBuffer;
        this.f39590g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f39416e;
        this.f39587d = aVar;
        this.f39588e = aVar;
        this.f39585b = aVar;
        this.f39586c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f39591h && this.f39590g == AudioProcessor.f39415a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void c() {
        this.f39591h = true;
        i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f39590g;
        this.f39590g = AudioProcessor.f39415a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.f39587d = aVar;
        this.f39588e = g(aVar);
        return isActive() ? this.f39588e : AudioProcessor.a.f39416e;
    }

    protected final boolean f() {
        return this.f39590g.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f39590g = AudioProcessor.f39415a;
        this.f39591h = false;
        this.f39585b = this.f39587d;
        this.f39586c = this.f39588e;
        h();
    }

    protected abstract AudioProcessor.a g(AudioProcessor.a aVar);

    protected void h() {
    }

    protected void i() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f39588e != AudioProcessor.a.f39416e;
    }

    protected void j() {
    }

    protected final ByteBuffer k(int i11) {
        if (this.f39589f.capacity() < i11) {
            this.f39589f = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f39589f.clear();
        }
        ByteBuffer byteBuffer = this.f39589f;
        this.f39590g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f39589f = AudioProcessor.f39415a;
        AudioProcessor.a aVar = AudioProcessor.a.f39416e;
        this.f39587d = aVar;
        this.f39588e = aVar;
        this.f39585b = aVar;
        this.f39586c = aVar;
        j();
    }
}
