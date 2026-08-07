package com.rnfs;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = RNFSManager.MODULE_NAME)
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<com.rnfs.c> downloaders;
    private ReactApplicationContext reactContext;
    private SparseArray<com.rnfs.i> uploaders;

    class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f49028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f49029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f49030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file, Promise promise, String str) {
            super();
            this.f49028b = file;
            this.f49029c = promise;
            this.f49030d = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f49028b.delete();
                this.f49029c.resolve(Boolean.TRUE);
            } else {
                exc.printStackTrace();
                RNFSManager.this.reject(this.f49029c, this.f49030d, exc);
            }
        }
    }

    class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49033c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Promise promise, String str) {
            super();
            this.f49032b = promise;
            this.f49033c = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f49032b.resolve(null);
            } else {
                exc.printStackTrace();
                RNFSManager.this.reject(this.f49032b, this.f49033c, exc);
            }
        }
    }

    class c implements com.rnfs.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReadableMap f49037c;

        c(int i11, Promise promise, ReadableMap readableMap) {
            this.f49035a = i11;
            this.f49036b = promise;
            this.f49037c = readableMap;
        }

        @Override // com.rnfs.a.c
        public void a(com.rnfs.b bVar) {
            if (bVar.f49066c != null) {
                RNFSManager.this.reject(this.f49036b, this.f49037c.getString("toFile"), bVar.f49066c);
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f49035a);
            writableMapCreateMap.putInt("statusCode", bVar.f49064a);
            writableMapCreateMap.putDouble("bytesWritten", bVar.f49065b);
            this.f49036b.resolve(writableMapCreateMap);
        }
    }

    class d implements com.rnfs.a.InterfaceC0777a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49039a;

        d(int i11) {
            this.f49039a = i11;
        }

        @Override // com.rnfs.a.InterfaceC0777a
        public void a(int i11, long j11, Map<String, String> map) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writableMapCreateMap.putString(entry.getKey(), entry.getValue());
            }
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("jobId", this.f49039a);
            writableMapCreateMap2.putInt("statusCode", i11);
            writableMapCreateMap2.putDouble("contentLength", j11);
            writableMapCreateMap2.putMap("headers", writableMapCreateMap);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", writableMapCreateMap2);
        }
    }

    class e implements com.rnfs.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49041a;

        e(int i11) {
            this.f49041a = i11;
        }

        @Override // com.rnfs.a.b
        public void a(long j11, long j12) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f49041a);
            writableMapCreateMap.putDouble("contentLength", j11);
            writableMapCreateMap.putDouble("bytesWritten", j12);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", writableMapCreateMap);
        }
    }

    class f implements com.rnfs.g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f49044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReadableMap f49045c;

        f(int i11, Promise promise, ReadableMap readableMap) {
            this.f49043a = i11;
            this.f49044b = promise;
            this.f49045c = readableMap;
        }

        @Override // com.rnfs.g.b
        public void a(com.rnfs.h hVar) {
            if (hVar.f49083c != null) {
                RNFSManager.this.reject(this.f49044b, this.f49045c.getString("toUrl"), hVar.f49083c);
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f49043a);
            writableMapCreateMap.putInt("statusCode", hVar.f49081a);
            writableMapCreateMap.putMap("headers", hVar.f49082b);
            writableMapCreateMap.putString("body", hVar.f49084d);
            this.f49044b.resolve(writableMapCreateMap);
        }
    }

    class g implements com.rnfs.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49047a;

        g(int i11) {
            this.f49047a = i11;
        }

        @Override // com.rnfs.g.a
        public void a() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f49047a);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", writableMapCreateMap);
        }
    }

    class h implements com.rnfs.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f49049a;

        h(int i11) {
            this.f49049a = i11;
        }

        @Override // com.rnfs.g.c
        public void a(int i11, int i12) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f49049a);
            writableMapCreateMap.putInt("totalBytesExpectedToSend", i11);
            writableMapCreateMap.putInt("totalBytesSent", i12);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadProgress", writableMapCreateMap);
        }
    }

    class i implements MediaScannerConnection.MediaScannerConnectionClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49051a;

        i(Promise promise) {
            this.f49051a = promise;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f49051a.resolve(str);
        }
    }

    private class j extends AsyncTask<String, Void, Exception> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                InputStream inputStream = RNFSManager.this.getInputStream(str);
                OutputStream outputStream = RNFSManager.this.getOutputStream(str2, false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 <= 0) {
                        inputStream.close();
                        outputStream.close();
                        return null;
                    }
                    outputStream.write(bArr, 0, i11);
                    Thread.yield();
                }
            } catch (Exception e11) {
                return e11;
            }
        }

        private j() {
        }
    }

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.downloaders = new SparseArray<>();
        this.uploaders = new SparseArray<>();
        this.reactContext = reactApplicationContext;
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                DeleteRecursive(file2);
            }
        }
        file.delete();
    }

    private void copyInputStream(InputStream inputStream, String str, String str2, Promise promise) throws Throwable {
        OutputStream outputStream = null;
        try {
            try {
                try {
                    OutputStream outputStream2 = getOutputStream(str2, false);
                    try {
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 == -1) {
                                break;
                            } else {
                                outputStream2.write(bArr, 0, i11);
                            }
                        }
                        promise.resolve(null);
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                    } catch (Exception e11) {
                        e = e11;
                        outputStream = outputStream2;
                        reject(promise, str, new Exception(String.format("Failed to copy '%s' to %s (%s)", str, str2, e.getLocalizedMessage())));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (outputStream == null) {
                        } else {
                            outputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (outputStream == null) {
                            throw th;
                        }
                        try {
                            outputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (IOException unused5) {
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Uri getFileUri(String str, boolean z11) throws com.rnfs.d {
        Uri uri = Uri.parse(str);
        if (uri.getScheme() != null) {
            return uri;
        }
        File file = new File(str);
        if (z11 || !file.isDirectory()) {
            return Uri.parse("file://" + str);
        }
        throw new com.rnfs.d("EISDIR", "EISDIR: illegal operation on a directory, read '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getInputStream(String str) throws com.rnfs.d {
        try {
            InputStream inputStreamOpenInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new com.rnfs.d("ENOENT", "ENOENT: could not open an input stream for '" + str + "'");
        } catch (FileNotFoundException e11) {
            throw new com.rnfs.d("ENOENT", "ENOENT: " + e11.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    private String getOriginalFilepath(String str, boolean z11) throws com.rnfs.d {
        Uri fileUri = getFileUri(str, z11);
        if (fileUri.getScheme().equals("content")) {
            try {
                Cursor cursorQuery = this.reactContext.getContentResolver().query(fileUri, null, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    str = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                }
                cursorQuery.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z11) throws com.rnfs.d {
        try {
            OutputStream outputStreamOpenOutputStream = this.reactContext.getContentResolver().openOutputStream(getFileUri(str, false), z11 ? "wa" : getWriteAccessByAPILevel());
            if (outputStreamOpenOutputStream != null) {
                return outputStreamOpenOutputStream;
            }
            throw new com.rnfs.d("ENOENT", "ENOENT: could not open an output stream for '" + str + "'");
        } catch (FileNotFoundException e11) {
            throw new com.rnfs.d("ENOENT", "ENOENT: " + e11.getMessage() + ", open '" + str + "'");
        }
    }

    private int getResIdentifier(String str) {
        boolean z11 = true;
        String strSubstring = str.substring(str.lastIndexOf(".") + 1);
        String strSubstring2 = str.substring(0, str.lastIndexOf("."));
        if (!strSubstring.equals("png") && !strSubstring.equals("jpg") && !strSubstring.equals("jpeg") && !strSubstring.equals("bmp") && !strSubstring.equals("gif") && !strSubstring.equals("webp") && !strSubstring.equals("psd") && !strSubstring.equals("svg") && !strSubstring.equals("tiff")) {
            z11 = false;
        }
        return getReactApplicationContext().getResources().getIdentifier(strSubstring2, z11 ? "drawable" : "raw", getReactApplicationContext().getPackageName());
    }

    private String getWriteAccessByAPILevel() {
        return Build.VERSION.SDK_INT <= 28 ? "w" : "rwt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
        } else if (!(exc instanceof com.rnfs.d)) {
            promise.reject((String) null, exc.getMessage());
        } else {
            com.rnfs.d dVar = (com.rnfs.d) exc;
            promise.reject(dVar.a(), dVar.getMessage());
        }
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(bArrDecode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void copyFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        new b(promise, str).execute(str, str2);
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) throws Throwable {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(String.format("Asset '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) throws Throwable {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(String.format("Res '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void downloadFile(ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            int i11 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i12 = readableMap.getInt("progressInterval");
            int i13 = readableMap.getInt("progressDivider");
            int i14 = readableMap.getInt("readTimeout");
            int i15 = readableMap.getInt("connectionTimeout");
            boolean z11 = readableMap.getBoolean("hasBeginCallback");
            boolean z12 = readableMap.getBoolean("hasProgressCallback");
            com.rnfs.a aVar = new com.rnfs.a();
            aVar.f49054a = url;
            aVar.f49055b = file;
            aVar.f49056c = map;
            aVar.f49057d = i12;
            aVar.f49058e = i13;
            aVar.f49059f = i14;
            aVar.f49060g = i15;
            aVar.f49061h = new c(i11, promise, readableMap);
            if (z11) {
                aVar.f49062i = new d(i11);
            }
            if (z12) {
                aVar.f49063j = new e(i11);
            }
            com.rnfs.c cVar = new com.rnfs.c();
            cVar.execute(aVar);
            this.downloaders.put(i11, cVar);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e11);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void existsAssets(String str, Promise promise) {
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            try {
                String[] list = assets.list(str);
                if (list != null && list.length > 0) {
                    promise.resolve(Boolean.TRUE);
                    return;
                }
            } catch (Exception unused) {
            }
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = assets.open(str);
                    promise.resolve(Boolean.TRUE);
                    if (inputStreamOpen == null) {
                        return;
                    }
                } catch (Exception unused2) {
                    promise.resolve(Boolean.FALSE);
                    if (inputStreamOpen == null) {
                        return;
                    }
                }
                try {
                    inputStreamOpen.close();
                } catch (Exception unused3) {
                }
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th2;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            if (getResIdentifier(str) > 0) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs(null);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                writableArrayCreateArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(writableArrayCreateArray);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(RNFSDocumentDirectory, 0);
        map.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        map.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        map.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        map.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        map.put(RNFSFileTypeRegular, 0);
        map.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            map.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            map.put(RNFSExternalStorageDirectoryPath, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            map.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            map.put(RNFSExternalDirectoryPath, null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            map.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
            return map;
        }
        map.put(RNFSExternalCachesDirectoryPath, null);
        return map;
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long totalBytes = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        long totalBytes2 = statFs2.getTotalBytes();
        long freeBytes2 = statFs2.getFreeBytes();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("totalSpace", totalBytes);
        writableMapCreateMap.putDouble("freeSpace", freeBytes);
        writableMapCreateMap.putDouble("totalSpaceEx", totalBytes2);
        writableMapCreateMap.putDouble("freeSpaceEx", freeBytes2);
        promise.resolve(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        int i11;
        try {
            HashMap map = new HashMap();
            map.put("md5", "MD5");
            map.put("sha1", "SHA-1");
            map.put("sha224", "SHA-224");
            map.put("sha256", "SHA-256");
            map.put("sha384", "SHA-384");
            map.put("sha512", "SHA-512");
            if (!map.containsKey(str2)) {
                throw new Exception("Invalid hash algorithm");
            }
            File file = new File(str);
            if (file.isDirectory()) {
                rejectFileIsDirectory(promise);
                return;
            }
            if (!file.exists()) {
                rejectFileNotFound(promise, str);
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) map.get(str2));
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[10240];
            while (true) {
                int i12 = fileInputStream.read(bArr);
                if (i12 == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, i12);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : messageDigest.digest()) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            promise.resolve(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (!file.exists()) {
                throw new Exception("Directory could not be created");
            }
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void moveFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            if (file.renameTo(new File(str2))) {
                promise.resolve(Boolean.TRUE);
            } else {
                new a(file, promise, str).execute(str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    @ReactMethod
    public void read(String str, int i11, int i12, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i11];
            inputStream.skip(i12);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i11), 2));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("Folder does not exist");
            }
            File[] fileArrListFiles = file.listFiles();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (File file2 : fileArrListFiles) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("mtime", file2.lastModified() / 1000.0d);
                writableMapCreateMap.putString("name", file2.getName());
                writableMapCreateMap.putString("path", file2.getAbsolutePath());
                writableMapCreateMap.putDouble("size", file2.length());
                writableMapCreateMap.putInt("type", file2.isDirectory() ? 1 : 0);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void readDirAssets(String str, Promise promise) {
        int length;
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            String[] list = assets.list(str);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("name", str2);
                if (!str.isEmpty()) {
                    str2 = String.format("%s/%s", str, str2);
                }
                writableMapCreateMap.putString("path", str2);
                int i11 = 1;
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(str2);
                    if (assetFileDescriptorOpenFd != null) {
                        length = (int) assetFileDescriptorOpenFd.getLength();
                        try {
                            assetFileDescriptorOpenFd.close();
                            i11 = 0;
                        } catch (IOException e11) {
                            e = e11;
                            i11 = 1 ^ (e.getMessage().contains("compressed") ? 1 : 0);
                        }
                    } else {
                        length = 0;
                    }
                } catch (IOException e12) {
                    e = e12;
                    length = 0;
                }
                writableMapCreateMap.putInt("size", length);
                writableMapCreateMap.putInt("type", i11);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (IOException e13) {
            reject(promise, str, e13);
        }
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:34:0x0044 */
    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    inputStreamOpen = getReactApplicationContext().getAssets().open(str, 0);
                    if (inputStreamOpen != null) {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        inputStreamOpen.close();
                        return;
                    }
                    reject(promise, str, new Exception("Failed to open file"));
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                reject(promise, str, e11);
                if (0 != 0) {
                    inputStreamOpen.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:32:0x0047 */
    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStreamOpenRawResource = null;
        try {
            try {
                try {
                    inputStreamOpenRawResource = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
                    if (inputStreamOpenRawResource != null) {
                        byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                        inputStreamOpenRawResource.read(bArr);
                        promise.resolve(Base64.encodeToString(bArr, 2));
                        inputStreamOpenRawResource.close();
                        return;
                    }
                    reject(promise, str, new Exception("Failed to open file"));
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                reject(promise, str, e11);
                if (0 != 0) {
                    inputStreamOpenRawResource.close();
                }
            }
        } catch (Throwable th2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void scanFile(String str, Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, null, new i(promise));
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            file.setReadable(bool.booleanValue(), bool2.booleanValue());
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("ctime", (int) (file.lastModified() / 1000));
            writableMapCreateMap.putInt("mtime", (int) (file.lastModified() / 1000));
            writableMapCreateMap.putDouble("size", file.length());
            writableMapCreateMap.putInt("type", file.isDirectory() ? 1 : 0);
            writableMapCreateMap.putString("originalFilepath", originalFilepath);
            promise.resolve(writableMapCreateMap);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void stopDownload(int i11) {
        com.rnfs.c cVar = this.downloaders.get(i11);
        if (cVar != null) {
            cVar.g();
        }
    }

    @ReactMethod
    public void stopUpload(int i11) {
        com.rnfs.i iVar = this.uploaders.get(i11);
        if (iVar != null) {
            iVar.f();
        }
    }

    @ReactMethod
    public void touch(String str, double d11, double d12, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d11)));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            DeleteRecursive(file);
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void uploadFiles(ReadableMap readableMap, Promise promise) {
        try {
            ReadableArray array = readableMap.getArray("files");
            URL url = new URL(readableMap.getString("toUrl"));
            int i11 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            ReadableMap map2 = readableMap.getMap("fields");
            String string = readableMap.getString("method");
            boolean z11 = readableMap.getBoolean("binaryStreamOnly");
            boolean z12 = readableMap.getBoolean("hasBeginCallback");
            boolean z13 = readableMap.getBoolean("hasProgressCallback");
            ArrayList<ReadableMap> arrayList = new ArrayList<>();
            com.rnfs.g gVar = new com.rnfs.g();
            for (int i12 = 0; i12 < array.size(); i12++) {
                arrayList.add(array.getMap(i12));
            }
            gVar.f49072a = url;
            gVar.f49073b = arrayList;
            gVar.f49075d = map;
            gVar.f49077f = string;
            gVar.f49076e = map2;
            gVar.f49074c = z11;
            gVar.f49078g = new f(i11, promise, readableMap);
            if (z12) {
                gVar.f49080i = new g(i11);
            }
            if (z13) {
                gVar.f49079h = new h(i11);
            }
            com.rnfs.i iVar = new com.rnfs.i();
            iVar.execute(gVar);
            this.uploaders.put(i11, iVar);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, readableMap.getString("toUrl"), e11);
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i11, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (i11 < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(bArrDecode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(i11);
                randomAccessFile.write(bArrDecode);
                randomAccessFile.close();
            }
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(bArrDecode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }
}
