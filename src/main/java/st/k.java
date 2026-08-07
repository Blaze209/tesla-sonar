package st;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final st.c f111831m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f111832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f111833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f111834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f111835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    st.c f111836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    st.c f111837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    st.c f111838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    st.c f111839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f f111840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    f f111841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    f f111842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    f f111843l;

    public interface c {
        @NonNull
        st.c a(@NonNull st.c cVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, int i11, int i12) {
        return c(context, i11, i12, 0);
    }

    @NonNull
    private static b c(Context context, int i11, int i12, int i13) {
        return d(context, i11, i12, new st.a(i13));
    }

    @NonNull
    private static b d(Context context, int i11, int i12, @NonNull st.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i11);
        if (i12 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i12);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(zs.m.C7);
        try {
            int i13 = typedArrayObtainStyledAttributes.getInt(zs.m.D7, 0);
            int i14 = typedArrayObtainStyledAttributes.getInt(zs.m.G7, i13);
            int i15 = typedArrayObtainStyledAttributes.getInt(zs.m.H7, i13);
            int i16 = typedArrayObtainStyledAttributes.getInt(zs.m.F7, i13);
            int i17 = typedArrayObtainStyledAttributes.getInt(zs.m.E7, i13);
            st.c cVarM = m(typedArrayObtainStyledAttributes, zs.m.I7, cVar);
            st.c cVarM2 = m(typedArrayObtainStyledAttributes, zs.m.L7, cVarM);
            st.c cVarM3 = m(typedArrayObtainStyledAttributes, zs.m.M7, cVarM);
            st.c cVarM4 = m(typedArrayObtainStyledAttributes, zs.m.K7, cVarM);
            return new b().C(i14, cVarM2).H(i15, cVarM3).w(i16, cVarM4).s(i17, m(typedArrayObtainStyledAttributes, zs.m.J7, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        return f(context, attributeSet, i11, i12, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, int i11, int i12, int i13) {
        return g(context, attributeSet, i11, i12, new st.a(i13));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, int i11, int i12, @NonNull st.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.C5, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(zs.m.D5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(zs.m.E5, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    @NonNull
    private static st.c m(TypedArray typedArray, int i11, @NonNull st.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        if (typedValuePeekValue != null) {
            int i12 = typedValuePeekValue.type;
            if (i12 == 5) {
                return new st.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i12 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    @NonNull
    public f h() {
        return this.f111842k;
    }

    @NonNull
    public d i() {
        return this.f111835d;
    }

    @NonNull
    public st.c j() {
        return this.f111839h;
    }

    @NonNull
    public d k() {
        return this.f111834c;
    }

    @NonNull
    public st.c l() {
        return this.f111838g;
    }

    @NonNull
    public f n() {
        return this.f111843l;
    }

    @NonNull
    public f o() {
        return this.f111841j;
    }

    @NonNull
    public f p() {
        return this.f111840i;
    }

    @NonNull
    public d q() {
        return this.f111832a;
    }

    @NonNull
    public st.c r() {
        return this.f111836e;
    }

    @NonNull
    public d s() {
        return this.f111833b;
    }

    @NonNull
    public st.c t() {
        return this.f111837f;
    }

    public boolean u(@NonNull RectF rectF) {
        boolean z11 = this.f111843l.getClass().equals(f.class) && this.f111841j.getClass().equals(f.class) && this.f111840i.getClass().equals(f.class) && this.f111842k.getClass().equals(f.class);
        float fA = this.f111836e.a(rectF);
        return z11 && ((this.f111837f.a(rectF) > fA ? 1 : (this.f111837f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f111839h.a(rectF) > fA ? 1 : (this.f111839h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f111838g.a(rectF) > fA ? 1 : (this.f111838g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f111833b instanceof j) && (this.f111832a instanceof j) && (this.f111834c instanceof j) && (this.f111835d instanceof j));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public k w(float f11) {
        return v().o(f11).m();
    }

    @NonNull
    public k x(@NonNull st.c cVar) {
        return v().p(cVar).m();
    }

    @NonNull
    public k y(@NonNull c cVar) {
        return v().F(cVar.a(r())).K(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    private k(@NonNull b bVar) {
        this.f111832a = bVar.f111844a;
        this.f111833b = bVar.f111845b;
        this.f111834c = bVar.f111846c;
        this.f111835d = bVar.f111847d;
        this.f111836e = bVar.f111848e;
        this.f111837f = bVar.f111849f;
        this.f111838g = bVar.f111850g;
        this.f111839h = bVar.f111851h;
        this.f111840i = bVar.f111852i;
        this.f111841j = bVar.f111853j;
        this.f111842k = bVar.f111854k;
        this.f111843l = bVar.f111855l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private d f111844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private d f111845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private d f111846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private d f111847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private st.c f111848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        private st.c f111849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        private st.c f111850g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        private st.c f111851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        private f f111852i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        private f f111853j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        private f f111854k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        private f f111855l;

        public b() {
            this.f111844a = h.b();
            this.f111845b = h.b();
            this.f111846c = h.b();
            this.f111847d = h.b();
            this.f111848e = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111849f = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111850g = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111851h = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111852i = h.c();
            this.f111853j = h.c();
            this.f111854k = h.c();
            this.f111855l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f111830a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f111778a;
            }
            return -1.0f;
        }

        @NonNull
        public b A(@NonNull f fVar) {
            this.f111852i = fVar;
            return this;
        }

        @NonNull
        public b B(int i11, float f11) {
            return D(h.a(i11)).E(f11);
        }

        @NonNull
        public b C(int i11, @NonNull st.c cVar) {
            return D(h.a(i11)).F(cVar);
        }

        @NonNull
        public b D(@NonNull d dVar) {
            this.f111844a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        @NonNull
        public b E(float f11) {
            this.f111848e = new st.a(f11);
            return this;
        }

        @NonNull
        public b F(@NonNull st.c cVar) {
            this.f111848e = cVar;
            return this;
        }

        @NonNull
        public b G(int i11, float f11) {
            return I(h.a(i11)).J(f11);
        }

        @NonNull
        public b H(int i11, @NonNull st.c cVar) {
            return I(h.a(i11)).K(cVar);
        }

        @NonNull
        public b I(@NonNull d dVar) {
            this.f111845b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                J(fN);
            }
            return this;
        }

        @NonNull
        public b J(float f11) {
            this.f111849f = new st.a(f11);
            return this;
        }

        @NonNull
        public b K(@NonNull st.c cVar) {
            this.f111849f = cVar;
            return this;
        }

        @NonNull
        public k m() {
            return new k(this);
        }

        @NonNull
        public b o(float f11) {
            return E(f11).J(f11).y(f11).u(f11);
        }

        @NonNull
        public b p(@NonNull st.c cVar) {
            return F(cVar).K(cVar).z(cVar).v(cVar);
        }

        @NonNull
        public b q(int i11, float f11) {
            return r(h.a(i11)).o(f11);
        }

        @NonNull
        public b r(@NonNull d dVar) {
            return D(dVar).I(dVar).x(dVar).t(dVar);
        }

        @NonNull
        public b s(int i11, @NonNull st.c cVar) {
            return t(h.a(i11)).v(cVar);
        }

        @NonNull
        public b t(@NonNull d dVar) {
            this.f111847d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                u(fN);
            }
            return this;
        }

        @NonNull
        public b u(float f11) {
            this.f111851h = new st.a(f11);
            return this;
        }

        @NonNull
        public b v(@NonNull st.c cVar) {
            this.f111851h = cVar;
            return this;
        }

        @NonNull
        public b w(int i11, @NonNull st.c cVar) {
            return x(h.a(i11)).z(cVar);
        }

        @NonNull
        public b x(@NonNull d dVar) {
            this.f111846c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                y(fN);
            }
            return this;
        }

        @NonNull
        public b y(float f11) {
            this.f111850g = new st.a(f11);
            return this;
        }

        @NonNull
        public b z(@NonNull st.c cVar) {
            this.f111850g = cVar;
            return this;
        }

        public b(@NonNull k kVar) {
            this.f111844a = h.b();
            this.f111845b = h.b();
            this.f111846c = h.b();
            this.f111847d = h.b();
            this.f111848e = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111849f = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111850g = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111851h = new st.a(BitmapDescriptorFactory.HUE_RED);
            this.f111852i = h.c();
            this.f111853j = h.c();
            this.f111854k = h.c();
            this.f111855l = h.c();
            this.f111844a = kVar.f111832a;
            this.f111845b = kVar.f111833b;
            this.f111846c = kVar.f111834c;
            this.f111847d = kVar.f111835d;
            this.f111848e = kVar.f111836e;
            this.f111849f = kVar.f111837f;
            this.f111850g = kVar.f111838g;
            this.f111851h = kVar.f111839h;
            this.f111852i = kVar.f111840i;
            this.f111853j = kVar.f111841j;
            this.f111854k = kVar.f111842k;
            this.f111855l = kVar.f111843l;
        }
    }

    public k() {
        this.f111832a = h.b();
        this.f111833b = h.b();
        this.f111834c = h.b();
        this.f111835d = h.b();
        this.f111836e = new st.a(BitmapDescriptorFactory.HUE_RED);
        this.f111837f = new st.a(BitmapDescriptorFactory.HUE_RED);
        this.f111838g = new st.a(BitmapDescriptorFactory.HUE_RED);
        this.f111839h = new st.a(BitmapDescriptorFactory.HUE_RED);
        this.f111840i = h.c();
        this.f111841j = h.c();
        this.f111842k = h.c();
        this.f111843l = h.c();
    }
}
