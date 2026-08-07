package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements cb.a<Boolean> {

    class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8243a;

        a(Lifecycle lifecycle) {
            this.f8243a = lifecycle;
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
            EmojiCompatInitializer.this.e();
            this.f8243a.d(this);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f8245a;

        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f8246a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f8247b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f8246a = iVar;
                this.f8247b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                try {
                    this.f8246a.a(th2);
                } finally {
                    this.f8247b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(@NonNull m mVar) {
                try {
                    this.f8246a.b(mVar);
                } finally {
                    this.f8247b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f8245a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(@NonNull final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8287a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(@NonNull e.i iVar, @NonNull ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f8245a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q5.k.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.i()) {
                    e.c().l();
                }
            } finally {
                q5.k.b();
            }
        }
    }

    @Override // cb.a
    @NonNull
    public List<Class<? extends cb.a<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // cb.a
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean a(@NonNull Context context) {
        e.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(@NonNull Context context) {
        Lifecycle lifecycle = ((LifecycleOwner) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    void e() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }
}
