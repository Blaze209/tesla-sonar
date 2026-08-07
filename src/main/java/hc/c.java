package hc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.c0;
import okio.i;
import okio.i0;
import okio.j;
import okio.o;
import okio.p;
import okio.p0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import wn0.l;
import yc.f0;
import yc.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0005*\u0001b\b\u0000\u0018\u0000 e2\u00060\u0001j\u0002`\u0002:\u0004<8:6B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J#\u0010 \u001a\u00020\u00102\n\u0010\u001d\u001a\u00060\u001cR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001e2\n\u0010%\u001a\u00060$R\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\u001e\u00101\u001a\b\u0018\u000100R\u00020\u00002\u0006\u0010-\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010@\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00107R$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060$R\u00020\u00000C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010O\u001a\u00060Kj\u0002`L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00109R\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010;R\u0018\u0010V\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010XR\u0016\u0010_\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010XR\u0016\u0010a\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010XR\u0014\u0010\u0004\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lhc/c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lokio/o;", "fileSystem", "Lokio/i0;", "directory", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "", "maxSize", "", "appVersion", "valueCount", "<init>", "(Lokio/o;Lokio/i0;Lkotlin/coroutines/CoroutineContext;JII)V", "Ljn0/h0;", "J0", "()V", "Lokio/i;", "D0", "()Lokio/i;", "", "line", "K0", "(Ljava/lang/String;)V", "H0", "Y0", "Lhc/c$b;", "editor", "", "success", "r0", "(Lhc/c$b;Z)V", "y0", "()Z", "Lhc/c$c;", "entry", "O0", "(Lhc/c$c;)Z", "n0", "T0", "P0", "s0", "z0", Action.KEY_ATTRIBUTE, "U0", "w0", "Lhc/c$d;", "u0", "(Ljava/lang/String;)Lhc/c$d;", "t0", "(Ljava/lang/String;)Lhc/c$b;", "close", "a", "Lokio/i0;", "b", "J", "c", "I", DateTokenConverter.CONVERTER_KEY, "e", "journalFile", "f", "journalFileTmp", "g", "journalFileBackup", "", "h", "Ljava/util/Map;", "lruEntries", "Lkotlinx/coroutines/CoroutineScope;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "cleanupScope", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "j", "Ljava/lang/Object;", "lock", "k", "size", "l", "operationsSinceRewrite", "m", "Lokio/i;", "journalWriter", "n", "Z", "hasJournalErrors", "o", "initialized", "p", "closed", "q", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "hc/c$e", "s", "Lhc/c$e;", "t", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final q f72484u = new q("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 directory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i0 journalFile;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i0 journalFileTmp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i0 journalFileBackup;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C1520c> lruEntries;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope cleanupScope;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int operationsSinceRewrite;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private i journalWriter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final e fileSystem;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lhc/c$b;", "", "Lhc/c$c;", "Lhc/c;", "entry", "<init>", "(Lhc/c;Lhc/c$c;)V", "", "success", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Z)V", "", "index", "Lokio/i0;", "f", "(I)Lokio/i0;", "e", "()V", "b", "Lhc/c$d;", "c", "()Lhc/c$d;", "a", "Lhc/c$c;", "g", "()Lhc/c$c;", "Z", "closed", "", "[Z", "h", "()[Z", "written", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C1520c entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean[] written;

        public b(C1520c c1520c) {
            this.entry = c1520c;
            this.written = new boolean[c.this.valueCount];
        }

        private final void d(boolean success) {
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                try {
                    if (this.closed) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (s.f(this.entry.getCurrentEditor(), this)) {
                        cVar.r0(this, success);
                    }
                    this.closed = true;
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d dVarU0;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                b();
                dVarU0 = cVar.u0(this.entry.getKey());
            }
            return dVarU0;
        }

        public final void e() {
            if (s.f(this.entry.getCurrentEditor(), this)) {
                this.entry.m(true);
            }
        }

        public final i0 f(int index) {
            i0 i0Var;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                if (this.closed) {
                    throw new IllegalStateException("editor is closed");
                }
                this.written[index] = true;
                i0 i0Var2 = this.entry.c().get(index);
                k.b(cVar.fileSystem, i0Var2, false, 2, null);
                i0Var = i0Var2;
            }
            return i0Var;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C1520c getEntry() {
            return this.entry;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }
    }

    /* JADX INFO: renamed from: hc.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0013\u0010\"R'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b \u0010\"R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u00105\u001a\b\u0018\u000100R\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00101\u001a\u0004\b\u0018\u00102\"\u0004\b3\u00104R\"\u0010;\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b,\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lhc/c$c;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Lhc/c;Ljava/lang/String;)V", "", "strings", "Ljn0/h0;", "j", "(Ljava/util/List;)V", "Lokio/i;", "writer", "o", "(Lokio/i;)V", "Lhc/c$d;", "Lhc/c;", "n", "()Lhc/c$d;", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "Ljava/util/ArrayList;", "Lokio/i0;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "l", "(Z)V", "readable", "f", "h", "m", "zombie", "Lhc/c$b;", "Lhc/c$b;", "()Lhc/c$b;", IntegerTokenConverter.CONVERTER_KEY, "(Lhc/c$b;)V", "currentEditor", "", "I", "()I", "k", "(I)V", "lockingSnapshotCount", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C1520c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<i0> cleanFiles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<i0> dirtyFiles;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private b currentEditor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int lockingSnapshotCount;

        public C1520c(String str) {
            this.key = str;
            this.lengths = new long[c.this.valueCount];
            this.cleanFiles = new ArrayList<>(c.this.valueCount);
            this.dirtyFiles = new ArrayList<>(c.this.valueCount);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(CoreConstants.DOT);
            int length = sb2.length();
            int i11 = c.this.valueCount;
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(i12);
                this.cleanFiles.add(c.this.directory.i(sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(c.this.directory.i(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final ArrayList<i0> a() {
            return this.cleanFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        public final ArrayList<i0> c() {
            return this.dirtyFiles;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getLockingSnapshotCount() {
            return this.lockingSnapshotCount;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void i(b bVar) {
            this.currentEditor = bVar;
        }

        public final void j(List<String> strings) throws IOException {
            if (strings.size() != c.this.valueCount) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.lengths[i11] = Long.parseLong(strings.get(i11));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void k(int i11) {
            this.lockingSnapshotCount = i11;
        }

        public final void l(boolean z11) {
            this.readable = z11;
        }

        public final void m(boolean z11) {
            this.zombie = z11;
        }

        public final d n() {
            if (!this.readable || this.currentEditor != null || this.zombie) {
                return null;
            }
            ArrayList<i0> arrayList = this.cleanFiles;
            c cVar = c.this;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!cVar.fileSystem.J(arrayList.get(i11))) {
                    try {
                        cVar.O0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.lockingSnapshotCount++;
            return c.this.new d(this);
        }

        public final void o(i writer) {
            for (long j11 : this.lengths) {
                writer.writeByte(32).I0(j11);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0005\u001a\u00060\u0003R\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhc/c$d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lhc/c$c;", "Lhc/c;", "entry", "<init>", "(Lhc/c;Lhc/c$c;)V", "", "index", "Lokio/i0;", "n", "(I)Lokio/i0;", "Ljn0/h0;", "close", "()V", "Lhc/c$b;", "c", "()Lhc/c$b;", "a", "Lhc/c$c;", "getEntry", "()Lhc/c$c;", "", "b", "Z", "closed", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C1520c entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public d(C1520c c1520c) {
            this.entry = c1520c;
        }

        public final b c() {
            b bVarT0;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                close();
                bVarT0 = cVar.t0(this.entry.getKey());
            }
            return bVarT0;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Object obj = c.this.lock;
            c cVar = c.this;
            synchronized (obj) {
                try {
                    C1520c c1520c = this.entry;
                    c1520c.k(c1520c.getLockingSnapshotCount() - 1);
                    if (this.entry.getLockingSnapshotCount() == 0 && this.entry.getZombie()) {
                        cVar.O0(this.entry);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final i0 n(int index) {
            if (this.closed) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.entry.a().get(index);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"hc/c$e", "Lokio/p;", "Lokio/i0;", Action.FILE_ATTRIBUTE, "", "mustCreate", "Lokio/p0;", "n0", "(Lokio/i0;Z)Lokio/p0;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends p {
        e(o oVar) {
            super(oVar);
        }

        @Override // okio.p, okio.o
        public p0 n0(i0 file, boolean mustCreate) {
            i0 i0VarG = file.g();
            if (i0VarG != null) {
                p(i0VarG);
            }
            return super.n0(file, mustCreate);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72520n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72520n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Object obj2 = c.this.lock;
            c cVar = c.this;
            synchronized (obj2) {
                if (!cVar.initialized || cVar.closed) {
                    return h0.f84049a;
                }
                try {
                    cVar.T0();
                } catch (IOException unused) {
                    cVar.mostRecentTrimFailed = true;
                }
                try {
                    if (cVar.y0()) {
                        cVar.Y0();
                    }
                } catch (IOException unused2) {
                    cVar.mostRecentRebuildFailed = true;
                    cVar.journalWriter = c0.c(c0.b());
                }
                return h0.f84049a;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public c(o oVar, i0 i0Var, CoroutineContext coroutineContext, long j11, int i11, int i12) {
        this.directory = i0Var;
        this.maxSize = j11;
        this.appVersion = i11;
        this.valueCount = i12;
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.journalFile = i0Var.i("journal");
        this.journalFileTmp = i0Var.i("journal.tmp");
        this.journalFileBackup = i0Var.i("journal.bkp");
        this.lruEntries = yc.d.b(0, BitmapDescriptorFactory.HUE_RED, 3, null);
        CoroutineContext coroutineContextPlus = coroutineContext.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        CoroutineDispatcher coroutineDispatcherJ = f0.j(coroutineContext);
        this.cleanupScope = CoroutineScopeKt.CoroutineScope(coroutineContextPlus.plus(CoroutineDispatcher.limitedParallelism$default(coroutineDispatcherJ == null ? yc.f.a() : coroutineDispatcherJ, 1, null, 2, null)));
        this.lock = new Object();
        this.fileSystem = new e(oVar);
    }

    private final i D0() {
        return c0.c(new hc.d(this.fileSystem.c(this.journalFile), new l() { // from class: hc.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return c.G0(this.f72482a, (IOException) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 G0(c cVar, IOException iOException) {
        cVar.hasJournalErrors = true;
        return h0.f84049a;
    }

    private final void H0() {
        Iterator<C1520c> it = this.lruEntries.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            C1520c next = it.next();
            int i11 = 0;
            if (next.getCurrentEditor() == null) {
                int i12 = this.valueCount;
                while (i11 < i12) {
                    j11 += next.getLengths()[i11];
                    i11++;
                }
            } else {
                next.i(null);
                int i13 = this.valueCount;
                while (i11 < i13) {
                    this.fileSystem.H(next.a().get(i11));
                    this.fileSystem.H(next.c().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.size = j11;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    private final void J0() throws Throwable {
        j jVarD = c0.d(this.fileSystem.r0(this.journalFile));
        try {
            String strW2 = jVarD.w2();
            String strW3 = jVarD.w2();
            String strW4 = jVarD.w2();
            String strW5 = jVarD.w2();
            String strW6 = jVarD.w2();
            if (!s.f("libcore.io.DiskLruCache", strW2) || !s.f("1", strW3) || !s.f(String.valueOf(this.appVersion), strW4) || !s.f(String.valueOf(this.valueCount), strW5) || strW6.length() > 0) {
                throw new IOException("unexpected journal header: [" + strW2 + ", " + strW3 + ", " + strW4 + ", " + strW5 + ", " + strW6 + ']');
            }
            int i11 = 0;
            while (true) {
                try {
                    K0(jVarD.w2());
                    i11++;
                } catch (EOFException unused) {
                    this.operationsSinceRewrite = i11 - this.lruEntries.size();
                    if (jVarD.T2()) {
                        this.journalWriter = D0();
                    } else {
                        Y0();
                    }
                    h0 h0Var = h0.f84049a;
                    if (jVarD != null) {
                        try {
                            jVarD.close();
                        } catch (Throwable th2) {
                            th = th2;
                            if (th != null) {
                                throw th;
                            }
                        }
                    }
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (jVarD != null) {
                try {
                    jVarD.close();
                } catch (Throwable th4) {
                    jn0.g.a(th, th4);
                }
            }
            if (th != null) {
                throw th;
            }
        }
    }

    private final void K0(String line) throws IOException {
        String strSubstring;
        int iU0 = p013kotlin.text.t.u0(line, ' ', 0, false, 6, null);
        if (iU0 == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
        int i11 = iU0 + 1;
        int iU1 = p013kotlin.text.t.u0(line, ' ', i11, false, 4, null);
        if (iU1 == -1) {
            strSubstring = line.substring(i11);
            s.j(strSubstring, "substring(...)");
            if (iU0 == 6 && p013kotlin.text.t.b0(line, "REMOVE", false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = line.substring(i11, iU1);
            s.j(strSubstring, "substring(...)");
        }
        Map<String, C1520c> map = this.lruEntries;
        C1520c c1520c = map.get(strSubstring);
        if (c1520c == null) {
            c1520c = new C1520c(strSubstring);
            map.put(strSubstring, c1520c);
        }
        C1520c c1520c2 = c1520c;
        if (iU1 != -1 && iU0 == 5 && p013kotlin.text.t.b0(line, "CLEAN", false, 2, null)) {
            String strSubstring2 = line.substring(iU1 + 1);
            s.j(strSubstring2, "substring(...)");
            List<String> listE1 = p013kotlin.text.t.e1(strSubstring2, new char[]{' '}, false, 0, 6, null);
            c1520c2.l(true);
            c1520c2.i(null);
            c1520c2.j(listE1);
            return;
        }
        if (iU1 == -1 && iU0 == 5 && p013kotlin.text.t.b0(line, "DIRTY", false, 2, null)) {
            c1520c2.i(new b(c1520c2));
            return;
        }
        if (iU1 == -1 && iU0 == 4 && p013kotlin.text.t.b0(line, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + line);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O0(C1520c entry) {
        i iVar;
        if (entry.getLockingSnapshotCount() > 0 && (iVar = this.journalWriter) != null) {
            iVar.l2("DIRTY");
            iVar.writeByte(32);
            iVar.l2(entry.getKey());
            iVar.writeByte(10);
            iVar.flush();
        }
        if (entry.getLockingSnapshotCount() > 0 || entry.getCurrentEditor() != null) {
            entry.m(true);
            return true;
        }
        int i11 = this.valueCount;
        for (int i12 = 0; i12 < i11; i12++) {
            this.fileSystem.H(entry.a().get(i12));
            this.size -= entry.getLengths()[i12];
            entry.getLengths()[i12] = 0;
        }
        this.operationsSinceRewrite++;
        i iVar2 = this.journalWriter;
        if (iVar2 != null) {
            iVar2.l2("REMOVE");
            iVar2.writeByte(32);
            iVar2.l2(entry.getKey());
            iVar2.writeByte(10);
            iVar2.flush();
        }
        this.lruEntries.remove(entry.getKey());
        if (y0()) {
            z0();
        }
        return true;
    }

    private final boolean P0() {
        for (C1520c c1520c : this.lruEntries.values()) {
            if (!c1520c.getZombie()) {
                O0(c1520c);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0() {
        while (this.size > this.maxSize) {
            if (!P0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final void U0(String key) {
        if (f72484u.i(key)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + key + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        Throwable th2;
        synchronized (this.lock) {
            try {
                i iVar = this.journalWriter;
                if (iVar != null) {
                    iVar.close();
                }
                i iVarC = c0.c(this.fileSystem.n0(this.journalFileTmp, false));
                try {
                    iVarC.l2("libcore.io.DiskLruCache").writeByte(10);
                    iVarC.l2("1").writeByte(10);
                    iVarC.I0(this.appVersion).writeByte(10);
                    iVarC.I0(this.valueCount).writeByte(10);
                    iVarC.writeByte(10);
                    for (C1520c c1520c : this.lruEntries.values()) {
                        if (c1520c.getCurrentEditor() != null) {
                            iVarC.l2("DIRTY");
                            iVarC.writeByte(32);
                            iVarC.l2(c1520c.getKey());
                            iVarC.writeByte(10);
                        } else {
                            iVarC.l2("CLEAN");
                            iVarC.writeByte(32);
                            iVarC.l2(c1520c.getKey());
                            c1520c.o(iVarC);
                            iVarC.writeByte(10);
                        }
                    }
                    h0 h0Var = h0.f84049a;
                    if (iVarC != null) {
                        try {
                            iVarC.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (Throwable th4) {
                    if (iVarC != null) {
                        try {
                            iVarC.close();
                        } catch (Throwable th5) {
                            jn0.g.a(th4, th5);
                        }
                    }
                    th2 = th4;
                }
                if (th2 != null) {
                    throw th2;
                }
                if (this.fileSystem.J(this.journalFile)) {
                    this.fileSystem.o(this.journalFile, this.journalFileBackup);
                    this.fileSystem.o(this.journalFileTmp, this.journalFile);
                    this.fileSystem.H(this.journalFileBackup);
                } else {
                    this.fileSystem.o(this.journalFileTmp, this.journalFile);
                }
                this.journalWriter = D0();
                this.operationsSinceRewrite = 0;
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
                h0 h0Var2 = h0.f84049a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    private final void n0() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(b editor, boolean success) {
        synchronized (this.lock) {
            C1520c entry = editor.getEntry();
            if (!s.f(entry.getCurrentEditor(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!success || entry.getZombie()) {
                int i11 = this.valueCount;
                for (int i12 = 0; i12 < i11; i12++) {
                    this.fileSystem.H(entry.c().get(i12));
                }
            } else {
                int i13 = this.valueCount;
                for (int i14 = 0; i14 < i13; i14++) {
                    if (editor.getWritten()[i14] && !this.fileSystem.J(entry.c().get(i14))) {
                        editor.a();
                        return;
                    }
                }
                int i15 = this.valueCount;
                for (int i16 = 0; i16 < i15; i16++) {
                    i0 i0Var = entry.c().get(i16);
                    i0 i0Var2 = entry.a().get(i16);
                    if (this.fileSystem.J(i0Var)) {
                        this.fileSystem.o(i0Var, i0Var2);
                    } else {
                        k.b(this.fileSystem, entry.a().get(i16), false, 2, null);
                    }
                    long j11 = entry.getLengths()[i16];
                    Long size = this.fileSystem.b0(i0Var2).getSize();
                    long jLongValue = size != null ? size.longValue() : 0L;
                    entry.getLengths()[i16] = jLongValue;
                    this.size = (this.size - j11) + jLongValue;
                }
            }
            entry.i(null);
            if (entry.getZombie()) {
                O0(entry);
                return;
            }
            this.operationsSinceRewrite++;
            i iVar = this.journalWriter;
            s.h(iVar);
            if (success || entry.getReadable()) {
                entry.l(true);
                iVar.l2("CLEAN");
                iVar.writeByte(32);
                iVar.l2(entry.getKey());
                entry.o(iVar);
                iVar.writeByte(10);
            } else {
                this.lruEntries.remove(entry.getKey());
                iVar.l2("REMOVE");
                iVar.writeByte(32);
                iVar.l2(entry.getKey());
                iVar.writeByte(10);
            }
            iVar.flush();
            if (this.size > this.maxSize || y0()) {
                z0();
            }
            h0 h0Var = h0.f84049a;
        }
    }

    private final void s0() throws IOException {
        close();
        k.c(this.fileSystem, this.directory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0() {
        return this.operationsSinceRewrite >= 2000;
    }

    private final void z0() {
        BuildersKt__Builders_commonKt.launch$default(this.cleanupScope, null, null, new f(null), 3, null);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.initialized && !this.closed) {
                    for (C1520c c1520c : (C1520c[]) this.lruEntries.values().toArray(new C1520c[0])) {
                        b currentEditor = c1520c.getCurrentEditor();
                        if (currentEditor != null) {
                            currentEditor.e();
                        }
                    }
                    T0();
                    CoroutineScopeKt.cancel$default(this.cleanupScope, null, 1, null);
                    i iVar = this.journalWriter;
                    s.h(iVar);
                    iVar.close();
                    this.journalWriter = null;
                    this.closed = true;
                    h0 h0Var = h0.f84049a;
                    return;
                }
                this.closed = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final b t0(String key) {
        synchronized (this.lock) {
            n0();
            U0(key);
            w0();
            C1520c c1520c = this.lruEntries.get(key);
            if ((c1520c != null ? c1520c.getCurrentEditor() : null) != null) {
                return null;
            }
            if (c1520c != null && c1520c.getLockingSnapshotCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                i iVar = this.journalWriter;
                s.h(iVar);
                iVar.l2("DIRTY");
                iVar.writeByte(32);
                iVar.l2(key);
                iVar.writeByte(10);
                iVar.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (c1520c == null) {
                    c1520c = new C1520c(key);
                    this.lruEntries.put(key, c1520c);
                }
                b bVar = new b(c1520c);
                c1520c.i(bVar);
                return bVar;
            }
            z0();
            return null;
        }
    }

    public final d u0(String key) {
        d dVarN;
        synchronized (this.lock) {
            n0();
            U0(key);
            w0();
            C1520c c1520c = this.lruEntries.get(key);
            if (c1520c != null && (dVarN = c1520c.n()) != null) {
                this.operationsSinceRewrite++;
                i iVar = this.journalWriter;
                s.h(iVar);
                iVar.l2("READ");
                iVar.writeByte(32);
                iVar.l2(key);
                iVar.writeByte(10);
                iVar.flush();
                if (y0()) {
                    z0();
                }
                return dVarN;
            }
            return null;
        }
    }

    public final void w0() {
        synchronized (this.lock) {
            try {
                if (this.initialized) {
                    return;
                }
                this.fileSystem.H(this.journalFileTmp);
                if (this.fileSystem.J(this.journalFileBackup)) {
                    if (this.fileSystem.J(this.journalFile)) {
                        this.fileSystem.H(this.journalFileBackup);
                    } else {
                        this.fileSystem.o(this.journalFileBackup, this.journalFile);
                    }
                }
                if (this.fileSystem.J(this.journalFile)) {
                    try {
                        J0();
                        H0();
                        this.initialized = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            s0();
                            this.closed = false;
                            Y0();
                            this.initialized = true;
                            h0 h0Var = h0.f84049a;
                        } catch (Throwable th2) {
                            this.closed = false;
                            throw th2;
                        }
                    }
                }
                Y0();
                this.initialized = true;
                h0 h0Var2 = h0.f84049a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
