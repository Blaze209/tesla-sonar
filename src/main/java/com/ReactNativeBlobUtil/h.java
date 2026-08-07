package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, h> f19743d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeviceEventManagerModule.RCTDeviceEventEmitter f19744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19745b = "base64";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f19746c = null;

    h(ReactApplicationContext reactApplicationContext) {
        this.f19744a = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    static void a(String str, Callback callback) {
        try {
            HashMap<String, h> map = f19743d;
            OutputStream outputStream = map.get(str).f19746c;
            map.remove(str);
            outputStream.close();
            callback.invoke(new Object[0]);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage());
        }
    }

    private void b(String str, String str2, WritableArray writableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putArray("detail", writableArray);
        writableMapCreateMap.putString("streamId", str);
        this.f19744a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    private void c(String str, String str2, String str3) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putString("detail", str3);
        writableMapCreateMap.putString("streamId", str);
        this.f19744a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    private void d(String str, String str2, String str3, String str4) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event", str2);
        writableMapCreateMap.putString("code", str3);
        writableMapCreateMap.putString("detail", str4);
        writableMapCreateMap.putString("streamId", str);
        this.f19744a.emit("ReactNativeBlobUtilFilesystem", writableMapCreateMap);
    }

    static void f(String str, ReadableArray readableArray, Callback callback) {
        try {
            OutputStream outputStream = f19743d.get(str).f19746c;
            byte[] bArr = new byte[readableArray.size()];
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                bArr[i11] = (byte) readableArray.getInt(i11);
            }
            outputStream.write(bArr);
            callback.invoke(new Object[0]);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage());
        }
    }

    static void g(String str, String str2, Callback callback) {
        h hVar = f19743d.get(str);
        try {
            hVar.f19746c.write(i.g(str2, hVar.f19745b));
            callback.invoke(new Object[0]);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage());
        }
    }

    void e(String str, String str2, int i11, int i12, String str3, ReactApplicationContext reactApplicationContext) {
        String strF = i.f(str);
        String str4 = strF != null ? strF : str;
        try {
            int i13 = str2.equalsIgnoreCase("base64") ? 4095 : 4096;
            if (i11 > 0) {
                i13 = i11;
            }
            InputStream inputStreamOpenInputStream = (strF == null || !str4.startsWith("bundle-assets://")) ? strF == null ? d.f19645b.getContentResolver().openInputStream(Uri.parse(str4)) : new FileInputStream(new File(str4)) : d.f19645b.getAssets().open(str4.replace("bundle-assets://", ""));
            int i14 = -1;
            int i15 = 0;
            if (str2.equalsIgnoreCase("utf8")) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpenInputStream, Charset.forName("UTF-8"));
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader, i13);
                char[] cArr = new char[i13];
                while (true) {
                    int i16 = bufferedReader.read(cArr, i15, i13);
                    if (i16 == i14) {
                        break;
                    }
                    c(str3, "data", new String(cArr, i15, i16));
                    if (i12 > 0) {
                        SystemClock.sleep(i12);
                    }
                    cArr = cArr;
                    i14 = -1;
                    i15 = 0;
                }
                bufferedReader.close();
                inputStreamReader.close();
            } else {
                if (!str2.equalsIgnoreCase("ascii")) {
                    if (str2.equalsIgnoreCase("base64")) {
                        byte[] bArr = new byte[i13];
                        while (true) {
                            int i17 = inputStreamOpenInputStream.read(bArr);
                            if (i17 == -1) {
                                break;
                            }
                            if (i17 < i13) {
                                byte[] bArr2 = new byte[i17];
                                System.arraycopy(bArr, 0, bArr2, 0, i17);
                                c(str3, "data", Base64.encodeToString(bArr2, 2));
                            } else {
                                c(str3, "data", Base64.encodeToString(bArr, 2));
                            }
                            if (i12 > 0) {
                                SystemClock.sleep(i12);
                            }
                        }
                    } else {
                        d(str3, AnalyticsAttribute.Error, "EINVAL", "Unrecognized encoding `" + str2 + "`, should be one of `base64`, `utf8`, `ascii`");
                    }
                    inputStreamOpenInputStream.close();
                }
                byte[] bArr3 = new byte[i13];
                while (true) {
                    int i18 = inputStreamOpenInputStream.read(bArr3);
                    if (i18 == -1) {
                        break;
                    }
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (int i19 = 0; i19 < i18; i19++) {
                        writableArrayCreateArray.pushInt(bArr3[i19]);
                    }
                    b(str3, "data", writableArrayCreateArray);
                    if (i12 > 0) {
                        SystemClock.sleep(i12);
                    }
                }
            }
            c(str3, "end", "");
            inputStreamOpenInputStream.close();
        } catch (FileNotFoundException unused) {
            d(str3, AnalyticsAttribute.Error, "ENOENT", "No such file '" + str4 + "'");
        } catch (Exception e11) {
            d(str3, AnalyticsAttribute.Error, "EUNSPECIFIED", "Failed to convert data to " + str2 + " encoded string. This might be because this encoding cannot be used for this data.");
            e11.printStackTrace();
        }
    }

    void h(String str, String str2, boolean z11, Callback callback) {
        OutputStream outputStreamOpenOutputStream;
        String strF = i.f(str);
        if (strF != null) {
            str = strF;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (strF == null || file.exists()) {
                if (file.isDirectory()) {
                    callback.invoke("EISDIR", "Expecting a file but '" + str + "' is a directory");
                    return;
                }
            } else {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    callback.invoke("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    callback.invoke("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            if (strF == null || !str.startsWith("bundle-assets://")) {
                outputStreamOpenOutputStream = strF == null ? d.f19645b.getContentResolver().openOutputStream(Uri.parse(str)) : new FileOutputStream(str, z11);
            } else {
                outputStreamOpenOutputStream = d.f19645b.getAssets().openFd(str.replace("bundle-assets://", "")).createOutputStream();
            }
            this.f19745b = str2;
            String string = UUID.randomUUID().toString();
            f19743d.put(string, this);
            this.f19746c = outputStreamOpenOutputStream;
            callback.invoke(null, null, string);
        } catch (Exception e11) {
            callback.invoke("EUNSPECIFIED", "Failed to create write stream at path `" + str + "`; " + e11.getLocalizedMessage());
        }
    }
}
