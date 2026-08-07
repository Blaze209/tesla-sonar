package o20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import h20.o;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001b¨\u0006\""}, d2 = {"Lo20/a;", "Lo20/f;", "<init>", "()V", "Lh20/o;", "tracker", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lh20/o;)V", "c", "", "Lr20/b;", "a", "Ljava/util/List;", "_entities", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setTrueTimestamp", "(Ljava/lang/Long;)V", "trueTimestamp", "", "Z", "isProcessing", "value", "getEntities", "()Ljava/util/List;", "setEntities", "(Ljava/util/List;)V", "entities", "", "e", "entitiesForProcessing", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<r20.b> _entities = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Long trueTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    @Override // o20.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public Long getTrueTimestamp() {
        return this.trueTimestamp;
    }

    @Override // o20.f
    public void c(o tracker) {
        s.k(tracker, "tracker");
        this.isProcessing = false;
    }

    @Override // o20.f
    public void d(o tracker) {
        s.k(tracker, "tracker");
        this.isProcessing = true;
    }

    public List<r20.b> e() {
        return null;
    }

    @Override // o20.f
    public List<r20.b> getEntities() {
        List<r20.b> listE;
        return (!this.isProcessing || (listE = e()) == null) ? this._entities : v.p1(v.P0(this._entities, listE));
    }
}
