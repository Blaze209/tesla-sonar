package com.ReactNativeBlobUtil;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactApplicationContext f19639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceEventManagerModule.RCTDeviceEventEmitter f19640b;

    class a extends AsyncTask<String, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19641a;

        a(Callback callback) {
            this.f19641a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... strArr) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.f19641a.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.f19641a.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    writableArrayCreateArray.pushMap(c.A(file.getPath() + "/" + str));
                }
            } else {
                writableArrayCreateArray.pushMap(c.A(file.getAbsolutePath()));
            }
            this.f19641a.invoke(null, writableArrayCreateArray);
            return 0;
        }
    }

    class b implements MediaScannerConnection.OnScanCompletedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19642a;

        b(Callback callback) {
            this.f19642a = callback;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f19642a.invoke(null, Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.ReactNativeBlobUtil.c$c, reason: collision with other inner class name */
    class AsyncTaskC0404c extends AsyncTask<ReadableArray, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19644a;

        AsyncTaskC0404c(Callback callback) {
            this.f19644a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < readableArrayArr[0].size(); i11++) {
                    String string = readableArrayArr[0].getString(i11);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f19644a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append(", ");
                    }
                    this.f19644a.invoke(sb2.toString());
                }
            } catch (Exception e11) {
                this.f19644a.invoke(e11.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    c(ReactApplicationContext reactApplicationContext) {
        this.f19639a = reactApplicationContext;
        this.f19640b = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static WritableMap A(String str) {
        try {
            String strF = i.f(str);
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (q(strF)) {
                String strReplace = strF.replace("bundle-assets://", "");
                AssetFileDescriptor assetFileDescriptorOpenFd = d.f19645b.getAssets().openFd(strReplace);
                writableMapCreateMap.putString("filename", strReplace);
                writableMapCreateMap.putString("path", strF);
                writableMapCreateMap.putString("type", "asset");
                writableMapCreateMap.putString("size", String.valueOf(assetFileDescriptorOpenFd.getLength()));
                writableMapCreateMap.putInt("lastModified", 0);
                return writableMapCreateMap;
            }
            File file = new File(strF);
            if (!file.exists()) {
                return null;
            }
            writableMapCreateMap.putString("filename", file.getName());
            writableMapCreateMap.putString("path", file.getPath());
            writableMapCreateMap.putString("type", file.isDirectory() ? "directory" : Action.FILE_ATTRIBUTE);
            writableMapCreateMap.putString("size", String.valueOf(file.length()));
            writableMapCreateMap.putString("lastModified", String.valueOf(file.lastModified()));
            return writableMapCreateMap;
        } catch (Exception unused) {
            return null;
        }
    }

    static void B(String str, Callback callback) {
        try {
            d(new File(i.f(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    static void C(String str, ReadableArray readableArray, boolean z11, Promise promise) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z11);
            try {
                byte[] bArr = new byte[readableArray.size()];
                for (int i11 = 0; i11 < readableArray.size(); i11++) {
                    bArr[i11] = (byte) readableArray.getInt(i11);
                }
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                promise.resolve(Integer.valueOf(readableArray.size()));
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    static void D(String str, String str2, String str3, boolean z11, boolean z12, Promise promise) {
        int length;
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            if (str2.equalsIgnoreCase("uri")) {
                String strF = i.f(str3);
                File file2 = new File(strF);
                if (!file2.exists()) {
                    promise.reject("ENOENT", "No such file '" + str + "' ('" + strF + "')");
                    return;
                }
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z12);
                        length = 0;
                        while (true) {
                            try {
                                int i11 = fileInputStream2.read(bArr);
                                if (i11 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i11);
                                length += i11;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } else {
                byte[] bArrG = i.g(str3, str2);
                if (z11) {
                    throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z12);
                try {
                    fileOutputStream2.write(bArrG);
                    length = bArrG.length;
                    fileOutputStream2.close();
                } catch (Throwable th5) {
                    fileOutputStream2.close();
                    throw th5;
                }
            }
            promise.resolve(Integer.valueOf(length));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created, or it is a directory");
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    static boolean E(String str, String str2, String str3, boolean z11) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(i.f(str));
            File parentFile = file.getParentFile();
            if (!file.exists() && ((parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) || !file.createNewFile())) {
                return false;
            }
            if (!str2.equalsIgnoreCase("uri")) {
                byte[] bArrG = i.g(str3, str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z11);
                try {
                    fileOutputStream2.write(bArrG);
                    int length = bArrG.length;
                    return true;
                } finally {
                    fileOutputStream2.close();
                }
            }
            File file2 = new File(i.f(str3));
            if (!file2.exists()) {
                return false;
            }
            byte[] bArr = new byte[10240];
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    fileOutputStream = new FileOutputStream(file, z11);
                    while (true) {
                        try {
                            int i11 = fileInputStream2.read(bArr);
                            if (i11 <= 0) {
                                fileInputStream2.close();
                                fileOutputStream.close();
                                return true;
                            }
                            fileOutputStream.write(bArr, 0, i11);
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0 A[Catch: Exception -> 0x00cc, TRY_LEAVE, TryCatch #1 {Exception -> 0x00cc, blocks: (B:44:0x00c8, B:48:0x00d0), top: B:67:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0102 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fe, blocks: (B:57:0x00fa, B:61:0x0102), top: B:65:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static void a(String str, String str2, Callback callback) {
        FileOutputStream fileOutputStream;
        String str3;
        String strF = i.f(str2);
        InputStream inputStream = null;
        try {
            InputStream inputStreamP = p(str);
            try {
                if (inputStreamP == null) {
                    callback.invoke("Source file at path`" + str + "` does not exist or can not be opened");
                    if (inputStreamP == null) {
                        return;
                    }
                } else {
                    if (new File(strF).exists() || new File(strF).createNewFile()) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(strF);
                        try {
                            byte[] bArr = new byte[10240];
                            while (true) {
                                int i11 = inputStreamP.read(bArr);
                                if (i11 > 0) {
                                    fileOutputStream2.write(bArr, 0, i11);
                                } else {
                                    try {
                                        break;
                                    } catch (Exception e11) {
                                        str3 = "" + e11.getLocalizedMessage();
                                    }
                                }
                            }
                            inputStreamP.close();
                            fileOutputStream2.close();
                            str3 = "";
                        } catch (Exception e12) {
                            fileOutputStream = fileOutputStream2;
                            e = e12;
                            inputStream = inputStreamP;
                            try {
                                str3 = "" + e.getLocalizedMessage();
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (Exception e13) {
                                        str3 = str3 + e13.getLocalizedMessage();
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (Exception e14) {
                                        e14.getLocalizedMessage();
                                        throw th;
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            fileOutputStream = fileOutputStream2;
                            th = th3;
                            inputStream = inputStreamP;
                            if (inputStream != null) {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                        if (str3 != "") {
                            callback.invoke(str3);
                            return;
                        } else {
                            callback.invoke(new Object[0]);
                            return;
                        }
                    }
                    callback.invoke("Destination file at '" + strF + "' already exists");
                }
                try {
                    inputStreamP.close();
                } catch (Exception e15) {
                    e15.getLocalizedMessage();
                }
            } catch (Exception e16) {
                e = e16;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Exception e17) {
            e = e17;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    static void b(String str, String str2, String str3, Promise promise) {
        try {
            String strF = i.f(str);
            File file = new File(strF);
            boolean zCreateNewFile = file.createNewFile();
            if (str3.equals("uri")) {
                File file2 = new File(str2.replace("ReactNativeBlobUtil-file://", ""));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[10240];
                for (int i11 = fileInputStream.read(bArr); i11 > 0; i11 = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i11);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                if (!zCreateNewFile) {
                    promise.reject("EEXIST", "File `" + strF + "` already exists");
                    return;
                }
                new FileOutputStream(file).write(i.g(str2, str3));
            }
            promise.resolve(strF);
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    static void c(String str, ReadableArray readableArray, Promise promise) {
        try {
            String strF = i.f(str);
            File file = new File(strF);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + strF + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                bArr[i11] = (byte) readableArray.getInt(i11);
            }
            fileOutputStream.write(bArr);
            promise.resolve(strF);
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    private static void d(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    static void e(Callback callback, ReactApplicationContext reactApplicationContext) {
        StatFs statFs = new StatFs(reactApplicationContext.getFilesDir().getPath());
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
        writableMapCreateMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs2 = new StatFs(externalFilesDir.getPath());
            writableMapCreateMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            writableMapCreateMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        } else {
            writableMapCreateMap.putString("external_free", "-1");
            writableMapCreateMap.putString("external_total", "-1");
        }
        callback.invoke(null, writableMapCreateMap);
    }

    static void f(String str, Callback callback) {
        if (q(str)) {
            try {
                d.f19645b.getAssets().openFd(str.replace("bundle-assets://", ""));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
                return;
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
                return;
            }
        }
        String strF = i.f(str);
        if (strF == null) {
            Boolean bool2 = Boolean.FALSE;
            callback.invoke(bool2, bool2);
        } else {
            callback.invoke(Boolean.valueOf(new File(strF).exists()), Boolean.valueOf(new File(strF).isDirectory()));
        }
    }

    static String g(ReactApplicationContext reactApplicationContext) {
        File cacheDir = reactApplicationContext.getCacheDir();
        return cacheDir != null ? cacheDir.getAbsolutePath() : "";
    }

    static String h(ReactApplicationContext reactApplicationContext, String str) {
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : "";
    }

    static String i(ReactApplicationContext reactApplicationContext) {
        File filesDir = reactApplicationContext.getFilesDir();
        return filesDir != null ? filesDir.getAbsolutePath() : "";
    }

    @NonNull
    static Map<String, Object> j(ReactApplicationContext reactApplicationContext) {
        HashMap map = new HashMap();
        map.put("LegacyDCIMDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        map.put("LegacyPictureDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put("LegacyMusicDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath());
        map.put("LegacyDownloadDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        map.put("LegacyMovieDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        map.put("LegacyRingtoneDir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath());
        if (Environment.getExternalStorageState().equals("mounted")) {
            map.put("LegacySDCardDir", Environment.getExternalStorageDirectory().getAbsolutePath());
            return map;
        }
        map.put("LegacySDCardDir", "");
        return map;
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        } catch (Exception e11) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", e11.getLocalizedMessage());
        }
    }

    public static void l(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getAbsolutePath());
        } catch (Exception e11) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", e11.getLocalizedMessage());
        }
    }

    static Map<String, Object> m(ReactApplicationContext reactApplicationContext) {
        HashMap map = new HashMap();
        map.put("DocumentDir", i(reactApplicationContext));
        map.put("CacheDir", g(reactApplicationContext));
        map.put("DCIMDir", h(reactApplicationContext, Environment.DIRECTORY_DCIM));
        map.put("PictureDir", h(reactApplicationContext, Environment.DIRECTORY_PICTURES));
        map.put("MusicDir", h(reactApplicationContext, Environment.DIRECTORY_MUSIC));
        map.put("DownloadDir", h(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS));
        map.put("MovieDir", h(reactApplicationContext, Environment.DIRECTORY_MOVIES));
        map.put("RingtoneDir", h(reactApplicationContext, Environment.DIRECTORY_RINGTONES));
        if (Environment.getExternalStorageState().equals("mounted")) {
            map.put("SDCardDir", h(reactApplicationContext, null));
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            if (externalFilesDir == null || externalFilesDir.getParentFile() == null) {
                map.put("SDCardApplicationDir", "");
            } else {
                map.put("SDCardApplicationDir", externalFilesDir.getParentFile().getAbsolutePath());
            }
        } else {
            map.put("SDCardDir", "");
            map.put("SDCardApplicationDir", "");
        }
        map.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        map.put("LibraryDir", "");
        map.put("ApplicationSupportDir", "");
        return map;
    }

    static String n(String str) {
        return d.f19645b.getFilesDir() + "/ReactNativeBlobUtilTmp_" + str;
    }

    static void o(String str, String str2, Promise promise) {
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
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
                return;
            }
            if (!str.startsWith("content://") && new File(i.f(str)).isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) map.get(str2));
            InputStream inputStreamP = p(str);
            if (inputStreamP == null) {
                promise.reject("ENOENT", "No such file '" + str + "'");
                return;
            }
            byte[] bArr = new byte[PKIFailureInfo.badCertTemplate];
            while (true) {
                int i12 = inputStreamP.read(bArr);
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
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    private static InputStream p(String str) {
        if (str.startsWith("bundle-assets://")) {
            return d.f19645b.getAssets().open(str.replace("bundle-assets://", ""));
        }
        return str.startsWith("content://") ? d.f19645b.getContentResolver().openInputStream(Uri.parse(str)) : new FileInputStream(new File(i.f(str)));
    }

    static boolean q(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    static void r(String str, Promise promise) {
        try {
            String strF = i.f(str);
            File file = new File(strF);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strF + "'");
                return;
            }
            if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + strF + "'");
                return;
            }
            String[] list = new File(strF).list();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                writableArrayCreateArray.pushString(str2);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e11) {
            e11.printStackTrace();
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    static void s(String str, Callback callback) {
        new a(callback).execute(i.f(str));
    }

    static void t(String str, Promise promise) {
        String strF = i.f(str);
        File file = new File(strF);
        if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.isDirectory() ? "Folder" : "File");
            sb2.append(" '");
            sb2.append(strF);
            sb2.append("' already exists");
            promise.reject("EEXIST", sb2.toString());
            return;
        }
        try {
            if (file.mkdirs()) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + strF + "'");
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    static void u(String str, String str2, Callback callback) {
        String strF = i.f(str);
        String strF2 = i.f(str2);
        File file = new File(strF);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + strF + "` does not exist");
            return;
        }
        try {
            File file2 = new File(strF2);
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                callback.invoke("mv failed because the destination directory doesn't exist");
                return;
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (file.renameTo(file2)) {
                callback.invoke(new Object[0]);
            } else {
                callback.invoke("mv failed for unknown reasons");
            }
        } catch (Exception e11) {
            callback.invoke(e11.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003a A[Catch: Exception -> 0x0032, FileNotFoundException -> 0x0035, TryCatch #2 {FileNotFoundException -> 0x0035, Exception -> 0x0032, blocks: (B:7:0x000e, B:9:0x0014, B:18:0x0071, B:21:0x0090, B:43:0x00e7, B:28:0x00aa, B:30:0x00b2, B:32:0x00b9, B:33:0x00c1, B:35:0x00c5, B:37:0x00cd, B:39:0x00d6, B:41:0x00de, B:45:0x00f0, B:46:0x00f7, B:15:0x003a, B:16:0x0056), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[Catch: Exception -> 0x0032, FileNotFoundException -> 0x0035, TryCatch #2 {FileNotFoundException -> 0x0035, Exception -> 0x0032, blocks: (B:7:0x000e, B:9:0x0014, B:18:0x0071, B:21:0x0090, B:43:0x00e7, B:28:0x00aa, B:30:0x00b2, B:32:0x00b9, B:33:0x00c1, B:35:0x00c5, B:37:0x00cd, B:39:0x00d6, B:41:0x00de, B:45:0x00f0, B:46:0x00f7, B:15:0x003a, B:16:0x0056), top: B:53:0x000e }] */
    static void v(String str, String str2, boolean z11, Promise promise) {
        int iAvailable;
        byte[] bArr;
        int i11;
        String strF = i.f(str);
        if (strF != null) {
            str = strF;
        }
        if (strF != null) {
            try {
                if (strF.startsWith("bundle-assets://")) {
                    InputStream inputStreamOpen = d.f19645b.getAssets().open(str.replace("bundle-assets://", ""));
                    iAvailable = inputStreamOpen.available();
                    bArr = new byte[iAvailable];
                    i11 = inputStreamOpen.read(bArr, 0, iAvailable);
                    inputStreamOpen.close();
                } else if (strF == null) {
                    InputStream inputStreamOpenInputStream = d.f19645b.getContentResolver().openInputStream(Uri.parse(str));
                    iAvailable = inputStreamOpenInputStream.available();
                    bArr = new byte[iAvailable];
                    i11 = inputStreamOpenInputStream.read(bArr);
                    inputStreamOpenInputStream.close();
                } else {
                    File file = new File(str);
                    iAvailable = (int) file.length();
                    bArr = new byte[iAvailable];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    int i12 = fileInputStream.read(bArr);
                    fileInputStream.close();
                    i11 = i12;
                }
            } catch (FileNotFoundException e11) {
                String localizedMessage = e11.getLocalizedMessage();
                if (localizedMessage.contains("EISDIR")) {
                    promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory; " + localizedMessage);
                    return;
                }
                promise.reject("ENOENT", "No such file '" + str + "'; " + localizedMessage);
                return;
            } catch (Exception e12) {
                promise.reject("EUNSPECIFIED", e12.getLocalizedMessage());
                return;
            }
        } else if (strF == null) {
            InputStream inputStreamOpenInputStream2 = d.f19645b.getContentResolver().openInputStream(Uri.parse(str));
            iAvailable = inputStreamOpenInputStream2.available();
            bArr = new byte[iAvailable];
            i11 = inputStreamOpenInputStream2.read(bArr);
            inputStreamOpenInputStream2.close();
        } else {
            File file2 = new File(str);
            iAvailable = (int) file2.length();
            bArr = new byte[iAvailable];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            int i13 = fileInputStream2.read(bArr);
            fileInputStream2.close();
            i11 = i13;
        }
        if (i11 < iAvailable) {
            promise.reject("EUNSPECIFIED", "Read only " + i11 + " bytes of " + iAvailable);
            return;
        }
        if (z11) {
            throw new IllegalStateException("Read file with transform was specified but the shared file transformer is not set");
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1396204209) {
            if (iHashCode != 3600241) {
                if (iHashCode == 93106001 && lowerCase.equals("ascii")) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (byte b11 : bArr) {
                        writableArrayCreateArray.pushInt(b11);
                    }
                    promise.resolve(writableArrayCreateArray);
                    return;
                }
            } else if (lowerCase.equals("utf8")) {
                promise.resolve(new String(bArr));
                return;
            }
        } else if (lowerCase.equals("base64")) {
            promise.resolve(Base64.encodeToString(bArr, 2));
            return;
        }
        promise.resolve(new String(bArr));
    }

    static void w(ReadableArray readableArray, Callback callback) {
        new AsyncTaskC0404c(callback).execute(readableArray);
    }

    static void y(String str, String str2, long j11, long j12, String str3, Promise promise) {
        try {
            String strF = i.f(str2);
            if (!str.startsWith("content://") && new File(i.f(str)).isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory");
                return;
            }
            InputStream inputStreamP = p(str);
            if (inputStreamP == null) {
                promise.reject("ENOENT", "No such file '" + str + "'");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(strF));
            long jSkip = inputStreamP.skip(j11);
            if (jSkip != j11) {
                promise.reject("EUNSPECIFIED", "Skipped " + jSkip + " instead of the specified " + j11 + " bytes");
                return;
            }
            byte[] bArr = new byte[10240];
            int i11 = (int) (j12 - j11);
            while (i11 > 0) {
                int i12 = inputStreamP.read(bArr, 0, 10240);
                if (i12 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, Math.min(i11, i12));
                i11 -= i12;
            }
            inputStreamP.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            promise.resolve(strF);
        } catch (Exception e11) {
            e11.printStackTrace();
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    static void z(String str, Callback callback) {
        try {
            String strF = i.f(str);
            WritableMap writableMapA = A(strF);
            if (writableMapA != null) {
                callback.invoke(null, writableMapA);
                return;
            }
            callback.invoke("failed to stat path `" + strF + "` because it does not exist or it is not a folder", null);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage());
        }
    }

    void x(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f19639a, strArr, strArr2, new b(callback));
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage(), null);
        }
    }
}
