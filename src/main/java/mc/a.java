package mc;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ec.n;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lmc/a;", "Lmc/i;", "Lmc/j;", "weakMemoryCache", "<init>", "(Lmc/j;)V", "Lmc/d$b;", Action.KEY_ATTRIBUTE, "Lmc/d$c;", "a", "(Lmc/d$b;)Lmc/d$c;", "Lec/n;", "image", "", "", "", "extras", "", "size", "Ljn0/h0;", "c", "(Lmc/d$b;Lec/n;Ljava/util/Map;J)V", "", "b", "(Lmc/d$b;)Z", DateTokenConverter.CONVERTER_KEY, "(J)V", "clear", "()V", "Lmc/j;", "getSize", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j weakMemoryCache;

    public a(j jVar) {
        this.weakMemoryCache = jVar;
    }

    @Override // mc.i
    public d.Value a(d.Key key) {
        return null;
    }

    @Override // mc.i
    public boolean b(d.Key key) {
        return false;
    }

    @Override // mc.i
    public void c(d.Key key, n image, Map<String, ? extends Object> extras, long size) {
        this.weakMemoryCache.c(key, image, extras, size);
    }

    @Override // mc.i
    public long getSize() {
        return 0L;
    }

    @Override // mc.i
    public void clear() {
    }

    @Override // mc.i
    public void d(long size) {
    }
}
