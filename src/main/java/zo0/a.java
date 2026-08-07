package zo0;

import java.io.Serializable;
import java.util.EventObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends EventObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Serializable f128456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f128457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f128458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f128459d;

    public a(Object obj, Serializable serializable, int i11, f fVar, j jVar) {
        super(obj);
        this.f128456a = serializable;
        this.f128457b = i11;
        this.f128458c = fVar;
        this.f128459d = jVar;
    }

    public f a() {
        return this.f128458c;
    }

    public j b() {
        return this.f128459d;
    }

    public Object c() {
        return this.f128456a;
    }
}
