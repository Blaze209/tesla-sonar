package ue;

import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lue/k;", "", "<init>", "()V", "", "publicKey", "", "a", "(Ljava/lang/String;)Z", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f116174a = new k();

    private k() {
    }

    public static final boolean a(String publicKey) {
        s.k(publicKey, "publicKey");
        return Pattern.compile("([A-F]|[0-9]){5}\\|([A-F]|[0-9]){512}").matcher(publicKey).find() && publicKey.length() == 518;
    }
}
