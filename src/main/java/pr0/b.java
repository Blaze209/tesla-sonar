package pr0;

import com.google.gson.f;
import com.google.gson.x;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.h;

/* JADX INFO: loaded from: classes10.dex */
final class b<T> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final MediaType f103923c = MediaType.get("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f103924d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f103925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x<T> f103926b;

    b(f fVar, x<T> xVar) {
        this.f103925a = fVar;
        this.f103926b = xVar;
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t11) throws IOException {
        okio.h hVar = new okio.h();
        ex.c cVarQ = this.f103925a.q(new OutputStreamWriter(hVar.I3(), f103924d));
        this.f103926b.d(cVarQ, t11);
        cVarQ.close();
        return RequestBody.create(f103923c, hVar.m1());
    }
}
