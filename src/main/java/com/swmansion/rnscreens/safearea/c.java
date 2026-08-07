package com.swmansion.rnscreens.safearea;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/rnscreens/safearea/c;", "", "Lcom/swmansion/rnscreens/safearea/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "setOnInterfaceInsetsChangeListener", "(Lcom/swmansion/rnscreens/safearea/f;)V", "removeOnInterfaceInsetsChangeListener", "Lcom/swmansion/rnscreens/safearea/a;", "getInterfaceInsets", "()Lcom/swmansion/rnscreens/safearea/a;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface c {
    EdgeInsets getInterfaceInsets();

    void removeOnInterfaceInsetsChangeListener(f listener);

    void setOnInterfaceInsetsChangeListener(f listener);
}
