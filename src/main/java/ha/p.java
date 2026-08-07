package ha;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f72420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f72421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f72422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f72423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f72424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f72425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f72426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f72427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List<d> f72428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f72429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f72430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PlaybackState f72431l;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i11) {
            return new p[i11];
        }
    }

    private static class b {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    p(int i11, long j11, long j12, float f11, long j13, int i12, CharSequence charSequence, long j14, List<d> list, long j15, Bundle bundle) {
        this.f72420a = i11;
        this.f72421b = j11;
        this.f72422c = j12;
        this.f72423d = f11;
        this.f72424e = j13;
        this.f72425f = i12;
        this.f72426g = charSequence;
        this.f72427h = j14;
        this.f72428i = list == null ? x.r() : new ArrayList<>(list);
        this.f72429j = j15;
        this.f72430k = bundle;
    }

    public static p a(PlaybackState playbackState) {
        ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    arrayList.add(d.a(customAction));
                }
            }
        }
        Bundle bundleA = b.a(playbackState);
        l.a(bundleA);
        p pVar = new p(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundleA);
        pVar.f72431l = playbackState;
        return pVar;
    }

    public long b() {
        return this.f72424e;
    }

    public long c() {
        return this.f72429j;
    }

    public long d() {
        return this.f72422c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(Long l11) {
        return Math.max(0L, this.f72421b + ((long) (this.f72423d * (l11 != null ? l11.longValue() : SystemClock.elapsedRealtime() - this.f72427h))));
    }

    public List<d> f() {
        return this.f72428i;
    }

    public int g() {
        return this.f72425f;
    }

    public CharSequence h() {
        return this.f72426g;
    }

    public Bundle i() {
        return this.f72430k;
    }

    public long j() {
        return this.f72427h;
    }

    public float k() {
        return this.f72423d;
    }

    public PlaybackState l() {
        if (this.f72431l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f72420a, this.f72421b, this.f72423d, this.f72427h);
            builder.setBufferedPosition(this.f72422c);
            builder.setActions(this.f72424e);
            builder.setErrorMessage(this.f72426g);
            Iterator<d> it = this.f72428i.iterator();
            while (it.hasNext()) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) it.next().c();
                if (customAction != null) {
                    builder.addCustomAction(customAction);
                }
            }
            builder.setActiveQueueItemId(this.f72429j);
            b.b(builder, this.f72430k);
            this.f72431l = builder.build();
        }
        return this.f72431l;
    }

    public long m() {
        return this.f72421b;
    }

    public int q() {
        return this.f72420a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f72420a + ", position=" + this.f72421b + ", buffered position=" + this.f72422c + ", speed=" + this.f72423d + ", updated=" + this.f72427h + ", actions=" + this.f72424e + ", error code=" + this.f72425f + ", error message=" + this.f72426g + ", custom actions=" + this.f72428i + ", active item id=" + this.f72429j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f72420a);
        parcel.writeLong(this.f72421b);
        parcel.writeFloat(this.f72423d);
        parcel.writeLong(this.f72427h);
        parcel.writeLong(this.f72422c);
        parcel.writeLong(this.f72424e);
        TextUtils.writeToParcel(this.f72426g, parcel, i11);
        parcel.writeTypedList(this.f72428i);
        parcel.writeLong(this.f72429j);
        parcel.writeBundle(this.f72430k);
        parcel.writeInt(this.f72425f);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f72432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f72433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f72434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f72435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f72436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f72437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f72438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f72439h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f72440i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f72441j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Bundle f72442k;

        public c() {
            this.f72432a = new ArrayList();
            this.f72441j = -1L;
        }

        public c a(d dVar) {
            this.f72432a.add(dVar);
            return this;
        }

        public p b() {
            return new p(this.f72433b, this.f72434c, this.f72435d, this.f72436e, this.f72437f, this.f72438g, this.f72439h, this.f72440i, this.f72432a, this.f72441j, this.f72442k);
        }

        public c c(long j11) {
            this.f72437f = j11;
            return this;
        }

        public c d(long j11) {
            this.f72441j = j11;
            return this;
        }

        public c e(long j11) {
            this.f72435d = j11;
            return this;
        }

        public c f(int i11, CharSequence charSequence) {
            this.f72438g = i11;
            this.f72439h = charSequence;
            return this;
        }

        public c g(Bundle bundle) {
            this.f72442k = bundle;
            return this;
        }

        public c h(int i11, long j11, float f11, long j12) {
            this.f72433b = i11;
            this.f72434c = j11;
            this.f72440i = j12;
            this.f72436e = f11;
            return this;
        }

        public c(p pVar) {
            ArrayList arrayList = new ArrayList();
            this.f72432a = arrayList;
            this.f72441j = -1L;
            this.f72433b = pVar.f72420a;
            this.f72434c = pVar.f72421b;
            this.f72436e = pVar.f72423d;
            this.f72440i = pVar.f72427h;
            this.f72435d = pVar.f72422c;
            this.f72437f = pVar.f72424e;
            this.f72438g = pVar.f72425f;
            this.f72439h = pVar.f72426g;
            List<d> list = pVar.f72428i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f72441j = pVar.f72429j;
            this.f72442k = pVar.f72430k;
        }
    }

    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f72443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f72444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f72446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PlaybackState.CustomAction f72447e;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f72448a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f72449b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f72450c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f72451d;

            public b(String str, CharSequence charSequence, int i11) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i11 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f72448a = str;
                this.f72449b = charSequence;
                this.f72450c = i11;
            }

            public d a() {
                return new d(this.f72448a, this.f72449b, this.f72450c, this.f72451d);
            }

            public b b(Bundle bundle) {
                this.f72451d = bundle;
                return this;
            }
        }

        d(String str, CharSequence charSequence, int i11, Bundle bundle) {
            this.f72443a = str;
            this.f72444b = charSequence;
            this.f72445c = i11;
            this.f72446d = bundle;
        }

        public static d a(Object obj) {
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            l.a(extras);
            d dVar = new d(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            dVar.f72447e = customAction;
            return dVar;
        }

        public String b() {
            return this.f72443a;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.f72447e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f72443a, this.f72444b, this.f72445c);
            builder.setExtras(this.f72446d);
            return builder.build();
        }

        public Bundle d() {
            return this.f72446d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.f72445c;
        }

        public CharSequence f() {
            return this.f72444b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f72444b) + ", mIcon=" + this.f72445c + ", mExtras=" + this.f72446d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f72443a);
            TextUtils.writeToParcel(this.f72444b, parcel, i11);
            parcel.writeInt(this.f72445c);
            parcel.writeBundle(this.f72446d);
        }

        d(Parcel parcel) {
            this.f72443a = (String) s7.a.f(parcel.readString());
            this.f72444b = (CharSequence) s7.a.f((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            this.f72445c = parcel.readInt();
            this.f72446d = parcel.readBundle(l.class.getClassLoader());
        }
    }

    p(Parcel parcel) {
        this.f72420a = parcel.readInt();
        this.f72421b = parcel.readLong();
        this.f72423d = parcel.readFloat();
        this.f72427h = parcel.readLong();
        this.f72422c = parcel.readLong();
        this.f72424e = parcel.readLong();
        this.f72426g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List<d> listCreateTypedArrayList = parcel.createTypedArrayList(d.CREATOR);
        this.f72428i = listCreateTypedArrayList == null ? x.r() : listCreateTypedArrayList;
        this.f72429j = parcel.readLong();
        this.f72430k = parcel.readBundle(l.class.getClassLoader());
        this.f72425f = parcel.readInt();
    }
}
