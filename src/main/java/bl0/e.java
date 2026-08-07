package bl0;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@jn0.e
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbl0/e;", "Lbl0/k;", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "toString", "()Ljava/lang/String;", "", "c", "()Z", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f17600c = new e();

    private e() {
    }

    @Override // dl0.w
    public Set<Map.Entry<String, List<String>>> a() {
        return d1.d();
    }

    @Override // dl0.w
    public List<String> b(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return null;
    }

    @Override // dl0.w
    /* JADX INFO: renamed from: c */
    public boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // dl0.w
    public void d(wn0.p<? super String, ? super List<String>, jn0.h0> pVar) {
        k.b.a(this, pVar);
    }

    @Override // dl0.w
    public String get(String str) {
        return k.b.b(this, str);
    }

    @Override // dl0.w
    public Set<String> names() {
        return d1.d();
    }

    public String toString() {
        return "Headers " + a();
    }
}
