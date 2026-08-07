package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d7.b f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final char[] f8330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final a f8331c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Typeface f8332d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f8333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f8334b;

        private a() {
            this(1);
        }

        a a(int i11) {
            SparseArray<a> sparseArray = this.f8333a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i11);
        }

        final o b() {
            return this.f8334b;
        }

        void c(@NonNull o oVar, int i11, int i12) {
            a aVarA = a(oVar.b(i11));
            if (aVarA == null) {
                aVarA = new a();
                this.f8333a.put(oVar.b(i11), aVarA);
            }
            if (i12 > i11) {
                aVarA.c(oVar, i11 + 1, i12);
            } else {
                aVarA.f8334b = oVar;
            }
        }

        a(int i11) {
            this.f8333a = new SparseArray<>(i11);
        }
    }

    private m(@NonNull Typeface typeface, @NonNull d7.b bVar) {
        this.f8332d = typeface;
        this.f8329a = bVar;
        this.f8330b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(d7.b bVar) {
        int iK = bVar.k();
        for (int i11 = 0; i11 < iK; i11++) {
            o oVar = new o(this, i11);
            Character.toChars(oVar.f(), this.f8330b, i11 * 2);
            h(oVar);
        }
    }

    @NonNull
    public static m b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) {
        try {
            q5.k.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            q5.k.b();
        }
    }

    @NonNull
    public char[] c() {
        return this.f8330b;
    }

    @NonNull
    public d7.b d() {
        return this.f8329a;
    }

    int e() {
        return this.f8329a.l();
    }

    @NonNull
    a f() {
        return this.f8331c;
    }

    @NonNull
    Typeface g() {
        return this.f8332d;
    }

    void h(@NonNull o oVar) {
        u5.h.h(oVar, "emoji metadata cannot be null");
        u5.h.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.f8331c.c(oVar, 0, oVar.c() - 1);
    }
}
