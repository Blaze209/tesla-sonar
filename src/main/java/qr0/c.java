package qr0;

import com.squareup.moshi.JsonDataException;
import okhttp3.ResponseBody;
import okio.j;
import okio.k;
import retrofit2.h;

/* JADX INFO: loaded from: classes10.dex */
final class c<T> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f105929b = k.d("EFBBBF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.squareup.moshi.h<T> f105930a;

    c(com.squareup.moshi.h<T> hVar) {
        this.f105930a = hVar;
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(ResponseBody responseBody) {
        j bodySource = responseBody.getBodySource();
        try {
            k kVar = f105929b;
            if (bodySource.l0(0L, kVar)) {
                bodySource.skip(kVar.D());
            }
            com.squareup.moshi.k kVarT = com.squareup.moshi.k.t(bodySource);
            T tFromJson = this.f105930a.fromJson(kVarT);
            if (kVarT.B() != com.squareup.moshi.k.c.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tFromJson;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
