package te;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ue.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lte/a;", "", "<init>", "()V", "Lte/c;", "unencryptedCard", "", "publicKey", "Lte/b;", "a", "(Lte/c;Ljava/lang/String;)Lte/b;", "Lue/b;", "b", "Lue/b;", "encryptor", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f113237a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ue.b encryptor = d.f116159a.a();

    private a() {
    }

    public final EncryptedCard a(c unencryptedCard, String publicKey) {
        s.k(unencryptedCard, "unencryptedCard");
        s.k(publicKey, "publicKey");
        return encryptor.a(unencryptedCard, publicKey);
    }
}
