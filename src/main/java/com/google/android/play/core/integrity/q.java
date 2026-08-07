package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.h0;
import iu.l0;
import iu.s0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f43173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f43175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f43176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f43177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final iu.f f43178f;

    q(Context context, l0 l0Var, c cVar, d0 d0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f43175c = taskCompletionSource;
        this.f43174b = context.getPackageName();
        this.f43173a = l0Var;
        this.f43176d = cVar;
        this.f43177e = d0Var;
        iu.f fVar = new iu.f(context, l0Var, "ExpressIntegrityService", r.f43179a, new s0() { // from class: zt.i
            @Override // iu.s0
            public final Object a(IBinder iBinder) {
                return h0.S2(iBinder);
            }
        }, null);
        this.f43178f = fVar;
        fVar.c().post(new i(this, taskCompletionSource, context));
    }

    static /* bridge */ /* synthetic */ Bundle a(q qVar, a.d dVar, long j11, long j12, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", qVar.f43174b);
        bundle.putLong("cloud.prj", j11);
        bundle.putString("nonce", dVar.b());
        bundle.putLong("warm.up.sid", j12);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", i11);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(dVar.c()));
        ArrayList arrayList = new ArrayList();
        iu.d0.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(iu.d0.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(q qVar, long j11, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", qVar.f43174b);
        bundle.putLong("cloud.prj", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", i11);
        ArrayList arrayList = new ArrayList();
        iu.d0.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(iu.d0.a(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean i(q qVar, int i11) {
        TaskCompletionSource taskCompletionSource = qVar.f43175c;
        if (taskCompletionSource.getTask().isSuccessful()) {
            return ((Integer) taskCompletionSource.getTask().getResult()).intValue() < (i11 == 0 ? 83420000 : 83830000);
        }
        return false;
    }

    static /* bridge */ /* synthetic */ boolean j(q qVar) {
        TaskCompletionSource taskCompletionSource = qVar.f43175c;
        return taskCompletionSource.getTask().isSuccessful() && ((Integer) taskCompletionSource.getTask().getResult()).intValue() == 0;
    }

    public final Task c(a.d dVar, long j11, long j12, int i11) {
        this.f43173a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j12));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f43178f.u(new k(this, taskCompletionSource, i11, dVar, j11, j12, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(long j11, int i11) {
        this.f43173a.b("warmUpIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f43178f.u(new j(this, taskCompletionSource, i11, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
