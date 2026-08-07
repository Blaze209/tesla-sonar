package bd;

import androidx.annotation.NonNull;
import com.ReactNativeBlobUtil.f;
import com.ReactNativeBlobUtil.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.c0;
import okio.h;
import okio.j;
import okio.r0;
import okio.s0;

/* JADX INFO: loaded from: classes3.dex */
public class b extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f17032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ResponseBody f17033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f17034c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ReactApplicationContext f17036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    FileOutputStream f17037f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f17035d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f17038g = false;

    private class a implements r0 {
        private void c(String str, long j11, long j12) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", str);
            writableMapCreateMap.putString("written", String.valueOf(j11));
            writableMapCreateMap.putString("total", String.valueOf(j12));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) b.this.f17036e.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
        }

        @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            b.this.f17037f.close();
        }

        @Override // okio.r0
        public long read(@NonNull h hVar, long j11) {
            float contentLength;
            int i11 = (int) j11;
            try {
                byte[] bArr = new byte[i11];
                long j12 = b.this.f17033b.byteStream().read(bArr, 0, i11);
                b bVar = b.this;
                bVar.f17035d += j12 > 0 ? j12 : 0L;
                if (j12 > 0) {
                    bVar.f17037f.write(bArr, 0, (int) j12);
                } else if (bVar.getContentLength() == -1 && j12 == -1) {
                    b.this.f17038g = true;
                }
                f fVarL = g.l(b.this.f17032a);
                if (b.this.getContentLength() != 0) {
                    if (b.this.getContentLength() != -1) {
                        b bVar2 = b.this;
                        contentLength = bVar2.f17035d / bVar2.getContentLength();
                    } else {
                        contentLength = b.this.f17038g ? 1.0f : 0.0f;
                    }
                    if (fVarL != null && fVarL.a(contentLength)) {
                        if (b.this.getContentLength() != -1) {
                            b bVar3 = b.this;
                            c(bVar3.f17032a, bVar3.f17035d, bVar3.getContentLength());
                            return j12;
                        }
                        b bVar4 = b.this;
                        if (!bVar4.f17038g) {
                            c(bVar4.f17032a, 0L, bVar4.getContentLength());
                            return j12;
                        }
                        String str = bVar4.f17032a;
                        long j13 = bVar4.f17035d;
                        c(str, j13, j13);
                    }
                }
                return j12;
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // okio.r0
        /* JADX INFO: renamed from: timeout */
        public s0 getTimeout() {
            return null;
        }

        private a() {
        }
    }

    public b(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z11) throws IOException {
        this.f17036e = reactApplicationContext;
        this.f17032a = str;
        this.f17033b = responseBody;
        this.f17034c = str2;
        if (str2 != null) {
            boolean z12 = !z11;
            String strReplace = str2.replace("?append=true", "");
            this.f17034c = strReplace;
            File file = new File(strReplace);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.f17037f = new FileOutputStream(new File(strReplace), z12);
            } else {
                throw new IllegalStateException("Couldn't create dir: " + parentFile);
            }
        }
    }

    public boolean c() {
        if (this.f17035d != getContentLength()) {
            return getContentLength() == -1 && this.f17038g;
        }
        return true;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        return this.f17033b.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.f17033b.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public j getSource() {
        return c0.d(new a());
    }
}
