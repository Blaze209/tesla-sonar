package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import tf.a0;
import tf.c0;
import tf.d0;
import tf.e0;
import tf.h0;
import tf.i0;
import tf.j0;
import tf.k0;
import tf.l0;
import tf.m0;
import tf.u;
import tf.y;

/* JADX INFO: loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f19865p = "LottieAnimationView";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a0<Throwable> f19866q = new a0() { // from class: tf.g
        @Override // tf.a0
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<tf.i> f19867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0<Throwable> f19868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a0<Throwable> f19869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f19871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<c> f19877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<c0> f19878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r<tf.i> f19879o;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends ig.c<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ig.e f19880d;

        a(ig.e eVar) {
            this.f19880d = eVar;
        }

        @Override // ig.c
        public T a(ig.b<T> bVar) {
            return (T) this.f19880d.a(bVar);
        }
    }

    private static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f19882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f19883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f19884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f19885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f19886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f19887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19888g;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f19882a);
            parcel.writeFloat(this.f19884c);
            parcel.writeInt(this.f19885d ? 1 : 0);
            parcel.writeString(this.f19886e);
            parcel.writeInt(this.f19887f);
            parcel.writeInt(this.f19888g);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f19882a = parcel.readString();
            this.f19884c = parcel.readFloat();
            this.f19885d = parcel.readInt() == 1;
            this.f19886e = parcel.readString();
            this.f19887f = parcel.readInt();
            this.f19888g = parcel.readInt();
        }
    }

    private enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class d implements a0<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f19889a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f19889a = new WeakReference<>(lottieAnimationView);
        }

        @Override // tf.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            LottieAnimationView lottieAnimationView = this.f19889a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f19870f != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f19870f);
            }
            (lottieAnimationView.f19869e == null ? LottieAnimationView.f19866q : lottieAnimationView.f19869e).onResult(th2);
        }
    }

    private static class e implements a0<tf.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f19890a;

        public e(LottieAnimationView lottieAnimationView) {
            this.f19890a = new WeakReference<>(lottieAnimationView);
        }

        @Override // tf.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(tf.i iVar) {
            LottieAnimationView lottieAnimationView = this.f19890a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(iVar);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f19867c = new e(this);
        this.f19868d = new d(this);
        this.f19870f = 0;
        this.f19871g = new p();
        this.f19874j = false;
        this.f19875k = false;
        this.f19876l = true;
        this.f19877m = new HashSet();
        this.f19878n = new HashSet();
        s(null, i0.f113339a);
    }

    private void A() {
        boolean zT = t();
        setImageDrawable(null);
        setImageDrawable(this.f19871g);
        if (zT) {
            this.f19871g.s0();
        }
    }

    private void B(float f11, boolean z11) {
        if (z11) {
            this.f19877m.add(c.SET_PROGRESS);
        }
        this.f19871g.V0(f11);
    }

    public static /* synthetic */ e0 c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.f19876l ? u.p(lottieAnimationView.getContext(), str) : u.q(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th2) {
        if (!hg.l.k(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        hg.e.d("Unable to load composition.", th2);
    }

    public static /* synthetic */ e0 e(LottieAnimationView lottieAnimationView, int i11) {
        return lottieAnimationView.f19876l ? u.F(lottieAnimationView.getContext(), i11) : u.G(lottieAnimationView.getContext(), i11, null);
    }

    private void n() {
        r<tf.i> rVar = this.f19879o;
        if (rVar != null) {
            rVar.k(this.f19867c);
            this.f19879o.j(this.f19868d);
        }
    }

    private void o() {
        this.f19871g.x();
    }

    private r<tf.i> q(final String str) {
        if (isInEditMode()) {
            return new r<>(new Callable() { // from class: tf.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.c(this.f113311a, str);
                }
            }, true);
        }
        return this.f19876l ? u.n(getContext(), str) : u.o(getContext(), str, null);
    }

    private r<tf.i> r(final int i11) {
        if (isInEditMode()) {
            return new r<>(new Callable() { // from class: tf.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.e(this.f113314a, i11);
                }
            }, true);
        }
        return this.f19876l ? u.D(getContext(), i11) : u.E(getContext(), i11, null);
    }

    private void s(AttributeSet attributeSet, int i11) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.f113343a, i11, 0);
        this.f19876l = typedArrayObtainStyledAttributes.getBoolean(j0.f113348f, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(j0.f113360r);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(j0.f113355m);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(j0.f113365w);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(j0.f113360r, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(j0.f113355m);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(j0.f113365w)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(j0.f113354l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(j0.f113347e, false)) {
            this.f19875k = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(j0.f113358p, false)) {
            this.f19871g.X0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113363u)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(j0.f113363u, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113362t)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(j0.f113362t, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113364v)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(j0.f113364v, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113350h)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(j0.f113350h, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113349g)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(j0.f113349g, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113352j)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(j0.f113352j));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(j0.f113357o));
        B(typedArrayObtainStyledAttributes.getFloat(j0.f113359q, BitmapDescriptorFactory.HUE_RED), typedArrayObtainStyledAttributes.hasValue(j0.f113359q));
        p(typedArrayObtainStyledAttributes.getBoolean(j0.f113353k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(j0.f113344b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(j0.f113345c, true));
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113351i)) {
            k(new ag.e("**"), d0.K, new ig.c(new l0(j.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(j0.f113351i, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113361s)) {
            int i12 = j0.f113361s;
            k0 k0Var = k0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i12, k0Var.ordinal());
            if (iOrdinal >= k0.values().length) {
                iOrdinal = k0Var.ordinal();
            }
            setRenderMode(k0.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113346d)) {
            int i13 = j0.f113346d;
            tf.a aVar = tf.a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i13, aVar.ordinal());
            if (iOrdinal2 >= k0.values().length) {
                iOrdinal2 = aVar.ordinal();
            }
            setAsyncUpdates(tf.a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(j0.f113356n, false));
        if (typedArrayObtainStyledAttributes.hasValue(j0.f113366x)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(j0.f113366x, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(r<tf.i> rVar) {
        e0<tf.i> e0VarE = rVar.e();
        p pVar = this.f19871g;
        if (e0VarE != null && pVar == getDrawable() && pVar.N() == e0VarE.b()) {
            return;
        }
        this.f19877m.add(c.SET_ANIMATION);
        o();
        n();
        this.f19879o = rVar.d(this.f19867c).c(this.f19868d);
    }

    public tf.a getAsyncUpdates() {
        return this.f19871g.I();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f19871g.J();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f19871g.L();
    }

    public boolean getClipToCompositionBounds() {
        return this.f19871g.M();
    }

    public tf.i getComposition() {
        Drawable drawable = getDrawable();
        p pVar = this.f19871g;
        if (drawable == pVar) {
            return pVar.N();
        }
        return null;
    }

    public long getDuration() {
        tf.i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f19871g.Q();
    }

    public String getImageAssetsFolder() {
        return this.f19871g.S();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f19871g.U();
    }

    public float getMaxFrame() {
        return this.f19871g.W();
    }

    public float getMinFrame() {
        return this.f19871g.X();
    }

    public h0 getPerformanceTracker() {
        return this.f19871g.Y();
    }

    public float getProgress() {
        return this.f19871g.Z();
    }

    public k0 getRenderMode() {
        return this.f19871g.a0();
    }

    public int getRepeatCount() {
        return this.f19871g.b0();
    }

    public int getRepeatMode() {
        return this.f19871g.c0();
    }

    public float getSpeed() {
        return this.f19871g.d0();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f19871g.s(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof p) && ((p) drawable).a0() == k0.SOFTWARE) {
            this.f19871g.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        p pVar = this.f19871g;
        if (drawable2 == pVar) {
            super.invalidateDrawable(pVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(@NonNull c0 c0Var) {
        tf.i composition = getComposition();
        if (composition != null) {
            c0Var.a(composition);
        }
        return this.f19878n.add(c0Var);
    }

    public <T> void k(ag.e eVar, T t11, ig.c<T> cVar) {
        this.f19871g.t(eVar, t11, cVar);
    }

    public <T> void l(ag.e eVar, T t11, ig.e<T> eVar2) {
        this.f19871g.t(eVar, t11, new a(eVar2));
    }

    public void m() {
        this.f19875k = false;
        this.f19877m.add(c.PLAY_OPTION);
        this.f19871g.w();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f19875k) {
            return;
        }
        this.f19871g.n0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f19872h = bVar.f19882a;
        Set<c> set = this.f19877m;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f19872h)) {
            setAnimation(this.f19872h);
        }
        this.f19873i = bVar.f19883b;
        if (!this.f19877m.contains(cVar) && (i11 = this.f19873i) != 0) {
            setAnimation(i11);
        }
        if (!this.f19877m.contains(c.SET_PROGRESS)) {
            B(bVar.f19884c, false);
        }
        if (!this.f19877m.contains(c.PLAY_OPTION) && bVar.f19885d) {
            v();
        }
        if (!this.f19877m.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f19886e);
        }
        if (!this.f19877m.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.f19887f);
        }
        if (this.f19877m.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bVar.f19888g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f19882a = this.f19872h;
        bVar.f19883b = this.f19873i;
        bVar.f19884c = this.f19871g.Z();
        bVar.f19885d = this.f19871g.i0();
        bVar.f19886e = this.f19871g.S();
        bVar.f19887f = this.f19871g.c0();
        bVar.f19888g = this.f19871g.b0();
        return bVar;
    }

    public void p(boolean z11) {
        this.f19871g.E(y.MergePathsApi19, z11);
    }

    public void setAnimation(int i11) {
        this.f19873i = i11;
        this.f19872h = null;
        setCompositionTask(r(i11));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f19876l ? u.H(getContext(), str) : u.I(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z11) {
        this.f19871g.v0(z11);
    }

    public void setApplyingShadowToLayersEnabled(boolean z11) {
        this.f19871g.w0(z11);
    }

    public void setAsyncUpdates(tf.a aVar) {
        this.f19871g.x0(aVar);
    }

    public void setCacheComposition(boolean z11) {
        this.f19876l = z11;
    }

    public void setClipTextToBoundingBox(boolean z11) {
        this.f19871g.y0(z11);
    }

    public void setClipToCompositionBounds(boolean z11) {
        this.f19871g.z0(z11);
    }

    public void setComposition(@NonNull tf.i iVar) {
        if (tf.e.f113298a) {
            Log.v(f19865p, "Set Composition \n" + iVar);
        }
        this.f19871g.setCallback(this);
        this.f19874j = true;
        boolean zA0 = this.f19871g.A0(iVar);
        if (this.f19875k) {
            this.f19871g.n0();
        }
        this.f19874j = false;
        if (getDrawable() != this.f19871g || zA0) {
            if (!zA0) {
                A();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<c0> it = this.f19878n.iterator();
            while (it.hasNext()) {
                it.next().a(iVar);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f19871g.B0(str);
    }

    public void setFailureListener(a0<Throwable> a0Var) {
        this.f19869e = a0Var;
    }

    public void setFallbackResource(int i11) {
        this.f19870f = i11;
    }

    public void setFontAssetDelegate(tf.b bVar) {
        this.f19871g.C0(bVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f19871g.D0(map);
    }

    public void setFrame(int i11) {
        this.f19871g.E0(i11);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z11) {
        this.f19871g.F0(z11);
    }

    public void setImageAssetDelegate(tf.c cVar) {
        this.f19871g.G0(cVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f19871g.H0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f19873i = 0;
        this.f19872h = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f19873i = 0;
        this.f19872h = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        this.f19873i = 0;
        this.f19872h = null;
        n();
        super.setImageResource(i11);
    }

    public void setMaintainOriginalImageBounds(boolean z11) {
        this.f19871g.I0(z11);
    }

    public void setMaxFrame(int i11) {
        this.f19871g.J0(i11);
    }

    public void setMaxProgress(float f11) {
        this.f19871g.L0(f11);
    }

    public void setMinAndMaxFrame(String str) {
        this.f19871g.N0(str);
    }

    public void setMinAndMaxProgress(float f11, float f12) {
        this.f19871g.P0(f11, f12);
    }

    public void setMinFrame(int i11) {
        this.f19871g.Q0(i11);
    }

    public void setMinProgress(float f11) {
        this.f19871g.S0(f11);
    }

    public void setOutlineMasksAndMattes(boolean z11) {
        this.f19871g.T0(z11);
    }

    public void setPerformanceTrackingEnabled(boolean z11) {
        this.f19871g.U0(z11);
    }

    public void setProgress(float f11) {
        B(f11, true);
    }

    public void setRenderMode(k0 k0Var) {
        this.f19871g.W0(k0Var);
    }

    public void setRepeatCount(int i11) {
        this.f19877m.add(c.SET_REPEAT_COUNT);
        this.f19871g.X0(i11);
    }

    public void setRepeatMode(int i11) {
        this.f19877m.add(c.SET_REPEAT_MODE);
        this.f19871g.Y0(i11);
    }

    public void setSafeMode(boolean z11) {
        this.f19871g.Z0(z11);
    }

    public void setSpeed(float f11) {
        this.f19871g.a1(f11);
    }

    public void setTextDelegate(m0 m0Var) {
        this.f19871g.b1(m0Var);
    }

    public void setUseCompositionFrameRate(boolean z11) {
        this.f19871g.c1(z11);
    }

    public boolean t() {
        return this.f19871g.h0();
    }

    public void u() {
        this.f19875k = false;
        this.f19871g.m0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        p pVar;
        if (!this.f19874j && drawable == (pVar = this.f19871g) && pVar.h0()) {
            u();
        } else if (!this.f19874j && (drawable instanceof p)) {
            p pVar2 = (p) drawable;
            if (pVar2.h0()) {
                pVar2.m0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f19877m.add(c.PLAY_OPTION);
        this.f19871g.n0();
    }

    public void w() {
        this.f19871g.o0();
    }

    public void x() {
        this.f19871g.p0();
    }

    public void y() {
        this.f19877m.add(c.PLAY_OPTION);
        this.f19871g.s0();
    }

    public void z() {
        this.f19871g.t0();
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f19871g.K0(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z11) {
        this.f19871g.O0(str, str2, z11);
    }

    public void setMinFrame(String str) {
        this.f19871g.R0(str);
    }

    public void setMinAndMaxFrame(int i11, int i12) {
        this.f19871g.M0(i11, i12);
    }

    public void setAnimation(String str) {
        this.f19872h = str;
        this.f19873i = 0;
        setCompositionTask(q(str));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(u.I(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(u.t(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(u.K(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19867c = new e(this);
        this.f19868d = new d(this);
        this.f19870f = 0;
        this.f19871g = new p();
        this.f19874j = false;
        this.f19875k = false;
        this.f19876l = true;
        this.f19877m = new HashSet();
        this.f19878n = new HashSet();
        s(attributeSet, i0.f113339a);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f19867c = new e(this);
        this.f19868d = new d(this);
        this.f19870f = 0;
        this.f19871g = new p();
        this.f19874j = false;
        this.f19875k = false;
        this.f19876l = true;
        this.f19877m = new HashSet();
        this.f19878n = new HashSet();
        s(attributeSet, i11);
    }
}
