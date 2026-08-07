package pi;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.apollographql.apollo3.exception.ApolloException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import ji.HttpHeader;
import okio.c0;
import okio.g0;
import okio.j;
import okio.k;
import okio.r0;
import okio.s0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\u00060\u0001j\u0002`\u0002:\u0003\u0013\u0015\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u001c\u0010,\u001a\b\u0018\u00010)R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lpi/i;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lokio/j;", "source", "", "boundary", "<init>", "(Lokio/j;Ljava/lang/String;)V", "", "maxResult", "t", "(J)J", "Lpi/i$b;", "B", "()Lpi/i$b;", "Ljn0/h0;", "close", "()V", "a", "Lokio/j;", "b", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lokio/k;", "c", "Lokio/k;", "dashDashBoundary", DateTokenConverter.CONVERTER_KEY, "crlfDashDashBoundary", "", "e", "I", "partCount", "", "f", "Z", "closed", "g", "noMoreParts", "Lpi/i$c;", "h", "Lpi/i$c;", "currentPart", "Lokio/g0;", IntegerTokenConverter.CONVERTER_KEY, "Lokio/g0;", "afterBoundaryOptions", "j", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i implements Closeable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f103023j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k dashDashBoundary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k crlfDashDashBoundary;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int partCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean noMoreParts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private c currentPart;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g0 afterBoundaryOptions;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpi/i$a;", "", "<init>", "()V", "Lokio/j;", "source", "", "Lji/d;", "b", "(Lokio/j;)Ljava/util/List;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<HttpHeader> b(j source) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String strW2 = source.w2();
                if (strW2.length() == 0) {
                    return arrayList;
                }
                int iU0 = t.u0(strW2, CoreConstants.COLON_CHAR, 0, false, 6, null);
                if (iU0 == -1) {
                    throw new IllegalStateException(("Unexpected header: " + strW2).toString());
                }
                String strSubstring = strW2.substring(0, iU0);
                s.j(strSubstring, "substring(...)");
                String string = t.F1(strSubstring).toString();
                String strSubstring2 = strW2.substring(iU0 + 1);
                s.j(strSubstring2, "substring(...)");
                arrayList.add(new HttpHeader(string, t.F1(strSubstring2).toString()));
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpi/i$b;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "Lji/d;", "headers", "Lokio/j;", "body", "<init>", "(Ljava/util/List;Lokio/j;)V", "Ljn0/h0;", "close", "()V", "a", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "b", "Lokio/j;", "c", "()Lokio/j;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final j body;

        public b(List<HttpHeader> headers, j body) {
            s.k(headers, "headers");
            s.k(body, "body");
            this.headers = headers;
            this.body = body;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final j getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpi/i$c;", "Lokio/r0;", "<init>", "(Lpi/i;)V", "Ljn0/h0;", "close", "()V", "Lokio/h;", "sink", "", "byteCount", "read", "(Lokio/h;J)J", "Lokio/s0;", "timeout", "()Lokio/s0;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class c implements r0 {
        public c() {
        }

        @Override // okio.r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.f(i.this.currentPart, this)) {
                i.this.currentPart = null;
            }
        }

        @Override // okio.r0
        public long read(okio.h sink, long byteCount) {
            s.k(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!s.f(i.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            long jT = i.this.t(byteCount);
            if (jT == 0) {
                return -1L;
            }
            return i.this.source.read(sink, jT);
        }

        @Override // okio.r0
        /* JADX INFO: renamed from: timeout */
        public s0 getTimeout() {
            return i.this.source.getTimeout();
        }
    }

    public i(j source, String boundary) {
        s.k(source, "source");
        s.k(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new okio.h().l2("--").l2(boundary).m1();
        this.crlfDashDashBoundary = new okio.h().l2("\r\n--").l2(boundary).m1();
        g0.Companion companion = g0.INSTANCE;
        k.Companion companion2 = k.INSTANCE;
        this.afterBoundaryOptions = companion.d(companion2.f("\r\n--" + boundary + "--"), companion2.f("\r\n"), companion2.f("--"), companion2.f(" "), companion2.f(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long t(long maxResult) {
        this.source.D2(this.crlfDashDashBoundary.D());
        long jZ = this.source.getBufferField().Z(this.crlfDashDashBoundary);
        return jZ == -1 ? Math.min(maxResult, (this.source.getBufferField().getSize() - ((long) this.crlfDashDashBoundary.D())) + 1) : Math.min(maxResult, jZ);
    }

    public final b B() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.l0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.D());
        } else {
            while (true) {
                long jT = t(FileAppender.DEFAULT_BUFFER_SIZE);
                if (jT == 0) {
                    break;
                }
                this.source.skip(jT);
            }
            this.source.skip(this.crlfDashDashBoundary.D());
        }
        boolean z11 = false;
        while (true) {
            int iM3 = this.source.M3(this.afterBoundaryOptions);
            if (iM3 == -1) {
                throw new ApolloException("unexpected characters after boundary", null, 2, null);
            }
            if (iM3 == 0) {
                if (this.partCount == 0) {
                    throw new ApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (iM3 == 1) {
                this.partCount++;
                List listB = f103023j.b(this.source);
                c cVar = new c();
                this.currentPart = cVar;
                return new b(listB, c0.d(cVar));
            }
            if (iM3 == 2) {
                if (z11) {
                    throw new ApolloException("unexpected characters after boundary", null, 2, null);
                }
                if (this.partCount == 0) {
                    throw new ApolloException("expected at least 1 part", null, 2, null);
                }
                this.noMoreParts = true;
                return null;
            }
            if (iM3 == 3 || iM3 == 4) {
                z11 = true;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }
}
