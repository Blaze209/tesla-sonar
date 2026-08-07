package sl;

import android.net.Uri;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\rB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lsl/a;", "Ljk/d;", "", "imageId", "", "deepEquals", "<init>", "(IZ)V", "Landroid/net/Uri;", "uri", "c", "(Landroid/net/Uri;)Z", "", "a", "()Ljava/lang/String;", "b", "()Z", "", "o", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Z", "Ljava/lang/String;", "animationUriString", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements jk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean deepEquals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String animationUriString;

    public a(int i11, boolean z11) {
        this.deepEquals = z11;
        this.animationUriString = "anim://" + i11;
    }

    @Override // jk.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getAnimationUriString() {
        return this.animationUriString;
    }

    @Override // jk.d
    public boolean b() {
        return false;
    }

    @Override // jk.d
    public boolean c(Uri uri) {
        s.k(uri, "uri");
        String string = uri.toString();
        s.j(string, "toString(...)");
        return t.b0(string, this.animationUriString, false, 2, null);
    }

    @Override // jk.d
    public boolean equals(Object o11) {
        if (!this.deepEquals) {
            return super.equals(o11);
        }
        if (this == o11) {
            return true;
        }
        if (o11 == null || !s.f(a.class, o11.getClass())) {
            return false;
        }
        return s.f(this.animationUriString, ((a) o11).animationUriString);
    }

    @Override // jk.d
    public int hashCode() {
        return !this.deepEquals ? super.hashCode() : this.animationUriString.hashCode();
    }
}
