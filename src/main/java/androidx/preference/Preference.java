package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import j5.k;
import java.util.List;
import ma.c;
import ma.e;
import ma.g;

/* JADX INFO: loaded from: classes3.dex */
public class Preference implements Comparable<Preference> {
    private List<Preference> A;
    private b B;
    private final View.OnClickListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Context f13001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f13004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f13005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f13007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Intent f13008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f13009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f13012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f13013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f13014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13015o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f13017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f13018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f13019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13020t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f13021u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13022v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f13024x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f13025y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f13026z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.y(view);
        }
    }

    public interface b<T extends Preference> {
        CharSequence a(@NonNull T t11);
    }

    public Preference(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f13002b = Integer.MAX_VALUE;
        this.f13003c = 0;
        this.f13010j = true;
        this.f13011k = true;
        this.f13012l = true;
        this.f13015o = true;
        this.f13016p = true;
        this.f13017q = true;
        this.f13018r = true;
        this.f13019s = true;
        this.f13021u = true;
        this.f13024x = true;
        this.f13025y = e.f91640a;
        this.C = new a();
        this.f13001a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.I, i11, i12);
        this.f13006f = k.n(typedArrayObtainStyledAttributes, g.f91660g0, g.J, 0);
        this.f13007g = k.o(typedArrayObtainStyledAttributes, g.f91666j0, g.P);
        this.f13004d = k.p(typedArrayObtainStyledAttributes, g.f91682r0, g.N);
        this.f13005e = k.p(typedArrayObtainStyledAttributes, g.f91680q0, g.Q);
        this.f13002b = k.d(typedArrayObtainStyledAttributes, g.f91670l0, g.R, Integer.MAX_VALUE);
        this.f13009i = k.o(typedArrayObtainStyledAttributes, g.f91658f0, g.W);
        this.f13025y = k.n(typedArrayObtainStyledAttributes, g.f91668k0, g.M, e.f91640a);
        this.f13026z = k.n(typedArrayObtainStyledAttributes, g.f91684s0, g.S, 0);
        this.f13010j = k.b(typedArrayObtainStyledAttributes, g.f91655e0, g.L, true);
        this.f13011k = k.b(typedArrayObtainStyledAttributes, g.f91674n0, g.O, true);
        this.f13012l = k.b(typedArrayObtainStyledAttributes, g.f91672m0, g.K, true);
        this.f13013m = k.o(typedArrayObtainStyledAttributes, g.f91649c0, g.T);
        int i13 = g.Z;
        this.f13018r = k.b(typedArrayObtainStyledAttributes, i13, i13, this.f13011k);
        int i14 = g.f91643a0;
        this.f13019s = k.b(typedArrayObtainStyledAttributes, i14, i14, this.f13011k);
        if (typedArrayObtainStyledAttributes.hasValue(g.f91646b0)) {
            this.f13014n = v(typedArrayObtainStyledAttributes, g.f91646b0);
        } else if (typedArrayObtainStyledAttributes.hasValue(g.U)) {
            this.f13014n = v(typedArrayObtainStyledAttributes, g.U);
        }
        this.f13024x = k.b(typedArrayObtainStyledAttributes, g.f91676o0, g.V, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(g.f91678p0);
        this.f13020t = zHasValue;
        if (zHasValue) {
            this.f13021u = k.b(typedArrayObtainStyledAttributes, g.f91678p0, g.X, true);
        }
        this.f13022v = k.b(typedArrayObtainStyledAttributes, g.f91662h0, g.Y, false);
        int i15 = g.f91664i0;
        this.f13017q = k.b(typedArrayObtainStyledAttributes, i15, i15, true);
        int i16 = g.f91652d0;
        this.f13023w = k.b(typedArrayObtainStyledAttributes, i16, i16, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected boolean A(int i11) {
        if (!E()) {
            return false;
        }
        if (i11 == h(~i11)) {
            return true;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean B(String str) {
        if (!E()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, i(null))) {
            return true;
        }
        j();
        obj.getClass();
        throw null;
    }

    public final void C(b bVar) {
        this.B = bVar;
        r();
    }

    public boolean D() {
        return !p();
    }

    protected boolean E() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Preference preference) {
        int i11 = this.f13002b;
        int i12 = preference.f13002b;
        if (i11 != i12) {
            return i11 - i12;
        }
        CharSequence charSequence = this.f13004d;
        CharSequence charSequence2 = preference.f13004d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f13004d.toString());
    }

    @NonNull
    public Context c() {
        return this.f13001a;
    }

    @NonNull
    StringBuilder d() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceN = n();
        if (!TextUtils.isEmpty(charSequenceN)) {
            sb2.append(charSequenceN);
            sb2.append(' ');
        }
        CharSequence charSequenceL = l();
        if (!TextUtils.isEmpty(charSequenceL)) {
            sb2.append(charSequenceL);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String e() {
        return this.f13009i;
    }

    public Intent f() {
        return this.f13008h;
    }

    protected boolean g(boolean z11) {
        if (!E()) {
            return z11;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected int h(int i11) {
        if (!E()) {
            return i11;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected String i(String str) {
        if (!E()) {
            return str;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public ma.a j() {
        return null;
    }

    public ma.b k() {
        return null;
    }

    public CharSequence l() {
        return m() != null ? m().a(this) : this.f13005e;
    }

    public final b m() {
        return this.B;
    }

    public CharSequence n() {
        return this.f13004d;
    }

    public boolean o() {
        return !TextUtils.isEmpty(this.f13007g);
    }

    public boolean p() {
        return this.f13010j && this.f13015o && this.f13016p;
    }

    public boolean q() {
        return this.f13011k;
    }

    protected void r() {
    }

    public void s(boolean z11) {
        List<Preference> list = this.A;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).u(this, z11);
        }
    }

    protected void t() {
    }

    @NonNull
    public String toString() {
        return d().toString();
    }

    public void u(@NonNull Preference preference, boolean z11) {
        if (this.f13015o == z11) {
            this.f13015o = !z11;
            s(D());
            r();
        }
    }

    protected Object v(@NonNull TypedArray typedArray, int i11) {
        return null;
    }

    public void w(@NonNull Preference preference, boolean z11) {
        if (this.f13016p == z11) {
            this.f13016p = !z11;
            s(D());
            r();
        }
    }

    public void x() {
        if (p() && q()) {
            t();
            k();
            if (this.f13008h != null) {
                c().startActivity(this.f13008h);
            }
        }
    }

    protected void y(@NonNull View view) {
        x();
    }

    protected boolean z(boolean z11) {
        if (!E()) {
            return false;
        }
        if (z11 == g(!z11)) {
            return true;
        }
        j();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public Preference(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public Preference(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f91635g, R.attr.preferenceStyle));
    }
}
