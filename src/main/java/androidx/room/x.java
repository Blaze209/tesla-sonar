package androidx.room;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0002>?B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Landroidx/room/x;", "Landroidx/room/a;", "Landroidx/room/e;", "config", "Landroidx/room/f0;", "openDelegate", "<init>", "(Landroidx/room/e;Landroidx/room/f0;)V", "Lkotlin/Function1;", "Lza/d;", "supportOpenHelperFactory", "(Landroidx/room/e;Lwn0/l;)V", "Ljn0/h0;", "H", "()V", "Lza/c;", "onOpen", "I", "(Landroidx/room/e;Lwn0/l;)Landroidx/room/e;", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/s0;", "Lkotlin/coroutines/Continuation;", "", "block", "K", "(ZLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fileName", "A", "(Ljava/lang/String;)Ljava/lang/String;", Gender.FEMALE, "J", "()Z", DateTokenConverter.CONVERTER_KEY, "Landroidx/room/e;", "o", "()Landroidx/room/e;", "configuration", "e", "Landroidx/room/f0;", "r", "()Landroidx/room/f0;", "", "Landroidx/room/b0$b;", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "callbacks", "Lsa/b;", "g", "Lsa/b;", "connectionPool", "h", "Lza/c;", "supportDatabase", "G", "()Lza/d;", "supportOpenHelper", "b", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends androidx.room.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e configuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 openDelegate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<b0.b> callbacks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sa.b connectionPool;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private za.c supportDatabase;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/room/x$a;", "Landroidx/room/f0;", "<init>", "()V", "Lya/b;", "connection", "Ljn0/h0;", "f", "(Lya/b;)V", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/room/f0$a;", "j", "(Lya/b;)Landroidx/room/f0$a;", "h", "g", "a", "b", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a extends f0 {
        public a() {
            super(-1, "", "");
        }

        @Override // androidx.room.f0
        public void a(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.f0
        public void b(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.f0
        public void f(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.f0
        public void g(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.f0
        public void h(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.f0
        public void i(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.f0
        public f0.a j(ya.b connection) {
            p013kotlin.jvm.internal.s.k(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/x$b;", "Lza/d$a;", "", "version", "<init>", "(Landroidx/room/x;I)V", "Lza/c;", "db", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lza/c;)V", "oldVersion", "newVersion", "g", "(Lza/c;II)V", "e", "f", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b extends za.d.a {
        public b(int i11) {
            super(i11);
        }

        @Override // za.d.a
        public void d(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            x.this.x(new ta.a(db2));
        }

        @Override // za.d.a
        public void e(za.c db2, int oldVersion, int newVersion) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            g(db2, oldVersion, newVersion);
        }

        @Override // za.d.a
        public void f(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            x.this.z(new ta.a(db2));
            x.this.supportDatabase = db2;
        }

        @Override // za.d.a
        public void g(za.c db2, int oldVersion, int newVersion) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            x.this.y(new ta.a(db2), oldVersion, newVersion);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/room/x$c", "Landroidx/room/b0$b;", "Lza/c;", "db", "Ljn0/h0;", "f", "(Lza/c;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends b0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l<za.c, jn0.h0> f13818a;

        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super za.c, jn0.h0> lVar) {
            this.f13818a = lVar;
        }

        @Override // androidx.room.b0.b
        public void f(za.c db2) {
            p013kotlin.jvm.internal.s.k(db2, "db");
            this.f13818a.invoke(db2);
        }
    }

    public x(e config, f0 openDelegate) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(openDelegate, "openDelegate");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List<b0.b> list = config.callbacks;
        this.callbacks = list == null ? p013kotlin.collections.v.m() : list;
        ya.c cVar = config.sqliteDriver;
        if (cVar != null) {
            this.connectionPool = config.name == null ? sa.h.b(new androidx.room.a.b(this, cVar), ":memory:") : sa.h.a(new androidx.room.a.b(this, cVar), config.name, p(config.journalMode), q(config.journalMode));
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.connectionPool = new ta.b(new ta.c(config.sqliteOpenHelperFactory.a(za.d.b.INSTANCE.a(config.ch.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String).d(config.name).c(new b(openDelegate.getVersion())).b())));
        }
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 D(x xVar, za.c db2) {
        p013kotlin.jvm.internal.s.k(db2, "db");
        xVar.supportDatabase = db2;
        return jn0.h0.f84049a;
    }

    private final void H() {
        boolean z11 = getConfiguration().journalMode == b0.d.WRITE_AHEAD_LOGGING;
        za.d dVarG = G();
        if (dVarG != null) {
            dVarG.setWriteAheadLoggingEnabled(z11);
        }
    }

    private final e I(e eVar, wn0.l<? super za.c, jn0.h0> lVar) {
        List<b0.b> listM = eVar.callbacks;
        if (listM == null) {
            listM = p013kotlin.collections.v.m();
        }
        return e.b(eVar, null, null, null, null, p013kotlin.collections.v.Q0(listM, new c(lVar)), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    @Override // androidx.room.a
    public String A(String fileName) {
        p013kotlin.jvm.internal.s.k(fileName, "fileName");
        if (p013kotlin.jvm.internal.s.f(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().ch.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String.getDatabasePath(fileName).getAbsolutePath();
        p013kotlin.jvm.internal.s.h(absolutePath);
        return absolutePath;
    }

    public final void F() {
        this.connectionPool.close();
    }

    public final za.d G() {
        ta.c supportDriver;
        sa.b bVar = this.connectionPool;
        ta.b bVar2 = bVar instanceof ta.b ? (ta.b) bVar : null;
        if (bVar2 == null || (supportDriver = bVar2.getSupportDriver()) == null) {
            return null;
        }
        return supportDriver.getOpenHelper();
    }

    public final boolean J() {
        za.c cVar = this.supportDatabase;
        if (cVar != null) {
            return cVar.isOpen();
        }
        return false;
    }

    public <R> Object K(boolean z11, wn0.p<? super s0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        return this.connectionPool.B3(z11, pVar, continuation);
    }

    @Override // androidx.room.a
    protected List<b0.b> n() {
        return this.callbacks;
    }

    @Override // androidx.room.a
    /* JADX INFO: renamed from: o, reason: from getter */
    protected e getConfiguration() {
        return this.configuration;
    }

    @Override // androidx.room.a
    /* JADX INFO: renamed from: r, reason: from getter */
    protected f0 getOpenDelegate() {
        return this.openDelegate;
    }

    public x(e config, wn0.l<? super e, ? extends za.d> supportOpenHelperFactory) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.configuration = config;
        this.openDelegate = new a();
        List<b0.b> list = config.callbacks;
        this.callbacks = list == null ? p013kotlin.collections.v.m() : list;
        this.connectionPool = new ta.b(new ta.c(supportOpenHelperFactory.invoke(I(config, new wn0.l() { // from class: androidx.room.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return x.D(this.f13811a, (za.c) obj);
            }
        }))));
        H();
    }
}
