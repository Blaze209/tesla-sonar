package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f8040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f8041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected volatile p0 f8042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile g f8043d;

    protected void a(p0 p0Var) {
        if (this.f8042c != null) {
            return;
        }
        synchronized (this) {
            if (this.f8042c != null) {
                return;
            }
            try {
                if (this.f8040a != null) {
                    this.f8042c = p0Var.getParserForType().b(this.f8040a, this.f8041b);
                    this.f8043d = this.f8040a;
                } else {
                    this.f8042c = p0Var;
                    this.f8043d = g.f8057b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f8042c = p0Var;
                this.f8043d = g.f8057b;
            }
        }
    }

    public int b() {
        if (this.f8043d != null) {
            return this.f8043d.size();
        }
        g gVar = this.f8040a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f8042c != null) {
            return this.f8042c.getSerializedSize();
        }
        return 0;
    }

    public p0 c(p0 p0Var) {
        a(p0Var);
        return this.f8042c;
    }

    public p0 d(p0 p0Var) {
        p0 p0Var2 = this.f8042c;
        this.f8040a = null;
        this.f8043d = null;
        this.f8042c = p0Var;
        return p0Var2;
    }

    public g e() {
        if (this.f8043d != null) {
            return this.f8043d;
        }
        g gVar = this.f8040a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f8043d != null) {
                    return this.f8043d;
                }
                if (this.f8042c == null) {
                    this.f8043d = g.f8057b;
                } else {
                    this.f8043d = this.f8042c.toByteString();
                }
                return this.f8043d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
