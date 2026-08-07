package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f1770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f1771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f1772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f1773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f1774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f1775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f1776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaDescription f1777i;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i11) {
            return new MediaDescriptionCompat[i11];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f1779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f1780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f1781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f1782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f1783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f1784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f1785h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f1778a, this.f1779b, this.f1780c, this.f1781d, this.f1782e, this.f1783f, this.f1784g, this.f1785h);
        }

        public d b(CharSequence charSequence) {
            this.f1781d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f1784g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f1782e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f1783f = uri;
            return this;
        }

        public d f(String str) {
            this.f1778a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f1785h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f1780c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f1779b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1769a = str;
        this.f1770b = charSequence;
        this.f1771c = charSequence2;
        this.f1772d = charSequence3;
        this.f1773e = bitmap;
        this.f1774f = uri;
        this.f1775g = bundle;
        this.f1776h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f1777i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f1777i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f1769a);
        b.p(builderB, this.f1770b);
        b.o(builderB, this.f1771c);
        b.j(builderB, this.f1772d);
        b.l(builderB, this.f1773e);
        b.m(builderB, this.f1774f);
        b.k(builderB, this.f1775g);
        c.b(builderB, this.f1776h);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f1777i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f1770b) + ", " + ((Object) this.f1771c) + ", " + ((Object) this.f1772d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        ((MediaDescription) b()).writeToParcel(parcel, i11);
    }
}
