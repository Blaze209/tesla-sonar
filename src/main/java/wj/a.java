package wj;

import android.content.Context;
import androidx.annotation.NonNull;
import dj.e;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import xj.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f121977c;

    private a(int i11, e eVar) {
        this.f121976b = i11;
        this.f121977c = eVar;
    }

    @NonNull
    public static e c(@NonNull Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // dj.e
    public void b(@NonNull MessageDigest messageDigest) {
        this.f121977c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f121976b).array());
    }

    @Override // dj.e
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f121976b == aVar.f121976b && this.f121977c.equals(aVar.f121977c)) {
                return true;
            }
        }
        return false;
    }

    @Override // dj.e
    public int hashCode() {
        return l.p(this.f121977c, this.f121976b);
    }
}
