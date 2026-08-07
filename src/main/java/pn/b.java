package pn;

import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lpn/b;", "", "Ljn0/h0;", "onSuccess", "()V", "", PermissionsResponse.STATUS_KEY, "", "done", "total", "a", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "onFailure", "(Ljava/lang/Exception;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface b {
    void a(String status, Integer done, Integer total);

    void onFailure(Exception cause);

    void onSuccess();
}
