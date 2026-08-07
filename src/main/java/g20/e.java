package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\r\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010*R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010*¨\u00066"}, d2 = {"Lg20/e;", "Lg20/i;", "", "identifier", "Lk20/k;", "entitiesConfiguration", "Lk20/h;", "afterTrackConfiguration", "Lk20/m;", "filterConfiguration", "<init>", "(Ljava/lang/String;Lk20/k;Lk20/h;Lk20/m;)V", "Lo20/f;", "event", "Lg20/f;", "state", "f", "(Lo20/f;Lg20/f;)Lg20/f;", "Ls20/b;", "", "Lr20/b;", "e", "(Ls20/b;Lg20/f;)Ljava/util/List;", "", "", "h", "(Ls20/b;Lg20/f;)Ljava/util/Map;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ls20/b;)V", "", "b", "(Ls20/b;Lg20/f;)Ljava/lang/Boolean;", "m", "(Lo20/f;)Ljava/util/List;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "Lk20/k;", "getEntitiesConfiguration", "()Lk20/k;", "c", "()Ljava/util/List;", "subscribedEventSchemasForTransitions", "j", "subscribedEventSchemasForEntitiesGeneration", "k", "subscribedEventSchemasForPayloadUpdating", "l", "subscribedEventSchemasForAfterTrackCallback", "g", "subscribedEventSchemasForFiltering", DateTokenConverter.CONVERTER_KEY, "subscribedEventSchemasForEventsBefore", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k20.k entitiesConfiguration;

    public e(String identifier, k20.k kVar, k20.h hVar, k20.m mVar) {
        s.k(identifier, "identifier");
        this.identifier = identifier;
        this.entitiesConfiguration = kVar;
    }

    @Override // g20.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // g20.i
    public Boolean b(s20.b event, f state) {
        s.k(event, "event");
        return null;
    }

    @Override // g20.i
    public List<String> c() {
        return v.m();
    }

    @Override // g20.i
    public List<String> d() {
        return v.m();
    }

    @Override // g20.i
    public List<r20.b> e(s20.b event, f state) {
        Function<s20.b, List<r20.b>> functionA;
        s.k(event, "event");
        k20.k kVar = this.entitiesConfiguration;
        List<r20.b> listApply = (kVar == null || (functionA = kVar.a()) == null) ? null : functionA.apply(event);
        return listApply == null ? v.m() : listApply;
    }

    @Override // g20.i
    public f f(o20.f event, f state) {
        s.k(event, "event");
        return null;
    }

    @Override // g20.i
    public List<String> g() {
        return v.m();
    }

    @Override // g20.i
    public Map<String, Object> h(s20.b event, f state) {
        s.k(event, "event");
        return null;
    }

    @Override // g20.i
    public void i(s20.b event) {
        s.k(event, "event");
    }

    @Override // g20.i
    public List<String> j() {
        k20.k kVar = this.entitiesConfiguration;
        if (kVar == null) {
            return v.m();
        }
        List<String> listB = kVar.b();
        if (listB != null) {
            return listB;
        }
        List<String> listSingletonList = Collections.singletonList(Marker.ANY_MARKER);
        s.j(listSingletonList, "singletonList(\"*\")");
        return listSingletonList;
    }

    @Override // g20.i
    public List<String> k() {
        return v.m();
    }

    @Override // g20.i
    public List<String> l() {
        return v.m();
    }

    @Override // g20.i
    public List<o20.f> m(o20.f event) {
        s.k(event, "event");
        return null;
    }
}
