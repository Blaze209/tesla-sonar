package wl;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ql.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lwl/a;", "Lql/d;", "Lhm/a;", "animatedDrawableBackend", "<init>", "(Lhm/a;)V", "", "a", "()I", "frameNumber", "j", "(I)I", "b", IntegerTokenConverter.CONVERTER_KEY, "l", "g", "Lhm/a;", "animated-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hm.a animatedDrawableBackend;

    public a(hm.a animatedDrawableBackend) {
        s.k(animatedDrawableBackend, "animatedDrawableBackend");
        this.animatedDrawableBackend = animatedDrawableBackend;
    }

    @Override // ql.d
    public int a() {
        return this.animatedDrawableBackend.a();
    }

    @Override // ql.d
    public int b() {
        return this.animatedDrawableBackend.b();
    }

    @Override // ql.d
    public int g() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // ql.d
    public int i() {
        return this.animatedDrawableBackend.g();
    }

    @Override // ql.d
    public int j(int frameNumber) {
        return this.animatedDrawableBackend.d(frameNumber);
    }

    @Override // ql.d
    public int l() {
        return this.animatedDrawableBackend.getWidth();
    }
}
