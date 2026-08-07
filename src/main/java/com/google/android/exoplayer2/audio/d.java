package com.google.android.exoplayer2.audio;

import com.google.common.collect.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<AudioProcessor> f39540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<AudioProcessor> f39541b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f39542c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f39543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f39544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39545f;

    public d(x<AudioProcessor> xVar) {
        this.f39540a = xVar;
        AudioProcessor.a aVar = AudioProcessor.a.f39416e;
        this.f39543d = aVar;
        this.f39544e = aVar;
        this.f39545f = false;
    }

    private int c() {
        return this.f39542c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z11;
        for (boolean z12 = true; z12; z12 = z11) {
            z11 = false;
            for (int i11 = 0; i11 <= c(); i11++) {
                if (!this.f39542c[i11].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f39541b.get(i11);
                    if (!audioProcessor.a()) {
                        ByteBuffer byteBuffer2 = i11 > 0 ? this.f39542c[i11 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f39415a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.b(byteBuffer2);
                        this.f39542c[i11] = audioProcessor.d();
                        z11 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f39542c[i11].hasRemaining();
                    } else if (!this.f39542c[i11].hasRemaining() && i11 < c()) {
                        this.f39541b.get(i11 + 1).c();
                    }
                }
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f39416e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i11 = 0; i11 < this.f39540a.size(); i11++) {
            AudioProcessor audioProcessor = this.f39540a.get(i11);
            AudioProcessor.a aVarE = audioProcessor.e(aVar);
            if (audioProcessor.isActive()) {
                ts.a.g(!aVarE.equals(AudioProcessor.a.f39416e));
                aVar = aVarE;
            }
        }
        this.f39544e = aVar;
        return aVar;
    }

    public void b() {
        this.f39541b.clear();
        this.f39543d = this.f39544e;
        this.f39545f = false;
        for (int i11 = 0; i11 < this.f39540a.size(); i11++) {
            AudioProcessor audioProcessor = this.f39540a.get(i11);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.f39541b.add(audioProcessor);
            }
        }
        this.f39542c = new ByteBuffer[this.f39541b.size()];
        for (int i12 = 0; i12 <= c(); i12++) {
            this.f39542c[i12] = this.f39541b.get(i12).d();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f39415a;
        }
        ByteBuffer byteBuffer = this.f39542c[c()];
        if (!byteBuffer.hasRemaining()) {
            g(AudioProcessor.f39415a);
        }
        return byteBuffer;
    }

    public boolean e() {
        return this.f39545f && this.f39541b.get(c()).a() && !this.f39542c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f39540a.size() != dVar.f39540a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f39540a.size(); i11++) {
            if (this.f39540a.get(i11) != dVar.f39540a.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f39541b.isEmpty();
    }

    public void h() {
        if (!f() || this.f39545f) {
            return;
        }
        this.f39545f = true;
        this.f39541b.get(0).c();
    }

    public int hashCode() {
        return this.f39540a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f39545f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i11 = 0; i11 < this.f39540a.size(); i11++) {
            AudioProcessor audioProcessor = this.f39540a.get(i11);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f39542c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f39416e;
        this.f39543d = aVar;
        this.f39544e = aVar;
        this.f39545f = false;
    }
}
