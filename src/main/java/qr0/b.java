package qr0;

import com.squareup.moshi.r;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.h;

/* JADX INFO: loaded from: classes10.dex */
final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final MediaType f105927b = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.squareup.moshi.h<T> f105928a;

    b(com.squareup.moshi.h<T> hVar) {
        this.f105928a = hVar;
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t11) {
        okio.h hVar = new okio.h();
        this.f105928a.toJson(r.e0(hVar), t11);
        return RequestBody.create(f105927b, hVar.m1());
    }
}
