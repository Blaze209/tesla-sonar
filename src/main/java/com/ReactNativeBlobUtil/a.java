package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
class a extends RequestBody {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReadableArray f19609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f19611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g.EnumC0406g f19612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MediaType f19613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f19614g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f19608a = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f19615h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f19616i = Boolean.FALSE;

    /* JADX INFO: renamed from: com.ReactNativeBlobUtil.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0403a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19617a;

        static {
            int[] iArr = new int[g.EnumC0406g.values().length];
            f19617a = iArr;
            try {
                iArr[g.EnumC0406g.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19617a[g.EnumC0406g.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19617a[g.EnumC0406g.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f19619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f19620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f19621d;

        b(ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f19618a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f19619b = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.f19620c = readableMap.getString("type");
            } else {
                this.f19620c = this.f19619b == null ? "text/plain" : "application/octet-stream";
            }
            if (readableMap.hasKey("data")) {
                this.f19621d = readableMap.getString("data");
            }
        }
    }

    a(String str) {
        this.f19610c = str;
    }

    private ArrayList<b> c() throws IOException {
        int length;
        long length2;
        ArrayList<b> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = d.f19645b;
        long jAvailable = 0;
        for (int i11 = 0; i11 < this.f19609b.size(); i11++) {
            b bVar = new b(this.f19609b.getMap(i11));
            arrayList.add(bVar);
            String str = bVar.f19621d;
            if (str == null) {
                i.a("ReactNativeBlobUtil multipart request builder has found a field without `data` property, the field `" + bVar.f19618a + "` will be removed implicitly.");
            } else {
                if (bVar.f19619b == null) {
                    length = str.getBytes().length;
                } else if (str.startsWith("ReactNativeBlobUtil-file://")) {
                    String strF = i.f(str.substring(27));
                    if (i.d(strF)) {
                        try {
                            length = reactApplicationContext.getAssets().open(strF.replace("bundle-assets://", "")).available();
                        } catch (IOException e11) {
                            i.a(e11.getLocalizedMessage());
                        }
                    } else {
                        length2 = new File(i.f(strF)).length();
                    }
                    jAvailable += length2;
                } else if (str.startsWith("ReactNativeBlobUtil-content://")) {
                    String strSubstring = str.substring(30);
                    InputStream inputStreamOpenInputStream = null;
                    try {
                        try {
                            inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                            jAvailable += (long) inputStreamOpenInputStream.available();
                        } catch (Exception e12) {
                            i.a("Failed to estimate form data length from content URI:" + strSubstring + ", " + e12.getLocalizedMessage());
                            if (inputStreamOpenInputStream != null) {
                            }
                        }
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        throw th2;
                    }
                } else {
                    length = Base64.decode(str, 0).length;
                }
                length2 = length;
                jAvailable += length2;
            }
        }
        this.f19608a = jAvailable;
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x014a A[PHI: r10
      0x014a: PHI (r10v5 java.io.InputStream) = (r10v4 java.io.InputStream), (r10v6 java.io.InputStream) binds: [B:33:0x016f, B:27:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    private File d() throws IOException {
        String str = "ReactNativeBlobUtil-" + this.f19610c;
        File fileCreateTempFile = File.createTempFile("rnfb-form-tmp", "", d.f19645b.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        ArrayList<b> arrayListC = c();
        ReactApplicationContext reactApplicationContext = d.f19645b;
        for (b bVar : arrayListC) {
            String str2 = bVar.f19621d;
            String str3 = bVar.f19618a;
            if (str3 != null && str2 != null) {
                String str4 = "--" + str + "\r\n";
                File file = fileCreateTempFile;
                if (bVar.f19619b != null) {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"; filename=\"" + bVar.f19619b + "\"\r\n") + "Content-Type: " + bVar.f19620c + "\r\n\r\n").getBytes());
                    if (str2.startsWith("ReactNativeBlobUtil-file://")) {
                        String strF = i.f(str2.substring(27));
                        if (i.d(strF)) {
                            try {
                                h(reactApplicationContext.getAssets().open(strF.replace("bundle-assets://", "")), fileOutputStream);
                            } catch (IOException e11) {
                                i.a("Failed to create form data asset :" + strF + ", " + e11.getLocalizedMessage());
                            }
                        } else {
                            File file2 = new File(i.f(strF));
                            if (file2.exists()) {
                                h(new FileInputStream(file2), fileOutputStream);
                            } else {
                                i.a("Failed to create form data from path :" + strF + ", file not exists.");
                            }
                        }
                    } else if (str2.startsWith("ReactNativeBlobUtil-content://")) {
                        String strSubstring = str2.substring(30);
                        InputStream inputStreamOpenInputStream = null;
                        try {
                            try {
                                inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                                h(inputStreamOpenInputStream, fileOutputStream);
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            } catch (Exception e12) {
                                i.a("Failed to create form data from content URI:" + strSubstring + ", " + e12.getLocalizedMessage());
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            }
                        } catch (Throwable th2) {
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            throw th2;
                        }
                    } else {
                        fileOutputStream.write(Base64.decode(str2, 0));
                    }
                } else {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"\r\n") + "Content-Type: " + bVar.f19620c + "\r\n\r\n").getBytes());
                    fileOutputStream.write(bVar.f19621d.getBytes());
                }
                fileOutputStream.write("\r\n".getBytes());
                fileCreateTempFile = file;
            }
        }
        File file3 = fileCreateTempFile;
        fileOutputStream.write(("--" + str + "--\r\n").getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
        return file3;
    }

    private void e(long j11) {
        f fVarM = g.m(this.f19610c);
        if (fVarM != null) {
            long j12 = this.f19608a;
            if (j12 == 0 || !fVarM.a(j11 / j12)) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", this.f19610c);
            writableMapCreateMap.putString("written", String.valueOf(j11));
            writableMapCreateMap.putString("total", String.valueOf(this.f19608a));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) d.f19645b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress-upload", writableMapCreateMap);
        }
    }

    private InputStream g() throws Exception {
        if (!this.f19611d.startsWith("ReactNativeBlobUtil-file://")) {
            if (!this.f19611d.startsWith("ReactNativeBlobUtil-content://")) {
                try {
                    return new ByteArrayInputStream(Base64.decode(this.f19611d, 0));
                } catch (Exception e11) {
                    throw new Exception("error when getting request stream: " + e11.getLocalizedMessage());
                }
            }
            String strSubstring = this.f19611d.substring(30);
            try {
                return d.f19645b.getContentResolver().openInputStream(Uri.parse(strSubstring));
            } catch (Exception e12) {
                throw new Exception("error when getting request stream for content URI: " + strSubstring, e12);
            }
        }
        String strF = i.f(this.f19611d.substring(27));
        if (i.d(strF)) {
            try {
                return d.f19645b.getAssets().open(strF.replace("bundle-assets://", ""));
            } catch (Exception e13) {
                throw new Exception("error when getting request stream from asset : " + e13.getLocalizedMessage());
            }
        }
        File file = new File(i.f(strF));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return new FileInputStream(file);
        } catch (Exception e14) {
            throw new Exception("error when getting request stream: " + e14.getLocalizedMessage());
        }
    }

    private void h(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[10240];
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 <= 0) {
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i11);
        }
    }

    private void i(InputStream inputStream, okio.i iVar) throws IOException {
        byte[] bArr = new byte[10240];
        long j11 = 0;
        while (true) {
            int i11 = inputStream.read(bArr, 0, 10240);
            if (i11 <= 0) {
                inputStream.close();
                return;
            } else {
                iVar.write(bArr, 0, i11);
                j11 += (long) i11;
                e(j11);
            }
        }
    }

    a a(boolean z11) {
        this.f19616i = Boolean.valueOf(z11);
        return this;
    }

    boolean b() {
        try {
            File file = this.f19614g;
            if (file == null || !file.exists()) {
                return true;
            }
            this.f19614g.delete();
            return true;
        } catch (Exception e11) {
            i.a(e11.getLocalizedMessage());
            return false;
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.f19616i.booleanValue()) {
            return -1L;
        }
        return this.f19608a;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getF22850a() {
        return this.f19613f;
    }

    InputStream f() {
        try {
            if (this.f19609b != null) {
                return new FileInputStream(this.f19614g);
            }
            int i11 = C0403a.f19617a[this.f19612e.ordinal()];
            if (i11 == 1) {
                return g();
            }
            if (i11 == 2) {
                return new ByteArrayInputStream(this.f19611d.getBytes());
            }
            if (i11 != 3) {
                return null;
            }
            i.a("ReactNativeBlobUtil could not create input stream for request type others");
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            i.a("ReactNativeBlobUtil failed to create input stream for request:" + e11.getLocalizedMessage());
            return null;
        }
    }

    a j(ReadableArray readableArray) {
        this.f19609b = readableArray;
        try {
            File fileD = d();
            this.f19614g = fileD;
            this.f19608a = fileD.length();
            return this;
        } catch (Exception e11) {
            e11.printStackTrace();
            i.a("ReactNativeBlobUtil failed to create request multipart body :" + e11.getLocalizedMessage());
            return this;
        }
    }

    a k(String str) {
        this.f19611d = str;
        if (str == null) {
            this.f19611d = "";
            this.f19612e = g.EnumC0406g.AsIs;
        }
        try {
            int i11 = C0403a.f19617a[this.f19612e.ordinal()];
            if (i11 == 1) {
                this.f19608a = g().available();
                return this;
            }
            if (i11 != 2) {
                return this;
            }
            this.f19608a = this.f19611d.getBytes().length;
            return this;
        } catch (Exception e11) {
            e11.printStackTrace();
            i.a("ReactNativeBlobUtil failed to create single content request body :" + e11.getLocalizedMessage() + "\r\n");
            return this;
        }
    }

    a l(MediaType mediaType) {
        this.f19613f = mediaType;
        return this;
    }

    a m(g.EnumC0406g enumC0406g) {
        this.f19612e = enumC0406g;
        return this;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NonNull okio.i iVar) {
        try {
            i(f(), iVar);
        } catch (Exception e11) {
            i.a(e11.getLocalizedMessage());
            e11.printStackTrace();
        }
    }
}
