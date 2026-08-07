package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.x0;
import j5.k;
import java.util.ArrayList;
import java.util.List;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreferenceGroup extends Preference {
    final x0<String, Long> D;
    private final Handler E;
    private final List<Preference> F;
    private boolean G;
    private int H;
    private boolean I;
    private int J;
    private final Runnable K;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.D.clear();
            }
        }
    }

    public PreferenceGroup(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.D = new x0<>();
        this.E = new Handler(Looper.getMainLooper());
        this.G = true;
        this.H = 0;
        this.I = false;
        this.J = Integer.MAX_VALUE;
        this.K = new a();
        this.F = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f91690v0, i11, i12);
        int i13 = g.f91694x0;
        this.G = k.b(typedArrayObtainStyledAttributes, i13, i13, true);
        if (typedArrayObtainStyledAttributes.hasValue(g.f91692w0)) {
            int i14 = g.f91692w0;
            H(k.d(typedArrayObtainStyledAttributes, i14, i14, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @NonNull
    public Preference F(int i11) {
        return this.F.get(i11);
    }

    public int G() {
        return this.F.size();
    }

    public void H(int i11) {
        if (i11 != Integer.MAX_VALUE && !o()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.J = i11;
    }

    @Override // androidx.preference.Preference
    public void s(boolean z11) {
        super.s(z11);
        int iG = G();
        for (int i11 = 0; i11 < iG; i11++) {
            F(i11).w(this, z11);
        }
    }

    public PreferenceGroup(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreferenceGroup(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
