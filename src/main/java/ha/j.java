package ha;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f72347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f72348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f72349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f72350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f72351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f72352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f72353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f72354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaDescription f72355i;

    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return j.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    private static class b {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f72356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f72357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f72358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f72359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f72360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f72361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f72362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f72363h;

        public j a() {
            return new j(this.f72356a, this.f72357b, this.f72358c, this.f72359d, this.f72360e, this.f72361f, this.f72362g, this.f72363h);
        }

        public c b(CharSequence charSequence) {
            this.f72359d = charSequence;
            return this;
        }

        public c c(Bundle bundle) {
            this.f72362g = bundle;
            return this;
        }

        public c d(Bitmap bitmap) {
            this.f72360e = bitmap;
            return this;
        }

        public c e(Uri uri) {
            this.f72361f = uri;
            return this;
        }

        public c f(String str) {
            this.f72356a = str;
            return this;
        }

        public c g(Uri uri) {
            this.f72363h = uri;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.f72358c = charSequence;
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f72357b = charSequence;
            return this;
        }
    }

    j(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f72347a = str;
        this.f72348b = charSequence;
        this.f72349c = charSequence2;
        this.f72350d = charSequence3;
        this.f72351e = bitmap;
        this.f72352f = uri;
        this.f72353g = bundle;
        this.f72354h = uri2;
    }

    public static j a(MediaDescription mediaDescription) {
        c cVar = new c();
        cVar.f(mediaDescription.getMediaId());
        cVar.i(mediaDescription.getTitle());
        cVar.h(mediaDescription.getSubtitle());
        cVar.b(mediaDescription.getDescription());
        cVar.d(mediaDescription.getIconBitmap());
        cVar.e(mediaDescription.getIconUri());
        Bundle bundleY = l.y(mediaDescription.getExtras());
        if (bundleY != null) {
            bundleY = new Bundle(bundleY);
        }
        Uri uri = null;
        if (bundleY != null) {
            Uri uri2 = (Uri) bundleY.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri2 != null) {
                if (bundleY.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleY.size() == 2) {
                    bundleY = null;
                } else {
                    bundleY.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleY.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            uri = uri2;
        }
        cVar.c(bundleY);
        if (uri != null) {
            cVar.g(uri);
        } else {
            cVar.g(b.a(mediaDescription));
        }
        j jVarA = cVar.a();
        jVarA.f72355i = mediaDescription;
        return jVarA;
    }

    public CharSequence b() {
        return this.f72350d;
    }

    public Bundle c() {
        return this.f72353g;
    }

    public Bitmap d() {
        return this.f72351e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.f72352f;
    }

    public MediaDescription f() {
        MediaDescription mediaDescription = this.f72355i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f72347a);
        builder.setTitle(this.f72348b);
        builder.setSubtitle(this.f72349c);
        builder.setDescription(this.f72350d);
        builder.setIconBitmap(this.f72351e);
        builder.setIconUri(this.f72352f);
        builder.setExtras(this.f72353g);
        b.b(builder, this.f72354h);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.f72355i = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    public String g() {
        return this.f72347a;
    }

    public Uri h() {
        return this.f72354h;
    }

    public CharSequence i() {
        return this.f72349c;
    }

    public CharSequence j() {
        return this.f72348b;
    }

    public String toString() {
        return ((Object) this.f72348b) + ", " + ((Object) this.f72349c) + ", " + ((Object) this.f72350d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        f().writeToParcel(parcel, i11);
    }
}
