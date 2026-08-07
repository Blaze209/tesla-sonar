package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f6477f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f6478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f6480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f6481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap<String, androidx.constraintlayout.widget.a> f6482e;

    public d() {
        int i11 = f6477f;
        this.f6478a = i11;
        this.f6479b = i11;
        this.f6480c = null;
    }

    public abstract void a(HashMap<String, f5.d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract d clone();

    public d c(d dVar) {
        this.f6478a = dVar.f6478a;
        this.f6479b = dVar.f6479b;
        this.f6480c = dVar.f6480c;
        this.f6481d = dVar.f6481d;
        this.f6482e = dVar.f6482e;
        return this;
    }

    abstract void d(HashSet<String> hashSet);

    abstract void e(Context context, AttributeSet attributeSet);

    boolean f(String str) {
        String str2 = this.f6480c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(HashMap<String, Integer> map) {
    }

    public d h(int i11) {
        this.f6479b = i11;
        return this;
    }
}
