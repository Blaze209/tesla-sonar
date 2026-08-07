package ro;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final ro.a mLayoutCreateAnimation = new h();
    private final ro.a mLayoutUpdateAnimation = new k();
    private final ro.a mLayoutDeleteAnimation = new i();
    private final SparseArray<j> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f108642a;

        a(Callback callback) {
            this.f108642a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f108642a.invoke(Boolean.TRUE);
        }
    }

    private void disableUserInteractions(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                disableUserInteractions(viewGroup.getChildAt(i11));
            }
        }
    }

    private void scheduleCompletionCallback(long j11) {
        if (this.mCompletionRunnable != null) {
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
            uiThreadHandler.postDelayed(this.mCompletionRunnable, j11);
        }
    }

    public void applyLayoutUpdate(View view, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        int id2 = view.getId();
        j jVar = this.mLayoutHandlers.get(id2);
        if (jVar != null) {
            jVar.a(i11, i12, i13, i14);
            return;
        }
        Animation animationA = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.mLayoutCreateAnimation : this.mLayoutUpdateAnimation).a(view, i11, i12, i13, i14);
        if (animationA instanceof j) {
            animationA.setAnimationListener(new b(id2));
        } else {
            view.layout(i11, i12, i11 + i13, i12 + i14);
        }
        if (animationA != null) {
            long duration = animationA.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                scheduleCompletionCallback(duration);
            }
            view.startAnimation(animationA);
        }
    }

    public void deleteView(View view, f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation animationA = this.mLayoutDeleteAnimation.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationA == null) {
            fVar.a();
            return;
        }
        disableUserInteractions(view);
        animationA.setAnimationListener(new c(fVar));
        long duration = animationA.getDuration();
        if (duration > this.mMaxAnimationDuration) {
            scheduleCompletionCallback(duration);
            this.mMaxAnimationDuration = duration;
        }
        view.startAnimation(animationA);
    }

    public void initializeFromConfig(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i11 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        g gVar = g.CREATE;
        if (readableMap.hasKey(g.toString(gVar))) {
            this.mLayoutCreateAnimation.d(readableMap.getMap(g.toString(gVar)), i11);
            this.mShouldAnimateLayout = true;
        }
        g gVar2 = g.UPDATE;
        if (readableMap.hasKey(g.toString(gVar2))) {
            this.mLayoutUpdateAnimation.d(readableMap.getMap(g.toString(gVar2)), i11);
            this.mShouldAnimateLayout = true;
        }
        g gVar3 = g.DELETE;
        if (readableMap.hasKey(g.toString(gVar3))) {
            this.mLayoutDeleteAnimation.d(readableMap.getMap(g.toString(gVar3)), i11);
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new a(callback);
    }

    public void reset() {
        this.mLayoutCreateAnimation.f();
        this.mLayoutUpdateAnimation.f();
        this.mLayoutDeleteAnimation.f();
        this.mCompletionRunnable = null;
        this.mShouldAnimateLayout = false;
        this.mMaxAnimationDuration = -1L;
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }

    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f108644a;

        b(int i11) {
            this.f108644a = i11;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            e.this.mLayoutHandlers.remove(this.f108644a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e.this.mLayoutHandlers.put(this.f108644a, (j) animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f108646a;

        c(f fVar) {
            this.f108646a = fVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f108646a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
