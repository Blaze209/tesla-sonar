package s00;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ls00/e;", "", "a", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f109315b = {0};

    /* JADX INFO: renamed from: s00.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls00/e$a;", "", "<init>", "()V", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "uuid", "progressDivider", "Ljn0/h0;", "f", "(ILjava/lang/String;I)V", AnalyticsAttribute.Error, "e", "(Ljava/lang/String;Ljava/lang/String;)V", "mediaUrl", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "c", "(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "", "downloadCompression", "[I", DateTokenConverter.CONVERTER_KEY, "()[I", "TAG", "Ljava/lang/String;", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: s00.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"s00/e$a$a", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "Ljn0/h0;", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2318a implements Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReactApplicationContext f109316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f109317b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Semaphore f109318c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f109319d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ AtomicReference<String> f109320e;

            C2318a(ReactApplicationContext reactApplicationContext, String str, Semaphore semaphore, int i11, AtomicReference<String> atomicReference) {
                this.f109316a = reactApplicationContext;
                this.f109317b = str;
                this.f109318c = semaphore;
                this.f109319d = i11;
                this.f109320e = atomicReference;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e11) {
                s.k(call, "call");
                s.k(e11, "e");
                e11.printStackTrace();
                e.INSTANCE.e(e11.getMessage(), this.f109317b);
                this.f109318c.release();
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0060  */
            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                String str;
                s.k(call, "call");
                s.k(response, "response");
                if (!response.isSuccessful()) {
                    e.INSTANCE.e("Failed to download media: " + response.message(), this.f109317b);
                    this.f109318c.release();
                    return;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody == null) {
                    return;
                }
                String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
                if (strHeader$default == null) {
                    str = "unknown";
                } else {
                    int iHashCode = strHeader$default.hashCode();
                    if (iHashCode != -1487394660) {
                        if (iHashCode != -879258763) {
                            if (iHashCode == 1331848029 && strHeader$default.equals("video/mp4")) {
                                str = "mp4";
                            } else {
                                str = "unknown";
                            }
                        } else if (strHeader$default.equals(ClipboardModule.MIMETYPE_PNG)) {
                            str = "png";
                        } else {
                            str = "unknown";
                        }
                    } else if (strHeader$default.equals(ClipboardModule.MIMETYPE_JPEG)) {
                        str = "jpg";
                    } else {
                        str = "unknown";
                    }
                }
                File file = new File(this.f109316a.getCacheDir(), UUID.randomUUID() + "." + str);
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        String str2 = this.f109317b;
                        int i11 = this.f109319d;
                        AtomicReference<String> atomicReference = this.f109320e;
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(responseBodyBody.byteStream());
                            byte[] bArr = new byte[4096];
                            long contentLength = responseBodyBody.getContentLength();
                            if (contentLength <= 0) {
                                contentLength = 31457280;
                            }
                            Log.d("react-native-compessor", "0 totalBytesRead " + contentLength);
                            Log.d("react-native-compessor", response + " responseBody " + responseBodyBody);
                            long j11 = 0;
                            while (true) {
                                int i12 = bufferedInputStream.read(bArr);
                                if (i12 == -1) {
                                    fileOutputStream.flush();
                                    String str3 = "file://" + file.getAbsolutePath();
                                    i.f109324a.a(str3);
                                    atomicReference.set(str3);
                                    h0 h0Var = h0.f84049a;
                                    sn0.b.a(fileOutputStream, null);
                                    this.f109318c.release();
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i12);
                                j11 += (long) i12;
                                e.INSTANCE.f((int) (((double) 100) * (j11 / contentLength)), str2, i11);
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                sn0.b.a(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        this.f109318c.release();
                        throw th4;
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                    e.INSTANCE.e(e11.getMessage(), this.f109317b);
                    this.f109318c.release();
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String error, String uuid) {
            f.INSTANCE.c(uuid, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(int progress, String uuid, int progressDivider) {
            int iRound = Math.round(progress);
            if (progressDivider == 0 || (iRound % progressDivider == 0 && iRound > d()[0])) {
                double d11 = ((double) progress) / 100.0d;
                f.INSTANCE.b(d11, uuid);
                Log.d("react-native-compessor", "downloadProgress: " + d11);
                d()[0] = iRound;
            }
        }

        public final String c(String mediaUrl, String uuid, int progressDivider, ReactApplicationContext reactContext) {
            s.k(uuid, "uuid");
            s.k(reactContext, "reactContext");
            d()[0] = 0;
            OkHttpClient okHttpClient = new OkHttpClient();
            Request.Builder builder = new Request.Builder();
            s.h(mediaUrl);
            Request requestBuild = builder.url(mediaUrl).build();
            Semaphore semaphore = new Semaphore(0);
            AtomicReference atomicReference = new AtomicReference(null);
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(requestBuild), new C2318a(reactContext, uuid, semaphore, progressDivider, atomicReference));
            try {
                semaphore.acquire();
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
            return (String) atomicReference.get();
        }

        public final int[] d() {
            return e.f109315b;
        }

        private Companion() {
        }
    }
}
