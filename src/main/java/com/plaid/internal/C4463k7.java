package com.plaid.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.plaid.internal.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4463k7<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4491o<R> f47807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f47808b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47809c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E0 f47810d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.plaid.internal.k7$a */
    public class a<T> implements Callable<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f47811a;

        public a(c cVar) {
            this.f47811a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            return (T) this.f47811a.call();
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.k7$b */
    public class b implements c<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4500p f47812a;

        public b(C4500p c4500p) {
            this.f47812a = c4500p;
        }

        @Override // com.plaid.internal.C4463k7.c
        public final R call() {
            C4491o<R> c4491o = C4463k7.this.f47807a;
            c4491o.f47951f.a((InterfaceC4519r1) C4491o.a(EnumC4427g7.PRE_CHECK, c4491o.f47946a, new C4437i(), this.f47812a));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.k7$c */
    public interface c<T> {
        T call();
    }

    public C4463k7(C4491o c4491o, E0 e11) {
        this.f47807a = c4491o;
        this.f47810d = e11;
    }

    public final <T> T a(c<T> cVar, C4500p c4500p) throws r {
        try {
            return this.f47808b.submit(new a(cVar)).get();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw new r(c4500p.f48001b, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof r) {
                throw ((r) cause);
            }
            throw new r(c4500p.f48001b, cause);
        } catch (TimeoutException unused) {
            c4500p.f48000a = true;
            throw new r(c4500p.f48001b, new C4509q(T0.GENERIC_TIMEOUT));
        }
    }

    public final void b() throws r {
        C4500p c4500p = new C4500p();
        a(new b(c4500p), c4500p);
    }

    public final R a() throws r {
        String strA;
        C4500p c4500p = new C4500p();
        try {
            strA = (String) a(new C4472l7(this, c4500p), c4500p);
        } catch (r e11) {
            if (this.f47809c && e11.f48075a == EnumC4427g7.AUTHENTICATION) {
                strA = H.a(e11, c4500p);
            } else {
                throw e11;
            }
        }
        C4491o<R> c4491o = this.f47807a;
        c4491o.getClass();
        try {
            R r11 = (R) C4491o.a(EnumC4427g7.FINISH, c4491o.f47950e, new C4482n(strA), c4500p);
            C4491o.f47945g.a(W3.INFO, "authentication completed", new Object[0]);
            C4561v7 c4561v7 = c4491o.f47951f;
            synchronized (c4561v7) {
                c4561v7.b();
            }
            return r11;
        } catch (r e12) {
            c4491o.f47951f.a();
            throw e12;
        }
    }
}
