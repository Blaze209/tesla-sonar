package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pm.t;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Lpm/t;", "imagePipeline", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lpm/t;Lcom/facebook/react/views/image/f;)V", "", "requestId", "Lcom/facebook/datasource/c;", "Ljava/lang/Void;", "request", "Ljn0/h0;", "registerRequest", "(ILcom/facebook/datasource/c;)V", "removeRequest", "(I)Lcom/facebook/datasource/c;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Lpm/t;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/f;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Lpm/t;", "setImagePipeline", "(Lpm/t;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private t _imagePipeline;
    private final Object callerContext;
    private f callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<com.facebook.datasource.c<Void>> enqueuedRequests;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/facebook/react/modules/image/ImageLoaderModule$b", "Lcom/facebook/datasource/b;", "Ltk/a;", "Lum/e;", "Lcom/facebook/datasource/c;", "dataSource", "Ljn0/h0;", "onNewResultImpl", "(Lcom/facebook/datasource/c;)V", "onFailureImpl", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends com.facebook.datasource.b<tk.a<um.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f22801a;

        b(Promise promise) {
            this.f22801a = promise;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<tk.a<um.e>> dataSource) {
            s.k(dataSource, "dataSource");
            this.f22801a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.b());
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<tk.a<um.e>> dataSource) {
            s.k(dataSource, "dataSource");
            if (dataSource.isFinished()) {
                tk.a<um.e> result = dataSource.getResult();
                try {
                    if (result == null) {
                        this.f22801a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    um.e eVarH = result.H();
                    s.j(eVarH, "get(...)");
                    um.e eVar = eVarH;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    s.j(writableMapCreateMap, "createMap(...)");
                    writableMapCreateMap.putInt(Snapshot.WIDTH, eVar.getWidth());
                    writableMapCreateMap.putInt(Snapshot.HEIGHT, eVar.getHeight());
                    this.f22801a.resolve(writableMapCreateMap);
                } catch (Exception e11) {
                    this.f22801a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e11);
                } finally {
                    tk.a.C(result);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"com/facebook/react/modules/image/ImageLoaderModule$c", "Lcom/facebook/datasource/b;", "Ltk/a;", "Lum/e;", "Lcom/facebook/datasource/c;", "dataSource", "Ljn0/h0;", "onNewResultImpl", "(Lcom/facebook/datasource/c;)V", "onFailureImpl", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.facebook.datasource.b<tk.a<um.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f22802a;

        c(Promise promise) {
            this.f22802a = promise;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<tk.a<um.e>> dataSource) {
            s.k(dataSource, "dataSource");
            this.f22802a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.b());
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<tk.a<um.e>> dataSource) {
            s.k(dataSource, "dataSource");
            if (dataSource.isFinished()) {
                tk.a<um.e> result = dataSource.getResult();
                try {
                    if (result == null) {
                        this.f22802a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    um.e eVarH = result.H();
                    s.j(eVarH, "get(...)");
                    um.e eVar = eVarH;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    s.j(writableMapCreateMap, "createMap(...)");
                    writableMapCreateMap.putInt(Snapshot.WIDTH, eVar.getWidth());
                    writableMapCreateMap.putInt(Snapshot.HEIGHT, eVar.getHeight());
                    this.f22802a.resolve(writableMapCreateMap);
                } catch (Exception e11) {
                    this.f22802a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e11);
                } finally {
                    tk.a.C(result);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"com/facebook/react/modules/image/ImageLoaderModule$d", "Lcom/facebook/datasource/b;", "Ljava/lang/Void;", "Lcom/facebook/datasource/c;", "dataSource", "Ljn0/h0;", "onNewResultImpl", "(Lcom/facebook/datasource/c;)V", "onFailureImpl", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends com.facebook.datasource.b<Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f22804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f22805c;

        d(int i11, Promise promise) {
            this.f22804b = i11;
            this.f22805c = promise;
        }

        @Override // com.facebook.datasource.b
        protected void onFailureImpl(com.facebook.datasource.c<Void> dataSource) {
            s.k(dataSource, "dataSource");
            try {
                ImageLoaderModule.this.removeRequest(this.f22804b);
                this.f22805c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, dataSource.b());
            } finally {
                dataSource.close();
            }
        }

        @Override // com.facebook.datasource.b
        protected void onNewResultImpl(com.facebook.datasource.c<Void> dataSource) {
            s.k(dataSource, "dataSource");
            if (dataSource.isFinished()) {
                try {
                    ImageLoaderModule.this.removeRequest(this.f22804b);
                    this.f22805c.resolve(Boolean.TRUE);
                } catch (Exception e11) {
                    this.f22805c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e11);
                } finally {
                    dataSource.close();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003\"\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/facebook/react/modules/image/ImageLoaderModule$e", "Lcom/facebook/react/bridge/GuardedAsyncTask;", "Ljava/lang/Void;", "", "params", "Ljn0/h0;", "a", "([Ljava/lang/Void;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f22807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f22808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReadableArray readableArray, Promise promise, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f22807b = readableArray;
            this.f22808c = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... params) {
            s.k(params, "params");
            WritableMap writableMapCreateMap = Arguments.createMap();
            s.j(writableMapCreateMap, "createMap(...)");
            t imagePipeline = ImageLoaderModule.this.getImagePipeline();
            int size = this.f22807b.size();
            for (int i11 = 0; i11 < size; i11++) {
                String string = this.f22807b.getString(i11);
                if (string != null && string.length() != 0) {
                    Uri uri = Uri.parse(string);
                    if (imagePipeline.t(uri)) {
                        writableMapCreateMap.putString(string, "memory");
                    } else if (imagePipeline.v(uri)) {
                        writableMapCreateMap.putString(string, "disk");
                    }
                }
            }
            this.f22808c.resolve(writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getImagePipeline() {
        t tVar = this._imagePipeline;
        if (tVar != null) {
            return tVar;
        }
        t tVarA = el.d.a();
        s.j(tVarA, "getImagePipeline(...)");
        return tVarA;
    }

    private final void registerRequest(int requestId, com.facebook.datasource.c<Void> request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            h0 h0Var = h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.facebook.datasource.c<Void> removeRequest(int requestId) {
        com.facebook.datasource.c<Void> cVar;
        synchronized (this.enqueuedRequestMonitor) {
            cVar = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return cVar;
    }

    private final void setImagePipeline(t tVar) {
        this._imagePipeline = tVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        com.facebook.datasource.c<Void> cVarRemoveRequest = removeRequest((int) requestId);
        if (cVarRemoveRequest != null) {
            cVarRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, Promise promise) {
        s.k(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        com.facebook.imagepipeline.request.a aVarA = ImageRequestBuilder.x(new yo.a(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri()).a();
        s.j(aVarA, "build(...)");
        getImagePipeline().k(aVarA, getCallerContext()).c(new b(promise), nk.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, Promise promise) {
        s.k(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.j(reactApplicationContext, "getReactApplicationContext(...)");
        ImageRequestBuilder imageRequestBuilderX = ImageRequestBuilder.x(new yo.a(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).getUri());
        s.j(imageRequestBuilderX, "newBuilderWithSource(...)");
        getImagePipeline().k(go.b.Companion.c(go.b.INSTANCE, imageRequestBuilderX, headers, null, 4, null), getCallerContext()).c(new c(promise), nk.a.a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i11 = 0; i11 < size; i11++) {
                    com.facebook.datasource.c<Void> cVarValueAt = this.enqueuedRequests.valueAt(i11);
                    s.j(cVarValueAt, "valueAt(...)");
                    cVarValueAt.close();
                }
                this.enqueuedRequests.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, Promise promise) {
        s.k(promise, "promise");
        int i11 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        com.facebook.imagepipeline.request.a aVarA = ImageRequestBuilder.x(Uri.parse(uriString)).a();
        s.j(aVarA, "build(...)");
        com.facebook.datasource.c<Void> cVarB = getImagePipeline().B(aVarA, getCallerContext());
        d dVar = new d(i11, promise);
        registerRequest(i11, cVarB);
        cVarB.c(dVar, nk.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        s.k(uris, "uris");
        s.k(promise, "promise");
        new e(uris, promise, getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, t imagePipeline, f callerContextFactory) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        s.k(imagePipeline, "imagePipeline");
        s.k(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }
}
