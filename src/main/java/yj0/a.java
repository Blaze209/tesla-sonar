package yj0;

import ezvcard.VCardVersion;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VCardVersion f125624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<b> f125625b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f125626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f125627d;

    public void a(int i11, Object... objArr) {
        this.f125625b.add(new b.C2731b(this).c(i11, objArr).a());
    }

    public Integer b() {
        return this.f125626c;
    }

    public String c() {
        return this.f125627d;
    }

    public VCardVersion d() {
        return this.f125624a;
    }

    public List<b> e() {
        return this.f125625b;
    }

    public void f(Integer num) {
        this.f125626c = num;
    }

    public void g(String str) {
        this.f125627d = str;
    }

    public void h(VCardVersion vCardVersion) {
        this.f125624a = vCardVersion;
    }
}
