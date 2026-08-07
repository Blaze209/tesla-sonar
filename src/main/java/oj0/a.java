package oj0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.zxcpoiu.incallmanager.InCallManagerModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InCallManagerModule f97840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f97841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f97842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f97843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f97844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BluetoothProfile.ServiceListener f97845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BluetoothAdapter f97846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BluetoothHeadset f97847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BluetoothDevice f97848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AudioDeviceInfo f97849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AudioDeviceCallback f97850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final BroadcastReceiver f97851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f97852n = new RunnableC2104a();

    /* JADX INFO: renamed from: oj0.a$a, reason: collision with other inner class name */
    class RunnableC2104a implements Runnable {
        RunnableC2104a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    private class b extends AudioDeviceCallback {
        private void a() {
            AudioDeviceInfo audioDeviceInfoQ = a.this.q();
            if (a.this.f97849k != null && audioDeviceInfoQ == null) {
                a.this.f97844f = e.HEADSET_UNAVAILABLE;
            } else if ((a.this.f97849k != null || audioDeviceInfoQ == null) && (a.this.f97849k == null || a.this.f97849k.getId() == audioDeviceInfoQ.getId())) {
                return;
            }
            a.this.D();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            a();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            a();
        }

        private b() {
        }
    }

    private class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (a.this.f97844f == e.UNINITIALIZED) {
                return;
            }
            String action = intent.getAction();
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                Log.d("AppRTCBluetoothManager", "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_CONNECTION_STATE_CHANGED, s=" + a.this.z(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + a.this.f97844f);
                if (intExtra == 2) {
                    a aVar = a.this;
                    aVar.f97843e = 0;
                    aVar.D();
                } else if (intExtra != 1 && intExtra != 3 && intExtra == 0) {
                    a.this.B();
                    a.this.D();
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                Log.d("AppRTCBluetoothManager", "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_AUDIO_STATE_CHANGED, s=" + a.this.z(intExtra2) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + a.this.f97844f);
                if (intExtra2 == 12) {
                    a.this.l();
                    if (a.this.f97844f == e.SCO_CONNECTING) {
                        Log.d("AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now connected");
                        a.this.f97844f = e.SCO_CONNECTED;
                        a aVar2 = a.this;
                        aVar2.f97843e = 0;
                        aVar2.D();
                    } else {
                        Log.w("AppRTCBluetoothManager", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
                    }
                } else if (intExtra2 == 11) {
                    Log.d("AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now connecting...");
                } else if (intExtra2 == 10) {
                    Log.d("AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now disconnected");
                    if (isInitialStickyBroadcast()) {
                        Log.d("AppRTCBluetoothManager", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                        return;
                    }
                    a.this.D();
                }
            }
            Log.d("AppRTCBluetoothManager", "onReceive done: BT state=" + a.this.f97844f);
        }

        private c() {
        }
    }

    private class d implements BluetoothProfile.ServiceListener {
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i11, BluetoothProfile bluetoothProfile) {
            if (i11 != 1 || a.this.f97844f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRTCBluetoothManager", "BluetoothServiceListener.onServiceConnected: BT state=" + a.this.f97844f);
            a.this.f97847i = (BluetoothHeadset) bluetoothProfile;
            a.this.D();
            Log.d("AppRTCBluetoothManager", "onServiceConnected done: BT state=" + a.this.f97844f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i11) {
            if (i11 != 1 || a.this.f97844f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRTCBluetoothManager", "BluetoothServiceListener.onServiceDisconnected: BT state=" + a.this.f97844f);
            a.this.B();
            a.this.f97847i = null;
            a.this.f97848j = null;
            a.this.f97844f = e.HEADSET_UNAVAILABLE;
            a.this.D();
            Log.d("AppRTCBluetoothManager", "onServiceDisconnected done: BT state=" + a.this.f97844f);
        }

        private d() {
        }
    }

    public enum e {
        UNINITIALIZED,
        ERROR,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    protected a(Context context, InCallManagerModule inCallManagerModule) {
        Log.d("AppRTCBluetoothManager", "ctor");
        oj0.e.a();
        this.f97839a = context;
        this.f97840b = inCallManagerModule;
        this.f97841c = n(context);
        this.f97844f = e.UNINITIALIZED;
        this.f97845g = new d();
        this.f97851m = new c();
        if (Build.VERSION.SDK_INT >= 31) {
            this.f97850l = new b();
        }
        this.f97842d = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "updateAudioDeviceState");
        this.f97840b.updateAudioDeviceState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void k() {
        oj0.e.a();
        if (this.f97844f == e.UNINITIALIZED || this.f97847i == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            Log.w("AppRTCBluetoothManager", "Invalid state, the timeout should not be running on the version: " + i11);
        } else {
            Log.d("AppRTCBluetoothManager", "bluetoothTimeout: BT state=" + this.f97844f + ", attempts: " + this.f97843e + ", SCO is on: " + t());
            if (this.f97844f != e.SCO_CONNECTING) {
                return;
            }
            List<BluetoothDevice> listP = p();
            if (listP.size() > 0) {
                BluetoothDevice bluetoothDevice = listP.get(0);
                this.f97848j = bluetoothDevice;
                if (this.f97847i.isAudioConnected(bluetoothDevice)) {
                    Log.d("AppRTCBluetoothManager", "SCO connected with " + this.f97848j.getName());
                    this.f97844f = e.SCO_CONNECTED;
                    this.f97843e = 0;
                } else {
                    Log.d("AppRTCBluetoothManager", "SCO is not connected with " + this.f97848j.getName());
                    Log.w("AppRTCBluetoothManager", "BT failed to connect after timeout");
                    B();
                }
            } else {
                Log.w("AppRTCBluetoothManager", "BT failed to connect after timeout");
                B();
            }
        }
        D();
        Log.d("AppRTCBluetoothManager", "bluetoothTimeout done: BT state=" + this.f97844f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "cancelTimer");
        this.f97842d.removeCallbacks(this.f97852n);
    }

    public static a m(Context context, InCallManagerModule inCallManagerModule) {
        Log.d("AppRTCBluetoothManager", "create" + oj0.d.b());
        return new a(context, inCallManagerModule);
    }

    private List<BluetoothDevice> p() {
        List<BluetoothDevice> connectedDevices = this.f97847i.getConnectedDevices();
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : connectedDevices) {
            if (bluetoothDevice.getBluetoothClass().getMajorDeviceClass() == 1024) {
                arrayList.add(bluetoothDevice);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioDeviceInfo q() {
        AudioManager audioManager = this.f97841c;
        if (audioManager == null) {
            return null;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getAvailableCommunicationDevices()) {
            if (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 7) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    private boolean t() {
        if (Build.VERSION.SDK_INT < 31) {
            return this.f97841c.isBluetoothScoOn();
        }
        AudioDeviceInfo communicationDevice = this.f97841c.getCommunicationDevice();
        return (communicationDevice == null || this.f97849k == null || communicationDevice.getId() != this.f97849k.getId()) ? false : true;
    }

    private void y() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "startTimer");
        this.f97842d.postDelayed(this.f97852n, 6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String z(int i11) {
        if (i11 == 0) {
            return "DISCONNECTED";
        }
        if (i11 == 1) {
            return "CONNECTING";
        }
        if (i11 == 2) {
            return "CONNECTED";
        }
        if (i11 == 3) {
            return "DISCONNECTING";
        }
        switch (i11) {
            case 10:
                return "OFF";
            case 11:
                return "TURNING_ON";
            case 12:
                return "ON";
            case 13:
                return "TURNING_OFF";
            default:
                return "INVALID";
        }
    }

    public void A() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "stop: BT state=" + this.f97844f);
        if (this.f97846h == null) {
            return;
        }
        B();
        e eVar = this.f97844f;
        e eVar2 = e.UNINITIALIZED;
        if (eVar == eVar2) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.f97841c.unregisterAudioDeviceCallback(this.f97850l);
        } else {
            C(this.f97851m);
            l();
        }
        BluetoothHeadset bluetoothHeadset = this.f97847i;
        if (bluetoothHeadset != null) {
            this.f97846h.closeProfileProxy(1, bluetoothHeadset);
            this.f97847i = null;
        }
        this.f97846h = null;
        this.f97848j = null;
        this.f97844f = eVar2;
        Log.d("AppRTCBluetoothManager", "stop done: BT state=" + this.f97844f);
    }

    public void B() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "stopScoAudio: BT state=" + this.f97844f + ", SCO is on: " + t());
        e eVar = this.f97844f;
        if (eVar == e.SCO_CONNECTING || eVar == e.SCO_CONNECTED) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f97841c.clearCommunicationDevice();
            } else {
                l();
                this.f97841c.stopBluetoothSco();
                this.f97841c.setBluetoothScoOn(false);
            }
            this.f97844f = e.SCO_DISCONNECTING;
            Log.d("AppRTCBluetoothManager", "stopScoAudio done: BT state=" + this.f97844f + ", SCO is on: " + t());
        }
    }

    protected void C(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                this.f97839a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void E() {
        if (this.f97844f == e.UNINITIALIZED || this.f97847i == null) {
            return;
        }
        Log.d("AppRTCBluetoothManager", "updateDevice");
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo audioDeviceInfoQ = q();
            this.f97849k = audioDeviceInfoQ;
            if (audioDeviceInfoQ != null) {
                this.f97844f = e.HEADSET_AVAILABLE;
                Log.d("AppRTCBluetoothManager", "Connected bluetooth headset: name=" + ((Object) this.f97849k.getProductName()));
            } else {
                this.f97844f = e.HEADSET_UNAVAILABLE;
            }
        } else {
            List<BluetoothDevice> listP = p();
            if (listP.isEmpty()) {
                this.f97848j = null;
                this.f97844f = e.HEADSET_UNAVAILABLE;
                Log.d("AppRTCBluetoothManager", "No connected bluetooth headset");
            } else {
                this.f97848j = listP.get(0);
                this.f97844f = e.HEADSET_AVAILABLE;
                Log.d("AppRTCBluetoothManager", "Connected bluetooth headset: name=" + this.f97848j.getName() + ", state=" + z(this.f97847i.getConnectionState(this.f97848j)) + ", SCO audio=" + this.f97847i.isAudioConnected(this.f97848j));
            }
        }
        Log.d("AppRTCBluetoothManager", "updateDevice done: BT state=" + this.f97844f);
    }

    protected AudioManager n(Context context) {
        return (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    protected boolean o(Context context, BluetoothProfile.ServiceListener serviceListener, int i11) {
        return this.f97846h.getProfileProxy(context, serviceListener, i11);
    }

    public e r() {
        oj0.e.a();
        return this.f97844f;
    }

    protected boolean s(Context context, String str) {
        return this.f97839a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    protected void u(BluetoothAdapter bluetoothAdapter) {
        Log.d("AppRTCBluetoothManager", "BluetoothAdapter: enabled=" + bluetoothAdapter.isEnabled() + ", state=" + z(bluetoothAdapter.getState()) + ", name=" + bluetoothAdapter.getName() + ", address=" + bluetoothAdapter.getAddress());
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (bondedDevices.isEmpty()) {
            return;
        }
        Log.d("AppRTCBluetoothManager", "paired devices:");
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            Log.d("AppRTCBluetoothManager", " name=" + bluetoothDevice.getName() + ", address=" + bluetoothDevice.getAddress() + ", deviceClass=" + String.valueOf(bluetoothDevice.getBluetoothClass().getDeviceClass()) + ", deviceMajorClass=" + String.valueOf(bluetoothDevice.getBluetoothClass().getMajorDeviceClass()));
        }
    }

    protected void v(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f97839a.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            this.f97839a.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void w() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "start");
        int i11 = Build.VERSION.SDK_INT;
        if (!s(this.f97839a, i11 >= 31 ? "android.permission.BLUETOOTH_CONNECT" : "android.permission.BLUETOOTH")) {
            Log.w("AppRTCBluetoothManager", "Process (pid=" + Process.myPid() + ") lacks BLUETOOTH permission");
            return;
        }
        if (this.f97844f != e.UNINITIALIZED) {
            Log.w("AppRTCBluetoothManager", "Invalid BT state");
            return;
        }
        this.f97847i = null;
        this.f97848j = null;
        this.f97843e = 0;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f97846h = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w("AppRTCBluetoothManager", "Device does not support Bluetooth");
            return;
        }
        if (!this.f97841c.isBluetoothScoAvailableOffCall()) {
            Log.e("AppRTCBluetoothManager", "Bluetooth SCO audio is not available off call");
            return;
        }
        u(this.f97846h);
        if (!o(this.f97839a, this.f97845g, 1)) {
            Log.e("AppRTCBluetoothManager", "BluetoothAdapter.getProfileProxy(HEADSET) failed");
            return;
        }
        if (i11 >= 31) {
            this.f97841c.registerAudioDeviceCallback(this.f97850l, null);
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            v(this.f97851m, intentFilter);
            Log.d("AppRTCBluetoothManager", "HEADSET profile state: " + z(this.f97846h.getProfileConnectionState(1)));
        }
        Log.d("AppRTCBluetoothManager", "Bluetooth proxy for headset profile has started");
        this.f97844f = e.HEADSET_UNAVAILABLE;
        Log.d("AppRTCBluetoothManager", "start done: BT state=" + this.f97844f);
    }

    public boolean x() {
        oj0.e.a();
        Log.d("AppRTCBluetoothManager", "startSco: BT state=" + this.f97844f + ", attempts: " + this.f97843e + ", SCO is on: " + t());
        if (this.f97843e >= 10) {
            Log.e("AppRTCBluetoothManager", "BT SCO connection fails - no more attempts");
            return false;
        }
        if (this.f97844f != e.HEADSET_AVAILABLE) {
            Log.e("AppRTCBluetoothManager", "BT SCO connection fails - no headset available");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo audioDeviceInfo = this.f97849k;
            if (audioDeviceInfo != null) {
                this.f97841c.setCommunicationDevice(audioDeviceInfo);
                this.f97844f = e.SCO_CONNECTED;
                Log.d("AppRTCBluetoothManager", "Set bluetooth audio device as communication device: id=" + this.f97849k.getId());
            } else {
                this.f97844f = e.SCO_DISCONNECTING;
                Log.d("AppRTCBluetoothManager", "Cannot find any bluetooth SCO device to set as communication device");
            }
            D();
        } else {
            Log.d("AppRTCBluetoothManager", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
            this.f97844f = e.SCO_CONNECTING;
            y();
            this.f97841c.startBluetoothSco();
            this.f97841c.setBluetoothScoOn(true);
            this.f97843e++;
            Log.d("AppRTCBluetoothManager", "startScoAudio done: BT state=" + this.f97844f + ", SCO is on: " + t());
        }
        return true;
    }
}
