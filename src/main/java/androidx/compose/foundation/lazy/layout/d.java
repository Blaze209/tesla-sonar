package androidx.compose.foundation.lazy.layout;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p024x1.l0;
import p024x1.n0;
import p024x1.o0;
import p024x1.q0;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0013B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001b\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d;", "", "Lx1/q0;", "prefetchScheduler", "Lkotlin/Function1;", "Lx1/l0;", "Ljn0/h0;", "onNestedPrefetch", "<init>", "(Lx1/q0;Lwn0/l;)V", "", "index", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Landroidx/compose/foundation/lazy/layout/d$b;", "e", "(IJ)Landroidx/compose/foundation/lazy/layout/d$b;", "", "Lx1/o0;", "b", "()Ljava/util/List;", "a", "Lx1/q0;", DateTokenConverter.CONVERTER_KEY, "()Lx1/q0;", "Lwn0/l;", "Lx1/n0;", "c", "Lx1/n0;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/h;", "Landroidx/compose/foundation/lazy/layout/h;", "()Landroidx/compose/foundation/lazy/layout/h;", "f", "(Landroidx/compose/foundation/lazy/layout/h;)V", "prefetchHandleProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q0 prefetchScheduler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<l0, h0> onNestedPrefetch;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n0 prefetchMetrics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private h prefetchHandleProvider;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$a;", "Lx1/l0;", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "", "index", "Ljn0/h0;", "a", "(I)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "c", "(IJ)V", "", "Lx1/o0;", "Ljava/util/List;", "_requests", "", "b", "()Ljava/util/List;", "requests", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<o0> _requests = new ArrayList();

        public a() {
        }

        @Override // p024x1.l0
        public void a(int index) {
            c(index, e.f4786a);
        }

        public final List<o0> b() {
            return this._requests;
        }

        public void c(int index, long constraints) {
            h prefetchHandleProvider = d.this.getPrefetchHandleProvider();
            if (prefetchHandleProvider == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider.c(index, constraints, d.this.prefetchMetrics));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$b;", "", "Ljn0/h0;", "cancel", "()V", "b", "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/h$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void b();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<o0> b() {
        l<l0, h0> lVar = this.onNestedPrefetch;
        if (lVar == null) {
            return v.m();
        }
        a aVar = new a();
        lVar.invoke(aVar);
        return aVar.b();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getPrefetchHandleProvider() {
        return this.prefetchHandleProvider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q0 getPrefetchScheduler() {
        return this.prefetchScheduler;
    }

    public final b e(int index, long constraints) {
        b bVarD;
        h hVar = this.prefetchHandleProvider;
        return (hVar == null || (bVarD = hVar.d(index, constraints, this.prefetchMetrics)) == null) ? androidx.compose.foundation.lazy.layout.a.f4726a : bVarD;
    }

    public final void f(h hVar) {
        this.prefetchHandleProvider = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(q0 q0Var, l<? super l0, h0> lVar) {
        this.prefetchScheduler = q0Var;
        this.onNestedPrefetch = lVar;
        this.prefetchMetrics = new n0();
    }

    public /* synthetic */ d(q0 q0Var, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : q0Var, (i11 & 2) != 0 ? null : lVar);
    }
}
