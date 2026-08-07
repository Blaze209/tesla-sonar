package com.oney.WebRTCModule;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.core.util.Consumer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes6.dex */
class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f46015g = WebRTCModule.TAG;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f46016h = (int) (Math.random() * 32767.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CameraEnumerator f46017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactApplicationContext f46018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, e> f46019c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WebRTCModule f46020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Promise f46021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f46022f;

    class a extends BaseActivityEventListener {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Activity activity) {
            MediaProjectionService.b(activity);
            o.this.m();
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(final Activity activity, int i11, int i12, Intent intent) {
            super.onActivityResult(activity, i11, i12, intent);
            if (i11 == o.f46016h) {
                if (i12 != -1) {
                    o.this.f46021e.reject("DOMException", "NotAllowedError");
                    o.this.f46021e = null;
                } else {
                    o.this.f46022f = intent;
                    q0.a(new Runnable() { // from class: com.oney.WebRTCModule.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f46005a.b(activity);
                        }
                    });
                }
            }
        }
    }

    class b implements Consumer<Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f46024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.oney.WebRTCModule.a f46025b;

        b(Promise promise, com.oney.WebRTCModule.a aVar) {
            this.f46024a = promise;
            this.f46025b = aVar;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Exception exc) {
            if (exc != null) {
                this.f46024a.reject(exc);
            } else {
                this.f46024a.resolve(this.f46025b.g());
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f46027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaProjectionManager f46028b;

        c(Activity activity, MediaProjectionManager mediaProjectionManager) {
            this.f46027a = activity;
            this.f46028b = mediaProjectionManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46027a.startActivityForResult(this.f46028b.createScreenCaptureIntent(), o.f46016h);
        }
    }

    public interface d<T, U> {
        void accept(T t11, U u11);
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource f46030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaStreamTrack f46031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.oney.WebRTCModule.a f46032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SurfaceTextureHelper f46033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f46034e = false;

        public e(MediaStreamTrack mediaStreamTrack, MediaSource mediaSource, com.oney.WebRTCModule.a aVar, SurfaceTextureHelper surfaceTextureHelper) {
            this.f46031b = mediaStreamTrack;
            this.f46030a = mediaSource;
            this.f46032c = aVar;
            this.f46033d = surfaceTextureHelper;
        }

        public void b() {
            if (this.f46034e) {
                return;
            }
            com.oney.WebRTCModule.a aVar = this.f46032c;
            if (aVar != null && aVar.l()) {
                this.f46032c.c();
            }
            SurfaceTextureHelper surfaceTextureHelper = this.f46033d;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
                this.f46033d.dispose();
            }
            this.f46030a.dispose();
            this.f46031b.dispose();
            this.f46034e = true;
        }
    }

    o(WebRTCModule webRTCModule, ReactApplicationContext reactApplicationContext) {
        this.f46020d = webRTCModule;
        this.f46018b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new a());
    }

    public static /* synthetic */ void a(Callback callback, String str, ArrayList arrayList) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap((WritableMap) it.next());
        }
        callback.invoke(str, writableArrayCreateArray);
    }

    public static /* synthetic */ b00.c c(Object obj) {
        b00.c cVarA = b00.a.a((String) obj);
        if (cVarA == null) {
            Log.e(f46015g, "no videoFrameProcessor associated with this name: " + obj);
        }
        return cVarA;
    }

    public static /* synthetic */ boolean d(Object obj) {
        return obj instanceof String;
    }

    private void k(MediaConstraints mediaConstraints) {
        ArrayList arrayList = new ArrayList(mediaConstraints.mandatory.size());
        for (MediaConstraints.KeyValuePair keyValuePair : mediaConstraints.mandatory) {
            if (keyValuePair.getValue() != null) {
                arrayList.add(keyValuePair);
            } else {
                Log.d(f46015g, String.format("constraint %s is null, ignoring it", keyValuePair.getKey()));
            }
        }
        mediaConstraints.mandatory.clear();
        mediaConstraints.mandatory.addAll(arrayList);
    }

    private AudioTrack l(ReadableMap readableMap) {
        ReadableMap map = readableMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND);
        Log.d(f46015g, "getUserMedia(audio): " + map);
        String string = UUID.randomUUID().toString();
        WebRTCModule webRTCModule = this.f46020d;
        PeerConnectionFactory peerConnectionFactory = webRTCModule.mFactory;
        MediaConstraints mediaConstraintsConstraintsForOptions = webRTCModule.constraintsForOptions(map);
        k(mediaConstraintsConstraintsForOptions);
        AudioSource audioSourceCreateAudioSource = peerConnectionFactory.createAudioSource(mediaConstraintsConstraintsForOptions);
        AudioTrack audioTrackCreateAudioTrack = peerConnectionFactory.createAudioTrack(string, audioSourceCreateAudioSource);
        this.f46019c.put(string, new e(audioTrackCreateAudioTrack, audioSourceCreateAudioSource, null, null));
        return audioTrackCreateAudioTrack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        VideoTrack videoTrackN = n();
        if (videoTrackN == null) {
            this.f46021e.reject(new RuntimeException("ScreenTrack is null."));
        } else {
            o(new MediaStreamTrack[]{videoTrackN}, new d() { // from class: com.oney.WebRTCModule.m
                @Override // com.oney.WebRTCModule.o.d
                public final void accept(Object obj, Object obj2) {
                    this.f45997a.w((String) obj, (ArrayList) obj2);
                }
            });
        }
        this.f46022f = null;
        this.f46021e = null;
    }

    private VideoTrack n() {
        DisplayMetrics displayMetricsA = g.a(this.f46018b.getCurrentActivity());
        return p(new i0(this.f46018b.getCurrentActivity(), displayMetricsA.widthPixels, displayMetricsA.heightPixels, this.f46022f));
    }

    private CameraEnumerator s() {
        if (this.f46017a == null) {
            if (Camera2Enumerator.isSupported(this.f46018b)) {
                Log.d(f46015g, "Creating camera enumerator using the Camera2 API");
                this.f46017a = new Camera2Enumerator(this.f46018b);
            } else {
                Log.d(f46015g, "Creating camera enumerator using the Camera1 API");
                this.f46017a = new Camera1Enumerator(false);
            }
        }
        return this.f46017a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(String str, ArrayList arrayList) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("streamId", str);
        if (arrayList.size() == 0) {
            this.f46021e.reject(new RuntimeException("No ScreenTrackInfo found."));
        } else {
            writableMapCreateMap.putMap("track", (ReadableMap) arrayList.get(0));
            this.f46021e.resolve(writableMapCreateMap);
        }
    }

    void j(String str, ReadableMap readableMap, Promise promise) {
        e eVar = this.f46019c.get(str);
        if (eVar == null || eVar.f46032c == null) {
            promise.reject(new Exception("Camera track not found!"));
        } else {
            com.oney.WebRTCModule.a aVar = eVar.f46032c;
            aVar.a(readableMap, new b(promise, aVar));
        }
    }

    void o(MediaStreamTrack[] mediaStreamTrackArr, d<String, ArrayList<WritableMap>> dVar) {
        String string = UUID.randomUUID().toString();
        MediaStream mediaStreamCreateLocalMediaStream = this.f46020d.mFactory.createLocalMediaStream(string);
        ArrayList<WritableMap> arrayList = new ArrayList<>();
        for (MediaStreamTrack mediaStreamTrack : mediaStreamTrackArr) {
            if (mediaStreamTrack != null) {
                boolean z11 = mediaStreamTrack instanceof AudioTrack;
                if (z11) {
                    mediaStreamCreateLocalMediaStream.addTrack((AudioTrack) mediaStreamTrack);
                } else {
                    mediaStreamCreateLocalMediaStream.addTrack((VideoTrack) mediaStreamTrack);
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                String strId = mediaStreamTrack.id();
                writableMapCreateMap.putBoolean("enabled", mediaStreamTrack.enabled());
                writableMapCreateMap.putString("id", strId);
                writableMapCreateMap.putString("kind", mediaStreamTrack.kind());
                writableMapCreateMap.putString("readyState", "live");
                writableMapCreateMap.putBoolean("remote", false);
                if (mediaStreamTrack instanceof VideoTrack) {
                    writableMapCreateMap.putMap("settings", this.f46019c.get(strId).f46032c.g());
                }
                if (z11) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("deviceId", "audio-1");
                    writableMapCreateMap2.putString("groupId", "");
                    writableMapCreateMap.putMap("settings", writableMapCreateMap2);
                }
                arrayList.add(writableMapCreateMap);
            }
        }
        Log.d(f46015g, "MediaStream id: " + string);
        this.f46020d.localStreams.put(string, mediaStreamCreateLocalMediaStream);
        dVar.accept(string, arrayList);
    }

    VideoTrack p(com.oney.WebRTCModule.a aVar) {
        aVar.i();
        VideoCapturer videoCapturer = aVar.f45836g;
        if (videoCapturer == null) {
            return null;
        }
        PeerConnectionFactory peerConnectionFactory = this.f46020d.mFactory;
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("CaptureThread", h.b());
        if (surfaceTextureHelperCreate == null) {
            Log.d(f46015g, "Error creating SurfaceTextureHelper");
            return null;
        }
        String string = UUID.randomUUID().toString();
        aVar.j(new r0(this.f46020d, string));
        VideoSource videoSourceCreateVideoSource = peerConnectionFactory.createVideoSource(videoCapturer.isScreencast());
        videoCapturer.initialize(surfaceTextureHelperCreate, this.f46018b, videoSourceCreateVideoSource.getCapturerObserver());
        VideoTrack videoTrackCreateVideoTrack = peerConnectionFactory.createVideoTrack(string, videoSourceCreateVideoSource);
        videoTrackCreateVideoTrack.setEnabled(true);
        this.f46019c.put(string, new e(videoTrackCreateVideoTrack, videoSourceCreateVideoSource, aVar, surfaceTextureHelperCreate));
        aVar.k();
        return videoTrackCreateVideoTrack;
    }

    void q(String str) {
        e eVarRemove = this.f46019c.remove(str);
        if (eVarRemove != null) {
            eVarRemove.b();
        }
    }

    ReadableArray r() {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        String[] deviceNames = s().getDeviceNames();
        for (int i11 = 0; i11 < deviceNames.length; i11++) {
            String str = deviceNames[i11];
            try {
                boolean zIsFrontFacing = s().isFrontFacing(str);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("facing", zIsFrontFacing ? "front" : AnalyticsAttribute.Environment);
                writableMapCreateMap.putString("deviceId", "" + i11);
                writableMapCreateMap.putString("groupId", "");
                writableMapCreateMap.putString(AnnotatedPrivateKey.LABEL, str);
                writableMapCreateMap.putString("kind", "videoinput");
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            } catch (Exception unused) {
                Log.e(f46015g, "Failed to check the facing mode of camera");
            }
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("deviceId", "audio-1");
        writableMapCreateMap2.putString("groupId", "");
        writableMapCreateMap2.putString(AnnotatedPrivateKey.LABEL, "Audio");
        writableMapCreateMap2.putString("kind", "audioinput");
        writableArrayCreateArray.pushMap(writableMapCreateMap2);
        return writableArrayCreateArray;
    }

    void t(Promise promise) {
        if (this.f46021e != null) {
            promise.reject(new RuntimeException("Another operation is pending."));
            return;
        }
        Activity currentActivity = this.f46018b.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(new RuntimeException("No current Activity."));
            return;
        }
        this.f46021e = promise;
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) currentActivity.getApplication().getSystemService("media_projection");
        if (mediaProjectionManager != null) {
            UiThreadUtil.runOnUiThread(new c(currentActivity, mediaProjectionManager));
        } else {
            promise.reject(new RuntimeException("MediaProjectionManager is null."));
        }
    }

    MediaStreamTrack u(String str) {
        e eVar = this.f46019c.get(str);
        if (eVar == null) {
            return null;
        }
        return eVar.f46031b;
    }

    void v(ReadableMap readableMap, final Callback callback, Callback callback2) {
        VideoTrack videoTrackP = null;
        AudioTrack audioTrackL = readableMap.hasKey(MediaStreamTrack.AUDIO_TRACK_KIND) ? l(readableMap) : null;
        if (readableMap.hasKey(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            ReadableMap map = readableMap.getMap(MediaStreamTrack.VIDEO_TRACK_KIND);
            Log.d(f46015g, "getUserMedia(video): " + map);
            videoTrackP = p(new com.oney.WebRTCModule.d(this.f46018b.getCurrentActivity(), s(), map));
        }
        if (audioTrackL == null && videoTrackP == null) {
            callback2.invoke("DOMException", "AbortError");
        } else {
            o(new MediaStreamTrack[]{audioTrackL, videoTrackP}, new d() { // from class: com.oney.WebRTCModule.l
                @Override // com.oney.WebRTCModule.o.d
                public final void accept(Object obj, Object obj2) {
                    o.a(callback, (String) obj, (ArrayList) obj2);
                }
            });
        }
    }

    void x(String str, boolean z11) {
        com.oney.WebRTCModule.a aVar;
        e eVar = this.f46019c.get(str);
        if (eVar == null || (aVar = eVar.f46032c) == null) {
            return;
        }
        if (z11) {
            aVar.k();
        } else {
            aVar.l();
        }
    }

    void y(String str, ReadableArray readableArray) {
        e eVar = this.f46019c.get(str);
        if (eVar == null || !(eVar.f46032c instanceof com.oney.WebRTCModule.d)) {
            return;
        }
        VideoSource videoSource = (VideoSource) eVar.f46030a;
        SurfaceTextureHelper surfaceTextureHelper = eVar.f46033d;
        if (readableArray != null) {
            videoSource.setVideoProcessor(new b00.b((List) readableArray.toArrayList().stream().filter(new Predicate() { // from class: com.oney.WebRTCModule.i
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return o.d(obj);
                }
            }).map(new Function() { // from class: com.oney.WebRTCModule.j
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return o.c(obj);
                }
            }).filter(new Predicate() { // from class: com.oney.WebRTCModule.k
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull((b00.c) obj);
                }
            }).collect(Collectors.toList()), surfaceTextureHelper));
        } else {
            videoSource.setVideoProcessor(null);
        }
    }
}
