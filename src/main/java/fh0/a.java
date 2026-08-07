package fh0;

import hh0.InquiryAttributes;
import jn0.s;
import okhttp3.RequestBody;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfh0/a;", "", "Lhh0/d;", "attributes", "Ljn0/s;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(Lhh0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Lretrofit2/y;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    Object a(String str, RequestBody requestBody, Continuation<? super y<?>> continuation);

    Object b(String str, RequestBody requestBody, Continuation<? super y<?>> continuation);

    Object c(InquiryAttributes inquiryAttributes, Continuation<? super s<com.withpersona.sdk2.inquiry.internal.fallbackmode.i>> continuation);
}
