package si;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ii.r;
import java.util.List;
import ji.HttpHeader;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lsi/d;", "Lii/r$c;", "", "startMillis", "endMillis", "", "statusCode", "", "Lji/d;", "headers", "<init>", "(JJILjava/util/List;)V", "c", "J", "getStartMillis", "()J", DateTokenConverter.CONVERTER_KEY, "getEndMillis", "e", "I", "getStatusCode", "()I", "f", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "Lii/r$d;", "getKey", "()Lii/r$d;", Action.KEY_ATTRIBUTE, "g", "a", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements r.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long startMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long endMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* JADX INFO: renamed from: si.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsi/d$a;", "Lii/r$d;", "Lsi/d;", "<init>", "()V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion implements r.d<d> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @jn0.e
    public d(long j11, long j12, int i11, List<HttpHeader> headers) {
        s.k(headers, "headers");
        this.startMillis = j11;
        this.endMillis = j12;
        this.statusCode = i11;
        this.headers = headers;
    }

    @Override // ii.r.c, ii.r
    public <E extends r.c> E a(r.d<E> dVar) {
        return (E) r.c.a.b(this, dVar);
    }

    @Override // ii.r
    public r b(r.d<?> dVar) {
        return r.c.a.c(this, dVar);
    }

    @Override // ii.r
    public r c(r rVar) {
        return r.c.a.d(this, rVar);
    }

    @Override // ii.r
    public <R> R fold(R r11, p<? super R, ? super r.c, ? extends R> pVar) {
        return (R) r.c.a.a(this, r11, pVar);
    }

    @Override // ii.r.c
    public r.d<?> getKey() {
        return INSTANCE;
    }
}
