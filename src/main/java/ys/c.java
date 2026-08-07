package ys;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import d6.z;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lys/c;", "Ld6/z;", "", "id", "idToken", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "k", "a", "b", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f125797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f125798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f125799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f125800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f125801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f125802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f125803j;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lys/c$a;", "", "<init>", "()V", "", "displayName", "b", "(Ljava/lang/String;)Lys/c$a;", "familyName", "c", "givenName", DateTokenConverter.CONVERTER_KEY, "id", "e", "idToken", "f", "phoneNumber", "g", "Landroid/net/Uri;", "profilePictureUri", "h", "(Landroid/net/Uri;)Lys/c$a;", "Lys/c;", "a", "()Lys/c;", "Ljava/lang/String;", "Landroid/net/Uri;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f125804a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f125805b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f125806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f125807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f125808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f125809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f125810g;

        public final c a() {
            return new c(this.f125804a, this.f125805b, this.f125806c, this.f125807d, this.f125808e, this.f125809f, this.f125810g);
        }

        public final a b(String displayName) {
            this.f125806c = displayName;
            return this;
        }

        public final a c(String familyName) {
            this.f125807d = familyName;
            return this;
        }

        public final a d(String givenName) {
            this.f125808e = givenName;
            return this;
        }

        public final a e(@NonNull String id2) {
            s.k(id2, "id");
            this.f125804a = id2;
            return this;
        }

        public final a f(@NonNull String idToken) {
            s.k(idToken, "idToken");
            this.f125805b = idToken;
            return this;
        }

        public final a g(String phoneNumber) {
            this.f125810g = phoneNumber;
            return this;
        }

        public final a h(Uri profilePictureUri) {
            this.f125809f = profilePictureUri;
            return this;
        }
    }

    public c(@NonNull String id2, @NonNull String idToken, String str, String str2, String str3, Uri uri, String str4) {
        s.k(id2, "id");
        s.k(idToken, "idToken");
        s.k(id2, "id");
        s.k(idToken, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str4);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f125797d = id2;
        this.f125798e = idToken;
        this.f125799f = str;
        this.f125800g = str2;
        this.f125801h = str3;
        this.f125802i = uri;
        this.f125803j = str4;
        if (id2.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (idToken.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}
