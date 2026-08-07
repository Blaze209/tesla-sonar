package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0055a extends Binder implements a {
        public AbstractBinderC0055a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i11 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i11) {
                case 1:
                    onEvent(parcel.readString(), (Bundle) b.b(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    o();
                    return true;
                case 3:
                    P2((PlaybackStateCompat) b.b(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    K1((MediaMetadataCompat) b.b(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    n(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    A((CharSequence) b.b(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    x((Bundle) b.b(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    b2((ParcelableVolumeInfo) b.b(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case 9:
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    z(parcel.readInt() != 0);
                    return true;
                case 11:
                    y(parcel.readInt() != 0);
                    return true;
                case 12:
                    u(parcel.readInt());
                    return true;
                case 13:
                    k();
                    return true;
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void A(CharSequence charSequence);

    void K1(MediaMetadataCompat mediaMetadataCompat);

    void P2(PlaybackStateCompat playbackStateCompat);

    void b2(ParcelableVolumeInfo parcelableVolumeInfo);

    void k();

    void n(List<MediaSessionCompat.QueueItem> list);

    void o();

    void onEvent(String str, Bundle bundle);

    void onRepeatModeChanged(int i11);

    void u(int i11);

    void x(Bundle bundle);

    void y(boolean z11);

    void z(boolean z11);
}
