package wy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.oney.WebRTCModule.r2;
import java.util.concurrent.Callable;
import org.webrtc.AudioProcessingFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xy.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001c¨\u0006\u001e"}, d2 = {"Lwy/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxy/i;", "audioType", "Ljn0/h0;", "e", "(Landroid/content/Context;Lxy/i;)V", "h", "(Landroid/content/Context;)V", DateTokenConverter.CONVERTER_KEY, "b", "Lxy/i;", "Lorg/webrtc/audio/JavaAudioDeviceModule;", "c", "Lorg/webrtc/audio/JavaAudioDeviceModule;", "adm", "Lyy/i;", "Lyy/i;", "_audioProcessingController", "Lyy/c;", "Lyy/c;", "_audioRecordSamplesDispatcher", "()Lorg/webrtc/audio/JavaAudioDeviceModule;", "audioDeviceModule", "()Lyy/c;", "audioRecordSamplesDispatcher", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f122420a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static i audioType = new i.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SuppressLint({"StaticFieldLeak"})
    private static JavaAudioDeviceModule adm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static yy.i _audioProcessingController;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static yy.c _audioRecordSamplesDispatcher;

    private b() {
    }

    public static final void e(Context context, i audioType2) {
        s.k(context, "context");
        s.k(audioType2, "audioType");
        _audioRecordSamplesDispatcher = new yy.c();
        audioType = audioType2;
        r2 r2VarA = r2.a();
        r2VarA.f46071a = new az.b(null, true, true, false, null, 24, null);
        r2VarA.f46072b = new az.a(false, null, 3, null);
        r2VarA.f46078h = true;
        f122420a.h(context);
        r2VarA.f46073c = adm;
        r2VarA.f46074d = new Callable() { // from class: wy.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.g();
            }
        };
    }

    public static /* synthetic */ void f(Context context, i iVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = new i.a();
        }
        e(context, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AudioProcessingFactory g() {
        yy.i iVar = new yy.i(null, null, false, false, 15, null);
        _audioProcessingController = iVar;
        return iVar.getExternalAudioProcessor();
    }

    private final void h(Context context) {
        boolean z11 = Build.VERSION.SDK_INT >= 29;
        adm = JavaAudioDeviceModule.builder(context).setUseHardwareAcousticEchoCanceler(z11).setUseHardwareNoiseSuppressor(z11).setAudioAttributes(audioType.getAudioAttributes()).setSamplesReadyCallback(c()).createAudioDeviceModule();
    }

    public final JavaAudioDeviceModule b() {
        JavaAudioDeviceModule javaAudioDeviceModule = adm;
        if (javaAudioDeviceModule != null) {
            return javaAudioDeviceModule;
        }
        throw new IllegalStateException("Audio device module is not initialized! Did you remember to call LiveKitReactNative.setup in your Application.onCreate?");
    }

    public final yy.c c() {
        yy.c cVar = _audioRecordSamplesDispatcher;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("audioRecordSamplesDispatcher is not initialized! Did you remember to call LiveKitReactNative.setup in your Application.onCreate?");
    }

    public final void d(Context context) {
        s.k(context, "context");
        r2 r2VarA = r2.a();
        if (s.f(r2VarA.f46073c, adm)) {
            r2VarA.f46073c = null;
        }
        JavaAudioDeviceModule javaAudioDeviceModule = adm;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.release();
        }
        adm = null;
        _audioProcessingController = null;
        h(context);
        r2VarA.f46073c = adm;
    }
}
