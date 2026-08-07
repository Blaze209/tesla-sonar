package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f1812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f1813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f1814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f1815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f1816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f1817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f1818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f1819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List<CustomAction> f1820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f1821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f1822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PlaybackState f1823l;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i11) {
            return new PlaybackStateCompat[i11];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i11) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i11);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j11) {
            builder.setActions(j11);
        }

        static void t(PlaybackState.Builder builder, long j11) {
            builder.setActiveQueueItemId(j11);
        }

        static void u(PlaybackState.Builder builder, long j11) {
            builder.setBufferedPosition(j11);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i11, long j11, float f11, long j12) {
            builder.setState(i11, j11, f11, j12);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i11, long j11, long j12, float f11, long j13, int i12, CharSequence charSequence, long j14, List<CustomAction> list, long j15, Bundle bundle) {
        this.f1812a = i11;
        this.f1813b = j11;
        this.f1814c = j12;
        this.f1815d = f11;
        this.f1816e = j13;
        this.f1817f = i12;
        this.f1818g = charSequence;
        this.f1819h = j14;
        this.f1820i = new ArrayList(list);
        this.f1821j = j15;
        this.f1822k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listJ = b.j(playbackState);
        if (listJ != null) {
            arrayList = new ArrayList(listJ.size());
            Iterator<PlaybackState.CustomAction> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle bundleA = c.a(playbackState);
        MediaSessionCompat.a(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundleA);
        playbackStateCompat.f1823l = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f1812a + ", position=" + this.f1813b + ", buffered position=" + this.f1814c + ", speed=" + this.f1815d + ", updated=" + this.f1819h + ", actions=" + this.f1816e + ", error code=" + this.f1817f + ", error message=" + this.f1818g + ", custom actions=" + this.f1820i + ", active item id=" + this.f1821j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1812a);
        parcel.writeLong(this.f1813b);
        parcel.writeFloat(this.f1815d);
        parcel.writeLong(this.f1819h);
        parcel.writeLong(this.f1814c);
        parcel.writeLong(this.f1816e);
        TextUtils.writeToParcel(this.f1818g, parcel, i11);
        parcel.writeTypedList(this.f1820i);
        parcel.writeLong(this.f1821j);
        parcel.writeBundle(this.f1822k);
        parcel.writeInt(this.f1817f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f1825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f1827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PlaybackState.CustomAction f1828e;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i11) {
                return new CustomAction[i11];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i11, Bundle bundle) {
            this.f1824a = str;
            this.f1825b = charSequence;
            this.f1826c = i11;
            this.f1827d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleL = b.l(customAction);
            MediaSessionCompat.a(bundleL);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), bundleL);
            customAction2.f1828e = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f1825b) + ", mIcon=" + this.f1826c + ", mExtras=" + this.f1827d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f1824a);
            TextUtils.writeToParcel(this.f1825b, parcel, i11);
            parcel.writeInt(this.f1826c);
            parcel.writeBundle(this.f1827d);
        }

        CustomAction(Parcel parcel) {
            this.f1824a = parcel.readString();
            this.f1825b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1826c = parcel.readInt();
            this.f1827d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1812a = parcel.readInt();
        this.f1813b = parcel.readLong();
        this.f1815d = parcel.readFloat();
        this.f1819h = parcel.readLong();
        this.f1814c = parcel.readLong();
        this.f1816e = parcel.readLong();
        this.f1818g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1820i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1821j = parcel.readLong();
        this.f1822k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f1817f = parcel.readInt();
    }
}
