package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rw.h;
import rw.j;
import sw.e;
import zu.i;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f44594n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f44596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tu.b f44597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f44598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.f f44601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f44602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o f44603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f44604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final zv.f f44605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f44606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f44607m;

    a(Context context, f fVar, zv.f fVar2, tu.b bVar, Executor executor, com.google.firebase.remoteconfig.internal.f fVar3, com.google.firebase.remoteconfig.internal.f fVar4, com.google.firebase.remoteconfig.internal.f fVar5, m mVar, o oVar, t tVar, p pVar, e eVar) {
        this.f44595a = context;
        this.f44596b = fVar;
        this.f44605k = fVar2;
        this.f44597c = bVar;
        this.f44598d = executor;
        this.f44599e = fVar3;
        this.f44600f = fVar4;
        this.f44601g = fVar5;
        this.f44602h = mVar;
        this.f44603i = oVar;
        this.f44604j = tVar;
        this.f44606l = pVar;
        this.f44607m = eVar;
    }

    public static /* synthetic */ Task d(final a aVar, Task task, Task task2, Task task3) {
        aVar.getClass();
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        g gVar = (g) task.getResult();
        return (!task2.isSuccessful() || k(gVar, (g) task2.getResult())) ? aVar.f44600f.i(gVar).continueWith(aVar.f44598d, new Continuation() { // from class: rw.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f109227a.l(task4));
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    private static boolean k(g gVar, g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(Task<g> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f44599e.d();
        g result = task.getResult();
        if (result == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        p(result.e());
        this.f44607m.d(result);
        return true;
    }

    static List<Map<String, String>> o(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NonNull
    public Task<Boolean> e() {
        final Task<g> taskE = this.f44599e.e();
        final Task<g> taskE2 = this.f44600f.e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskE, taskE2}).continueWithTask(this.f44598d, new Continuation() { // from class: rw.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.a.d(this.f109224a, taskE, taskE2, task);
            }
        });
    }

    @NonNull
    public Task<Void> f() {
        return this.f44602h.i().onSuccessTask(i.a(), new SuccessContinuation() { // from class: rw.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    @NonNull
    public Task<Boolean> g() {
        return f().onSuccessTask(this.f44598d, new SuccessContinuation() { // from class: rw.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f109223a.e();
            }
        });
    }

    @NonNull
    public Map<String, j> h() {
        return this.f44603i.d();
    }

    @NonNull
    public h i() {
        return this.f44604j.d();
    }

    e j() {
        return this.f44607m;
    }

    void m(boolean z11) {
        this.f44606l.b(z11);
    }

    void n() {
        this.f44600f.e();
        this.f44601g.e();
        this.f44599e.e();
    }

    void p(@NonNull JSONArray jSONArray) {
        if (this.f44597c == null) {
            return;
        }
        try {
            this.f44597c.m(o(jSONArray));
        } catch (AbtException e11) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
        } catch (JSONException e12) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e12);
        }
    }
}
