package dj0;

import com.withpersona.sdk2.inquiry.webrtc.networking.AuthorizeWebRtcResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;
import sr0.f;
import sr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldj0/a;", "", "", "jwt", "Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "webrtc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    @f("/server-config")
    Object a(@t("jwt") String str, Continuation<? super y<AuthorizeWebRtcResponse>> continuation);
}
