package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class KeyType extends MediaTypeParameter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b<KeyType> f63561d = new b<>(KeyType.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KeyType f63562e = new KeyType("PGP", "application/pgp-keys", "pgp");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KeyType f63563f = new KeyType("GPG", "application/gpg", "gpg");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KeyType f63564g = new KeyType("X509", "application/x509", null);

    private KeyType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static KeyType f(String str, String str2, String str3) {
        return f63561d.d(new String[]{str, str2, str3});
    }

    public static KeyType g(String str, String str2, String str3) {
        return f63561d.e(new String[]{str, str2, str3});
    }
}
