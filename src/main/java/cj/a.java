package cj;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import jj.h;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xj.c;
import xj.k;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d<InputStream>, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Call.Factory f19367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f19368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f19369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ResponseBody f19370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a<? super InputStream> f19371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Call f19372f;

    public a(Call.Factory factory, h hVar) {
        this.f19367a = factory;
        this.f19368b = hVar;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        try {
            InputStream inputStream = this.f19369c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f19370d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f19371e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public dj.a c() {
        return dj.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        Call call = this.f19372f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super InputStream> aVar) {
        Request.Builder builderUrl = new Request.Builder().url(this.f19368b.h());
        for (Map.Entry<String, String> entry : this.f19368b.e().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        Request requestBuild = builderUrl.build();
        this.f19371e = aVar;
        this.f19372f = this.f19367a.newCall(requestBuild);
        FirebasePerfOkHttpClient.enqueue(this.f19372f, this);
    }

    @Override // okhttp3.Callback
    public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f19371e.f(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(@NonNull Call call, @NonNull Response response) {
        this.f19370d = response.body();
        if (!response.isSuccessful()) {
            this.f19371e.f(new HttpException(response.message(), response.code()));
            return;
        }
        InputStream inputStreamN = c.n(this.f19370d.byteStream(), ((ResponseBody) k.d(this.f19370d)).getContentLength());
        this.f19369c = inputStreamN;
        this.f19371e.e(inputStreamN);
    }
}
