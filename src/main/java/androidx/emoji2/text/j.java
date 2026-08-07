package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f8314k = new a();

    public static class a {
        public Typeface a(@NonNull Context context, @NonNull r5.g.b bVar) {
            return r5.g.a(context, null, new r5.g.b[]{bVar});
        }

        @NonNull
        public r5.g.a b(@NonNull Context context, @NonNull r5.e eVar) {
            return r5.g.b(context, null, eVar);
        }

        public void c(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Context f8315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final r5.e f8316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final a f8317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final Object f8318d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f8319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f8320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f8321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f8322h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f8323i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f8324j;

        b(@NonNull Context context, @NonNull r5.e eVar, @NonNull a aVar) {
            u5.h.h(context, "Context cannot be null");
            u5.h.h(eVar, "FontRequest cannot be null");
            this.f8315a = context.getApplicationContext();
            this.f8316b = eVar;
            this.f8317c = aVar;
        }

        private void b() {
            synchronized (this.f8318d) {
                try {
                    this.f8322h = null;
                    ContentObserver contentObserver = this.f8323i;
                    if (contentObserver != null) {
                        this.f8317c.c(this.f8315a, contentObserver);
                        this.f8323i = null;
                    }
                    Handler handler = this.f8319e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f8324j);
                    }
                    this.f8319e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f8321g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f8320f = null;
                    this.f8321g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private r5.g.b e() {
            try {
                r5.g.a aVarB = this.f8317c.b(this.f8315a, this.f8316b);
                if (aVarB.e() == 0) {
                    r5.g.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("provider not found", e11);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(@NonNull e.i iVar) {
            u5.h.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f8318d) {
                this.f8322h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f8318d) {
                try {
                    if (this.f8322h == null) {
                        return;
                    }
                    try {
                        r5.g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f8318d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            q5.k.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f8317c.a(this.f8315a, bVarE);
                            ByteBuffer byteBufferF = k5.o.f(this.f8315a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            q5.k.b();
                            synchronized (this.f8318d) {
                                try {
                                    e.i iVar = this.f8322h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            b();
                        } catch (Throwable th3) {
                            q5.k.b();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        synchronized (this.f8318d) {
                            try {
                                e.i iVar2 = this.f8322h;
                                if (iVar2 != null) {
                                    iVar2.a(th4);
                                }
                                b();
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }

        void d() {
            synchronized (this.f8318d) {
                try {
                    if (this.f8322h == null) {
                        return;
                    }
                    if (this.f8320f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f8321g = threadPoolExecutorB;
                        this.f8320f = threadPoolExecutorB;
                    }
                    this.f8320f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8325a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(@NonNull Executor executor) {
            synchronized (this.f8318d) {
                this.f8320f = executor;
            }
        }
    }

    public j(@NonNull Context context, @NonNull r5.e eVar) {
        super(new b(context, eVar, f8314k));
    }

    @NonNull
    public j c(@NonNull Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
