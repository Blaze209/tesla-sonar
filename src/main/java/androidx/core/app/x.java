package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f7611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f7612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f7615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f7616g;

    static class a {
        public static RemoteInput a(x xVar) {
            Set<String> setD;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(xVar.i()).setLabel(xVar.h()).setChoices(xVar.e()).setAllowFreeFormInput(xVar.c()).addExtras(xVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (setD = xVar.d()) != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.a(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.a(builderAddExtras, xVar.f());
            }
            return builderAddExtras.build();
        }
    }

    static class b {
        static RemoteInput.Builder a(RemoteInput.Builder builder, String str, boolean z11) {
            return builder.setAllowDataType(str, z11);
        }
    }

    static class c {
        static RemoteInput.Builder a(RemoteInput.Builder builder, int i11) {
            return builder.setEditChoicesBeforeSending(i11);
        }
    }

    static RemoteInput a(x xVar) {
        return a.a(xVar);
    }

    static RemoteInput[] b(x[] xVarArr) {
        if (xVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[xVarArr.length];
        for (int i11 = 0; i11 < xVarArr.length; i11++) {
            remoteInputArr[i11] = a(xVarArr[i11]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.f7613d;
    }

    public Set<String> d() {
        return this.f7616g;
    }

    public CharSequence[] e() {
        return this.f7612c;
    }

    public int f() {
        return this.f7614e;
    }

    public Bundle g() {
        return this.f7615f;
    }

    public CharSequence h() {
        return this.f7611b;
    }

    public String i() {
        return this.f7610a;
    }

    public boolean j() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
