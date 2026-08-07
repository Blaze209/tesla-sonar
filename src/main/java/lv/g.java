package lv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.e0;
import com.google.firebase.crashlytics.internal.common.f0;
import com.google.firebase.crashlytics.internal.common.g0;
import com.google.firebase.crashlytics.internal.common.k0;
import com.google.firebase.crashlytics.internal.common.u0;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f90807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f90808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f90809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f90810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lv.a f90811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f90812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f0 f90813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference<d> f90814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference<TaskCompletionSource<d>> f90815i;

    class a implements SuccessContinuation<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ev.i f90816a;

        a(ev.i iVar) {
            this.f90816a = iVar;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Void r11) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f90816a.network.d().submit(new Callable() { // from class: lv.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f90806a;
                    return g.this.f90812f.a(g.this.f90808b, true);
                }
            }).get();
            if (jSONObject != null) {
                d dVarB = g.this.f90809c.b(jSONObject);
                g.this.f90811e.c(dVarB.f90795c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f90808b.f90824f);
                g.this.f90814h.set(dVarB);
                ((TaskCompletionSource) g.this.f90815i.get()).trySetResult(dVarB);
            }
            return Tasks.forResult(null);
        }
    }

    g(Context context, k kVar, e0 e0Var, h hVar, lv.a aVar, l lVar, f0 f0Var) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f90814h = atomicReference;
        this.f90815i = new AtomicReference<>(new TaskCompletionSource());
        this.f90807a = context;
        this.f90808b = kVar;
        this.f90810d = e0Var;
        this.f90809c = hVar;
        this.f90811e = aVar;
        this.f90812f = lVar;
        this.f90813g = f0Var;
        atomicReference.set(b.b(e0Var));
    }

    public static g l(Context context, String str, k0 k0Var, iv.b bVar, String str2, String str3, jv.g gVar, f0 f0Var) {
        String strG = k0Var.g();
        u0 u0Var = new u0();
        return new g(context, new k(str, k0Var.h(), k0Var.i(), k0Var.j(), k0Var, com.google.firebase.crashlytics.internal.common.i.h(com.google.firebase.crashlytics.internal.common.i.m(context), str, str3, str2), str3, str2, g0.determineFrom(strG).getId()), u0Var, new h(u0Var), new lv.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), f0Var);
    }

    private d m(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject jSONObjectB = this.f90811e.b();
                if (jSONObjectB != null) {
                    d dVarB = this.f90809c.b(jSONObjectB);
                    if (dVarB == null) {
                        bv.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long jA = this.f90810d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && dVarB.a(jA)) {
                        bv.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        bv.g.f().i("Returning cached settings.");
                        return dVarB;
                    } catch (Exception e11) {
                        e = e11;
                        dVar = dVarB;
                        bv.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                bv.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e12) {
            e = e12;
        }
    }

    private String n() {
        return com.google.firebase.crashlytics.internal.common.i.q(this.f90807a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        bv.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = com.google.firebase.crashlytics.internal.common.i.q(this.f90807a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // lv.j
    public d a() {
        return this.f90814h.get();
    }

    @Override // lv.j
    public Task<d> b() {
        return this.f90815i.get().getTask();
    }

    boolean k() {
        return !n().equals(this.f90808b.f90824f);
    }

    public Task<Void> o(ev.i iVar) {
        return p(e.USE_CACHE, iVar);
    }

    public Task<Void> p(e eVar, ev.i iVar) throws Throwable {
        d dVarM;
        if (!k() && (dVarM = m(eVar)) != null) {
            this.f90814h.set(dVarM);
            this.f90815i.get().trySetResult(dVarM);
            return Tasks.forResult(null);
        }
        d dVarM2 = m(e.IGNORE_CACHE_EXPIRATION);
        if (dVarM2 != null) {
            this.f90814h.set(dVarM2);
            this.f90815i.get().trySetResult(dVarM2);
        }
        return this.f90813g.k().onSuccessTask(iVar.common, new a(iVar));
    }
}
