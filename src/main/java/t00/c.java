package t00;

import android.annotation.SuppressLint;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import s00.f;
import s00.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 ,2\u00020\u0001:\u0002\u0015\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012¨\u0006-"}, d2 = {"Lt00/c;", "", "<init>", "()V", "Lt00/c$c;", "a", "Lt00/c$c;", "n", "()Lt00/c$c;", "t", "(Lt00/c$c;)V", "compressionMethod", "", "b", Gender.FEMALE, "m", "()F", "s", "(F)V", "bitrate", "", "c", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "x", "(Ljava/lang/String;)V", "uuid", DateTokenConverter.CONVERTER_KEY, "o", "u", "maxSize", "", "e", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "w", "(Ljava/lang/Integer;)V", "progressDivider", "f", "p", "v", "minimumFileSizeForCompress", "g", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ReactApplicationContext f112010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f112011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f112012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Runnable f112013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static PowerManager f112014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static PowerManager.WakeLock f112015m;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float bitrate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float minimumFileSizeForCompress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final LifecycleEventListener f112016n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private EnumC2388c compressionMethod = EnumC2388c.auto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String uuid = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float maxSize = 640.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer progressDivider = 0;

    /* JADX INFO: renamed from: t00.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010%\u001a\b\u0018\u00010$R\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lt00/c$b;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "e", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "g", "map", "Lt00/c;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReadableMap;)Lt00/c;", "fileUrl", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "c", "(Ljava/lang/String;Lt00/c;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "b", "_reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "backgroundId", "Ljava/lang/String;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Landroid/os/PowerManager;", "powerManager", "Landroid/os/PowerManager;", "Landroid/os/PowerManager$WakeLock;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Lcom/facebook/react/bridge/LifecycleEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/bridge/LifecycleEventListener;", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(String fileUrl, c options, Promise promise, ReactApplicationContext reactContext) {
            t00.a aVar = t00.a.f112008a;
            s.h(options);
            s.h(promise);
            aVar.a(fileUrl, options, promise, reactContext);
        }

        public final void c(String fileUrl, c options, Promise promise, ReactApplicationContext reactContext) {
            Promise promise2;
            Exception exc;
            int i11;
            int i12;
            s.k(options, "options");
            s.k(promise, "promise");
            try {
                String path = Uri.parse(fileUrl).getPath();
                s.h(reactContext);
                String strC = q.c("mp4", reactContext);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(path);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
                s.h(strExtractMetadata);
                int i13 = Integer.parseInt(strExtractMetadata);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                s.h(strExtractMetadata2);
                int i14 = Integer.parseInt(strExtractMetadata2);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
                s.h(strExtractMetadata3);
                int i15 = Integer.parseInt(strExtractMetadata3);
                boolean z11 = i13 > i14;
                int maxSize = (int) options.getMaxSize();
                if (z11 && i13 > maxSize) {
                    i12 = (int) ((maxSize / i13) * i14);
                    i11 = maxSize;
                } else if (i14 > maxSize) {
                    i11 = (int) ((maxSize / i14) * i13);
                    i12 = maxSize;
                } else {
                    if (options.getBitrate() == BitmapDescriptorFactory.HUE_RED) {
                        try {
                            options.s((int) (((double) i15) * 0.8d));
                        } catch (Exception e11) {
                            exc = e11;
                            promise2 = promise;
                            promise2.reject(exc);
                        }
                    }
                    i11 = i13;
                    i12 = i14;
                }
                float bitrate = options.getBitrate() > BitmapDescriptorFactory.HUE_RED ? options.getBitrate() : (float) (((double) (i11 * i12)) * 1.5d);
                s.h(path);
                String uuid = options.getUuid();
                s.h(uuid);
                Integer progressDivider = options.getProgressDivider();
                s.h(progressDivider);
                promise2 = promise;
                try {
                    q.b(path, strC, i12, i11, bitrate, uuid, progressDivider.intValue(), promise2, reactContext);
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    promise2.reject(exc);
                }
            } catch (Exception e13) {
                e = e13;
                promise2 = promise;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final c d(ReadableMap map) {
            s.k(map, "map");
            c cVar = new c();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                switch (strNextKey.hashCode()) {
                    case -102270099:
                        if (strNextKey.equals("bitrate")) {
                            cVar.s((float) map.getDouble(strNextKey));
                        }
                        break;
                    case 3601339:
                        if (strNextKey.equals("uuid")) {
                            cVar.x(map.getString(strNextKey));
                        }
                        break;
                    case 291107303:
                        if (strNextKey.equals("compressionMethod")) {
                            String string = map.getString(strNextKey);
                            s.h(string);
                            cVar.t(EnumC2388c.valueOf(string));
                        }
                        break;
                    case 583437356:
                        if (strNextKey.equals("progressDivider")) {
                            cVar.w(Integer.valueOf(map.getInt(strNextKey)));
                        }
                        break;
                    case 844081029:
                        if (strNextKey.equals("maxSize")) {
                            cVar.u((float) map.getDouble(strNextKey));
                        }
                        break;
                    case 1180564608:
                        if (strNextKey.equals("minimumFileSizeForCompress")) {
                            cVar.v((float) map.getDouble(strNextKey));
                        }
                        break;
                }
            }
            return cVar;
        }

        @SuppressLint({"InvalidWakeLockTag"})
        public final String e(ReadableMap options, ReactApplicationContext reactContext) {
            s.k(reactContext, "reactContext");
            c.f112010h = reactContext;
            c.f112011i = UUID.randomUUID().toString();
            Object systemService = reactContext.getSystemService("power");
            s.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            c.f112014l = (PowerManager) systemService;
            PowerManager powerManager = c.f112014l;
            s.h(powerManager);
            c.f112015m = powerManager.newWakeLock(1, "bg_wakelock");
            reactContext.addLifecycleEventListener(c.f112016n);
            PowerManager.WakeLock wakeLock = c.f112015m;
            s.h(wakeLock);
            if (!wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = c.f112015m;
                s.h(wakeLock2);
                wakeLock2.acquire();
            }
            c.f112012j = new Handler();
            c.f112013k = new Runnable() { // from class: t00.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.Companion.f();
                }
            };
            Handler handler = c.f112012j;
            s.h(handler);
            Runnable runnable = c.f112013k;
            s.h(runnable);
            handler.post(runnable);
            return "";
        }

        public final String g(ReadableMap options, ReactApplicationContext reactContext) {
            PowerManager.WakeLock wakeLock = c.f112015m;
            s.h(wakeLock);
            if (wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = c.f112015m;
                s.h(wakeLock2);
                wakeLock2.release();
            }
            if (c.f112012j != null) {
                Handler handler = c.f112012j;
                s.h(handler);
                Runnable runnable = c.f112013k;
                s.h(runnable);
                handler.removeCallbacks(runnable);
            }
            c.f112011i = "";
            return "";
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f() {
        }
    }

    /* JADX INFO: renamed from: t00.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lt00/c$c;", "", "<init>", "(Ljava/lang/String;I)V", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "manual", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC2388c {
        auto,
        manual;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<EnumC2388c> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC2388c getCompressionMethod() {
        return this.compressionMethod;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getMinimumFileSizeForCompress() {
        return this.minimumFileSizeForCompress;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getProgressDivider() {
        return this.progressDivider;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final void s(float f11) {
        this.bitrate = f11;
    }

    public final void t(EnumC2388c enumC2388c) {
        s.k(enumC2388c, "<set-?>");
        this.compressionMethod = enumC2388c;
    }

    public final void u(float f11) {
        this.maxSize = f11;
    }

    public final void v(float f11) {
        this.minimumFileSizeForCompress = f11;
    }

    public final void w(Integer num) {
        this.progressDivider = num;
    }

    public final void x(String str) {
        this.uuid = str;
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"t00/c$a", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Ljn0/h0;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements LifecycleEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            PowerManager.WakeLock wakeLock = c.f112015m;
            s.h(wakeLock);
            if (wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = c.f112015m;
                s.h(wakeLock2);
                wakeLock2.release();
                f.INSTANCE.a(c.f112011i);
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }
    }
}
