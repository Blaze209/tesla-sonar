package zy;

import android.media.AudioTrack;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yy.AudioFormat;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020,008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020,038\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b'\u00105R\u0011\u00109\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b-\u00108R\u0013\u0010;\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010:¨\u0006<"}, d2 = {"Lzy/a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "buffer", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/nio/ByteBuffer;)V", "", "sampleRate", "", "durationUs", "b", "(IJ)J", "channelCount", "g", "(I)I", "c", "Lyy/a;", "audioFormat", "e", "(Lyy/a;)I", "inputAudioFormat", "a", "(Lyy/a;)V", "k", "inputBuffer", "j", "Ld00/a;", "Ld00/a;", "noise", "Lyy/a;", "I", "audioTrackBufferSize", DateTokenConverter.CONVERTER_KEY, "Ljava/nio/ByteBuffer;", "fftBuffer", "srcBuffer", "f", "srcBufferPosition", "", "[S", "tempShortArray", "", "h", "[F", "src", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableFftFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "fftFlow", "", "()Z", "isActive", "()Lyy/a;", "configuredInputFormat", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ByteBuffer f129187l = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d00.a noise;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AudioFormat inputAudioFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int audioTrackBufferSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer fftBuffer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ByteBuffer srcBuffer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int srcBufferPosition;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final short[] tempShortArray;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] src;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<float[]> mutableFftFlow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Flow<float[]> fftFlow;

    public a() {
        ByteBuffer EMPTY_BUFFER = f129187l;
        s.j(EMPTY_BUFFER, "EMPTY_BUFFER");
        this.fftBuffer = EMPTY_BUFFER;
        this.tempShortArray = new short[1024];
        this.src = new float[1024];
        MutableSharedFlow<float[]> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.mutableFftFlow = mutableSharedFlowMutableSharedFlow$default;
        this.fftFlow = mutableSharedFlowMutableSharedFlow$default;
    }

    private final long b(int sampleRate, long durationUs) {
        return (durationUs * ((long) sampleRate)) / TimeUnit.MICROSECONDS.convert(1L, TimeUnit.SECONDS);
    }

    private final int c(int channelCount) {
        if (channelCount != 1) {
            return channelCount != 2 ? 0 : 12;
        }
        return 4;
    }

    private final int e(AudioFormat audioFormat) {
        int iG = g(audioFormat.getNumberOfChannels());
        int minBufferSize = AudioTrack.getMinBufferSize(audioFormat.getSampleRate(), c(audioFormat.getNumberOfChannels()), 2);
        if (minBufferSize != -2) {
            return (n.n(minBufferSize * 4, ((int) b(audioFormat.getSampleRate(), 30000L)) * iG, (int) Math.max(minBufferSize, b(audioFormat.getSampleRate(), 500000L) * ((long) iG))) / iG) * iG;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final int g(int channelCount) {
        return channelCount * 2;
    }

    private final void i(ByteBuffer buffer) {
        if (this.noise == null) {
            return;
        }
        ByteBuffer byteBuffer = this.srcBuffer;
        if (byteBuffer == null) {
            s.B("srcBuffer");
            byteBuffer = null;
        }
        byteBuffer.put(buffer.array());
        this.srcBufferPosition += buffer.array().length;
        while (this.srcBufferPosition > 2048) {
            ByteBuffer byteBuffer2 = this.srcBuffer;
            if (byteBuffer2 == null) {
                s.B("srcBuffer");
                byteBuffer2 = null;
            }
            int i11 = 0;
            byteBuffer2.position(0);
            ByteBuffer byteBuffer3 = this.srcBuffer;
            if (byteBuffer3 == null) {
                s.B("srcBuffer");
                byteBuffer3 = null;
            }
            byteBuffer3.asShortBuffer().get(this.tempShortArray, 0, 1024);
            short[] sArr = this.tempShortArray;
            int length = sArr.length;
            int i12 = 0;
            while (i11 < length) {
                this.src[i12] = sArr[i11] / 32767;
                i11++;
                i12++;
            }
            ByteBuffer byteBuffer4 = this.srcBuffer;
            if (byteBuffer4 == null) {
                s.B("srcBuffer");
                byteBuffer4 = null;
            }
            byteBuffer4.position(2048);
            ByteBuffer byteBuffer5 = this.srcBuffer;
            if (byteBuffer5 == null) {
                s.B("srcBuffer");
                byteBuffer5 = null;
            }
            byteBuffer5.compact();
            this.srcBufferPosition -= 2048;
            ByteBuffer byteBuffer6 = this.srcBuffer;
            if (byteBuffer6 == null) {
                s.B("srcBuffer");
                byteBuffer6 = null;
            }
            byteBuffer6.position(this.srcBufferPosition);
            float[] fArr = new float[1026];
            d00.a aVar = this.noise;
            float[] fArrC = aVar != null ? aVar.c(this.src, fArr) : null;
            s.h(fArrC);
            this.mutableFftFlow.tryEmit(fArrC);
        }
    }

    public final void a(AudioFormat inputAudioFormat) {
        s.k(inputAudioFormat, "inputAudioFormat");
        this.inputAudioFormat = inputAudioFormat;
        this.noise = d00.a.INSTANCE.a(1024);
        int iE = e(inputAudioFormat);
        this.audioTrackBufferSize = iE;
        this.srcBuffer = ByteBuffer.allocate(iE + PKIFailureInfo.certRevoked);
    }

    public final AudioFormat d() {
        AudioFormat audioFormat = this.inputAudioFormat;
        if (audioFormat == null) {
            return null;
        }
        if (audioFormat != null) {
            return audioFormat;
        }
        s.B("inputAudioFormat");
        return null;
    }

    public final Flow<float[]> f() {
        return this.fftFlow;
    }

    public final boolean h() {
        return this.noise != null;
    }

    public final void j(ByteBuffer inputBuffer) {
        s.k(inputBuffer, "inputBuffer");
        if (h()) {
            int iPosition = inputBuffer.position();
            int iLimit = inputBuffer.limit();
            int i11 = iLimit - iPosition;
            AudioFormat audioFormat = this.inputAudioFormat;
            if (audioFormat == null) {
                s.B("inputAudioFormat");
                audioFormat = null;
            }
            int numberOfChannels = (i11 / (audioFormat.getNumberOfChannels() * 2)) * 2;
            if (this.fftBuffer.capacity() < numberOfChannels) {
                this.fftBuffer = ByteBuffer.allocateDirect(numberOfChannels).order(ByteOrder.nativeOrder());
            } else {
                this.fftBuffer.clear();
            }
            while (iPosition < iLimit) {
                AudioFormat audioFormat2 = this.inputAudioFormat;
                if (audioFormat2 == null) {
                    s.B("inputAudioFormat");
                    audioFormat2 = null;
                }
                int numberOfChannels2 = audioFormat2.getNumberOfChannels();
                int i12 = 0;
                for (int i13 = 0; i13 < numberOfChannels2; i13++) {
                    i12 += inputBuffer.getShort((i13 * 2) + iPosition);
                }
                ByteBuffer byteBuffer = this.fftBuffer;
                AudioFormat audioFormat3 = this.inputAudioFormat;
                if (audioFormat3 == null) {
                    s.B("inputAudioFormat");
                    audioFormat3 = null;
                }
                byteBuffer.putShort((short) (i12 / audioFormat3.getNumberOfChannels()));
                AudioFormat audioFormat4 = this.inputAudioFormat;
                if (audioFormat4 == null) {
                    s.B("inputAudioFormat");
                    audioFormat4 = null;
                }
                iPosition += audioFormat4.getNumberOfChannels() * 2;
            }
            inputBuffer.position(iPosition);
            i(this.fftBuffer);
        }
    }

    public final void k() {
        d00.a aVar = this.noise;
        if (aVar != null) {
            aVar.close();
        }
        this.noise = null;
    }
}
