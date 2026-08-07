package kj;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.j;
import dj.g;
import java.io.InputStream;
import jj.h;
import jj.n;
import jj.o;
import jj.p;
import jj.s;

/* JADX INFO: loaded from: classes3.dex */
public class a implements o<h, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g<Integer> f86156b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<h, h> f86157a;

    public a(n<h, h> nVar) {
        this.f86157a = nVar;
    }

    @Override // jj.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(@NonNull h hVar, int i11, int i12, @NonNull dj.h hVar2) {
        n<h, h> nVar = this.f86157a;
        if (nVar != null) {
            h hVarA = nVar.a(hVar, 0, 0);
            if (hVarA == null) {
                this.f86157a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVarA;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) hVar2.c(f86156b)).intValue()));
    }

    @Override // jj.o
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull h hVar) {
        return true;
    }

    /* JADX INFO: renamed from: kj.a$a, reason: collision with other inner class name */
    public static class C1844a implements p<h, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n<h, h> f86158a = new n<>(500);

        @Override // jj.p
        @NonNull
        public o<h, InputStream> e(s sVar) {
            return new a(this.f86158a);
        }

        @Override // jj.p
        public void d() {
        }
    }
}
