package rr0;

import com.google.protobuf.MessageLite;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.h;

/* JADX INFO: loaded from: classes10.dex */
final class b<T extends MessageLite> implements h<T, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final MediaType f109068a = MediaType.get("application/x-protobuf");

    b() {
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t11) {
        return RequestBody.create(f109068a, t11.toByteArray());
    }
}
