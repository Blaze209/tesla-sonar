package y20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B#\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00028\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f*\u00180\u000eR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00028\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly20/b;", "P", "S", Gender.OTHER, "Ly20/r;", "Ly20/o;", "worker", "", "renderKey", "output", "<init>", "(Ly20/o;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Ly20/r$c;", "Ljn0/h0;", "a", "(Ly20/r$c;)V", "c", "Ly20/o;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "e", "Ljava/lang/Object;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class b<P, S, O> extends r<P, S, O> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final o<?> worker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final O output;

    public b(o<?> worker, String renderKey, O o11) {
        p013kotlin.jvm.internal.s.k(worker, "worker");
        p013kotlin.jvm.internal.s.k(renderKey, "renderKey");
        this.worker = worker;
        this.key = renderKey;
        this.output = o11;
    }

    @Override // y20.r
    public void a(r<? super P, S, ? extends O>.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        cVar.d(this.output);
    }

    public String toString() {
        return ((Object) o0.b(b.class).c()) + "(worker=" + this.worker + ", key=\"" + this.key + "\")";
    }
}
