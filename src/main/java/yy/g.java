package yy;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.nio.ByteBuffer;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.webrtc.AudioTrackSink;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0011J?\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b$\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-¨\u0006/"}, d2 = {"Lyy/g;", "Lorg/webrtc/AudioTrackSink;", "", "minFrequency", "maxFrequency", "", "barCount", "Lio0/b;", "interval", "<init>", "(FFIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "magnitudes", "Ljn0/h0;", "f", "([F)V", "h", "()V", IntegerTokenConverter.CONVERTER_KEY, "g", "Ljava/nio/ByteBuffer;", "audioData", "bitsPerSample", "sampleRate", "numberOfChannels", "numberOfFrames", "", "absoluteCaptureTimestampMs", "onData", "(Ljava/nio/ByteBuffer;IIIIJ)V", "a", Gender.FEMALE, "e", "()F", "b", DateTokenConverter.CONVERTER_KEY, "c", "I", "()I", "J", "()J", "Lzy/a;", "Lzy/a;", "audioProcessor", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g implements AudioTrackSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float minFrequency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float maxFrequency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int barCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long interval;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zy.a audioProcessor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.livekit.reactnative.audio.processing.BaseMultibandVolumeProcessor$start$1", f = "MultibandVolumeProcessor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f126003n;

        /* JADX INFO: renamed from: yy.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C2738a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f126005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ float[] f126006b;

            C2738a(g gVar, float[] fArr) {
                this.f126005a = gVar;
                this.f126006b = fArr;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(float[] fArr, Continuation<? super h0> continuation) {
                int length;
                int iO;
                AudioFormat audioFormatD = this.f126005a.audioProcessor.d();
                if (audioFormatD != null) {
                    iO = n.o(yn0.a.d((this.f126005a.getMinFrequency() * fArr.length) / (audioFormatD.getSampleRate() / 2)), p013kotlin.collections.n.n0(fArr));
                    length = n.o(yn0.a.d((this.f126005a.getMaxFrequency() * fArr.length) / (audioFormatD.getSampleRate() / 2)), p013kotlin.collections.n.n0(fArr));
                } else {
                    length = fArr.length;
                    iO = 0;
                }
                this.f126005a.f(k.b(p013kotlin.collections.n.h1(fArr, n.w(iO, length)), this.f126006b, this.f126005a.getBarCount()));
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return g.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f126003n;
            if (i11 == 0) {
                t.b(obj);
                float[] fArr = new float[g.this.getBarCount()];
                Flow flowC = k.c(g.this.audioProcessor.f(), g.this.getInterval());
                C2738a c2738a = new C2738a(g.this, fArr);
                this.f126003n = 1;
                if (flowC.collect(c2738a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ g(float f11, float f12, int i11, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, j11);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBarCount() {
        return this.barCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMaxFrequency() {
        return this.maxFrequency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getMinFrequency() {
        return this.minFrequency;
    }

    public abstract void f(float[] magnitudes);

    public final void g() {
        i();
        this.audioProcessor.k();
    }

    public final void h() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
        this.coroutineScope = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
    }

    public final void i() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.coroutineScope = null;
    }

    @Override // org.webrtc.AudioTrackSink
    public void onData(ByteBuffer audioData, int bitsPerSample, int sampleRate, int numberOfChannels, int numberOfFrames, long absoluteCaptureTimestampMs) {
        s.k(audioData, "audioData");
        AudioFormat audioFormatD = this.audioProcessor.d();
        if (audioFormatD == null || audioFormatD.getBitsPerSample() != bitsPerSample || audioFormatD.getSampleRate() != sampleRate || audioFormatD.getNumberOfChannels() != numberOfChannels) {
            this.audioProcessor.a(new AudioFormat(bitsPerSample, sampleRate, numberOfChannels));
        }
        this.audioProcessor.j(audioData);
    }

    private g(float f11, float f12, int i11, long j11) {
        this.minFrequency = f11;
        this.maxFrequency = f12;
        this.barCount = i11;
        this.interval = j11;
        this.audioProcessor = new zy.a();
    }
}
