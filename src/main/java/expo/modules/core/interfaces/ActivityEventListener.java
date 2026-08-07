package expo.modules.core.interfaces;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i11, int i12, Intent intent);

    void onNewIntent(Intent intent);
}
