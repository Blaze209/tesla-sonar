package com.tesla.TeslaV4.reactnative.module;

import android.graphics.Bitmap;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/AndroidVideoThumbnailWorkaroundModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "videoPath", "Ljava/io/File;", "saveThumbnailToCache", "(Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getName", "()Ljava/lang/String;", "", "timeStamp", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "extractFrame", "(Ljava/lang/String;ILcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidVideoThumbnailWorkaroundModule extends ReactContextBaseJavaModule {
    private static final String TAG = "AndroidVideoThumbnailWorkaroundModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("ReactNative").p(TAG);
    private final ReactApplicationContext reactContext;
    private final CoroutineScope scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.AndroidVideoThumbnailWorkaroundModule$extractFrame$1", f = "AndroidVideoThumbnailWorkaroundModule.kt", i = {1}, l = {34, 45}, m = "invokeSuspend", n = {"frame"}, s = {"L$0"})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f55590n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f55591o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Promise f55593q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f55594r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f55595s;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.AndroidVideoThumbnailWorkaroundModule$extractFrame$1$frames$1", f = "AndroidVideoThumbnailWorkaroundModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super List<? extends Bitmap>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f55596n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ od0.g f55597o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f55598p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f55599q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(od0.g gVar, String str, int i11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f55597o = gVar;
                this.f55598p = str;
                this.f55599q = i11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f55597o, this.f55598p, this.f55599q, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Bitmap>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<Bitmap>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f55596n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return this.f55597o.a(this.f55598p, this.f55599q, true);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Bitmap>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Promise promise, String str, int i11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f55593q = promise;
            this.f55594r = str;
            this.f55595s = i11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return AndroidVideoThumbnailWorkaroundModule.this.new b(this.f55593q, this.f55594r, this.f55595s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55591o;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    od0.g gVar = new od0.g(AndroidVideoThumbnailWorkaroundModule.this.reactContext);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(gVar, this.f55594r, this.f55595s, null);
                    this.f55591o = 1;
                    obj = BuildersKt.withContext(io2, aVar, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    jn0.t.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) this.f55590n;
                    jn0.t.b(obj);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("path", "file://" + ((File) obj).getAbsolutePath());
                writableNativeMap.putInt(Snapshot.WIDTH, bitmap.getWidth());
                writableNativeMap.putInt(Snapshot.HEIGHT, bitmap.getHeight());
                writableNativeMap.putString("mime", ClipboardModule.MIMETYPE_JPEG);
                this.f55593q.resolve(writableNativeMap);
                return jn0.h0.f84049a;
                List list = (List) obj;
                if (list.isEmpty()) {
                    this.f55593q.reject("EXTRACTION_FAILED", "Failed to extract frame from video");
                    return jn0.h0.f84049a;
                }
                Bitmap bitmap2 = (Bitmap) list.get(0);
                AndroidVideoThumbnailWorkaroundModule androidVideoThumbnailWorkaroundModule = AndroidVideoThumbnailWorkaroundModule.this;
                String str = this.f55594r;
                this.f55590n = bitmap2;
                this.f55591o = 2;
                Object objSaveThumbnailToCache = androidVideoThumbnailWorkaroundModule.saveThumbnailToCache(bitmap2, str, this);
                if (objSaveThumbnailToCache != coroutine_suspended) {
                    bitmap = bitmap2;
                    obj = objSaveThumbnailToCache;
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    writableNativeMap2.putString("path", "file://" + ((File) obj).getAbsolutePath());
                    writableNativeMap2.putInt(Snapshot.WIDTH, bitmap.getWidth());
                    writableNativeMap2.putInt(Snapshot.HEIGHT, bitmap.getHeight());
                    writableNativeMap2.putString("mime", ClipboardModule.MIMETYPE_JPEG);
                    this.f55593q.resolve(writableNativeMap2);
                    return jn0.h0.f84049a;
                }
                return coroutine_suspended;
            } catch (Exception e11) {
                AndroidVideoThumbnailWorkaroundModule.logger.d("Error extracting frame: " + e11.getMessage(), e11);
                this.f55593q.reject("EXTRACTION_ERROR", e11.getMessage(), e11);
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.tesla.TeslaV4.reactnative.module.AndroidVideoThumbnailWorkaroundModule$saveThumbnailToCache$2", f = "AndroidVideoThumbnailWorkaroundModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super File>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55600n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f55602p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Bitmap f55603q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Bitmap bitmap, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f55602p = str;
            this.f55603q = bitmap;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return AndroidVideoThumbnailWorkaroundModule.this.new c(this.f55602p, this.f55603q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f55600n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            File file = new File(AndroidVideoThumbnailWorkaroundModule.this.reactContext.getCacheDir(), "thumbnails");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "thumb_" + sn0.h.D(new File(this.f55602p)) + "_" + System.currentTimeMillis() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                this.f55603q.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                sn0.b.a(fileOutputStream, null);
                AndroidVideoThumbnailWorkaroundModule.logger.a("Saved thumbnail to: " + file2.getAbsolutePath());
                return file2;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidVideoThumbnailWorkaroundModule(ReactApplicationContext reactContext) {
        super(reactContext);
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveThumbnailToCache(Bitmap bitmap, String str, Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(str, bitmap, null), continuation);
    }

    @ReactMethod
    public final void extractFrame(String videoPath, int timeStamp, Promise promise) {
        p013kotlin.jvm.internal.s.k(videoPath, "videoPath");
        p013kotlin.jvm.internal.s.k(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new b(promise, videoPath, timeStamp, null), 3, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }
}
