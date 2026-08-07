package com.zxcpoiu.incallmanager;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes8.dex */
public class InCallManagerModule extends ReactContextBaseJavaModule implements LifecycleEventListener, AudioManager.OnAudioFocusChangeListener {
    private static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    private static final String REACT_NATIVE_MODULE_NAME = "InCallManager";
    private static final String SPEAKERPHONE_AUTO = "auto";
    private static final String SPEAKERPHONE_FALSE = "false";
    private static final String SPEAKERPHONE_TRUE = "true";
    private static final String TAG = "InCallManager";
    private Set<n> audioDevices;
    private AudioManager audioManager;
    private boolean audioManagerActivated;
    private Map<String, Uri> audioUriMap;
    private boolean automatic;
    private oj0.a bluetoothManager;
    private Uri bundleBusytoneUri;
    private Uri bundleRingbackUri;
    private Uri bundleRingtoneUri;
    private n defaultAudioDevice;
    private int defaultAudioMode;
    private Uri defaultBusytoneUri;
    private Uri defaultRingbackUri;
    private Uri defaultRingtoneUri;
    private boolean defaultSpeakerOn;
    private int forceSpeakerOn;
    private boolean hasWiredHeadset;
    private boolean isAudioFocused;
    private boolean isOrigAudioSetupStored;
    private boolean isProximityRegistered;
    private WindowManager.LayoutParams lastLayoutParams;
    private AudioAttributes mAudioAttributes;
    private AudioFocusRequest mAudioFocusRequest;
    private o mBusytone;
    private String mPackageName;
    private PowerManager mPowerManager;
    private o mRingback;
    private o mRingtone;
    private Handler mRingtoneCountDownHandler;
    private WindowManager mWindowManager;
    private String media;
    private BroadcastReceiver mediaButtonReceiver;
    private BroadcastReceiver noisyAudioReceiver;
    private int origAudioMode;
    private boolean origIsMicrophoneMute;
    private boolean origIsSpeakerPhoneOn;
    private boolean proximityIsNear;
    private final com.zxcpoiu.incallmanager.k proximityManager;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private n selectedAudioDevice;
    private final String useSpeakerphone;
    private n userSelectedAudioDevice;
    private final com.zxcpoiu.incallmanager.l wakeLockUtils;
    private BroadcastReceiver wiredHeadsetReceiver;

    class a implements MediaPlayer.OnInfoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58834a;

        a(String str) {
            this.f58834a = str;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
            Log.d("InCallManager", String.format("MediaPlayer %s onInfo(). what: %d, extra: %d", this.f58834a, Integer.valueOf(i11), Integer.valueOf(i12)));
            return true;
        }
    }

    class b implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58836a;

        b(String str) {
            this.f58836a = str;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            Log.d("InCallManager", String.format("MediaPlayer %s onPrepared(), start play, isSpeakerPhoneOn %b", this.f58836a, Boolean.valueOf(InCallManagerModule.this.audioManager.isSpeakerphoneOn())));
            if (this.f58836a.equals("mBusytone") || this.f58836a.equals("mRingback")) {
                InCallManagerModule.this.audioManager.setMode(3);
            } else if (this.f58836a.equals("mRingtone")) {
                InCallManagerModule.this.audioManager.setMode(1);
            }
            InCallManagerModule.this.updateAudioRoute();
            mediaPlayer.start();
        }
    }

    class c implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58838a;

        c(String str) {
            this.f58838a = str;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.d("InCallManager", String.format("MediaPlayer %s onCompletion()", this.f58838a));
            if (this.f58838a.equals("mBusytone")) {
                Log.d("InCallManager", "MyMediaPlayer(): invoke stop()");
                InCallManagerModule.this.stop();
            }
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58840a;

        static {
            int[] iArr = new int[n.values().length];
            f58840a = iArr;
            try {
                iArr[n.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58840a[n.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58840a[n.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58840a[n.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f58841a;

        e(Activity activity) {
            this.f58841a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = this.f58841a.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            InCallManagerModule.this.lastLayoutParams = attributes;
            attributes.screenBrightness = BitmapDescriptorFactory.HUE_RED;
            window.setAttributes(attributes);
            window.clearFlags(128);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f58843a;

        f(Activity activity) {
            this.f58843a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = this.f58843a.getWindow();
            if (InCallManagerModule.this.lastLayoutParams != null) {
                window.setAttributes(InCallManagerModule.this.lastLayoutParams);
            } else {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = -1.0f;
                window.setAttributes(attributes);
            }
            window.addFlags(128);
        }
    }

    class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!InCallManagerModule.ACTION_HEADSET_PLUG.equals(intent.getAction())) {
                InCallManagerModule.this.hasWiredHeadset = false;
                return;
            }
            InCallManagerModule.this.hasWiredHeadset = intent.getIntExtra("state", 0) == 1;
            InCallManagerModule.this.updateAudioRoute();
            String stringExtra = intent.getStringExtra("name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("isPlugged", intent.getIntExtra("state", 0) == 1);
            writableMapCreateMap.putBoolean("hasMic", intent.getIntExtra("microphone", 0) == 1);
            writableMapCreateMap.putString("deviceName", stringExtra);
            InCallManagerModule.this.sendEvent("WiredHeadset", writableMapCreateMap);
        }
    }

    class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                InCallManagerModule.this.updateAudioRoute();
                InCallManagerModule.this.sendEvent("NoisyAudio", null);
            }
        }
    }

    class i extends BroadcastReceiver {
        i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                int keyCode = ((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")).getKeyCode();
                switch (keyCode) {
                    case 85:
                        str = "KEYCODE_MEDIA_PLAY_PAUSE";
                        break;
                    case 86:
                        str = "KEYCODE_MEDIA_STOP";
                        break;
                    case 87:
                        str = "KEYCODE_MEDIA_NEXT";
                        break;
                    case 88:
                        str = "KEYCODE_MEDIA_PREVIOUS";
                        break;
                    default:
                        switch (keyCode) {
                            case 126:
                                str = "KEYCODE_MEDIA_PLAY";
                                break;
                            case 127:
                                str = "KEYCODE_MEDIA_PAUSE";
                                break;
                            case 128:
                                str = "KEYCODE_MEDIA_CLOSE";
                                break;
                            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                str = "KEYCODE_MEDIA_EJECT";
                                break;
                            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                str = "KEYCODE_MEDIA_RECORD";
                                break;
                            default:
                                str = "KEYCODE_UNKNOW";
                                break;
                        }
                        break;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("eventText", str);
                writableMapCreateMap.putInt("eventCode", keyCode);
                InCallManagerModule.this.sendEvent("MediaButton", writableMapCreateMap);
            }
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f58848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f58849b;

        j(Activity activity, boolean z11) {
            this.f58848a = activity;
            this.f58849b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = this.f58848a.getWindow();
            if (this.f58849b) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    class k extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58852b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Log.d("InCallManager", String.format("mRingtoneCountDownHandler.stopRingtone() timeout after %d seconds", Integer.valueOf(k.this.f58852b)));
                    InCallManagerModule.this.stopRingtone();
                } catch (Exception unused) {
                    Log.d("InCallManager", "mRingtoneCountDownHandler.stopRingtone() failed.");
                }
            }
        }

        k(String str, int i11) {
            this.f58851a = str;
            this.f58852b = i11;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Looper.prepare();
                Log.d("InCallManager", "startRingtone(): UriType=" + this.f58851a);
                if (InCallManagerModule.this.mRingtone != null) {
                    if (InCallManagerModule.this.mRingtone.isPlaying()) {
                        Log.d("InCallManager", "startRingtone(): is already playing");
                        return;
                    }
                    InCallManagerModule.this.stopRingtone();
                }
                if (InCallManagerModule.this.audioManager.getStreamVolume(2) == 0) {
                    Log.d("InCallManager", "startRingtone(): ringer is silent. leave without play.");
                    return;
                }
                Uri ringtoneUri = InCallManagerModule.this.getRingtoneUri(this.f58851a);
                if (ringtoneUri == null) {
                    Log.d("InCallManager", "startRingtone(): no available media");
                    return;
                }
                if (InCallManagerModule.this.audioManagerActivated) {
                    InCallManagerModule.this.stop();
                }
                InCallManagerModule.this.wakeLockUtils.d();
                InCallManagerModule.this.storeOriginalAudioSetup();
                HashMap map = new HashMap();
                InCallManagerModule.this.mRingtone = new p();
                map.put("name", "mRingtone");
                map.put("sourceUri", ringtoneUri);
                map.put("setLooping", Boolean.TRUE);
                map.put("audioUsage", 6);
                map.put("audioContentType", 2);
                InCallManagerModule inCallManagerModule = InCallManagerModule.this;
                inCallManagerModule.setMediaPlayerEvents((MediaPlayer) inCallManagerModule.mRingtone, "mRingtone");
                InCallManagerModule.this.mRingtone.b(map);
                if (this.f58852b > 0) {
                    InCallManagerModule.this.mRingtoneCountDownHandler = new Handler();
                    InCallManagerModule.this.mRingtoneCountDownHandler.postDelayed(new a(), this.f58852b * 1000);
                }
                Looper.loop();
            } catch (Exception e11) {
                InCallManagerModule.this.wakeLockUtils.f();
                Log.e("InCallManager", "startRingtone() failed", e11);
            }
        }
    }

    class l extends Thread {
        l() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (InCallManagerModule.this.mRingtone != null) {
                    InCallManagerModule.this.mRingtone.a();
                    InCallManagerModule.this.mRingtone = null;
                    InCallManagerModule.this.restoreOriginalAudioSetup();
                }
                if (InCallManagerModule.this.mRingtoneCountDownHandler != null) {
                    InCallManagerModule.this.mRingtoneCountDownHandler.removeCallbacksAndMessages(null);
                    InCallManagerModule.this.mRingtoneCountDownHandler = null;
                }
            } catch (Exception unused) {
                Log.d("InCallManager", "stopRingtone() failed");
            }
            InCallManagerModule.this.wakeLockUtils.f();
        }
    }

    class m implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58856a;

        m(String str) {
            this.f58856a = str;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            Log.d("InCallManager", String.format("MediaPlayer %s onError(). what: %d, extra: %d", this.f58856a, Integer.valueOf(i11), Integer.valueOf(i12)));
            return true;
        }
    }

    public enum n {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    interface o {
        void a();

        void b(Map<String, Object> map);

        boolean isPlaying();
    }

    private class p extends MediaPlayer implements o {
        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.o
        public void a() {
            stop();
            reset();
            release();
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.o
        public void b(Map map) {
            try {
                setDataSource(InCallManagerModule.this.getReactApplicationContext(), (Uri) map.get("sourceUri"));
                setLooping(((Boolean) map.get("setLooping")).booleanValue());
                setAudioAttributes(new AudioAttributes.Builder().setUsage(((Integer) map.get("audioUsage")).intValue()).setContentType(((Integer) map.get("audioContentType")).intValue()).build());
                prepareAsync();
            } catch (Exception e11) {
                Log.d("InCallManager", "startPlay() failed", e11);
            }
        }

        @Override // android.media.MediaPlayer, com.zxcpoiu.incallmanager.InCallManagerModule.o
        public boolean isPlaying() {
            return super.isPlaying();
        }

        private p() {
        }
    }

    private class q extends Thread implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f58859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f58860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f58861c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f58862d = 3600000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f58863e;

        q(int i11) {
            this.f58860b = i11;
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.o
        public void a() {
            synchronized (this) {
                try {
                    if (this.f58861c) {
                        notify();
                    }
                    this.f58861c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.o
        public void b(Map map) {
            this.f58863e = (String) map.get("name");
            start();
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.o
        public boolean isPlaying() {
            return this.f58861c;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ToneGenerator toneGenerator;
            int i11 = 3600000;
            switch (this.f58860b) {
                case 101:
                    this.f58859a = 28;
                    i11 = 1000;
                    break;
                case 102:
                    this.f58859a = 20;
                    i11 = 4000;
                    break;
                case 103:
                    this.f58859a = 27;
                    i11 = 200;
                    break;
                case 104:
                    this.f58859a = 22;
                    break;
                case 105:
                    this.f58859a = 35;
                    break;
                case 106:
                    this.f58859a = 42;
                    i11 = 1000;
                    break;
                default:
                    Log.d("InCallManager", "myToneGenerator: use internal tone type: " + this.f58860b);
                    this.f58859a = this.f58860b;
                    i11 = this.f58862d;
                    break;
            }
            Log.d("InCallManager", String.format("myToneGenerator: toneCategory: %d ,toneType: %d, toneWaitTimeMs: %d", Integer.valueOf(this.f58860b), Integer.valueOf(this.f58859a), Integer.valueOf(i11)));
            try {
                toneGenerator = new ToneGenerator(0, 100);
            } catch (RuntimeException e11) {
                Log.d("InCallManager", "myToneGenerator: Exception caught while creating ToneGenerator: " + e11);
                toneGenerator = null;
            }
            if (toneGenerator != null) {
                synchronized (this) {
                    try {
                        if (!this.f58861c) {
                            this.f58861c = true;
                            if (this.f58863e.equals("mBusytone") || this.f58863e.equals("mRingback")) {
                                InCallManagerModule.this.audioManager.setMode(3);
                            } else if (this.f58863e.equals("mRingtone")) {
                                InCallManagerModule.this.audioManager.setMode(1);
                            }
                            InCallManagerModule.this.updateAudioRoute();
                            toneGenerator.startTone(this.f58859a);
                            try {
                                wait(i11 + 20);
                            } catch (InterruptedException unused) {
                                Log.d("InCallManager", "myToneGenerator stopped. toneType: " + this.f58859a);
                            }
                            toneGenerator.stopTone();
                        }
                        this.f58861c = false;
                        toneGenerator.release();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Log.d("InCallManager", "MyToneGenerator(): play finished. caller=" + this.f58863e);
            if (this.f58863e.equals("mBusytone")) {
                Log.d("InCallManager", "MyToneGenerator(): invoke stop()");
                InCallManagerModule.this.stop();
            }
        }
    }

    public InCallManagerModule(final ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mPackageName = "com.zxcpoiu.incallmanager";
        this.audioManagerActivated = false;
        this.isAudioFocused = false;
        this.isOrigAudioSetupStored = false;
        this.origIsSpeakerPhoneOn = false;
        this.origIsMicrophoneMute = false;
        this.origAudioMode = -2;
        this.defaultSpeakerOn = false;
        this.defaultAudioMode = 3;
        this.forceSpeakerOn = 0;
        this.automatic = true;
        this.isProximityRegistered = false;
        this.proximityIsNear = false;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
        this.defaultRingtoneUri = uri;
        this.defaultRingbackUri = uri;
        this.defaultBusytoneUri = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.media = MediaStreamTrack.AUDIO_TRACK_KIND;
        this.savedAudioMode = -2;
        this.savedIsSpeakerPhoneOn = false;
        this.savedIsMicrophoneMute = false;
        this.hasWiredHeadset = false;
        this.defaultAudioDevice = n.NONE;
        this.useSpeakerphone = "auto";
        this.bluetoothManager = null;
        this.audioDevices = new HashSet();
        this.mPackageName = reactApplicationContext.getPackageName();
        reactApplicationContext.addLifecycleEventListener(this);
        this.mWindowManager = (WindowManager) reactApplicationContext.getSystemService("window");
        this.mPowerManager = (PowerManager) reactApplicationContext.getSystemService("power");
        this.audioManager = (AudioManager) reactApplicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        HashMap map = new HashMap();
        this.audioUriMap = map;
        map.put("defaultRingtoneUri", this.defaultRingtoneUri);
        this.audioUriMap.put("defaultRingbackUri", this.defaultRingbackUri);
        this.audioUriMap.put("defaultBusytoneUri", this.defaultBusytoneUri);
        this.audioUriMap.put("bundleRingtoneUri", this.bundleRingtoneUri);
        this.audioUriMap.put("bundleRingbackUri", this.bundleRingbackUri);
        this.audioUriMap.put("bundleBusytoneUri", this.bundleBusytoneUri);
        this.wakeLockUtils = new com.zxcpoiu.incallmanager.l(reactApplicationContext);
        this.proximityManager = com.zxcpoiu.incallmanager.k.g(reactApplicationContext, this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f58867a.lambda$new$0(reactApplicationContext);
            }
        });
        Log.d("InCallManager", "InCallManager initialized");
    }

    private String abandonAudioFocus() {
        String strAbandonAudioFocusV26 = Build.VERSION.SDK_INT >= 26 ? abandonAudioFocusV26() : abandonAudioFocusOld();
        Log.d("InCallManager", "abandonAudioFocus(): res = " + strAbandonAudioFocusV26);
        return strAbandonAudioFocusV26;
    }

    private String abandonAudioFocusOld() {
        if (!this.isAudioFocused) {
            return "";
        }
        int iAbandonAudioFocus = this.audioManager.abandonAudioFocus(this);
        if (iAbandonAudioFocus == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (iAbandonAudioFocus != 1) {
            return "AUDIOFOCUS_REQUEST_UNKNOWN";
        }
        this.isAudioFocused = false;
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    private String abandonAudioFocusV26() {
        AudioFocusRequest audioFocusRequest;
        if (!this.isAudioFocused || (audioFocusRequest = this.mAudioFocusRequest) == null) {
            return "";
        }
        int iAbandonAudioFocusRequest = this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        if (iAbandonAudioFocusRequest == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (iAbandonAudioFocusRequest != 1) {
            return "AUDIOFOCUS_REQUEST_UNKNOWN";
        }
        this.isAudioFocused = false;
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    private void debugScreenPowerState() {
        String str;
        String str2 = String.format("%s", Boolean.valueOf(this.mPowerManager.isDeviceIdleMode()));
        String str3 = String.format("%s", Boolean.valueOf(this.mPowerManager.isIgnoringBatteryOptimizations(this.mPackageName)));
        String str4 = String.format("%s", Boolean.valueOf(this.mPowerManager.isPowerSaveMode()));
        String str5 = String.format("%s", Boolean.valueOf(this.mPowerManager.isInteractive()));
        int state = this.mWindowManager.getDefaultDisplay().getState();
        if (state == 1) {
            str = "STATE_OFF";
        } else if (state == 2) {
            str = "STATE_ON";
        } else if (state != 3) {
            str = state != 4 ? "unknow" : "STATE_DOZE_SUSPEND";
        } else {
            str = "STATE_DOZE";
        }
        Log.d("InCallManager", String.format("debugScreenPowerState(): screenState='%s', isInteractive='%s', isPowerSaveMode='%s', isDeviceIdleMode='%s', isIgnoringBatteryOptimizations='%s'", str, str5, str4, str2, str3));
    }

    private WritableMap getAudioDeviceStatusMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<n> it = this.audioDevices.iterator();
        String strSubstring = "[";
        while (it.hasNext()) {
            strSubstring = strSubstring + "\"" + it.next().name() + "\",";
        }
        if (strSubstring.length() > 1) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        writableMapCreateMap.putString("availableAudioDeviceList", strSubstring + "]");
        n nVar = this.selectedAudioDevice;
        writableMapCreateMap.putString("selectedAudioDevice", nVar == null ? "" : nVar.name());
        return writableMapCreateMap;
    }

    private Uri getAudioUri(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int identifier;
        if (!str.equals("_BUNDLE_")) {
            String str8 = str5 + "/" + str;
            Uri sysFileUri = getSysFileUri(str8);
            if (sysFileUri == null) {
                Log.d("InCallManager", "getAudioUri() using user default");
                return getDefaultUserUri(str7);
            }
            Log.d("InCallManager", "getAudioUri() using internal: " + str8);
            this.audioUriMap.put(str7, sysFileUri);
            return sysFileUri;
        }
        if (this.audioUriMap.get(str6) != null) {
            Log.d("InCallManager", "getAudioUri() using: " + str);
            return this.audioUriMap.get(str6);
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            identifier = reactApplicationContext.getResources().getIdentifier(str2, "raw", this.mPackageName);
        } else {
            Log.d("InCallManager", "getAudioUri() reactContext is null");
            identifier = 0;
        }
        if (identifier <= 0) {
            Log.d("InCallManager", String.format("getAudioUri() %s.%s not found in bundle.", str2, str3));
            this.audioUriMap.put(str6, null);
            return getDefaultUserUri(str7);
        }
        this.audioUriMap.put(str6, Uri.parse("android.resource://" + this.mPackageName + "/" + Integer.toString(identifier)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getAudioUri() using: ");
        sb2.append(str);
        Log.d("InCallManager", sb2.toString());
        return this.audioUriMap.get(str6);
    }

    private Uri getBusytoneUri(String str) {
        return (str.equals("_DEFAULT_") || str.isEmpty()) ? getDefaultUserUri("defaultBusytoneUri") : getAudioUri(str, "incallmanager_busytone", "mp3", "LowBattery.ogg", "/system/media/audio/ui", "bundleBusytoneUri", "defaultBusytoneUri");
    }

    private Uri getDefaultUserUri(String str) {
        if (str.equals("defaultRingtoneUri")) {
            return Settings.System.DEFAULT_RINGTONE_URI;
        }
        if (str.equals("defaultRingbackUri")) {
            return Settings.System.DEFAULT_RINGTONE_URI;
        }
        return str.equals("defaultBusytoneUri") ? Settings.System.DEFAULT_NOTIFICATION_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    private n getPreferredAudioDevice() {
        return getPreferredAudioDevice(false);
    }

    private static int getRandomInteger(int i11, int i12) {
        if (i11 < i12) {
            return new Random().nextInt((i12 - i11) + 1) + i11;
        }
        throw new IllegalArgumentException("max must be greater than min");
    }

    private Uri getRingbackUri(String str) {
        return (str.equals("_DEFAULT_") || str.isEmpty()) ? getDefaultUserUri("defaultRingbackUri") : getAudioUri(str, "incallmanager_ringback", "mp3", "media_volume.ogg", "/system/media/audio/ui", "bundleRingbackUri", "defaultRingbackUri");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri getRingtoneUri(String str) {
        return (str.equals("_DEFAULT_") || str.isEmpty()) ? getDefaultUserUri("defaultRingtoneUri") : getAudioUri(str, "incallmanager_ringtone", "mp3", "media_volume.ogg", "/system/media/audio/ui", "bundleRingtoneUri", "defaultRingtoneUri");
    }

    private Uri getSysFileUri(String str) {
        File file = new File(str);
        if (file.isFile()) {
            return Uri.fromFile(file);
        }
        return null;
    }

    private boolean hasEarpiece() {
        return getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Deprecated
    private boolean hasWiredHeadset() {
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("InCallManager", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("InCallManager", "hasWiredHeadset: found USB audio device");
                return true;
            }
            if (type == 4) {
                Log.d("InCallManager", "hasWiredHeadset: found wired headphones");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ReactApplicationContext reactApplicationContext) {
        this.bluetoothManager = oj0.a.m(reactApplicationContext, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.bluetoothManager.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$2() {
        this.bluetoothManager.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAudioDeviceState$3() {
        n nVar;
        Log.d("InCallManager", "--- updateAudioDeviceState: wired headset=" + this.hasWiredHeadset + ", BT state=" + this.bluetoothManager.r());
        Log.d("InCallManager", "Device status: available=" + this.audioDevices + ", selected=" + this.selectedAudioDevice + ", user selected=" + this.userSelectedAudioDevice);
        oj0.a.e eVarR = this.bluetoothManager.r();
        oj0.a.e eVar = oj0.a.e.HEADSET_AVAILABLE;
        if (eVarR == eVar || this.bluetoothManager.r() == oj0.a.e.HEADSET_UNAVAILABLE || this.bluetoothManager.r() == oj0.a.e.SCO_DISCONNECTING) {
            this.bluetoothManager.E();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(n.SPEAKER_PHONE);
        oj0.a.e eVarR2 = this.bluetoothManager.r();
        oj0.a.e eVar2 = oj0.a.e.SCO_CONNECTED;
        if (eVarR2 == eVar2 || this.bluetoothManager.r() == oj0.a.e.SCO_CONNECTING || this.bluetoothManager.r() == eVar) {
            hashSet.add(n.BLUETOOTH);
        }
        if (this.hasWiredHeadset) {
            hashSet.add(n.WIRED_HEADSET);
        }
        if (hasEarpiece()) {
            hashSet.add(n.EARPIECE);
        }
        n nVar2 = this.userSelectedAudioDevice;
        if (nVar2 != null && nVar2 != (nVar = n.NONE) && !hashSet.contains(nVar2)) {
            this.userSelectedAudioDevice = nVar;
        }
        boolean z11 = !this.audioDevices.equals(hashSet);
        this.audioDevices = hashSet;
        n preferredAudioDevice = getPreferredAudioDevice();
        n nVar3 = this.selectedAudioDevice;
        n nVar4 = n.BLUETOOTH;
        if (nVar3 == nVar4 && preferredAudioDevice != nVar4 && (this.bluetoothManager.r() == eVar2 || this.bluetoothManager.r() == oj0.a.e.SCO_CONNECTING)) {
            this.bluetoothManager.B();
            this.bluetoothManager.E();
        }
        if (this.selectedAudioDevice != nVar4 && preferredAudioDevice == nVar4 && this.bluetoothManager.r() == eVar && !this.bluetoothManager.x()) {
            this.audioDevices.remove(nVar4);
            if (this.userSelectedAudioDevice == nVar4) {
                this.userSelectedAudioDevice = n.NONE;
            }
            preferredAudioDevice = getPreferredAudioDevice();
            z11 = true;
        }
        if (preferredAudioDevice == nVar4 && this.bluetoothManager.r() != eVar2) {
            preferredAudioDevice = getPreferredAudioDevice(true);
        }
        if (preferredAudioDevice != this.selectedAudioDevice || z11) {
            setAudioDeviceInternal(preferredAudioDevice);
            Log.d("InCallManager", "New device status: available=" + this.audioDevices + ", selected=" + preferredAudioDevice);
            sendEvent("onAudioDeviceChanged", getAudioDeviceStatusMap());
        }
        Log.d("InCallManager", "--- updateAudioDeviceState done");
    }

    private void manualTurnScreenOff() {
        Log.d("InCallManager", "manualTurnScreenOff()");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.d("InCallManager", "ReactContext doesn't have any Activity attached.");
        } else {
            UiThreadUtil.runOnUiThread(new e(currentActivity));
        }
    }

    private void manualTurnScreenOn() {
        Log.d("InCallManager", "manualTurnScreenOn()");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.d("InCallManager", "ReactContext doesn't have any Activity attached.");
        } else {
            UiThreadUtil.runOnUiThread(new f(currentActivity));
        }
    }

    private void pause() {
        if (this.audioManagerActivated) {
            Log.d("InCallManager", "pause audioRouteManager");
            stopEvents();
        }
    }

    private void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null) {
            Log.d("InCallManager", "registerReceiver() reactContext is null");
        } else if (Build.VERSION.SDK_INT >= 33) {
            reactApplicationContext.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            reactApplicationContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    private String requestAudioFocus() {
        String strRequestAudioFocusV26 = Build.VERSION.SDK_INT >= 26 ? requestAudioFocusV26() : requestAudioFocusOld();
        Log.d("InCallManager", "requestAudioFocus(): res = " + strRequestAudioFocusV26);
        return strRequestAudioFocusV26;
    }

    private String requestAudioFocusOld() {
        if (this.isAudioFocused) {
            return "";
        }
        int iRequestAudioFocus = this.audioManager.requestAudioFocus(this, 0, 2);
        if (iRequestAudioFocus == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (iRequestAudioFocus != 1) {
            return "AUDIOFOCUS_REQUEST_UNKNOWN";
        }
        this.isAudioFocused = true;
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    private String requestAudioFocusV26() {
        if (this.isAudioFocused) {
            return "";
        }
        if (this.mAudioAttributes == null) {
            this.mAudioAttributes = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
        }
        if (this.mAudioFocusRequest == null) {
            this.mAudioFocusRequest = q7.a.a(2).setAudioAttributes(this.mAudioAttributes).setAcceptsDelayedFocusGain(false).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(this).build();
        }
        int iRequestAudioFocus = this.audioManager.requestAudioFocus(this.mAudioFocusRequest);
        if (iRequestAudioFocus == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (iRequestAudioFocus != 1) {
            return iRequestAudioFocus != 2 ? "AUDIOFOCUS_REQUEST_UNKNOWN" : "AUDIOFOCUS_REQUEST_DELAYED";
        }
        this.isAudioFocused = true;
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreOriginalAudioSetup() {
        Log.d("InCallManager", "restoreOriginalAudioSetup()");
        if (this.isOrigAudioSetupStored) {
            setSpeakerphoneOn(this.origIsSpeakerPhoneOn);
            setMicrophoneMute(this.origIsMicrophoneMute);
            this.audioManager.setMode(this.origAudioMode);
            if (getCurrentActivity() != null) {
                getCurrentActivity().setVolumeControlStream(Integer.MIN_VALUE);
            }
            this.isOrigAudioSetupStored = false;
        }
    }

    private void resume() {
        if (this.audioManagerActivated) {
            Log.d("InCallManager", "resume audioRouteManager");
            startEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext == null || !reactApplicationContext.hasActiveCatalystInstance()) {
                Log.e("InCallManager", "sendEvent(): reactContext is null or not having CatalystInstance yet.");
            } else {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            }
        } catch (RuntimeException unused) {
            Log.e("InCallManager", "sendEvent(): java.lang.RuntimeException: Trying to invoke JS before CatalystInstance has been set!");
        }
    }

    private void setAudioDeviceInternal(n nVar) {
        Log.d("InCallManager", "setAudioDeviceInternal(device=" + nVar + ")");
        if (!this.audioDevices.contains(nVar)) {
            Log.e("InCallManager", "specified audio device does not exist");
            return;
        }
        int i11 = d.f58840a[nVar.ordinal()];
        if (i11 == 1) {
            setSpeakerphoneOn(true);
        } else if (i11 == 2 || i11 == 3 || i11 == 4) {
            setSpeakerphoneOn(false);
        } else {
            Log.e("InCallManager", "Invalid audio device selection");
        }
        this.selectedAudioDevice = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayerEvents(MediaPlayer mediaPlayer, String str) {
        mediaPlayer.setOnErrorListener(new m(str));
        mediaPlayer.setOnInfoListener(new a(str));
        mediaPlayer.setOnPreparedListener(new b(str));
        mediaPlayer.setOnCompletionListener(new c(str));
    }

    private void startEvents() {
        startWiredHeadsetEvent();
        startNoisyAudioEvent();
        startMediaButtonEvent();
        startProximitySensor();
        setKeepScreenOn(true);
    }

    private void startMediaButtonEvent() {
        if (this.mediaButtonReceiver == null) {
            Log.d("InCallManager", "startMediaButtonEvent()");
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            i iVar = new i();
            this.mediaButtonReceiver = iVar;
            registerReceiver(iVar, intentFilter);
        }
    }

    private void startNoisyAudioEvent() {
        if (this.noisyAudioReceiver == null) {
            Log.d("InCallManager", "startNoisyAudioEvent()");
            IntentFilter intentFilter = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
            h hVar = new h();
            this.noisyAudioReceiver = hVar;
            registerReceiver(hVar, intentFilter);
        }
    }

    private void startWiredHeadsetEvent() {
        if (this.wiredHeadsetReceiver == null) {
            Log.d("InCallManager", "startWiredHeadsetEvent()");
            IntentFilter intentFilter = new IntentFilter(ACTION_HEADSET_PLUG);
            g gVar = new g();
            this.wiredHeadsetReceiver = gVar;
            registerReceiver(gVar, intentFilter);
        }
    }

    private void stopEvents() {
        stopWiredHeadsetEvent();
        stopNoisyAudioEvent();
        stopMediaButtonEvent();
        stopProximitySensor();
        setKeepScreenOn(false);
        turnScreenOn();
    }

    private void stopMediaButtonEvent() {
        if (this.mediaButtonReceiver != null) {
            Log.d("InCallManager", "stopMediaButtonEvent()");
            unregisterReceiver(this.mediaButtonReceiver);
            this.mediaButtonReceiver = null;
        }
    }

    private void stopNoisyAudioEvent() {
        if (this.noisyAudioReceiver != null) {
            Log.d("InCallManager", "stopNoisyAudioEvent()");
            unregisterReceiver(this.noisyAudioReceiver);
            this.noisyAudioReceiver = null;
        }
    }

    private void stopWiredHeadsetEvent() {
        if (this.wiredHeadsetReceiver != null) {
            Log.d("InCallManager", "stopWiredHeadsetEvent()");
            unregisterReceiver(this.wiredHeadsetReceiver);
            this.wiredHeadsetReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storeOriginalAudioSetup() {
        Log.d("InCallManager", "storeOriginalAudioSetup()");
        if (this.isOrigAudioSetupStored) {
            return;
        }
        this.origAudioMode = this.audioManager.getMode();
        this.origIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.origIsMicrophoneMute = this.audioManager.isMicrophoneMute();
        this.isOrigAudioSetupStored = true;
    }

    private void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null) {
            Log.d("InCallManager", "unregisterReceiver() reactContext is null");
            return;
        }
        try {
            reactApplicationContext.unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
            Log.d("InCallManager", "unregisterReceiver() failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAudioRoute() {
        if (this.automatic) {
            updateAudioDeviceState();
        }
    }

    @ReactMethod
    public void abandonAudioFocusJS(Promise promise) {
        promise.resolve(abandonAudioFocus());
    }

    @ReactMethod
    public void chooseAudioRoute(String str, Promise promise) {
        Log.d("InCallManager", "RNInCallManager.chooseAudioRoute(): user choose audioDevice = " + str);
        n nVar = n.EARPIECE;
        if (str.equals(nVar.name())) {
            selectAudioDevice(nVar);
        } else {
            n nVar2 = n.SPEAKER_PHONE;
            if (str.equals(nVar2.name())) {
                selectAudioDevice(nVar2);
            } else {
                n nVar3 = n.WIRED_HEADSET;
                if (str.equals(nVar3.name())) {
                    selectAudioDevice(nVar3);
                } else {
                    n nVar4 = n.BLUETOOTH;
                    if (str.equals(nVar4.name())) {
                        selectAudioDevice(nVar4);
                    }
                }
            }
        }
        promise.resolve(getAudioDeviceStatusMap());
    }

    public Set<n> getAudioDevices() {
        return Collections.unmodifiableSet(new HashSet(this.audioDevices));
    }

    @ReactMethod
    public void getAudioUriJS(String str, String str2, Promise promise) {
        Uri ringtoneUri;
        if (str.equals("ringback")) {
            ringtoneUri = getRingbackUri(str2);
        } else if (str.equals("busytone")) {
            ringtoneUri = getBusytoneUri(str2);
        } else {
            ringtoneUri = str.equals("ringtone") ? getRingtoneUri(str2) : null;
        }
        try {
            if (ringtoneUri != null) {
                promise.resolve(ringtoneUri.toString());
            } else {
                promise.reject("failed");
            }
        } catch (Exception unused) {
            promise.reject("failed");
        }
    }

    @ReactMethod
    public void getIsWiredHeadsetPluggedIn(Promise promise) {
        promise.resolve(Boolean.valueOf(hasWiredHeadset()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "InCallManager";
    }

    public n getSelectedAudioDevice() {
        return this.selectedAudioDevice;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i11) {
        String str;
        switch (i11) {
            case -3:
                str = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
                break;
            case -2:
                str = "AUDIOFOCUS_LOSS_TRANSIENT";
                break;
            case -1:
                str = "AUDIOFOCUS_LOSS";
                break;
            case 0:
                str = "AUDIOFOCUS_NONE";
                break;
            case 1:
                str = "AUDIOFOCUS_GAIN";
                break;
            case 2:
                str = "AUDIOFOCUS_GAIN_TRANSIENT";
                break;
            case 3:
                str = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
                break;
            case 4:
                str = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
                break;
            default:
                str = "AUDIOFOCUS_UNKNOW";
                break;
        }
        Log.d("InCallManager", "onAudioFocusChange(): " + i11 + " - " + str);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("eventText", str);
        writableMapCreateMap.putInt("eventCode", i11);
        sendEvent("onAudioFocusChange", writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Log.d("InCallManager", "onDestroy()");
        stopRingtone();
        stopRingback();
        stopBusytone();
        stop();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Log.d("InCallManager", "onPause()");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Log.d("InCallManager", "onResume()");
    }

    public void onProximitySensorChangedState(boolean z11) {
        if (this.automatic && getSelectedAudioDevice() == n.EARPIECE) {
            if (z11) {
                turnScreenOff();
            } else {
                turnScreenOn();
            }
            updateAudioRoute();
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isNear", z11);
        sendEvent("Proximity", writableMapCreateMap);
    }

    @ReactMethod
    public void pokeScreen(int i11) {
        Log.d("InCallManager", "pokeScreen()");
        this.wakeLockUtils.e(i11);
    }

    @ReactMethod
    public void requestAudioFocusJS(Promise promise) {
        promise.resolve(requestAudioFocus());
    }

    public void selectAudioDevice(n nVar) {
        if (nVar == n.NONE || this.audioDevices.contains(nVar)) {
            this.userSelectedAudioDevice = nVar;
            updateAudioDeviceState();
            return;
        }
        Log.e("InCallManager", "selectAudioDevice() Can not select " + nVar + " from available " + this.audioDevices);
    }

    public void setDefaultAudioDevice(n nVar) {
        int i11 = d.f58840a[nVar.ordinal()];
        if (i11 == 1) {
            this.defaultAudioDevice = nVar;
        } else if (i11 != 2) {
            Log.e("InCallManager", "Invalid default audio device selection");
        } else if (hasEarpiece()) {
            this.defaultAudioDevice = nVar;
        } else {
            this.defaultAudioDevice = n.SPEAKER_PHONE;
        }
        Log.d("InCallManager", "setDefaultAudioDevice(device=" + this.defaultAudioDevice + ")");
        updateAudioDeviceState();
    }

    @ReactMethod
    public void setForceSpeakerphoneOn(int i11) {
        if (i11 < -1 || i11 > 1) {
            return;
        }
        Log.d("InCallManager", "setForceSpeakerphoneOn() flag: " + i11);
        this.forceSpeakerOn = i11;
        if (i11 == 1) {
            selectAudioDevice(n.SPEAKER_PHONE);
        } else if (i11 == -1) {
            selectAudioDevice(n.EARPIECE);
        } else {
            selectAudioDevice(n.NONE);
        }
    }

    @ReactMethod
    public void setKeepScreenOn(boolean z11) {
        Log.d("InCallManager", "setKeepScreenOn() " + z11);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.d("InCallManager", "ReactContext doesn't have any Activity attached.");
        } else {
            UiThreadUtil.runOnUiThread(new j(currentActivity, z11));
        }
    }

    @ReactMethod
    public void setMicrophoneMute(boolean z11) {
        if (z11 != this.audioManager.isMicrophoneMute()) {
            Log.d("InCallManager", "setMicrophoneMute(): " + z11);
            this.audioManager.setMicrophoneMute(z11);
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(boolean z11) {
        if (z11 != this.audioManager.isSpeakerphoneOn()) {
            Log.d("InCallManager", "setSpeakerphoneOn(): " + z11);
            this.audioManager.setMode(this.defaultAudioMode);
            this.audioManager.setSpeakerphoneOn(z11);
        }
    }

    @ReactMethod
    public void start(String str, boolean z11, String str2) {
        this.media = str;
        if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            this.defaultSpeakerOn = true;
        } else {
            this.defaultSpeakerOn = false;
        }
        this.automatic = z11;
        if (this.audioManagerActivated) {
            return;
        }
        this.audioManagerActivated = true;
        Log.d("InCallManager", "start audioRouteManager");
        this.wakeLockUtils.d();
        o oVar = this.mRingtone;
        if (oVar != null && oVar.isPlaying()) {
            Log.d("InCallManager", "stop ringtone");
            stopRingtone();
        }
        storeOriginalAudioSetup();
        requestAudioFocus();
        startEvents();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f58866a.lambda$start$1();
            }
        });
        this.audioManager.setMode(this.defaultAudioMode);
        setSpeakerphoneOn(this.defaultSpeakerOn);
        setMicrophoneMute(false);
        this.forceSpeakerOn = 0;
        this.hasWiredHeadset = hasWiredHeadset();
        this.defaultAudioDevice = (!this.defaultSpeakerOn && hasEarpiece()) ? n.EARPIECE : n.SPEAKER_PHONE;
        n nVar = n.NONE;
        this.userSelectedAudioDevice = nVar;
        this.selectedAudioDevice = nVar;
        this.audioDevices.clear();
        updateAudioRoute();
        if (str2.isEmpty()) {
            return;
        }
        startRingback(str2);
    }

    public boolean startBusytone(String str) {
        if (str.isEmpty()) {
            return false;
        }
        try {
            Log.d("InCallManager", "startBusytone(): UriType=" + str);
            o oVar = this.mBusytone;
            if (oVar != null) {
                if (oVar.isPlaying()) {
                    Log.d("InCallManager", "startBusytone(): is already playing");
                    return false;
                }
                stopBusytone();
            }
            HashMap map = new HashMap();
            map.put("name", "mBusytone");
            if (str.equals("_DTMF_")) {
                q qVar = new q(102);
                this.mBusytone = qVar;
                qVar.b(map);
                return true;
            }
            Uri busytoneUri = getBusytoneUri(str);
            if (busytoneUri == null) {
                Log.d("InCallManager", "startBusytone(): no available media");
                return false;
            }
            this.mBusytone = new p();
            map.put("sourceUri", busytoneUri);
            map.put("setLooping", Boolean.FALSE);
            map.put("audioUsage", 2);
            map.put("audioContentType", 4);
            setMediaPlayerEvents((MediaPlayer) this.mBusytone, "mBusytone");
            this.mBusytone.b(map);
            return true;
        } catch (Exception e11) {
            Log.d("InCallManager", "startBusytone() failed", e11);
            return false;
        }
    }

    @ReactMethod
    public void startProximitySensor() {
        if (!this.proximityManager.h()) {
            Log.d("InCallManager", "Proximity Sensor is not supported.");
            return;
        }
        if (this.isProximityRegistered) {
            Log.d("InCallManager", "Proximity Sensor is already registered.");
        } else if (!this.proximityManager.o()) {
            Log.d("InCallManager", "proximityManager.start() failed. return false");
        } else {
            Log.d("InCallManager", "startProximitySensor()");
            this.isProximityRegistered = true;
        }
    }

    @ReactMethod
    public void startRingback(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            Log.d("InCallManager", "startRingback(): UriType=" + str);
            o oVar = this.mRingback;
            if (oVar != null) {
                if (oVar.isPlaying()) {
                    Log.d("InCallManager", "startRingback(): is already playing");
                    return;
                }
                stopRingback();
            }
            HashMap map = new HashMap();
            map.put("name", "mRingback");
            if (str.equals("_DTMF_")) {
                q qVar = new q(105);
                this.mRingback = qVar;
                qVar.b(map);
                return;
            }
            Uri ringbackUri = getRingbackUri(str);
            if (ringbackUri == null) {
                Log.d("InCallManager", "startRingback(): no available media");
                return;
            }
            this.mRingback = new p();
            map.put("sourceUri", ringbackUri);
            map.put("setLooping", Boolean.TRUE);
            map.put("audioUsage", 2);
            map.put("audioContentType", 2);
            setMediaPlayerEvents((MediaPlayer) this.mRingback, "mRingback");
            this.mRingback.b(map);
        } catch (Exception e11) {
            Log.d("InCallManager", "startRingback() failed", e11);
        }
    }

    @ReactMethod
    public void startRingtone(String str, int i11) {
        new k(str, i11).start();
    }

    public void stop() {
        stop("");
    }

    public void stopBusytone() {
        try {
            o oVar = this.mBusytone;
            if (oVar != null) {
                oVar.a();
                this.mBusytone = null;
            }
        } catch (Exception unused) {
            Log.d("InCallManager", "stopBusytone() failed");
        }
    }

    @ReactMethod
    public void stopProximitySensor() {
        if (!this.proximityManager.h()) {
            Log.d("InCallManager", "Proximity Sensor is not supported.");
        } else {
            if (!this.isProximityRegistered) {
                Log.d("InCallManager", "Proximity Sensor is not registered.");
                return;
            }
            Log.d("InCallManager", "stopProximitySensor()");
            this.proximityManager.p();
            this.isProximityRegistered = false;
        }
    }

    @ReactMethod
    public void stopRingback() {
        try {
            o oVar = this.mRingback;
            if (oVar != null) {
                oVar.a();
                this.mRingback = null;
            }
        } catch (Exception unused) {
            Log.d("InCallManager", "stopRingback() failed");
        }
    }

    @ReactMethod
    public void stopRingtone() {
        new l().start();
    }

    @ReactMethod
    public void turnScreenOff() {
        if (this.proximityManager.i()) {
            Log.d("InCallManager", "turnScreenOff(): use proximity lock.");
            this.proximityManager.e();
        } else {
            Log.d("InCallManager", "turnScreenOff(): proximity lock is not supported. try manually.");
            manualTurnScreenOff();
        }
    }

    @ReactMethod
    public void turnScreenOn() {
        if (this.proximityManager.i()) {
            Log.d("InCallManager", "turnScreenOn(): use proximity lock.");
            this.proximityManager.n(true);
        } else {
            Log.d("InCallManager", "turnScreenOn(): proximity lock is not supported. try manually.");
            manualTurnScreenOn();
        }
    }

    public void updateAudioDeviceState() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f58869a.lambda$updateAudioDeviceState$3();
            }
        });
    }

    private n getPreferredAudioDevice(boolean z11) {
        n nVar = this.userSelectedAudioDevice;
        if (nVar != null && nVar != n.NONE) {
            return nVar;
        }
        if (!z11) {
            Set<n> set = this.audioDevices;
            n nVar2 = n.BLUETOOTH;
            if (set.contains(nVar2)) {
                return nVar2;
            }
        }
        Set<n> set2 = this.audioDevices;
        n nVar3 = n.WIRED_HEADSET;
        if (set2.contains(nVar3)) {
            return nVar3;
        }
        return this.audioDevices.contains(this.defaultAudioDevice) ? this.defaultAudioDevice : n.SPEAKER_PHONE;
    }

    @ReactMethod
    public void stop(String str) {
        if (this.audioManagerActivated) {
            stopRingback();
            if (!str.isEmpty() && startBusytone(str)) {
                Log.d("InCallManager", "play busytone before stop InCallManager");
                return;
            }
            Log.d("InCallManager", "stop() InCallManager");
            stopBusytone();
            stopEvents();
            setSpeakerphoneOn(false);
            setMicrophoneMute(false);
            this.forceSpeakerOn = 0;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zxcpoiu.incallmanager.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f58865a.lambda$stop$2();
                }
            });
            restoreOriginalAudioSetup();
            abandonAudioFocus();
            this.audioManagerActivated = false;
            this.wakeLockUtils.f();
        }
    }
}
