package rf0;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b¢\u0006\u0004\b\f\u0010\rB_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\f\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrf0/f;", "Lrf0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "loggingEnabled", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "", "Ljava/lang/Class;", "Lrf0/c;", "preferredDeviceList", "<init>", "(Landroid/content/Context;ZLandroid/media/AudioManager$OnAudioFocusChangeListener;Ljava/util/List;)V", "Lsf0/b;", "logger", "Landroid/media/AudioManager;", "audioManager", "Lrf0/d;", "audioDeviceManager", "Landroid/os/Handler;", "handler", "Luf0/b;", AnalyticsContext.Scanner, "(Landroid/content/Context;Landroid/media/AudioManager$OnAudioFocusChangeListener;Lsf0/b;Ljava/util/List;Landroid/media/AudioManager;Lrf0/d;Landroid/os/Handler;Luf0/b;)V", "audioDevice", "Ljn0/h0;", "a", "(Lrf0/c;)V", "q", "r", "()V", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public final class f extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, boolean z11, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, List<? extends Class<? extends c>> preferredDeviceList) {
        this(context, audioFocusChangeListener, new sf0.c(z11), preferredDeviceList, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        s.k(context, "context");
        s.k(audioFocusChangeListener, "audioFocusChangeListener");
        s.k(preferredDeviceList, "preferredDeviceList");
    }

    @Override // uf0.b.a
    public void a(c audioDevice) {
        s.k(audioDevice, "audioDevice");
        getLogger().d("AudioSwitch", "onDeviceDisconnected(" + audioDevice + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        boolean zRemove = j().remove(audioDevice);
        if (s.f(getUserSelectedAudioDevice(), audioDevice)) {
            C(null);
        }
        if ((audioDevice instanceof c.WiredHeadset) && getAudioDeviceManager().e()) {
            zRemove = j().add(new c.Earpiece(null, 1, null)) || zRemove;
        }
        a.t(this, zRemove, null, 2, null);
    }

    @Override // rf0.a
    protected void q(c audioDevice) {
        s.k(audioDevice, "audioDevice");
        getLogger().d("AudioSwitch", "onActivate(" + audioDevice + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        if (audioDevice instanceof c.BluetoothHeadset) {
            getAudioDeviceManager().c(false);
            getAudioDeviceManager().b(true);
        } else if ((audioDevice instanceof c.Earpiece) || (audioDevice instanceof c.WiredHeadset)) {
            getAudioDeviceManager().c(false);
            getAudioDeviceManager().b(false);
        } else if (audioDevice instanceof c.Speakerphone) {
            getAudioDeviceManager().b(false);
            getAudioDeviceManager().c(true);
        }
    }

    @Override // rf0.a
    protected void r() {
        getLogger().d("AudioSwitch", "onDeactivate");
        if (getSelectedAudioDevice() instanceof c.BluetoothHeadset) {
            getAudioDeviceManager().b(false);
        }
    }

    public /* synthetic */ f(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, sf0.b bVar, List list, AudioManager audioManager, d dVar, Handler handler, uf0.b bVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        AudioManager audioManager2;
        AudioManager audioManager3;
        d dVar2;
        if ((i11 & 16) != 0) {
            Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            }
            audioManager2 = (AudioManager) systemService;
        } else {
            audioManager2 = audioManager;
        }
        if ((i11 & 32) != 0) {
            audioManager3 = audioManager2;
            dVar2 = new d(context, bVar, audioManager3, null, null, onAudioFocusChangeListener, 24, null);
        } else {
            audioManager3 = audioManager2;
            dVar2 = dVar;
        }
        Handler handler2 = (i11 & 64) != 0 ? new Handler(Looper.getMainLooper()) : handler;
        this(context, onAudioFocusChangeListener, bVar, list, audioManager3, dVar2, handler2, (i11 & 128) != 0 ? new uf0.a(audioManager3, handler2) : bVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, sf0.b logger, List<? extends Class<? extends c>> preferredDeviceList, AudioManager audioManager, d audioDeviceManager, Handler handler, uf0.b scanner) {
        super(context, audioFocusChangeListener, scanner, false, logger, preferredDeviceList, audioDeviceManager, 8, null);
        s.k(context, "context");
        s.k(audioFocusChangeListener, "audioFocusChangeListener");
        s.k(logger, "logger");
        s.k(preferredDeviceList, "preferredDeviceList");
        s.k(audioManager, "audioManager");
        s.k(audioDeviceManager, "audioDeviceManager");
        s.k(handler, "handler");
        s.k(scanner, "scanner");
    }
}
