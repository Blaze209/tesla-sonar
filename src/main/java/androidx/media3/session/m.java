package androidx.media3.session;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.t7;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public class m implements j7.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f11938h = ga.t.f67752a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f11940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NotificationManager f11943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f11944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11945g;

    private static class b {
        public static void a(NotificationManager notificationManager, String str, String str2) {
            NotificationChannel notificationChannelA = ga.c.a(str, str2, 2);
            if (Build.VERSION.SDK_INT <= 27) {
                notificationChannelA.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }

    private static class c {
        public static void a(androidx.core.app.o.e eVar) {
            eVar.s(1);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f11947b = new e() { // from class: ga.d
            @Override // androidx.media3.session.m.e
            public final int a(t7 t7Var) {
                return androidx.media3.session.m.d.a(t7Var);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11948c = "default_channel_id";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11949d = m.f11938h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11950e;

        public d(Context context) {
            this.f11946a = context;
        }

        public static /* synthetic */ int a(t7 t7Var) {
            return 1001;
        }

        public m f() {
            s7.a.h(!this.f11950e);
            m mVar = new m(this);
            this.f11950e = true;
            return mVar;
        }
    }

    public interface e {
        int a(t7 t7Var);
    }

    private static class f implements com.google.common.util.concurrent.l<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.app.o.e f11952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j7.b.a f11953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11954d;

        public f(int i11, androidx.core.app.o.e eVar, j7.b.a aVar) {
            this.f11951a = i11;
            this.f11952b = eVar;
            this.f11953c = aVar;
        }

        public void a() {
            this.f11954d = true;
        }

        @Override // com.google.common.util.concurrent.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            if (this.f11954d) {
                return;
            }
            this.f11952b.u(bitmap);
            this.f11953c.a(new j7(this.f11951a, this.f11952b.c()));
        }

        @Override // com.google.common.util.concurrent.l
        public void onFailure(Throwable th2) {
            if (this.f11954d) {
                return;
            }
            s7.t.i("NotificationProvider", m.f(th2));
        }
    }

    private void e() {
        if (Build.VERSION.SDK_INT < 26 || this.f11943e.getNotificationChannel(this.f11941c) != null) {
            return;
        }
        b.a(this.f11943e, this.f11941c, this.f11939a.getString(this.f11942d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Throwable th2) {
        return "Failed to load bitmap: " + th2.getMessage();
    }

    private static long j(p7.j0 j0Var) {
        if (!j0Var.isPlaying() || j0Var.m() || j0Var.E0() || j0Var.e().f101379a != 1.0f) {
            return -9223372036854775807L;
        }
        return System.currentTimeMillis() - j0Var.Q();
    }

    @Override // androidx.media3.session.j7.b
    public final j7 a(t7 t7Var, com.google.common.collect.x<androidx.media3.session.a> xVar, j7.a aVar, j7.b.a aVar2) {
        e();
        com.google.common.collect.x.a aVar3 = new com.google.common.collect.x.a();
        for (int i11 = 0; i11 < xVar.size(); i11++) {
            androidx.media3.session.a aVar4 = xVar.get(i11);
            se seVar = aVar4.f11456a;
            if (seVar != null && seVar.f12347a == 0 && aVar4.f11464i) {
                aVar3.a(xVar.get(i11));
            }
        }
        p7.j0 j0VarK = t7Var.k();
        androidx.core.app.o.e eVar = new androidx.core.app.o.e(this.f11939a, this.f11941c);
        int iA = this.f11940b.a(t7Var);
        ga.r rVar = new ga.r(t7Var);
        rVar.h(d(t7Var, g(t7Var, j0VarK.N(), aVar3.k(), !s7.q0.B1(j0VarK, t7Var.n())), eVar, aVar));
        if (j0VarK.c0(18)) {
            p7.e0 e0VarV = j0VarK.V();
            eVar.m(i(e0VarV)).l(h(e0VarV));
            com.google.common.util.concurrent.s<Bitmap> sVarB = t7Var.c().b(e0VarV);
            if (sVarB != null) {
                f fVar = this.f11944f;
                if (fVar != null) {
                    fVar.a();
                }
                if (sVarB.isDone()) {
                    try {
                        eVar.u((Bitmap) com.google.common.util.concurrent.m.b(sVarB));
                    } catch (CancellationException | ExecutionException e11) {
                        s7.t.i("NotificationProvider", f(e11));
                    }
                } else {
                    f fVar2 = new f(iA, eVar, aVar2);
                    this.f11944f = fVar2;
                    Handler handlerX = t7Var.f().X();
                    Objects.requireNonNull(handlerX);
                    com.google.common.util.concurrent.m.a(sVarB, fVar2, new b8.t(handlerX));
                }
            }
        }
        long j11 = j(j0VarK);
        boolean z11 = j11 != -9223372036854775807L;
        if (!z11) {
            j11 = 0;
        }
        eVar.L(j11).C(z11).I(z11);
        if (Build.VERSION.SDK_INT >= 31) {
            c.a(eVar);
        }
        return new j7(iA, eVar.k(t7Var.m()).q(aVar.b(t7Var)).z(true).D(this.f11945g).F(rVar).K(1).y(false).t("media3_group_key").c());
    }

    @Override // androidx.media3.session.j7.b
    public final boolean b(t7 t7Var, String str, Bundle bundle) {
        return false;
    }

    protected int[] d(t7 t7Var, com.google.common.collect.x<androidx.media3.session.a> xVar, androidx.core.app.o.e eVar, j7.a aVar) {
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        Arrays.fill(iArr, -1);
        Arrays.fill(iArr2, -1);
        boolean z11 = false;
        for (int i11 = 0; i11 < xVar.size(); i11++) {
            androidx.media3.session.a aVar2 = xVar.get(i11);
            if (aVar2.f11456a != null) {
                eVar.b(aVar.c(t7Var, aVar2));
            } else {
                s7.a.h(aVar2.f11457b != -1);
                eVar.b(aVar.a(t7Var, IconCompat.c(this.f11939a, aVar2.f11459d), aVar2.f11461f, aVar2.f11457b));
            }
            int i12 = aVar2.f11462g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
            if (i12 >= 0 && i12 < 3) {
                iArr[i12] = i11;
                z11 = true;
            } else if (aVar2.f11463h.c(0) == 2) {
                iArr2[0] = i11;
            } else if (aVar2.f11463h.c(0) == 1) {
                iArr2[1] = i11;
            } else if (aVar2.f11463h.c(0) == 3) {
                iArr2[2] = i11;
            }
        }
        if (!z11) {
            int i13 = 0;
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr2[i14];
                if (i15 != -1) {
                    iArr[i13] = i15;
                    i13++;
                }
            }
        }
        for (int i16 = 0; i16 < 3; i16++) {
            if (iArr[i16] == -1) {
                return Arrays.copyOf(iArr, i16);
            }
        }
        return iArr;
    }

    protected com.google.common.collect.x<androidx.media3.session.a> g(t7 t7Var, p7.j0.b bVar, com.google.common.collect.x<androidx.media3.session.a> xVar, boolean z11) {
        com.google.common.collect.x<androidx.media3.session.a> xVarF = androidx.media3.session.a.f(xVar, true, true);
        boolean zA = androidx.media3.session.a.a(xVarF, 2);
        boolean zA2 = androidx.media3.session.a.a(xVarF, 3);
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        int i11 = 0;
        if (zA) {
            aVar.a(xVarF.get(0).c(ru.e.h(2)));
            i11 = 1;
        } else if (bVar.d(7, 6)) {
            aVar.a(new androidx.media3.session.a.b(57413).h(6).c(this.f11939a.getString(ga.t.f67773v)).a());
        }
        if (bVar.c(1)) {
            if (z11) {
                aVar.a(new androidx.media3.session.a.b(57396).h(1).c(this.f11939a.getString(ga.t.f67770s)).a());
            } else {
                aVar.a(new androidx.media3.session.a.b(57399).h(1).c(this.f11939a.getString(ga.t.f67771t)).a());
            }
        }
        if (zA2) {
            aVar.a(xVarF.get(i11).c(ru.e.h(3)));
            i11++;
        } else if (bVar.d(9, 8)) {
            aVar.a(new androidx.media3.session.a.b(57412).h(8).c(this.f11939a.getString(ga.t.f67772u)).a());
        }
        while (i11 < xVarF.size()) {
            aVar.a(xVarF.get(i11).c(ru.e.h(6)));
            i11++;
        }
        return aVar.k();
    }

    protected CharSequence h(p7.e0 e0Var) {
        return e0Var.f101277b;
    }

    protected CharSequence i(p7.e0 e0Var) {
        return e0Var.f101276a;
    }

    public m(Context context, e eVar, String str, int i11) {
        this.f11939a = context;
        this.f11940b = eVar;
        this.f11941c = str;
        this.f11942d = i11;
        this.f11943e = (NotificationManager) s7.a.j((NotificationManager) context.getSystemService("notification"));
        this.f11945g = ga.s.f67748w0;
    }

    private m(d dVar) {
        this(dVar.f11946a, dVar.f11947b, dVar.f11948c, dVar.f11949d);
    }
}
