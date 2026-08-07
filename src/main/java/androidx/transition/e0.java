package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f14042b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f14041a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<r> f14043c = new ArrayList<>();

    @Deprecated
    public e0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f14042b == e0Var.f14042b && this.f14041a.equals(e0Var.f14041a);
    }

    public int hashCode() {
        return (this.f14042b.hashCode() * 31) + this.f14041a.hashCode();
    }

    @NonNull
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f14042b + "\n") + "    values:";
        for (String str2 : this.f14041a.keySet()) {
            str = str + "    " + str2 + ": " + this.f14041a.get(str2) + "\n";
        }
        return str;
    }

    public e0(@NonNull View view) {
        this.f14042b = view;
    }
}
