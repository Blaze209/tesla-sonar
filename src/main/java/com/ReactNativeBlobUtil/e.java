package com.ReactNativeBlobUtil;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    public enum a {
        Audio,
        Image,
        Video,
        Download
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[SYNTHETIC] */
    public static void a(Uri uri, String str, Promise promise) {
        FileOutputStream fileOutputStream;
        ContentResolver contentResolver = d.f19645b.getApplicationContext().getContentResolver();
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("ReactNativeBlobUtil.copyToInternal: Cannot create parent folders<'" + str);
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ReactNativeBlobUtil.copyToInternal: Destination file at '" + str + "' already exists");
                    return;
                }
            } catch (IOException e11) {
                promise.reject("ReactNativeBlobUtil.copyToInternal: Could not create file: " + e11.getLocalizedMessage());
            }
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int i11 = inputStreamOpenInputStream.read(bArr);
                        if (i11 > 0) {
                            fileOutputStream.write(bArr, 0, i11);
                        } else {
                            try {
                                break;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    inputStreamOpenInputStream.close();
                } catch (IOException e13) {
                    e = e13;
                    inputStream = inputStreamOpenInputStream;
                    try {
                        promise.reject("ReactNativeBlobUtil.copyToInternal:  Could not write data: " + e.getLocalizedMessage());
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                        }
                        promise.resolve("");
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e15) {
                                e15.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (IOException e18) {
            e = e18;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (IOException e19) {
            e19.printStackTrace();
        }
        promise.resolve("");
    }

    public static Uri b(cd.a aVar, a aVar2, ReactApplicationContext reactApplicationContext) {
        ContentResolver contentResolver = d.f19645b.getApplicationContext().getContentResolver();
        ContentValues contentValues = new ContentValues();
        String strE = e(aVar2, reactApplicationContext);
        String str = aVar.f19064c;
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("mime_type", str);
            contentValues.put("_display_name", aVar.f19062a);
            contentValues.put("relative_path", strE + '/' + aVar.f19063b);
            try {
                return contentResolver.insert(d(aVar2), contentValues);
            } catch (Exception unused) {
                return null;
            }
        }
        File file = new File(strE + aVar.a());
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return null;
        }
        try {
            file.createNewFile();
            return Uri.fromFile(file);
        } catch (IOException unused2) {
            return null;
        }
    }

    public static void c(Uri uri, String str, Promise promise) {
        try {
            InputStream inputStreamOpenInputStream = d.f19645b.getApplicationContext().getContentResolver().openInputStream(uri);
            int iAvailable = inputStreamOpenInputStream.available();
            byte[] bArr = new byte[iAvailable];
            int i11 = inputStreamOpenInputStream.read(bArr);
            inputStreamOpenInputStream.close();
            if (i11 < iAvailable) {
                promise.reject("EUNSPECIFIED", "Read only " + i11 + " bytes of " + iAvailable);
                return;
            }
            String lowerCase = str.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1396204209) {
                if (iHashCode == 93106001 && lowerCase.equals("ascii")) {
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (int i12 = 0; i12 < iAvailable; i12++) {
                        writableArrayCreateArray.pushInt(bArr[i12]);
                    }
                    promise.resolve(writableArrayCreateArray);
                    return;
                }
            } else if (lowerCase.equals("base64")) {
                promise.resolve(Base64.encodeToString(bArr, 2));
                return;
            }
            promise.resolve(new String(bArr));
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    private static Uri d(a aVar) {
        if (aVar == a.Audio) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Audio.Media.getContentUri("external_primary") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        if (aVar == a.Video) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external_primary") : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        if (aVar == a.Image) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if (aVar != a.Download || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return MediaStore.Downloads.getContentUri("external_primary");
    }

    private static String e(a aVar, ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (aVar == a.Audio) {
                return Environment.DIRECTORY_MUSIC;
            }
            if (aVar == a.Video) {
                return Environment.DIRECTORY_MOVIES;
            }
            if (aVar == a.Image) {
                return Environment.DIRECTORY_PICTURES;
            }
            return aVar == a.Download ? Environment.DIRECTORY_DOWNLOADS : Environment.DIRECTORY_DOWNLOADS;
        }
        if (aVar == a.Audio) {
            return c.j(reactApplicationContext).get("LegacyMusicDir").toString();
        }
        if (aVar == a.Video) {
            return c.j(reactApplicationContext).get("LegacyMovieDir").toString();
        }
        if (aVar == a.Image) {
            return c.j(reactApplicationContext).get("LegacyPictureDir").toString();
        }
        return aVar == a.Download ? c.j(reactApplicationContext).get("LegacyDownloadDir").toString() : c.j(reactApplicationContext).get("LegacyDownloadDir").toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static boolean f(Uri uri, String str, boolean z11, Promise promise, ReactApplicationContext reactApplicationContext) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        if (Build.VERSION.SDK_INT < 29) {
            return c.E(i.f(uri.toString()), "uri", str, false);
        }
        try {
            Context applicationContext = reactApplicationContext.getApplicationContext();
            ContentResolver contentResolver = applicationContext.getContentResolver();
            ?? r11 = 0;
            try {
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = applicationContext.getContentResolver().openFileDescriptor(uri, "w");
                        String strF = i.f(str);
                        File file = new File(strF);
                        if (!file.exists()) {
                            promise.reject("ENOENT", "No such file ('" + strF + "')");
                            return false;
                        }
                        FileInputStream fileInputStream = new FileInputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        if (z11) {
                            fileInputStream.read(new byte[(int) file.length()]);
                            throw new IllegalStateException("Write to media file with transform was specified but the shared file transformer is not set");
                        }
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int i11 = fileInputStream.read(bArr);
                            if (i11 <= 0) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    r11 = uri;
                                    th = th2;
                                    if (r11 != 0) {
                                        r11.close();
                                    }
                                    throw th;
                                }
                            }
                            fileOutputStream.write(bArr, 0, i11);
                        }
                        fileInputStream.close();
                        fileOutputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                            return true;
                        }
                        try {
                            promise.reject(new IOException("Failed to get output stream."));
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            return false;
                        } catch (IOException e11) {
                            e = e11;
                            contentResolver.delete(null, null, null);
                            promise.reject(e);
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            return false;
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        promise.reject(new IOException("Failed to get output stream."));
                        return false;
                    }
                } catch (IOException e13) {
                    e = e13;
                    outputStreamOpenOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "Cannot write to file, file might not exist");
            return false;
        }
    }
}
