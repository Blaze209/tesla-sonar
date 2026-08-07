package e20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import g20.f;
import g20.i;
import java.util.List;
import java.util.Map;
import o20.g;
import o20.h;
import o20.j;
import o20.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 ¨\u0006,"}, d2 = {"Le20/d;", "Lg20/i;", "<init>", "()V", "Lo20/f;", "event", "Lg20/f;", "state", "f", "(Lo20/f;Lg20/f;)Lg20/f;", "Ls20/b;", "", "Lr20/b;", "e", "(Ls20/b;Lg20/f;)Ljava/util/List;", "", "", "", "h", "(Ls20/b;Lg20/f;)Ljava/util/Map;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ls20/b;)V", "", "b", "(Ls20/b;Lg20/f;)Ljava/lang/Boolean;", "m", "(Lo20/f;)Ljava/util/List;", "a", "()Ljava/lang/String;", "identifier", "c", "()Ljava/util/List;", "subscribedEventSchemasForTransitions", "j", "subscribedEventSchemasForEntitiesGeneration", "k", "subscribedEventSchemasForPayloadUpdating", "l", "subscribedEventSchemasForAfterTrackCallback", "g", "subscribedEventSchemasForFiltering", DateTokenConverter.CONVERTER_KEY, "subscribedEventSchemasForEventsBefore", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e20.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Le20/d$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "ID", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "ScreenSummaryContext";
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
        if (s.f(event.getSchema(), "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0")) {
            return Boolean.valueOf(state != null);
        }
        return Boolean.FALSE;
    }

    @Override // g20.i
    public List<String> c() {
        return v.p("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
    }

    @Override // g20.i
    public List<String> d() {
        return v.e("iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0");
    }

    @Override // g20.i
    public List<r20.b> e(s20.b event, f state) {
        s.k(event, "event");
        c cVar = (c) state;
        if (cVar == null) {
            return null;
        }
        return v.e(new r20.b("iglu:com.snowplowanalytics.mobile/screen_summary/jsonschema/1-0-0", cVar.a()));
    }

    @Override // g20.i
    public f f(o20.f event, f state) {
        s.k(event, "event");
        if (event instanceof j) {
            return new c();
        }
        c cVar = (c) state;
        if (cVar == null) {
            return null;
        }
        if (event instanceof g) {
            cVar.d();
            return state;
        }
        if (event instanceof o20.d) {
            cVar.c();
            return state;
        }
        if (event instanceof o20.i) {
            cVar.b();
            return state;
        }
        if (event instanceof h) {
            cVar.e((h) event);
            return state;
        }
        if (event instanceof k) {
            cVar.f((k) event);
        }
        return state;
    }

    @Override // g20.i
    public List<String> g() {
        return v.p("iglu:com.snowplowanalytics.mobile/list_item_view/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.mobile/scroll_changed/jsonschema/1-0-0");
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
        return v.p("iglu:com.snowplowanalytics.mobile/screen_end/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_foreground/jsonschema/1-0-0", "iglu:com.snowplowanalytics.snowplow/application_background/jsonschema/1-0-0");
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
        return v.e(new o20.i());
    }
}
