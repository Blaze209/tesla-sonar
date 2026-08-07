package com.reactnativecompressor;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import r00.c;
import s00.e;
import s00.f;
import s00.n;
import s00.q;
import t00.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0001EB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001f\u0010\u0012J\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b!\u0010\u0015J'\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b&\u0010\u0015J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b'\u0010\u0015J'\u0010(\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b(\u0010\u0012J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b-\u0010\u0012J'\u0010.\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b.\u0010\u0012J!\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b0\u0010\u0015J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\tH\u0017¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/reactnativecompressor/CompressorModule;", "Lcom/reactnativecompressor/CompressorSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Ljn0/h0;", "initialize", "()V", "", "getName", "()Ljava/lang/String;", "imagePath", "Lcom/facebook/react/bridge/ReadableMap;", "optionMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "image_compress", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "filePath", "getImageMetaData", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "fileUrl", "compress", "uuid", "cancelCompression", "(Ljava/lang/String;)V", "options", "activateBackgroundTask", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "deactivateBackgroundTask", "compress_audio", "_extension", "generateFilePath", "path", "type", "getRealPath", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getVideoMetaData", "getFileSize", "upload", "", "shouldCancelAll", "cancelUpload", "(Ljava/lang/String;Z)V", "download", "createVideoThumbnail", "cacheDir", "clearCache", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lr00/c;", "imageMain", "Lr00/c;", "Lt00/d;", "videoMain", "Lt00/d;", "Ls00/n;", "uploader", "Ls00/n;", "Ls00/d;", "videoThumbnail", "Ls00/d;", "Companion", "a", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompressorModule extends CompressorSpec {
    public static final String NAME = "Compressor";
    private final c imageMain;
    private final ReactApplicationContext reactContext;
    private final n uploader;
    private final d videoMain;
    private final s00.d videoThumbnail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressorModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.imageMain = new c(reactContext);
        this.videoMain = new d(reactContext);
        this.uploader = new n(reactContext);
        this.videoThumbnail = new s00.d(reactContext);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void activateBackgroundTask(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        this.videoMain.a(options, promise);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void addListener(String eventName) {
        s.k(eventName, "eventName");
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void cancelCompression(String uuid) {
        s.k(uuid, "uuid");
        this.videoMain.b(uuid);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void cancelUpload(String uuid, boolean shouldCancelAll) {
        s.k(uuid, "uuid");
        this.uploader.c(uuid, shouldCancelAll);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void clearCache(String cacheDir, Promise promise) {
        s.k(promise, "promise");
        s00.d.INSTANCE.c(cacheDir, promise, this.reactContext);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void compress(String fileUrl, ReadableMap optionMap, Promise promise) {
        s.k(fileUrl, "fileUrl");
        s.k(optionMap, "optionMap");
        s.k(promise, "promise");
        this.videoMain.c(fileUrl, optionMap, promise);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void compress_audio(String fileUrl, ReadableMap optionMap, Promise promise) {
        s.k(fileUrl, "fileUrl");
        s.k(optionMap, "optionMap");
        s.k(promise, "promise");
        promise.reject("AUDIO_DISABLED", "Audio compression is not available");
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void createVideoThumbnail(String fileUrl, ReadableMap options, Promise promise) {
        s.k(fileUrl, "fileUrl");
        s.k(options, "options");
        s.k(promise, "promise");
        this.videoThumbnail.c(fileUrl, options, promise);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void deactivateBackgroundTask(ReadableMap options, Promise promise) {
        s.k(options, "options");
        s.k(promise, "promise");
        this.videoMain.d(options, promise);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void download(String fileUrl, ReadableMap options, Promise promise) {
        String string;
        int iIntValue;
        s.k(fileUrl, "fileUrl");
        s.k(options, "options");
        s.k(promise, "promise");
        if (options.hasKey("uuid")) {
            string = options.getString("uuid");
            s.i(string, "null cannot be cast to non-null type kotlin.String");
        } else {
            string = "";
        }
        if (options.hasKey("progressDivider")) {
            Object string2 = options.getString("progressDivider");
            s.i(string2, "null cannot be cast to non-null type kotlin.Int");
            iIntValue = ((Integer) string2).intValue();
        } else {
            iIntValue = 0;
        }
        String strC = e.INSTANCE.c(fileUrl, string, iIntValue, this.reactContext);
        if (strC != null) {
            promise.resolve(strC);
        } else {
            promise.reject("Unable to download");
        }
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void generateFilePath(String _extension, Promise promise) {
        s.k(_extension, "_extension");
        s.k(promise, "promise");
        try {
            promise.resolve(q.c(_extension, this.reactContext));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void getFileSize(String filePath, Promise promise) {
        s.k(filePath, "filePath");
        s.k(promise, "promise");
        q.f109347a.f(filePath, promise, this.reactContext);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void getImageMetaData(String filePath, Promise promise) {
        s.k(filePath, "filePath");
        s.k(promise, "promise");
        this.imageMain.a(filePath, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void getRealPath(String path, String type, Promise promise) {
        s.k(path, "path");
        s.k(type, "type");
        s.k(promise, "promise");
        try {
            promise.resolve("file://" + q.i(path, this.reactContext, new Object[0]));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void getVideoMetaData(String filePath, Promise promise) {
        s.k(filePath, "filePath");
        s.k(promise, "promise");
        this.videoMain.e(filePath, promise);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void image_compress(String imagePath, ReadableMap optionMap, Promise promise) {
        s.k(imagePath, "imagePath");
        s.k(optionMap, "optionMap");
        s.k(promise, "promise");
        this.imageMain.b(imagePath, optionMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        f.INSTANCE.h(this.reactContext);
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.reactnativecompressor.CompressorSpec
    @ReactMethod
    public void upload(String fileUrl, ReadableMap options, Promise promise) throws IOException {
        s.k(fileUrl, "fileUrl");
        s.k(options, "options");
        s.k(promise, "promise");
        this.uploader.m(fileUrl, options, this.reactContext, promise);
    }
}
