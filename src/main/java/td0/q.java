package td0;

import io.realm.a1;
import io.realm.p0;

/* JADX INFO: loaded from: classes8.dex */
public class q extends p0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f113230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f113231b;

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        if (this instanceof io.realm.internal.o) {
            ((io.realm.internal.o) this).d();
        }
    }

    public byte[] a() {
        return this.f113231b;
    }

    public String b() {
        return this.f113230a;
    }

    public void c(String str) {
        this.f113230a = str;
    }

    public void e(byte[] bArr) {
        this.f113231b = bArr;
    }
}
