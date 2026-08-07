package gq;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<String> f69329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f69330b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f69331c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f69332d = false;

    b(List<String> list) {
        this.f69329a = Collections.unmodifiableList(list);
    }

    public int a() {
        return this.f69331c;
    }

    public List<String> b() {
        return this.f69329a;
    }

    public String c() {
        return this.f69330b.e();
    }

    public void d() {
        this.f69332d = true;
    }

    public String toString() {
        return "Context [parentComponents=" + this.f69329a + ", unfoldedLine=" + this.f69330b.e() + ", lineNumber=" + this.f69331c + ", stop=" + this.f69332d + "]";
    }
}
