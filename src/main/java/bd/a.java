package bd;

import com.ReactNativeBlobUtil.f;
import com.ReactNativeBlobUtil.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.c0;
import okio.h;
import okio.j;
import okio.r0;
import okio.s0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f17025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ReactApplicationContext f17026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ResponseBody f17027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f17028d;

    public a(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z11) {
        this.f17026b = reactApplicationContext;
        this.f17025a = str;
        this.f17027c = responseBody;
        this.f17028d = z11;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        return this.f17027c.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.f17027c.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public j getSource() {
        return c0.d(new C0341a(this.f17027c.getSource()));
    }

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    private class C0341a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        j f17029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f17030b = 0;

        C0341a(j jVar) {
            this.f17029a = jVar;
        }

        @Override // okio.r0
        public long read(h hVar, long j11) {
            long j12 = this.f17029a.read(hVar, j11);
            this.f17030b += j12 > 0 ? j12 : 0L;
            f fVarL = g.l(a.this.f17025a);
            long contentLength = a.this.getContentLength();
            if (fVarL != null && contentLength != 0 && fVarL.a(this.f17030b / a.this.getContentLength())) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("taskId", a.this.f17025a);
                writableMapCreateMap.putString("written", String.valueOf(this.f17030b));
                writableMapCreateMap.putString("total", String.valueOf(a.this.getContentLength()));
                if (a.this.f17028d) {
                    writableMapCreateMap.putString("chunk", hVar.j1(Charset.defaultCharset()));
                } else {
                    writableMapCreateMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) a.this.f17026b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
            }
            return j12;
        }

        @Override // okio.r0
        /* JADX INFO: renamed from: timeout */
        public s0 getTimeout() {
            return null;
        }

        @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
