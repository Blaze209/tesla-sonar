package a4;

import b4.g0;
import b4.j1;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashSet;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"La4/f;", "", "Lb4/j1;", "owner", "<init>", "(Lb4/j1;)V", "Landroidx/compose/ui/d$c;", "node", "La4/c;", Action.KEY_ATTRIBUTE, "", "Lb4/c;", "set", "Ljn0/h0;", "c", "(Landroidx/compose/ui/d$c;La4/c;Ljava/util/Set;)V", "b", "()V", "e", "f", "(Lb4/c;La4/c;)V", "a", DateTokenConverter.CONVERTER_KEY, "Lb4/j1;", "getOwner", "()Lb4/j1;", "Lt2/b;", "Lt2/b;", "inserted", "insertedLocal", "Lb4/g0;", "removed", "removedLocal", "", "Z", "invalidated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j1 owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t2.b<b4.c> inserted = new t2.b<>(new b4.c[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t2.b<c<?>> insertedLocal = new t2.b<>(new c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t2.b<g0> removed = new t2.b<>(new g0[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t2.b<c<?>> removedLocal = new t2.b<>(new c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean invalidated;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {
        a() {
            super(0);
        }

        public final void b() {
            f.this.e();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public f(j1 j1Var) {
        this.owner = j1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    private final void c(androidx.compose.ui.d.c r13, a4.c<?> r14, java.util.Set<b4.c> r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.c(androidx.compose.ui.d$c, a4.c, java.util.Set):void");
    }

    public final void a(b4.c node, c<?> key) {
        this.inserted.b(node);
        this.insertedLocal.b(key);
        b();
    }

    public final void b() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.v(new a());
    }

    public final void d(b4.c node, c<?> key) {
        this.removed.b(b4.k.m(node));
        this.removedLocal.b(key);
        b();
    }

    public final void e() {
        int i11 = 0;
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        t2.b<g0> bVar = this.removed;
        int size = bVar.getSize();
        if (size > 0) {
            g0[] g0VarArrM = bVar.m();
            int i12 = 0;
            do {
                g0 g0Var = g0VarArrM[i12];
                c<?> cVar = this.removedLocal.m()[i12];
                if (g0Var.getNodes().getHead().getIsAttached()) {
                    c(g0Var.getNodes().getHead(), cVar, hashSet);
                }
                i12++;
            } while (i12 < size);
        }
        this.removed.h();
        this.removedLocal.h();
        t2.b<b4.c> bVar2 = this.inserted;
        int size2 = bVar2.getSize();
        if (size2 > 0) {
            b4.c[] cVarArrM = bVar2.m();
            do {
                b4.c cVar2 = cVarArrM[i11];
                c<?> cVar3 = this.insertedLocal.m()[i11];
                if (cVar2.getIsAttached()) {
                    c(cVar2, cVar3, hashSet);
                }
                i11++;
            } while (i11 < size2);
        }
        this.inserted.h();
        this.insertedLocal.h();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b4.c) it.next()).F2();
        }
    }

    public final void f(b4.c node, c<?> key) {
        this.inserted.b(node);
        this.insertedLocal.b(key);
        b();
    }
}
