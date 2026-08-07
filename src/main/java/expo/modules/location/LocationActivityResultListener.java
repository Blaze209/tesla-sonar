package expo.modules.location;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/location/LocationActivityResultListener;", "", "", StatusResponse.RESULT_CODE, "Ljn0/h0;", "onResult", "(I)V", "expo-location_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocationActivityResultListener {
    void onResult(int resultCode);
}
