package bm;

import android.net.Uri;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\f\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbm/l;", "", "<init>", "()V", "T", "mainRequest", "lowResRequest", "", "firstAvailableRequest", "Lpk/e;", "Landroid/net/Uri;", "requestToUri", "a", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lpk/e;)Landroid/net/Uri;", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f17831a = new l();

    private l() {
    }

    public static final <T> Uri a(T mainRequest, T lowResRequest, T[] firstAvailableRequest, pk.e<T, Uri> requestToUri) {
        s.k(requestToUri, "requestToUri");
        Uri uriApply = mainRequest != null ? requestToUri.apply(mainRequest) : null;
        if (uriApply != null) {
            return uriApply;
        }
        if (firstAvailableRequest != null && firstAvailableRequest.length != 0) {
            T t11 = firstAvailableRequest[0];
            Uri uriApply2 = t11 != null ? requestToUri.apply(t11) : null;
            if (uriApply2 != null) {
                return uriApply2;
            }
        }
        if (lowResRequest != null) {
            return requestToUri.apply(lowResRequest);
        }
        return null;
    }
}
