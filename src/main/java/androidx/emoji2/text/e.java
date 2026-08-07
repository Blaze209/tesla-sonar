package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f8253o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f8254p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f8255q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Set<f> f8257b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final b f8260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final h f8261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final j f8262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f8263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f8264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f8265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f8266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f8267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f8268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0167e f8269n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ReadWriteLock f8256a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f8258c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Handler f8259d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f8270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile m f8271c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0166a extends i {
            C0166a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                a.this.f8273a.n(th2);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(@NonNull m mVar) {
                a.this.f(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        int a(@NonNull CharSequence charSequence, int i11) {
            return this.f8270b.a(charSequence, i11);
        }

        @Override // androidx.emoji2.text.e.b
        int b(@NonNull CharSequence charSequence, int i11) {
            return this.f8270b.b(charSequence, i11);
        }

        @Override // androidx.emoji2.text.e.b
        void c() {
            try {
                this.f8273a.f8261f.a(new C0166a());
            } catch (Throwable th2) {
                this.f8273a.n(th2);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence d(@NonNull CharSequence charSequence, int i11, int i12, int i13, boolean z11) {
            return this.f8270b.e(charSequence, i11, i12, i13, z11);
        }

        @Override // androidx.emoji2.text.e.b
        void e(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f8271c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f8273a.f8263h);
        }

        void f(@NonNull m mVar) {
            if (mVar == null) {
                this.f8273a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f8271c = mVar;
            m mVar2 = this.f8271c;
            j jVar = this.f8273a.f8262g;
            InterfaceC0167e interfaceC0167e = this.f8273a.f8269n;
            e eVar = this.f8273a;
            this.f8270b = new androidx.emoji2.text.h(mVar2, jVar, interfaceC0167e, eVar.f8264i, eVar.f8265j, androidx.emoji2.text.g.a());
            this.f8273a.o();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f8273a;

        b(e eVar) {
            this.f8273a = eVar;
        }

        int a(@NonNull CharSequence charSequence, int i11) {
            throw null;
        }

        int b(@NonNull CharSequence charSequence, int i11) {
            throw null;
        }

        void c() {
            throw null;
        }

        CharSequence d(@NonNull CharSequence charSequence, int i11, int i12, int i13, boolean z11) {
            throw null;
        }

        void e(@NonNull EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final h f8274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f8275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f8278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set<f> f8279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f8280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f8281h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f8282i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        InterfaceC0167e f8283j = new androidx.emoji2.text.d();

        protected c(@NonNull h hVar) {
            u5.h.h(hVar, "metadataLoader cannot be null.");
            this.f8274a = hVar;
        }

        @NonNull
        protected final h a() {
            return this.f8274a;
        }

        @NonNull
        public c b(int i11) {
            this.f8282i = i11;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        @NonNull
        public androidx.emoji2.text.i a(@NonNull o oVar) {
            return new p(oVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0167e {
        boolean a(@NonNull CharSequence charSequence, int i11, int i12, int i13);
    }

    public static abstract class f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f> f8284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f8285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8286c;

        g(@NonNull f fVar, int i11) {
            this(Arrays.asList((f) u5.h.h(fVar, "initCallback cannot be null")), i11, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f8284a.size();
            int i11 = 0;
            if (this.f8286c != 1) {
                while (i11 < size) {
                    this.f8284a.get(i11).a(this.f8285b);
                    i11++;
                }
            } else {
                while (i11 < size) {
                    this.f8284a.get(i11).b();
                    i11++;
                }
            }
        }

        g(@NonNull Collection<f> collection, int i11) {
            this(collection, i11, null);
        }

        g(@NonNull Collection<f> collection, int i11, Throwable th2) {
            u5.h.h(collection, "initCallbacks cannot be null");
            this.f8284a = new ArrayList(collection);
            this.f8286c = i11;
            this.f8285b = th2;
        }
    }

    public interface h {
        void a(@NonNull i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(@NonNull m mVar);
    }

    public interface j {
        @NonNull
        androidx.emoji2.text.i a(@NonNull o oVar);
    }

    private e(@NonNull c cVar) {
        this.f8263h = cVar.f8276c;
        this.f8264i = cVar.f8277d;
        this.f8265j = cVar.f8278e;
        this.f8266k = cVar.f8280g;
        this.f8267l = cVar.f8281h;
        this.f8261f = cVar.f8274a;
        this.f8268m = cVar.f8282i;
        this.f8269n = cVar.f8283j;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f8257b = bVar;
        j jVar = cVar.f8275b;
        this.f8262g = jVar == null ? new d() : jVar;
        Set<f> set = cVar.f8279f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f8279f);
        }
        this.f8260e = new a(this);
        m();
    }

    @NonNull
    public static e c() {
        e eVar;
        synchronized (f8253o) {
            eVar = f8255q;
            u5.h.j(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    @NonNull
    public static e h(@NonNull c cVar) {
        e eVar;
        e eVar2 = f8255q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f8253o) {
            try {
                eVar = f8255q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f8255q = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static boolean i() {
        return f8255q != null;
    }

    private boolean k() {
        return g() == 1;
    }

    private void m() {
        this.f8256a.writeLock().lock();
        try {
            if (this.f8268m == 0) {
                this.f8258c = 0;
            }
            this.f8256a.writeLock().unlock();
            if (g() == 0) {
                this.f8260e.c();
            }
        } catch (Throwable th2) {
            this.f8256a.writeLock().unlock();
            throw th2;
        }
    }

    public int d(@NonNull CharSequence charSequence, int i11) {
        return this.f8260e.a(charSequence, i11);
    }

    public int e() {
        return this.f8267l;
    }

    public int f(@NonNull CharSequence charSequence, int i11) {
        return this.f8260e.b(charSequence, i11);
    }

    public int g() {
        this.f8256a.readLock().lock();
        try {
            return this.f8258c;
        } finally {
            this.f8256a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f8266k;
    }

    public void l() {
        u5.h.j(this.f8268m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f8256a.writeLock().lock();
        try {
            if (this.f8258c == 0) {
                this.f8256a.writeLock().unlock();
                return;
            }
            this.f8258c = 0;
            this.f8256a.writeLock().unlock();
            this.f8260e.c();
        } catch (Throwable th2) {
            this.f8256a.writeLock().unlock();
            throw th2;
        }
    }

    void n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f8256a.writeLock().lock();
        try {
            this.f8258c = 2;
            arrayList.addAll(this.f8257b);
            this.f8257b.clear();
            this.f8256a.writeLock().unlock();
            this.f8259d.post(new g(arrayList, this.f8258c, th2));
        } catch (Throwable th3) {
            this.f8256a.writeLock().unlock();
            throw th3;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f8256a.writeLock().lock();
        try {
            this.f8258c = 1;
            arrayList.addAll(this.f8257b);
            this.f8257b.clear();
            this.f8256a.writeLock().unlock();
            this.f8259d.post(new g(arrayList, this.f8258c));
        } catch (Throwable th2) {
            this.f8256a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence p(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        boolean z11;
        u5.h.j(k(), "Not initialized yet");
        u5.h.e(i11, "start cannot be negative");
        u5.h.e(i12, "end cannot be negative");
        u5.h.e(i13, "maxEmojiCount cannot be negative");
        u5.h.b(i11 <= i12, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        u5.h.b(i11 <= charSequence.length(), "start should be < than charSequence length");
        u5.h.b(i12 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i11 == i12) {
            return charSequence;
        }
        if (i14 != 1) {
            z11 = i14 != 2 ? this.f8263h : false;
        } else {
            z11 = true;
        }
        return this.f8260e.d(charSequence, i11, i12, i13, z11);
    }

    public void q(@NonNull f fVar) {
        u5.h.h(fVar, "initCallback cannot be null");
        this.f8256a.writeLock().lock();
        try {
            if (this.f8258c == 1 || this.f8258c == 2) {
                this.f8259d.post(new g(fVar, this.f8258c));
            } else {
                this.f8257b.add(fVar);
            }
        } finally {
            this.f8256a.writeLock().unlock();
        }
    }

    public void r(@NonNull EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f8260e.e(editorInfo);
    }
}
