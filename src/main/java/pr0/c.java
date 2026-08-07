package pr0;

import com.google.gson.JsonIOException;
import com.google.gson.f;
import com.google.gson.x;
import okhttp3.ResponseBody;
import retrofit2.h;

/* JADX INFO: loaded from: classes10.dex */
final class c<T> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f103927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x<T> f103928b;

    c(f fVar, x<T> xVar) {
        this.f103927a = fVar;
        this.f103928b = xVar;
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(ResponseBody responseBody) {
        ex.a aVarP = this.f103927a.p(responseBody.charStream());
        try {
            T tB = this.f103928b.b(aVarP);
            if (aVarP.n0() != ex.b.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tB;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
