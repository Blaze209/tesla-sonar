package uf0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import rf0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00172\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"Luf0/a;", "Landroid/media/AudioDeviceCallback;", "Luf0/b;", "Landroid/media/AudioManager;", "audioManager", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/media/AudioManager;Landroid/os/Handler;)V", "Lrf0/c;", "audioDevice", "", "b", "(Lrf0/c;)Z", "Luf0/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "(Luf0/b$a;)Z", "stop", "()Z", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Ljn0/h0;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", DateTokenConverter.CONVERTER_KEY, "(Landroid/media/AudioDeviceInfo;Lrf0/c;)Z", "Luf0/b$a;", "getListener$audioswitch_release", "()Luf0/b$a;", "setListener$audioswitch_release", "(Luf0/b$a;)V", "getListener$audioswitch_release$annotations", "()V", "Landroid/media/AudioManager;", "c", "Landroid/os/Handler;", "(Landroid/media/AudioDeviceInfo;)Lrf0/c;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public final class a extends AudioDeviceCallback implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b.a listener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AudioManager audioManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    public a(AudioManager audioManager, Handler handler) {
        s.k(audioManager, "audioManager");
        s.k(handler, "handler");
        this.audioManager = audioManager;
        this.handler = handler;
    }

    @Override // uf0.b
    public boolean a(b.a listener) {
        s.k(listener, "listener");
        this.listener = listener;
        this.audioManager.registerAudioDeviceCallback(this, this.handler);
        return true;
    }

    @Override // uf0.b
    public boolean b(c audioDevice) {
        s.k(audioDevice, "audioDevice");
        AudioDeviceInfo[] devices = this.audioManager.getDevices(2);
        s.j(devices, "this.audioManager\n      …ager.GET_DEVICES_OUTPUTS)");
        for (AudioDeviceInfo it : devices) {
            s.j(it, "it");
            if (d(it, audioDevice)) {
                return true;
            }
        }
        return false;
    }

    public final c c(AudioDeviceInfo audioDevice) {
        s.k(audioDevice, "$this$audioDevice");
        if (audioDevice.getType() == 7 || audioDevice.getType() == 8) {
            return new c.BluetoothHeadset(audioDevice.getProductName().toString());
        }
        if (Build.VERSION.SDK_INT >= 31 && (audioDevice.getType() == 26 || audioDevice.getType() == 27)) {
            return new c.BluetoothHeadset(audioDevice.getProductName().toString());
        }
        if (audioDevice.getType() == 3 || audioDevice.getType() == 4 || audioDevice.getType() == 22) {
            return new c.WiredHeadset(null, 1, null);
        }
        if (audioDevice.getType() == 1) {
            return new c.Earpiece(null, 1, null);
        }
        if (audioDevice.getType() == 2) {
            return new c.Speakerphone(null, 1, null);
        }
        return null;
    }

    public final boolean d(AudioDeviceInfo isAudioDevice, c audioDevice) {
        s.k(isAudioDevice, "$this$isAudioDevice");
        s.k(audioDevice, "audioDevice");
        if (audioDevice instanceof c.BluetoothHeadset) {
            if (isAudioDevice.getType() == 7 || isAudioDevice.getType() == 8) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 31 && (isAudioDevice.getType() == 26 || isAudioDevice.getType() == 27);
        }
        if (audioDevice instanceof c.Earpiece) {
            return isAudioDevice.getType() == 1;
        }
        if (audioDevice instanceof c.Speakerphone) {
            return isAudioDevice.getType() == 2;
        }
        if (!(audioDevice instanceof c.WiredHeadset)) {
            throw new NoWhenBranchMatchedException();
        }
        if (isAudioDevice.getType() == 3 || isAudioDevice.getType() == 4) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 26 && isAudioDevice.getType() == 22;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        super.onAudioDevicesAdded(addedDevices);
        if (addedDevices != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : addedDevices) {
                c cVarC = c(audioDeviceInfo);
                if (cVarC != null) {
                    arrayList.add(cVarC);
                }
            }
            Set<c> setR1 = v.r1(arrayList);
            if (setR1 != null) {
                for (c cVar : setR1) {
                    b.a aVar = this.listener;
                    if (aVar != null) {
                        aVar.b(cVar);
                    }
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        super.onAudioDevicesRemoved(removedDevices);
        if (removedDevices != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
                c cVarC = c(audioDeviceInfo);
                if (cVarC != null) {
                    arrayList.add(cVarC);
                }
            }
            Set<c> setR1 = v.r1(arrayList);
            if (setR1 != null) {
                for (c cVar : setR1) {
                    b.a aVar = this.listener;
                    if (aVar != null) {
                        aVar.a(cVar);
                    }
                }
            }
        }
    }

    @Override // uf0.b
    public boolean stop() {
        this.audioManager.unregisterAudioDeviceCallback(this);
        this.listener = null;
        return true;
    }
}
