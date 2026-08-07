package ha;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final androidx.collection.a<String, Integer> f72364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f72365d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Bundle f72366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaMetadata f72367b;

    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i11) {
            return new k[i11];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f72368a = new Bundle();

        public k a() {
            return new k(this.f72368a);
        }

        public b b(String str, Bitmap bitmap) {
            Integer num = k.f72364c.get(str);
            if (num == null || num.intValue() == 2) {
                this.f72368a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public b c(String str, long j11) {
            Integer num = k.f72364c.get(str);
            if (num == null || num.intValue() == 0) {
                this.f72368a.putLong(str, j11);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public b d(String str, q qVar) {
            Integer num = k.f72364c.get(str);
            if (num == null || num.intValue() == 3) {
                this.f72368a.putParcelable(str, (Parcelable) qVar.c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public b e(String str, String str2) {
            Integer num = k.f72364c.get(str);
            if (num == null || num.intValue() == 1) {
                this.f72368a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public b f(String str, CharSequence charSequence) {
            Integer num = k.f72364c.get(str);
            if (num == null || num.intValue() == 1) {
                this.f72368a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }
    }

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        f72364c = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f72365d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new a();
    }

    k(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f72366a = bundle2;
        l.a(bundle2);
    }

    public static k b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        k kVarCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        kVarCreateFromParcel.f72367b = mediaMetadata;
        return kVarCreateFromParcel;
    }

    public boolean a(String str) {
        return this.f72366a.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.f72366a.getParcelable(str);
        } catch (Exception e11) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e11);
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.f72366a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e(String str) {
        return this.f72366a.getLong(str, 0L);
    }

    public MediaMetadata f() {
        if (this.f72367b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : this.f72366a.keySet()) {
                Integer num = f72364c.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, this.f72366a.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, this.f72366a.getString(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) this.f72366a.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = this.f72366a.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) this.f72366a.getParcelable(str));
                }
            }
            this.f72367b = builder.build();
        }
        return this.f72367b;
    }

    public q g(String str) {
        try {
            return q.a(this.f72366a.getParcelable(str));
        } catch (Exception e11) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e11);
            return null;
        }
    }

    public String h(String str) {
        CharSequence charSequence = this.f72366a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence i(String str) {
        return this.f72366a.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeBundle(this.f72366a);
    }

    k(Parcel parcel) {
        this.f72366a = (Bundle) s7.a.f(parcel.readBundle(l.class.getClassLoader()));
    }
}
