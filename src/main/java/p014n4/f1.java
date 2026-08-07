package p014n4;

import jn0.h0;
import m4.b;
import p013kotlin.Metadata;
import p020r2.y3;
import q4.u;
import q4.v;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Ln4/f1;", "", "<init>", "()V", "Ln4/e1;", "typefaceRequest", "Lkotlin/Function1;", "Ln4/g1;", "Ljn0/h0;", "resolveTypeface", "Lr2/y3;", "c", "(Ln4/e1;Lwn0/l;)Lr2/y3;", "Lq4/v;", "a", "Lq4/v;", "b", "()Lq4/v;", "lock", "Lm4/b;", "Lm4/b;", "resultCache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v lock = u.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b<TypefaceRequest, g1> resultCache = new b<>(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/g1;", "finalResult", "Ljn0/h0;", "a", "(Ln4/g1;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements l<g1, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TypefaceRequest f92946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TypefaceRequest typefaceRequest) {
            super(1);
            this.f92946d = typefaceRequest;
        }

        public final void a(g1 g1Var) {
            v lock = f1.this.getLock();
            f1 f1Var = f1.this;
            TypefaceRequest typefaceRequest = this.f92946d;
            synchronized (lock) {
                try {
                    if (g1Var.getCacheable()) {
                        f1Var.resultCache.e(typefaceRequest, g1Var);
                    } else {
                        f1Var.resultCache.f(typefaceRequest);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(g1 g1Var) {
            a(g1Var);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getLock() {
        return this.lock;
    }

    public final y3<Object> c(TypefaceRequest typefaceRequest, l<? super l<? super g1, h0>, ? extends g1> resolveTypeface) {
        synchronized (this.lock) {
            g1 g1VarD = this.resultCache.d(typefaceRequest);
            if (g1VarD != null) {
                if (g1VarD.getCacheable()) {
                    return g1VarD;
                }
                this.resultCache.f(typefaceRequest);
            }
            try {
                g1 g1VarInvoke = resolveTypeface.invoke(new a(typefaceRequest));
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.d(typefaceRequest) == null && g1VarInvoke.getCacheable()) {
                            this.resultCache.e(typefaceRequest, g1VarInvoke);
                        }
                        h0 h0Var = h0.f84049a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return g1VarInvoke;
            } catch (Exception e11) {
                throw new IllegalStateException("Could not load font", e11);
            }
        }
    }
}
