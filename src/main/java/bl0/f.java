package bl0;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lbl0/f;", "Lbl0/x;", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f17601c = new f();

    private f() {
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
        x.b.a(this, pVar);
    }

    public boolean equals(Object other) {
        return (other instanceof x) && ((x) other).isEmpty();
    }

    @Override // dl0.w
    public boolean isEmpty() {
        return true;
    }

    @Override // dl0.w
    public Set<String> names() {
        return d1.d();
    }

    public String toString() {
        return "Parameters " + a();
    }
}
