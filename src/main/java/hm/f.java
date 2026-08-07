package hm;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f73175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private tk.a<Bitmap> f73176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<tk.a<Bitmap>> f73177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f73179e;

    f(c cVar) {
        this.f73175a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e a() {
        try {
            return new e(this);
        } finally {
            tk.a.C(this.f73176b);
            this.f73176b = null;
            tk.a.B(this.f73177c);
            this.f73177c = null;
        }
    }

    public dn.a b() {
        return null;
    }

    public List<tk.a<Bitmap>> c() {
        return tk.a.o(this.f73177c);
    }

    public int d() {
        return this.f73178d;
    }

    public c e() {
        return this.f73175a;
    }

    public tk.a<Bitmap> f() {
        return tk.a.t(this.f73176b);
    }

    public String g() {
        return this.f73179e;
    }

    public f i(List<tk.a<Bitmap>> list) {
        this.f73177c = tk.a.o(list);
        return this;
    }

    public f j(int i11) {
        this.f73178d = i11;
        return this;
    }

    public f k(tk.a<Bitmap> aVar) {
        this.f73176b = tk.a.t(aVar);
        return this;
    }

    public f l(String str) {
        this.f73179e = str;
        return this;
    }

    public f h(dn.a aVar) {
        return this;
    }
}
