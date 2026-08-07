package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import j5.h;
import j5.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class c extends f implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0240c f14209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f14210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f14211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f14212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f14213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f14214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f14215h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            c.this.scheduleSelf(runnable, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f14214g);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i11)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f14214g);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i11)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0240c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f14219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f14220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f14221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.collection.a<Animator, String> f14222e;

        public C0240c(Context context, C0240c c0240c, Drawable.Callback callback, Resources resources) {
            if (c0240c != null) {
                this.f14218a = c0240c.f14218a;
                g gVar = c0240c.f14219b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f14219b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f14219b = (g) constantState.newDrawable();
                    }
                    g gVar2 = (g) this.f14219b.mutate();
                    this.f14219b = gVar2;
                    gVar2.setCallback(callback);
                    this.f14219b.setBounds(c0240c.f14219b.getBounds());
                    this.f14219b.g(false);
                }
                ArrayList<Animator> arrayList = c0240c.f14221d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f14221d = new ArrayList<>(size);
                    this.f14222e = new androidx.collection.a<>(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        Animator animator = c0240c.f14221d.get(i11);
                        Animator animatorClone = animator.clone();
                        String str = c0240c.f14222e.get(animator);
                        animatorClone.setTarget(this.f14219b.c(str));
                        this.f14221d.add(animatorClone);
                        this.f14222e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f14220c == null) {
                this.f14220c = new AnimatorSet();
            }
            this.f14220c.playTogether(this.f14221d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14218a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(@NonNull Context context, int i11) {
        c cVar = new c(context);
        Drawable drawableF = h.f(context.getResources(), i11, context.getTheme());
        cVar.f14224a = drawableF;
        drawableF.setCallback(cVar.f14215h);
        cVar.f14212e = new d(cVar.f14224a.getConstantState());
        return cVar;
    }

    private static void c(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f14213f;
        if (animatorListener != null) {
            this.f14209b.f14220c.removeListener(animatorListener);
            this.f14213f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f14209b.f14219b.c(str));
        C0240c c0240c = this.f14209b;
        if (c0240c.f14221d == null) {
            c0240c.f14221d = new ArrayList<>();
            this.f14209b.f14222e = new androidx.collection.a<>();
        }
        this.f14209b.f14221d.add(animator);
        this.f14209b.f14222e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.a(drawable, theme);
        }
    }

    public void b(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f14214g == null) {
            this.f14214g = new ArrayList<>();
        }
        if (this.f14214g.contains(bVar)) {
            return;
        }
        this.f14214g.add(bVar);
        if (this.f14213f == null) {
            this.f14213f = new b();
        }
        this.f14209b.f14220c.addListener(this.f14213f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            return l5.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f14209b.f14219b.draw(canvas);
        if (this.f14209b.f14220c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f14214g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f14214g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f14224a;
        return drawable != null ? l5.a.d(drawable) : this.f14209b.f14219b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f14209b.f14218a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f14224a;
        return drawable != null ? l5.a.e(drawable) : this.f14209b.f14219b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f14224a != null) {
            return new d(this.f14224a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f14209b.f14219b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f14209b.f14219b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.getOpacity() : this.f14209b.f14219b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayS = k.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14199e);
                    int resourceId = typedArrayS.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVarB = g.b(resources, resourceId, theme);
                        gVarB.g(false);
                        gVarB.setCallback(this.f14215h);
                        g gVar = this.f14209b.f14219b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f14209b.f14219b = gVarB;
                    }
                    typedArrayS.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f14200f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f14210c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, e.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f14209b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f14224a;
        return drawable != null ? l5.a.h(drawable) : this.f14209b.f14219b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f14224a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f14209b.f14220c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.isStateful() : this.f14209b.f14219b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f14209b.f14219b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.setLevel(i11) : this.f14209b.f14219b.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14224a;
        return drawable != null ? drawable.setState(iArr) : this.f14209b.f14219b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f14209b.f14219b.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.j(drawable, z11);
        } else {
            this.f14209b.f14219b.setAutoMirrored(z11);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i11) {
        super.setChangingConfigurations(i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i11, PorterDuff.Mode mode) {
        super.setColorFilter(i11, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z11) {
        super.setFilterBitmap(z11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.n(drawable, i11);
        } else {
            this.f14209b.f14219b.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.o(drawable, colorStateList);
        } else {
            this.f14209b.f14219b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            l5.a.p(drawable, mode);
        } else {
            this.f14209b.f14219b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f14209b.f14219b.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f14209b.f14220c.isStarted()) {
                return;
            }
            this.f14209b.f14220c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f14209b.f14220c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14224a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14209b.f14219b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f14223a;

        public d(Drawable.ConstantState constantState) {
            this.f14223a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f14223a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14223a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f14223a.newDrawable();
            cVar.f14224a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f14215h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f14223a.newDrawable(resources);
            cVar.f14224a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f14215h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f14223a.newDrawable(resources, theme);
            cVar.f14224a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f14215h);
            return cVar;
        }
    }

    private c(Context context, C0240c c0240c, Resources resources) {
        this.f14211d = null;
        this.f14213f = null;
        this.f14214g = null;
        a aVar = new a();
        this.f14215h = aVar;
        this.f14210c = context;
        if (c0240c != null) {
            this.f14209b = c0240c;
        } else {
            this.f14209b = new C0240c(context, c0240c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
