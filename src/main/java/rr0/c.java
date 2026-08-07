package rr0;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import okhttp3.ResponseBody;
import retrofit2.h;

/* JADX INFO: loaded from: classes10.dex */
final class c<T extends MessageLite> implements h<ResponseBody, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parser<T> f109069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExtensionRegistryLite f109070b;

    c(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        this.f109069a = parser;
        this.f109070b = extensionRegistryLite;
    }

    @Override // retrofit2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(ResponseBody responseBody) {
        try {
            try {
                T from = this.f109070b == null ? this.f109069a.parseFrom(responseBody.byteStream()) : this.f109069a.parseFrom(responseBody.byteStream(), this.f109070b);
                responseBody.close();
                return from;
            } catch (InvalidProtocolBufferException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
