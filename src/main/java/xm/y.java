package xm;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f123779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f123780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f123781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f123782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.c f123783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f123784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private sk.h f123785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sk.k f123786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sk.a f123787i;

    public y(w wVar) {
        this.f123779a = (w) pk.k.g(wVar);
    }

    private com.facebook.imagepipeline.memory.e a() {
        if (this.f123780b == null) {
            try {
                this.f123780b = (com.facebook.imagepipeline.memory.e) AshmemMemoryChunkPool.class.getConstructor(sk.d.class, z.class, a0.class).newInstance(this.f123779a.i(), this.f123779a.g(), this.f123779a.h());
            } catch (ClassNotFoundException unused) {
                this.f123780b = null;
            } catch (IllegalAccessException unused2) {
                this.f123780b = null;
            } catch (InstantiationException unused3) {
                this.f123780b = null;
            } catch (NoSuchMethodException unused4) {
                this.f123780b = null;
            } catch (InvocationTargetException unused5) {
                this.f123780b = null;
            }
        }
        return this.f123780b;
    }

    private com.facebook.imagepipeline.memory.e f(int i11) {
        if (i11 == 0) {
            return g();
        }
        if (i11 == 1) {
            return c();
        }
        if (i11 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    public d b() {
        if (this.f123781c == null) {
            String strE = this.f123779a.e();
            switch (strE.hashCode()) {
                case -1868884870:
                    if (!strE.equals("legacy_default_params")) {
                        this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), this.f123779a.c(), this.f123779a.d(), this.f123779a.l());
                    } else {
                        this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), i.a(), this.f123779a.d(), this.f123779a.l());
                    }
                    break;
                case -1106578487:
                    strE.equals("legacy");
                    this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), this.f123779a.c(), this.f123779a.d(), this.f123779a.l());
                    break;
                case -404562712:
                    if (!strE.equals("experimental")) {
                        this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), this.f123779a.c(), this.f123779a.d(), this.f123779a.l());
                    } else {
                        this.f123781c = new o(this.f123779a.b(), this.f123779a.a(), u.h(), this.f123779a.m() ? this.f123779a.i() : null);
                    }
                    break;
                case -402149703:
                    if (!strE.equals("dummy_with_tracking")) {
                        this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), this.f123779a.c(), this.f123779a.d(), this.f123779a.l());
                    } else {
                        this.f123781c = new n();
                    }
                    break;
                case 95945896:
                    if (!strE.equals("dummy")) {
                        this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), this.f123779a.c(), this.f123779a.d(), this.f123779a.l());
                    } else {
                        this.f123781c = new m();
                    }
                    break;
                default:
                    this.f123781c = new com.facebook.imagepipeline.memory.b(this.f123779a.i(), this.f123779a.c(), this.f123779a.d(), this.f123779a.l());
                    break;
            }
        }
        return this.f123781c;
    }

    public com.facebook.imagepipeline.memory.e c() {
        if (this.f123782d == null) {
            try {
                this.f123782d = (com.facebook.imagepipeline.memory.e) BufferMemoryChunkPool.class.getConstructor(sk.d.class, z.class, a0.class).newInstance(this.f123779a.i(), this.f123779a.g(), this.f123779a.h());
            } catch (ClassNotFoundException unused) {
                this.f123782d = null;
            } catch (IllegalAccessException unused2) {
                this.f123782d = null;
            } catch (InstantiationException unused3) {
                this.f123782d = null;
            } catch (NoSuchMethodException unused4) {
                this.f123782d = null;
            } catch (InvocationTargetException unused5) {
                this.f123782d = null;
            }
        }
        return this.f123782d;
    }

    public com.facebook.imagepipeline.memory.c d() {
        if (this.f123783e == null) {
            this.f123783e = new com.facebook.imagepipeline.memory.c(this.f123779a.i(), this.f123779a.f());
        }
        return this.f123783e;
    }

    public int e() {
        return this.f123779a.f().f123794g;
    }

    public com.facebook.imagepipeline.memory.e g() {
        if (this.f123784f == null) {
            try {
                this.f123784f = (com.facebook.imagepipeline.memory.e) NativeMemoryChunkPool.class.getConstructor(sk.d.class, z.class, a0.class).newInstance(this.f123779a.i(), this.f123779a.g(), this.f123779a.h());
            } catch (ClassNotFoundException e11) {
                qk.a.n("PoolFactory", "", e11);
                this.f123784f = null;
            } catch (IllegalAccessException e12) {
                qk.a.n("PoolFactory", "", e12);
                this.f123784f = null;
            } catch (InstantiationException e13) {
                qk.a.n("PoolFactory", "", e13);
                this.f123784f = null;
            } catch (NoSuchMethodException e14) {
                qk.a.n("PoolFactory", "", e14);
                this.f123784f = null;
            } catch (InvocationTargetException e15) {
                qk.a.n("PoolFactory", "", e15);
                this.f123784f = null;
            }
        }
        return this.f123784f;
    }

    public sk.h h() {
        return i(!pm.z.a() ? 1 : 0);
    }

    public sk.h i(int i11) {
        if (this.f123785g == null) {
            com.facebook.imagepipeline.memory.e eVarF = f(i11);
            pk.k.h(eVarF, "failed to get pool for chunk type: " + i11);
            this.f123785g = new t(eVarF, j());
        }
        return this.f123785g;
    }

    public sk.k j() {
        if (this.f123786h == null) {
            this.f123786h = new sk.k(k());
        }
        return this.f123786h;
    }

    public sk.a k() {
        if (this.f123787i == null) {
            this.f123787i = new com.facebook.imagepipeline.memory.d(this.f123779a.i(), this.f123779a.j(), this.f123779a.k());
        }
        return this.f123787i;
    }
}
