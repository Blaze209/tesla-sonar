package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import lw.h;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(Response response, h hVar, long j11, long j12) {
        Request request = response.request();
        if (request == null) {
            return;
        }
        hVar.z(request.url().url().toString());
        hVar.k(request.method());
        if (request.body() != null) {
            long jContentLength = request.body().contentLength();
            if (jContentLength != -1) {
                hVar.r(jContentLength);
            }
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            long contentLength = responseBodyBody.getContentLength();
            if (contentLength != -1) {
                hVar.v(contentLength);
            }
            MediaType mediaType = responseBodyBody.get$contentType();
            if (mediaType != null) {
                hVar.u(mediaType.getMediaType());
            }
        }
        hVar.l(response.code());
        hVar.s(j11);
        hVar.x(j12);
        hVar.b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        l lVar = new l();
        call.enqueue(new d(callback, k.k(), lVar, lVar.e()));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        h hVarC = h.c(k.k());
        l lVar = new l();
        long jE = lVar.e();
        try {
            Response responseExecute = call.execute();
            a(responseExecute, hVarC, jE, lVar.c());
            return responseExecute;
        } catch (IOException e11) {
            Request request = call.request();
            if (request != null) {
                HttpUrl httpUrlUrl = request.url();
                if (httpUrlUrl != null) {
                    hVarC.z(httpUrlUrl.url().toString());
                }
                if (request.method() != null) {
                    hVarC.k(request.method());
                }
            }
            hVarC.s(jE);
            hVarC.x(lVar.c());
            nw.d.d(hVarC);
            throw e11;
        }
    }
}
