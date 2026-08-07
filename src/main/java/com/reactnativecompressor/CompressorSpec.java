package com.reactnativecompressor;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001a\u0010\u0013J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001b\u0010\u0013J'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b!\u0010\u000eJ\u001f\u0010$\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010'\u001a\u00020\f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b)\u0010(J'\u0010*\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b*\u0010\u000eJ!\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0006H&¢\u0006\u0004\b.\u0010\u001fJ\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H&¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/reactnativecompressor/CompressorSpec;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "imagePath", "Lcom/facebook/react/bridge/ReadableMap;", "optionMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "image_compress", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "fileUrl", "compress_audio", "_extension", "generateFilePath", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "path", "type", "getRealPath", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "filePath", "getVideoMetaData", "getImageMetaData", "getFileSize", "compress", "uuid", "cancelCompression", "(Ljava/lang/String;)V", "options", "upload", "", "shouldCancelAll", "cancelUpload", "(Ljava/lang/String;Z)V", "download", "activateBackgroundTask", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "deactivateBackgroundTask", "createVideoThumbnail", "cacheDir", "clearCache", "eventName", "addListener", "", "count", "removeListeners", "(D)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CompressorSpec extends ReactContextBaseJavaModule {
    public CompressorSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public abstract void activateBackgroundTask(ReadableMap options, Promise promise);

    public abstract void addListener(String eventName);

    public abstract void cancelCompression(String uuid);

    public abstract void cancelUpload(String uuid, boolean shouldCancelAll);

    public abstract void clearCache(String cacheDir, Promise promise);

    public abstract void compress(String fileUrl, ReadableMap optionMap, Promise promise);

    public abstract void compress_audio(String fileUrl, ReadableMap optionMap, Promise promise);

    public abstract void createVideoThumbnail(String fileUrl, ReadableMap options, Promise promise);

    public abstract void deactivateBackgroundTask(ReadableMap options, Promise promise);

    public abstract void download(String fileUrl, ReadableMap options, Promise promise);

    public abstract void generateFilePath(String _extension, Promise promise);

    public abstract void getFileSize(String filePath, Promise promise);

    public abstract void getImageMetaData(String filePath, Promise promise);

    public abstract void getRealPath(String path, String type, Promise promise);

    public abstract void getVideoMetaData(String filePath, Promise promise);

    public abstract void image_compress(String imagePath, ReadableMap optionMap, Promise promise);

    public abstract void removeListeners(double count);

    public abstract void upload(String fileUrl, ReadableMap options, Promise promise);
}
