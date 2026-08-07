package s00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ls00/d;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReactContext;", "", "filePath", "Lcom/facebook/react/bridge/ReadableMap;", "options", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileUrl", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "c", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "a", "Lcom/facebook/react/bridge/ReactApplicationContext;", "b", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: s00.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls00/d$a;", "", "<init>", "()V", "", "path", "Ljava/io/File;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/io/File;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "filePath", "", "time", "", "headers", "Landroid/graphics/Bitmap;", "e", "(Landroid/content/Context;Ljava/lang/String;ILjava/util/Map;)Landroid/graphics/Bitmap;", "cacheDir", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Ljn0/h0;", "c", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File d(String path) {
            File file = new File(path);
            if (file.exists()) {
                return file;
            }
            try {
                file.mkdirs();
                new File(path, ".nomedia").createNewFile();
                return file;
            } catch (IOException e11) {
                e11.printStackTrace();
                return file;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap e(Context context, String filePath, int time, Map<String, String> headers) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (URLUtil.isFileUrl(filePath)) {
                try {
                    filePath = URLDecoder.decode(filePath, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
                String str = filePath;
                s.h(str);
                mediaMetadataRetriever.setDataSource(t.V(str, "file://", "", false, 4, null));
            } else {
                s.h(filePath);
                if (t.h0(filePath, "content://", false, 2, null)) {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(filePath));
                } else {
                    mediaMetadataRetriever.setDataSource(filePath, headers);
                }
            }
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(time * 1000, 2);
            try {
                mediaMetadataRetriever.release();
                if (frameAtTime != null) {
                    return frameAtTime;
                }
                throw new IllegalStateException("File doesn't exist or not supported");
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0016  */
        public final void c(String cacheDir, Promise promise, ReactApplicationContext reactContext) {
            File[] fileArrListFiles;
            s.k(promise, "promise");
            s.k(reactContext, "reactContext");
            if (cacheDir == null) {
                cacheDir = "/thumbnails";
            } else {
                if (cacheDir.length() <= 0) {
                    cacheDir = null;
                }
                if (cacheDir == null) {
                    cacheDir = "/thumbnails";
                }
            }
            File fileD = d(reactContext.getApplicationContext().getCacheDir().getAbsolutePath() + cacheDir);
            if (fileD != null && (fileArrListFiles = fileD.listFiles()) != null) {
                Iterator itA = p013kotlin.jvm.internal.c.a(fileArrListFiles);
                while (itA.hasNext()) {
                    File file = (File) itA.next();
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }
            promise.resolve("done");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.reactnativecompressor.Utils.CreateVideoThumbnailClass$create$1", f = "createVideoThumbnail.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109305n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f109307p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ReadableMap f109308q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Promise f109309r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, ReadableMap readableMap, Promise promise, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f109307p = str;
            this.f109308q = readableMap;
            this.f109309r = promise;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new b(this.f109307p, this.f109308q, this.f109309r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109305n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    d dVar = d.this;
                    ReactApplicationContext reactApplicationContext = dVar.reactContext;
                    String str = this.f109307p;
                    ReadableMap readableMap = this.f109308q;
                    this.f109305n = 1;
                    obj = dVar.d(reactApplicationContext, str, readableMap, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                this.f109309r.resolve((ReadableMap) obj);
            } catch (Exception e11) {
                this.f109309r.reject("CreateVideoThumbnail_ERROR", e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativecompressor.Utils.CreateVideoThumbnailClass$processDataInBackground$2", f = "createVideoThumbnail.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super WritableMap>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109310n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ReactContext f109311o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ReadableMap f109312p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f109313q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, ReadableMap readableMap, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109311o = reactContext;
            this.f109312p = readableMap;
            this.f109313q = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f109311o, this.f109312p, this.f109313q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            HashMap<String, Object> map;
            StringBuilder sb2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f109310n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            WeakReference weakReference = new WeakReference(this.f109311o.getApplicationContext());
            String string = this.f109312p.hasKey("cacheName") ? this.f109312p.getString("cacheName") : "";
            Object obj2 = weakReference.get();
            s.h(obj2);
            String str = ((Context) obj2).getApplicationContext().getCacheDir().getAbsolutePath() + "/thumbnails";
            Companion companion = d.INSTANCE;
            File fileD = companion.d(str);
            if (!TextUtils.isEmpty(string)) {
                File file = new File(str, string + ".jpeg");
                if (file.exists()) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("path", "file://" + file.getAbsolutePath());
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                    writableMapCreateMap.putDouble("size", (double) bitmapDecodeFile.getByteCount());
                    writableMapCreateMap.putString("mime", "image/jpeg");
                    writableMapCreateMap.putDouble(Snapshot.WIDTH, (double) bitmapDecodeFile.getWidth());
                    writableMapCreateMap.putDouble(Snapshot.HEIGHT, (double) bitmapDecodeFile.getHeight());
                    return writableMapCreateMap;
                }
            }
            if (this.f109312p.hasKey("headers")) {
                ReadableMap map2 = this.f109312p.getMap("headers");
                s.h(map2);
                map = map2.toHashMap();
                s.i(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            } else {
                map = new HashMap<>();
            }
            if (TextUtils.isEmpty(string)) {
                UUID uuidRandomUUID = UUID.randomUUID();
                sb2 = new StringBuilder();
                sb2.append("thumb-");
                sb2.append(uuidRandomUUID);
            } else {
                sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(".");
                sb2.append("jpeg");
            }
            String string2 = sb2.toString();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    File file2 = new File(fileD, string2);
                    Bitmap bitmapE = companion.e((Context) weakReference.get(), this.f109313q, 0, map);
                    file2.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    try {
                        bitmapE.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream2);
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putString("path", "file://" + file2.getAbsolutePath());
                        writableMapCreateMap2.putDouble("size", (double) bitmapE.getByteCount());
                        writableMapCreateMap2.putString("mime", "image/jpeg");
                        writableMapCreateMap2.putDouble(Snapshot.WIDTH, (double) bitmapE.getWidth());
                        writableMapCreateMap2.putDouble(Snapshot.HEIGHT, (double) bitmapE.getHeight());
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                        return writableMapCreateMap2;
                    } catch (Exception e11) {
                        throw e11;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    throw e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WritableMap> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public d(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(ReactContext reactContext, String str, ReadableMap readableMap, Continuation<? super ReadableMap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(reactContext, readableMap, str, null), continuation);
    }

    @ReactMethod
    public final void c(String fileUrl, ReadableMap options, Promise promise) {
        s.k(fileUrl, "fileUrl");
        s.k(options, "options");
        s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(fileUrl, options, promise, null), 3, null);
    }
}
