package ga;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
class q {
    @SuppressLint({"MissingPermission"})
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i11, PendingIntent pendingIntent) {
        mediaStyle.setRemotePlaybackInfo(charSequence, i11, pendingIntent);
        return mediaStyle;
    }
}
