package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class o6 extends n.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakReference<k4> f12089n;

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T extends k4> {
        void a(T t11);
    }

    public o6(k4 k4Var) {
        this.f12089n = new WeakReference<>(k4Var);
    }

    public static /* synthetic */ void S2(k4 k4Var, a aVar) {
        if (k4Var.J3()) {
            return;
        }
        aVar.a(k4Var);
    }

    public static /* synthetic */ void c3(k4 k4Var) {
        v vVarZ3 = k4Var.z3();
        v vVarZ4 = k4Var.z3();
        Objects.requireNonNull(vVarZ4);
        vVarZ3.l1(new ga.j(vVarZ4));
    }

    private <T extends k4> void k3(final a<T> aVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final k4 k4Var = this.f12089n.get();
            if (k4Var == null) {
                return;
            }
            s7.q0.m1(k4Var.z3().f12470e, new Runnable() { // from class: androidx.media3.session.e6
                @Override // java.lang.Runnable
                public final void run() {
                    o6.S2(k4Var, aVar);
                }
            });
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    private int l3() {
        ve veVarW3;
        k4 k4Var = this.f12089n.get();
        if (k4Var == null || (veVarW3 = k4Var.w3()) == null) {
            return -1;
        }
        return veVarW3.d();
    }

    private <T> void m3(int i11, T t11) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            k4 k4Var = this.f12089n.get();
            if (k4Var == null) {
                return;
            }
            k4Var.q4(i11, t11);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.n
    public void E0(final int i11, Bundle bundle) {
        try {
            final ga.u uVarA = ga.u.a(bundle);
            k3(new a() { // from class: androidx.media3.session.g6
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.X3(i11, uVarA);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for SessionError", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void G2(int i11, final Bundle bundle) {
        if (bundle == null) {
            s7.t.i("MediaControllerStub", "Ignoring null Bundle for extras");
        } else {
            k3(new a() { // from class: androidx.media3.session.n6
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.Y3(bundle);
                }
            });
        }
    }

    @Override // androidx.media3.session.n
    public void H0(int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final p7.j0.b bVarE = p7.j0.b.e(bundle);
            k3(new a() { // from class: androidx.media3.session.c6
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.T3(bVarE);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for Commands", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void I1(final int i11, final PendingIntent pendingIntent) {
        k3(new a() { // from class: androidx.media3.session.l6
            @Override // androidx.media3.session.o6.a
            public final void a(k4 k4Var) {
                k4Var.d4(i11, pendingIntent);
            }
        });
    }

    @Override // androidx.media3.session.n
    public void J0(final int i11, Bundle bundle, final Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            s7.t.i("MediaControllerStub", "Ignoring custom command with null args.");
            return;
        }
        try {
            final se seVarA = se.a(bundle);
            k3(new a() { // from class: androidx.media3.session.m6
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.W3(i11, seVarA, bundle2);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for SessionCommand", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void J1(int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m3(i11, ga.g.b(bundle));
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for LibraryResult", e11);
        }
    }

    @Override // androidx.media3.session.n
    @Deprecated
    public void K2(int i11, Bundle bundle, boolean z11) {
        x2(i11, bundle, new ne.c(z11, true).b());
    }

    @Override // androidx.media3.session.n
    public void N2(int i11, final String str, final int i12, Bundle bundle) {
        final q6 q6VarA;
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaControllerStub", "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i12 < 0) {
            s7.t.i("MediaControllerStub", "onChildrenChanged(): Ignoring negative itemCount: " + i12);
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        k3(new a() { // from class: androidx.media3.session.k6
            @Override // androidx.media3.session.o6.a
            public final void a(k4 k4Var) {
                ((t) k4Var).z4(str, i12, q6VarA);
            }
        });
    }

    @Override // androidx.media3.session.n
    public void P(int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final k kVarD = k.d(bundle);
            k3(new a() { // from class: androidx.media3.session.x5
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.V3(kVarD);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Malformed Bundle for ConnectionResult. Disconnected from the session.", e11);
            c(i11);
        }
    }

    @Override // androidx.media3.session.n
    public void P0(int i11, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            final te teVarE = te.e(bundle);
            try {
                final p7.j0.b bVarE = p7.j0.b.e(bundle2);
                k3(new a() { // from class: androidx.media3.session.i6
                    @Override // androidx.media3.session.o6.a
                    public final void a(k4 k4Var) {
                        k4Var.U3(teVarE, bVarE);
                    }
                });
            } catch (RuntimeException e11) {
                s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for Commands", e11);
            }
        } catch (RuntimeException e12) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for SessionCommands", e12);
        }
    }

    @Override // androidx.media3.session.n
    public void X(final int i11, List<Bundle> list) {
        if (list == null) {
            return;
        }
        try {
            final int iL3 = l3();
            if (iL3 == -1) {
                return;
            }
            final com.google.common.collect.x xVarD = s7.i.d(new ou.h() { // from class: androidx.media3.session.w5
                @Override // ou.h
                public final Object apply(Object obj) {
                    return a.e((Bundle) obj, iL3);
                }
            }, list);
            k3(new a() { // from class: androidx.media3.session.f6
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.c4(i11, xVarD);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void Z(int i11, final String str, final int i12, Bundle bundle) {
        final q6 q6VarA;
        if (TextUtils.isEmpty(str)) {
            s7.t.i("MediaControllerStub", "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i12 < 0) {
            s7.t.i("MediaControllerStub", "onSearchResultChanged(): Ignoring negative itemCount: " + i12);
            return;
        }
        if (bundle == null) {
            q6VarA = null;
        } else {
            try {
                q6VarA = q6.a(bundle);
            } catch (RuntimeException e11) {
                s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for LibraryParams", e11);
                return;
            }
        }
        k3(new a() { // from class: androidx.media3.session.b6
            @Override // androidx.media3.session.o6.a
            public final void a(k4 k4Var) {
                ((t) k4Var).A4(str, i12, q6VarA);
            }
        });
    }

    @Override // androidx.media3.session.n
    public void c(int i11) {
        k3(new a() { // from class: androidx.media3.session.j6
            @Override // androidx.media3.session.o6.a
            public final void a(k4 k4Var) {
                o6.c3(k4Var);
            }
        });
    }

    public void j3() {
        this.f12089n.clear();
    }

    @Override // androidx.media3.session.n
    public void m1(final int i11, List<Bundle> list) {
        if (list == null) {
            return;
        }
        try {
            final int iL3 = l3();
            if (iL3 == -1) {
                return;
            }
            final com.google.common.collect.x xVarD = s7.i.d(new ou.h() { // from class: androidx.media3.session.z5
                @Override // ou.h
                public final Object apply(Object obj) {
                    return a.e((Bundle) obj, iL3);
                }
            }, list);
            k3(new a() { // from class: androidx.media3.session.a6
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.b4(i11, xVarD);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for CommandButton", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void t2(int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            final ue ueVarB = ue.b(bundle);
            k3(new a() { // from class: androidx.media3.session.y5
                @Override // androidx.media3.session.o6.a
                public final void a(k4 k4Var) {
                    k4Var.R3(ueVarB);
                }
            });
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for SessionPositionInfo", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void w(int i11) {
        k3(new a() { // from class: androidx.media3.session.h6
            @Override // androidx.media3.session.o6.a
            public final void a(k4 k4Var) {
                k4Var.a4();
            }
        });
    }

    @Override // androidx.media3.session.n
    public void w0(int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            m3(i11, ga.v.a(bundle));
        } catch (RuntimeException e11) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for SessionResult", e11);
        }
    }

    @Override // androidx.media3.session.n
    public void x2(int i11, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int iL3 = l3();
            if (iL3 == -1) {
                return;
            }
            final ne neVarB = ne.B(bundle, iL3);
            try {
                final ne.c cVarA = ne.c.a(bundle2);
                k3(new a() { // from class: androidx.media3.session.d6
                    @Override // androidx.media3.session.o6.a
                    public final void a(k4 k4Var) {
                        k4Var.Z3(neVarB, cVarA);
                    }
                });
            } catch (RuntimeException e11) {
                s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for BundlingExclusions", e11);
            }
        } catch (RuntimeException e12) {
            s7.t.j("MediaControllerStub", "Ignoring malformed Bundle for PlayerInfo", e12);
        }
    }
}
