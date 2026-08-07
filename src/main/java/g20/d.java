package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010!¨\u0006-"}, d2 = {"Lg20/d;", "Lg20/i;", "<init>", "()V", "Lo20/f;", "event", "Lg20/f;", "currentState", "f", "(Lo20/f;Lg20/f;)Lg20/f;", "Ls20/b;", "state", "", "Lr20/b;", "e", "(Ls20/b;Lg20/f;)Ljava/util/List;", "", "", "", "h", "(Ls20/b;Lg20/f;)Ljava/util/Map;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ls20/b;)V", "", "b", "(Ls20/b;Lg20/f;)Ljava/lang/Boolean;", "m", "(Lo20/f;)Ljava/util/List;", "a", "()Ljava/lang/String;", "identifier", "c", "()Ljava/util/List;", "subscribedEventSchemasForTransitions", "j", "subscribedEventSchemasForEntitiesGeneration", "k", "subscribedEventSchemasForPayloadUpdating", "l", "subscribedEventSchemasForAfterTrackCallback", "g", "subscribedEventSchemasForFiltering", DateTokenConverter.CONVERTER_KEY, "subscribedEventSchemasForEventsBefore", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g20.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lg20/d$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "ID", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "Lifecycle";
        }

        private Companion() {
        }
    }

    @Override // g20.i
    /* JADX INFO: renamed from: a */
    public String getIdentifier() {
        return INSTANCE.a();
    }

    @Override // g20.i
    public Boolean b(s20.b event, f state) {
        s.k(event, "event");
        return null;
    }

    @Override // g20.i
    public List<String> c() {
        return v.p("iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0");
    }

    @Override // g20.i
    public List<String> d() {
        return v.m();
    }

    @Override // g20.i
    public List<r20.b> e(s20.b event, f state) {
        s.k(event, "event");
        if (state == null) {
            return v.e(new n20.c(true));
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar != null) {
            return v.e(new n20.c(cVar.getIsForeground()).e(cVar.getIndex()));
        }
        return null;
    }

    @Override // g20.i
    public f f(o20.f event, f currentState) {
        s.k(event, "event");
        if (event instanceof o20.g) {
            return new c(true, ((o20.g) event).getForegroundIndex());
        }
        if (event instanceof o20.d) {
            return new c(false, ((o20.d) event).getBackgroundIndex());
        }
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
        return v.e(Marker.ANY_MARKER);
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
