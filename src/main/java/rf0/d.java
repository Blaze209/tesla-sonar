package rf0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u0015R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b%\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\"\u00105\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\"\u00107\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001f\u001a\u0004\b6\u0010(\"\u0004\b2\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lrf0/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsf0/b;", "logger", "Landroid/media/AudioManager;", "audioManager", "Lsf0/a;", "build", "Lrf0/e;", "audioFocusRequest", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "<init>", "(Landroid/content/Context;Lsf0/b;Landroid/media/AudioManager;Lsf0/a;Lrf0/e;Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "", "e", "()Z", "Ljn0/h0;", "j", "()V", "enable", "b", "(Z)V", "c", "mute", "f", "a", "g", "", "I", "savedAudioMode", "Z", "savedIsMicrophoneMuted", "savedSpeakerphoneEnabled", "Landroid/media/AudioFocusRequest;", DateTokenConverter.CONVERTER_KEY, "Landroid/media/AudioFocusRequest;", "audioRequest", "()I", "k", "(I)V", "audioMode", "getFocusMode", "m", "focusMode", "getAudioStreamType", "l", "audioStreamType", "h", "getAudioAttributeUsageType", IntegerTokenConverter.CONVERTER_KEY, "audioAttributeUsageType", "getAudioAttributeContentType", "audioAttributeContentType", "Landroid/content/Context;", "Lsf0/b;", "Landroid/media/AudioManager;", "Lsf0/a;", "n", "Lrf0/e;", "o", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int savedAudioMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean savedIsMicrophoneMuted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean savedSpeakerphoneEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AudioFocusRequest audioRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int audioMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int focusMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int audioStreamType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int audioAttributeUsageType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int audioAttributeContentType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final sf0.b logger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final AudioManager audioManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final sf0.a build;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final e audioFocusRequest;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;

    public d(Context context, sf0.b logger, AudioManager audioManager, sf0.a build, e audioFocusRequest, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener) {
        s.k(context, "context");
        s.k(logger, "logger");
        s.k(audioManager, "audioManager");
        s.k(build, "build");
        s.k(audioFocusRequest, "audioFocusRequest");
        s.k(audioFocusChangeListener, "audioFocusChangeListener");
        this.context = context;
        this.logger = logger;
        this.audioManager = audioManager;
        this.build = build;
        this.audioFocusRequest = audioFocusRequest;
        this.audioFocusChangeListener = audioFocusChangeListener;
        this.audioMode = 3;
        this.focusMode = 2;
        this.audioAttributeUsageType = 2;
        this.audioAttributeContentType = 1;
    }

    public final void a() {
        this.savedAudioMode = this.audioManager.getMode();
        this.savedIsMicrophoneMuted = this.audioManager.isMicrophoneMute();
        this.savedSpeakerphoneEnabled = this.audioManager.isSpeakerphoneOn();
    }

    public final void b(boolean enable) {
        AudioManager audioManager = this.audioManager;
        if (enable) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    public final void c(boolean enable) {
        this.audioManager.setSpeakerphoneOn(enable);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAudioMode() {
        return this.audioMode;
    }

    public final boolean e() {
        boolean zHasSystemFeature = this.context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        if (zHasSystemFeature) {
            this.logger.d("AudioDeviceManager", "Earpiece available");
        }
        return zHasSystemFeature;
    }

    public final void f(boolean mute) {
        this.audioManager.setMicrophoneMute(mute);
    }

    @SuppressLint({"NewApi"})
    public final void g() {
        this.audioManager.setMode(this.savedAudioMode);
        f(this.savedIsMicrophoneMuted);
        c(this.savedSpeakerphoneEnabled);
        if (this.build.a() < 26) {
            this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.audioRequest;
        if (audioFocusRequest != null) {
            this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.audioRequest = null;
    }

    public final void h(int i11) {
        this.audioAttributeContentType = i11;
    }

    public final void i(int i11) {
        this.audioAttributeUsageType = i11;
    }

    @SuppressLint({"NewApi"})
    public final void j() {
        if (this.build.a() >= 26) {
            AudioFocusRequest audioFocusRequestA = this.audioFocusRequest.a(this.audioFocusChangeListener, this.focusMode, this.audioAttributeUsageType, this.audioAttributeContentType);
            this.audioRequest = audioFocusRequestA;
            if (audioFocusRequestA != null) {
                this.audioManager.requestAudioFocus(audioFocusRequestA);
            }
        } else {
            this.audioManager.requestAudioFocus(this.audioFocusChangeListener, this.audioStreamType, this.focusMode);
        }
        this.audioManager.setMode(this.audioMode);
    }

    public final void k(int i11) {
        this.audioMode = i11;
    }

    public final void l(int i11) {
        this.audioStreamType = i11;
    }

    public final void m(int i11) {
        this.focusMode = i11;
    }

    public /* synthetic */ d(Context context, sf0.b bVar, AudioManager audioManager, sf0.a aVar, e eVar, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar, audioManager, (i11 & 8) != 0 ? new sf0.a() : aVar, (i11 & 16) != 0 ? new e() : eVar, onAudioFocusChangeListener);
    }
}
