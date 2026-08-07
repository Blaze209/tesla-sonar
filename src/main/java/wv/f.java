package wv;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import yu.a0;
import yu.t;

/* JADX INFO: loaded from: classes5.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv.b<p> f122378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f122379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yv.b<qw.i> f122380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<g> f122381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f122382e;

    private f(final Context context, final String str, Set<g> set, yv.b<qw.i> bVar, Executor executor) {
        this(new t(new yv.b() { // from class: wv.e
            @Override // yv.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                p pVar = fVar.f122378a.get();
                List<q> listG = pVar.g();
                pVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < listG.size(); i11++) {
                    q qVar = listG.get(i11);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", qVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) qVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return string;
    }

    public static /* synthetic */ p d(Context context, String str) {
        return new p(context, str);
    }

    public static /* synthetic */ f e(a0 a0Var, yu.d dVar) {
        return new f((Context) dVar.a(Context.class), ((com.google.firebase.f) dVar.a(com.google.firebase.f.class)).o(), (Set<g>) dVar.f(g.class), (yv.b<qw.i>) dVar.h(qw.i.class), (Executor) dVar.d(a0Var));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            fVar.f122378a.get().o(System.currentTimeMillis(), fVar.f122380c.get().a());
        }
        return null;
    }

    @NonNull
    public static yu.c<f> g() {
        final a0 a0VarA = a0.a(xu.a.class, Executor.class);
        return yu.c.d(f.class, i.class, j.class).b(yu.q.k(Context.class)).b(yu.q.k(com.google.firebase.f.class)).b(yu.q.o(g.class)).b(yu.q.m(qw.i.class)).b(yu.q.l(a0VarA)).f(new yu.g() { // from class: wv.d
            @Override // yu.g
            public final Object a(yu.d dVar) {
                return f.e(a0VarA, dVar);
            }
        }).d();
    }

    @Override // wv.j
    @NonNull
    public synchronized j.a a(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVar = this.f122378a.get();
        if (!pVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        pVar.k();
        return j.a.GLOBAL;
    }

    @Override // wv.i
    public Task<String> b() {
        return !q5.l.a(this.f122379b) ? Tasks.forResult("") : Tasks.call(this.f122382e, new Callable() { // from class: wv.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f122374a);
            }
        });
    }

    public Task<Void> h() {
        if (this.f122381d.size() <= 0) {
            return Tasks.forResult(null);
        }
        return !q5.l.a(this.f122379b) ? Tasks.forResult(null) : Tasks.call(this.f122382e, new Callable() { // from class: wv.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f122373a);
            }
        });
    }

    f(yv.b<p> bVar, Set<g> set, Executor executor, yv.b<qw.i> bVar2, Context context) {
        this.f122378a = bVar;
        this.f122381d = set;
        this.f122382e = executor;
        this.f122380c = bVar2;
        this.f122379b = context;
    }
}
