package com.zmxv.RNSound;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes8.dex */
public class RNSoundModule extends ReactContextBaseJavaModule implements AudioManager.OnAudioFocusChangeListener {
    static final Object NULL = null;
    String category;
    ReactApplicationContext context;
    Double focusedPlayerKey;
    Boolean mixWithOthers;
    Map<Double, MediaPlayer> playerPool;
    Boolean wasPlayingBeforeFocusChange;

    class a implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f58820a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f58821b;

        a(Callback callback) {
            this.f58821b = callback;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public synchronized void onPrepared(MediaPlayer mediaPlayer) {
            if (this.f58820a) {
                return;
            }
            this.f58820a = true;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("duration", ((double) mediaPlayer.getDuration()) * 0.001d);
            try {
                this.f58821b.invoke(RNSoundModule.NULL, writableMapCreateMap);
            } catch (RuntimeException e11) {
                Log.e("RNSoundModule", "Exception", e11);
            }
        }
    }

    class b implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f58823a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callback f58824b;

        b(Callback callback) {
            this.f58824b = callback;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public synchronized boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            if (this.f58823a) {
                return true;
            }
            this.f58823a = true;
            try {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("what", i11);
                writableMapCreateMap.putInt("extra", i12);
                this.f58824b.invoke(writableMapCreateMap, RNSoundModule.NULL);
            } catch (RuntimeException e11) {
                Log.e("RNSoundModule", "Exception", e11);
            }
            return true;
        }
    }

    class c implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f58826a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Double f58827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f58828c;

        c(Double d11, Callback callback) {
            this.f58827b = d11;
            this.f58828c = callback;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            if (!mediaPlayer.isLooping()) {
                RNSoundModule.this.setOnPlay(false, this.f58827b);
                if (this.f58826a) {
                    return;
                }
                this.f58826a = true;
                try {
                    this.f58828c.invoke(Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    class d implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f58830a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Double f58831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f58832c;

        d(Double d11, Callback callback) {
            this.f58831b = d11;
            this.f58832c = callback;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public synchronized boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            RNSoundModule.this.setOnPlay(false, this.f58831b);
            if (this.f58830a) {
                return true;
            }
            this.f58830a = true;
            try {
                this.f58832c.invoke(Boolean.TRUE);
            } catch (Exception unused) {
            }
            return true;
        }
    }

    public RNSoundModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.playerPool = new HashMap();
        this.mixWithOthers = Boolean.TRUE;
        this.wasPlayingBeforeFocusChange = Boolean.FALSE;
        this.context = reactApplicationContext;
        this.category = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPlay(boolean z11, Double d11) {
        ReactApplicationContext reactApplicationContext = this.context;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("isPlaying", z11);
        writableMapCreateMap.putDouble("playerKey", d11.doubleValue());
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onPlayChange", writableMapCreateMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    protected MediaPlayer createMediaPlayer(String str) {
        int identifier = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
        MediaPlayer mediaPlayer = new MediaPlayer();
        if (identifier != 0) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.context.getResources().openRawResourceFd(identifier);
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                return mediaPlayer;
            } catch (IOException e11) {
                Log.e("RNSoundModule", "Exception", e11);
                return null;
            }
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e12) {
                Log.e("RNSoundModule", "Exception", e12);
                return null;
            }
        }
        if (str.startsWith("asset:/")) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.context.getAssets().openFd(str.replace("asset:/", ""));
                mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                assetFileDescriptorOpenFd.close();
                return mediaPlayer;
            } catch (IOException e13) {
                Log.e("RNSoundModule", "Exception", e13);
                return null;
            }
        }
        if (str.startsWith("file:/")) {
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e14) {
                Log.e("RNSoundModule", "Exception", e14);
                return null;
            }
        }
        if (new File(str).exists()) {
            mediaPlayer.setAudioStreamType(3);
            Log.i("RNSoundModule", str);
            try {
                mediaPlayer.setDataSource(str);
                return mediaPlayer;
            } catch (IOException e15) {
                Log.e("RNSoundModule", "Exception", e15);
            }
        }
        return null;
    }

    @ReactMethod
    public void enable(Boolean bool) {
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("IsAndroid", Boolean.TRUE);
        return map;
    }

    @ReactMethod
    public void getCurrentTime(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer == null) {
            callback.invoke(-1, Boolean.FALSE);
        } else {
            callback.invoke(Double.valueOf(((double) mediaPlayer.getCurrentPosition()) * 0.001d), Boolean.valueOf(mediaPlayer.isPlaying()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSound";
    }

    @ReactMethod
    public void getSystemVolume(Callback callback) {
        try {
            AudioManager audioManager = (AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            callback.invoke(Float.valueOf(audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)));
        } catch (Exception e11) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("code", -1);
            writableMapCreateMap.putString("message", e11.getMessage());
            callback.invoke(writableMapCreateMap);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i11) {
        MediaPlayer mediaPlayer;
        if (this.mixWithOthers.booleanValue() || (mediaPlayer = this.playerPool.get(this.focusedPlayerKey)) == null) {
            return;
        }
        if (i11 > 0) {
            if (this.wasPlayingBeforeFocusChange.booleanValue()) {
                play(this.focusedPlayerKey, null);
                this.wasPlayingBeforeFocusChange = Boolean.FALSE;
                return;
            }
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(mediaPlayer.isPlaying());
        this.wasPlayingBeforeFocusChange = boolValueOf;
        if (boolValueOf.booleanValue()) {
            pause(this.focusedPlayerKey, null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Iterator<Map.Entry<Double, MediaPlayer>> it = this.playerPool.entrySet().iterator();
        while (it.hasNext()) {
            MediaPlayer value = it.next().getValue();
            if (value != null) {
                value.reset();
                value.release();
            }
            it.remove();
        }
    }

    @ReactMethod
    public void pause(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
        if (callback != null) {
            callback.invoke(new Object[0]);
        }
    }

    @ReactMethod
    public void play(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer == null) {
            setOnPlay(false, d11);
            if (callback != null) {
                callback.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (mediaPlayer.isPlaying()) {
            return;
        }
        if (!this.mixWithOthers.booleanValue()) {
            ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).requestAudioFocus(this, 3, 1);
            this.focusedPlayerKey = d11;
        }
        mediaPlayer.setOnCompletionListener(new c(d11, callback));
        mediaPlayer.setOnErrorListener(new d(d11, callback));
        mediaPlayer.start();
        setOnPlay(true, d11);
    }

    @ReactMethod
    public void prepare(String str, Double d11, ReadableMap readableMap, Callback callback) {
        Integer num;
        MediaPlayer mediaPlayerCreateMediaPlayer = createMediaPlayer(str);
        if (readableMap.hasKey("speed")) {
            mediaPlayerCreateMediaPlayer.setPlaybackParams(mediaPlayerCreateMediaPlayer.getPlaybackParams().setSpeed((float) readableMap.getDouble("speed")));
        }
        if (mediaPlayerCreateMediaPlayer == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("code", -1);
            writableMapCreateMap.putString("message", "resource not found");
            callback.invoke(writableMapCreateMap, NULL);
            return;
        }
        this.playerPool.put(d11, mediaPlayerCreateMediaPlayer);
        String str2 = this.category;
        if (str2 != null) {
            str2.getClass();
            switch (str2) {
                case "System":
                    num = 1;
                    break;
                case "Ring":
                    num = 2;
                    break;
                case "Alarm":
                    num = 4;
                    break;
                case "Voice":
                    num = 0;
                    break;
                case "Ambient":
                    num = 5;
                    break;
                case "Playback":
                    num = 3;
                    break;
                default:
                    Log.e("RNSoundModule", String.format("Unrecognised category %s", this.category));
                    num = null;
                    break;
            }
            if (num != null) {
                mediaPlayerCreateMediaPlayer.setAudioStreamType(num.intValue());
            }
        }
        mediaPlayerCreateMediaPlayer.setOnPreparedListener(new a(callback));
        mediaPlayerCreateMediaPlayer.setOnErrorListener(new b(callback));
        try {
            if (readableMap.hasKey("loadSync") && readableMap.getBoolean("loadSync")) {
                mediaPlayerCreateMediaPlayer.prepare();
            } else {
                mediaPlayerCreateMediaPlayer.prepareAsync();
            }
        } catch (Exception e11) {
            Log.e("RNSoundModule", "Exception", e11);
        }
    }

    @ReactMethod
    public void release(Double d11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            mediaPlayer.release();
            this.playerPool.remove(d11);
            if (this.mixWithOthers.booleanValue() || d11 != this.focusedPlayerKey) {
                return;
            }
            ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void reset(Double d11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
    }

    @ReactMethod
    public void setCategory(String str, Boolean bool) {
        this.category = str;
        this.mixWithOthers = bool;
    }

    @ReactMethod
    public void setCurrentTime(Double d11, Float f11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(Math.round(f11.floatValue() * 1000.0f));
        }
    }

    @ReactMethod
    public void setLooping(Double d11, Boolean bool) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setPitch(Double d11, Float f11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setPitch(f11.floatValue()));
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(Double d11, Boolean bool) {
        if (this.playerPool.get(d11) != null) {
            AudioManager audioManager = (AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (bool.booleanValue()) {
                audioManager.setMode(3);
            } else {
                audioManager.setMode(0);
            }
            audioManager.setSpeakerphoneOn(bool.booleanValue());
        }
    }

    @ReactMethod
    public void setSpeed(Double d11, Float f11) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f11.floatValue()));
        }
    }

    @ReactMethod
    public void setSystemVolume(Float f11) {
        AudioManager audioManager = (AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.setStreamVolume(3, Math.round(audioManager.getStreamMaxVolume(3) * f11.floatValue()), 0);
    }

    @ReactMethod
    public void setVolume(Double d11, Float f11, Float f12) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f11.floatValue(), f12.floatValue());
        }
    }

    @ReactMethod
    public void stop(Double d11, Callback callback) {
        MediaPlayer mediaPlayer = this.playerPool.get(d11);
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
        if (!this.mixWithOthers.booleanValue() && d11 == this.focusedPlayerKey) {
            ((AudioManager) this.context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).abandonAudioFocus(this);
        }
        callback.invoke(new Object[0]);
    }
}
