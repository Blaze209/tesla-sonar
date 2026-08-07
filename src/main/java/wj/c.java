package wj;

import androidx.annotation.NonNull;
import dj.e;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f121979b = new c();

    private c() {
    }

    @NonNull
    public static c c() {
        return f121979b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
    }
}
