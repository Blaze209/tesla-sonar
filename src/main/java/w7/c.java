package w7;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f121093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f121094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f121095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f121096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f121097f;

    public c(String str, long j11, long j12, long j13, File file) {
        this.f121092a = str;
        this.f121093b = j11;
        this.f121094c = j12;
        this.f121095d = file != null;
        this.f121096e = file;
        this.f121097f = j13;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        if (!this.f121092a.equals(cVar.f121092a)) {
            return this.f121092a.compareTo(cVar.f121092a);
        }
        long j11 = this.f121093b - cVar.f121093b;
        if (j11 == 0) {
            return 0;
        }
        return j11 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f121095d;
    }

    public boolean c() {
        return this.f121094c == -1;
    }

    public String toString() {
        return "[" + this.f121093b + ", " + this.f121094c + "]";
    }
}
