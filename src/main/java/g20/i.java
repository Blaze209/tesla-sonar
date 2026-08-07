package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001d¨\u0006)"}, d2 = {"Lg20/i;", "", "Lo20/f;", "event", "", "m", "(Lo20/f;)Ljava/util/List;", "Lg20/f;", "state", "f", "(Lo20/f;Lg20/f;)Lg20/f;", "Ls20/b;", "Lr20/b;", "e", "(Ls20/b;Lg20/f;)Ljava/util/List;", "", "", "h", "(Ls20/b;Lg20/f;)Ljava/util/Map;", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ls20/b;)V", "", "b", "(Ls20/b;Lg20/f;)Ljava/lang/Boolean;", "a", "()Ljava/lang/String;", "identifier", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "subscribedEventSchemasForEventsBefore", "c", "subscribedEventSchemasForTransitions", "j", "subscribedEventSchemasForEntitiesGeneration", "k", "subscribedEventSchemasForPayloadUpdating", "l", "subscribedEventSchemasForAfterTrackCallback", "g", "subscribedEventSchemasForFiltering", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface i {
    String a();

    Boolean b(s20.b event, f state);

    List<String> c();

    List<String> d();

    List<r20.b> e(s20.b event, f state);

    f f(o20.f event, f state);

    List<String> g();

    Map<String, Object> h(s20.b event, f state);

    void i(s20.b event);

    List<String> j();

    List<String> k();

    List<String> l();

    List<o20.f> m(o20.f event);
}
