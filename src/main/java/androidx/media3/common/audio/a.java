package androidx.media3.common.audio;

import com.google.common.collect.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<AudioProcessor> f9031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<AudioProcessor> f9032b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f9033c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f9034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f9035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9036f;

    public a(x<AudioProcessor> xVar) {
        this.f9031a = xVar;
        AudioProcessor.a aVar = AudioProcessor.a.f9026e;
        this.f9034d = aVar;
        this.f9035e = aVar;
        this.f9036f = false;
    }

    private int c() {
        return this.f9033c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z11;
        for (boolean z12 = true; z12; z12 = z11) {
            z11 = false;
            for (int i11 = 0; i11 <= c(); i11++) {
                if (!this.f9033c[i11].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f9032b.get(i11);
                    if (!audioProcessor.a()) {
                        ByteBuffer byteBuffer2 = i11 > 0 ? this.f9033c[i11 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f9024a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.b(byteBuffer2);
                        this.f9033c[i11] = audioProcessor.d();
                        z11 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f9033c[i11].hasRemaining();
                    } else if (!this.f9033c[i11].hasRemaining() && i11 < c()) {
                        this.f9032b.get(i11 + 1).c();
                    }
                }
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f9026e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i11 = 0; i11 < this.f9031a.size(); i11++) {
            AudioProcessor audioProcessor = this.f9031a.get(i11);
            AudioProcessor.a aVarE = audioProcessor.e(aVar);
            if (audioProcessor.isActive()) {
                s7.a.h(!aVarE.equals(AudioProcessor.a.f9026e));
                aVar = aVarE;
            }
        }
        this.f9035e = aVar;
        return aVar;
    }

    public void b() {
        this.f9032b.clear();
        this.f9034d = this.f9035e;
        this.f9036f = false;
        for (int i11 = 0; i11 < this.f9031a.size(); i11++) {
            AudioProcessor audioProcessor = this.f9031a.get(i11);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.f9032b.add(audioProcessor);
            }
        }
        this.f9033c = new ByteBuffer[this.f9032b.size()];
        for (int i12 = 0; i12 <= c(); i12++) {
            this.f9033c[i12] = this.f9032b.get(i12).d();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f9024a;
        }
        ByteBuffer byteBuffer = this.f9033c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(AudioProcessor.f9024a);
        return this.f9033c[c()];
    }

    public boolean e() {
        return this.f9036f && this.f9032b.get(c()).a() && !this.f9033c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9031a.size() != aVar.f9031a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f9031a.size(); i11++) {
            if (this.f9031a.get(i11) != aVar.f9031a.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f9032b.isEmpty();
    }

    public void h() {
        if (!f() || this.f9036f) {
            return;
        }
        this.f9036f = true;
        this.f9032b.get(0).c();
    }

    public int hashCode() {
        return this.f9031a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f9036f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i11 = 0; i11 < this.f9031a.size(); i11++) {
            AudioProcessor audioProcessor = this.f9031a.get(i11);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f9033c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f9026e;
        this.f9034d = aVar;
        this.f9035e = aVar;
        this.f9036f = false;
    }
}
