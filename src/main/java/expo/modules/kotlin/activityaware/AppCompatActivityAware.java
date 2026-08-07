package expo.modules.kotlin.activityaware;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;", "", "Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "addOnActivityAvailableListener", "(Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;)V", "removeOnActivityAvailableListener", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AppCompatActivityAware {
    void addOnActivityAvailableListener(OnActivityAvailableListener listener);

    void removeOnActivityAvailableListener(OnActivityAvailableListener listener);
}
