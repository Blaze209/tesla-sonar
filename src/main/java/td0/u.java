package td0;

import io.realm.m0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltd0/u;", "Lio/realm/m0;", "<init>", "()V", "Lio/realm/h;", "realm", "", "oldVersion", "newVersion", "Ljn0/h0;", "a", "(Lio/realm/h;JJ)V", "realm_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements m0 {
    @Override // io.realm.m0
    public void a(io.realm.h realm, long oldVersion, long newVersion) {
        p013kotlin.jvm.internal.s.k(realm, "realm");
        if (oldVersion == 2) {
            p.b(realm);
        }
    }
}
