package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f7437a = (IconCompat) versionedParcel.v(remoteActionCompat.f7437a, 1);
        remoteActionCompat.f7438b = versionedParcel.l(remoteActionCompat.f7438b, 2);
        remoteActionCompat.f7439c = versionedParcel.l(remoteActionCompat.f7439c, 3);
        remoteActionCompat.f7440d = (PendingIntent) versionedParcel.r(remoteActionCompat.f7440d, 4);
        remoteActionCompat.f7441e = versionedParcel.h(remoteActionCompat.f7441e, 5);
        remoteActionCompat.f7442f = versionedParcel.h(remoteActionCompat.f7442f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f7437a, 1);
        versionedParcel.D(remoteActionCompat.f7438b, 2);
        versionedParcel.D(remoteActionCompat.f7439c, 3);
        versionedParcel.H(remoteActionCompat.f7440d, 4);
        versionedParcel.z(remoteActionCompat.f7441e, 5);
        versionedParcel.z(remoteActionCompat.f7442f, 6);
    }
}
