package es;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f63157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63161e;

    public j(Object obj) {
        this(obj, -1L);
    }

    public j a(Object obj) {
        return this.f63157a.equals(obj) ? this : new j(obj, this.f63158b, this.f63159c, this.f63160d, this.f63161e);
    }

    public boolean b() {
        return this.f63158b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f63157a.equals(jVar.f63157a) && this.f63158b == jVar.f63158b && this.f63159c == jVar.f63159c && this.f63160d == jVar.f63160d && this.f63161e == jVar.f63161e;
    }

    public int hashCode() {
        return ((((((((527 + this.f63157a.hashCode()) * 31) + this.f63158b) * 31) + this.f63159c) * 31) + ((int) this.f63160d)) * 31) + this.f63161e;
    }

    public j(Object obj, long j11) {
        this(obj, -1, -1, j11, -1);
    }

    public j(Object obj, long j11, int i11) {
        this(obj, -1, -1, j11, i11);
    }

    public j(Object obj, int i11, int i12, long j11) {
        this(obj, i11, i12, j11, -1);
    }

    protected j(j jVar) {
        this.f63157a = jVar.f63157a;
        this.f63158b = jVar.f63158b;
        this.f63159c = jVar.f63159c;
        this.f63160d = jVar.f63160d;
        this.f63161e = jVar.f63161e;
    }

    private j(Object obj, int i11, int i12, long j11, int i13) {
        this.f63157a = obj;
        this.f63158b = i11;
        this.f63159c = i12;
        this.f63160d = j11;
        this.f63161e = i13;
    }
}
