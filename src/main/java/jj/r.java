package jj;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class r<Model, Data> implements o<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f83881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.f<List<Throwable>> f83882b;

    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, com.bumptech.glide.load.data.d.a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f83883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u5.f<List<Throwable>> f83884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f83885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.h f83886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bumptech.glide.load.data.d.a<? super Data> f83887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Throwable> f83888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f83889g;

        a(@NonNull List<com.bumptech.glide.load.data.d<Data>> list, @NonNull u5.f<List<Throwable>> fVar) {
            this.f83884b = fVar;
            xj.k.c(list);
            this.f83883a = list;
            this.f83885c = 0;
        }

        private void g() {
            if (this.f83889g) {
                return;
            }
            if (this.f83885c < this.f83883a.size() - 1) {
                this.f83885c++;
                d(this.f83886d, this.f83887e);
            } else {
                xj.k.d(this.f83888f);
                this.f83887e.f(new GlideException("Fetch failed", new ArrayList(this.f83888f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f83883a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f83888f;
            if (list != null) {
                this.f83884b.a(list);
            }
            this.f83888f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f83883a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public dj.a c() {
            return this.f83883a.get(0).c();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f83889g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f83883a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull com.bumptech.glide.h hVar, @NonNull com.bumptech.glide.load.data.d.a<? super Data> aVar) {
            this.f83886d = hVar;
            this.f83887e = aVar;
            this.f83888f = this.f83884b.b();
            this.f83883a.get(this.f83885c).d(hVar, this);
            if (this.f83889g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(Data data) {
            if (data != null) {
                this.f83887e.e(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@NonNull Exception exc) {
            ((List) xj.k.d(this.f83888f)).add(exc);
            g();
        }
    }

    r(@NonNull List<o<Model, Data>> list, @NonNull u5.f<List<Throwable>> fVar) {
        this.f83881a = list;
        this.f83882b = fVar;
    }

    @Override // jj.o
    public boolean a(@NonNull Model model) {
        Iterator<o<Model, Data>> it = this.f83881a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // jj.o
    public o.a<Data> b(@NonNull Model model, int i11, int i12, @NonNull dj.h hVar) {
        o.a<Data> aVarB;
        int size = this.f83881a.size();
        ArrayList arrayList = new ArrayList(size);
        dj.e eVar = null;
        for (int i13 = 0; i13 < size; i13++) {
            o<Model, Data> oVar = this.f83881a.get(i13);
            if (oVar.a(model) && (aVarB = oVar.b(model, i11, i12, hVar)) != null) {
                eVar = aVarB.f83874a;
                arrayList.add(aVarB.f83876c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new o.a<>(eVar, new a(arrayList, this.f83882b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f83881a.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
