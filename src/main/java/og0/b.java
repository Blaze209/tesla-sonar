package og0;

import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import retrofit2.y;
import sr0.f;
import sr0.i;
import sr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Log0/b;", "", "", "sessionToken", "", "gateId", "Lretrofit2/y;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "a", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-flag_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    @f("/api/internal/verify/v1/feature-flags")
    Object a(@i("Authorization") String str, @t("gates[]") String[] strArr, Continuation<? super y<FeatureFlagResponse>> continuation);
}
