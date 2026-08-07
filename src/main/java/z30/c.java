package z30;

import android.os.SystemClock;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lz30/c;", "Lz30/d;", "<init>", "()V", "Lz30/d$b;", Action.KEY_ATTRIBUTE, "", "reset", "Ljn0/h0;", "a", "(Lz30/d$b;Z)V", "Lio0/b;", "b", "(Lz30/d$b;)Lio0/b;", "", "", "Ljava/util/Map;", PlaceTypes.STORE, "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f126808c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<d.b, Long> store = new LinkedHashMap();

    /* JADX INFO: renamed from: z30.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz30/c$a;", "", "<init>", "()V", "Lz30/c;", "instance", "Lz30/c;", "a", "()Lz30/c;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f126808c;
        }

        private Companion() {
        }
    }

    private c() {
    }

    @Override // z30.d
    public void a(d.b key, boolean reset) {
        s.k(key, "key");
        if (reset || !this.store.containsKey(key)) {
            this.store.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // z30.d
    public io0.b b(d.b key) {
        s.k(key, "key");
        Long lRemove = this.store.remove(key);
        if (lRemove == null) {
            return null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - lRemove.longValue();
        io0.b.Companion companion = io0.b.INSTANCE;
        return io0.b.f(io0.d.t(jUptimeMillis, io0.e.MILLISECONDS));
    }
}
