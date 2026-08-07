package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = NativeFileReaderModuleSpec.NAME)
public class FileReaderModule extends NativeFileReaderModuleSpec {
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        BlobModule blobModule = getBlobModule("readAsDataURL");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        if (readableMap == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is null");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("data:");
            if (!readableMap.hasKey("type") || readableMap.getString("type").isEmpty()) {
                sb2.append("application/octet-stream");
            } else {
                sb2.append(readableMap.getString("type"));
            }
            sb2.append(";base64,");
            sb2.append(Base64.encodeToString(bArrResolve, 2));
            promise.resolve(sb2.toString());
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        BlobModule blobModule = getBlobModule("readAsText");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        if (readableMap == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is null");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(bArrResolve, str));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}
