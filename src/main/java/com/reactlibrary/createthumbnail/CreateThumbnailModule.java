package com.reactlibrary.createthumbnail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import cq0.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class CreateThumbnailModule extends ReactContextBaseJavaModule {
    private final Executor executor;
    private final Handler handler;
    private final ReactApplicationContext reactContext;

    public CreateThumbnailModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newSingleThreadExecutor();
        this.handler = new Handler(Looper.getMainLooper());
        this.reactContext = reactApplicationContext;
    }

    private static void cleanDir(File file, long j11) {
        File[] fileArrListFiles = file.listFiles();
        Arrays.sort(fileArrListFiles, b.f58902a);
        long length = 0;
        for (File file2 : fileArrListFiles) {
            length += file2.length();
            file2.delete();
            if (length >= j11) {
                return;
            }
        }
    }

    private static File createDirIfNotExists(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        try {
            file.mkdirs();
            new File(str, ".nomedia").createNewFile();
            return file;
        } catch (IOException e11) {
            e11.printStackTrace();
            return file;
        }
    }

    private static Bitmap getBitmapAtTime(Context context, String str, int i11, int i12, int i13, boolean z11, Map map) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (URLUtil.isFileUrl(str)) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
            mediaMetadataRetriever.setDataSource(str.replace("file://", ""));
        } else if (str.contains("content://")) {
            mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
        } else {
            mediaMetadataRetriever.setDataSource(str, (Map<String, String>) map);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(i11 * 1000, 2, i12, i13);
        } else {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(i11 * 1000, 2);
            if (frameAtTime != null) {
                frameAtTime = Bitmap.createScaledBitmap(frameAtTime, i12, i13, true);
            }
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        if (frameAtTime != null) {
            return frameAtTime;
        }
        throw new IllegalStateException("File doesn't exist or not supported");
    }

    private static long getDirSize(File file) {
        long length = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                length += file2.length();
            }
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$2(ReadableMap readableMap, final Promise promise) {
        try {
            final ReadableMap readableMapProcessData = processData(readableMap);
            this.handler.post(new Runnable() { // from class: i00.b
                @Override // java.lang.Runnable
                public final void run() {
                    promise.resolve(readableMapProcessData);
                }
            });
        } catch (IOException e11) {
            this.handler.post(new Runnable() { // from class: i00.c
                @Override // java.lang.Runnable
                public final void run() {
                    promise.reject("CreateThumbnail_ERROR", e11);
                }
            });
        }
    }

    private ReadableMap processData(ReadableMap readableMap) throws IOException {
        StringBuilder sb2;
        String string = readableMap.hasKey("format") ? readableMap.getString("format") : "jpeg";
        String string2 = readableMap.hasKey("cacheName") ? readableMap.getString("cacheName") : "";
        String str = this.reactContext.getApplicationContext().getCacheDir().getAbsolutePath() + "/thumbnails";
        File fileCreateDirIfNotExists = createDirIfNotExists(str);
        if (!TextUtils.isEmpty(string2)) {
            File file = new File(str, string2 + "." + string);
            if (file.exists()) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("path", "file://" + file.getAbsolutePath());
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                writableMapCreateMap.putDouble("size", (double) bitmapDecodeFile.getByteCount());
                writableMapCreateMap.putString("mime", "image/" + string);
                writableMapCreateMap.putDouble(Snapshot.WIDTH, (double) bitmapDecodeFile.getWidth());
                writableMapCreateMap.putDouble(Snapshot.HEIGHT, (double) bitmapDecodeFile.getHeight());
                return writableMapCreateMap;
            }
        }
        String string3 = readableMap.hasKey(ImagesContract.URL) ? readableMap.getString(ImagesContract.URL) : "";
        int i11 = readableMap.hasKey("dirSize") ? readableMap.getInt("dirSize") : 100;
        int i12 = readableMap.hasKey("timeStamp") ? readableMap.getInt("timeStamp") : 0;
        int i13 = readableMap.hasKey("maxWidth") ? readableMap.getInt("maxWidth") : 512;
        int i14 = readableMap.hasKey("maxHeight") ? readableMap.getInt("maxHeight") : 512;
        boolean z11 = readableMap.hasKey("onlySyncedFrames") ? readableMap.getBoolean("onlySyncedFrames") : true;
        HashMap<String, Object> hashMap = readableMap.hasKey("headers") ? readableMap.getMap("headers").toHashMap() : new HashMap<>();
        if (TextUtils.isEmpty(string2)) {
            sb2 = new StringBuilder();
            sb2.append("thumb-");
            sb2.append(UUID.randomUUID().toString());
        } else {
            sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(".");
            sb2.append(string);
        }
        File file2 = new File(fileCreateDirIfNotExists, sb2.toString());
        Bitmap bitmapAtTime = getBitmapAtTime(this.reactContext, string3, i12, i13, i14, z11, hashMap);
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        if (string.equals("png")) {
            bitmapAtTime.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } else {
            bitmapAtTime.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        long j11 = ((long) i11) * 1048576;
        if (((long) bitmapAtTime.getByteCount()) + getDirSize(fileCreateDirIfNotExists) > j11) {
            cleanDir(fileCreateDirIfNotExists, j11 / 2);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("path", "file://" + file2.getAbsolutePath());
        writableMapCreateMap2.putDouble("size", (double) bitmapAtTime.getByteCount());
        writableMapCreateMap2.putString("mime", "image/" + string);
        writableMapCreateMap2.putDouble(Snapshot.WIDTH, (double) bitmapAtTime.getWidth());
        writableMapCreateMap2.putDouble(Snapshot.HEIGHT, (double) bitmapAtTime.getHeight());
        return writableMapCreateMap2;
    }

    @ReactMethod
    public void create(final ReadableMap readableMap, final Promise promise) {
        this.executor.execute(new Runnable() { // from class: i00.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f74034a.lambda$create$2(readableMap, promise);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CreateThumbnail";
    }
}
